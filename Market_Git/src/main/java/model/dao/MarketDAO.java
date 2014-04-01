package model.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import model.domain.Deal;
import model.domain.Market;

import org.apache.ibatis.session.SqlSession;

import exception.DoubleException;

import util.UtilFactory;

public class MarketDAO {
	
	public static void insert(Market market) throws SQLException, DoubleException {
		if(isExist(market.getMcode())){
			throw new DoubleException();
		}
		
		SqlSession session = UtilFactory.getSqlSession(true);
		try {
			session.insert("market.insert", market);
		} finally{
			session.close();			
		}
	}
	
	public static void update(Deal deal) throws SQLException {
		SqlSession session = UtilFactory.getSqlSession(true);
		
		try {
			session.update("market.update", deal);
		} finally{
			session.close();			
		}
	}
	
	public static void deleteAll() throws SQLException {
		SqlSession session = UtilFactory.getSqlSession(true);
		try {
			session.delete("market.deleteAll") ;
		} finally{
			session.close();
		}
	}
	
	public static void delete(int mcode) throws SQLException {
		SqlSession session = UtilFactory.getSqlSession(true);
		try {
			session.delete("market.delete",mcode) ;
		} finally{
			session.close();
		}
	}
	
	public static ArrayList<Market> getMarketAll() throws SQLException {
		SqlSession session = UtilFactory.getSqlSession();
		ArrayList<Market> selectAll = null;
		try {
			selectAll = (ArrayList)session.selectList("market.selectAll");
		} finally{
			session.close();			
		}
		return selectAll;
	}
	
	public static Market getMarket(int mcode) throws SQLException {
		SqlSession session = UtilFactory.getSqlSession();
		Market market = null;
		try {
			market = (Market)session.selectOne("market.selectMarket");
		} finally{
			session.close();			
		}
		return market;
	}
	
	private static boolean isExist(int mcode) throws SQLException{
		boolean flag = false;
		SqlSession session = UtilFactory.getSqlSession();
		Market market = null;
		
		try{
			market = (Market)session.selectOne("market.selectMarket");
			if(market != null){
				flag = true;
			}
		}finally{
			session.close();
		}
		
		return flag;
	}
	
}

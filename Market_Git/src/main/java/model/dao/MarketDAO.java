package model.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import model.domain.Market;
import util.UtilFactory;

public class MarketDAO {
	
	public static void insert(Market market) throws Exception {
		SqlSession session = UtilFactory.getSqlSession(true);
		try {
			session.insert("market.insert", market);
		} finally{
			session.close();			
		}
	}
	
	public void update(Market market) throws Exception {
		SqlSession session = UtilFactory.getSqlSession(true);
		
		try {
			session.update("market.update", market);
		} finally{
			session.close();			
		}
	}
	
	public static void deleteAll() throws Exception {
		SqlSession session = UtilFactory.getSqlSession(true);
		try {
			session.delete("market.deleteAll") ;
		} finally{
			session.close();
		}
	}
	
	public static void delete(int mcode) throws Exception {
		SqlSession session = UtilFactory.getSqlSession(true);
		try {
			session.delete("market.delete",mcode) ;
		} finally{
			session.close();
		}
	}
	
	public static ArrayList<Market> getMarketAll() throws Exception {
		SqlSession session = UtilFactory.getSqlSession();
		ArrayList<Market> selectAll = null;
		try {
			selectAll = (ArrayList)session.selectList("market.selectAll");
		} finally{
			session.close();			
		}
		return selectAll;
	}
	
	public static Market getMarket(int mcode) throws Exception {
		SqlSession session = UtilFactory.getSqlSession();
		Market market = null;
		try {
			market = (Market)session.selectOne("market.selectMarket");
		} finally{
			session.close();			
		}
		return market;
	}
}

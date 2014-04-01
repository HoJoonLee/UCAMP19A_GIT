package model.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import model.domain.Deal;
import model.domain.Market;

import org.apache.ibatis.session.SqlSession;

import util.UtilFactory;

public class DealDAO {
	
	public static void dealIn(Deal deal) throws SQLException {
		SqlSession session = UtilFactory.getSqlSession(true);
		try {
			session.insert("deal.dealIN", deal);
		} finally{
			session.close();			
		}
	}
	
	public static void dealOut(Deal deal) throws SQLException {
		SqlSession session = UtilFactory.getSqlSession(true);
		try {
			session.insert("deal.dealOut", deal);
		} finally{
			session.close();			
		}
	}
	
	public static void deleteAll() throws SQLException {
		SqlSession session = UtilFactory.getSqlSession(true);
		try {
			session.delete("deal.deleteAll") ;
		} finally{
			session.close();
		}
	}
	
	public static void delete(int dnum) throws SQLException {
		SqlSession session = UtilFactory.getSqlSession(true);
		try {
			session.delete("deal.delete",dnum) ;
		} finally{
			session.close();
		}
	}
	
	public static ArrayList<Deal> getDealAll() throws SQLException {
		SqlSession session = UtilFactory.getSqlSession();
		ArrayList<Deal> selectAll = null;
		try {
			selectAll = (ArrayList)session.selectList("deal.selectAll");
		} finally{
			session.close();			
		}
		return selectAll;
	}
	
	public static Deal getDeal(int dnum) throws SQLException {
		SqlSession session = UtilFactory.getSqlSession();
		Deal deal = null;
		try {
			deal = (Deal)session.selectOne("deal.selectDeal",dnum);
		} finally{
			session.close();			
		}
		return deal;
	}
}

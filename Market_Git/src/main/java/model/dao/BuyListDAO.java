package model.dao;

import java.util.ArrayList;

import model.domain.BuyList;
import model.domain.Market;

import org.apache.ibatis.session.SqlSession;

import util.UtilFactory;

public class BuyListDAO {
	
	public static void insert(BuyList buylist) throws Exception {
		SqlSession session = UtilFactory.getSqlSession(true);
		try {
			session.insert("buylist.insert", buylist);
		} finally{
			session.close();			
		}
	}
	
	public static void update(BuyList buylist) throws Exception {
		SqlSession session = UtilFactory.getSqlSession(true);
		
		try {
			session.update("buylist.update", buylist);
		} finally{
			session.close();			
		}
	}
	
	public static void deleteAll() throws Exception {
		SqlSession session = UtilFactory.getSqlSession(true);
		try {
			session.delete("buylist.deleteAll") ;
		} finally{
			session.close();
		}
	}
	
	public static void delete(int mcode) throws Exception {
		SqlSession session = UtilFactory.getSqlSession(true);
		try {
			session.delete("buylist.delete",mcode) ;
		} finally{
			session.close();
		}
	}
	
	public static ArrayList<BuyList> getBuyListAll() throws Exception {
		SqlSession session = UtilFactory.getSqlSession();
		ArrayList<BuyList> selectAll = null;
		try {
			selectAll = (ArrayList)session.selectList("buylist.selectAll");
		} finally{
			session.close();			
		}
		return selectAll;
	}
	
	public static BuyList getBuyList(int id) throws Exception {
		SqlSession session = UtilFactory.getSqlSession();
		BuyList buylist = null;
		try {
			buylist = (BuyList)session.selectOne("buylist.selectBuyList",id);
		} finally{
			session.close();			
		}
		return buylist;
	}
}

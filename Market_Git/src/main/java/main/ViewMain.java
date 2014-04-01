package main;

import java.util.ArrayList;

import model.dao.BuyListDAO;
import model.dao.DealDAO;
import model.dao.MarketDAO;
import model.domain.BuyList;
import model.domain.Deal;
import model.domain.Market;

public class ViewMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		MarketDAO.deleteAll();
		DealDAO.deleteAll();
		
		/*
		MarketDAO.insert(new Market(1001, "아이스크림", 1000, 0));
		MarketDAO.insert(new Market(1002, "삼겹살", 6000, 0));
		MarketDAO.insert(new Market(1003, "아메리카노", 5000, 0));
		MarketDAO.insert(new Market(1004, "마우스", 10000, 0));
		
		DealDAO.dealIn(new Deal(101, 1001,3));
		DealDAO.dealIn(new Deal(102, 1003,5));
		DealDAO.dealIn(new Deal(103, 1004,6));
		
		DealDAO.dealOut(new Deal(104, 1004,6));
		DealDAO.dealOut(new Deal(105, 1004,6));
		
		DealDAO.delete(103);
		//System.out.println(DealDAO.getDeal(104));
		/*
		ArrayList<Deal> temp = null;
		temp = DealDAO.getDealAll();
		
		for(Deal d : temp){
			System.out.println(d);
		}
		*/
		/*
		BuyListDAO.deleteAll();
		BuyListDAO.insert(new BuyList(1, "1"));
		BuyListDAO.insert(new BuyList(2, "2"));
		BuyListDAO.insert(new BuyList(3, "3"));
		BuyListDAO.insert(new BuyList(4, "4"));
		
		System.out.println(BuyListDAO.getBuyList(1));
		
		ArrayList<BuyList> temp = null;
		temp = (ArrayList)BuyListDAO.getBuyListAll();
		
		for(BuyList d : temp){
			System.out.println(d);
		}
		*/
	}

}

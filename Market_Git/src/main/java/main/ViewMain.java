package main;

import model.dao.MarketDAO;
import model.domain.Market;

public class ViewMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		MarketDAO.deleteAll();
		MarketDAO.insert(new Market(1001, "아이스크림", 1000, 0));
		MarketDAO.delete(1001);
		
	}

}

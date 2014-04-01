package model.service;

import java.sql.SQLException;

import exception.DoubleException;

import model.dao.DealDAO;
import model.dao.MarketDAO;
import model.domain.Deal;
import model.domain.Market;


public class MarketManagementImpl implements MarketManagement{

	@Override
	public void insert(Market market) throws SQLException, DoubleException {
		// TODO Auto-generated method stub
		MarketDAO.insert(market);
	}

	@Override
	public void addIteam(Deal deal) throws SQLException {
		// TODO Auto-generated method stub
		DealDAO.dealIn(deal);
		MarketDAO.update(deal);
	}
	
	
	
	
}

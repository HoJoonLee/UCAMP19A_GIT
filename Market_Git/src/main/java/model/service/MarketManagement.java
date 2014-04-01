package model.service;

import java.sql.SQLException;

import exception.DoubleException;

import model.domain.Deal;
import model.domain.Market;


public interface MarketManagement {
	public abstract void insert(Market market) throws SQLException, DoubleException;
	public abstract void addIteam(Deal deal) throws SQLException;
	
}

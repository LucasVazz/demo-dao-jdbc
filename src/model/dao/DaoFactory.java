package model.dao;

import model.dao.iml.sellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new sellerDaoJDBC();
	}

}

package com.capgemini.cg.dao;

import com.capgemini.cg.bean.CustomerBean;

public interface AccountDAO {

	void storeIntoMap(CustomerBean customer);

	void display();

}

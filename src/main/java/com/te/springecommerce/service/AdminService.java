package com.te.springecommerce.service;

import java.util.List;

import com.te.springecommerce.beans.AdminBean;
import com.te.springecommerce.beans.ItemBean;

public interface AdminService {
	
	public AdminBean authenticate(Integer aid, String password);
	
	public ItemBean getEmpData(Integer aid);

	public boolean addItem(ItemBean Bean);
	
	public boolean updateItem(ItemBean infoBean);
	
	public boolean deleteItem(Integer id);
	
	public List<ItemBean> getAllEmployeeDetails();

}

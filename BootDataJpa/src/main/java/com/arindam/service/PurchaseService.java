package com.arindam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arindam.model.Purchase;
import com.arindam.repository.PurchaseRepo;

@Service// object creation +transaction management
public class PurchaseService {
	@Autowired
PurchaseRepo prepo;
	public void addData(Purchase pr)
	{
		prepo.save(pr);// table create and data saved
	}
	public List<Purchase> getData()
	{
		return prepo.findAll();//it returns list object of class type
	}
	public void deleteData(String icode)
	{
		Purchase pr=prepo.findById(icode).orElse(null);
		if(pr!=null)
		{
			prepo.delete(pr);
		}
	}
	public void updateData(String icode,Purchase pds)
	{
		Purchase pr=prepo.findById(icode).orElse(null);
		if(pr!=null)
		{
			pr.setIname(pds.getIname());
			pr.setIqty(pds.getIqty());
			pr.setPrice(pds.getPrice());
			prepo.save(pr);
		}
	}
}

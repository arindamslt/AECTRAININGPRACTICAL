package com.arindam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arindam.entity.PurchaseDetails;
import com.arindam.repository.PurchaseRepo;

@Service
public class PurchaseService {
	@Autowired
PurchaseRepo prepo;
	public void addData(PurchaseDetails pd)
	{
		prepo.save(pd);
	}
	public List<PurchaseDetails> getData()
	{
		return prepo.findAll();
	}
	public void deleteData(String icode)
	{
		PurchaseDetails pds=prepo.findById(icode).orElse(null);
		if(pds!=null)
		{
			prepo.delete(pds);
		}
	}
	public PurchaseDetails updateData(String icode,PurchaseDetails pd)
	{
		PurchaseDetails pds=prepo.findById(icode).orElse(null);
		if(pds!=null)
		{
			pds.setIname(pd.getIname());
			pds.setIqty(pd.getIqty());
			pds.setPrice(pd.getPrice());
			prepo.save(pds);
			
		}
		return pds;
	}
	public PurchaseDetails getItemByIcode(String icode)
	{
		return prepo.findById(icode).orElse(null);
	}
	public List<PurchaseDetails> getItemByPrice(Double pprice)
	{
		return prepo.getItemByPrice(pprice);
	}
}

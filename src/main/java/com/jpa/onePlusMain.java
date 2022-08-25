package com.jpa;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.dao.OneOPlus;
import com.jpa.repository.OnePlusRepo;

public class onePlusMain {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=SpringApplication.run(JpaApplication.class, args);
		OnePlusRepo onePlusRepo=context.getBean(OnePlusRepo.class);
		
		OneOPlus op=new OneOPlus();
		op.setId(598);
		op.setBrandName("OnePlus 7T");
		op.setCompanyName("OnePlusChina");
		op.setModelName("7T");
		op.setBrandPrice(54999.2f);
	
		OneOPlus oo=onePlusRepo.save(op);
		System.out.println(oo);
		System.out.println("Mobile Desc inserted");
		
		System.out.println("----------------------------Add Multiple Data-----------------------");
		OneOPlus op1=new OneOPlus();
		op1.setId(711);
		op1.setBrandName("OnePlus 5T");
		op1.setCompanyName("OnePlus CHINA");
		op1.setModelName("5T");
		op1.setBrandPrice(31000.2f);
		
		OneOPlus op2=new OneOPlus();
		op2.setId(712);
		op2.setBrandName("OnePlus 6T");
		op2.setCompanyName("OnePlus INDIA");
		op2.setModelName("6T");
		op2.setBrandPrice(54999.2f);
		
		OneOPlus op3=new OneOPlus();
		op3.setId(713);
		op3.setBrandName("OnePlus 7T");
		op3.setCompanyName("OnePlus USA");
		op3.setModelName("7T");
		op3.setBrandPrice(54999.2f);
	
		List<OneOPlus>ops=List.of(op1,op2,op3);
		Iterable<OneOPlus>svall=onePlusRepo.saveAll(ops);
		svall.forEach(sall->{
			System.out.println(sall);
		});
		
		System.out.println(" Data Inserted");
		
		
		
		
		//update record
		System.out.println("--------------UPDATE RECORD-----------------");
		
		Optional<OneOPlus>optional=onePlusRepo.findById(543);
		OneOPlus o=optional.get();
		o.setBrandName("OnePlus");
		o.setBrandPrice(71990);
		o.setModelName("RT");
		o.setCompanyName("OnePlus China");
		
		
		
		
		
		
			//read record
		System.out.println("--------------READ RECORD-----------------");
		Iterable<OneOPlus>itrble=onePlusRepo.findAll();
		Iterator<OneOPlus>itrtr=itrble.iterator();
		while(itrtr.hasNext())
		{
			OneOPlus ooo=itrtr.next();
			System.out.println(ooo);

		}
		

		
	
			//delete Single record
		System.out.println("--------------DELETE RECORD-----------------");
		onePlusRepo.deleteById(593);
		System.err.println("Single Record Deleted Successfully........");
	
			//delete All record
		Iterable<OneOPlus>delAll=onePlusRepo.findAll();
		delAll.forEach(oneP->{
			System.err.println(oneP+"All Record Deleted Successfully");
		});
		onePlusRepo.deleteAll(delAll);
	
	

	
	
	
	}
}


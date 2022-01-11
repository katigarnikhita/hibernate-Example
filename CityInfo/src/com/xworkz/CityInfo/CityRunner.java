package com.xworkz.CityInfo;

import com.xworkz.CityInfo.dao.CityInterface;
import com.xworkz.CityInfo.dao.CityImpl;
import com.xworkz.CityInfo.entity.CityInfoEntity;
public class CityRunner {
	
	public static void main(String[] args)
	{
		CityInfoEntity info=new CityInfoEntity (01,"hubli",200000L,"food");
		CityInfoEntity info1=new CityInfoEntity (02,"laxmeshwar",207788L,"sweetfood");
		CityInfoEntity info2=new CityInfoEntity (03,"haveri",7800000L,"food");
		CityInfoEntity info3=new CityInfoEntity (04,"gadag",200000L,"food");
		CityInfoEntity info4=new CityInfoEntity (05,"gadag",2000067880L,"food");
		
		CityInterface set=new CityImpl();
		//set.create(info3);
		CityInfoEntity set1=set.getById(01);
		System.out.println(set1);
		
		
		
		set.updatePopulationById(200000L,01);
		
		
		set.deleteById(05);
		
		
	}

}

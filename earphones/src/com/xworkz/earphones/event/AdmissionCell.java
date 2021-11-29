package com.xworkz.earphones.event;

public class AdmissionCell {

	
	
		public void admitForMbbs(String name,boolean pucCleared,boolean biologyAsMajor)throws  MBBSSeatException
		{
			System.out.println("invoked admitForMbbs");
			if(name !=null && name.length()>2 && name.length()<=26 && pucCleared && biologyAsMajor)
			{
				System.out.println("can give MBBS seat");
			}
			else {
				System.err.println("cannot give MBBS seat");
				throw  new MBBSSeatException();
			}
		}
	}

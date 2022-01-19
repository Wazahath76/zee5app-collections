package com.zee.zee5app.repository;

import com.zee.zee5app.dto.Subscription;

public class SubscriptionRepo {
	
	
	private Subscription[] subs = new Subscription[10]; 
	
	public static int count = -1;
	public Subscription[] getUsers() {
		return subs;
	}
	
	
	
	public Subscription getUserById(String id) {
		
		//do we need to traverse the array?
		
		for (Subscription sub : subs) {
			if(sub!=null && sub.getId().equals(id)) {
				return sub;
			}
		}
		
		return null;
	}
	
	public String addSubscriber(Subscription sub) {
		
		//registers,length ==> give us the availability
		if(count==subs.length-1) {
			//array is full 
			
			Subscription temp[] = new Subscription[subs.length*2];
			
			
			//do we need to copy the content from old to new ? yes
			System.arraycopy(subs, 0, temp, 0, subs.length);
			subs=temp;
			subs[++count] = sub;
			return "success";
		}
		subs[++count] = sub;
		return "success";
		
	}

	public static SubscriptionRepo repository;

	public static SubscriptionRepo  getInstance() {
		// TODO Auto-generated method stub
		
		if(repository==null)
			repository = new SubscriptionRepo();
		return repository;
	}

}

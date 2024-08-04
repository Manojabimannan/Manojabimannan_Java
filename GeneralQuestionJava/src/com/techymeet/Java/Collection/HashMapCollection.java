package com.techymeet.Java.Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapCollection {

	public static void main(String[] args) {

		HashMap<Integer, String> hs=new HashMap<>();
		hs.put(100, "Manoj");
		hs.put(200, "KLRahul");

		hs.put(300, "Virat");
		hs.put(300, "Rohit");
		hs.put(400, "Rohit");
		
		// Key-->Group Of Key Is Assocation By Set
		//Because of No Duplicate Key Allowed By Map And Also Set Both Are Not Allowed To Insertion Duplicate Element
		//Value--> Value Can Be MainTained By Collection
		//ValueSet-->Value Set Maintained By set
		@SuppressWarnings("rawtypes")
		Set s=hs.entrySet();
		System.out.println(s);
		@SuppressWarnings("rawtypes")
		Collection vc=hs.values();
		System.out.println(vc);
		@SuppressWarnings("rawtypes")
		Set K=hs.keySet();
		System.out.println(K);
		System.out.println("-----------Iterator----------");
		@SuppressWarnings("rawtypes")
		Iterator its=s.iterator();
		while(its.hasNext()) {
			@SuppressWarnings("rawtypes")
			Map.Entry me=(Map.Entry) its.next();
			System.out.println(me);
		}
		hs.replace(100, "Manoj", "ManojAbimannan");
		System.out.println(hs);
	}

}

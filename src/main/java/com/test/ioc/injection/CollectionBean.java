package com.test.ioc.injection;

import java.util.Map;


public class CollectionBean {
	private Map<String, String> addressList;

	public Map<String, String> getAddressList() {
		System.out.println("getAddressList()");
		return addressList;
	}

	public void setAddressList(Map<String, String> addressList) {
		System.out.println("setAddressList()");
		this.addressList = addressList;
	}

}






/* 190905
package com.test.ioc.injection;

import java.util.List;

public class CollectionBean {
	private List<String> addressList;

	public List<String> getAddressList() {
		System.out.println("getAddressList()");
		return addressList;
	}

	public void setAddressList(List<String> addressList) {
		System.out.println("setAddressList()");
		this.addressList = addressList;
	}
	
}
*/




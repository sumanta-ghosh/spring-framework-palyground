package com.springcore.standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	private List<String> friends;
	private Map<String, String> familyDetails;
	private Properties configDetails;

	public Map<String, String> getFamilyDetails() {
		return familyDetails;
	}

	public void setFamilyDetails(Map<String, String> familyDetails) {
		this.familyDetails = familyDetails;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", familyDetails=" + familyDetails + ", configDetails=" + configDetails + "]";
	}

	public Properties getConfigDetails() {
		return configDetails;
	}

	public void setConfigDetails(Properties configDetails) {
		this.configDetails = configDetails;
	}

}

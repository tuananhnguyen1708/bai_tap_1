package code;

import java.awt.List;
import java.util.ArrayList;

public class Manager {
	ArrayList<Human> customers;
	
	public Manager(ArrayList<Human> customers) {
		this.customers = customers;
	}
	
	public Human searchHuman(int userId) {
		for(int i=0; i < this.customers.size(); i++) {
			Human human = this.customers.get(i);
			if(human.id == userId) {
				return human;
			}
		}
		
		return null;
	}
	
	public Long approveInsurrance(int userId) {
		Human human = searchHuman(userId);
		if (human == null) {
			return -1L;
		} else {
			return human.money / human.workYear / 12;
		}
	}
}

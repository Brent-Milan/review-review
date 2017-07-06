package org.wecancodeit.reviewreview;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Review {

	
	@Id
	@GeneratedValue
	private String title;
	
	
	public Review() {
		
	}
	
	public Review(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
}

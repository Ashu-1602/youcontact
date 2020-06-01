package com.youconnect.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class VoteId implements Serializable{
	
	private static final long serialVersionUID = 6438526957278308731L;
	
	private User user;
	private User feature;
	
	@ManyToOne
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@ManyToOne
	public User getFeature() {
		return feature;
	}
	public void setFeature(User feature) {
		this.feature = feature;
	}	
}

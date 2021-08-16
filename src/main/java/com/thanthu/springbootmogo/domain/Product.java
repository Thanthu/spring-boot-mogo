package com.thanthu.springbootmogo.domain;

import java.math.BigDecimal;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {

	@Id
	private ObjectId _id;
	private String description;
	private BigDecimal price;
	private String imageUrl;
	
	
	public ObjectId getId() {
		return get_id();
	}


	public void setId(ObjectId objectId) {
		set_id(objectId);
	}
	
	

}

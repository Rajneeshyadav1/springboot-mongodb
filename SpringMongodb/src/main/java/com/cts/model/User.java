package com.cts.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection="user-collection")
public class User {
	
	@Id
    private int id;
    
    private String name;
    
    private String email;
    

}

package com.roomiebills.entities;

import javax.persistence.*;

@Entity
@Table(name="group")
public class GroupEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@OneToOne(cascade = CascadeType.ALL, optional = false)
	@JoinColumn(name = "account_id")
	AccountEntity account;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	UserEntity user; 
	
}

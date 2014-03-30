package com.roomiebills.entities;

import javax.persistence.*;

@Entity
@Table(name = "bill")
public class BillEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name = "description", nullable = false)
	String description;
	
	@Column(name = "payer_user_id", nullable = true)
	UserEntity payerUser;
}

package com.roomiebills.entities;

import javax.persistence.*;

@Entity
@Table(name = "bill_transaction")
public class BillTransactionEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;

	@ManyToOne(cascade = CascadeType.ALL, optional = false)
	@JoinColumn(name = "bill_id")
	BillEntity bill;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "from_user_id")
	UserEntity fromUserId;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "to_user_id")
	UserEntity toUserId;
	
	@Column(name = "amount", nullable = true)
	double amount;
	
	@Column(name = "paid", nullable = false)
	boolean paid;
	
}

package com.element.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class AccountPK implements Serializable{
	private Integer crn;
	private Integer AccNo;
	private Integer accId;
}

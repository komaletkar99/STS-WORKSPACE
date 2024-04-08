package com.element.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(AccountPK.class)
public class Account {
	@Id
	private Integer crn;

	@Id
	private Integer AccNo;
	private Double bal;
	private String ifsc;
	private String branchName;
	@Id
	private Integer accId;
	private String accHolderName;
}

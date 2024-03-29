package com.optimagrowth.organization.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tb_organization")
public class Organization {
	@Id
	@Column(name = "organization_id", nullable = false)
	private String organizationId;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "contact_name", nullable = false)
	private String contactName;
	
	@Column(name = "contact_email", nullable = false)
	private String contactEmail;
	
	@Column(name = "contact_phone", nullable = false)
	private String contactPhone;

}

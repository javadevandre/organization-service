package com.optimagrowth.organization.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.optimagrowth.organization.model.Organization;

@Repository
public interface OrganizationRepository extends CrudRepository<Organization, String> {

}
package com.optimagrowth.organization.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.optimagrowth.organization.model.Organization;
import com.optimagrowth.organization.repository.OrganizationRepository;

@Service
public class OrganizationService {
	
	@Autowired
	private OrganizationRepository organizationRepository;
	
	public Organization createOrganization(Organization organization) {
		organization.setOrganizationId(UUID.randomUUID().toString());
		return organizationRepository.save(organization);
	}
	
	public Organization readOrganization(String organizationId) {
        return organizationRepository.findById(organizationId).orElse(null);
    }

    public Organization updateOrganization(Organization organization) {
    	return organizationRepository.save(organization);
    }

    public void deleteOrganization(Organization organization){
    	organizationRepository.delete(organization);
    }

}

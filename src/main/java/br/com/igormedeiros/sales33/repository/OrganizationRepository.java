package br.com.igormedeiros.sales33.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.igormedeiros.sales33.entities.Organization;

public interface OrganizationRepository extends JpaRepository<Organization, Long>{

}

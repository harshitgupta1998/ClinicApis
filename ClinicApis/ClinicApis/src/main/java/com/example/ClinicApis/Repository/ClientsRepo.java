package com.example.ClinicApis.Repository;

import com.example.ClinicApis.Entity.Clients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientsRepo extends JpaRepository<Clients,Integer> {
}


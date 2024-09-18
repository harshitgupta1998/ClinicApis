package com.example.ClinicApis.Service;

import com.example.ClinicApis.Entity.Clients;
import com.example.ClinicApis.Repository.ClientsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientsService {
    @Autowired
    private ClientsRepo clientsRepo;


    public Clients saveDetails(Clients clients){
        return clientsRepo.save(clients);

    }
}

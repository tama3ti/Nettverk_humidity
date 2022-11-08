package no.ntnu.Plants.service;

import java.util.List;

import org.springframework.stereotype.Service;

import no.ntnu.Plants.repository.PlantRepository;
import no.ntnu.Plants.entity.Plant;


@Service
public class PlantService{


    private PlantRepository plantRepository;

    public List<Plant> getAllPlants(){
        return plantRepository.findAll();
    }

    //add plant
    public void addPlant(Plant plant){
        
    }
}
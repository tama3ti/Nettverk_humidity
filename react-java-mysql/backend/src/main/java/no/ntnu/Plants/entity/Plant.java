package no.ntnu.Plants.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "plant")
public class Plant {
    
    @Id
    private int plantId;
    private String plantName;
    private String plantLatinName;


    public Plant() {
    }

    public int getPlantId() {
        return plantId;
    }

    public void setPlantId(int plantId) {
        this.plantId = plantId;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }
    
    public String getPlantLatinName() {
        return plantLatinName;
    }

    public void setPlantLatinName(String plantLatinName) {
        this.plantLatinName = plantLatinName;
    }

    
}

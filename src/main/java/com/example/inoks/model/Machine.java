package com.example.inoks.model;

import lombok.Data;
import lombok.Generated;

@Data
public class Machine {
    @Generated
    public Integer id;
    public String name;
    public String description;
    public Integer yearCreated;
    public String photopath;

    public Machine( Integer id,String name, String description, Integer yearCreated,String photopath) {
this.id=id;
        this.name = name;
        this.description = description;
        this.yearCreated = yearCreated;
        this.photopath=photopath;
    }

    public Machine() {
    }
    public void CreateMachine(String line)
    {
        String []pom=line.split(" ");
        Integer machineId=Integer.parseInt(pom[0]);
        String machineName=pom[1];
        String machineDescription=pom[2];
        Integer machineYearCreated=Integer.parseInt(pom[3]);
        String machinePhotoPath=pom[4];
        Machine newMachine=new Machine(machineId,machineName,machineDescription,machineYearCreated,machinePhotoPath);
    }
}

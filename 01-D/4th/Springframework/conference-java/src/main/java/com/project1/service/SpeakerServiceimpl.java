package com.project1.service;

//import com.project1.model.Speaker;

import com.project1.model.Speaker;
import com.project1.repository.Speakerrepository;
import com.project1.repository.Stubspeakerrepositoryimpl;

import java.util.List;

public class SpeakerServiceimpl implements SpeakerService {


   // private Speakerrepository repository=new Stubspeakerrepositoryimpl();

    private Speakerrepository repository;

    @Override
    public List<Speaker> findall()
    {

        return repository.findall();
    }

    //Generating setter to show the setter injection
    public void setRepository(Speakerrepository repository) {

        this.repository = repository;
    }

}

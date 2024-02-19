package com.project1.repository;

import com.project1.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class Stubspeakerrepositoryimpl implements Speakerrepository {

    List<Speaker> speakers = new ArrayList<>();//object created for the list of speakers
    //we have extracted a interface here i.e Speakerrepository

    @Override
    public List<Speaker> findall() {
        Speaker speaker = new Speaker();// obj created to set and get their name

        speaker.setFirstname("uday");

        speaker.setLastname("Damarla");

        speakers.add(speaker);

        return speakers;
    }
}

package com.finlandia.application.services;

import com.finlandia.application.DataAccess.AnimalBirth.IAnimalBirth;
import com.finlandia.application.Models.AnimalBirthModel;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import dev.hilla.BrowserCallable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@BrowserCallable
@AnonymousAllowed
@Service
public class AnimalBirthService {
    private final IAnimalBirth animalBirth;

    @Autowired
    public AnimalBirthService(IAnimalBirth animalBirth) {
        this.animalBirth = animalBirth;
    }

    public List<AnimalBirthModel> getAnimalBirths() {
        return animalBirth.getAnimalBirths();
    }
    public void createBirth(AnimalBirthModel animal) {
        animalBirth.createBirth(animal);
    }
    public void deleteBirth(AnimalBirthModel animal) {
        animalBirth.deleteBirth(animal);
    }
    public void updateBirth(AnimalBirthModel animal) {
        animalBirth.updateBirth(animal);
    }

}


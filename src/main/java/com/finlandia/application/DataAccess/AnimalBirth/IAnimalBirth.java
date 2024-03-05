package com.finlandia.application.DataAccess.AnimalBirth;

import com.finlandia.application.Models.AnimalBirthModel;

import java.util.List;

public interface IAnimalBirth {
    List<AnimalBirthModel> getAnimalBirths();
    void createBirth(AnimalBirthModel animal);
    void deleteBirth(AnimalBirthModel animal);
    void updateBirth(AnimalBirthModel animal);
}

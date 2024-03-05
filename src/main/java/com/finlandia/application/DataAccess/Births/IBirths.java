package com.finlandia.application.DataAccess.Births;

import com.finlandia.application.Models.AnimalModel;

import java.util.List;
import java.util.UUID;

public interface IBirths {
     List<AnimalModel> getBirths( UUID user);

     void createBirth(AnimalModel animal);

     void deleteBirth(AnimalModel animal);

     void updateBirth(AnimalModel animal);
}

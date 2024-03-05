package com.finlandia.application.DataAccess.AnimalColor;

import com.finlandia.application.Models.AnimalColorModel;

import java.util.List;

public interface IAnimalColor {
    void createColor(AnimalColorModel color);

    List<AnimalColorModel> getColors();

    AnimalColorModel getColor(String color);
}

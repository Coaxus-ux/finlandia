package com.finlandia.application.services;

import com.finlandia.application.DataAccess.AnimalColor.IAnimalColor;
import com.finlandia.application.Models.AnimalColorModel;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import dev.hilla.BrowserCallable;
import dev.hilla.Nonnull;
import dev.hilla.exception.EndpointException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@BrowserCallable
@AnonymousAllowed
@Service
public class AnimalColorService {
    private final IAnimalColor animalColor;
    @Autowired
    public AnimalColorService(IAnimalColor animalColor) {
        this.animalColor = animalColor;
    }

    public void createColor(@Nonnull String color) {
        if (animalColor.getColor(color) != null) {
            throw new EndpointException("Color already exists", 400) ;
        }
        AnimalColorModel animalColorModel = AnimalColorModel.builder().animalColor(color).build();
        animalColor.createColor(animalColorModel);
    }

    public List<AnimalColorModel> getColors() {
        return animalColor.getColors();
    }

}

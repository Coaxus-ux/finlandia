package com.finlandia.application.services;

import com.finlandia.application.DataAccess.Births.IBirths;
import com.finlandia.application.Models.AnimalModel;
import com.vaadin.flow.server.auth.AnonymousAllowed;
import dev.hilla.BrowserCallable;
import dev.hilla.Nonnull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;
@BrowserCallable
@AnonymousAllowed
@Service
public class BirthsService {
    private final IBirths births;
    @Autowired
    public BirthsService(IBirths births) {
        this.births = births;
    }

    public void getBirths(@Nonnull UUID user) {
        births.getBirths(user);
    }
    public void createBirth(@Nonnull AnimalModel animal) {
        births.createBirth(animal);
    }
    public void deleteBirth(@Nonnull AnimalModel animal) {
        births.deleteBirth(animal);
    }
    public void updateBirth(@Nonnull AnimalModel animal) {
        births.updateBirth(animal);
    }

}

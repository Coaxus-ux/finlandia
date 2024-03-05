package com.finlandia.application.DataAccess.AnimalColor;

import com.finlandia.application.Models.AnimalColorModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class AnimalColor implements IAnimalColor {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void createColor(AnimalColorModel color) {
        entityManager.persist(color);
    }

    @Override
    public List<AnimalColorModel> getColors() {
        return entityManager.createQuery("SELECT a FROM AnimalColorModel a", AnimalColorModel.class)
                .getResultList();
    }

    @Override
    public AnimalColorModel getColor(String color) {
        return entityManager.createQuery("SELECT a FROM AnimalColorModel a WHERE a.animalColor = :color", AnimalColorModel.class)
                .setParameter("color", color)
                .getResultStream()
                .findFirst()
                .orElse(null);
    }

}

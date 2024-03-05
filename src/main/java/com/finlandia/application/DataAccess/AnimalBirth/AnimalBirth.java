package com.finlandia.application.DataAccess.AnimalBirth;

import com.finlandia.application.Models.AnimalBirthModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Transactional
public class AnimalBirth implements IAnimalBirth{
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public List<AnimalBirthModel> getAnimalBirths() {
        return entityManager.createQuery("SELECT a FROM AnimalBirthModel a", AnimalBirthModel.class)
                .getResultList();
    }

    @Override
    public void createBirth(AnimalBirthModel animal) {
        entityManager.persist(animal);
    }

    @Override
    public void deleteBirth(AnimalBirthModel animal) {
        animal.setBirthStatus(0);
        entityManager.merge(animal);

    }

    @Override
    public void updateBirth(AnimalBirthModel animal) {
        entityManager.merge(animal);
    }
}

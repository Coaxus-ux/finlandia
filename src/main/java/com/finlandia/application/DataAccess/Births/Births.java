package com.finlandia.application.DataAccess.Births;

import com.finlandia.application.Models.AnimalModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
@Transactional
public class Births implements IBirths{
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public List<AnimalModel> getBirths(UUID user) {
        return entityManager.createQuery("SELECT a FROM AnimalModel a WHERE a.user = :userId", AnimalModel.class)
                .setParameter("userId", user)
                .getResultList();
    }
    @Override
    public void createBirth(AnimalModel animal) {
        entityManager.persist(animal);
    }
    @Override
    public void deleteBirth(AnimalModel animal) {
        animal.setAnimalStatus(0);
        entityManager.merge(animal);
    }
    @Override
    public void updateBirth(AnimalModel animal) {
        entityManager.merge(animal);
    }
}

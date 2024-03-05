package com.finlandia.application.DataAccess.Mother;

import com.finlandia.application.Models.FatherModel;
import com.finlandia.application.Models.MotherModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

public class Mother implements IMother {
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public List<MotherModel> getMothers() {
        return entityManager.createQuery("SELECT a FROM MotherModel a", MotherModel.class)
                .getResultList();
    }

    @Override
    public void createMother(MotherModel mother) {
        entityManager.persist(mother);
    }

    @Override
    public void deleteMother(MotherModel mother) {
        mother.setMotherStatus(0);
        entityManager.merge(mother);
    }

    @Override
    public void updateMother(MotherModel mother) {
        entityManager.merge(mother);
    }
}

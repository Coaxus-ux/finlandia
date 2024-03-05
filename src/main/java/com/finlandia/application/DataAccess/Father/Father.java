package com.finlandia.application.DataAccess.Father;

import com.finlandia.application.Models.FatherModel;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

public class Father implements IFather{
    @PersistenceContext
    EntityManager entityManager;
    @Override
    public List<FatherModel> getFathers() {
        return entityManager.createQuery("SELECT a FROM FatherModel a", FatherModel.class)
                .getResultList();
    }

    @Override
    public void createFather(FatherModel father) {
        entityManager.persist(father);
    }

    @Override
    public void deleteFather(FatherModel father) {
        father.setFatherStatus(0);
        entityManager.merge(father);
    }

    @Override
    public void updateFather(FatherModel father) {
        entityManager.merge(father);
    }
}

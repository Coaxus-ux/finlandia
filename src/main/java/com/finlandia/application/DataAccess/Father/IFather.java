package com.finlandia.application.DataAccess.Father;

import com.finlandia.application.Models.FatherModel;

import java.util.List;

public interface IFather {
    List<FatherModel> getFathers();
    void createFather(FatherModel father);
    void deleteFather(FatherModel father);
    void updateFather(FatherModel father);
}

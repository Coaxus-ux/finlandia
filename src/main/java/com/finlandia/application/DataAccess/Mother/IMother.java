package com.finlandia.application.DataAccess.Mother;
import com.finlandia.application.Models.MotherModel;

import java.util.List;

public interface IMother {
    List<MotherModel> getMothers();
    void createMother(MotherModel mother);
    void deleteMother(MotherModel mother);
    void updateMother(MotherModel mother);
}

package com.example.demo;

import com.mycompany.app.Vehicles;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
class VehiclesTest {

    @Test
    public void getSetWyborTest (){
        Vehicles vehicles = new Vehicles();
        Assertions.assertEquals(vehicles.getWybor(), null);
        Vehicles.setWybor("MATI");
        Assertions.assertEquals(vehicles.getWybor(), "MATI");
    }

}

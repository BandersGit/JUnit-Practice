package org.example;

public class EngineStub implements Engine{

    private int oilPressure;

    public EngineStub(int oilPressure){
        this.oilPressure = oilPressure;
    }

    @Override
    public int checkOilPressure(){
        return oilPressure;
    }

}

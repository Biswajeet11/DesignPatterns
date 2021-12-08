package com.abstractFactoryPattern;

public class MobileFactory extends AbstractDeviceFactory {

    @Override
    Device getGadget(DeviceType deviceType) {
        switch(deviceType){
            case NOKIA:
                return new Nokia("4GB","Qualcomm");
            case ONEPLUS:
                return new OnePlus("12GB","Intel");
        }
        return null;
    }
}

package com.abstractFactoryPattern;

public class LaptopFactory extends AbstractDeviceFactory {

    @Override
    Device getGadget(DeviceType deviceType) {
        switch (deviceType){
            case HP:
                return new HP("16GB","intel");
            case MAC:
                return new Mac("8GB","intel","Radeon");
            case DELL:
                return new Dell("8GB","intel","Radeon");
        }
        return null;
    }
}

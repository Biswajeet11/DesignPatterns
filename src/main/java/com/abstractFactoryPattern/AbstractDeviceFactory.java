package com.abstractFactoryPattern;

public abstract class AbstractDeviceFactory {
    abstract  Device getGadget(DeviceType device);
}

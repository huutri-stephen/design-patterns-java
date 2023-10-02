package common.factory.abstracts;

import common.product.laptop.Laptop;
import common.product.phone.Phone;

public abstract class ElectronicDeviceAbstractFactory {
	public abstract Phone getPhone();
	public abstract Laptop getLaptop();
}

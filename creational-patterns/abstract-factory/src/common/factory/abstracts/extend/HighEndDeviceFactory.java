package common.factory.abstracts.extend;

import common.factory.abstracts.ElectronicDeviceAbstractFactory;
import common.product.laptop.Laptop;
import common.product.laptop.impl.HighEndLaptop;
import common.product.phone.Phone;
import common.product.phone.impl.HighEndPhone;

public class HighEndDeviceFactory extends ElectronicDeviceAbstractFactory {
	@Override
	public Phone getPhone() {
		return new HighEndPhone();
	}

	@Override
	public Laptop getLaptop() {
		return new HighEndLaptop();
	}
}

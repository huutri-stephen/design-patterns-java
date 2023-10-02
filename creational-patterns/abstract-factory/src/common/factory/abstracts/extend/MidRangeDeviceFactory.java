package common.factory.abstracts.extend;

import common.factory.abstracts.ElectronicDeviceAbstractFactory;
import common.product.laptop.Laptop;
import common.product.laptop.impl.MidRangeLaptop;
import common.product.phone.Phone;
import common.product.phone.impl.MidRangePhone;

public class MidRangeDeviceFactory extends ElectronicDeviceAbstractFactory {
	@Override
	public Phone getPhone() {
		return new MidRangePhone();
	}

	@Override
	public Laptop getLaptop() {
		return new MidRangeLaptop();
	}
}

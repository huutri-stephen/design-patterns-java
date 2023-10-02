package common.factory;

import common.factory.abstracts.ElectronicDeviceAbstractFactory;
import common.factory.abstracts.extend.HighEndDeviceFactory;
import common.factory.abstracts.extend.MidRangeDeviceFactory;
import common.type.Segment;

public class ElectronicDeviceFactory {
	public static ElectronicDeviceAbstractFactory getFactory(Segment segment) {
		switch (segment) {
			case HIGH_END: return new HighEndDeviceFactory();
			case MID_RANGE: return new MidRangeDeviceFactory();
			default: return null;
		}
	}
}

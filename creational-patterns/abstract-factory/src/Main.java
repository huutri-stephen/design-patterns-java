import common.factory.ElectronicDeviceFactory;
import common.factory.abstracts.ElectronicDeviceAbstractFactory;
import common.product.laptop.Laptop;
import common.type.Segment;

public class Main {
	public static void main(String[] args) {
		ElectronicDeviceAbstractFactory highEndFactory =  ElectronicDeviceFactory.getFactory(Segment.HIGH_END);
		Laptop highEndLaptop = highEndFactory.getLaptop();
		System.out.println(highEndLaptop.getSegment());
	}
}
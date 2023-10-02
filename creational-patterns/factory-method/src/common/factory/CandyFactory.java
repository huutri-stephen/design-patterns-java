package common.factory;

import common.candy.Candy;
import common.candy.impl.HardCandy;
import common.candy.impl.MintyCandy;
import common.type.CandyType;

public class CandyFactory {
	public static Candy getCandy(CandyType candyType) {
		switch (candyType) {
			case HARD: return new HardCandy();
			case MINTY: return new MintyCandy();
			default: return null;
		}
	}
}

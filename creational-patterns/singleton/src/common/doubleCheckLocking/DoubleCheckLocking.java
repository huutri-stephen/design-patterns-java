package common.doubleCheckLocking;

public class DoubleCheckLocking {
	private  static volatile DoubleCheckLocking INSTANCE;

	private DoubleCheckLocking() {}

	private static  DoubleCheckLocking getInstance() {
		if(INSTANCE == null) {
			synchronized (DoubleCheckLocking.class) {
				INSTANCE = new DoubleCheckLocking();
			}
		}
		return INSTANCE;
	}
}

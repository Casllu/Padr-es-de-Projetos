package singleton;

public class SingletonProprieadeSyncronized {
	private static SingletonProprieadeSyncronized singleton;
	private String value;

	private SingletonProprieadeSyncronized(String value) {
		this.value =value;
	}

	public static synchronized SingletonProprieadeSyncronized getInstance(String value) {
		if (singleton == null) {
			singleton = new SingletonProprieadeSyncronized(value);
		}
		return singleton;
	}

	public String getValue() {
		return value;
	}
}

interface WithDefaultDefinition {
	default void printDefault() {
		System.out.println("default method");
	}
}

class WithDefaultDefinitionImpl implements WithDefaultDefinition{
	void callPrint() {
		printDefault();
	}
}

public class DefaultMethod {
	public static void main(String[] args) {
		WithDefaultDefinitionImpl impl = new WithDefaultDefinitionImpl();
		impl.callPrint();
	}
}
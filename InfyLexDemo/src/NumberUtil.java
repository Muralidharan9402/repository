import java.util.Optional;
import java.util.stream.Stream;

public class NumberUtil {

	public static void main(String[] args) {
		Stream<Integer> inputs = Stream.of(8,7,10,15,20,22,30);
		//inputs.
		System.out.println(inputs.filter((n)-> n%5 == 0).count());
		//System.out.print(inputs.filter((n)-> n%5 == 0).forEach(System.out::println));
		
		
		Optional<String> str = Optional.of("Intialiasesd");
	}

}
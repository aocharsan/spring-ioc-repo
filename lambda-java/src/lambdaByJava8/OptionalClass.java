package lambdaByJava8;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {

		Optional<String> name = getName(2);
		// isPresent()--> If a value is present, returns true, otherwise false.
		String nameUsed = name.isPresent() ? name.get() : "NA";
		// orElse()--> If a value is present, returns the value, otherwise returns other
		name.orElse("NA");

		name.orElseGet(() -> {
			// Supposed if we have to called other from using method logic
			String nm = "Rameshwar";
			return nm;

		});
		/*
		 * If a value is present, returns the value, otherwise throws an exception
		 * produced by the exception supplying function.
		 */
		name.orElseThrow(NoSuchElementException::new);

		/*
		 * If a value is present, performs the given action with the value, otherwise
		 * does nothing. NullPointerException - if value is present and the given action
		 * is null
		 */
		name.ifPresent(System.out::println);

	}

	private static Optional<String> getName(int rollno) {
		String name = null;
		return Optional.empty();

		// Optional.ofNullable(name); Returns an Optional describing the given value,
		// ifnon-null, otherwise returns an empty Optional.

		// Optional.of(name); Returns an Optional describing the given non-nullvalue.
		// else throws NullPointerException if value is null

	}

}

package microservices.book.multiplication.domain;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * This represents a Multiplication (a * b).
 */
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode
public final class Multiplication {

	// Both factors
	private final int factorA;
	private final int factorB;

	// Empty constructor for JSON (de)serialization
	Multiplication() {
		this(0, 0);
	}

	public int getFactorA() {
		return this.factorA;
	}

	public int getFactorB() {
		return this.factorB;
	}
}
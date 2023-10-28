package AbstractFactory;

public class SemContratosFactory extends Factory {
	@Override
	Car retrieveCar(String requestedGrade) {
		if ("A".equals(requestedGrade)) {
			return new BrasiliaCar(100, "Cheio", "Azul");
		} else {
			return null;
		}
	}
}

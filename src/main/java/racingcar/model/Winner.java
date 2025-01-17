package racingcar.model;

import java.util.List;

public class Winner {
	private final List<Car> cars;
	private int maxPosition;
	private String[] winners;

	public Winner(List<Car> cars) {
		this.cars = cars;
	}

	public String[] get() {
		decide();
		return winners;
	}

	private void decide() {
		setMaxPosition();
		winners = cars.stream()
			.filter(car -> car.getPosition() == maxPosition)
			.map(Car::getCarName)
			.toArray(String[]::new);
	}

	private void setMaxPosition() {
		maxPosition = cars.stream()
			.mapToInt(Car::getPosition)
			.max()
			.getAsInt();
	}
}

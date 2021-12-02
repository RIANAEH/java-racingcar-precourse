package racingcar.view;

import java.util.List;

import racingcar.model.Car;

public class OutputView {
	private static final String RESULT_MESSAGE = "\n실행 결과";
	private static final String WINNER_MESSAGE = "최종 우승자 : ";

	public void printResultMessage() {
		System.out.println(RESULT_MESSAGE);
	}

	public void printResult(List<Car> cars) {
		for (Car car : cars) {
			System.out.println(createResultString(car));
		}
		System.out.println("");
	}

	private String createResultString(Car car) {
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append(car.getCarName());
		stringBuilder.append(" : ");
		for (int i = 0; i < car.getPosition(); i++) {
			stringBuilder.append("-");
		}

		return stringBuilder.toString();
	}

	public void printWinners(String[] winners) {
		System.out.println(createWinnersString(winners));
	}

	private String createWinnersString(String[] winners) {
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append(WINNER_MESSAGE);

		for (int i = 0; i < winners.length - 1; i++) {
			stringBuilder.append(winners[i]).append(", ");
		}
		stringBuilder.append(winners[winners.length - 1]);

		return stringBuilder.toString();
	}
}
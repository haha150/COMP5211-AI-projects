import java.text.DecimalFormat;
import java.util.Random;

public class Genetic implements Comparable<Genetic> {

	private double[] weight;
	private double error;
	private int score = 0;

	public Genetic(double[] weight) {
		this.weight = weight;
	}

	public Genetic(double[] weight, double error) {
		this.weight = weight;
		this.error = error;
	}

	public Genetic(int size) {
		weight = new double[size];
		DecimalFormat df = new DecimalFormat("####0.00");
		for (int i = 0; i < weight.length; i++) {
			String nr = df.format(new Random().nextDouble() * 2 - 1);
			weight[i] = Double.parseDouble(nr);
		}
	}

	public void calculateFitness(double[] trainingSet) {
		double totalSum = 0;
		for (int i = 0; i < trainingSet.length - 1; i++) {
			totalSum = totalSum + (trainingSet[i] * weight[i]);
		}
		double actual = 0;
		if (totalSum >= 0.0) {
			actual = 1;
		}
		error = trainingSet[trainingSet.length - 1] - actual;
	}

	public double getError() {
		return error;
	}

	public double[] getWeight() {
		return weight;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void setWeight(double[] weight) {
		this.weight = weight;
	}

	public void setError(double error) {
		this.error = error;
	}

	@Override
	public int compareTo(Genetic o) {
		Integer scor = score;
		Integer os = o.getScore();
		return scor.compareTo(os);
	}
	
	

}

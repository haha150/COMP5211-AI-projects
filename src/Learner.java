import java.util.Arrays;
import java.util.List;

public class Learner {

	private List<double[]> trainingSets;
	private double[] weights;
	private double[] newWeights;
	private double isDone;

	public Learner(List<double[]> trainingSets) {
		this.trainingSets = trainingSets;
		isDone = 0;
		weights = new double[trainingSets.get(0).length - 1];
		for (int i = 0; i < weights.length; i++) {
			weights[i] = 0;
		}
	}

	public void learn(String set) {
		while (trainingSets.size()*1000 > isDone) {
			for (double[] trainingSet : trainingSets) {
				double totalSum = 0;
				for (int i = 0; i < trainingSet.length - 1; i++) {
					totalSum = totalSum + (trainingSet[i] * weights[i]);
				}
				double actual = 0;
				if (totalSum >= 0) {
					actual = 1;
				}
				double error = trainingSet[trainingSet.length - 1] - actual;
				if(error != 0 ) {
					for (int j = 0; j < weights.length; j++) {
						weights[j] = weights[j] + ((0.1 * error) * trainingSet[j]);
					}
				}
				if(weights.equals(newWeights)) {
					isDone++;
				} else {
					isDone = 0;
				}
				newWeights = weights;
				//System.out.println(Arrays.toString(trainingSet));
				//System.out.println(Arrays.toString(weights));
				//System.out.println("Actual " + actual);
			}
			//System.out.println(Arrays.toString(weights));
		}
		System.out.println(set);
		System.out.println(Arrays.toString(weights));
	}

	
}

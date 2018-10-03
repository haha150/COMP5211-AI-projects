import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Program {

	private List<double[]> trainingSets;
	private Genetic[] genetics;
	private int generation;
	private double[] weight;

	public Program(List<double[]> trainingSets, int size) {
		this.trainingSets = trainingSets;
		genetics = new Genetic[size];
		for (int i = 0; i < genetics.length; i++) {
			genetics[i] = new Genetic(trainingSets.get(0).length - 1);
		}
		generation = 0;
	}

	public void learn() {
		boolean isDone = false;
		while (!isDone) {
			for (double[] trs : trainingSets) {
				for (Genetic g : genetics) {
					g.calculateFitness(trs);
					if (g.getError() == 0.0) {
						g.setScore(g.getScore() + 1);
					}
				}
			}

			List<Genetic> scores = new ArrayList<>();
			List<Genetic> remove = new ArrayList<>();

			for (Genetic g : genetics) {
				scores.add(g);
			}

			Collections.sort(scores);

			for (int i = 0; i < scores.size() - (genetics.length * 0.3); i++) {
				remove.add(scores.get(i));
			}

			scores.removeAll(remove);

			for (Genetic g : genetics) {
				//System.out.println(Arrays.toString(g.getWeight()));
				//System.out.println(g.getScore());
				g.setScore(0);
			}

			genetics = new Genetic[genetics.length];

			int index = 0;

			for (int i = 0; i < scores.size(); i++) {
				genetics[i] = scores.get(i);
				index++;
			}

			for (int g = index; g < genetics.length; g++) {
				Genetic father = scores.get(new Random().nextInt(scores.size()));
				Genetic mother = scores.get(new Random().nextInt(scores.size()));
				father = scores.get(new Random().nextInt(scores.size()));
				mother = scores.get(new Random().nextInt(scores.size()));
				int split = new Random().nextInt(father.getWeight().length);
				double[] child = new double[father.getWeight().length];
				for (int k = 0; k < split; k++) {
					child[k] = father.getWeight()[k];
				}
				for (int l = split; l < father.getWeight().length; l++) {
					child[l] = mother.getWeight()[l];
				}

				if (new Random().nextInt(100) + 1 == 1) {
					DecimalFormat df = new DecimalFormat("####0.00");
					String nr = df.format(new Random().nextDouble() * 2 - 1);
					child[new Random().nextInt(child.length)] = Double.parseDouble(nr);
				}
				
				genetics[index] = new Genetic(child);
				index++;
			}

			if (evaluate()) {
				System.out.println("Done!");
				System.out.println("Generation: " + generation);
				isDone = true;
			}

			/*
			 * if (evaluate2()) { System.out.println("Done2!"); // for (Genetic g :
			 * genetics) { // System.out.println(Arrays.toString(g.getWeight())); // }
			 * System.out.println(Arrays.toString(weight));
			 * System.out.println("Generation: " + generation); isDone = true; }
			 */

			System.out.println("Generation: " + generation);

			generation++;
		}
	}

	public boolean evaluate() {
		List<double[]> ges = new ArrayList<>();
		for (double[] tr : trainingSets) {
			for (Genetic g : genetics) {
				double totalSum = 0;
				for (int i = 0; i < tr.length - 1; i++) {
					totalSum = totalSum + (tr[i] * g.getWeight()[i]);
				}
				double actual = 0;
				if (totalSum >= g.getWeight()[g.getWeight().length - 1]) {
					actual = 1;
				}
				double error = tr[tr.length - 1] - actual;
				if (error == 0.0) {
					ges.add(g.getWeight());
				}
			}
		}
		if (ges.isEmpty()) {
			return false;
		}
		List<double[]> gess = new ArrayList<>();
		for (double[] tr : trainingSets) {
			for (double[] g : ges) {
				double totalSum = 0;
				for (int i = 0; i < tr.length - 1; i++) {
					totalSum = totalSum + (tr[i] * g[i]);
				}
				double actual = 0;
				if (totalSum >= g[g.length - 1]) {
					actual = 1;
				}
				double error = tr[tr.length - 1] - actual;
				if (error != 0.0) {
					gess.add(g);
				}
			}
		}
		ges.removeAll(gess);
		if (ges.isEmpty()) {
			return false;
		}
		System.out.println("Printing");
		for (double[] g : ges) {
			System.out.println(Arrays.toString(g));
		}
		for (double[] tr : trainingSets) {
			for (double[] g : ges) {
				double totalSum = 0;
				for (int i = 0; i < tr.length - 1; i++) {
					totalSum = totalSum + (tr[i] * g[i]);
				}
				double actual = 0;
				if (totalSum >= g[g.length - 1]) {
					actual = 1;
				}
				double error = tr[tr.length - 1] - actual;
				System.out.println(error);
			}
		}
		return true;
	}

	/*
	 * public boolean evaluate2() { List<Evaluation> eval = new ArrayList<>(); for
	 * (double[] trainingSet : trainingSets) { List<Genetic> results = new
	 * ArrayList<>(); for (Genetic c : genetics) { double totalSum = 0; for (int i =
	 * 0; i < trainingSet.length - 1; i++) { totalSum = totalSum + (trainingSet[i] *
	 * c.getWeight()[i]); } double actual = 0; if (totalSum >=
	 * c.getWeight()[c.getWeight().length - 1]) { actual = 1; } double error =
	 * trainingSet[trainingSet.length - 1] - actual; if (error == 0.0) {
	 * results.add(c); } } if (!results.isEmpty()) { eval.add(new
	 * Evaluation(trainingSet, results)); } } if (eval.size() !=
	 * trainingSets.size()) { return false; } boolean result = false; List<Genetic>
	 * res = eval.get(0).getResults(); eval.remove(0); for (Genetic c : res) { for
	 * (Evaluation e : eval) { for (Genetic c2 : e.getResults()) { if
	 * (Arrays.equals(c.getWeight(), c2.getWeight())) { result = true; weight =
	 * c.getWeight(); System.out.println(Arrays.toString(weight)); break; } result =
	 * false; } if (!result) { return false; } } } return result; }
	 */

}

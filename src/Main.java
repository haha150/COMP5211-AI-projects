import java.util.*;

public class Main {

	public static void main(String[] args) {
		north();
		south();
		west();
		east();
	}
	
	public static void north() {
		List<double[] > trainingSets = new ArrayList<>();
		trainingSets.add(new double[]{1, 0, 0, 0, 0, 0, 0, 0, 1, 1});
		trainingSets.add(new double[]{0, 0, 0, 0, 0, 0, 0, 1, 1, 1});
		trainingSets.add(new double[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 0});
		trainingSets.add(new double[]{1, 1, 0, 0, 0, 0, 0, 0, 1, 0});
		trainingSets.add(new double[]{1, 0, 1, 0, 0, 0, 0, 0, 1, 0});
		trainingSets.add(new double[]{1, 1, 0, 0, 0, 0, 0, 1, 1, 0});
		trainingSets.add(new double[]{1, 0, 1, 0, 0, 0, 0, 1, 1, 0});
		Learner lr = new Learner(trainingSets);
		lr.learn("North");
	}
	
	public static void south() {
		List<double[] > trainingSets = new ArrayList<>();
		trainingSets.add(new double[]{0, 0, 0, 0, 1, 0, 0, 0, 1, 1});
		trainingSets.add(new double[]{0, 0, 0, 1, 0, 0, 0, 0, 1, 1});
		trainingSets.add(new double[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 0});
		trainingSets.add(new double[]{0, 0, 0, 0, 1, 1, 0, 0, 1, 0});
		trainingSets.add(new double[]{0, 0, 0, 0, 1, 0, 1, 0, 1, 0});
		trainingSets.add(new double[]{0, 0, 0, 1, 1, 1, 0, 0, 1, 0});
		trainingSets.add(new double[]{0, 0, 0, 1, 1, 0, 1, 0, 1, 0});
		Learner lr = new Learner(trainingSets);
		lr.learn("South");
	}
	
	public static void west() {
		List<double[] > trainingSets = new ArrayList<>();
		trainingSets.add(new double[]{0, 0, 0, 0, 0, 0, 1, 0, 1, 1});
		trainingSets.add(new double[]{0, 0, 0, 0, 0, 1, 0, 0, 1, 1});
		trainingSets.add(new double[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 0});
		trainingSets.add(new double[]{0, 0, 0, 0, 0, 0, 1, 1, 1, 0});
		trainingSets.add(new double[]{1, 0, 0, 0, 0, 0, 1, 0, 1, 0});
		trainingSets.add(new double[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 0});
		trainingSets.add(new double[]{1, 0, 0, 0, 0, 1, 1, 0, 1, 0});
		Learner lr = new Learner(trainingSets);
		lr.learn("West");
	}
	
	public static void east() {
		List<double[] > trainingSets = new ArrayList<>();
		trainingSets.add(new double[]{0, 0, 1, 0, 0, 0, 0, 0, 1, 1});
		trainingSets.add(new double[]{0, 1, 0, 0, 0, 0, 0, 0, 1, 1});
		trainingSets.add(new double[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 0});
		trainingSets.add(new double[]{0, 0, 1, 1, 0, 0, 0, 0, 1, 0});
		trainingSets.add(new double[]{0, 0, 1, 0, 1, 0, 0, 0, 1, 0});
		trainingSets.add(new double[]{0, 1, 1, 1, 0, 0, 0, 0, 1, 0});
		trainingSets.add(new double[]{0, 1, 1, 0, 1, 0, 0, 0, 1, 0});
		Learner lr = new Learner(trainingSets);
		lr.learn("East");
	}
	
}







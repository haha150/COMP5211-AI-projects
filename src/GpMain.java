import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GpMain {

	public static void main(String[] args) {
		//original();
		addedOne();
	}
	
	public static void addedOne() {
		List<double[] > trainingSets = new ArrayList<>();
		trainingSets.add(new double[]{0.05,0.47,0.89,0.28,0.37,0.58,0.71,0.75,0.29,1,0});
		trainingSets.add(new double[]{0.62,0.2,0.71,0.61,0.01,0.63,0.52,0.04,0.94,1,1});
		trainingSets.add(new double[]{0.61,0.7,0.63,0.43,0.79,0.83,0.92,0.81,0.27,1,0});
		trainingSets.add(new double[]{0.75,0.42,0.03,0.02,0.23,0.42,0.13,0.81,0.51,1,0});
		trainingSets.add(new double[]{0.66,0.07,0.88,0.83,0.92,0.83,0.3,0.35,0.79,1,1});
		trainingSets.add(new double[]{0.57,0.56,0.36,0.94,0.51,0.7,0.56,0.01,0.78,1,1});
		trainingSets.add(new double[]{0.07,0.66,0.54,0.6,0.38,0.67,0.66,0.96,0.55,1,0});
		trainingSets.add(new double[]{0.75,0.43,0.11,0.04,0.35,0.48,0.25,0.59,0.5,1,1});
		trainingSets.add(new double[]{0.91,0.87,0.65,0.95,0.42,0.27,0.25,0.2,0.76,1,1});
		trainingSets.add(new double[]{0.46,0.47,0.13,0.99,0.82,0.56,0.72,0.16,0.62,1,1});
		trainingSets.add(new double[]{0.09,0.08,0.17,0.57,0.24,0.68,0.99,0.71,0.48,1,0});
		trainingSets.add(new double[]{0.34,0.5,0.26,0.34,0.06,0.86,0.58,0.41,0.74,1,0});
		trainingSets.add(new double[]{0.7,0.77,0.27,0.98,0.52,0.38,0.32,0.85,0.46,1,0});
		trainingSets.add(new double[]{0.66,0.57,0.22,0.77,0.4,0.1,0.61,0.38,0.21,1,0});
		trainingSets.add(new double[]{0.4,0.92,0.79,0.18,0.58,0.3,0.08,0.71,0.7,1,1});
		trainingSets.add(new double[]{0.3,0.85,0.36,0.23,0.68,0.15,0.21,0.01,0.31,1,1});
		trainingSets.add(new double[]{0.8,0.05,0.21,0.44,0.74,0.25,0.85,0.83,0.06,1,0});
		trainingSets.add(new double[]{0.26,0.32,0.24,0.18,0.74,0.36,0.09,0.48,0.18,1,1});
		trainingSets.add(new double[]{0.76,0.65,0.52,0.0,0.39,0.64,0.36,0.03,0.62,1,1});
		trainingSets.add(new double[]{0.4,0.46,0.71,0.73,0.34,0.29,0.75,0.93,0.19,1,0});
		trainingSets.add(new double[]{0.59,0.66,0.28,0.19,0.87,0.31,0.37,0.84,0.41,1,1});
		trainingSets.add(new double[]{0.35,0.73,0.43,0.46,0.48,0.49,0.48,0.86,0.1,1,0});
		trainingSets.add(new double[]{0.47,0.45,1.0,0.91,0.24,0.04,0.72,0.17,0.7,1,0});
		trainingSets.add(new double[]{0.86,0.11,0.28,0.19,0.96,0.07,0.48,0.92,0.91,1,1});
		trainingSets.add(new double[]{0.78,0.2,0.49,0.26,0.83,0.42,0.03,0.42,0.73,1,1});
		trainingSets.add(new double[]{0.76,0.01,0.63,0.82,0.5,0.8,0.6,0.52,0.63,1,1});
		trainingSets.add(new double[]{0.9,0.31,0.22,0.22,0.31,0.72,0.45,0.79,0.72,1,0});
		trainingSets.add(new double[]{0.84,0.72,0.09,0.67,0.95,0.54,0.05,0.97,0.16,1,1});
		trainingSets.add(new double[]{0.94,0.07,0.43,0.19,0.1,0.63,0.5,0.78,0.35,1,0});
		trainingSets.add(new double[]{0.51,0.55,0.27,0.84,0.41,0.38,0.75,0.91,0.53,1,0});
		trainingSets.add(new double[]{0.68,0.99,0.05,0.56,0.63,0.81,0.1,0.58,0.51,1,1});
		trainingSets.add(new double[]{0.31,0.77,0.85,0.04,0.32,0.87,0.88,0.04,0.42,1,1});
		trainingSets.add(new double[]{0.32,0.98,0.38,0.77,0.54,0.57,0.22,0.46,1.0,1,1});
		trainingSets.add(new double[]{0.57,0.1,0.98,0.44,0.5,0.37,0.7,0.54,0.46,1,1});
		trainingSets.add(new double[]{0.24,0.18,0.17,0.08,0.62,0.46,0.93,0.98,0.32,1,0});
		trainingSets.add(new double[]{0.39,0.84,0.92,0.31,0.34,0.14,0.72,0.85,0.24,1,0});
		trainingSets.add(new double[]{0.86,0.84,0.75,0.59,0.73,0.57,0.77,0.38,0.67,1,1});
		trainingSets.add(new double[]{0.0,0.77,0.97,0.4,0.64,0.02,0.46,0.84,0.14,1,1});
		trainingSets.add(new double[]{0.74,0.7,0.6,0.79,0.34,0.24,0.64,0.82,0.38,1,0});
		trainingSets.add(new double[]{0.71,0.36,0.95,0.23,0.08,0.46,0.96,0.04,0.28,1,0});
		trainingSets.add(new double[]{0.61,0.03,0.67,0.83,0.03,0.46,0.58,0.36,0.21,1,0});
		trainingSets.add(new double[]{0.72,0.87,0.45,0.48,0.47,0.61,0.67,0.28,0.45,1,0});
		trainingSets.add(new double[]{0.23,0.66,0.03,0.04,0.44,0.23,0.76,0.11,0.77,1,0});
		trainingSets.add(new double[]{0.35,0.21,0.69,0.32,0.41,0.91,0.44,0.13,0.49,1,1});
		trainingSets.add(new double[]{0.92,0.25,0.34,0.85,0.12,0.37,0.23,0.79,0.81,1,0});
		trainingSets.add(new double[]{0.58,0.68,0.26,0.83,0.97,0.78,0.3,0.14,0.9,1,1});
		trainingSets.add(new double[]{0.24,0.85,0.91,0.24,0.98,0.97,0.05,0.03,0.08,1,1});
		trainingSets.add(new double[]{0.35,0.72,0.87,0.66,0.58,0.79,0.19,0.86,0.85,1,1});
		trainingSets.add(new double[]{0.38,0.93,0.96,0.05,0.4,0.33,0.06,0.09,0.27,1,1});
		Program p = new Program(trainingSets, 1000);
		p.learn();
		/*double[] weight = new double[] {0.01, 0.15, 0.58, -0.6, 0.88, -0.0, -0.9, -0.78, 0.26, 0.17};
		for(double[] trainingSet : trainingSets) {
			double totalSum = 0;
			for (int i = 0; i < trainingSet.length - 1; i++) {
				totalSum = totalSum + (trainingSet[i] * weight[i]);
			}
			double actual = 0;
			if (totalSum >= 0.0) {
				actual = 1;
			}
			double error = trainingSet[trainingSet.length - 1] - actual;
			System.out.println(error);
		}*/
	}
	
	public static void original() {
		List<double[] > trainingSets = new ArrayList<>();
		trainingSets.add(new double[]{0.05,0.47,0.89,0.28,0.37,0.58,0.71,0.75,0.29,0});
		trainingSets.add(new double[]{0.62,0.2,0.71,0.61,0.01,0.63,0.52,0.04,0.94,1});
		trainingSets.add(new double[]{0.61,0.7,0.63,0.43,0.79,0.83,0.92,0.81,0.27,0});
		trainingSets.add(new double[]{0.75,0.42,0.03,0.02,0.23,0.42,0.13,0.81,0.51,0});
		trainingSets.add(new double[]{0.66,0.07,0.88,0.83,0.92,0.83,0.3,0.35,0.79,1});
		trainingSets.add(new double[]{0.57,0.56,0.36,0.94,0.51,0.7,0.56,0.01,0.78,1});
		trainingSets.add(new double[]{0.07,0.66,0.54,0.6,0.38,0.67,0.66,0.96,0.55,0});
		trainingSets.add(new double[]{0.75,0.43,0.11,0.04,0.35,0.48,0.25,0.59,0.5,1});
		trainingSets.add(new double[]{0.91,0.87,0.65,0.95,0.42,0.27,0.25,0.2,0.76,1});
		trainingSets.add(new double[]{0.46,0.47,0.13,0.99,0.82,0.56,0.72,0.16,0.62,1});
		trainingSets.add(new double[]{0.09,0.08,0.17,0.57,0.24,0.68,0.99,0.71,0.48,0});
		trainingSets.add(new double[]{0.34,0.5,0.26,0.34,0.06,0.86,0.58,0.41,0.74,0});
		trainingSets.add(new double[]{0.7,0.77,0.27,0.98,0.52,0.38,0.32,0.85,0.46,0});
		trainingSets.add(new double[]{0.66,0.57,0.22,0.77,0.4,0.1,0.61,0.38,0.21,0});
		trainingSets.add(new double[]{0.4,0.92,0.79,0.18,0.58,0.3,0.08,0.71,0.7,1});
		trainingSets.add(new double[]{0.3,0.85,0.36,0.23,0.68,0.15,0.21,0.01,0.31,1});
		trainingSets.add(new double[]{0.8,0.05,0.21,0.44,0.74,0.25,0.85,0.83,0.06,0});
		trainingSets.add(new double[]{0.26,0.32,0.24,0.18,0.74,0.36,0.09,0.48,0.18,1});
		trainingSets.add(new double[]{0.76,0.65,0.52,0.0,0.39,0.64,0.36,0.03,0.62,1});
		trainingSets.add(new double[]{0.4,0.46,0.71,0.73,0.34,0.29,0.75,0.93,0.19,0});
		trainingSets.add(new double[]{0.59,0.66,0.28,0.19,0.87,0.31,0.37,0.84,0.41,1});
		trainingSets.add(new double[]{0.35,0.73,0.43,0.46,0.48,0.49,0.48,0.86,0.1,0});
		trainingSets.add(new double[]{0.47,0.45,1.0,0.91,0.24,0.04,0.72,0.17,0.7,0});
		trainingSets.add(new double[]{0.86,0.11,0.28,0.19,0.96,0.07,0.48,0.92,0.91,1});
		trainingSets.add(new double[]{0.78,0.2,0.49,0.26,0.83,0.42,0.03,0.42,0.73,1});
		trainingSets.add(new double[]{0.76,0.01,0.63,0.82,0.5,0.8,0.6,0.52,0.63,1});
		trainingSets.add(new double[]{0.9,0.31,0.22,0.22,0.31,0.72,0.45,0.79,0.72,0});
		trainingSets.add(new double[]{0.84,0.72,0.09,0.67,0.95,0.54,0.05,0.97,0.16,1});
		trainingSets.add(new double[]{0.94,0.07,0.43,0.19,0.1,0.63,0.5,0.78,0.35,0});
		trainingSets.add(new double[]{0.51,0.55,0.27,0.84,0.41,0.38,0.75,0.91,0.53,0});
		trainingSets.add(new double[]{0.68,0.99,0.05,0.56,0.63,0.81,0.1,0.58,0.51,1});
		trainingSets.add(new double[]{0.31,0.77,0.85,0.04,0.32,0.87,0.88,0.04,0.42,1});
		trainingSets.add(new double[]{0.32,0.98,0.38,0.77,0.54,0.57,0.22,0.46,1.0,1});
		trainingSets.add(new double[]{0.57,0.1,0.98,0.44,0.5,0.37,0.7,0.54,0.46,1});
		trainingSets.add(new double[]{0.24,0.18,0.17,0.08,0.62,0.46,0.93,0.98,0.32,0});
		trainingSets.add(new double[]{0.39,0.84,0.92,0.31,0.34,0.14,0.72,0.85,0.24,0});
		trainingSets.add(new double[]{0.86,0.84,0.75,0.59,0.73,0.57,0.77,0.38,0.67,1});
		trainingSets.add(new double[]{0.0,0.77,0.97,0.4,0.64,0.02,0.46,0.84,0.14,1});
		trainingSets.add(new double[]{0.74,0.7,0.6,0.79,0.34,0.24,0.64,0.82,0.38,0});
		trainingSets.add(new double[]{0.71,0.36,0.95,0.23,0.08,0.46,0.96,0.04,0.28,0});
		trainingSets.add(new double[]{0.61,0.03,0.67,0.83,0.03,0.46,0.58,0.36,0.21,0});
		trainingSets.add(new double[]{0.72,0.87,0.45,0.48,0.47,0.61,0.67,0.28,0.45,0});
		trainingSets.add(new double[]{0.23,0.66,0.03,0.04,0.44,0.23,0.76,0.11,0.77,0});
		trainingSets.add(new double[]{0.35,0.21,0.69,0.32,0.41,0.91,0.44,0.13,0.49,1});
		trainingSets.add(new double[]{0.92,0.25,0.34,0.85,0.12,0.37,0.23,0.79,0.81,0});
		trainingSets.add(new double[]{0.58,0.68,0.26,0.83,0.97,0.78,0.3,0.14,0.9,1});
		trainingSets.add(new double[]{0.24,0.85,0.91,0.24,0.98,0.97,0.05,0.03,0.08,1});
		trainingSets.add(new double[]{0.35,0.72,0.87,0.66,0.58,0.79,0.19,0.86,0.85,1});
		trainingSets.add(new double[]{0.38,0.93,0.96,0.05,0.4,0.33,0.06,0.09,0.27,1});
		Program p = new Program(trainingSets, 1000);
		p.learn();
	}

}

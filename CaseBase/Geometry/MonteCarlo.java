package com.CaseBase.Geometry;

class OddRegionSimulation {

    int trials;
    int oddHits;

    OddRegionSimulation(int trials) {
        this.trials = trials;
        this.oddHits = 0;
    }

    void runSimulation() {

        for (int i = 0; i < trials; i++) {

            double x = (Math.random() * 2) - 1;
            double y = (Math.random() * 2) - 1;

            if (isOddRegion(x, y)) {
                oddHits++;
            }
        }
    }

    boolean isOddRegion(double x, double y) {

        if (x <= 0) {
            return true;
        }

        if (x > 0 && y > 0 && (x + y <= 1)) {
            return true;
        }

        return false;
    }

    double getProbability() {
        return (double) oddHits / trials;
    }
}
public class MonteCarlo {
	public static void main(String[] args) {

        int trials = 1_000_000;

        OddRegionSimulation sim = new OddRegionSimulation(trials);
        sim.runSimulation();

        System.out.println("Simulation results for " + trials + " trials");
        System.out.println("Odd region hits: " + sim.oddHits);
        System.out.printf("Estimated Probability: %.5f%n", sim.getProbability());
    }

}

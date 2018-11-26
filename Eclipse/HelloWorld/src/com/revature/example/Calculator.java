package com.revature.example;

public class Calculator {

		public double add(double arg0, double arg1) {
			double add= arg0+arg1;
			return add;
		}

		public double subtract(double arg0, double arg1) {
			double sub= arg0-arg1;
			return sub;
		}

		public double multiply(double arg0, double arg1) {
			double mult= arg0*arg1;
			return mult;
		}

		public double divide(double arg0, double arg1) {
			double div= arg0/arg1;
			return div;
		}

		@Override
		public String toString() {
			return "Calculator []";
		}

}

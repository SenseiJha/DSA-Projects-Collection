package Digital_Mixing_Console_System;

public class Panning implements Audio_Processor {
	private double pan;

	public Panning(double pan) {
		this.pan = pan;
	}

	@Override
	public double[] process(double[] audioSignal) {
		double[] output = new double[audioSignal.length];
		for(int i = 0; i < audioSignal.length; i++) {
			output[i] = audioSignal[i] * (1 - Math.abs(pan));
		}
		return output;
	}
}

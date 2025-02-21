package Digital_Mixing_Console_System;

public class Equalizer implements Audio_Processor {
	
	private double bassBoost;
	private double trebleBoost;
	
	public Equalizer(double bassBoost, double trebBoost) {
		this.bassBoost = bassBoost;
		this.trebleBoost = trebBoost;
	}
	
	@Override
	public double[] process(double[] audioSignal) {
		double[] output = new double[audioSignal.length];
		for(int i = 0; i < audioSignal.length; i++) {
			output[i] = audioSignal[i] * (1 + bassBoost-trebleBoost);
		}
		return output;
	}
	
}

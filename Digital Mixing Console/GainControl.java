package Digital_Mixing_Console_System;

public class GainControl implements Audio_Processor {
	private double gain;
	
	public GainControl(double gain) {
		this.gain = gain;
	}

	@Override
	public double[] process(double[] audioSignal) {
		double[] output = new double[audioSignal.length];
		for(int i = 0; i < audioSignal.length; i++) {
			output[i] = audioSignal[i] * gain;
		}
		return output;
	}
}

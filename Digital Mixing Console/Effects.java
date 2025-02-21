package Digital_Mixing_Console_System;

public class Effects implements Audio_Processor {
	private double delayFactor;
	private double reverbFactor;
	
	public Effects(double delayFactor, double reverbFactor) {
		this.delayFactor = delayFactor;
		this.reverbFactor = reverbFactor;
	}
	@Override
	public double[] process(double[] audioSignal) {
		double output[] = new double[audioSignal.length];
		int delaySamples = (int) (audioSignal.length * delayFactor);
		
		for(int i = 0; i < audioSignal.length; i++) {
			output[i] = audioSignal[i];
			if(i >= delaySamples) {
				output[i] += audioSignal[i-delaySamples]* 0.5;
			}
			if(i > 0) {
				output[i] += output[i - 1] * reverbFactor;
			}
		}
		return output;
	}
}
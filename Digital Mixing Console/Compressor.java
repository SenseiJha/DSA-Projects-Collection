package Digital_Mixing_Console_System;

public class Compressor implements Audio_Processor {
	private double threshold;
	private double ratio;
	
	public Compressor(double threshold, double ratio) {
		this.threshold = threshold;
		this.ratio = ratio;
	}

	@Override
	public double[] process(double[] audioSignal) {
		double[] output = new double[audioSignal.length];
		for(int i = 0; i < audioSignal.length; i++) {
			if(audioSignal[i] > threshold) {
				output[i] = threshold + (audioSignal[i] - threshold)/ratio;
			}
			else {
				output[i] = audioSignal[i];
			}
		}
		return output;
	}

}

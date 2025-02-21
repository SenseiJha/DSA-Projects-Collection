package Digital_Mixing_Console_System;

import java.util.List;

public class Mixer {
	private List<Audio_Processor> processors;

	public Mixer(List<Audio_Processor> processors) {
		this.processors = processors;
	}
	
	public double[] mix(double[] inputSignal) {
		double[] processedSignal = inputSignal.clone();
		for(Audio_Processor processor : processors) {
			processedSignal = processor.process(processedSignal);
		}
		return processedSignal;
	}
}

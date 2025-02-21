package Digital_Mixing_Console_System;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		double[] audioSignal = {0.2, 0.3, 0.5, 0.7, 0.9, -0.4, -0.6, -0.8, -1.0};
		
		GainControl gain = new GainControl(1.2);
		Equalizer eq = new Equalizer(0.1,0.05);
		Compressor comp = new Compressor(0.7,2.0);
		Effects efx = new Effects(0.1,0.4);
		Panning pan = new Panning(-0.5);
		
		List<Audio_Processor> processors = Arrays.asList(gain,eq,comp,efx,pan);
		Mixer mixer = new Mixer(processors);
		
		double[] mixedOutput = mixer.mix(audioSignal);
		
		System.out.println("Final Audio : " + Arrays.toString(mixedOutput));
	}
}

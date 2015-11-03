package org.jiserte.bioformats.readers.pir;

import org.jiserte.bioformats.readers.faults.AlignmentReadingFault;

public class PirSequenceLineFault extends AlignmentReadingFault {

	public PirSequenceLineFault() {
		super();
		this.setMessage("A sequence data line was expected. Data lines contains any non '*' symbol, except in the last line of a block that must end with a '*' symbol.");
	}

}

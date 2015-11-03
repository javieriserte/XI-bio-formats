package org.jiserte.bioformats.readers.pir;

import org.jiserte.bioformats.readers.faults.AlignmentReadingFault;

public class PirFirstLineFault extends AlignmentReadingFault {

	public PirFirstLineFault() {
		super();
		this.setMessage("A header line with format '>XX;sequenceId' was expected.");
	}
	
}

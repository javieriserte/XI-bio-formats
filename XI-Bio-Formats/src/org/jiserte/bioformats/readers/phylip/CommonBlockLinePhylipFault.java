package org.jiserte.bioformats.readers.phylip;

import org.jiserte.bioformats.readers.faults.AlignmentReadingFault;

public class CommonBlockLinePhylipFault extends AlignmentReadingFault {

	public CommonBlockLinePhylipFault() {
		super();
		this.setMessage("Sequence from data blocks other than the first must contain the 10 first characters as white spaces, and the the sequence.");
	}

	
	
}

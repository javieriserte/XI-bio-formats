package org.jiserte.bioformats.readers.phylip;

import org.jiserte.bioformats.readers.faults.AlignmentReadingFault;

public class PhylipHeaderFault extends AlignmentReadingFault {

	public PhylipHeaderFault() {
		super();
		
		this.setMessage("First line in Phylip format must contain two only two numbers: The number of sequences and length of alignment, in that order.");
		
	}
	
}

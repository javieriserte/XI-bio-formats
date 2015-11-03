package org.jiserte.bioformats.readers.fasta;

import org.jiserte.bioformats.readers.faults.AlignmentReadingFault;

public class FastaDescriptionLineFault extends AlignmentReadingFault {

	public FastaDescriptionLineFault() {
		
		super();
		
		this.setMessage("Fasta description lines starts with '>' symbol.");
		
	}
	
	

}

package org.jiserte.bioformats.readers.fasta;

import org.jiserte.bioformats.readers.faults.AlignmentReadingFault;

public class FastaSequenceLineFault extends AlignmentReadingFault {

	public FastaSequenceLineFault() {
		super();
		this.setMessage("Sequence lines in fasta contains letters, '-', '*' and '.' symbols.");
	}

}

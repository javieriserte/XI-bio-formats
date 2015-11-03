package org.jiserte.bioformats.readers.clustal;

import org.jiserte.bioformats.readers.faults.AlignmentReadingFault;

public class ClustalHeaderFault extends AlignmentReadingFault {

	public ClustalHeaderFault() {
		super();
		this.setMessage("First no blank line do not starts with 'CLUSTAL'");
	} 
}

package org.jiserte.bioformats.readers.nexus;

import org.jiserte.bioformats.readers.faults.AlignmentReadingFault;

public class NexusDataBlockHeaderFault extends AlignmentReadingFault {

	public NexusDataBlockHeaderFault() {
		super();
		this.setMessage("A line starting with 'Dimension', 'Format' or 'matrix' was expected.");
	}
	
	

}

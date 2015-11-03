package org.jiserte.bioformats.readers.nexus;

import org.jiserte.bioformats.readers.faults.AlignmentReadingFault;

public class NexusBeginBlockFault extends AlignmentReadingFault {

	public NexusBeginBlockFault() {
		super();
		this.setMessage("The beginning of a nexus block is expected.");
	}
	

}

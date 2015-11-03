package org.jiserte.bioformats.readers.nexus;

import org.jiserte.bioformats.readers.faults.AlignmentReadingFault;

public class NexusFirstLineFault extends AlignmentReadingFault {

	public NexusFirstLineFault() {
		super();
		this.setMessage("Nexus alignment must start with: '#NEXUS' string.");
	}
	
	

}

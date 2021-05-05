package com.hemebiotech.analytics;

import java.util.List;

/**
 * Read data from file
 * @author Claudia
 */
public interface ISymptomReader {

	/** Read symptoms from the provided filepath
	 * @return symptoms read as list
	 */
	List<String> getSymptoms ();
}

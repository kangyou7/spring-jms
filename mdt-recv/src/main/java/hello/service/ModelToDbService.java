package hello.service;

import java.io.IOException;

import org.apache.commons.csv.CSVRecord;

public interface ModelToDbService {

	public String[] loadPCTR01W(String fileName, Iterable<CSVRecord> records) throws IOException;

	public String[] loadITRF01W(String fileName, Iterable<CSVRecord> records) throws IOException;

	public String[] loadITRF10W(String fileName, Iterable<CSVRecord> records) throws IOException;

	public String[] loadITEF01W(String fileName, Iterable<CSVRecord> records) throws IOException;

	public String[] loadITEF10W(String fileName, Iterable<CSVRecord> records) throws IOException;

	public String[] loadLOGD01W(String fileName, Iterable<CSVRecord> records) throws IOException;

	public String[] loadLOGD10W(String fileName, Iterable<CSVRecord> records) throws IOException;

	public String[] loadLOGD11W(String fileName, Iterable<CSVRecord> records) throws IOException;

	public String[] loadLOGD20W(String fileName, Iterable<CSVRecord> records) throws IOException;

	public String[] loadLOGD21W(String fileName, Iterable<CSVRecord> records) throws IOException;

	public String[] loadLOGD30W(String fileName, Iterable<CSVRecord> records) throws IOException;

	public String[] loadRLFR01W(String fileName, Iterable<CSVRecord> records) throws IOException;

	public String[] loadRLFR10W(String fileName, Iterable<CSVRecord> records) throws IOException;

	public String[] loadRLFR11W(String fileName, Iterable<CSVRecord> records) throws IOException;

	public String[] loadRLFR20W(String fileName, Iterable<CSVRecord> records) throws IOException;

	public String[] loadRLFR21W(String fileName, Iterable<CSVRecord> records) throws IOException;

	public String[] loadRLFR30W(String fileName, Iterable<CSVRecord> records) throws IOException;

	public String[] loadRCEF01W(String fileName, Iterable<CSVRecord> records) throws IOException;

	public String[] loadRCEF10W(String fileName, Iterable<CSVRecord> records) throws IOException;

	public String[] loadRCEF11W(String fileName, Iterable<CSVRecord> records) throws IOException;

	public String[] loadRCEF20W(String fileName, Iterable<CSVRecord> records) throws IOException;

	public String[] loadRCEF21W(String fileName, Iterable<CSVRecord> records) throws IOException;

	public String[] loadRCEF30W(String fileName, Iterable<CSVRecord> records) throws IOException;

	public String[] loadM1A201W(String fileName, Iterable<CSVRecord> records) throws IOException;

}

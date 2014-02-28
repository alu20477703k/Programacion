package AddressBookRandom;
import java.io.*;
import java.util.*;

/** A sample of reading from an indexed random access file */
public class ReadAddressBook {
	public static void main(String[] args) {
		try {
			// Read the index file into a Hashtable for
			// fast lookup - note we assume the file is ok...
			// (generally this assumption is _not_ a good idea...)
			Hashtable indexHash = new Hashtable();
			BufferedReader index = new BufferedReader(new FileReader(
					"phone.idx"));
			String line;
			while ((line = index.readLine()) != null)
				indexHash.put(line, new Long(index.readLine()));
			index.close();
			// wrap SEystem.in so we can read a line at a time
			BufferedReader in = new BufferedReader(new InputStreamReader(
					System.in));
			// open the phone data file
			RandomAccessFile data = new RandomAccessFile("phone.dat", "r");
			// create a record to read data into
			AddressData d = new AddressData();
			// loop until user presses enter by itself
			boolean done = false;
			while (!done) {
				// ask for the name
				System.out.print("Name: ");
				String name = in.readLine();
				// if empty, quit!
				if (name.equals(""))
					done = true;
				else {
					// otherwise lookup the name in the index
					Long position = (Long) indexHash.get(name);
					// if not found, complain
					if (position == null)
						System.out.println(name + " not found!");
					else {
						// otherwise, read the phone data & report it
						data.seek(position.longValue());
						d.readFrom(data);
						System.out.println(d.report());
					}
				}
			}
			data.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package AddressBookRandom;
import java.io.*;
/** A sample of creating an indexed random access file */
public class CreateAddressBook {
  public static void main(String[] args) {
    try {
      // create the index file
      PrintWriter index = new PrintWriter(
                            new FileWriter("phone.idx"));
      // create the phone data file
      RandomAccessFile data =
          new RandomAccessFile("phone.dat","rw");
      // write a few sample records
      writeIt(data, index, "Ernie",
              "123 Sesame Street, Apt E",
              "MuppetVille", "PBS", 12345,
              5, "123-4567");
      writeIt(data, index, "Cookie Monster",
              "123 Sesame Street, Apt C",
              "MuppetVille", "PBS", 12345,
              3, "COO-KIES");
      writeIt(data, index, "Fred Rogers",
              "111 Trolley Lane",
              "Neighborhood", "MakeBelive", 22222,
              78, "BMY-NABR");
      writeIt(data, index, "David Soriano","Castellon",
    		  "Serradal"
    		  ,"Castellon", 6,27,"964051915");
      // close the index and the data file
      index.close();
      data.close();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
}
  /** Write our information to a data file and create
   *    an index entry
   */
  public static void writeIt(RandomAccessFile data,
                 PrintWriter index,
                 String name,
                           String street,
                           String city,
                           String state,
                           int zip,
                           int age,
                           String phone)
                throws IOException {
    AddressData d = new AddressData();
    d.setName(name);
    d.setStreet(street);
    d.setCity(city);
    d.setState(state);
    d.setZip(zip);
    d.setAge(age);
    d.setPhone(phone);
    index.println(d.getName());
    index.println(d.writeTo(data));
  }
}

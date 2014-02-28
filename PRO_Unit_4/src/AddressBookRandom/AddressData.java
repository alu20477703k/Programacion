package AddressBookRandom;
import java.io.*;

/** A simple class that tracks address book
*    information for a person.
*  Note -- all data is package-accessible to keep the
*       example short. In general, all data _should_
*       be private and accessed through "get" and "set"
*       methods. */

public class AddressData {
  private String name;
  private String street;
  private String city;
  private String state;
  private int    zip;
  private int    age;
  private String phone;
  /** Fill in our data from a random access file.
   *  Note that we must read in the same order we wrote
   *    the data...
   */
   public void readFrom(RandomAccessFile f) 
						  throws IOException {
    name   = f.readUTF();
    street = f.readUTF();
    city   = f.readUTF();
    state  = f.readUTF();
    zip    = f.readInt();
    age    = f.readInt();
    phone  = f.readUTF();
  }
  /** Create a string describing the person */
  public String report() {
    String nl = System.getProperty("line.separator");
    return name + nl +
 		"  Address: " + street + nl +
		"		          " + city+ ", "+ state +nl+ 
		"	              " + zip + nl +
		"  Age:	      " + age + nl + 
		"  Phone:     " + phone;
  }

  /** Write our data to a random access file */
  public long writeTo(RandomAccessFile f) throws IOException {
    long location = f.getFilePointer();
    f.writeUTF(name);
    f.writeUTF(street);
    f.writeUTF(city);
    f.writeUTF(state);
    f.writeInt(zip);
    f.writeInt(age);
    f.writeUTF(phone);
    return location;
  } 
  public void setName(String name) {
	  this.name=name;
  }
  public void setStreet(String street) {
	  this.street=street;
  }
  public void setCity(String city) {
	  this.city=city;
  }
  public void setState(String state) {
	  this.state=state;
  }
  public void setZip(int zip) {
	  this.zip=zip;
  }
  public void setAge(int age) {
	  this.age=age;
  }
  public void setPhone(String phone) {
	  this.phone=phone;
  }
  public String getName() {
	  return name;
  }
  public String getStreet() {
	  return street;
  }
  public String getCity() {
	  return city;
  }
  public String getState() {
	  return state;
  }
  public int getZip() {
	  return zip;
  }
  public int getAge() {
	  return age;
  }
  public String getPhone() {
	  return phone;
  }
}

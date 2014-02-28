package Exercise_8;
import java.io.*;

public class File {
	public static void main(String[] args) throws IOException {

		BufferedReader in = null;
		PrintWriter out = null;

		try {
			in = new BufferedReader(new FileReader("Arx_Origen"));
			out = new PrintWriter(new FileWriter("Arx_Destino"));
			String l;

			while ((l = in.readLine()) != null) {
				if(l.matches("^*$")){
					System.out.println("Espacio");
				}else{
					out.println(l);
				}
				
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
}

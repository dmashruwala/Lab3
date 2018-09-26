package scratch;
import java.io.*;
import java.util.Scanner;

public class Fasta {

	public static void main(String[] args) throws Exception {
		
		BufferedReader fasta = new BufferedReader(new FileReader(new File("C:\\Users\\dmash\\Desktop\\example.fasta")));
		BufferedWriter writefasta = new BufferedWriter(new FileWriter(new File("C:\\Users\\dmash\\Desktop\\fasta.txt")));
		
		writefasta.write("SequenceID\tnumA\tnumT\tnumC\tnumG\tSequence");
		
		for(String line = fasta.readLine(); line != null; line = fasta.readLine()) {
			if(line.startsWith(">")) {
				writefasta.write("\n" + line);
			}else {
				int a = 0;
				int g = 0;
				int t = 0;
				int c = 0;
				for(int i = 0; i < line.length(); i++) {
					if(line.charAt(i) == 'A') {
						a++;
					}else {
						if(line.charAt(i) == 'T') {
							t++;
						}else {
							if(line.charAt(i) == 'C') {
								c++;
							}else {
								if(line.charAt(i) == 'G') {
									g++;
								}
							}
						}
					}
				
			}
				writefasta.write("\t" + a);
				writefasta.write("\t" + t);
				writefasta.write("\t" + c);
				writefasta.write("\t" + g);
				writefasta.write("\t" + line);	
				}
		
		}
		writefasta.close();

	}

}

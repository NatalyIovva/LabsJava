import java.util.Scanner;

/*
 Dana stroka simvolov, mejdu slovami mojet biti proizvolinoe cislo probelov. Opredeliti soderjit li
 stroka identificatori iazika java. Vivesti na eckran identificatori i ih col-vo.
 */
/**
 * @author Alexandra Volos grupa Ia1703
 * 
 */
public class IdTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter a string: ");// priglashenie k vvodu stroki
		String line = scanner.nextLine();// scitivanie stroki
		String[] words = line.split("\\s+");// razbienie stroki na massiv iz slov razdelionih probelami
		Identifiers n = new Identifiers();
		n.checking(words);// proveriaem stroku na soderjanie identificatorov iazika java.
	    //n.print(words);// vivod soderjashihsia identificatorov
		scanner.close();
	}

}

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;


public class Identifiers {
	// massiv soderjasii spisok identificatorov
	//String[] Id; 
	/*= new String[] { "abstract", "asser", "boolean", "break", "byte", "case", "catch", "char", "class",
			"const", "continue", "default", "double", "do", "else", "enum", "extends", "final", "finally", "float",
			"for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native", "new",
			"package", "private", "protected", "public", "return", "short", "static", "strictfp", "super", "switch",
			"synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while" };*/
	//String str="[A-za-z]+\\d+";
	Pattern pattern = Pattern.compile("[A-za-z]+\\d+");
	// massiv kotorii buddet soderjati kol-vo slov
	List<String> Id = new ArrayList<String>();
	List<Integer> IdId = new ArrayList<Integer>();

	Identifiers() {
		/*for (int j = 0; j < Id.length; j++) {
			IdId.add(0);
		}*/
	}

	public void checking(String[] words) {
		for (int i = 0; i < words.length;i++) {
			if(words[i].matches("[A-za-z]+\\d+")) {
				//Id.add(words[i]);
				//IdId.add(0);
				System.out.println(words[i]);
			}
		}
	
		/*for (String j : words) {// prohodim po slovam vvedennoi stroki
			int k;
			for (int i = 0; i < words.length; i++) {
				if (j==Id.get(i)) {// proveriaem na sovpadenie slov.
					k = IdId.get(i) + 1;
					IdId.set(i, k);
				}
			}
		}*/
	}

	public void print() {
		for (int i = 0; i < Id.size(); i++) {
			if (IdId.get(i) != 0) {
				System.out.println(Id.get(i) + ":" + IdId.get(i));
			}
		}
	}
}

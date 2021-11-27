package methods.append;

public class Example {

	public static void main(String[] args) {
		String gfg[] = {"Aru", "you", "a", "programmer"}; 
		
		StringBuilder str = new StringBuilder();
		
		str.append(gfg[0]);
		str.append(" "+ gfg[1]);
		str.append(" "+ gfg[2]);
		str.append(" "+ gfg[3]);
		
		System.out.println(str);
		System.out.println(str.toString());
	}

}

package ahaas.cipher;

public class Test {
	
	public static void main(String[] args) {
		MonoAlphabeticCipher m1 = new MonoAlphabeticCipher();
		
		SubstitutionCipher s1 = new SubstitutionCipher("zyxvwutsrqponmlkjihgfedcbaz����");
		
		s1.setSecretAlphabet("vwutsrqponmlkjihgfedcbaz����");
0		
		String encrypted = m1.encrypt("hallo");
		
		System.out.println(encrypted);
		
		System.out.println(m1.decrypt(encrypted));
	}

}

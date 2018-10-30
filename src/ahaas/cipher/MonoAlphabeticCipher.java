package ahaas.cipher;

public class MonoAlphabeticCipher implements Cipher{
	
	private String secretAlphabet;
	
	public MonoAlphabeticCipher() {
		this.secretAlphabet = "abcdefghijklmnopqrstuvwxyzäöüß";
		
	}
	
	public String getSecretAlphabet() {
		return secretAlphabet;
	}
	
	protected void setSecretAlphabet(String secretAlphabet) {
		this.secretAlphabet = secretAlphabet;
	}

	@Override
	public String encrypt(String text) {
		text = text.toLowerCase();
		String result = "";
		for(int i = 0; i < text.length(); i++) {
			char clearCharacter = text.charAt(i);
			int ascii = (int)clearCharacter; 
			int alphabetPos = ascii - 97; 
			char secretCharacter = this.secretAlphabet.charAt(alphabetPos);
			result += secretCharacter; 
		}
		return result;
	}

	@Override
	public String decrypt(String text) {
		text = text.toLowerCase();
		String result = "";
		for(int i = 0; i < text.length(); i++) {
			char secretCharacter = text.charAt(i);
			int secretPos = this.secretAlphabet.indexOf(secretCharacter);
			int ascii = secretPos + 97; 
			result += (char)ascii;
		}
		return result;
	}
	
/*	private int getCharPosInSecrectAlphabet(char input) {
		
		for(int i = 0; i < this.secretAlphabet.length(); i++) {
			if (input == this.secretAlphabet.charAt(i)) {
				return i;
			}
		}
		
		return -1;
		
		
	} */
	

	
	
}

public class Animal implements Nameable{
	private String Nickname;
	
	Animal(String nickname) {
		this.Nickname = nickname;
	};
	
	public void getName() {
		System.out.println("ANIMAL\nNickname: " + Nickname + "\n");
	}
}
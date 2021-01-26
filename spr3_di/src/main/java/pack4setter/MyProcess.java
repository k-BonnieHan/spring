package pack4setter;

public class MyProcess { //setter injection test
	private int nai;
	private String name;
	private ShowData showData;
	
	public void setNai(int nai) {
		this.nai = nai;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setShowData(ShowData showData) {
		this.showData = showData;
	}
	
	@Override
	public String toString() {
		return "이름은 " + name + ", 나이는 " + nai + 
				", 별명은 " + showData.toName() + 
				", 취미는 " + showData.toHobby();
	}
}

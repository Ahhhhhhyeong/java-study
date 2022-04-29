package prob3;

public class Sparrow extends Bird {
		
	@Override
	protected void fly() {
		if("짹짹이".equals(name)) {
			System.out.println("참새("+name+")가 날아다닙니다.");
		}
	}

	@Override
	protected void sing() {
		if("짹짹이".equals(name)) {
			System.out.println("참새("+name+")가 날아다닙니다.");
		}
	}

	@Override
	public String toString() {
		if("짹짹이".equals(name)) {
			return "참새의 이름은 " + name + " 입니다.";
		}
		return super.toString();
	}

	
}

package prob3;

import java.util.jar.Attributes.Name;

public class Duck extends Bird {	
	@Override
	protected void fly() {
		if("꽥꽥이".equals(name)) {
			System.out.println("오리("+name+")는 날지 않습니다.");
		}
		
	}

	@Override
	protected void sing() {
		if("꽥꽥이".equals(name)) {
			System.out.println("오리("+name+")가 소리내어 웁니다.");
		}
	}

	@Override
	public String toString() {
		if("꽥꽥이".equals(name)) {
			return "오리의 이름은 " + name + " 입니다.";
		}
		return super.toString();
	}
	
	

}

package june.spring.basic;

import june.spring.beans.HelloSpring5Bean01;
import june.spring.beans.HelloSpring5Bean02;

public class HelloSpring5App02 {

	// 세번째 사례
    // 인삿말을 한국어,영어,일본어로 출력하도록 기능 추가

    // 인터페이스 프로그래밍의 장점은
    // 객체간의 의존성을 낮출수 있는 것 이외에도
    // 특정 기능 호출시 통일된 방식을 사용할 수 있다는 것임

	
	public static void main(String[] args) {
		HelloSpring5Bean02 bean = new HelloSpring5Bean02();
		
		//bean.sayHelloKor("스프링5!!");
		//bean.sayHelloEng("Spring5!!");
		//bean.sayHelloJpn("スプリング5!!");
		
		bean.sayHelloKor("스프링5!!");
		bean.sayHelloEng("Spring5!!");
		bean.sayHelloJpn("スプリング5!!");

	}

}

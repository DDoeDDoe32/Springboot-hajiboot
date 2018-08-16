package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@RestController //이 클래스가 웹 애플리케이션에서 요청(request)을 받아들이는 컨트롤러 클래스임을 나타냅니다.
@EnableAutoConfiguration // 다양한 설정이 자동으로 수행되고 기존의 스프링 애플리케이션에 필요했던 설정 파일들이 필요 없게 됩니다.
public class App 
{
	@RequestMapping("/") // HTTP 요청을 받아들이는 메서드임을 나타냅니다.
	String home() {
		return "Hello Spring Boot test!"; // @RestController 애너테이션이 붙은 클래스에 속한 메서드에서
							   // 문자열을 반환하면 해당 문자열이 그대로 HTTP 응답이 되어 출력
	}

    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args); // 스프링 부트 애플리케이션을 실행하는 데 필요한 처리를 main() 메서드 안에 작성합니다.
    }
}

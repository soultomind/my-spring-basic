package com.springbasic.basic1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//컨트롤러로 사용하기 위한 SPRING 어노테이션
@Controller
public class RequestMappingController {
	
	private static final Logger logger = LoggerFactory.getLogger(RequestMappingController.class);
	
	/***
	 * 
	 * @param request
	 * @param response
	 * @return 뷰 파일명(확장자를 제외)
	 */
	@RequestMapping(value = {"/request"}, method = { RequestMethod.GET } )
	/* @RequestMapping 아래 request 메서드에 대한 요청 매핑에 대한 정보를 가지고 있습니다.
	 * value = 매핑 주소
	 * method = 요청 방법
	 * 
	 * 현재 @RequestMapping 선언된 정보라면 매핑주소는 아래와 같으면 GET 요청으로만 호출이 가능합니다.
	 * 매핑 주소 : http://localhost:8080/basic1/request
	 * 
	 * 서버주소 생략
	 * 현재 해당 프로젝트에서는 /basic1/request로 요청이 되면 해당 메서드와 연결된다. (/ContextRoot + 매핑주소)
	 * 연결되는 메서드의 이름은 중요하지 않습니다.
	 *  
	 * SPRING에서는 내부적으로 매핑주소(value)를 아래의 request 메서드로 매핑을 시킵니다.
	 * org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping
	 */
	public String request(HttpServletRequest request, HttpServletResponse response) {
		
		logger.info("request");
		
		/*
		 * 리턴값은 WEB-INF/views/ 안에 존재하는 뷰 파일명(확장자를 제외)을 명시합니다.
		 * 
		 * 파일을 찾는 기준은 WEB-INF/spring/appServlet/servlet-context.xml 파일에
		 * <beans:bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		 * </beans:bean>
		 * 
		 * 이다. 즉 prefix + 뷰 파일명 + suffix 값을 조합하여 뷰 파일을 찾는다.
		 * 
		 * 해당 메서드의 리턴 타입이 없을때(즉 void 일 경우) /request 에 해당하는 뷰 이름을 찾는다 (WEB-INF/views/request.jsp)
		 */
		
		return "requestMapping";
	}
	
}

# my-sts-spring-basic
나의 스프링 기초   
먼저 STS 로 스프링의 기초를 잡는다.   

## .gitignore
아래의 주소에서 Maven,Java,Windows,Eclipse 항목을 추가후 생성
https://www.toptal.com/developers/gitignore   

생성된 내용을 .gitignore 파일에 추가

## Workspace 기본설정 구성
처음 프로젝트 생성후   
##### Window/Preferences/Spring/Template Projects

spring-defaults 항목만 남기고 모두 제거 후   

##### Apply and Close   
</br>

+ 파일 인코딩 UTF-8 설정
Window/Preferences/type filter text -> encoding   
General/Workspace   
Web/CSS Files, HTML Files, JSP Files   
XML/XML Files




## 프로젝트 구성
+ 인코딩 필터 설정
src/main/webapp/WEB-INF/web.xml
```
<servlet-mapping>
	<servlet-name>appServlet</servlet-name>
	<url-pattern>/</url-pattern>
</servlet-mapping>

<!-- 인코딩 필터 설정 -->
<filter>
	<filter-name>encodingFilter</filter-name>
	<filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
	<init-param>
		<param-name>encoding</param-name>
		<param-value>UTF-8</param-value>
	</init-param>
	<init-param>
		<!-- 요청,응답 모두 인코딩 처리 -->
		<param-name>forceEncoding</param-name>
		<param-value>true</param-value>
	</init-param>
</filter>
```

</br>

### Basic1

##### 1. RequestMapping 애너테이션   

RequestMappingController.java
```
@RequestMapping(value = {}, method = { RequestMethod.GET})
```

RequestMapping 애너테이션 기능이 개선된 애너테이션은 아래와 같습니다.

+ @DeleteMapping
+ @GetMapping
+ @PatchMapping
+ @PostMapping
+ @PutMapping

SPRING 4.3 버전부터 사용이 가능합니다. 

</br>
</br>
</br>
추후에 Intelij 로 해당 프로젝트 그대로 이관작업 예정

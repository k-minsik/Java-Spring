 # 스프링 MVC 1편 - 백엔드 웹 개발 핵심 기술

 ## 1. 웹 애플리케이션의 이해
 - 웹서버, 웹 애플리케이션
   - Web serber, WAS, DB
   - 정적, 동적, 애플리케이션 로직

- 서블릿
  - HTTP 응답, 요청
  - 서블릿 컨테이너
  - 톰캣, WAS
  - 싱클톤, 멀티 쓰레드

- 멀티 쓰레드
  - 쓰레드, 쓰레드 풀, Max Thread
  - WAS가 처리

- HTML, HTTP API, SSR, CSR
  - 정적 리소스
  - JSON, UI 클라이언트 접점, 서버 to 서버
  - 서버 사이드 렌더링
  - 클라이언트 사이드 렌더링

- 자바 백엔드 웹 기술 역사
  - 서블릿, JSP, MVC
  - 스프링 MVC, 스프링 부트
  - 스프링 웹 플럭스
  - 타임리프

## 2. 서블릿
- 스프링 부트 환경에서 서블릿 등록/사용
- HttpServerRequest
  - Http 요청 데이터
    - GET - 쿼리 파라미터
    - POST - HTML Form
      - PostMan
    - HTTP message body
      - JSON, Text
- HttpServerResponse
  - Http 응답 데이터
    - 단순 텍스트, HTML
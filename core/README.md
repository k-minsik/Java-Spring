# 1. 예제 만들기
## 비지니스 요구사항과 설계
- 회원
- 주문과 할인 정책
# 2. 객체 지향 원리 적용
## 새로운 할인 정책 개발

# 3. 스프링 컨테이너와 스프링 빈
- ApplicationContext 를 스프링 컨테이너라 한다.
- 스프링 컨테이너는 XML을 기반으로 만들 수 있고, 애노테이션 기반의 자바 설정 클래스로 만들 수 있다.
- 스프링 컨테이너를 생성할 때는 구성 정보를 지정해주어야 한다.
- 여기서는 `AppConfig.class` 를 구성 정보로 지정했다.
- 스프링 컨테이너는 파라미터로 넘어온 설정 클래스 정보를 사용해서 스프링 빈을 등록한다.
- 스프링 컨테이너는 설정 정보를 참고해서 의존관계를 주입(DI)한다.


# 4. 싱글톤 컨테이너
- 웹 애플리케이션과 싱글톤
- 싱글톤 패턴
- 싱글톤 패턴 문제점
- 싱글톤 컨테이너
- 싱글톤 방식의 주의점
- Configuration과 바이트코드 조작

# 5. 컴포넌트 스캔
- `@Autowired`
- `@ComponentScan`, `@Component`
  - `@Component`, `@Controller`, `@Service`, `@Repository`, `@Configuration`

# 6. 의존관계 자동 주입
- 생성자 주입
- 수정자 주입 (setter 주입)
- 필드 주입
  - `사용하지 말자`
- 일반 메서드 주입
- 옵션 처리
- 생성자 주입을 선택해라
- 롬복과 최신 트랜드
  - `Getter`, `Setter`
  - `ToString`
  - `RequiredArgsConstructor`
- 조회 빈이 2개 이상 - 문제
  - `@Qualifier("beanName")`
  - `@Primary`
- 조회한 빈이 모두 필요할 때, List, Map
- 자동, 수동의 올바른 실무 운영 기준

# 7. 빈 생명주기 콜백 시작
- 스프링 빈의 이벤트 라이프 사이클
- 객체의 생성과 초기화를 분리하자

- 인터페이스 InitializingBean, DisposableBean
- 빈 등록 초기화, 소멸 메서드 지정
  - `@Bean(initMethod = "init", destroyMethod = "close")` 
- 애노테이션 `@PostConstruct`, `@PreDestroy`

# 8. 빈 스코프
- 싱글톤
- 프로토타입
- request, session, application

- 프로토타입 스코프 - 싱글톤 빈과 함께 사용시 문제점
- ObjectFactory, ObjectProvider
- 웹 스코프
  - request, session, application, websockect
- 웹 코프와 프록시 동작 원리
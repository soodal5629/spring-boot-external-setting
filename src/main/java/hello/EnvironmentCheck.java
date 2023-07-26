package hello;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Slf4j
@Component
public class EnvironmentCheck {
    // 외부 설정(os 환경변수, java 시스템 속성, 커맨드 라인(옵션)인수)을 읽는 방법을 추상화함
    private final Environment env;

    public EnvironmentCheck(Environment env) {
        this.env = env;
    }

    @PostConstruct
    public void init() {
        String url = env.getProperty("url");
        String username = env.getProperty("username"); // java 시스템 속성
        String password = env.getProperty("password"); // java 시스템 속성
        String user = env.getProperty("user"); // 커맨드 라인 옵션 인수
        String javaHome = env.getProperty("JAVA_HOME"); // OS 환경변수
        log.info("env url = {}", url);
        log.info("env username = {}", username);
        log.info("env password = {}", password);
        log.info("env user = {}", user);
        log.info("env javaHome = {}", javaHome);

    }

}

package hello.external;

import lombok.extern.slf4j.Slf4j;

import java.util.Properties;

@Slf4j
public class JavaSystemProperties {
    public static void main(String[] args) {
        // 자바 시스템 속성 추가도 가능 but 외부로 설정 분리하는 효과는 X
        // System.setProperty("test", "Test");

        // java 시스템 속성 조회
        // OS 시스템 환경변수와 다르게 해당 프로그램에서만 사용 가능한 속성들임
        Properties properties = System.getProperties();
        for (Object key : properties.keySet()) {
            log.info("pro {} = {}", key, System.getProperty(String.valueOf(key)));
        }

        String url = System.getProperty("url");
        String username = System.getProperty("username");
        String password = System.getProperty("password");

        log.info("url={}", url);
        log.info("username={}", username);
        log.info("password={}", password);
    }
}

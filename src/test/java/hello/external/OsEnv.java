package hello.external;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Slf4j
public class OsEnv {

    public static void main(String[] args) {
        // OS 시스템 환경변수를 다 읽어들일 수 있음
        Map<String, String> envMap = System.getenv();
        for (String key : envMap.keySet()) {
            // log.info("env {}={}", key, envMap.get(key));
            log.info("env {}={}", key, System.getenv(key));
        }
    }
}

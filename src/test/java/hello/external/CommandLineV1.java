package hello.external;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CommandLineV1 {
    public static void main(String[] args) {
        // key-value 형식이 아님 => 통 문자임
        for (String arg : args) {
           log.info("arg = {}", arg);
        }
    }
}

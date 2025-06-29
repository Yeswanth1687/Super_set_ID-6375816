xml
CopyEdit
<dependencies>
    <!-- SLF4J API -->
    <dependency>
        <groupId>org.slf4j</groupId>
        <artifactId>slf4j-api</artifactId>
        <version>1.7.30</version>
    </dependency>

    <!-- Logback: SLF4J implementation -->
    <dependency>
        <groupId>ch.qos.logback</groupId>
        <artifactId>logback-classic</artifactId>
        <version>1.2.3</version>
    </dependency>
</dependencies>

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerDemo {

    private static final Logger logger = LoggerFactory.getLogger(LoggerDemo.class);

    public static void main(String[] args) {
        logger.info("Application started");

        try {
            simulateBusinessLogic();
        } catch (Exception e) {
            logger.error("An exception occurred: {}", e.getMessage(), e);
        }

        logger.warn("Application is using deprecated configuration");
        logger.info("Application finished");
    }

    private static void simulateBusinessLogic() throws Exception {
        logger.debug("Simulating business logic...");

        // Simulating a failure
        throw new Exception("Simulated database failure");
    }
}
<configuration>
    <appender name="STDOUT" class="ch.qos.logback.core.ConsoleAppender">
        <encoder>
            <pattern>%date [%level] %logger - %msg%n</pattern>
        </encoder>
    </appender>

    <root level="debug">
        <appender-ref ref="STDOUT" />
    </root>
</configuration>


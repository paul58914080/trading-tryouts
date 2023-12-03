package trading.camunda.boot;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableProcessApplication
public class TradingCryptoApplication {

  public static void main(String[] args) {
    SpringApplication.run(TradingCryptoApplication.class, args);
  }
}
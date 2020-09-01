package prime.vqnrestclient.vqnrestclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class VqnrestclientApplication {

    private static final Logger log = LoggerFactory.getLogger(VqnrestclientApplication.class) ;

    public static void main(String[] args) {
        SpringApplication.run(VqnrestclientApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            Customer customer =
                    restTemplate.getForObject(
"http://dcwebapp01:8087/newGen/customer/fetchByCifNo?cifNo=10068775",
                            Customer.class
                    ) ;
            log.info(customer.toString());
        } ;
    }
}
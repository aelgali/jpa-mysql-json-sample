package net.elgali.jpamysqljson;

import net.elgali.jpamysqljson.repo.ItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpamysqljsonApplication {

  public static void main(String[] args) {
    SpringApplication.run(JpamysqljsonApplication.class, args);
  }


  @Bean
  CommandLineRunner commandLineRunner(ApplicationContext context) {
    return args -> {
      ItemRepository itemRepository = context.getBean(ItemRepository.class);

      itemRepository.findAll().forEach(item -> {

        String itemResult = String
            .format("Item Id: %s, \t Title: %s, \t Description: %s, \t Price: %s", item.getId(),
                item.getTitle(), item.getDescription(), item.getPrice());

        itemResult.chars().forEach(c -> System.out.print("="));
        System.out.println();

        System.out.println(itemResult);

        System.out.println();
        itemResult.chars().forEach(c -> System.out.print("="));
      });
    };
  }

}


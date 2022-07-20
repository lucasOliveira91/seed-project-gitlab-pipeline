package seedts.springbootsample.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.vault.core.VaultTemplate;
import org.springframework.vault.support.VaultResponseSupport;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import seedts.springbootsample.Credentials;
import seedts.springbootsample.SampleApplication;

@RestController
public class HelloController {


  @Autowired
  private Environment env;

  @GetMapping
  public String helloWorld() {
    String path = env.getProperty("cred.user");
    String pass = env.getProperty("cred.password");

    return "It's working! Hello World " + path + "  " + pass;
  }

}

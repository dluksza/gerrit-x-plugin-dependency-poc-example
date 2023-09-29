package org.luksza.gerrit;

import com.google.inject.Inject;

public class Greet {
  @Inject
  public Greet(GreetingsService greetingsService) {
    greetingsService.greet("R2D2!");
  }
}

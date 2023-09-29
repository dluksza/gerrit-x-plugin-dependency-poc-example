package org.luksza.gerrit;

import com.google.inject.AbstractModule;

public class ConsumerModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(Greet.class).asEagerSingleton();
  }
}

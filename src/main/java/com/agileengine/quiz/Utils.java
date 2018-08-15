package com.agileengine.quiz;

import java.io.File;
import org.springframework.stereotype.Component;

@Component
public class Utils {

  public File getFile(String fileName) {

    ClassLoader classLoader = getClass().getClassLoader();
    return new File(classLoader.getResource(fileName).getFile());

  }

}

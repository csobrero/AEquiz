package com.agileengine.quiz;

import static org.junit.Assert.assertTrue;
import java.io.File;
import java.io.IOException;
import java.util.Optional;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class CrawlerTest {

  @Autowired
  private Utils utils;

  @Autowired
  private CrawlerService service;

  @Test
  public void html0_test() throws IOException {

    File input = utils.getFile("pages/sample-0-origin.html");
    String text = "Make everything OK";
    Optional<Element> element = service.retrieveElementWithTextFrom(text, input);
    assertTrue(element.isPresent());
    System.out.println("##### Found TAG 0:: " + element.get() + "#####");
  }

  @Test
  public void html1_test() throws IOException {

    File input = utils.getFile("pages/sample-1-evil-gemini.html");
    String text = "Make everything OK";
    Optional<Element> element = service.retrieveElementWithTextFrom(text, input);
    assertTrue(element.isPresent());
    System.out.println("##### Found TAG 1:: " + element.get() + "#####");
  }

  @Test
  public void html2_test() throws IOException {

    File input = utils.getFile("pages/sample-2-container-and-clone.html");
    String text = "Make everything OK";
    Optional<Element> element = service.retrieveElementWithTextFrom(text, input);
    assertTrue(element.isPresent());
    System.out.println("##### Found TAG 2:: " + element.get() + "#####");
  }

  @Test
  public void html3_test() throws IOException {

    File input = utils.getFile("pages/sample-3-the-escape.html");
    String text = "Do anything Perfect";
    Optional<Element> element = service.retrieveElementWithTextFrom(text, input);
    assertTrue(element.isPresent());
    System.out.println("##### Found TAG 3:: " + element.get() + "#####");

  }

  @Test
  public void html4_test() throws IOException {

    File input = utils.getFile("pages/sample-4-the-mash.html");
    String text = "Make everything OK";
    Optional<Element> element = service.retrieveElementWithTextFrom(text, input);
    assertTrue(element.isPresent());
    System.out.println("##### Found TAG 4:: " + element.get() + "#####");

  }

}

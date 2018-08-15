package com.agileengine.quiz;

import java.io.File;
import java.io.IOException;
import java.util.Optional;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

@Service
public class CrawlerService {

  public Optional<Element> retrieveElementWithTextFrom(String text, File input) throws IOException {
    Document doc = Jsoup.parse(input, "UTF-8");

    Elements elements = doc.getElementsContainingOwnText(text);

    for (Element element : elements) {
      if (element.attr("class").contains("btn") && !element.attr("href").contains("incorrect")) {
        return Optional.of(element);
      }
    }

    return Optional.empty();
  }

}

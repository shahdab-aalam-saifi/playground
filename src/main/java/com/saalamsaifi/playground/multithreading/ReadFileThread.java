package com.saalamsaifi.playground.multithreading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.MessageFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ReadFileThread implements Runnable {
  private final List<String> lines;
  private final String fileName;

  public ReadFileThread(String fileName) {
    this.fileName = fileName;
    this.lines = new ArrayList<>();
  }

  public List<String> getLines() {
    return lines;
  }

  public String getFileName() {
    return fileName;
  }

  @Override
  public void run() {
    InputStream stream = Object.class.getResourceAsStream(this.fileName);
    var buffer = new BufferedReader(new InputStreamReader(stream));

    try {
      String line = null;

      while ((line = buffer.readLine()) != null) {
        String s =
            MessageFormat.format(
                "{0} {1} {2}",
                ZonedDateTime.now().format(DateTimeFormatter.ISO_INSTANT),
                Thread.currentThread().getName(),
                line);
        lines.add(s);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

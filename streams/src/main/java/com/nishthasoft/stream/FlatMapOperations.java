package com.nishthasoft.stream;

import java.io.IOException;
import java.net.URI;
import java.nio.file.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapOperations {

    public static void main(String[] args) {

        Stream<String> a = Stream.of("Hello ", "there");
        Stream<String> b = Stream.of("Learning ", "Java?");
        Stream<Stream<String>> of = Stream.of(a,b);

        Stream.of(a,b)
                .flatMap(e -> e).collect(Collectors.toList());

        Path p = Paths.get("/Volumes/My Files/nishtha-learnings/RFCG/TheNoteBook.rtf");
        try (Stream<String> notebook = Files.lines(p);) {

            List<String> collect = notebook.flatMap(line -> Arrays.stream(line.split(" ")))
                    .collect(Collectors.toList());

            collect.forEach(System.out::println);

        }catch (IOException e) {
            System.out.println(e);
        }




    }
}

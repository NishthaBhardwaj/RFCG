package com.nishthasoft.streamfromcustomesource;

import com.nishthasoft.beforejava8.Book;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class ReadingObjectFromFile {

    public static void main(String[] args) {

        Path path = Paths.get("/Volumes/My Files/nishtha-learnings/RFCG/book.rtf");
        try(Stream<String> lines = Files.lines(path)){

            Spliterator<String> baseSpliterator = lines.spliterator();
            Spliterator<Book> spliterator = new BookSpliterator(baseSpliterator);
            StreamSupport.stream(spliterator,false)
                    .forEach(System.out :: println);

        }catch (IOException e){
            System.out.println(e);
        }
    }


}

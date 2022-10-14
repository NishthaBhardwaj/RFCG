package com.nishthasoft.streamfromcustomesource;

import com.nishthasoft.beforejava8.Book;

import java.util.Spliterator;
import java.util.function.Consumer;

public class BookSpliterator implements Spliterator<Book> {

    private String name;
    private String Author;
    private String genre;
    private double rating;
    private Spliterator<String> baseSpilerator;

    public BookSpliterator(Spliterator<String> baseSpilerator) {
        this.baseSpilerator = baseSpilerator;
    }

    @Override
    public boolean tryAdvance(Consumer<? super Book> action) {
        if (this.baseSpilerator.tryAdvance(name -> this.name = name) &&
        this.baseSpilerator.tryAdvance(author -> this.Author = author) &&
        this.baseSpilerator.tryAdvance(genre -> this.genre = genre) &&
        this.baseSpilerator.tryAdvance(rating -> this.rating = Double.valueOf(rating))){
            action.accept(new Book(this.name, this.Author, this.genre, this.rating));
            return true;
        }

        return false;
    }

    @Override // we do need to implement is as we do not want to process parallel  so just return null
    public Spliterator<Book> trySplit() {
        return null;
    }
/*
// this size of the stream that is going to be created so if I talk about of baseSpitlerator it reads line
by line so as per our file it will genrate a stream for 24 elements
and this BookSpliterator read book by book and one book contain 4 lines so that why the size of Bookspilerator
the size of line spilerator / 4 .
 */
    @Override
    public long estimateSize() {
        return baseSpilerator.estimateSize()/4;
    }

    @Override
    public int characteristics() {
        return baseSpilerator.characteristics();
    }
}

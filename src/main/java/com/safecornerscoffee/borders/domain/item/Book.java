package com.safecornerscoffee.borders.domain.item;

import com.safecornerscoffee.borders.domain.item.Item;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("B")
@NoArgsConstructor
@Getter
@Setter
public class Book extends Item {

    private String author;
    private String isbn;

    public Book(String name, int price, int stockQuantity) {
        this.setName(name);
        this.setPrice(price);
        this.setStockQuantity(stockQuantity);
    }

    @Builder
    public Book(String name, int price, int stockQuantity, String author, String isbn) {
        this.setName(name);
        this.setPrice(price);
        this.setStockQuantity(stockQuantity);
        this.setAuthor(author);
        this.setIsbn(isbn);
    }
}

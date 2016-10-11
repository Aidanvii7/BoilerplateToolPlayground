package com.crazybanana.lombokplayground.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.crazybanana.lombokplayground.R;
import com.crazybanana.lombokplayground.model.Flower;
import com.crazybanana.lombokplayground.model.Person;
import com.crazybanana.lombokplayground.model.Product;

public class LombokActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saveProduct(ProductUpdate());
        saveFlowers(FlowerUpdate());
        savePerson(PersonUpdate());
    }

    private Product ProductUpdate() {
        return new Product(0, "name", "description", "image");
    }

    // Using builder annotation on the class
    private Product saveProduct(Product product) {
        return Product.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .imageUrl(product.getImageUrl())
                .build();
    }

    private Flower FlowerUpdate() {
        return new Flower(0, 20, "rose", "red");
    }

    //without using the builder annotation
    private Flower saveFlowers(Flower flowerPar) {
        Flower flower = new Flower();
        flower.setId(flowerPar.getId());
        flower.setColor(flowerPar.getColor());
        flower.setLength(flowerPar.getLength());
        flower.setType(flowerPar.getType());
        return flower;
    }

    private Person PersonUpdate() {
        return new Person(0, 20);
    }

    // Using builder annotation on the constructor
    private Person savePerson(Person person) {
        return  Person.builder()
                .id(person.getId())
                .age(person.getAge())
                .build();
    }
}
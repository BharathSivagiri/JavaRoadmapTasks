package Week_5.AnnotationsWeek5;

import java.lang.annotation.*;

// Define the container annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Authors
{
    Author[] value();
}

// Define the repeatable annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(Authors.class)
@interface Author
{
    String name();
}

@Author(name = "Alice")
@Author(name = "Bob")
@Author(name = "Charlie")
public class RepetableExample
{
    public static void main(String[] args)
    {
        Author[] authors = RepetableExample.class.getAnnotationsByType(Author.class);
        System.out.println("Authors of RepetableExample:");
        for (Author author : authors)
        {
            System.out.println(author.name());
        }
    }
}


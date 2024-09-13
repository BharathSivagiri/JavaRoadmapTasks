package Week_5.AnnotationsWeek5;

import java.lang.annotation.*;

// Define the container annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Authorss
{
    Author2[] value();
}

// Define the repeatable annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(Authorss.class)
@interface Author2
{
    String name();
}

@Author2(name = "Alice")
@Author2(name = "Bob")
@Author2(name = "Charlie")
public class DocumentedExample
{
    public static void main(String[] args)
    {
        Author2[] authors = RepetableExample.class.getAnnotationsByType(Author2.class);
        System.out.println("Authors of RepetableExample:");
        for (Author2 author : authors)
        {
            System.out.println(author.name());
        }
    }
}



# Java Currency Formatter

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

A Java abstract class is a class that can't be instantiated. That means you cannot create new instances of an abstract class. It works as a base for subclasses. You should learn about Java Inheritance before attempting this challenge. 

Following is an example of abstract class:

```java
abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
```

If you try to create an instance of this class like the following line you will get an error:

```java
Book new_novel=new Book(); 
```
    
You have to create another class that extends the abstract class. Then you can create an instance of the new class. 

Notice that *setTitle* method is abstract too and has no body. That means you must implement the body of that method in the child class.

In the editor, we have provided the abstract *Book* class and a *Main* class. In the Main class, we created an instance of a class called *MyBook*. Your task is to write just the *MyBook* class. 

Your class mustn't be public.

**Sample Input**

    A tale of two cities

**Sample Output**

    The title is: A tale of two cities


**Input Format**

 

**Constraints**

 

**Output Format**

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-31T17:49:47.857Z  

```java
import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // 1. Define the Locales for each required country
        Locale usLocale = Locale.US;
        Locale chinaLocale = Locale.CHINA;
        Locale franceLocale = Locale.FRANCE;
        
        // 2. Initialize NumberFormat objects
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(usLocale);
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(chinaLocale);
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(franceLocale);
        
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        DecimalFormatSymbols indiaSymbols = new DecimalFormatSymbols();
        indiaSymbols.setCurrencySymbol("Rs.");
        indiaSymbols.setMonetaryDecimalSeparator('.');
        ((DecimalFormat) indiaFormat).setDecimalFormatSymbols(indiaSymbols);
        
        // 4. Format the numerical inputs into language strings
        String us = usFormat.format(payment);
        String india = indiaFormat.format(payment);
        String china = chinaFormat.format(payment);
        String france = franceFormat.format(payment);
        
        // 5. Output values matching requirements exactly
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/java-abstract-class/problem)
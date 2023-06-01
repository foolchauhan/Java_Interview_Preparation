---
date: 2023-05-30 08:00:00 +0530
layout: post
title: Java Concepts - Pat 1
subtitle: Java is call by Value
description: Java is call by value
image: /assets/img/how-to-meditate.jpg
optimized_image: /assets/img/how-to-meditate.jpg
category: code
tags:
  - code
  - java
author: chetanchauhan
my_prop: 'nil'
---
<h1>Call by Value & Call by Reference</h1>
Variables play an important role in computer programming because they enable programmers to write flexible programs. **A very important aspect that we need to keep in mind with variables is when we pass variables them as arguments to a function**.
Let's explore what happens when the caller of a function **passes arguments to the callee by value and by reference.**
<h3>Call by Value</h3>
In Java, when we send primitive data types as argument to a function, it is sent as call by value. **When we pass a parameter by value, the caller and callee have two independent variables with the same value**. Therefore, if the callee modifies its variable, the effect is not visible to the caller. 
PS. - Primitive data types (_int_, _byte_, _short_, _long_, _float_, _double_, _boolean_ and _char_ ). _**They're stored directly on the stack**
![[call_by_value.png]]
<i>Example :: </i>
```java
Int x = 10; // Primitive Data
modify(x); 
System.out.print(x);  // OUTPUT: 10 
public void modify( int data ) {
	data = 20;
}
int x = 10;    // Stored in Stack
int data = 10; // Stored in Stack 
data = 20;     // It has no impact on "x
```

<h3>Call by Reference</h3>
When we pass a variable by reference, the parameter inside the callee refers to the same object that the caller passed. As a consequence, **any change operated by the callee on the object will be seen by the caller as well**.

In other words, **when a parameter is passed by reference, the caller and the callee use the same variable**. If the function being called modifies this variable, the effect is visible to the caller’s variable.
![Alt text](resources/call_by_reference.png)
```java
Rectangle f1 = new rectangle(); // Object:Reference Type
r1.length = 10;
modify(r1);
System.out.println(r1.length);   // OUTPUT : 20

public void modify( Rectangle r2 ) {
	r2.length = 20;
}
```

<h1>Conclusion</h1>
The parameter passing in Java is always **Pass-by-Value**. However, the context changes depending upon whether we're dealing with ***Primitives*** or ***Objects***:

1.  For Primitive types, parameters are pass-by-value
2.  For Object types, the object reference is pass-by-value
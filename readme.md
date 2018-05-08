##Tutorial for Java programming.

### References:
http://docs.oracle.com/javase/tutorial/java/concepts/index.html

## Object
An object is a software bundle of related state and behavior.
Software objects are often used to model the real-world objects that you find in
everyday life.

## Class
A class is a blueprint or prototype from which objects are created

## Inheritance
Inheritance provides a powerful and natural mechanism for organizing and
structuring your software.

## Interface
An interface is a contract between a class and the outside world. When a class
implements an interface, it promises to provide the behavior published by that
interface.

## Package
A package is a namespace for organizing classes and interfaces in a logical
manner. Placing your code into packages makes large software projects easier to
manage.

## Modularity: 
The source code for an object can be written and maintained 
independently of the source code for other objects. Once created, an object can 
be easily passed around inside the system.

## Information-hiding: 
By interacting only with an object's methods, the details of its internal 
implementation remain hidden from the outside world.

## Code re-use: 
If an object already exists (perhaps written by another software developer), you 
can use that object in your program. This allows specialists to 
implement/test/debug complex, task-specific objects, which you can then trust to 
run in your own code.

## Java Versions

### Java 10
JSR 383, what's new

##### Language changes:

Local variable type inference (var keyword)

### Java 9
JSR 379, what's new

##### Language changes:

further continuation of Project Coin (small language improvements)
##### Library changes:

Java Platform Module System (jigsaw)
modularization of the platform itself
makes modules a first-class citizen meant to replace the messy classpath with modules with real dependency information
##### Other changes:

People seem to have gotten over the 1.x naming convention, almost no one calls this "Java 1.9".
Java 8 (a.k.a 1.8)
JSR 337, what's new

##### Language changes:

lambda expressions (JSR 335, includes method handles)
continuation of Project Coin (small language improvements)
annotations on Java types
Library changes:

Improved Date and Time API

### Java 7 (a.k.a 1.7)
JSR 336, features and enhancements

##### Language changes:

Project Coin (small changes)
switch on Strings
try-with-resources
diamond operator
##### Library changes:

new abstracted file-system API (NIO.2) (with support for virtual filesystems)
improved concurrency libraries
elliptic curve encryption
more incremental upgrades
##### Platform changes:
support for dynamic languages

### Java 6 (a.k.a 1.6)
JSR 270. features and enhancements

Mostly incremental improvements to existing libraries, no new language features (except for the @Override snafu).

### Java 5 (a.k.a 1.5)
JSR 176, features and enhancements

##### Language Changes:

generics (that's the big one)
annotations
enum types
varargs, enhanced for loops (for-each)
Library changes:

concurrency utilities in java.util.concurrent

### Java 1.4
JSR 59

##### Language changes:

the assert keyword
Library changes:

regular expressions support
NIO
integrated XML handling

### Java 1.3
Mostly minor improvements, really.

##### Platform changes:

HotSpot JVM: improvement over the original JIT

### Java 1.2
##### Language changes:

the strictfp keyword
##### Library changes:

a unified collections system
Swing as a new UI-System on top of AWT
##### Platform changes

a real JIT, greatly improving speed

### Java 1.1
##### Language changes:

inner classes
Library changes:

AWT event changes
JDBC, RMI
reflection

### Java 1.0
Initial release, everything is new


## Questions
#### Q) Why multiple inheritance is not supported in java?
To reduce the complexity and simplify the language, multiple inheritance is not supported in java.

Consider a scenario where A, B and C are three classes. The C class inherits A and B classes. If A and B classes have same method and you call it from child class object, there will be ambiguity to call method of A or B class.

Since compile time errors are better than runtime errors, java renders compile time error if you inherit 2 classes. So whether you have same method or different, there will be compile time error now.

#### 
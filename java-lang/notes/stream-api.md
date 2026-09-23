# Stream API

The JAVA Stream API is a way to process collections of data in a declarative, pipeline-like style.
Think of stream API as a pipeline

## Parts of stream API

### Source

Source is where data comes from.

```java
numbers.stream();
Arrays.stream(array);
Stream.of(1,2,3);
```

### Intermediate Operations

These transform the stream.

```java
filter()
map()
sorted()
distinct()
limit()
skip()
```

### Terminal Operations

These operations consume the stream

```java
toList()
count()
forEach()
reduce()
findFirst()
anyMatch()
allMatch()
```
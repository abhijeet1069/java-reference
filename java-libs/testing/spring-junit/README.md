# Spring JUnit

```text
                    What to use?
                         │
             ┌───────────┴───────────┐
             │                       │
       Pure Java logic          Spring behavior
             │                       │
       normal JUnit          ┌───────┼────────┐
                             │       │        │
                          MVC     JPA      Everything
                             │       │        │
                      @WebMvcTest @DataJpaTest @SpringBootTest
```
# Exercise 5 — Comment Rescue

Below is a working method with no comments. It runs fine. It is also very hard to understand.

```java
public static double calc(double p, int y, double r) {
    double t = p;
    for (int i = 0; i < y; i++) {
        t = t + (t * r);
    }
    return t - p;
}
```

## Part A — Figure out what it does

**1. What do you think `p`, `y`, and `r` represent?**

p = starting amount
y = how many times the loop runs, which represents years
r = rate being applied to the money

**2. What does the method return?**

The method returns the total interest earned after the given number of years.

**3. What would you rename each variable and the method itself?**

| Original | Better name |
|---|---|
| `calc` |CalculateIntrestEarned |
| `p` | principal |
| `y` |years |
| `r` | intrestRate|
| `t` | totalAmount|

## Part B — Rewrite it

Rewrite the method with better names **and** comments. Remember the rule:

> **Bad comments explain *what*. Good comments explain *why*.**

```java
// public static double calculateInterestEarned(double principal, int years, double interestRate) {
    double totalAmount = principal;

    // Compound interest is calculated each year so the interest also earns interest.
    for (int year = 0; year < years; year++) {
        totalAmount = totalAmount + (totalAmount * interestRate);
    }

    // Subtract the original amount so the method returns only the interest earned.
    return totalAmount - principal;
}
```

## Part C — Reflect

**Which helped a future reader more — the better variable names, or the comments? Defend your answer in two or three sentences.**

I think the better variable names helped a future reader more than the comments. Names like `principal`, `years`, and `interestRate` make the code easier to understand without needing extra explanations. The comments are still helpful because they explain why certain calculations are being done.


> There's no single right answer here. Most professionals would say good names reduce the *need* for comments, and comments should then explain the things names can't — assumptions, edge cases, and why a decision was made.

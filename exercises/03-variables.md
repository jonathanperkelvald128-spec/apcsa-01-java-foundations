# Exercises 8 & 10 — Types

## Exercise 8 — Type Detective

For each value, pick the best Java type and justify it in **one sentence.** The justification is the point of the exercise.

| # | Value to store | Type | Why |
|---|---|---|---|
| 1 | Movie Name | String| Prisoners |
| 2 | Movie Summary | String  |phe Frantic searcg for 2 |
| 3 | Whether a student is enrolled |boolean |because its true or false |
| 4 | A student's middle initial |char |because its a single character  |
| 5 | A phone number | string|there are charcters besides just number |
| 6 | The population of New York City |int |people counted as whole number |
| 7 | A test score out of 100 |int or double  | |
| 8 | A GPA |double  | |
| 9 | Whether it is currently raining | | |
| 10 | A student ID like `0074512` | | |

### Traps to think carefully about

**#5 — Phone number.** It's made of digits, so `int` feels right. Why is it wrong?

[because its not a mathematical number]

**#10 — Student ID.** Same question, plus one more problem `int` would cause.

[also because thats not a mathematical number]

**#6 — Population of NYC.** About 8.3 million. Does that fit in an `int`? What about the population of Earth?

[yes]

---

## Exercise 10 — Your Project's Data (Homework)

Think about your project idea. What are the five most important pieces of information it needs to store?

| # | What it stores | Type | Example value | Why this type |
|---|---|---|---|---|
| 1 | movie names| string| | prisoners|because its only words
| 2 |movie summary | strings| When two young girls go missing on Thanksgiving, a desperate father takes matters into his own hands and tortures the prime suspect,| because its only words|
| 3 |average rating  | double|9.25 |because its decimals |
| 4 | | | | |
| 5 | | | | |

**Is there anything your project needs to store that doesn't fit any of these types?**

[your answer — this is a good question to be stuck on. It's usually a sign you need a *list* of something, or your own class. Both are coming.]

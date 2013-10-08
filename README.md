# Bonus Calculation Problem

The bonus calculation problem was inspired from professor Jon Pearce's notes on [The Composite Reuse Principle (CRP)](http://www.cs.sjsu.edu/~pearce/cs251b/principles/crp.htm).

The problem is an exercise to apply and understand the The Composite Reuse Principle.

## Problem

As is, each employee receive a certain amount of bonus. From now on:

1. senior developers will receive the same amount of bonus that managers receive ;
2. employees will receive the same amount of bonus that secretaries receive.

## Motivation

As is, the application uses inheritance to calculate bonus for each employee. Nevertheless, in certain situations, inheritance impose trade offs over design. If we implement the new feature using the existing design, we will face code duplication. The challange consists in finding a new design to accomodate the new feature.

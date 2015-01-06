# Bonus Calculator

The bonus calculator kata was inspired from professor Jon Pearce's notes on [The Composite Reuse Principle (CRP)](http://www.cs.sjsu.edu/~pearce/cs251b/principles/crp.htm).

This exercise aims to apply and understand the The Composite Reuse Principle.

## What to do

As is, each employee receive a certain amount of bonus. From now on, only 3 bonus categories will exist:

1. BASE: 1.0 % (for Employees and Secretaries);
2. PLUS: 2.27 % (for Junior programmers);
3. PREMIUM: 8.5 % (for Senior programmers and Managers).

Try to evolve the application in order to accommodate the new business rules.

## Hints

As is, the application uses inheritance to calculate bonus for each employee. Nevertheless, in certain situations, inheritance impose trade offs over design. If we implement the new feature using the existing design, we will face code duplication. The challenge consists in finding a new design to accommodate the new features in such a way that code duplication is minimized.
# The Birthday Paradox

A small Java program that demonstrates the **birthday paradox** using a Monte Carlo simulation.

## What is the birthday paradox?

The birthday paradox asks: *how many people do you need in a room before there is a good chance that at least two of them share a birthday?*

Intuition says you would need a lot of people, but the answer is surprisingly small. With just **23 people**, the probability that at least two share a birthday is already about **50.7%**. It feels paradoxical, but it is not a true paradox, only a result that goes against intuition. The reason is that the number of possible *pairs* grows quickly: 23 people form 253 different pairs, and every pair is a chance for a match.

## How the simulation works

The program simulates many random "classes" and counts how often a class contains a shared birthday:

1. A class of **23 students** is generated, and each student gets a random birthday from 1 to 365 (leap years are ignored).
2. The class is checked for duplicate birthdays by putting the values into a `HashSet`. If the set is smaller than the list, at least two students share a birthday.
3. This is repeated **10,000,000 times**.
4. The program prints the percentage of classes that had at least one shared birthday.

## Requirements

- Java Development Kit (JDK) 8 or newer

## Getting started

Clone the repository:

```bash
git clone https://github.com/ToasTMe-git/the_birthday_paradox.git
cd the_birthday_paradox
```

Compile and run:

```bash
javac Main.java
java Main
```

## Example output

```
Success Rate: 50.7...%
```

The exact digits vary from run to run because the simulation is random, but the result should always land very close to the theoretical value of about 50.73%.

## Configuration

The experiment can be tuned by editing constants in `Main.java`:

| What | Where | Default |
| --- | --- | --- |
| Number of simulated classes | `times` in `main` | `10000000` |
| Students per class | loop bound in `makeClass` | `23` |
| Days in the year | multiplier in `makeClass` | `365` |

Try changing the class size to see how quickly the probability climbs. For example, with around 70 people the chance of a shared birthday is above 99.9%.

## Project structure

```
.
├── Main.java    # The simulation
└── README.md    # This file
```

## License

No license has been specified for this project yet.

# Producer-Consumer in Java

This project implements a classic Producer-Consumer model using threads in Java. It simulates a scenario where farmers (producers) produce vegetables and add them to a restaurant, while clients (consumers) consume these vegetables. The storage has a maximum capacity, and access to it is synchronized to avoid race conditions.

## Project Features

- **Farmers (Producers):**

  - Produce random types of vegetables.
  - Add the vegetables to the shared storage in the restaurant.

- **Clients (Consumers):**

  - Consume vegetables from the shared storage.
  - Respect the synchronization of the storage, waiting if it is empty.

- **Restaurant (Shared Storage):**
  - Acts as a shared storage with a limited capacity.
  - Implements a synchronization system with the wait and notifyAll methods to coordinate producers and consumers.

## Project Structure

The project consists of the following classes:

1. App: The main class that initializes the program.

2. Creates Farmer, Client, and Restaurant objects.
   Starts the producer and consumer threads.
   Farmer: A class that extends Thread.

3. Represents a producer that generates vegetables and adds them to the restaurant.
   Simulates random delays between productions to represent real-world timings.
   Client: A class that extends Thread.

4. Represents a consumer that retrieves vegetables from the restaurant.
   Also simulates random delays between each consumption.
   Restaurant: A class that acts as the shared storage.

5. Stores vegetables in a queue (FIFO).
   Implements synchronized methods add and remove to control access.
   Vegetable: A class that represents a vegetable with a type (e.g., lettuce, cabbage, etc.).

## Program Execution

The program creates:

- Two producers (`Farmer`): Paco y Ramón.
- Three consumers (`Client`): Faustino, Mr. Gentleman y Loquendo.
- A restaurant with a maximum capacity of 10 vegetables..

The program flow is as follows:

1. Farmers produce vegetables alternately and add them to the restaurant.
2. Consumers retrieve vegetables, ensuring they do not consume when the storage is empty.
3. The interactions between producers and consumers are logged in the console.

## Expected Output

An example of the output would be:

Verdura de tipo lettuce producida por el grajero Paco

- Producto agregado: Verdura de tipo lettuce

* Cliente Faustino consumió: Verdura de tipo lettuce
  Verdura de tipo cabbage producida por el grajero Ramón

- Producto agregado: Verdura de tipo cabbage

* Cliente Mr. Gentleman consumió: Verdura de tipo cabbage
  Verdura de tipo spinach producida por el grajero Paco

- Producto agregado: Verdura de tipo spinach

* Cliente Loquendo consumió: Verdura de tipo spinach
  Verdura de tipo tomato producida por el grajero Ramón

- Producto agregado: Verdura de tipo tomato

* Cliente Mr. Gentleman consumió: Verdura de tipo tomato
  Verdura de tipo carrot producida por el grajero Paco

- Producto agregado: Verdura de tipo carrot

* Cliente Faustino consumió: Verdura de tipo carrot

## Synchronization

Access to the storage is synchronized to avoid concurrency issues:

- **Producer (`Farmer`)**:
  - If the storage is full, they wait (`wait()`) until space is available.
- **Consumer (`Client`)**:
  - If the storage is empty, they wait (`wait()`) until products are available.
- The `notifyAll()` method is used to wake up waiting threads whenever the storage state changes.

## System Requirements

- **Java 8 or higher**
- An IDE or compiler that supports Java projects.

# Data Structures Implementation

This project implements core data structures in Java without using `java.util.*` (except `Iterator`):

## Implemented Structures

- **Physical Data Structures**:
  - `MyArrayList` - dynamic array implementation
  - `MyLinkedList` - doubly-linked list implementation

- **Logical Data Structures** (built on physical ones):
  - `MyStack` (uses `MyArrayList`)
  - `MyQueue` (uses `MyLinkedList`)
  - `MyMinHeap` (uses `MyArrayList`)

## Key Features

- Generic type support (`<T>`)
- Full iterator implementation
- Complete error handling
- Comprehensive test coverage

## Usage

1. Clone the repository
2. Compile all Java files: `javac *.java`
3. Run tests: `java Main`

## Design Choices

- `MyStack` uses `MyArrayList` for O(1) push/pop operations
- `MyQueue` uses `MyLinkedList` for efficient enqueue/dequeue
- `MyMinHeap` uses `MyArrayList` for compact array representation

All implementations follow interface-driven design with clear separation between physical and logical structures.

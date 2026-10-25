
# QueueLess — Virtual Queue Simulator

## CMR University
Department of Information Technology

**Course:** 4CSPL2023 — Object Oriented Programming  
**Assignment:** 2 — Java Mini Application Development  
**Project Title:** QueueLess — Virtual Queue Simulator  
**Student Name:** Syed Ahmed Hyder  
**Student ID:** 25BBTIT039

## 1. Introduction
QueueLess is a Java-based virtual queue simulator designed to manage waiting tokens. It can be used as a demonstration of a simple queue system for a college office, help desk, or service counter.

## 2. Objectives
- Generate tokens for people waiting in a queue.
- Call the next token in order.
- Display waiting tokens.
- Reset the queue when required.
- Apply Java OOP concepts and GUI event handling.

## 3. Technologies Used
- Java
- Java Swing
- AWT
- Queue and LinkedList collections

## 4. Main Features
1. Generate Token
2. Call Next
3. View Queue
4. Reset Queue
5. Display the currently served token
6. Handle an empty queue with a message

## 5. Object-Oriented Programming
**Class:** QueueLess represents the application window and its functionality.

**Encapsulation:** Application data and interface components are managed within the class, with the waiting queue and token counter maintained as fields.

**Methods:** The constructor initializes the interface. The refresh() method updates the waiting list.

**Event Handling:** ActionListener-style event handling is implemented using lambda expressions with Swing buttons.

## 6. GUI Components
- JFrame: Main application window
- JLabel: Headings and status messages
- JButton: User actions
- JTextArea: Waiting-token display
- JPanel: Organizes interface components
- JOptionPane: Displays messages

## 7. Working Procedure
1. Launch the application.
2. Select Generate Token to add a new token.
3. Select Call Next to serve the earliest waiting token.
4. Select View Queue to inspect waiting tokens.
5. Select Reset Queue to clear the queue and restart numbering.

## 8. Validation and Error Handling
The application checks whether the queue is empty before calling a token. If no tokens are waiting, a message is displayed instead of attempting to serve a nonexistent token.

## 9. Testing Plan
- Generate multiple tokens and check their order.
- Call tokens and verify that the earliest token is served first.
- Attempt to call a token when the queue is empty.
- View the queue after adding tokens.
- Reset the queue and verify that numbering restarts.

Record the actual test results after running the application.

## 10. Conclusion
QueueLess demonstrates how Java Swing can be used to build a graphical application. It combines queue operations, object-oriented programming, GUI components, and event handling in a simple virtual queue management system.

## 11. Source Code
The Java source file is QueueLess.java in this project repository.

## 12. Screenshots
Add screenshots of the running application and its main functions after compiling and testing the program.

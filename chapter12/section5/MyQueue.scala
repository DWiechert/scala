package chapter12.section5

// Since Doubling overrides the abstract method in IntQueue, it needs to be extended second after the initial abstract class
class MyQueue extends BasicIntQueue with Doubling {
}
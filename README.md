# DecotatorPattern

## 1. Introduction
The most straightforward way to extend the behavior of a class is to simply modify the class to include the new behavior. For example, in figure below an existing class is modified to include the new features A, B and C. The biggest problem with this this approach is that it violates the open-closed principle. The open-closed principle states that classes should be open for extension, but closed for modification. With this approach the existing class is clearly not closed for modification because adding or modifying features requires a change to the existing class.

![alt text](https://github.com/vudph/DecoratorPattern/blob/master/resources/addbehavior.gif "Add behaviors")

Another popular approach to extending the behavior of classes is inheritance or subclassing. When class A inherits from class B, class A has all the functionality of class B and can override methods in class B to add new behaviors

![alt text](https://github.com/vudph/DecoratorPattern/blob/master/resources/inheritance-extension.gif "Inheritance approach")

Adding new behaviors via subclassing seems to comply with the open-closed principle. But, the major problem with class extension via inheritance though comes when different combinations and permutations of features are allowed.  For example, figure below shows 7 different subclasses--one for each combination of features A, B and C. The resulting inheritance hierarchy is even worse when different permutations of features are allowed.

![alt text](https://github.com/vudph/DecoratorPattern/blob/master/resources/mess-of-classes.gif "Mess of classes")

## 2. Without Decorator

![alt text](https://github.com/vudph/DecoratorPattern/blob/master/resources/WithoutDecorator.png "Without Decorator")

## 3. Decorator Pattern

![alt text](https://github.com/vudph/DecoratorPattern/blob/master/resources/WithDecorator.png "With Decorator")
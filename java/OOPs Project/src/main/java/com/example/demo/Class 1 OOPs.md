
Lecture 1 - Intro to OOP Lab

Lets consider we have scaler(Product)
So the Scaler is made up of entities 
1. Students
2. Instructor
3. Course
4. Batch
5. Assignments

What is entity student made up of 
1. Name
2. ID
3. Age 

what are all above things these are nothing but the data of the entity
and more commonly known as "Attributes"

Also Students can do what 
1. Attend class
2. Rate Class
3. Solve Assignments

What are all above things of the students  these are nothing but the functions of the entity also behaviours

So what can I say 
Can I say 
An entity is nothing but Data + behaviour 
Entity = Data + Behaviour 

Lets consider Instructor (Entity)
Data 
1. Name
2. ID
3. Course
4. Company

Behaviours
1. Take Class
2. Give Assignments
3. Upload Notes

Now if Entity is Data + Behaviour what do we need 
As a user we need something to hold on to this data 
We need something which can help us group  Data + Behaviours
So we have class
Class = Data(Attributes) + Behaviour 

So Is class actually anything?
No A class is more like a structure.
So class is a blueprint of an Entity that groups Properties(Attributes) and behaviours togather

- Example of a class 
## Class is defined by the keyword class
Class Student {
    Public String Name; 
## Attributes are defined by datatypes and Access modifiers (Public)
    Public int ID; 
    int age;
    string email;

    behaviours

    void registerForCourse(string new Course){
        this.Course = Course
        print ("------")

    }
    return Datatype (name of function) (Parameter Datatype, ...)
}

- So the structure of a class is That there are set of attributes and set of behaviours.

- Objects
Lets say if an architect has given you the blueprint of your house would you be happy with the blue print. Is the Blueprint sufficient.
You need the Concrete house.
So can I say a Contrete house is nothing but the existance of the blueprint.

So can is say a class is nothing but a blueprint of the Entity
And an object is an instance of Entity

## Class ---> Existance --> Objects

So with one blueprint can i create only one object or multiple object?
Multiple! Correct 
Eg Are the flats copy of one Blueprint

So instance is an actual Object

Also the operations are performed on the object.
For example if I have to deliver a post where shall i deliver it to.
To the bllue print or the hoese.
To the house right !!
So the operations are performed on the objects.
As there can be multiple objects created from the class. So if we want to perform an action, then that operation would be performed on that object only.




- OOPs Concept 

- What is OOPs
Object Oriented programming system
Here object is doing something 

There are four pillars of OOPs Concept 
1. Encapsulation (Class + Access Modifier)
2. Inheritance 
3. Polymorphism
4. Abstraction

## Encapsulation
Common english word in this "Encapsulation" is "Capsule"
What does Capsule do?
1. It Holds like space capsule or medicine capsule.
Class holds Entity, attributes and behaviours.
2. It protects from the outer world.
Protection means who can access and who cannot access
access of Data and behaviour.
We control them via access Modifiers.

There are 4 types of access modifiers
1. Public :(EveryWhere)         These attributes of the class are acessable everywhere within the program.
2. Private:(Most Protected)     These are accessable within the same Class. 
3. Protected:(Sub-Class)        These are acessable in the Inheritance.
4. Default:(Directory/Folder)   These are accessable within the same package. 

- They are written in front of the attribute or behaviour


When we create an object we write something like 

## Student.student = new Student()

So what does Student() means here 
Student() is nothing but a default constructor 
It creates a default object from the class.

Understand it like this 
When we go to an Architect does it suggest us some of his known(Default) Contractor that you can go to him and he can construct your house.
Like wise JAVA provides us with default constructor. But if we want we can create our own constructor.

## Example

public void Student{
    public String Name;
    public int age;
    public String Batch;


- Creating out own constructor
here Student is name of the class
public Student(){
    this.name = "unknown";
    this.age = 0;
    this.batch = "Not Registered";
} 
}

So what is the benifit of writing a constructor 
- We can set our own default values via constructors.
- These is no return type 
Do we need return type 
No!! why? why because what should a constructor be returning ?? The Object.
Can i have two default constructors? No 
But we can have parameterised constructor  

e.g.
- Parameterised Constructor
public Student(String name, int age, Strint batch){
    this.name = name;
    this.age = age;
    this.batch = batch;
}

- Creating Object using parameterised constructor
Student Student1 = new Student(name: "Sudarshan", age: 28, batch: "Aug 24");
system.out.println("Student Created");
- new is used to create a new Object.

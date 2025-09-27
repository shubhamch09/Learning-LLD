
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
// Class is defined by the keyword class
Class Student {
    Public String Name; // Attributes are defined by datatypes and
                        //Access modifiers (Public)
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

Class ---> Existance --> Objects

So with one blueprint can i create only one object or multiple object?
Multiple! Correct 
Eg Are the flats copy of one Blueprint

So instance is an actual Object





- OOPs Concept 

There are four pillars of OOPs Concept 
1. Encapsulation
2. Inheritance
3. Polymorphism
4. Abstraction

## Encapsulation
Common english word in this "Encapsulation" is "Capsule"
What does Capsule does?
1. It Holds like space capsule or medicine capsule.
Class holds Entity, attributes and behaviours.
2. It protects from the outer world.
Protection means who can access and who cannot access/ access of Data and behaviour.
We control them via access Modifiers.

There are 4 types of access modigiers
1. Public : These attributes are acessable everywhere within the program
2. Private: (Most Protected) : Accessable within the same Class.
3. Protected: Acessable in the Inheritance (Sub-Class)
4. Default : Accessable within the same package(Directory/Folder). 
They are written in front of the attribute or behaviour


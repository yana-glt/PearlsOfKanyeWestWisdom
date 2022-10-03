1.A. When is it better to use abstract classes: 

- We want to avoid code duplication by implementing multiple closely related classes from the same semantic category. 

- The classes that will extend our abstract class will have many common properties and will implement many similar methods. 

- The inherited class is used in relation to the IS-A type, so the inherited class only extends the functionality of the abstract class.

- The project is already partially written, and we know that the selected classes will often change and be supplemented with new methods and fields. 
And maintaining an abstract class and extending it is much easier than designing an interface and adding its new methods to all the places in the code 
where they should be implemented.  

When is it better to use interfaces:  

- We need to describe certain logic that unrelated objects should support. 

- We need to cast a group of objects to the same type and guarantee similar functionality. 

- We need to add some kind of marker that will say that the selected classes support certain logic. 

- We want to use multiple type inheritance.

1.B. Arrays hold data in a contiguous space in memory, while lists usually store their information in a non-contiguous space. 
In an array, you know what the next data element is by going to the next element. 
This is a physical movement along a standard size memory boundary that allows you to find the next element. 
In a list, each element in the list stores a “pointer” to the location of the next element in the list. 
So in an array, you can go to the fifth element, just as you can go straight to the fifth house on the street. 
On the list, you will need to knock on the door of each house and ask what the address of the next house in the group is. 
This next home could be anywhere in the city.


2. 
private boolean search(int[] numbers, int x) {
			int firstIndex = 0;
			int lastIndex = numbers.length - 1;

			while (firstIndex <= lastIndex) {
				int middleIndex = (firstIndex + lastIndex) / 2;
           
				if (numbers[middleIndex] == x) {
					return true;
				}

				else if (numbers[middleIndex] > x) {
					firstIndex = middleIndex + 1;
				}
         
				else if (numbers[middleIndex] < x) {
					lastIndex = middleIndex - 1;
				}
			}
			return false;
		}
		
		//Algorithmic complexity:
		//Time Complexity is O(log n)
		//Space Complexity is O(1)
	
  
  
  3. The solution of the third task is presented in the repository itself

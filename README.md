# Machine-Coding-Round

Problem Definition: <br/><br/>
Design a Ride sharing application where drivers can offer rides (origin, destination, no of seats), any rider
can request rides (origin, destination, no of seats). 
There is an algo to choose to calculate Ride amount charged for a given ride based on distance and no of
seats <br/>
● When the ride closes, show the amount charged to the rider. <br/>
● Ride amount if No of seats >= 2 : No of kilometers * No of seats * 0.75 * Amount Charged per KM <br/>
● Ride amount if No of seats = 1 : No of kilometers * Amount Charged per KM <br/>
The program should take as input two or more drivers and a set of riders requesting rides. Multiple rides
can happen simultaneously. <br/> <br/>
Assumptions : <br/>
● Assume Amount charged per KM = 20 <br/>
● No of Kilometers = destination - origin <br/>
● All values are Integer <br/> <br/>
Test Case: <br/>
A requesting for ride R1 <br/>
INPUT: A requests 50, 60, 1, <br/>
OUTPUT: Ride Amount: 10 * 20 (Amount/Km) = 200 <br/>
A requesting for ride R1 <br/>
INPUT: A requests 50, 60, 2,<br/>
OUTPUT: Ride Amount: 10 * 2 * 0.75 * 20 (Amount/Km) = 300 <br/><br/>
Bonus: <br/>
● Upgrade the rider to a preferred rider if he has done in more than 10 rides. <br/>
● Preferred Rider amount if No of seats >= 2 : No of kilometers * No of seats * 0.5 * Amount Charged per KM <br/>
● Preferred Ride amount if No of seats = 1 : No of kilometers * Amount Charged per KM * 0.75 <br/> <br/>
Functionalities expected: <br/>
● Add Driver(name) <br/>
● Add Rider(name) <br/>
● Create Ride (id, origin, destination, no of seats) <br/>
● Create/Update Ride (id, origin, destination, no of seats) <br/>
● Withdraw Ride (id) <br/>
● Close ride and return ride amount charged<br/><br/>
Expectations: <br/>
1. Create the sample data yourself. You can put it into a file, test case or main driver program
itself. <br/>
2. The code should be demo-able. Either by using the main driver program or test cases. <br/>
3. The code should be modular. The code should have the basic OO design. Please do not jam in
the responsibilities of one class into another. <br/>
4. The code should be extensible. Wherever applicable, use interfaces and contracts between
different methods. It should be easy to add/remove functionality without rewriting the entire
codebase. <br/>
5. The code should handle edge cases properly and fail gracefully. <br/>
6. The code should be legible, readable and DRY. <br/>
7. Database integration is not required. <br/><br/>
Guidelines: <br/>
1. Please do not access the internet for anything EXCEPT syntax. <br/>
2. You are free to use the language and IDE of your choice. <br/>
3. The entire code should be your own. <br/>


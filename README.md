# Machine-Coding-Round

Problem Definition: <br/><br/>
Design a Ride sharing application where drivers can offer rides (origin, destination, no of seats), any rider
can request rides (origin, destination, no of seats). 
There is an algo to choose to calculate Ride amount charged for a given ride based on distance and no of
seats <br/>
1. When the ride closes, show the amount charged to the rider. <br/>
2. Ride amount if No of seats >= 2 : No of kilometers * No of seats * 0.75 * Amount Charged per KM <br/>
3. Ride amount if No of seats = 1 : No of kilometers * Amount Charged per KM <br/>
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


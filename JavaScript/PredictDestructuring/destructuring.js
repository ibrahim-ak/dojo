const cars = ['Tesla', 'Mercedes', 'Honda']
const [randomCar] = cars
const [, otherRandomCar] = cars
//Predict the output
console.log(randomCar)
console.log(otherRandomCar)
//the output
//tesla
//mercedes


// const employee = {
//      name: 'Elon',
//      age: 47,
//      company: 'Tesla'
// }
// //end of employee scope 
// const { name: otherName } = employee;
// console.log(name); //is not defined in the current scope.
// console.log(otherName);
// // the output
// //error 

const person = {
     name: 'Phil Smith',
     age: 47,
     height: '6 feet'
}
const password = '12345';
const { password: hashedPassword } = person;//it should prvoid error couse there is no attribute named "password"
//Predict the output
console.log(password);//12345
console.log(hashedPassword);//error


const numbers = [8, 2, 3, 5, 6, 1, 67, 12, 2];
const [, first] = numbers;
const [, , , second] = numbers;
const [, , , , , , , , third] = numbers;
//Predict the output
console.log(first)//2
console.log(second)//5
console.log(third)//2


console.log(first == second);//fulse
console.log(first == third);//true



const lastTest = {
     key: 'value',
     secondKey: [1, 5, 1, 8, 3, 3]
}
const { key } = lastTest;
const { secondKey } = lastTest;
const [, willThisWork] = secondKey;
//Predict the output
console.log(key);//value
console.log(secondKey);//[1,5,1,8,3,3]
console.log(secondKey[0]);//1
console.log(willThisWork);//5


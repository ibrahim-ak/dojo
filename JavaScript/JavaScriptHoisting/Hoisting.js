
console.log(">>>>>>>>>>>>>> first assignment")
//first assignment
console.log(hello);                                   
var hello = 'world';

// >>interperter 
// var hello;
// console.log(hello);                                   
//hello="world"

//output 
//undefined


                                 
// secend assignment
console.log(">>>>>>>>>>>>>> secend assignment")
var needle = 'haystack';
test();
function test(){
    var needle = 'magnet';
    console.log(needle);
}




//output
//magnet
console.log(">>>>>>>>>>>>>> 3rd assignment")



var brendan = 'super cool';
function print(){
    brendan = 'only okay';
    console.log(brendan);
}
console.log(brendan);

//output
//super cool

console.log(">>>>>>>>>>>>>> 4th assignment")

var food = 'chicken';
console.log(food);
eat();
function eat(){
    food = 'half-chicken';
    console.log(food);
    var food = 'gone';
}

// >>interperter 
//print chicken
//call eat() in side fuction scope
//print half-chicken
//function eat(){
          //var food;
     //     food = 'half-chicken';
     //     console.log(food);
     //     food = 'gone';
     // }

//output
//chicken
//half-chicken



console.log(">>>>>>>>>>>>>> 5th assignment")

// mean();
// console.log(food);
// var mean = function() {
//     food = "chicken";
//     console.log(food);
//     var food = "fish";
//     console.log(food);
// }
// console.log(food);


//output
//error the mean is not defiend yet as a function hoisting make it as a var
//var mean;
//mean();


console.log(">>>>>>>>>>>>>> 6th assignment")


console.log(genre);
var genre = "disco";
rewind();
function rewind() {
    genre = "rock";
    console.log(genre);
    var genre = "r&b";
    console.log(genre);
}
console.log(genre);

// >>interperter 
// Function declarations are fully hoisted, meaning they can be called before they are declared in the code.

//output
//undefined
//rock
//r&b
//disco
console.log(">>>>>>>>>>>>>> 7th assignment")

//var dojo;
//function learn
//inside function // var dojo;
//dojo = "seattle";
// dojo = "burbank";
//end of fucntion 
//dojo = "san jose";
//console.log(dojo);
//console.log(dojo);
var dojo;
function learn() {
         dojo = "seattle";
         console.log(dojo);
         var dojo = "burbank";
         console.log(dojo);
     }
     
dojo = "san jose";
console.log(dojo);
learn();
console.log(dojo);

// output
// san jose
// seattle
// burbank
// san jose


console.log(makeDojo("Chicago", 65));
console.log(makeDojo("Berkeley", 0));
function makeDojo(name, students){
    const dojo = {};
    dojo.name = name;
    dojo.students = students;
    if(dojo.students > 50){
        dojo.hiring = true;
    }
    else if(dojo.students <= 0){
        dojo = "closed for now"; // error we cant change const
    }
    return dojo;
}

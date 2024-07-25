class Ninja {
     constructor(name) {
          this.name = name;
          this.health = 90;
          this.speed = 3;
          this.strength = 3;

     }
     sayName = () => console.log("hello" + this.name);
     showStats = () => console.log("Name :" +this.name," health :"+ this.health,"Speed: "+ this.speed,"Stringth"+ this.strength)
     drinkSake = () => this.health += 10;
}

class Sensei extends Ninja {
     constructor(name) {
          super(name)

          this.wisdom = 10;
          super.health = 200;
          super.speed = 10;
          super.strength = 10;
     }

     speakWisdom = () => this.drinkSake();

}

// example output
const superSensei = new Sensei("Master Splinter");
superSensei.speakWisdom();
// -> "What one programmer can do in one month, two programmers can do in two months."
superSensei.showStats();
// -> "Name: Master Splinter, Health: 210, Speed: 10, Strength: 10"



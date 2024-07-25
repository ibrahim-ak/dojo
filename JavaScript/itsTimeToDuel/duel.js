class Card {
     constructor(name, cost) {
          this.name = name;
          this.cost = cost;
     }



}


class Unit extends Card {
     constructor(name, cost, power, res) {
          super(name, cost);
          this.power = power;
          this.res = res;
     }
     attack(target){
          if (target instanceof Unit){
               target.res-=this.power;

          }
          else {
               throw new Error("Target must be a unit!");
          }
     }
}

class Effect extends Card {
     constructor(name, cost, magn, text) {
          super(name, cost);
          this.magn = magn;
          this.text = text;

     }
     play(target) {
          if (target instanceof Unit) {
               if (this.name == "Hard Algorithm") {
                    target.res+=this.magn;
               }
               else if(this.name =="Unhandled Promise Rejection" ) {
                    target.res-=this.magn;  
               }
               else{
                    target.power+=this.magn; 
               }
          } else {
               throw new Error("Target must be a unit!");
          }
     }

}

const u1 = new Unit("Red Belt Ninja", 3, 3, 4)
const u2 = new Unit("Black Belt Ninja", 4, 5, 4)
const eff1 = new Effect("Hard Algorithm", 2, 3, "increase target's resilience by 3 ")
const eff2 = new Effect("Unhandled Promise Rejection", 1, 2, "reduce target's resilience by 2")
const eff3 = new Effect("Pair Programming", 3, 2, "increase target's power by 2 ")


console.log(u1);
eff1.play(u1);
console.log(u1);

eff2.play(u1);
console.log(u1);

eff3.play(u1);
console.log(u1);
console.log(u2);

u1.attack(u2)
console.log(u2);

u1.attack(eff1)

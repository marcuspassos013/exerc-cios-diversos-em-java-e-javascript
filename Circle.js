 export class Circle {
    constructor(raio,cor){
        this.raio = raio;
        this.cor = cor;
    }

       getRadius(){
            return this.raio;
       }

        getColor(){
            return this.cor;
        }

        getArea() {         
        return (this.raio * this.raio * Math.PI).toFixed(2);
    }
}



import { Circle } from './Circle.js';

const c1 = new Circle(5.2,'vermelho');
console.log();
console.log("Primeiro objeto:");
console.log("O raio é: " + c1.getRadius());
console.log("A cor é: " + c1.getColor());
console.log("A área é: " + c1.getArea());

const c2 = new Circle(8.5,'azul');
console.log();
console.log("Segundo objeto:");
console.log("O raio é: " + c2.getRadius());
console.log("A cor é: " + c2.getColor());
console.log("A área é: " + c2.getArea());

const c3 = new Circle(2.5,'amarelo');
console.log();
console.log("Terceiro objeto:");
console.log("O raio é: " + c3.getRadius());
console.log("A cor é: " + c3.getColor());
console.log("A área é: " + c3.getArea());


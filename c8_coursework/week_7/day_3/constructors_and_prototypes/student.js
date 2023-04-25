const Student = function(name){
    this.name = name;
    this.laptop = null;
    // property 

    // this.greet = function(){
    //     console.log(`Hello, my name is ${this.name}`);
    // }
    // behaviour goes in class function in JS not separately 
    // string interpolation allows you to put something within a string by using ${} in a ``
};


// prototype ----------
// common to all objects and defines what each object can do 

Student.prototype.greet = function(){
    console.log(`Hello, my name is ${this.name}`);
}

Student.prototype.buyLaptop = function(newLaptop){
    this.laptop = newLaptop;
}

Student.prototype.installProgram = function(program){
    this.laptop.install(program);
}

module.exports = {Student}

// creating a 'class'
// name of function matches name of file with capital - to interpret it as constructor function for a class
// basically a named function that stores the class name as a variable
// export to use it outside of this file
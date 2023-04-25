const students = [
    {
      name: "John Smith",
      age: 31,
      address: "123 Main St",
      courses: ["Math", "English", "Spanish"]
    },
    {
      name: "Jane Doe",
      age: 35,
      address: "456 Oak Ave",
      courses: ["Science", "Art", "Music"]
    },
    {
      name: "Bob Johnson",
      age: 17,
      address: "789 Elm St",
      courses: ["Spanish", "English", "Biology"]
    },
    {
      name: "Emily Lee",
      age: 22,
      address: "345 Pine St",
      courses: ["Chemistry", "French", "Philosophy"]
    },
    {
      name: "Michael Chen",
      age: 21,
      address: "678 Walnut St",
      courses: ["Spanish", "Statistics", "Japanese"]
    },
    {
      name: "Jessica Kim",
      age: 29,
      address: "901 Cedar Ave",
      courses: ["Journalism", "Japanese", "Statistics"]
    },
    {
      name: "David Park",
      age: 22,
      address: "234 Maple St",
      courses: ["Marketing", "Statistics", "Sociology"]
    },
    {
      name: "Samantha Wong",
      age: 17,
      address: "567 Birch Rd",
      courses: ["Marketing", "Communication", "Journalism"]
    }
  ];


// filter students by certain course
console.log(students.filter(s => s.courses.includes("Statistics")));

// you can also chain calls - if you wanted previous info but only names (mapped to a new array of names)
console.log(students.filter(s => s.courses.includes("Statistics")).map(s => s.name));

console.log(students.filter(s => s.courses.includes("Statistics")).map(s => ({name: s.name, age: s.age})));


// average (mean) student age - reduce used to generate one final value or array
// console.log(students.reduce((accum, student) => accum + student.age, 0)); // total 
console.log("Average age: ", students.reduce((accum, student) => accum + student.age, 0) / students.length); 


// sort by age asc
console.log("Sorted by age: ", students.sort((a, b) => a.age - b.age));

// sort by age desc
console.log("Sorted by age: ", students.sort((a, b) => b.age - a.age));

// get array of names only 
console.log("Get array of names: ", students.map(s => s.name));

// all unique courses 
console.log("All unique courses: ", new Set(students.reduce((accum, student) => accum.concat(student.courses), [])));
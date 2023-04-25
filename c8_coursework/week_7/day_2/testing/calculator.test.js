const {sum} = require('./calculator');
// to import the earlier exported value

describe("additiion functionality", () => { //groups tests together under umbrella term

test("can add two small positive numbers", () => {
    // declare the test - define what we want it to do 
    // function doesn't take in any input - can be "function(){}" instead of arrow function  

    // ARRANGE - do any setup
    const expected = 5;
    // ACT - call the function under test 
    const actual = sum(2,3);
    // ASSERT - that what was meant to happen did happen
    expect(actual).toBe(expected);
});

// wont let you run this, have to change scripts in package json, replace with 'jest' or package name
// and "test:coverage": "jest --coverage" another line (test in terminal "npm run test:coverage")
// anything custom we need to add run to the testing in terminal (very useful tool to use to show you if youve tested everything you need to test)
// run npm test 
// can test in terminal 

});


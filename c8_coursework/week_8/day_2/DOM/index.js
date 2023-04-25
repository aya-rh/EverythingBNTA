const paragraph = document.querySelector(".paragraph");
console.log(paragraph);
// first element in the document that matches the query
// can see this in dev tools in web browser

const pparagraphs = document.querySelectorAll(".paragraph");
console.log(pparagraphs);
// get an array like structure with all the information about the nodes in the node list

const pars = document.getElementsByClassName("paragraph");
console.log(pars);
// returns HTML collection in dev tools


const heading = document.querySelector("#main-heading");
// accessing the id of main-heading in our html
console.log(heading.innerText);
heading.innerText = "Learning about the DOM";
// will print the "" at the top of the chrome page as a heading

const paragraphs = document.querySelectorAll(".paragraph");
paragraphs[0].innerText = "The DOM is a hierarchical representation of the HTML elements in your document.";
// to change the text of the first pragraph - index [0]
paragraphs[1].innerText = "It provides us with an API which allows us to traverse our HTML document."
// second paragraph

//list 
document.querySelector("h2").innerHTML = "Important Methods & Properties:";

const list = document.querySelector(".list");
console.log(list);
//creates empty list
list.innerHTML =  "<li> Don't make your list items this way </li>";
// using innerText won't let you interpret the html as html but will print it all as text
// using innerHTML allows the use of html and provides us with bullet points when using <li></li>
// HOWEVER innerHTML is vulnerable and can be exploited for malicious purposes, better to avoid
const listItem2 = document.createElement("li");
listItem2.innerText = "querySelector () - select the first element that matches a query";

const listItem3 = document.createElement("li");
listItem3.innerText = "querySelectorAll() - selects all elements that match the query";

const listItem4 = document.createElement("li");
listItem4.innerText = "convertToSpaceMonkey() - use your space onkey ray-gun to convert all elements to space monkeys";

list.appendChild(listItem2);
list.appendChild(listItem3);
list.appendChild(listItem4);
// add your list items to the list as children 

list.removeChild(listItem4);
// removes a child 
// can use list.firstChild or list.lastChild instead of exact listItem

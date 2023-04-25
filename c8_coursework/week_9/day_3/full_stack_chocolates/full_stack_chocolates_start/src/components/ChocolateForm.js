import { useState } from "react";

const ChocolateForm = ({estates, onSubmit}) => {

    const [newChocolate, setNewChocolate] = useState({
        name: "",
        cocoaPercentage: 0,
        estate: null
    });

    const estateOptions = estates.map(estate => {
        return (
            <option value={estate.id} key={estate.id}>
                {estate.name}
            </option>
        )
    });

    // two event handlers:
    // 1.constructor object
    // 2. send to database in the container file

    // copiedChocolate will update whatever is in state (newChocolate) then bin the copy ready for next new chocolate

    // 1. handle for choc name and percentage
    const handleChange = (event) => {
        const propertyName = event.target.name;
        const copiedChocolate = {...newChocolate};
        copiedChocolate[propertyName] = event.target.value;
        setNewChocolate(copiedChocolate);
    }

    // 1. handle for the estate drop down
        // parseint so that everything in the object gets turned to a string
        // .filter returns an array of all array objects that satisfy criteria
        // .find will return one 
    const handleEstateChange = (event) => {
        const estateId = parseInt(event.target.value);
        const selectedEstate = estates.find(estate => {
            return estate.id === estateId;
        });
        const copiedChocolate = {...newChocolate};
        copiedChocolate.estate = selectedEstate;
        setNewChocolate(copiedChocolate);
    }

    const handleFormSubmit = (event) => {
        event.preventDefault();
        onSubmit(newChocolate);
    }
    // stringify takes json in passed object and turns it into a request - takes on the serialisation
    // opposite of what response.json() does 

    return(
        <form id="chocolate-form" onSubmit={handleFormSubmit}>
            <h3>Add a new chocolate</h3>

            <label htmlFor="chocolate-name">Chocolate Name:</label>
            <input
                id="chocolate-name"
                name="name"
                type="text"
                placeholder="enter chocolate name" 
                onChange={handleChange}
            />

            <label htmlFor="cocoa-percentage">Cocoa Percentage:</label>
            <input
                id="cocoa-percentage"
                name="cocoaPercentage"
                type="number"
                min={1}
                max={100}
                onChange={handleChange}
            />

            <label htmlFor="estate">Estate</label>
            <select 
                id="estate" 
                name="estate"
                defaultValue="select-estate"
                onChange={handleEstateChange}
            >
                <option disabled-value="select-estate">Choose an estate</option>
                {estateOptions}
            </select>

            <input type="submit" value="Add Chocolate"/>          
        </form>
    )

}

export default ChocolateForm;
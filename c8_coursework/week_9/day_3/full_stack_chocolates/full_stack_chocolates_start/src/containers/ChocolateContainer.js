import { useState, useEffect } from "react";
import ChocolateList from "../components/ChocolateList";
import ChocolateForm from "../components/ChocolateForm";

const ChocolateContainer = () => {

    const [chocolates, setChocolates] = useState([]);
    const [estates, setEstates] = useState([]);

   // to point app to local api rather than an existing one on the internet (both load methods then useEffect set up)
    const loadChocolateData = async () => {
        const response = await fetch ("http://localhost:8080/chocolates");
        const data = await response.json();
        setChocolates(data);
    }

    const loadEstateData = async () => {
        const response = await fetch ("http://localhost:8080/estates");
        const data = await response.json();
        setEstates(data);
    }

    useEffect(()=>{
        loadChocolateData();
        loadEstateData();
    }, []);
    // so that it only reloads on refresh/on reload

    // 2. maintains the list of existing and updated chocolates to the database
    const postChocolate = async (newChocolate) => {
        const response = await fetch ("http://localhost:8080/chocolates", {
            method: "POST", 
            headers: {
                "Content-Type" : "application/json"
            },
            body: JSON.stringify(newChocolate)
        })
        const savedChocolate = await response.json();
        setChocolates([...chocolates, savedChocolate])
        // loadChocolateData();
    }

    const deleteChocolate = async (id) => {
        await fetch (`http://localhost:8080/chocolates/${id}`, {
            method: "DELETE",
            headers: {
                "Content-Type": "application/json" 
            }
        });
        loadChocolateData();
    }

    return(
        <>
            <ChocolateForm
            estates={estates}
            onSubmit={postChocolate}
            />
            <ChocolateList 
            chocolates={chocolates}
            onDelete={deleteChocolate}
            />
        </>
    )

}

export default ChocolateContainer;
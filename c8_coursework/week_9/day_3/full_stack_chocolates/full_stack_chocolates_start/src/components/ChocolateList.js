import Chocolate from "./Chocolate";

const ChocolateList = ({chocolates, onDelete}) => {

    const chocolateComponents = chocolates.map(chocolate => {
        return <Chocolate 
            key={chocolate.id} 
            chocolate={chocolate}
            onDelete={onDelete}
            />
    });

    return(
        <div id="chocolate-list">
            {chocolateComponents}
        </div>
    )
}

export default ChocolateList;
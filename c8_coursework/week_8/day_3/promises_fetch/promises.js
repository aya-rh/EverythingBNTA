const getUserData = ()=> {
    return new Promise((resolve)=> {
        setTimeout(function() {
            const userData = { id: 123, name: "John Doe" };
            console.log(userData);
            resolve(userData);
        }, 1000);
    })
}

function getAccountDetails(userData) {
    return new Promise(function (resolve) {
        // simulate getting account details asynchronously
        setTimeout(function () {
            const accountDetails = { id: 456, balance: 1000 };
            resolve(accountDetails);
        }, 1000);
    });
}

function getTransactions(accountDetails) {
    return new Promise(function (resolve) {
        // simulate getting transactions asynchronously
        setTimeout(function () {
            const transactions = [1, 2, 3];
            resolve(transactions);
        }, 1000);
    });
}

function getTransactionDetails(transactions) {
    return new Promise(function (resolve) {
        // simulate getting transaction details asynchronously
        setTimeout(function () {
            const transactionDetails = ["transaction 1", "transaction 2", "transaction 3"];
            resolve(transactionDetails);
        }, 1000);
    });
}

getUserData()
    .then(getAccountDetails)
    .then(getTransactions)
    .then(getTransactionDetails)
    .then((transactionDetails) => {
        //do something with transaction details 
        console.log(`Transation details: ${transactionDetails}`);
    })

    // resolve triggers .then - everytime a resolve is resolved it triggers the next .then
    // resolve is essentially acting as the callback function but is tied to other internal methods that can just be called by .then
    // makes callbacks easier - better than nested callbacks
    

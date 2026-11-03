'use strict'

const readLine = require("readLine");
const rl = readLine.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question("Enter the number of the node to find its successor: ", function (successorInput) {
    const successorNode = parseInt(successorInput);
    const successor = successorNode + 1;
    console.log(`The successor of the node ${successorNode} is: ${successor}`);
    rl.close();
});   

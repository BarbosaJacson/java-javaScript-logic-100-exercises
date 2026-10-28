const {createInterface} = require('node:readline/promises');
const {stdin, stdout} = require('node:process');

async function main(){
const rl = createInterface({input: stdin, output: stdout});

for(let i = 1; i<= 100; i++){

    console.log(`${i}`);
}
rl.close();
}
main();
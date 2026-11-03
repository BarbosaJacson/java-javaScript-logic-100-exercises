const { createInterface } = require('node:readline/promises');
const { stdin, stdout } = require('node:process');
const console = require('node:console');

async function main() {
    const rl = createInterface({ input: stdin, output: stdout });

    for (let i = 1; i <= 100; i++) {

        if (i % 2 == 0) {

            console.log(i);
        }
    }
    rl.close();
}
main();
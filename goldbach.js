function ehPrimo(n) {
    if (n <= 1) return false;
    for (let i = 2; i * i <= n; i++) {
        if (n % i === 0) return false;
    }
    return true;
}

function main() {
    for (let i = 500; i <= 1000; i += 2) {
        let numeroPar = i;

        for (let p1 = 2; p1 <= numeroPar / 2; p1++) {
            let p2 = numeroPar - p1;

            if (ehPrimo(p1) && ehPrimo(p2)) {
                console.log(`${numeroPar} = ${p1} + ${p2}`);
                break;
            }
        }
    }
}

main();
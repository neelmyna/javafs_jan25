const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

const func = async() => {
    choice = 1;
    do {
        console.log('1:Start Watch, 2:Stop Watch, 3:Reset, 4:Print Duration');
        rl.question('Enter your choice: ', choice => {
            num = parseInt(choice);
            console.log(typeof(num), '   ', num);
            // rl.close()
        });
    }while(num != 0);
    rl.close();
}

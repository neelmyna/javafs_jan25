const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function StopWatch() {

    this.first = function () {
        console.log('From the first function')
    }

    this.second = function () {
        console.log('From the second function')
    }
}

function menu(choice) {
    switch(choice) {
        case 1 : sw.first(); break;
        case 2 : sw.second(); break;
        default: console.log('Invalid Choice'); choice = 0;
    }
    return choice;
}

const readChoice = (choice) => {
    rl.question('Enter your choice: ', choice => {
        rl.close()
    });
    return choice;
}

const startApp = async(choice) => {
    do {
        console.log('1:Start Watch, 2:Stop Watch, 3:Reset, 4:Print Duration')

        choice = await readChoice(choice);
        choice = await menu(parseInt(choice));
    }while(choice != 0);
}

const sw = new StopWatch();
startApp(100);

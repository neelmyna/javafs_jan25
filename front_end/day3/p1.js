const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});


function StopWatch() {
	let startTime = null, endTime = null, running = false, duration = 0;
	
	this.start = function() {
		if(running)
			throw new Error('Stop Watch already running')
		running = true;
		startTime = new Date();
	}
	
	this.stop = function() {
		if(!running)
			throw new Error('Stop Watch already stopped')
		running = false;
		endTime = new Date();
		seconds = endTime.getTime() - startTime.getTime() / 1000;
		duration += seconds;
	}
	
	this.reset = function() {
		startTime = null;
		endTime = null;
		running = false;
		duration = 0;
	}

	Object.defineProperty(this, 'duration', { 
		get: function() { return duration; }
	});
}

function menu(choice) {
	switch(choice) {
		case 1 : sw.start(); break;
		case 2 : sw.stop(); break;
		case 3 : sw.reset(); break;
		case 4 : console.log(sw.duration); break;
		default: console.log('Invalid Choice. End of program'); choice = 0;
	}
	return choice;
}

const startApp = function(choice) {

	do {
		console.log('1:Start Watch, 2:Stop Watch, 3:Reset, 4:Print Duration')

		rl.question('Enter your choice: ', choice => {
			choice = menu(parseInt(choice));
			rl.close()
		});
	}while(choice != 0);
}

const sw = new StopWatch()
startApp(0)

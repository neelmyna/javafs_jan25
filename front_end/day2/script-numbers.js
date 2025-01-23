var number_list = [];
function doAdd(){
    let number = parseInt(document.getElementById('number').value);
    number_list.push(number);
    let items = '';
    for(let n of number_list) {
        items = items + `<LI class="p-2 btn btn-primary m-2" 
                style="list-style-type:none;">${n}</LI>`
    }
    let numbers_html = `<UL class="d-flex flex-wrap">${items}</UL>`
    document.getElementById("numbers-list").innerHTML = numbers_html;
    document.getElementById('number').value = "";
    document.getElementById('number').focus();
}
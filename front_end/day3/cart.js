var cart = [];
function findAmount() {
    let qty = parseInt(document.getElementById("qty").value);
    let price = parseInt(document.getElementById("price").value);
    let amount = qty * price;
    document.getElementById("amount").value = amount;
}
function addItem() {
    let name = document.getElementById("name").value;
    let qty = parseInt(document.getElementById("qty").value);
    let price = parseInt(document.getElementById("price").value);
    let amount = parseInt(document.getElementById("amount").value);
    let product = {name:name,qty:qty, price:price,amount:amount};
    cart.push(product);
    // clear boxes
    document.getElementById("name").value = ""
    document.getElementById("qty").value = ""
    document.getElementById("price").value = ""
    document.getElementById("amount").value = ""
    // cart html
    let cart_rows = "";
    for(let prod of cart) {
        cart_rows = cart_rows + `<TR><TD>${prod.name}</TD>
                <TD>${prod.qty}</TD>
                <TD>${prod.price}</TD>
                <TD>${prod.amount}</TD>
                </TR>`;
    }
    let totalAmount = cart.reduce(function(sum,prod){
        return sum + parseInt(prod.amount);
    },0)
    let table = `<TABLE class="table table-border">
        <TR>    
            <TH>PRODUCT</TH>
            <TH>QTY</TH>
            <TH>PRICE</TH>
            <TH>AMOUNT</TH>       
        </TR>
        ${cart_rows}
        <TR>    
            <TH colspan="3">Total</TH>
            <TH>${totalAmount}</TH>       
        </TR>
        </TABLE>`
    document.getElementById("scart").innerHTML = table;
}
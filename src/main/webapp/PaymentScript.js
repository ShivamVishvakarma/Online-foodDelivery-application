var RazorpayOrderId;

const CreateOrderId = () => {
    var amount = document.getElementById("amount").value;
    var xhttp = new XMLHttpRequest();

    xhttp.open("GET", "http://localhost:8080/Payment-module_test/OrderCreation?amount=" + amount, true);
    xhttp.onreadystatechange = function() {
        if (this.readyState === 4) {
            if (this.status === 200) {
                RazorpayOrderId = this.responseText;
                console.log("Razorpay Order ID:", RazorpayOrderId); 
                OpenCheckout();
            } else {
                console.error("Error creating order:", this.status, this.responseText);
            }
        }
    };
    xhttp.send();
}

const OpenCheckout = () => {
    var options = {
        "key": "rzp_test_sTqCcxyqEhqktK",
        "name": "Yash Tech",
        "description": "Test Transaction",
        "order_id": RazorpayOrderId,

        "handler": function(response) {
         
            sendPaymentDetails(response.razorpay_payment_id, response.razorpay_order_id);
        },
        "prefill": {
            "name": "Gagan Shukla",
            "email": "gagan.shukla@yash.com",
            "contact": "8349061831"
        },
        "notes": {
            "address": "YIT Indore "
        },
        "theme": {
            "color": "#3399cc"
        }
    };

    var rzp1 = new Razorpay(options);
    rzp1.on('payment.failed', function(response) {
        alert(response.error.code);
        alert(response.error.description);
        alert(response.error.source);
        alert(response.error.step);
        alert(response.error.reason);
        alert(response.error.metadata.order_id);
        alert(response.error.metadata.payment_id);
    });

    rzp1.open();
}




const sendPaymentDetails = (paymentId, orderId) => {
	
	/*For sending payment id and order id to servlet*/
    var xhttp = new XMLHttpRequest();
    xhttp.open("POST", "http://localhost:8080/FoodDelivery/BillerCounter", true);
    xhttp.setRequestHeader("Content-Type", "application/json");

    var data = JSON.stringify({
        paymentId: paymentId,
        orderId: orderId
    });

    console.log("Sending payment details:", data); 

    xhttp.onreadystatechange = function() {
        if (this.readyState === 4) {
            if (this.status === 200) {
                console.log("Payment details sent successfully:", this.responseText);
            } else {
                console.error("Error sending payment details:", this.status, this.responseText);
            }
        }
    };
	console.log("Sending payment details:", data); 
    xhttp.send(data);
}
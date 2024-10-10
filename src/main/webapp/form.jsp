<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form</title>
<style>
        body {
            padding: 20px;
            background-color: #f4f4f9;
        }
        .main {
            width: 300px;
            margin: 0 auto;
            background-color: white;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        .form-group {
            margin-bottom: 15px;
        }
        label {
            display: block;
            margin-bottom: 5px;
        }
        input, select {
            width: 100%;
            padding: 8px;
            border-radius: 4px;
            border: 1px solid #ccc;
            box-sizing: border-box;
        }
        .hidden {
            display: none;
        }
        button {
            padding: 10px 15px;
            background-color: #28a745;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        button:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>

    <div class="main">
        <h2>Payment Form</h2>
        <form id="payment-form" action="payment" method="post">
            <div class="form-group">
                <label for="payer-name">Name of Payer:</label>
                <input type="text" id="payer-name" name="payer-name" required>
            </div>
            
            <div class="form-group">
                <label for="amount">Enter the Amount:</label>
                <input type="number" id="amount" name="amount" required>
            </div>
            
            
            <div class="form-group">
                <label for="payment-mode">Select Payment Mode:</label>
                <select id="payment-mode" name="payment-mode" required>
                    <option value="" disabled selected>Select Payment Mode</option>
                    <option value="card">Card</option>
                    <option value="upi">UPI</option>
                </select>
            </div>

            <!-- Card Details -->
            <div id="card-details" class="hidden">
                <div class="form-group">
                    <label for="card-number">Card Number:</label>
                    <input type="text" id="card-number" name="card-number" placeholder="XXXX-XXXX-XXXX-XXXX">
                </div>
                <div class="form-group">
                    <label for="expiry-date">Expiry Date:</label>
                    <input type="text" id="expiry-date" name="expiry-date" placeholder="MM/YY">
                </div>
                <div class="form-group">
                    <label for="cvv">CVV:</label>
                    <input type="password" id="cvv" name="cvv" placeholder="XXX">
                </div>
            </div>

            <!-- UPI Details -->
            <div id="upi-details" class="hidden">
                <div class="form-group">
                    <label for="upi-id">UPI ID:</label>
                    <input type="text" id="upi-id" name="upi-id" placeholder="example@upi">
                </div>
            </div>

            <button type="submit">Submit</button>
        </form>
    </div>

    <script>
        // JavaScript for dynamic form behavior
        const paymentModeSelect = document.getElementById('payment-mode');
        const cardDetails = document.getElementById('card-details');
        const upiDetails = document.getElementById('upi-details');

        paymentModeSelect.addEventListener('change', function () {
            if (this.value === 'card') {
                cardDetails.classList.remove('hidden');
                upiDetails.classList.add('hidden');
            } else if (this.value === 'upi') {
                cardDetails.classList.add('hidden');
                upiDetails.classList.remove('hidden');
            }
        });
    </script>

</body>
</html>
let displayValue = "";

// function to append the entered number or operand into display.
function appendToDisplay(value) {
    displayValue += value;
    document.getElementById("display").value = displayValue;
}

// function to clear the display.
function clearDisplay() {
    displayValue = "";
    document.getElementById("display").value = "";
}

// function to evaluate the expression.
function calculateResult() {
    try {
        displayValue = eval(displayValue);
        document.getElementById("display").value = displayValue;
    } catch (error) {
        document.getElementById("display").value = "Error";
    }
}

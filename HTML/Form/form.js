// JavaScript for survey form functionality
function submitForm() {
    const form = document.getElementById('surveyForm');
    if (form.checkValidity()) {
        displayPopup();
    } else {
        alert('Please fill out all the required fields.');
    }
}

document.getElementById('surveyForm').addEventListener('submit', function (e) {
    e.preventDefault();
});

function resetForm() {
    document.getElementById('surveyForm').reset();
}

function displayPopup() {
    const data = {
        'First Name': document.getElementById('First-Name').value,
        'Last Name': document.getElementById('Last-name').value,
        'Date of Birth': document.getElementById('dob').value,
        'Country': document.getElementById('country').value,
        'Gender': getSelectedGender(),
        'Profession': document.getElementById('profession').value,
        'Email': document.getElementById('email').value,
        'Mobile Number': document.getElementById('mobile').value,
    };

    const popup = document.getElementById('popup');
    const popupData = document.getElementById('popup-data');

    popupData.innerHTML = '';
    for (const key in data) {
        if (data[key]) {
            const div = document.createElement('div');
            div.innerHTML = `<strong>${key}:</strong> ${data[key]}`;
            popupData.appendChild(div);
        }
    }

    popup.style.display = 'block';
}

function closePopup() {
    document.getElementById('popup').style.display = 'none';
}

function getSelectedGender() {
    const radioButtons = document.getElementsByName('gender');
    for (const radioButton of radioButtons) {
        if (radioButton.checked) {
            return radioButton.value;
        }
    }
    return 'Not specified';
}

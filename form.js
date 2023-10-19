function submitForm() {
    // Get values from the form
    var firstName = document.getElementById('first-name').value;
    var lastName = document.getElementById('last-name').value;
    var dateOfBirth = document.getElementById('date-of-birth').value;
    var country = document.getElementById('country').value;
    var gender = document.getElementById('male').checked ? 'Male' : '';
    gender += document.getElementById('female').checked ? ' Female' : '';
    var profession = document.getElementById('profession').value;
    var email = document.getElementById('email').value;
    var mobile = document.getElementById('mobile').value;

    // Display the results in a popup
    var resultText = "First Name: " + firstName + "<br>" +
                     "Last Name: " + lastName + "<br>" +
                     "Date of Birth: " + dateOfBirth + "<br>" +
                     "Country: " + country + "<br>" +
                     "Gender: " + gender + "<br>" +
                     "Profession: " + profession + "<br>" +
                     "Email: " + email + "<br>" +
                     "Mobile Number: " + mobile;

    document.getElementById('result').innerHTML += resultText;
    document.getElementById('popup').classList.remove('hidden');
}

function resetForm() {
    document.getElementById('survey-form').reset();
}

function closePopup() {
    document.getElementById('popup').classList.add('hidden');
    var firstName = document.getElementById('first-name')
    firstName.value = ""
    var lastName = document.getElementById('last-name')
    lastName.value = ""
    var dateOfBirth = document.getElementById('date-of-birth')
    dateOfBirth.value =""
    var country = document.getElementById('country')
    country.value = ""
    var gender = document.getElementById('male')
    gender.checked = false
    var gender1 = document.getElementById('female')
    gender1.checked = false
    var profession = document.getElementById('profession')
    profession.value =""
    var email = document.getElementById('email')
    email.value = ""
    var mobile = document.getElementById('mobile')
    mobile.value = ""

}

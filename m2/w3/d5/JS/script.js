
let card_1 = document.querySelector('#card_1');
let card_2 = document.querySelector('#card_2');

let userList = fetch('users.json')
.then((response) => response.json())
.then((data) => {

    let image_card_1 = document.createElement('img');
    let image_card_2 = document.createElement('img');
    let name_card_1 = document.createElement('p');
    let name_card_2 = document.createElement('p');
    let email_card_1 = document.createElement('a');
    let email_card_2 = document.createElement('a');
    
    image_card_1.src = data[0].profileURL;
    image_card_2.src = data[1].profileURL;
    name_card_1.innerHTML = data[0].firstName + ' ' + data[0].lastName;
    name_card_2.innerHTML = data[1].firstName + ' ' + data[1].lastName;
    email_card_1.innerHTML = data[0].email;
    email_card_2.innerHTML = data[1].email;

    card_1.appendChild(image_card_1);
    card_1.appendChild(name_card_1);
    card_1.appendChild(email_card_1);
    card_2.appendChild(image_card_2);
    card_2.appendChild(name_card_2);
    card_2.appendChild(email_card_2);

});


$(async function () {
    await getUser();
})

const userService = {
    head: {
        'Accept': 'application/json',
        'Content-Type': 'application/json',
        'Referer': null
    },
    getUser: async () => await fetch("/user")
}

async function getUser() {
    let table = $("#mainUser");
    table.empty();

    await userService.getUser()
        .then(res => res.json())
        .then(user => {
            let tableMainUser = `$(
            <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.lastName}</td>
                <td>${user.age}</td> 
                <td>${user.email}</td>
                <td>${user.roles.name}</td>    
            </tr>
            )`;
            table.append(tableMainUser);
        })
}
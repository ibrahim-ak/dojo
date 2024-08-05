// The import line will look different than what is in Faker's documentation
// because we are working with an express application
const { faker } = require("@faker-js/faker");
// we can create a function to return a random / fake "Product"
const createUser = () => {
  const newFakeUser = {
    id:  faker.string.uuid(),
    firstName: faker.person.firstName(),
    lastName: faker.person.lastName(),
    phoneNumber: faker.phone.number(),
    email: faker.internet.email(),
    password: faker.internet.password(),
  };
  return newFakeUser;
};

const createCompany = () => {
  const newFakeCompany = {
    id:  faker.string.uuid(),
    name: faker.company.name(),
    address: {
      street: faker.location.street(),
      city: faker.location.city(),
      state: faker.location.state(),
      zipCode: faker.location.zipCode(),
      country: faker.location.country(),
    },
  };
  return newFakeCompany;
};



const express = require("express");
const app = express();
const port = 8000;

app.get("/api/user/new", (req, res) => {
  res.send(
    createUser()
  );
});

app.get("/api/company/new", (req, res) => {
  res.send(
    createCompany()
  );
});
app.get("/api/company/user", (req, res) => {
  res.send({
    company:createCompany(),
    user:createUser()

  }
  );
});


app.listen(port, () => console.log(`Listening on port: ${port}`));

/*
 * The output of the above console log will look like this
 * {
 *   name: 'Anime Figure',
 *   price: '$568.00
 *   department: 'Tools'
 * }
 */

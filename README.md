This is a sample Spring boot app to demonstrate the mapping of a JSON property store in a MYSQL JSON column.

## How to run?
The repository includes a docker-compose.yml file which can be used to build/run the application and it will run an instance of MySql database.

It will also insert a record (seed data) in `ITEMS` table.

The following command will build the application:

`$ docker-compose build `

To run the app use the following command:

`$ docker-compose up`

The app container will exist after it finish running, and you should see the output in the terminal.
![Run Result][./images/result.png]
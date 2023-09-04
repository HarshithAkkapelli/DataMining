# navigate to the backend directory
cd backend

# install dependencies using Maven
mvn clean install

# run the application
mvn spring-boot:run

# navigate to the frontend directory
cd ../frontend

# install dependencies using npm
npm install

# run the application
npm start

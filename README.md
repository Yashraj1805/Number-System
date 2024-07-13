
# Decimal and Binary Converter
![image](https://github.com/Adarshnayak21/Number-System-Conversion/assets/135255697/a31778b2-6d6c-4033-9bc0-c3a5d253cb43)



This project is a web application that allows users to convert decimal numbers to binary and binary numbers to decimal. The application is built using Spring Boot for the backend and HTML, CSS, and JavaScript for the frontend.

## Features

- **Decimal to Binary Conversion**: Enter a decimal number and get its binary equivalent.
- **Binary to Decimal Conversion**: Enter a binary number and get its decimal equivalent.
- **User-Friendly Interface**: Clean and simple design for easy use.

## Technologies Used

- **Backend**: Spring Boot
- **Frontend**: HTML, CSS, JavaScript

## How It Works

1. **Decimal to Binary**:
   - Input a decimal number.
   - Click the "Convert" button to get the binary representation.
  
2. **Binary to Decimal**:
   - Input a binary number.
   - Click the "Convert" button to get the decimal representation.

## Project Structure

- **src/main/java/com/example/conversion**: Contains the Java files for the Spring Boot application.
  - `ConversionApplication.java`: Main application class to run the Spring Boot application.
    ![image](https://github.com/MohdWaqar98/Number-System-Conversion/assets/98345819/e1d9e0d6-88a7-4a98-83a6-385271595b96)

  - `ConversionController.java`: REST controller to handle conversion requests.
    ![image](https://github.com/MohdWaqar98/Number-System-Conversion/assets/98345819/597f5e83-4638-478e-9f96-da4fe453a06d)

  - `ConversionService.java`: Service class containing the conversion logic.
    ![image](https://github.com/MohdWaqar98/Number-System-Conversion/assets/98345819/0e8b5efd-0dc9-4466-aa72-06b08dc106c5)

  
- **src/main/resources/static**: Contains the static files for the frontend.
  - `index.html`: Main HTML file for the user interface.
  - `style.css`: CSS file for styling the web page.

## Running the Application

To run the application, follow these steps:

1. Clone the repository:
   ```sh
   git clone <repository_url>
   ```

2. Navigate to the project directory:
   ```sh
   cd <project_directory>
   ```

3. Build and run the application:
   ```sh
   ./mvnw spring-boot:run
   ```
   -You can run this application manually in the terminal by clicking "Run in Java".
   ![image](https://github.com/MohdWaqar98/Number-System-Conversion/assets/98345819/a4109372-284f-40a9-88c5-963b47cc0f4d)


5. Open your web browser and go to `http://localhost:8080` to use the converter.

## Usage

- **Decimal to Binary**:
  1. Enter a decimal number in the input field.
  2. Click the "Convert" button.
  3. The binary equivalent will be displayed.

- **Binary to Decimal**:
  1. Enter a binary number in the input field.
  2. Click the "Convert" button.
  3. The decimal equivalent will be displayed.

## Contributions

Contributions are welcome! Feel free to open issues or submit pull requests.

# ATM Interface App - README



## Introduction

Welcome to the ATM Interface App! This Java application provides a beginner-level graphical interface for an ATM (Automated Teller Machine) simulation. It utilizes the Swing framework to create a user-friendly interface and connects to a MySQL database to store and manage user account information.

The ATM Interface App allows users to perform basic banking operations, including checking their account balance, making withdrawals, and depositing funds.

## Requirements

To run the ATM Interface App, you need the following:

- Java Development Kit (JDK) 8 or later installed on your system.
- MySQL database server installed and running.
- MySQL Java Connector (JDBC) library to interact with the database.
- A Java IDE (such as Eclipse, IntelliJ IDEA, or NetBeans) or a text editor to view and edit the source code.
- Basic knowledge of Java programming and Swing framework.

## Installation

1. Clone the project repository from GitHub:
```
   git clone https://github.com/your-username/atm-interface-app.git
```

2. Alternatively, you can download the ZIP archive and extract it to your preferred location.

3. Set up the MySQL database by running the provided SQL script (`atm_database.sql`). This script will create the necessary database, tables, and sample account data.

4. Make sure to include the MySQL Java Connector (JDBC) library in your project's build path.

## Usage

1. Open the project in your Java IDE.

2. Navigate to the `src` directory and locate the `ATMApp.java` file.

3. Compile and run the `ATMApp.java` file to launch the ATM Interface App.

4. The application will prompt you to enter your account number and PIN to log in.

5. After successful login, you will be presented with the main menu, which includes the following options:

   - Check Balance: View your account balance.
   - Withdraw: Withdraw funds from your account.
   - Deposit: Deposit funds into your account.
   - Exit: Log out and exit the application.

6. Follow the on-screen instructions to navigate through the interface and perform desired banking operations.

7. All transactions will be securely recorded in the MySQL database.

## Contributing

We welcome contributions to improve the ATM Interface App! If you find any bugs, have feature requests, or want to improve the code, feel free to submit issues or pull requests to the [GitHub repository](https://github.com/your-username/atm-interface-app).

When contributing, please follow the existing code style and ensure that your changes do not disrupt the application's basic functionality.


---

Thank you for using the ATM Interface App! We hope you find this application helpful for practicing basic Java programming, Swing framework, and database interactions. If you have any questions or feedback, don't hesitate to reach out to us. Happy banking!
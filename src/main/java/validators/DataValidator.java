package validators;

import javax.swing.*;

public class DataValidator {

    public static boolean checkDataLength(JTextField inputJTextField,
                                          JLabel inputJLabel,
                                          int requiredLength) {

        final String value = inputJTextField.getText();

        if (value == null || value.length() < requiredLength) {

            inputJLabel.setText(String.format("Text should be at least %d symbols", requiredLength));
            return false;
        }

        return true;
    }

    public static boolean checkEmailFormat(JTextField inputJTextField, JLabel inputJLabel) {

        final String value = inputJTextField.getText();

        if (value == null || !value.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.com")) {

            inputJLabel.setText("Wrong email format");
            return false;
        }

        return true;
    }

    public static boolean checkUsernameFormat(JTextField inputJTextField, JLabel inputJLabel) {

        final String value = inputJTextField.getText();

        if (value == null || !value.matches("^[a-zA-Z0-9_.-]*$")) {

            inputJLabel.setText("Wrong username format");
            return false;
        }

        return true;
    }

    public static boolean checkPersonNameFormat(JTextField inputJTextField, JLabel inputJLabel) {

        final String value = inputJTextField.getText();

        if (value == null || !value.matches("^[a-zA-Z]*$")) {

            inputJLabel.setText("Wrong name format");
            return false;
        }

        return true;
    }

    public static boolean isFieldEmpty(JTextField inputJTextField, JLabel inputJLabel, String text) {

        final String value = inputJTextField.getText();
        if (value == null || value.isEmpty()) {

            inputJLabel.setText( text + " is empty");
            return false;
        }
        return true;
    }

    public static boolean isFieldEmpty(JTextField inputJTextField, JLabel inputJLabel) {

        final String value = inputJTextField.getText();
        if (value == null || value.isEmpty()) {

            inputJLabel.setText("The field is empty");
            return false;
        }
        return true;
    }

    public static boolean isTextNumeric(JTextField inputJTextField, JLabel inputJLabel) {

        final String value = inputJTextField.getText();

        if (value == null || !value.matches("[0-9]+")) {

            inputJLabel.setText("The field must contain only numbers");
            return false;

        }

        return true;
    }

    public static boolean isTextAlphabetical(JTextField inputJTextField, JLabel inputJLabel) {

        final String value = inputJTextField.getText();

        if (value == null || !value.matches("[a-z A-Z]+")) {

            inputJLabel.setText("The field must contain only alphabetical characters");
            return false;
        }

        return true;
    }
}

package validators;

import javax.swing.*;

public class FieldValidator {

    public static boolean validateAlphabetical(JTextField field, JLabel validationJLabel) {

        validationJLabel.setText("");

        if (!DataValidator.isFieldEmpty(field, validationJLabel))
            return false;

        if (!DataValidator.isTextAlphabetical(field, validationJLabel))
            return false;

        return true;
    }

    public static boolean validateEmail(JTextField field, JLabel validationJLabel) {

        validationJLabel.setText("");

        if (!DataValidator.isFieldEmpty(field, validationJLabel))
            return false;

        if (!DataValidator.checkEmailFormat(field, validationJLabel))
            return false;

        return true;
    }

    public static boolean comparePassword(JTextField password, JTextField confirmPassword, JLabel validationJLabel) {

        validationJLabel.setText("");

        final String passwordValue = password.getText();
        final String confirmPasswordValue = confirmPassword.getText();

        if (!passwordValue.equals(confirmPasswordValue)) {

            validationJLabel.setText("Passwords are not the same");
            return false;
        }

        return true;
    }

    public static boolean validateNumericField(JTextField field, JLabel validationJLabel) {

        validationJLabel.setText("");

        if (!DataValidator.isFieldEmpty(field, validationJLabel))
            return false;

        if (!DataValidator.isTextNumeric(field, validationJLabel))
            return false;

        return true;
    }

    public static boolean validateFieldLength(JTextField field, JLabel validationJLabel, int length) {

        validationJLabel.setText("");

        if (!DataValidator.isFieldEmpty(field, validationJLabel))
            return false;

        if (!DataValidator.checkDataLength(field, validationJLabel, length))
            return false;

        return true;
    }

    public static boolean validateUsername(JTextField field, JLabel validationJLabel) {

        validationJLabel.setText("");

        if (!DataValidator.isFieldEmpty(field, validationJLabel))
            return false;

        if (!DataValidator.checkUsernameFormat(field, validationJLabel))
            return false;

        return true;
    }

    public static boolean validatePersonName(JTextField field, JLabel validationJLabel) {

        validationJLabel.setText("");

        if (!DataValidator.isFieldEmpty(field, validationJLabel))
            return false;

        if (!DataValidator.checkPersonNameFormat(field, validationJLabel))
            return false;

        return true;
    }
}

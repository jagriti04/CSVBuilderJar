package com.bl.csvbuilder;

public class CSVException extends Exception {

    public enum ExceptionType {
        CENSUS_FILE_PROBLEM, WRONG_CENSUS_CSV_FILE,
        STATE_CODE_FILE_PROBLEM, WRONG_STATE_CODE_FILE,
        NO_CENSUS_DATA, NO_STATE_CODE_DATA,
        UNABLE_TO_PARSE;
    }

    public ExceptionType type;

    public CSVException(String message, ExceptionType type) {
        super(message);
        this.type = type;
    }

    public CSVException(String message, ExceptionType type, Throwable cause) {
        super(message, cause);
        this.type = type;
    }
}

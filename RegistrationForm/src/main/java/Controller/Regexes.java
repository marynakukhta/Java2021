package Controller;

public interface Regexes {
    String REGEX_NAME_UKR = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";
    String REGEX_NAME_LAT = "^[A-Z][a-z]{1,20}$";
    String REGEX_LOGIN = "^[A-Za-z0-9_-]{8,20}$";
}

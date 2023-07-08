package sem3.homework;
public class Contact {
    private String surname;
    private String name;
    private String patronymic;
    private String date;
    private String phoneNumber;
    private String sex;
    /**
     * @param surname Фамилия
     * @param name Имя
     * @param patronymic Отчество
     * @param date День рождения
     * @param phoneNumber Номер телефона
     * @param sex Пол
     */
    public Contact(String surname, String name, String patronymic, String date, String phoneNumber, String sex) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.date = date;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    @Override
    public String toString() {
        return String.format("<%s><%s><%s><%s><%s><%s>",
                getSurname(), getName(), getPatronymic(), getDate(), getPhoneNumber(), getSex());
    }
}


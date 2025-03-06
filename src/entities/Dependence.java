package entities;

import java.time.LocalDateTime;

public class Dependence {
    private LocalDateTime date;
    private CommonUser userResponsible;

    public Dependence() {
    }

    public Dependence(LocalDateTime date, CommonUser userResponsible) {
        this.date = date;
        this.userResponsible = userResponsible;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public CommonUser getUserResponsible() {
        return userResponsible;
    }

    public void setUserResponsible(CommonUser userResponsible) {
        this.userResponsible = userResponsible;
    }

}

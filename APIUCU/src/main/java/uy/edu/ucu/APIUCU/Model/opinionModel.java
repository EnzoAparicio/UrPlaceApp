package uy.edu.ucu.APIUCU.Model;

public class opinionModel {
    private int code;
    private int codeUser;
    private char comment;
    private int star;
    private int like;

    public opinionModel(int code, int codeUser, char comment, int star, int like) {
        this.code = code;
        this.codeUser = codeUser;
        this.comment = comment;
        this.star = star;
        this.like = like;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCodeUser() {
        return codeUser;
    }

    public void setCodeUser(int codeUser) {
        this.codeUser = codeUser;
    }

    public char getComment() {
        return comment;
    }

    public void setComment(char comment) {
        this.comment = comment;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

}

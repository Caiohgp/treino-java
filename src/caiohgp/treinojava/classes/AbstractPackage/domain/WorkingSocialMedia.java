package caiohgp.treinojava.classes.AbstractPackage.domain;

public enum WorkingSocialMedia {
    INSTAGRAM(1,"Instagram"),
    FACEBOOK(2,"Facebook"),
    LINKEDIN(3,"Linkedin");

    private int idSocialMedia;
    private String socialMedia;

    WorkingSocialMedia(int idSocialMedia,String socialMedia){
        this.idSocialMedia = idSocialMedia;
        this.socialMedia = socialMedia;
    }

    public int getIdSocialMedia() {
        return idSocialMedia;
    }

    public String getSocialMedia() {
        return socialMedia;
    }
}

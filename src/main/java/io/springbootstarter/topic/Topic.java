package io.springbootstarter.topic;

public class Topic {
    private String lang;
    private String frameWork;
    private String desc;

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getFrameWork() {
        return frameWork;
    }

    public void setFrameWork(String frameWork) {
        this.frameWork = frameWork;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Topic(String lang, String frameWork, String desc) {
        this.lang = lang;
        this.frameWork = frameWork;
        this.desc = desc;
    }
}

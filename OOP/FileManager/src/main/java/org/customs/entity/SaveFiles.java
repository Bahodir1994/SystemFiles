package org.customs.entity;

public class SaveFiles {
    private String id;
    private String name;
    private String type;
    private String originalName;
    private String hash;

    private String fileUrl;

    public SaveFiles() {
    }

    public SaveFiles(String id, String name, String type, String originalName, String hash, String fileUrl) {
        this.name = name;
        this.type = type;
        this.originalName = originalName;
        this.hash = hash;
        this.fileUrl = fileUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }
}

package com.spark.api.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product implements Serializable{
    @Id
    @JsonProperty("id")
    private ObjectId _id;
    @JsonProperty("productName")
    private String productName;
    @JsonProperty("imeiNumber")
    private String imeiNumber;
    @JsonProperty("serialNumber")
    private String serialNumber;
    @JsonProperty("description")
    private String description;
    @JsonProperty("image")
    private String image;

    public Product(){

    }

    public Product(String name, String description, String imeiNumber, String imageUrl) {
        this.productName = name;
        this.description = description;
        this.imeiNumber = imeiNumber;
        this.image = imageUrl;
    }

    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getImeiNumber() {
        return imeiNumber;
    }

    public void setImeiNumber(String imeiNumber) {
        this.imeiNumber = imeiNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

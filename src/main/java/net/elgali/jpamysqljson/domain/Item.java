package net.elgali.jpamysqljson.domain;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Formula;

@Entity
@Table(name = "ITEMS")
public class Item {

  @Id
  private Long id;

  @Column(name = "TITLE")
  private String title;

  @Column(name = "JSON_DATA")
  private String data;  // JSON raw data

  @Formula("JSON_DATA->>'$.description'")
  private String description;

  @Formula("JSON_DATA->>'$.price'")
  private BigDecimal price;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }
}

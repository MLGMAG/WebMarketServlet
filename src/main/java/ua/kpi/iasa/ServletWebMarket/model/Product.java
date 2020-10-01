package ua.kpi.iasa.ServletWebMarket.model;

import com.sun.org.apache.xpath.internal.operations.Or;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
@Entity
@Table(name = "product")
public class Product {
    @Id
    private UUID id;
    private String name;
    private String description;
    private BigDecimal price;
    private LocalDate addingDate;
    private Color color;
    private double size;
    @ManyToMany(targetEntity = Order.class)
    private List<Order> orderList;
    @ManyToMany(targetEntity = Bucket.class)
    private List<Bucket> bucketList;

    public Product() {
    }

    public Product(UUID id, String name, String description, BigDecimal price, LocalDate addingDate, Color color, double size, List<Order> orderList, List<Bucket> bucketList) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.addingDate = addingDate;
        this.color = color;
        this.size = size;
        this.orderList = orderList;
        this.bucketList = bucketList;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public LocalDate getAddingDate() {
        return addingDate;
    }

    public void setAddingDate(LocalDate addingDate) {
        this.addingDate = addingDate;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public List<Bucket> getBucketList() {
        return bucketList;
    }

    public void setBucketList(List<Bucket> bucketList) {
        this.bucketList = bucketList;
    }
}

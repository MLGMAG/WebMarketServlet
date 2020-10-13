package ua.kpi.iasa.ServletWebMarket.dao;

import ua.kpi.iasa.ServletWebMarket.model.Color;
import ua.kpi.iasa.ServletWebMarket.model.Product;

import java.util.List;
import java.util.UUID;

public interface ProductDao extends GenericDao<Product, UUID> {
    Product getByName(String name);
    List<Product> getByColor(Color color);
}

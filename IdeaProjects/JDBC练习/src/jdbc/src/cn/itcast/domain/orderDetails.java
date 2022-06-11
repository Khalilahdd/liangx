package jdbc.src.cn.itcast.domain;

/*
    用来封装OrderDetails表数据的JavaBean
 */
public class orderDetails {

    private int OrderID;
    private int  ProductID;
    private double UnitPrice;
    private int Quantity;
    private double Discount;

    @Override
    public String toString() {
        return "orderDetails{" +
                "OrderID=" + OrderID +
                ", ProductID=" + ProductID +
                ", UnitPrice=" + UnitPrice +
                ", Quantity=" + Quantity +
                ", Discount=" + Discount +
                '}';
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int orderID) {
        OrderID = orderID;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int productID) {
        ProductID = productID;
    }

    public double getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        UnitPrice = unitPrice;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public double getDiscount() {
        return Discount;
    }

    public void setDiscount(double discount) {
        Discount = discount;
    }
}

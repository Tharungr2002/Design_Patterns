package Com.LLD.Behavioral.State;

class OrderContext {
    OrderState orderState;
    OrderContext() {
        this.orderState = new OrderPlacedState();
    }

    void setState(OrderState orderState) {
        this.orderState = orderState;
    }

    void next() {
        orderState.next(this);
    }
    void cancel() {
        orderState.cancelOrder(this);
    }
    String getCurrentState() {
        return orderState.getStateName();
    }
}

interface OrderState {
    void next(OrderContext orderContext);
    void cancelOrder(OrderContext orderContext);
    String getStateName();
}

class OrderPlacedState implements OrderState {
    @Override
    public void next(OrderContext orderContext) {
        orderContext.setState(new PreparingState());
        System.out.println("next to neext state preparing");
    }
    @Override
    public void cancelOrder(OrderContext orderContext) {
        orderContext.setState(new CancelledState());
        System.out.println("cancelled");
    }
    @Override
    public String getStateName() {
        return "Order state";
    }
}
class PreparingState implements OrderState {
    @Override
    public void next(OrderContext orderContext) {
        orderContext.setState(new DeliveryState());
        System.out.println("next to neext state delivery");
    }
    @Override
    public void cancelOrder(OrderContext orderContext) {
        orderContext.setState(new CancelledState());
        System.out.println("cancelled");
    }
    @Override
    public String getStateName() {
        return "preparing state";
    }
}

class DeliveryState implements OrderState {
    @Override
    public void next(OrderContext orderContext) {
        System.out.println("deliverd");
    }
    @Override
    public void cancelOrder(OrderContext orderContext) {
        System.out.println("cannot cancel");
    }
    @Override
    public String getStateName() {
        return "Delivery sttate";
    }
}

class CancelledState implements OrderState {
    public void next(OrderContext context) {
        System.out.println("Cancelled order cannot move to next state.");
    }

    public void cancelOrder(OrderContext context) {
        System.out.println("Order is already cancelled.");
    }

    public String getStateName() {
        return "CANCELLED";
    }
}
class Main {
    public static void main(String[] args) {
        OrderContext order1 = new OrderContext();
        order1.next();
        order1.next();
        System.out.println(order1.getCurrentState());
        order1.cancel();
    }
}

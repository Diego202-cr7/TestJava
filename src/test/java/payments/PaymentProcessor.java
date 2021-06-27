package payments;

public class PaymentProcessor {

    private PaymentGateway paymentGateway;

    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }


    public boolean makePayment(double omount) {
        PaymentResponse response = paymentGateway.requestPayment(new PaymentRequest(omount));
        if (response.getStatus() == PaymentResponse.PaymentStatus.OK) {
            return true;

        } else {
            return false;
        }
    }
}
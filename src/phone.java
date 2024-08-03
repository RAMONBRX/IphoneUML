public interface phone {
    void makeCall(String number);
    void receiveCall();
    void sendMessage(String number, String message);
    void receiveMessage(String message);
}
package LYAMBDA.Worker;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}

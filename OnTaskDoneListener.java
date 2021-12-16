package LYAMBDA.Worker;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}

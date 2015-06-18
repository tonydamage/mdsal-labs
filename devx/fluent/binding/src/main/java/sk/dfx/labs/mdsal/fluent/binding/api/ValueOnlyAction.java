package sk.dfx.labs.mdsal.fluent.binding.api;

public interface ValueOnlyAction<T> {

    void perform(T data);
}

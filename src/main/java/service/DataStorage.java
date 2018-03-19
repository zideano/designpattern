package service;

public abstract class DataStorage<T> {
    /**
     *
     * @param data
     */
    public abstract void insert(T data);

    /**
     *
     * @param data
     * @return
     */
    public abstract boolean find(T data);

    /**
     *
     */
    public abstract void traverse();
}

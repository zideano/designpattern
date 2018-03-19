package service;

public abstract class DataStorage<T> {
    public abstract void insert(T data);
    public abstract boolean find(T data);
    public abstract void traverse();
}

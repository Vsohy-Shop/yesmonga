package com.google.maps.android.clustering.algo;

import com.google.maps.android.clustering.C33763b;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.google.maps.android.clustering.algo.a */
public abstract class C33751a<T extends C33763b> implements C33752b<T> {

    /* renamed from: a */
    public final ReadWriteLock f81888a = new ReentrantReadWriteLock();

    public void lock() {
        this.f81888a.writeLock().lock();
    }

    public void unlock() {
        this.f81888a.writeLock().unlock();
    }
}

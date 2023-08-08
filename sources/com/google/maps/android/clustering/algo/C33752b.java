package com.google.maps.android.clustering.algo;

import com.google.maps.android.clustering.C33750a;
import com.google.maps.android.clustering.C33763b;
import java.util.Collection;
import java.util.Set;

/* renamed from: com.google.maps.android.clustering.algo.b */
public interface C33752b<T extends C33763b> {
    /* renamed from: b */
    Collection<T> mo98037b();

    /* renamed from: c */
    boolean mo98038c(Collection<T> collection);

    /* renamed from: d */
    void mo98039d();

    /* renamed from: e */
    boolean mo98040e(T t);

    /* renamed from: g */
    void mo98041g(int i);

    /* renamed from: h */
    Set<? extends C33750a<T>> mo98042h(float f);

    /* renamed from: i */
    boolean mo98043i(T t);

    /* renamed from: j */
    boolean mo98044j(Collection<T> collection);

    /* renamed from: k */
    int mo98045k();

    /* renamed from: l */
    boolean mo98046l(T t);

    void lock();

    void unlock();
}

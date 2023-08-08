package com.google.firebase.components;

import com.google.firebase.inject.C33058b;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.firebase.components.z */
public class C32612z<T> implements C33058b<Set<T>> {

    /* renamed from: a */
    public volatile Set<C33058b<T>> f79117a = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: b */
    public volatile Set<T> f79118b = null;

    public C32612z(Collection<C33058b<T>> collection) {
        this.f79117a.addAll(collection);
    }

    /* renamed from: b */
    public static C32612z<?> m131768b(Collection<C33058b<?>> collection) {
        return new C32612z<>((Set) collection);
    }

    /* renamed from: a */
    public synchronized void mo94761a(C33058b<T> bVar) {
        if (this.f79118b == null) {
            this.f79117a.add(bVar);
        } else {
            this.f79118b.add(bVar.get());
        }
    }

    /* renamed from: c */
    public Set<T> get() {
        if (this.f79118b == null) {
            synchronized (this) {
                if (this.f79118b == null) {
                    this.f79118b = Collections.newSetFromMap(new ConcurrentHashMap());
                    mo94763d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f79118b);
    }

    /* renamed from: d */
    public final synchronized void mo94763d() {
        for (C33058b<T> bVar : this.f79117a) {
            this.f79118b.add(bVar.get());
        }
        this.f79117a = null;
    }
}

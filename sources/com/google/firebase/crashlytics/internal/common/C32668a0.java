package com.google.firebase.crashlytics.internal.common;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.firebase.crashlytics.internal.common.a0 */
public final class C32668a0 {

    /* renamed from: a */
    public final AtomicInteger f79287a = new AtomicInteger();

    /* renamed from: b */
    public final AtomicInteger f79288b = new AtomicInteger();

    /* renamed from: a */
    public int mo94849a() {
        return this.f79288b.get();
    }

    /* renamed from: b */
    public int mo94850b() {
        return this.f79287a.get();
    }

    /* renamed from: c */
    public void mo94851c() {
        this.f79288b.getAndIncrement();
    }

    /* renamed from: d */
    public void mo94852d() {
        this.f79287a.getAndIncrement();
    }

    /* renamed from: e */
    public void mo94853e() {
        this.f79288b.set(0);
    }
}

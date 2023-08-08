package com.google.android.datatransport.runtime.time;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.datatransport.runtime.time.c */
public class C40311c implements C40309a {

    /* renamed from: a */
    public final AtomicLong f102677a;

    public C40311c(long j) {
        this.f102677a = new AtomicLong(j);
    }

    /* renamed from: a */
    public void mo132977a(long j) {
        if (j >= 0) {
            this.f102677a.addAndGet(j);
            return;
        }
        throw new IllegalArgumentException("cannot advance time backwards.");
    }

    /* renamed from: b */
    public void mo132978b() {
        mo132977a(1);
    }

    public long getTime() {
        return this.f102677a.get();
    }
}

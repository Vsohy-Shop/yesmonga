package com.google.android.play.core.splitcompat;

import java.util.Set;

/* renamed from: com.google.android.play.core.splitcompat.q */
public final class C32149q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Set f78383a;

    /* renamed from: b */
    public final /* synthetic */ C32133a f78384b;

    public C32149q(C32133a aVar, Set set) {
        this.f78384b = aVar;
        this.f78383a = set;
    }

    public final void run() {
        try {
            for (String n : this.f78383a) {
                this.f78384b.f78357a.mo92899n(n);
            }
        } catch (Exception unused) {
        }
    }
}

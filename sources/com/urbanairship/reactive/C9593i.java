package com.urbanairship.reactive;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.reactive.i */
public class C9593i<T> extends C9551d<T> implements C9586e<T> {

    /* renamed from: b */
    public final ArrayList<C9586e<T>> f26241b = new ArrayList<>();

    /* renamed from: c */
    public boolean f26242c = false;

    /* renamed from: d */
    public Exception f26243d;

    /* renamed from: com.urbanairship.reactive.i$a */
    public class C9594a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C9586e f26244a;

        public C9594a(C9586e eVar) {
            this.f26244a = eVar;
        }

        public void run() {
            if (C9593i.this.mo19504A()) {
                C9593i.this.f26241b.remove(this.f26244a);
            }
        }
    }

    @C0359n0
    /* renamed from: y */
    public static <T> C9593i<T> m35933y() {
        return new C9593i<>();
    }

    /* renamed from: A */
    public synchronized boolean mo19504A() {
        boolean z;
        if (this.f26241b.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: B */
    public synchronized boolean mo19505B() {
        return this.f26242c;
    }

    /* renamed from: a */
    public synchronized void mo19470a(@C0359n0 Exception exc) {
        this.f26243d = exc;
        Iterator it = new ArrayList(this.f26241b).iterator();
        while (it.hasNext()) {
            ((C9586e) it.next()).mo19470a(exc);
        }
    }

    /* renamed from: b */
    public synchronized void mo19471b() {
        this.f26242c = true;
        Iterator it = new ArrayList(this.f26241b).iterator();
        while (it.hasNext()) {
            ((C9586e) it.next()).mo19471b();
        }
    }

    /* renamed from: c */
    public synchronized void mo17490c(@C0359n0 T t) {
        Iterator it = new ArrayList(this.f26241b).iterator();
        while (it.hasNext()) {
            ((C9586e) it.next()).mo17490c(t);
        }
    }

    @C0359n0
    /* renamed from: u */
    public synchronized C9596k mo19467u(@C0359n0 C9586e<T> eVar) {
        if (!mo19505B() && !mo19506z()) {
            this.f26241b.add(eVar);
        }
        return C9596k.m35944b(new C9594a(eVar));
    }

    /* renamed from: z */
    public synchronized boolean mo19506z() {
        boolean z;
        if (this.f26243d != null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }
}

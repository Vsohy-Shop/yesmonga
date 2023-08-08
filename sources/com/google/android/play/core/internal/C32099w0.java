package com.google.android.play.core.internal;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.play.core.internal.w0 */
public final class C32099w0 {

    /* renamed from: a */
    public final ConcurrentHashMap<C32096v0, List<Throwable>> f78312a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b */
    public final ReferenceQueue<Throwable> f78313b = new ReferenceQueue<>();

    /* renamed from: a */
    public final List<Throwable> mo92840a(Throwable th) {
        while (true) {
            Reference<? extends Throwable> poll = this.f78313b.poll();
            if (poll == null) {
                break;
            }
            this.f78312a.remove(poll);
        }
        List<Throwable> list = this.f78312a.get(new C32096v0(th, (ReferenceQueue<Throwable>) null));
        if (list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f78312a.putIfAbsent(new C32096v0(th, this.f78313b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}

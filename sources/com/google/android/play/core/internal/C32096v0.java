package com.google.android.play.core.internal;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.play.core.internal.v0 */
public final class C32096v0 extends WeakReference<Throwable> {

    /* renamed from: a */
    public final int f78306a;

    public C32096v0(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.f78306a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C32096v0.class) {
            if (this == obj) {
                return true;
            }
            C32096v0 v0Var = (C32096v0) obj;
            return this.f78306a == v0Var.f78306a && get() == v0Var.get();
        }
    }

    public final int hashCode() {
        return this.f78306a;
    }
}

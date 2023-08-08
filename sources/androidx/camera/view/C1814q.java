package androidx.camera.view;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.camera.view.q */
public final /* synthetic */ class C1814q {
    /* renamed from: a */
    public static /* synthetic */ boolean m7242a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}

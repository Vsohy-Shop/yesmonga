package kotlinx.coroutines.debug.internal;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.jvm.C11287e;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.debug.internal.g */
public final class C11791g<T> extends WeakReference<T> {
    @C11287e

    /* renamed from: a */
    public final int f29254a;

    public C11791g(T t, @C12580l ReferenceQueue<T> referenceQueue) {
        super(t, referenceQueue);
        int i;
        if (t != null) {
            i = t.hashCode();
        } else {
            i = 0;
        }
        this.f29254a = i;
    }
}

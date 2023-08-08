package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.C11394v;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlinx.coroutines.s */
public final class C12093s extends C11721c0 {
    @C12579k

    /* renamed from: c */
    public static final AtomicIntegerFieldUpdater f29747c = AtomicIntegerFieldUpdater.newUpdater(C12093s.class, "_resumed");
    @C11394v
    private volatile int _resumed;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C12093s(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<?> r3, @org.jetbrains.annotations.C12580l java.lang.Throwable r4, boolean r5) {
        /*
            r2 = this;
            if (r4 != 0) goto L_0x001d
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Continuation "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " was cancelled normally"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
        L_0x001d:
            r2.<init>(r4, r5)
            r3 = 0
            r2._resumed = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C12093s.<init>(kotlin.coroutines.c, java.lang.Throwable, boolean):void");
    }

    /* renamed from: c */
    public final boolean mo24581c() {
        return f29747c.compareAndSet(this, 0, 1);
    }
}

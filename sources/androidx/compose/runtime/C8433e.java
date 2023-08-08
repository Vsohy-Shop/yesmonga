package androidx.compose.runtime;

import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.e */
public final class C8433e {
    @C12579k

    /* renamed from: a */
    public final AtomicInteger f22797a;

    public C8433e(int i) {
        this.f22797a = new AtomicInteger(i);
    }

    /* renamed from: a */
    public final int mo15561a(int i) {
        return this.f22797a.addAndGet(i);
    }

    /* renamed from: b */
    public final int mo15562b() {
        return this.f22797a.get();
    }

    @C12579k
    /* renamed from: c */
    public final AtomicInteger mo15563c() {
        return this.f22797a;
    }

    /* renamed from: d */
    public final void mo15564d(int i) {
        this.f22797a.set(i);
    }
}

package androidx.camera.core.internal;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.core.impl.C1455g1;
import androidx.camera.core.impl.Config;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.internal.f */
public interface C1613f extends C1455g1 {

    /* renamed from: t */
    public static final Config.C1421a<Executor> f4539t = Config.C1421a.m5980a("camerax.core.thread.backgroundExecutor", Executor.class);

    /* renamed from: androidx.camera.core.internal.f$a */
    public interface C1614a<B> {
        @C0359n0
        /* renamed from: e */
        B mo5052e(@C0359n0 Executor executor);
    }

    @C0363p0
    /* renamed from: U */
    Executor mo5603U(@C0363p0 Executor executor) {
        return (Executor) mo5131h(f4539t, executor);
    }

    @C0359n0
    /* renamed from: Y */
    Executor mo5604Y() {
        return (Executor) mo5125b(f4539t);
    }
}

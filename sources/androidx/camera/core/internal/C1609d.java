package androidx.camera.core.internal;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.core.impl.C1455g1;
import androidx.camera.core.impl.Config;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.internal.d */
public interface C1609d extends C1455g1 {

    /* renamed from: q */
    public static final Config.C1421a<Executor> f4536q = Config.C1421a.m5980a("camerax.core.io.ioExecutor", Executor.class);

    /* renamed from: androidx.camera.core.internal.d$a */
    public interface C1610a<B> {
        @C0359n0
        /* renamed from: e */
        B mo4854e(@C0359n0 Executor executor);
    }

    @C0363p0
    /* renamed from: J */
    Executor mo5241J(@C0363p0 Executor executor) {
        return (Executor) mo5131h(f4536q, executor);
    }

    @C0359n0
    /* renamed from: P */
    Executor mo5242P() {
        return (Executor) mo5125b(f4536q);
    }
}

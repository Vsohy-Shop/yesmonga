package kotlinx.coroutines.scheduling;

import kotlin.C11532s0;
import kotlin.jvm.C11287e;
import org.jetbrains.annotations.C12579k;

@C11532s0
/* renamed from: kotlinx.coroutines.scheduling.j */
public abstract class C12110j implements Runnable {
    @C11287e

    /* renamed from: a */
    public long f29817a;
    @C12579k
    @C11287e

    /* renamed from: b */
    public C12111k f29818b;

    public C12110j(long j, @C12579k C12111k kVar) {
        this.f29817a = j;
        this.f29818b = kVar;
    }

    /* renamed from: a */
    public final int mo24667a() {
        return this.f29818b.mo24658L();
    }

    public C12110j() {
        this(0, C12114n.f29829i);
    }
}

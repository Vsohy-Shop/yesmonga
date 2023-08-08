package androidx.compose.runtime;

import java.util.concurrent.CancellationException;
import kotlin.C11532s0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12079p0;
import org.jetbrains.annotations.C12579k;

@C11532s0
/* renamed from: androidx.compose.runtime.w */
public final class C8690w implements C8616s1 {
    @C12579k

    /* renamed from: a */
    public final C12074o0 f23265a;

    public C8690w(@C12579k C12074o0 o0Var) {
        Intrinsics.checkNotNullParameter(o0Var, "coroutineScope");
        this.f23265a = o0Var;
    }

    @C12579k
    /* renamed from: a */
    public final C12074o0 mo16831a() {
        return this.f23265a;
    }

    /* renamed from: d */
    public void mo8797d() {
    }

    /* renamed from: e */
    public void mo8799e() {
        C12079p0.m48265f(this.f23265a, (CancellationException) null, 1, (Object) null);
    }

    /* renamed from: g */
    public void mo8800g() {
        C12079p0.m48265f(this.f23265a, (CancellationException) null, 1, (Object) null);
    }
}

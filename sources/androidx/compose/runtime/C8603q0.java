package androidx.compose.runtime;

import androidx.compose.runtime.collection.C8419d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.runtime.q0 */
public final class C8603q0 {
    @C12579k

    /* renamed from: a */
    public final RecomposeScopeImpl f23038a;

    /* renamed from: b */
    public final int f23039b;
    @C12580l

    /* renamed from: c */
    public C8419d<Object> f23040c;

    public C8603q0(@C12579k RecomposeScopeImpl recomposeScopeImpl, int i, @C12580l C8419d<Object> dVar) {
        Intrinsics.checkNotNullParameter(recomposeScopeImpl, "scope");
        this.f23038a = recomposeScopeImpl;
        this.f23039b = i;
        this.f23040c = dVar;
    }

    @C12580l
    /* renamed from: a */
    public final C8419d<Object> mo16290a() {
        return this.f23040c;
    }

    /* renamed from: b */
    public final int mo16291b() {
        return this.f23039b;
    }

    @C12579k
    /* renamed from: c */
    public final RecomposeScopeImpl mo16292c() {
        return this.f23038a;
    }

    /* renamed from: d */
    public final boolean mo16293d() {
        return this.f23038a.mo15219v(this.f23040c);
    }

    /* renamed from: e */
    public final void mo16294e(@C12580l C8419d<Object> dVar) {
        this.f23040c = dVar;
    }
}

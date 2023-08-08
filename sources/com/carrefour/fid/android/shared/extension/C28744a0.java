package com.carrefour.fid.android.shared.extension;

import androidx.compose.runtime.internal.C8567o;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11952u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.extension.a0 */
public final class C28744a0<T> implements C11907e<T> {

    /* renamed from: b */
    public static final int f70402b = 8;
    @C12579k

    /* renamed from: a */
    public final C11907e<T> f70403a;

    public C28744a0(@C12579k C11907e<? extends T> eVar) {
        Intrinsics.checkNotNullParameter(eVar, "flow");
        this.f70403a = eVar;
    }

    @C12580l
    public Object collect(@C12579k C11908f<? super T> fVar, @C12579k C11045c<? super C11079d2> cVar) {
        return this.f70403a.collect(fVar, cVar);
    }

    @C12580l
    /* renamed from: g */
    public final Object mo83734g(@C12579k C12074o0 o0Var, @C12579k C11045c<? super C11952u<? extends T>> cVar) {
        return C11909g.m47389N1(this, o0Var, cVar);
    }

    @C12579k
    /* renamed from: h */
    public final C11907e<T> mo83735h() {
        return C11909g.m47462j0(this, 1);
    }
}

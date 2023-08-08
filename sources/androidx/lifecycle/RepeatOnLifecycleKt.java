package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12079p0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class RepeatOnLifecycleKt {
    @C12580l
    /* renamed from: a */
    public static final Object m90581a(@C12579k Lifecycle lifecycle, @C12579k Lifecycle.State state, @C12579k C11304p<? super C12074o0, ? super C11045c<? super C11079d2>, ? extends Object> pVar, @C12579k C11045c<? super C11079d2> cVar) {
        boolean z;
        if (state != Lifecycle.State.INITIALIZED) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
        } else if (lifecycle.mo57465b() == Lifecycle.State.DESTROYED) {
            return C11079d2.f28267a;
        } else {
            Object g = C12079p0.m48266g(new RepeatOnLifecycleKt$repeatOnLifecycle$3(lifecycle, state, pVar, (C11045c<? super RepeatOnLifecycleKt$repeatOnLifecycle$3>) null), cVar);
            if (g == C11063b.m42612h()) {
                return g;
            }
            return C11079d2.f28267a;
        }
    }

    @C12580l
    /* renamed from: b */
    public static final Object m90582b(@C12579k C19499w wVar, @C12579k Lifecycle.State state, @C12579k C11304p<? super C12074o0, ? super C11045c<? super C11079d2>, ? extends Object> pVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object a = m90581a(wVar.getLifecycle(), state, pVar, cVar);
        return a == C11063b.m42612h() ? a : C11079d2.f28267a;
    }
}

package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.C2855v;
import androidx.compose.runtime.C8592o;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.functions.C11306r;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C2607o
@C2855v
public interface LazyStaggeredGridScope {
    /* renamed from: a */
    static /* synthetic */ void m11666a(LazyStaggeredGridScope lazyStaggeredGridScope, Object obj, Object obj2, C2617v vVar, C11305q qVar, int i, Object obj3) {
        if (obj3 == null) {
            if ((i & 1) != 0) {
                obj = null;
            }
            if ((i & 2) != 0) {
                obj2 = null;
            }
            if ((i & 4) != 0) {
                vVar = null;
            }
            lazyStaggeredGridScope.mo8891d(obj, obj2, vVar, qVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
    }

    /* renamed from: c */
    static /* synthetic */ void m11667c(LazyStaggeredGridScope lazyStaggeredGridScope, int i, C11300l lVar, C11300l lVar2, C11300l lVar3, C11306r rVar, int i2, Object obj) {
        C11300l lVar4;
        C11300l lVar5;
        if (obj == null) {
            if ((i2 & 2) != 0) {
                lVar4 = null;
            } else {
                lVar4 = lVar;
            }
            if ((i2 & 4) != 0) {
                lVar2 = LazyStaggeredGridScope$items$1.f6819f;
            }
            C11300l lVar6 = lVar2;
            if ((i2 & 8) != 0) {
                lVar5 = null;
            } else {
                lVar5 = lVar3;
            }
            lazyStaggeredGridScope.mo8890b(i, lVar4, lVar6, lVar5, rVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
    }

    /* renamed from: b */
    void mo8890b(int i, @C12580l C11300l<? super Integer, ? extends Object> lVar, @C12579k C11300l<? super Integer, ? extends Object> lVar2, @C12580l C11300l<? super Integer, C2617v> lVar3, @C12579k C11306r<? super C2598g, ? super Integer, ? super C8592o, ? super Integer, C11079d2> rVar);

    @C2855v
    /* renamed from: d */
    void mo8891d(@C12580l Object obj, @C12580l Object obj2, @C12580l C2617v vVar, @C12579k C11305q<? super C2598g, ? super C8592o, ? super Integer, C11079d2> qVar);
}

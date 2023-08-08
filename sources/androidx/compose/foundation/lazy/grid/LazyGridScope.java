package androidx.compose.foundation.lazy.grid;

import androidx.compose.runtime.C8592o;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.functions.C11306r;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C2503r
public interface LazyGridScope {
    /* renamed from: b */
    static /* synthetic */ void m11050b(LazyGridScope lazyGridScope, Object obj, C11300l lVar, Object obj2, C11305q qVar, int i, Object obj3) {
        if (obj3 == null) {
            if ((i & 1) != 0) {
                obj = null;
            }
            if ((i & 2) != 0) {
                lVar = null;
            }
            if ((i & 4) != 0) {
                obj2 = null;
            }
            lazyGridScope.mo8465a(obj, lVar, obj2, qVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
    }

    /* renamed from: c */
    static /* synthetic */ void m11051c(LazyGridScope lazyGridScope, int i, C11300l lVar, C11304p pVar, C11300l lVar2, C11306r rVar, int i2, Object obj) {
        C11300l lVar3;
        C11304p pVar2;
        if (obj == null) {
            if ((i2 & 2) != 0) {
                lVar3 = null;
            } else {
                lVar3 = lVar;
            }
            if ((i2 & 4) != 0) {
                pVar2 = null;
            } else {
                pVar2 = pVar;
            }
            if ((i2 & 8) != 0) {
                lVar2 = LazyGridScope$items$1.f6518f;
            }
            lazyGridScope.mo8466d(i, lVar3, pVar2, lVar2, rVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
    }

    /* renamed from: a */
    void mo8465a(@C12580l Object obj, @C12580l C11300l<? super C2497l, C2488d> lVar, @C12580l Object obj2, @C12579k C11305q<? super C2496k, ? super C8592o, ? super Integer, C11079d2> qVar);

    /* renamed from: d */
    void mo8466d(int i, @C12580l C11300l<? super Integer, ? extends Object> lVar, @C12580l C11304p<? super C2497l, ? super Integer, C2488d> pVar, @C12579k C11300l<? super Integer, ? extends Object> lVar2, @C12579k C11306r<? super C2496k, ? super Integer, ? super C8592o, ? super Integer, C11079d2> rVar);
}

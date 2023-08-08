package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.C2567t;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.internal.C8553b;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLazyStaggeredGridScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridScope.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"})
public final class LazyStaggeredGridScopeImpl implements LazyStaggeredGridScope {
    @C12579k

    /* renamed from: a */
    public final C2567t<C2595d> f6820a = new C2567t<>();

    /* renamed from: b */
    public void mo8890b(int i, @C12580l C11300l<? super Integer, ? extends Object> lVar, @C12579k C11300l<? super Integer, ? extends Object> lVar2, @C12580l C11300l<? super Integer, C2617v> lVar3, @C12579k C11306r<? super C2598g, ? super Integer, ? super C8592o, ? super Integer, C11079d2> rVar) {
        Intrinsics.checkNotNullParameter(lVar2, "contentType");
        Intrinsics.checkNotNullParameter(rVar, "itemContent");
        this.f6820a.mo8813c(i, new C2595d(lVar, lVar2, lVar3, rVar));
    }

    /* renamed from: d */
    public void mo8891d(@C12580l Object obj, @C12580l Object obj2, @C12580l C2617v vVar, @C12579k C11305q<? super C2598g, ? super C8592o, ? super Integer, C11079d2> qVar) {
        LazyStaggeredGridScopeImpl$item$1$1 lazyStaggeredGridScopeImpl$item$1$1;
        LazyStaggeredGridScopeImpl$item$3$1 lazyStaggeredGridScopeImpl$item$3$1;
        Intrinsics.checkNotNullParameter(qVar, "content");
        if (obj != null) {
            lazyStaggeredGridScopeImpl$item$1$1 = new LazyStaggeredGridScopeImpl$item$1$1(obj);
        } else {
            lazyStaggeredGridScopeImpl$item$1$1 = null;
        }
        LazyStaggeredGridScopeImpl$item$2 lazyStaggeredGridScopeImpl$item$2 = new LazyStaggeredGridScopeImpl$item$2(obj2);
        if (vVar != null) {
            lazyStaggeredGridScopeImpl$item$3$1 = new LazyStaggeredGridScopeImpl$item$3$1(vVar);
        } else {
            lazyStaggeredGridScopeImpl$item$3$1 = null;
        }
        mo8890b(1, lazyStaggeredGridScopeImpl$item$1$1, lazyStaggeredGridScopeImpl$item$2, lazyStaggeredGridScopeImpl$item$3$1, C8553b.m31049c(1700162468, true, new LazyStaggeredGridScopeImpl$item$4(qVar)));
    }

    @C12579k
    /* renamed from: e */
    public final C2567t<C2595d> mo8893e() {
        return this.f6820a;
    }
}

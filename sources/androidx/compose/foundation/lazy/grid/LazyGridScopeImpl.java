package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.C2567t;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.internal.C8553b;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLazyGridScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridScopeImpl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n1#2:77\n*E\n"})
public final class LazyGridScopeImpl implements LazyGridScope {
    @C12579k

    /* renamed from: a */
    public final C2567t<C2491g> f6519a = new C2567t<>();

    /* renamed from: b */
    public boolean f6520b;
    @C12579k

    /* renamed from: c */
    public final C11304p<C2497l, Integer, C2488d> f6521c = LazyGridScopeImpl$DefaultSpan$1.f6522f;

    /* renamed from: a */
    public void mo8465a(@C12580l Object obj, @C12580l C11300l<? super C2497l, C2488d> lVar, @C12580l Object obj2, @C12579k C11305q<? super C2496k, ? super C8592o, ? super Integer, C11079d2> qVar) {
        LazyGridScopeImpl$item$1$1 lazyGridScopeImpl$item$1$1;
        C11304p pVar;
        Intrinsics.checkNotNullParameter(qVar, "content");
        C2567t<C2491g> tVar = this.f6519a;
        if (obj != null) {
            lazyGridScopeImpl$item$1$1 = new LazyGridScopeImpl$item$1$1(obj);
        } else {
            lazyGridScopeImpl$item$1$1 = null;
        }
        if (lVar != null) {
            pVar = new LazyGridScopeImpl$item$2$1(lVar);
        } else {
            pVar = this.f6521c;
        }
        tVar.mo8813c(1, new C2491g(lazyGridScopeImpl$item$1$1, pVar, new LazyGridScopeImpl$item$3(obj2), C8553b.m31049c(-1504808184, true, new LazyGridScopeImpl$item$4(qVar))));
        if (lVar != null) {
            this.f6520b = true;
        }
    }

    /* renamed from: d */
    public void mo8466d(int i, @C12580l C11300l<? super Integer, ? extends Object> lVar, @C12580l C11304p<? super C2497l, ? super Integer, C2488d> pVar, @C12579k C11300l<? super Integer, ? extends Object> lVar2, @C12579k C11306r<? super C2496k, ? super Integer, ? super C8592o, ? super Integer, C11079d2> rVar) {
        C11304p pVar2;
        Intrinsics.checkNotNullParameter(lVar2, "contentType");
        Intrinsics.checkNotNullParameter(rVar, "itemContent");
        C2567t<C2491g> tVar = this.f6519a;
        if (pVar == null) {
            pVar2 = this.f6521c;
        } else {
            pVar2 = pVar;
        }
        tVar.mo8813c(i, new C2491g(lVar, pVar2, lVar2, rVar));
        if (pVar != null) {
            this.f6520b = true;
        }
    }

    /* renamed from: e */
    public final boolean mo8468e() {
        return this.f6520b;
    }

    @C12579k
    /* renamed from: f */
    public final C2567t<C2491g> mo8469f() {
        return this.f6519a;
    }

    /* renamed from: g */
    public final void mo8470g(boolean z) {
        this.f6520b = z;
    }
}

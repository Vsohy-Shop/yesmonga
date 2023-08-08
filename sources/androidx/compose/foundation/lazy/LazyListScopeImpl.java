package androidx.compose.foundation.lazy;

import androidx.compose.foundation.C2855v;
import androidx.compose.foundation.lazy.layout.C2539c;
import androidx.compose.foundation.lazy.layout.C2567t;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.internal.C8553b;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class LazyListScopeImpl implements LazyListScope {
    @C12579k

    /* renamed from: a */
    public final C2567t<C2516k> f6423a;
    @C12579k

    /* renamed from: b */
    public final C2539c<C2516k> f6424b;
    @C12580l

    /* renamed from: c */
    public List<Integer> f6425c;

    public LazyListScopeImpl() {
        C2567t<C2516k> tVar = new C2567t<>();
        this.f6423a = tVar;
        this.f6424b = tVar;
    }

    /* renamed from: c */
    public void mo8306c(@C12580l Object obj, @C12580l Object obj2, @C12579k C11305q<? super C2455e, ? super C8592o, ? super Integer, C11079d2> qVar) {
        LazyListScopeImpl$item$1 lazyListScopeImpl$item$1;
        Intrinsics.checkNotNullParameter(qVar, "content");
        C2567t<C2516k> tVar = this.f6423a;
        if (obj != null) {
            lazyListScopeImpl$item$1 = new LazyListScopeImpl$item$1(obj);
        } else {
            lazyListScopeImpl$item$1 = null;
        }
        tVar.mo8813c(1, new C2516k(lazyListScopeImpl$item$1, new LazyListScopeImpl$item$2(obj2), C8553b.m31049c(-735119482, true, new LazyListScopeImpl$item$3(qVar))));
    }

    @C2855v
    /* renamed from: h */
    public void mo8307h(@C12580l Object obj, @C12580l Object obj2, @C12579k C11305q<? super C2455e, ? super C8592o, ? super Integer, C11079d2> qVar) {
        Intrinsics.checkNotNullParameter(qVar, "content");
        List list = this.f6425c;
        if (list == null) {
            list = new ArrayList();
            this.f6425c = list;
        }
        list.add(Integer.valueOf(this.f6423a.getSize()));
        mo8306c(obj, obj2, qVar);
    }

    /* renamed from: k */
    public void mo8310k(int i, @C12580l C11300l<? super Integer, ? extends Object> lVar, @C12579k C11300l<? super Integer, ? extends Object> lVar2, @C12579k C11306r<? super C2455e, ? super Integer, ? super C8592o, ? super Integer, C11079d2> rVar) {
        Intrinsics.checkNotNullParameter(lVar2, "contentType");
        Intrinsics.checkNotNullParameter(rVar, "itemContent");
        this.f6423a.mo8813c(i, new C2516k(lVar, lVar2, rVar));
    }

    @C12579k
    /* renamed from: o */
    public final List<Integer> mo8313o() {
        List<Integer> list = this.f6425c;
        return list == null ? CollectionsKt__CollectionsKt.m40441E() : list;
    }

    @C12579k
    /* renamed from: p */
    public final C2539c<C2516k> mo8314p() {
        return this.f6424b;
    }
}

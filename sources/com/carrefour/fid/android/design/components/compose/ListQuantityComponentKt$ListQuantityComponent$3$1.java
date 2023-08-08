package com.carrefour.fid.android.design.components.compose;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.C8553b;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nListQuantityComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListQuantityComponent.kt\ncom/carrefour/fid/android/design/components/compose/ListQuantityComponentKt$ListQuantityComponent$3$1\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,133:1\n136#2,12:134\n*S KotlinDebug\n*F\n+ 1 ListQuantityComponent.kt\ncom/carrefour/fid/android/design/components/compose/ListQuantityComponentKt$ListQuantityComponent$3$1\n*L\n59#1:134,12\n*E\n"})
public final class ListQuantityComponentKt$ListQuantityComponent$3$1 extends Lambda implements C11300l<LazyListScope, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<Integer, C11079d2> $onClick;
    final /* synthetic */ List<Integer> $quantities;
    final /* synthetic */ int $selectedQuantity;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListQuantityComponentKt$ListQuantityComponent$3$1(List<Integer> list, int i, C11300l<? super Integer, C11079d2> lVar, int i2) {
        super(1);
        this.$quantities = list;
        this.$selectedQuantity = i;
        this.$onClick = lVar;
        this.$$dirty = i2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LazyListScope) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyColumn");
        List<Integer> list = this.$quantities;
        final int i = this.$selectedQuantity;
        C369591 r1 = new C11300l<Integer, Object>() {
            @C12579k
            public final Object invoke(int i) {
                boolean z = i == i;
                return i + "-" + z;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }
        };
        C11300l<Integer, C11079d2> lVar = this.$onClick;
        int i2 = this.$$dirty;
        int i3 = this.$selectedQuantity;
        lazyListScope.mo8310k(list.size(), new C36956x31c4fb7f(r1, list), new C36957x31c4fb80(C36955x31c4fb7e.f92299f, list), C8553b.m31049c(-632812321, true, new C36958x31c4fb81(list, lVar, i2, i3)));
    }
}

package com.carrefour.fid.android.product.presentation.p039ui.facet.details;

import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, mo22516d2 = {"<anonymous>", "", "T", "index", "", "invoke", "androidx/compose/foundation/lazy/grid/LazyGridDslKt$items$2"}, mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nLazyGridDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridDsl.kt\nandroidx/compose/foundation/lazy/grid/LazyGridDslKt$items$2\n*L\n1#1,493:1\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.facet.details.FacetFilterDetailsStatefulKt$FilterList$1$invoke$$inlined$items$default$2 */
public final class C27958x95a86f55 extends Lambda implements C11300l<Integer, Object> {
    final /* synthetic */ List $items;
    final /* synthetic */ C11300l $key;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27958x95a86f55(C11300l lVar, List list) {
        super(1);
        this.$key = lVar;
        this.$items = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    @C12579k
    public final Object invoke(int i) {
        return this.$key.invoke(this.$items.get(i));
    }
}

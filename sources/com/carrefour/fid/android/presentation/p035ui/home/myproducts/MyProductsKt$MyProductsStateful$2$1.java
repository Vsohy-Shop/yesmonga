package com.carrefour.fid.android.presentation.p035ui.home.myproducts;

import com.carrefour.fid.android.presentation.p035ui.home.myproducts.C24183a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.home.myproducts.MyProductsKt$MyProductsStateful$2$1 */
public final class MyProductsKt$MyProductsStateful$2$1 extends Lambda implements C11300l<C24183a, C11079d2> {
    final /* synthetic */ C11289a<C11079d2> $onMyFrequentPurchasesClick;
    final /* synthetic */ C11289a<C11079d2> $onMyListsClick;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MyProductsKt$MyProductsStateful$2$1(C11289a<C11079d2> aVar, C11289a<C11079d2> aVar2) {
        super(1);
        this.$onMyFrequentPurchasesClick = aVar;
        this.$onMyListsClick = aVar2;
    }

    /* renamed from: a */
    public final void mo70775a(@C12579k C24183a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "action");
        if (Intrinsics.areEqual((Object) aVar, (Object) C24183a.C24184a.f60489a)) {
            this.$onMyFrequentPurchasesClick.invoke();
        } else if (Intrinsics.areEqual((Object) aVar, (Object) C24183a.C24185b.f60491a)) {
            this.$onMyListsClick.invoke();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo70775a((C24183a) obj);
        return C11079d2.f28267a;
    }
}

package com.carrefour.fid.android.product.presentation.p039ui.list;

import com.carrefour.fid.android.domain.models.criteo.C38005g;
import com.carrefour.fid.android.domain.models.criteo.C38012n;
import com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/criteo/g;", "product", "", "position", "Lkotlin/d2;", "a", "(Lcom/carrefour/fid/android/domain/models/criteo/g;I)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.list.PlpDelegate$onViewCreated$appViewBinder$1 */
public final class PlpDelegate$onViewCreated$appViewBinder$1 extends Lambda implements C11304p<C38005g, Integer, C11079d2> {
    final /* synthetic */ PlpDelegate this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlpDelegate$onViewCreated$appViewBinder$1(PlpDelegate plpDelegate) {
        super(2);
        this.this$0 = plpDelegate;
    }

    /* renamed from: a */
    public final void mo81531a(@C12579k C38005g gVar, int i) {
        String m;
        Intrinsics.checkNotNullParameter(gVar, "product");
        this.this$0.mo81509o().sendIntent(new PlpViewModel.C28181c.C28183b(gVar, i));
        C38012n nVar = (C38012n) CollectionsKt___CollectionsKt.m40559R2(gVar.mo117432a(), i);
        if (nVar != null && (m = nVar.mo117557m()) != null) {
            this.this$0.mo81510p(m);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        mo81531a((C38005g) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }
}

package com.carrefour.fid.android.product.presentation.p039ui.list;

import androidx.navigation.fragment.C19736g;
import com.carrefour.fid.android.product.presentation.models.listable.C27684d;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Lcom/carrefour/fid/android/product/presentation/models/listable/d;", "banner", "Lkotlin/d2;", "a", "(Lcom/carrefour/fid/android/product/presentation/models/listable/d;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.list.PlpDelegate$onViewCreated$appViewBinder$2 */
public final class PlpDelegate$onViewCreated$appViewBinder$2 extends Lambda implements C11300l<C27684d, C11079d2> {
    final /* synthetic */ PlpDelegate this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlpDelegate$onViewCreated$appViewBinder$2(PlpDelegate plpDelegate) {
        super(1);
        this.this$0 = plpDelegate;
    }

    /* renamed from: a */
    public final void mo81532a(@C12579k C27684d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "banner");
        this.this$0.f67867e.mo80234k(dVar.mo80447i());
        this.this$0.f67866d.mo83835k(C19736g.m91827a(this.this$0.f67863a), dVar.mo80448j());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo81532a((C27684d) obj);
        return C11079d2.f28267a;
    }
}

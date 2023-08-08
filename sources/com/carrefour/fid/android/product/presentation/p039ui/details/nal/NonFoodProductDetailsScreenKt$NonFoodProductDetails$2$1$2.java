package com.carrefour.fid.android.product.presentation.p039ui.details.nal;

import com.carrefour.fid.android.product.presentation.p039ui.details.nal.C27870j;
import com.carrefour.fid.android.product.presentation.p039ui.details.views.C27934i;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.nal.NonFoodProductDetailsScreenKt$NonFoodProductDetails$2$1$2 */
public final class NonFoodProductDetailsScreenKt$NonFoodProductDetails$2$1$2 extends Lambda implements C11300l<C27934i, C11079d2> {
    final /* synthetic */ C11300l<C27870j, C11079d2> $actioner;
    final /* synthetic */ C27899o $productData;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NonFoodProductDetailsScreenKt$NonFoodProductDetails$2$1$2(C11300l<? super C27870j, C11079d2> lVar, C27899o oVar) {
        super(1);
        this.$actioner = lVar;
        this.$productData = oVar;
    }

    /* renamed from: a */
    public final void mo80856a(@C12579k C27934i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "it");
        this.$actioner.invoke(new C27870j.C27881h.C27883b(iVar.mo81350l(), this.$productData.mo81091j().mo118720b(), this.$productData.mo81091j(), (DefaultConstructorMarker) null));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo80856a((C27934i) obj);
        return C11079d2.f28267a;
    }
}

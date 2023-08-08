package com.carrefour.fid.android.product.presentation.p039ui.details.views;

import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.views.ProductDescriptionKt$ProductDescription$2$1$1 */
public final class ProductDescriptionKt$ProductDescription$2$1$1 extends Lambda implements C11300l<C16260h0, C11079d2> {
    final /* synthetic */ C27926a $descriptionItem;
    final /* synthetic */ C8700z0<Boolean> $shouldShowExpandButton$delegate;
    final /* synthetic */ C8700z0<Integer> $textMaxLines$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductDescriptionKt$ProductDescription$2$1$1(C27926a aVar, C8700z0<Boolean> z0Var, C8700z0<Integer> z0Var2) {
        super(1);
        this.$descriptionItem = aVar;
        this.$shouldShowExpandButton$delegate = z0Var;
        this.$textMaxLines$delegate = z0Var2;
    }

    /* renamed from: a */
    public final void mo81291a(@C12579k C16260h0 h0Var) {
        boolean z;
        Intrinsics.checkNotNullParameter(h0Var, "textLayoutResult");
        if (!ProductDescriptionKt.m117220c(this.$shouldShowExpandButton$delegate)) {
            C8700z0<Boolean> z0Var = this.$shouldShowExpandButton$delegate;
            if (h0Var.mo47060n() > 4) {
                z = true;
            } else {
                z = false;
            }
            ProductDescriptionKt.m117221d(z0Var, z);
        }
        ProductDescriptionKt.m117223f(this.$textMaxLines$delegate, this.$descriptionItem.mo81326e());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo81291a((C16260h0) obj);
        return C11079d2.f28267a;
    }
}

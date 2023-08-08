package com.carrefour.fid.android.presentation.p035ui.product.search;

import android.widget.Button;
import com.carrefour.fid.android.shared.extension.ViewKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.product.search.ProductSearchFragment$initListener$1$1$1 */
public final class ProductSearchFragment$initListener$1$1$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ Button $this_apply;
    final /* synthetic */ ProductSearchFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductSearchFragment$initListener$1$1$1(ProductSearchFragment productSearchFragment, Button button) {
        super(0);
        this.this$0 = productSearchFragment;
        this.$this_apply = button;
    }

    public final void invoke() {
        this.this$0.mo74326j1().mo79246u0();
        Button button = this.$this_apply;
        Intrinsics.checkNotNullExpressionValue(button, "invoke");
        ViewKt.m119012y(button);
    }
}

package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.presentation.p035ui.checkout.p036al.adapter.RecommendedProductsAdapter;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroid/graphics/Rect;", "scrollBounds", "Lkotlin/d2;", "a", "(Landroid/graphics/Rect;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1Fragment$initScrollListener$1$1 */
public final class CheckoutStep1Fragment$initScrollListener$1$1 extends Lambda implements C11300l<Rect, C11079d2> {
    final /* synthetic */ RecyclerView $it;
    final /* synthetic */ CheckoutStep1Fragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep1Fragment$initScrollListener$1$1(CheckoutStep1Fragment checkoutStep1Fragment, RecyclerView recyclerView) {
        super(1);
        this.this$0 = checkoutStep1Fragment;
        this.$it = recyclerView;
    }

    /* renamed from: a */
    public final void mo68209a(@C12579k Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "scrollBounds");
        RecommendedProductsAdapter S0 = this.this$0.mo68154b1();
        RecyclerView recyclerView = this.$it;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "it");
        S0.mo68360p(recyclerView, rect);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo68209a((Rect) obj);
        return C11079d2.f28267a;
    }
}

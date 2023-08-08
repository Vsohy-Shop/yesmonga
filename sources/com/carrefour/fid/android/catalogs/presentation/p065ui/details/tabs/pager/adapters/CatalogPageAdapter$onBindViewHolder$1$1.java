package com.carrefour.fid.android.catalogs.presentation.p065ui.details.tabs.pager.adapters;

import android.view.MotionEvent;
import com.carrefour.fid.android.domain.models.catalog.details.CatalogPage;
import com.ortiz.touchview.TouchImageView;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroid/view/MotionEvent;", "it", "Lkotlin/d2;", "invoke", "(Landroid/view/MotionEvent;)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.catalogs.presentation.ui.details.tabs.pager.adapters.CatalogPageAdapter$onBindViewHolder$1$1 */
public final class CatalogPageAdapter$onBindViewHolder$1$1 extends Lambda implements C11300l<MotionEvent, C11079d2> {
    final /* synthetic */ CatalogPage $catalogPage;
    final /* synthetic */ TouchImageView $this_apply;
    final /* synthetic */ CatalogPageAdapter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CatalogPageAdapter$onBindViewHolder$1$1(CatalogPageAdapter catalogPageAdapter, CatalogPage catalogPage, TouchImageView touchImageView) {
        super(1);
        this.this$0 = catalogPageAdapter;
        this.$catalogPage = catalogPage;
        this.$this_apply = touchImageView;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((MotionEvent) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "it");
        CatalogPageAdapter catalogPageAdapter = this.this$0;
        CatalogPage catalogPage = this.$catalogPage;
        TouchImageView touchImageView = this.$this_apply;
        Intrinsics.checkNotNullExpressionValue(touchImageView, "this@apply");
        catalogPageAdapter.mo130713s(catalogPage, touchImageView, motionEvent);
    }
}

package com.carrefour.fid.android.presentation.p035ui.home.catalogs;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.presentation.viewmodels.home.HomePageViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.home.catalogs.CatalogsKt$CatalogsStateful$1 */
public final class CatalogsKt$CatalogsStateful$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11289a<C11079d2> $onCatalogBannerClicked;
    final /* synthetic */ HomePageViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CatalogsKt$CatalogsStateful$1(HomePageViewModel homePageViewModel, C11289a<C11079d2> aVar, int i) {
        super(2);
        this.$viewModel = homePageViewModel;
        this.$onCatalogBannerClicked = aVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        CatalogsKt.m106263b(this.$viewModel, this.$onCatalogBannerClicked, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}

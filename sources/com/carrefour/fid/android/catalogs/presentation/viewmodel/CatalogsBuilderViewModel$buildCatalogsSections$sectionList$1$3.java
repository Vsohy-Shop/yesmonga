package com.carrefour.fid.android.catalogs.presentation.viewmodel;

import com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.C39675d;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class CatalogsBuilderViewModel$buildCatalogsSections$sectionList$1$3 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ boolean $isListEmpty;
    final /* synthetic */ CatalogsBuilderViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CatalogsBuilderViewModel$buildCatalogsSections$sectionList$1$3(CatalogsBuilderViewModel catalogsBuilderViewModel, boolean z) {
        super(0);
        this.this$0 = catalogsBuilderViewModel;
        this.$isListEmpty = z;
    }

    public final void invoke() {
        this.this$0.f101199e.mo130520h(this.$isListEmpty);
        this.this$0.emitEvent(C39675d.C39676a.C39677a.f101298a);
    }
}

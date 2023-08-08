package com.carrefour.fid.android.catalogs.presentation.viewmodel;

import com.carrefour.fid.android.catalogs.presentation.viewmodel.mvi.C39675d;
import com.carrefour.fid.android.domain.models.criteo.C37999a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class CatalogsBuilderViewModel$buildCatalogsSections$sectionList$1$4$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C37999a $criteo;
    final /* synthetic */ CatalogsBuilderViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CatalogsBuilderViewModel$buildCatalogsSections$sectionList$1$4$1(C37999a aVar, CatalogsBuilderViewModel catalogsBuilderViewModel) {
        super(0);
        this.$criteo = aVar;
        this.this$0 = catalogsBuilderViewModel;
    }

    public final void invoke() {
        String p = this.$criteo.mo117383p();
        if (p != null) {
            this.this$0.emitEvent(new C39675d.C39676a.C39678b(p));
        }
    }
}

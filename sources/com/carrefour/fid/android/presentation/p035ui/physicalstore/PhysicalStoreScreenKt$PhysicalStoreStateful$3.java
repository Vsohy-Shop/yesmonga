package com.carrefour.fid.android.presentation.p035ui.physicalstore;

import com.carrefour.fid.android.presentation.viewmodels.physicalstore.PhysicalStoreViewModel;
import com.carrefour.fid.android.tracking.physicalstore.C29018a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreScreenKt$PhysicalStoreStateful$3 */
public final class PhysicalStoreScreenKt$PhysicalStoreStateful$3 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ C29018a $analytics;
    final /* synthetic */ PhysicalStoreViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhysicalStoreScreenKt$PhysicalStoreStateful$3(C29018a aVar, PhysicalStoreViewModel physicalStoreViewModel) {
        super(0);
        this.$analytics = aVar;
        this.$viewModel = physicalStoreViewModel;
    }

    public final void invoke() {
        this.$analytics.sendTagScreenView();
        this.$viewModel.mo78800s0();
    }
}

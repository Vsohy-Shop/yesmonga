package com.carrefour.fid.android.presentation.p035ui.physicalstore;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.PhysicalStoreInfoViewModel;
import com.carrefour.fid.android.tracking.physicalstore.C29018a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreInfoScreenKt$PhysicalStoreInfoStateful$2 */
public final class PhysicalStoreInfoScreenKt$PhysicalStoreInfoStateful$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C29018a $analytics;
    final /* synthetic */ C11289a<C11079d2> $onBackPressed;
    final /* synthetic */ C11300l<String, C11079d2> $onRedirectToPhoneClicked;
    final /* synthetic */ C11289a<C11079d2> $onSeeAllServicesClicked;
    final /* synthetic */ C11289a<C11079d2> $onSeeOpeningClicked;
    final /* synthetic */ PhysicalStoreInfoViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhysicalStoreInfoScreenKt$PhysicalStoreInfoStateful$2(PhysicalStoreInfoViewModel physicalStoreInfoViewModel, C29018a aVar, C11289a<C11079d2> aVar2, C11289a<C11079d2> aVar3, C11289a<C11079d2> aVar4, C11300l<? super String, C11079d2> lVar, int i) {
        super(2);
        this.$viewModel = physicalStoreInfoViewModel;
        this.$analytics = aVar;
        this.$onBackPressed = aVar2;
        this.$onSeeAllServicesClicked = aVar3;
        this.$onSeeOpeningClicked = aVar4;
        this.$onRedirectToPhoneClicked = lVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        PhysicalStoreInfoScreenKt.m109438c(this.$viewModel, this.$analytics, this.$onBackPressed, this.$onSeeAllServicesClicked, this.$onSeeOpeningClicked, this.$onRedirectToPhoneClicked, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}

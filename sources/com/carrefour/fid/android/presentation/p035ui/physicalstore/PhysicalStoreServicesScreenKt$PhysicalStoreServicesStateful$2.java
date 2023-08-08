package com.carrefour.fid.android.presentation.p035ui.physicalstore;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.presentation.viewmodels.physicalstore.info.PhysicalStoreInfoViewModel;
import com.carrefour.fid.android.tracking.physicalstore.C29018a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.physicalstore.PhysicalStoreServicesScreenKt$PhysicalStoreServicesStateful$2 */
public final class PhysicalStoreServicesScreenKt$PhysicalStoreServicesStateful$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C29018a $analytics;
    final /* synthetic */ C11289a<C11079d2> $onBackPressed;
    final /* synthetic */ PhysicalStoreInfoViewModel $viewModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PhysicalStoreServicesScreenKt$PhysicalStoreServicesStateful$2(PhysicalStoreInfoViewModel physicalStoreInfoViewModel, C29018a aVar, C11289a<C11079d2> aVar2, int i) {
        super(2);
        this.$viewModel = physicalStoreInfoViewModel;
        this.$analytics = aVar;
        this.$onBackPressed = aVar2;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        PhysicalStoreServicesScreenKt.m109476c(this.$viewModel, this.$analytics, this.$onBackPressed, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}

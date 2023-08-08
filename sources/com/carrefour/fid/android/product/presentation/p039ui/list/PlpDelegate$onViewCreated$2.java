package com.carrefour.fid.android.product.presentation.p039ui.list;

import com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.list.PlpDelegate$onViewCreated$2 */
public /* synthetic */ class PlpDelegate$onViewCreated$2 extends FunctionReferenceImpl implements C11300l<PlpViewModel.C28174b, C11079d2> {
    public PlpDelegate$onViewCreated$2(Object obj) {
        super(1, obj, PlpDelegate.class, "handleState", "handleState(Lcom/carrefour/fid/android/product/presentation/viewmodel/list/PlpViewModel$UiState;)V", 0);
    }

    /* renamed from: d */
    public final void mo81529d(@C12579k PlpViewModel.C28174b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "p0");
        ((PlpDelegate) this.receiver).mo81514t(bVar);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo81529d((PlpViewModel.C28174b) obj);
        return C11079d2.f28267a;
    }
}

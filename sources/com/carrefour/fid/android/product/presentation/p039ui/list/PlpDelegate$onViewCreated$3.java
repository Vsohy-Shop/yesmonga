package com.carrefour.fid.android.product.presentation.p039ui.list;

import com.carrefour.fid.android.product.presentation.viewmodel.list.PlpViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.product.presentation.ui.list.PlpDelegate$onViewCreated$3 */
public /* synthetic */ class PlpDelegate$onViewCreated$3 extends FunctionReferenceImpl implements C11300l<PlpViewModel.C28170a, C11079d2> {
    public PlpDelegate$onViewCreated$3(Object obj) {
        super(1, obj, PlpDelegate.class, "handleEvent", "handleEvent(Lcom/carrefour/fid/android/product/presentation/viewmodel/list/PlpViewModel$UiEvent;)V", 0);
    }

    /* renamed from: d */
    public final void mo81530d(@C12579k PlpViewModel.C28170a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "p0");
        ((PlpDelegate) this.receiver).mo81511q(aVar);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo81530d((PlpViewModel.C28170a) obj);
        return C11079d2.f28267a;
    }
}

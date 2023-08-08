package com.carrefour.fid.android.presentation.viewmodels.scan;

import com.carrefour.fid.android.presentation.viewmodels.scan.mvi.C27402a;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.scan.BarcodeScannerViewModel", mo22502f = "BarcodeScannerViewModel.kt", mo22503i = {2}, mo22504l = {47, 45, 51}, mo22505m = "processIntent", mo22506n = {"this"}, mo22507s = {"L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class BarcodeScannerViewModel$processIntent$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BarcodeScannerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BarcodeScannerViewModel$processIntent$1(BarcodeScannerViewModel barcodeScannerViewModel, C11045c<? super BarcodeScannerViewModel$processIntent$1> cVar) {
        super(cVar);
        this.this$0 = barcodeScannerViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.processIntent((C27402a.C27413c) null, this);
    }
}

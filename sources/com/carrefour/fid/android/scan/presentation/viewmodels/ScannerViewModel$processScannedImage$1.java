package com.carrefour.fid.android.scan.presentation.viewmodels;

import androidx.camera.core.C1353a2;
import com.carrefour.fid.android.scan.core.constants.ScanType;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.scan.presentation.viewmodels.ScannerViewModel", mo22502f = "ScannerViewModel.kt", mo22503i = {0}, mo22504l = {27}, mo22505m = "processScannedImage", mo22506n = {"this"}, mo22507s = {"L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ScannerViewModel$processScannedImage$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ScannerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScannerViewModel$processScannedImage$1(ScannerViewModel scannerViewModel, C11045c<? super ScannerViewModel$processScannedImage$1> cVar) {
        super(cVar);
        this.this$0 = scannerViewModel;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo82284f0((C1353a2) null, (ScanType) null, this);
    }
}

package com.carrefour.fid.android.scan.presentation.p042ui;

import android.content.Context;
import androidx.camera.lifecycle.C1750f;
import com.carrefour.fid.android.scan.extension.CameraExtensionKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.scan.presentation.ui.ScannerFragment$handlerAnalyser$1", mo22502f = "ScannerFragment.kt", mo22503i = {}, mo22504l = {67}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.scan.presentation.ui.ScannerFragment$handlerAnalyser$1 */
public final class ScannerFragment$handlerAnalyser$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ ScannerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScannerFragment$handlerAnalyser$1(ScannerFragment scannerFragment, C11045c<? super ScannerFragment$handlerAnalyser$1> cVar) {
        super(2, cVar);
        this.this$0 = scannerFragment;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new ScannerFragment$handlerAnalyser$1(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        ScannerFragment scannerFragment;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            ScannerFragment scannerFragment2 = this.this$0;
            scannerFragment2.f68461g = scannerFragment2.mo82263X0();
            ScannerFragment scannerFragment3 = this.this$0;
            Context requireContext = scannerFragment3.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            this.L$0 = scannerFragment3;
            this.label = 1;
            Object a = CameraExtensionKt.m118235a(requireContext, this);
            if (a == h) {
                return h;
            }
            scannerFragment = scannerFragment3;
            obj = a;
        } else if (i == 1) {
            scannerFragment = (ScannerFragment) this.L$0;
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        scannerFragment.mo82262V0((C1750f) obj);
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ScannerFragment$handlerAnalyser$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}

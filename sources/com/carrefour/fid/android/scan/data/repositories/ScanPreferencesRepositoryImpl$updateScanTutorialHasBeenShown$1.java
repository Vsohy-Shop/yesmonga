package com.carrefour.fid.android.scan.data.repositories;

import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.scan.data.repositories.ScanPreferencesRepositoryImpl", mo22502f = "ScanPreferencesRepositoryImpl.kt", mo22503i = {0}, mo22504l = {14, 15}, mo22505m = "updateScanTutorialHasBeenShown-gIAlu-s", mo22506n = {"$this$updateScanTutorialHasBeenShown_gIAlu_s_u24lambda_u240"}, mo22507s = {"L$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ScanPreferencesRepositoryImpl$updateScanTutorialHasBeenShown$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ScanPreferencesRepositoryImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScanPreferencesRepositoryImpl$updateScanTutorialHasBeenShown$1(ScanPreferencesRepositoryImpl scanPreferencesRepositoryImpl, C11045c<? super ScanPreferencesRepositoryImpl$updateScanTutorialHasBeenShown$1> cVar) {
        super(cVar);
        this.this$0 = scanPreferencesRepositoryImpl;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object b = this.this$0.mo82215b(false, this);
        return b == C11063b.m42612h() ? b : Result.m38701a(b);
    }
}

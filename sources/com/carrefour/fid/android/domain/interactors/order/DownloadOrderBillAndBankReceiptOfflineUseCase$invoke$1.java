package com.carrefour.fid.android.domain.interactors.order;

import com.carrefour.fid.android.domain.interactors.order.DownloadOrderBillAndBankReceiptOfflineUseCase;
import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.domain.interactors.order.DownloadOrderBillAndBankReceiptOfflineUseCase", mo22502f = "DownloadOrderBillAndBankReceiptOfflineUseCase.kt", mo22503i = {}, mo22504l = {30, 32}, mo22505m = "invoke-gIAlu-s", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class DownloadOrderBillAndBankReceiptOfflineUseCase$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DownloadOrderBillAndBankReceiptOfflineUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DownloadOrderBillAndBankReceiptOfflineUseCase$invoke$1(DownloadOrderBillAndBankReceiptOfflineUseCase downloadOrderBillAndBankReceiptOfflineUseCase, C11045c<? super DownloadOrderBillAndBankReceiptOfflineUseCase$invoke$1> cVar) {
        super(cVar);
        this.this$0 = downloadOrderBillAndBankReceiptOfflineUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object e = this.this$0.m172977invokegIAlus((DownloadOrderBillAndBankReceiptOfflineUseCase.C37720a) null, this);
        return e == C11063b.m42612h() ? e : Result.m38701a(e);
    }
}

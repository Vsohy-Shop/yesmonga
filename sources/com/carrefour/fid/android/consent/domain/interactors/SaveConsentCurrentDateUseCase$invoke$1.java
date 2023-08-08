package com.carrefour.fid.android.consent.domain.interactors;

import kotlin.C11076d0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.consent.domain.interactors.SaveConsentCurrentDateUseCase", mo22502f = "SaveConsentCurrentDateUseCase.kt", mo22503i = {}, mo22504l = {12}, mo22505m = "invoke-IoAF18A", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SaveConsentCurrentDateUseCase$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SaveConsentCurrentDateUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SaveConsentCurrentDateUseCase$invoke$1(SaveConsentCurrentDateUseCase saveConsentCurrentDateUseCase, C11045c<? super SaveConsentCurrentDateUseCase$invoke$1> cVar) {
        super(cVar);
        this.this$0 = saveConsentCurrentDateUseCase;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object r2 = this.this$0.m172924invokeIoAF18A(this);
        return r2 == C11063b.m42612h() ? r2 : Result.m38701a(r2);
    }
}

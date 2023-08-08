package com.carrefour.fid.android.data.logm;

import com.carrefour.fid.android.data.logm.ParsingWithLog;
import com.carrefour.fid.android.domain.interactors.logm.C37694a;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.data.logm.ParsingWithLog$DefaultImpls", mo22502f = "ParsingWithLog.kt", mo22503i = {}, mo22504l = {19}, mo22505m = "sendLog", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ParsingWithLog$sendLog$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public ParsingWithLog$sendLog$1(C11045c<? super ParsingWithLog$sendLog$1> cVar) {
        super(cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ParsingWithLog.DefaultImpls.m149880a((ParsingWithLog) null, (C37694a) null, (String) null, this);
    }
}

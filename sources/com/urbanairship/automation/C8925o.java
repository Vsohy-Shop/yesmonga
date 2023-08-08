package com.urbanairship.automation;

import com.urbanairship.automation.C8823d;
import com.urbanairship.util.RetryingExecutor;

/* renamed from: com.urbanairship.automation.o */
public final /* synthetic */ class C8925o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C8928r f23916a;

    /* renamed from: b */
    public final /* synthetic */ C8996y f23917b;

    /* renamed from: c */
    public final /* synthetic */ C8823d.C8826c f23918c;

    /* renamed from: d */
    public final /* synthetic */ RetryingExecutor.C9634c[] f23919d;

    public /* synthetic */ C8925o(C8928r rVar, C8996y yVar, C8823d.C8826c cVar, RetryingExecutor.C9634c[] cVarArr) {
        this.f23916a = rVar;
        this.f23917b = yVar;
        this.f23918c = cVar;
        this.f23919d = cVarArr;
    }

    public final void run() {
        this.f23916a.m33145h0(this.f23917b, this.f23918c, this.f23919d);
    }
}

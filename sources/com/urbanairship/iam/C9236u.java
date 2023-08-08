package com.urbanairship.iam;

import com.urbanairship.automation.C8823d;
import com.urbanairship.util.RetryingExecutor;

/* renamed from: com.urbanairship.iam.u */
public final /* synthetic */ class C9236u implements RetryingExecutor.C9634c {

    /* renamed from: a */
    public final /* synthetic */ C9237v f25148a;

    /* renamed from: b */
    public final /* synthetic */ AdapterWrapper f25149b;

    /* renamed from: c */
    public final /* synthetic */ String f25150c;

    /* renamed from: d */
    public final /* synthetic */ C8823d.C8826c f25151d;

    public /* synthetic */ C9236u(C9237v vVar, AdapterWrapper adapterWrapper, String str, C8823d.C8826c cVar) {
        this.f25148a = vVar;
        this.f25149b = adapterWrapper;
        this.f25150c = str;
        this.f25151d = cVar;
    }

    public final RetryingExecutor.C9635d run() {
        return this.f25148a.m34699x(this.f25149b, this.f25150c, this.f25151d);
    }
}

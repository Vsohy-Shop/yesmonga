package com.urbanairship.iam;

import com.urbanairship.automation.C8823d;
import com.urbanairship.util.RetryingExecutor;

/* renamed from: com.urbanairship.iam.t */
public final /* synthetic */ class C9235t implements RetryingExecutor.C9634c {

    /* renamed from: a */
    public final /* synthetic */ C9237v f25144a;

    /* renamed from: b */
    public final /* synthetic */ String f25145b;

    /* renamed from: c */
    public final /* synthetic */ AdapterWrapper f25146c;

    /* renamed from: d */
    public final /* synthetic */ C8823d.C8826c f25147d;

    public /* synthetic */ C9235t(C9237v vVar, String str, AdapterWrapper adapterWrapper, C8823d.C8826c cVar) {
        this.f25144a = vVar;
        this.f25145b = str;
        this.f25146c = adapterWrapper;
        this.f25147d = cVar;
    }

    public final RetryingExecutor.C9635d run() {
        return this.f25144a.m34698w(this.f25145b, this.f25146c, this.f25147d);
    }
}

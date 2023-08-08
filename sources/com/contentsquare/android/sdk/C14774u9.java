package com.contentsquare.android.sdk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.u9 */
public final class C14774u9 implements C14502lc, C14448ja {

    /* renamed from: a */
    public final List<C14304e9> f36624a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a */
    public void mo35238a() {
    }

    /* renamed from: b */
    public void mo35646b(C14304e9 e9Var) {
        Intrinsics.checkNotNullParameter(e9Var, "newEvent");
        List<C14304e9> list = this.f36624a;
        Intrinsics.checkNotNullExpressionValue(list, "webviewEvents");
        synchronized (list) {
            this.f36624a.add(e9Var);
        }
    }

    /* renamed from: c */
    public List<C14304e9> mo35239c(C14507le leVar, long j) {
        List<C14304e9> Q5;
        Intrinsics.checkNotNullParameter(leVar, "viewLight");
        List<C14304e9> list = this.f36624a;
        Intrinsics.checkNotNullExpressionValue(list, "webviewEvents");
        synchronized (list) {
            List<C14304e9> list2 = this.f36624a;
            Intrinsics.checkNotNullExpressionValue(list2, "this.webviewEvents");
            Q5 = CollectionsKt___CollectionsKt.m40557Q5(list2);
            this.f36624a.clear();
        }
        return Q5;
    }

    /* renamed from: c */
    public void mo35240c() {
    }
}

package com.contentsquare.android.sdk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.h2 */
public final class C14389h2 implements C14502lc, C14916z2 {

    /* renamed from: a */
    public final List<C14443j6> f35586a = Collections.synchronizedList(new ArrayList());

    /* renamed from: a */
    public void mo35238a() {
        this.f35586a.clear();
    }

    /* renamed from: b */
    public void mo35460b(C14443j6 j6Var) {
        Intrinsics.checkNotNullParameter(j6Var, "newEvent");
        this.f35586a.add(j6Var);
    }

    /* renamed from: c */
    public List<C14443j6> mo35239c(C14507le leVar, long j) {
        Intrinsics.checkNotNullParameter(leVar, "viewLight");
        List<C14443j6> list = this.f35586a;
        Intrinsics.checkNotNullExpressionValue(list, "this.networkEvents");
        List<C14443j6> T5 = CollectionsKt___CollectionsKt.m40572T5(list);
        this.f35586a.clear();
        return T5;
    }

    /* renamed from: c */
    public void mo35240c() {
        this.f35586a.clear();
    }
}

package com.contentsquare.android.sdk;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.fd */
public final class C14345fd implements C14502lc {

    /* renamed from: a */
    public final C14486kf f35438a;

    public C14345fd() {
        this((C14486kf) null, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public void mo35238a() {
        this.f35438a.mo35782c();
    }

    /* renamed from: c */
    public List<C14374ga> mo35239c(C14507le leVar, long j) {
        Intrinsics.checkNotNullParameter(leVar, "viewLight");
        List<C14374ga> a = this.f35438a.mo35780a(leVar, j);
        Intrinsics.checkNotNullExpressionValue(a, "mutationDetector.detectM…ons(viewLight, timestamp)");
        return a;
    }

    public C14345fd(C14486kf kfVar) {
        Intrinsics.checkNotNullParameter(kfVar, "mutationDetector");
        this.f35438a = kfVar;
    }

    /* renamed from: c */
    public void mo35240c() {
        this.f35438a.mo35782c();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14345fd(C14486kf kfVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C14486kf() : kfVar);
    }
}

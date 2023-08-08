package com.contentsquare.android.sdk;

import androidx.collection.C1875h;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.m0 */
public final class C14512m0 {

    /* renamed from: c */
    public static final C14513a f35898c = new C14513a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final C1875h<C14464k3> f35899a;

    /* renamed from: b */
    public final C1875h<C14464k3> f35900b;

    /* renamed from: com.contentsquare.android.sdk.m0$a */
    public static final class C14513a {
        public C14513a() {
        }

        public /* synthetic */ C14513a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C14512m0() {
        this((C1875h) null, (C1875h) null, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: a */
    public final void mo35883a() {
        this.f35899a.mo6216c();
        this.f35900b.mo6216c();
    }

    /* renamed from: b */
    public final void mo35884b(long j, C14464k3 k3Var) {
        Intrinsics.checkNotNullParameter(k3Var, "bitmapHash");
        this.f35900b.mo6229t(j, k3Var);
    }

    /* renamed from: c */
    public final void mo35885c(C14507le leVar) {
        Intrinsics.checkNotNullParameter(leVar, "viewLight");
        C14464k3 k = this.f35899a.mo6223k(leVar.mo35837H());
        C14464k3 K = leVar.mo35840K();
        if (k != null && K != null) {
            if (k.mo35708e(K, 16, 8)) {
                leVar.mo35853e(k);
            } else {
                leVar.mo35856h(true);
            }
        }
    }

    /* renamed from: d */
    public final void mo35886d() {
        this.f35899a.mo6231u(this.f35900b);
        this.f35900b.mo6216c();
    }

    public C14512m0(C1875h<C14464k3> hVar, C1875h<C14464k3> hVar2) {
        Intrinsics.checkNotNullParameter(hVar, "previousFrameBitmapHashes");
        Intrinsics.checkNotNullParameter(hVar2, "nextFrameBitmapHashes");
        this.f35899a = hVar;
        this.f35900b = hVar2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14512m0(C1875h hVar, C1875h hVar2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C1875h() : hVar, (i & 2) != 0 ? new C1875h() : hVar2);
    }
}

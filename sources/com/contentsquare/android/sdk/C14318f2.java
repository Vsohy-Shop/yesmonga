package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14815w5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.f2 */
public final class C14318f2 {

    /* renamed from: b */
    public static final C14319a f35350b = new C14319a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final C14815w5.C14816a f35351a;

    /* renamed from: com.contentsquare.android.sdk.f2$a */
    public static final class C14319a {
        public C14319a() {
        }

        /* renamed from: a */
        public final /* synthetic */ C14318f2 mo35111a(C14815w5.C14816a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "builder");
            return new C14318f2(aVar, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ C14319a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C14318f2(C14815w5.C14816a aVar) {
        this.f35351a = aVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C14815w5 mo35106a() {
        C14359g4 n = this.f35351a.mo34703p();
        Intrinsics.checkNotNullExpressionValue(n, "_builder.build()");
        return (C14815w5) n;
    }

    /* renamed from: b */
    public final void mo35107b(int i) {
        this.f35351a.mo36682x(i);
    }

    /* renamed from: c */
    public final void mo35108c(long j) {
        this.f35351a.mo36679A(j);
    }

    /* renamed from: d */
    public final void mo35109d(C14833wb wbVar) {
        Intrinsics.checkNotNullParameter(wbVar, "value");
        this.f35351a.mo36680B(wbVar);
    }

    /* renamed from: e */
    public final void mo35110e(long j) {
        this.f35351a.mo36681C(j);
    }

    public /* synthetic */ C14318f2(C14815w5.C14816a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }
}

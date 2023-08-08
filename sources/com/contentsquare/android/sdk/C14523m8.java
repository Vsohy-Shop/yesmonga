package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14385h0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.m8 */
public final class C14523m8 {

    /* renamed from: b */
    public static final C14524a f35929b = new C14524a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final C14385h0.C14386a f35930a;

    /* renamed from: com.contentsquare.android.sdk.m8$a */
    public static final class C14524a {
        public C14524a() {
        }

        /* renamed from: a */
        public final /* synthetic */ C14523m8 mo35911a(C14385h0.C14386a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "builder");
            return new C14523m8(aVar, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ C14524a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C14523m8(C14385h0.C14386a aVar) {
        this.f35930a = aVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C14385h0 mo35907a() {
        C14359g4 n = this.f35930a.mo34703p();
        Intrinsics.checkNotNullExpressionValue(n, "_builder.build()");
        return (C14385h0) n;
    }

    /* renamed from: b */
    public final void mo35908b(long j) {
        this.f35930a.mo35416x(j);
    }

    /* renamed from: c */
    public final void mo35909c(String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        this.f35930a.mo35414A(str);
    }

    /* renamed from: d */
    public final void mo35910d(long j) {
        this.f35930a.mo35415B(j);
    }

    public /* synthetic */ C14523m8(C14385h0.C14386a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }
}

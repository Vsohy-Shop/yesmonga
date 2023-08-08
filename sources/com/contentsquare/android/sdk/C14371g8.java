package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14649qb;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.g8 */
public final class C14371g8 {

    /* renamed from: b */
    public static final C14372a f35548b = new C14372a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final C14649qb.C14650a f35549a;

    /* renamed from: com.contentsquare.android.sdk.g8$a */
    public static final class C14372a {
        public C14372a() {
        }

        /* renamed from: a */
        public final /* synthetic */ C14371g8 mo35367a(C14649qb.C14650a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "builder");
            return new C14371g8(aVar, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ C14372a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C14371g8(C14649qb.C14650a aVar) {
        this.f35549a = aVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C14649qb mo35363a() {
        C14359g4 n = this.f35549a.mo34703p();
        Intrinsics.checkNotNullExpressionValue(n, "_builder.build()");
        return (C14649qb) n;
    }

    /* renamed from: b */
    public final void mo35364b(long j) {
        this.f35549a.mo36258x(j);
    }

    /* renamed from: c */
    public final void mo35365c(C14649qb.C14651b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "value");
        this.f35549a.mo36256A(bVar);
    }

    /* renamed from: d */
    public final void mo35366d(boolean z) {
        this.f35549a.mo36257B(z);
    }

    public /* synthetic */ C14371g8(C14649qb.C14650a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }
}

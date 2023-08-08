package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14256cd;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.p4 */
public final class C14608p4 {

    /* renamed from: b */
    public static final C14609a f36166b = new C14609a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final C14256cd.C14257a f36167a;

    /* renamed from: com.contentsquare.android.sdk.p4$a */
    public static final class C14609a {
        public C14609a() {
        }

        /* renamed from: a */
        public final /* synthetic */ C14608p4 mo36141a(C14256cd.C14257a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "builder");
            return new C14608p4(aVar, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ C14609a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C14608p4(C14256cd.C14257a aVar) {
        this.f36167a = aVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C14256cd mo36137a() {
        C14359g4 n = this.f36167a.mo34703p();
        Intrinsics.checkNotNullExpressionValue(n, "_builder.build()");
        return (C14256cd) n;
    }

    /* renamed from: b */
    public final void mo36138b(long j) {
        this.f36167a.mo34887x(j);
    }

    /* renamed from: c */
    public final void mo36139c(C14348fg fgVar) {
        Intrinsics.checkNotNullParameter(fgVar, "value");
        this.f36167a.mo34885A(fgVar);
    }

    /* renamed from: d */
    public final void mo36140d(long j) {
        this.f36167a.mo34886B(j);
    }

    public /* synthetic */ C14608p4(C14256cd.C14257a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }
}

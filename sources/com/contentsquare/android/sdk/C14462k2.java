package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14590ob;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.k2 */
public final class C14462k2 {

    /* renamed from: b */
    public static final C14463a f35720b = new C14463a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final C14590ob.C14592b.C14593a f35721a;

    /* renamed from: com.contentsquare.android.sdk.k2$a */
    public static final class C14463a {
        public C14463a() {
        }

        /* renamed from: a */
        public final /* synthetic */ C14462k2 mo35703a(C14590ob.C14592b.C14593a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "builder");
            return new C14462k2(aVar, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ C14463a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C14462k2(C14590ob.C14592b.C14593a aVar) {
        this.f35721a = aVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C14590ob.C14592b mo35700a() {
        C14359g4 n = this.f35721a.mo34703p();
        Intrinsics.checkNotNullExpressionValue(n, "_builder.build()");
        return (C14590ob.C14592b) n;
    }

    /* renamed from: b */
    public final void mo35701b(C14529mb mbVar) {
        Intrinsics.checkNotNullParameter(mbVar, "value");
        this.f35721a.mo36097x(mbVar);
    }

    /* renamed from: c */
    public final void mo35702c(C14529mb mbVar) {
        Intrinsics.checkNotNullParameter(mbVar, "value");
        this.f35721a.mo36096A(mbVar);
    }

    public /* synthetic */ C14462k2(C14590ob.C14592b.C14593a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }
}

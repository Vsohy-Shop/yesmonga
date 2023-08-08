package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14590ob;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.b3 */
public final class C14206b3 {

    /* renamed from: b */
    public static final C14207a f35095b = new C14207a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final C14590ob.C14594c.C14595a f35096a;

    /* renamed from: com.contentsquare.android.sdk.b3$a */
    public static final class C14207a {
        public C14207a() {
        }

        /* renamed from: a */
        public final /* synthetic */ C14206b3 mo34648a(C14590ob.C14594c.C14595a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "builder");
            return new C14206b3(aVar, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ C14207a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C14206b3(C14590ob.C14594c.C14595a aVar) {
        this.f35096a = aVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C14590ob.C14594c mo34645a() {
        C14359g4 n = this.f35096a.mo34703p();
        Intrinsics.checkNotNullExpressionValue(n, "_builder.build()");
        return (C14590ob.C14594c) n;
    }

    /* renamed from: b */
    public final void mo34646b(C14617pb pbVar) {
        Intrinsics.checkNotNullParameter(pbVar, "value");
        this.f35096a.mo36101x(pbVar);
    }

    /* renamed from: c */
    public final void mo34647c(C14617pb pbVar) {
        Intrinsics.checkNotNullParameter(pbVar, "value");
        this.f35096a.mo36100A(pbVar);
    }

    public /* synthetic */ C14206b3(C14590ob.C14594c.C14595a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }
}

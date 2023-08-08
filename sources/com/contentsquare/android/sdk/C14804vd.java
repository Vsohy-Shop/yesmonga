package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14833wb;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.contentsquare.android.sdk.vd */
public final class C14804vd {

    /* renamed from: b */
    public static final C14805a f36699b = new C14805a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final C14833wb.C14834a f36700a;

    /* renamed from: com.contentsquare.android.sdk.vd$a */
    public static final class C14805a {
        public C14805a() {
        }

        /* renamed from: a */
        public final /* synthetic */ C14804vd mo36646a(C14833wb.C14834a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "builder");
            return new C14804vd(aVar, (DefaultConstructorMarker) null);
        }

        public /* synthetic */ C14805a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C14804vd(C14833wb.C14834a aVar) {
        this.f36700a = aVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C14833wb mo36640a() {
        C14359g4 n = this.f36700a.mo34703p();
        Intrinsics.checkNotNullExpressionValue(n, "_builder.build()");
        return (C14833wb) n;
    }

    /* renamed from: b */
    public final void mo36641b(long j) {
        this.f36700a.mo36753x(j);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo36642c(C14589oa<C14833wb, Object> oaVar, C14833wb wbVar) {
        Intrinsics.checkNotNullParameter(oaVar, "$this$add");
        Intrinsics.checkNotNullParameter(wbVar, "value");
        this.f36700a.mo36750B(wbVar);
    }

    /* renamed from: d */
    public final void mo36643d(C14833wb.C14835b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "value");
        this.f36700a.mo36749A(bVar);
    }

    /* renamed from: e */
    public final void mo36644e(C14348fg fgVar) {
        Intrinsics.checkNotNullParameter(fgVar, "value");
        this.f36700a.mo36751C(fgVar);
    }

    /* renamed from: f */
    public final /* synthetic */ C14589oa<C14833wb, Object> mo36645f() {
        List<C14833wb> D = this.f36700a.mo36752D();
        Intrinsics.checkNotNullExpressionValue(D, "_builder.getChildrenList()");
        return new C14589oa<>(D);
    }

    public /* synthetic */ C14804vd(C14833wb.C14834a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }
}

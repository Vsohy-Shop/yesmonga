package com.carrefour.fid.android.various.presentation.analytics.notification;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.analytics.presentation.C13821a;
import java.util.Map;
import javax.inject.Inject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.various.presentation.analytics.notification.a */
public final class C22799a {
    @C12579k

    /* renamed from: b */
    public static final C22800a f58359b = new C22800a((DefaultConstructorMarker) null);
    @Deprecated
    @C12579k

    /* renamed from: c */
    public static final String f58360c = "update-reco";
    @Deprecated
    @C12579k

    /* renamed from: d */
    public static final String f58361d = "mettre-a-jour-votre-application";
    @Deprecated
    @C12579k

    /* renamed from: e */
    public static final String f58362e = "update";
    @C12579k

    /* renamed from: a */
    public final C13783a f58363a;

    /* renamed from: com.carrefour.fid.android.various.presentation.analytics.notification.a$a */
    public static final class C22800a {
        public /* synthetic */ C22800a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C22800a() {
        }
    }

    @Inject
    public C22799a(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f58363a = aVar;
    }

    /* renamed from: a */
    public final void mo67244a() {
        C13783a.m58667i(this.f58363a, "application", "mettre-a-jour-votre-application", (Map) null, false, false, false, 60, (Object) null);
    }

    /* renamed from: b */
    public final void mo67245b() {
        C13783a.m58668o(this.f58363a, C13821a.m58743a("mettre-a-jour-votre-application", f58362e, "application", "mettre-a-jour-votre-application", "mettre-a-jour"), false, 2, (Object) null);
    }

    /* renamed from: c */
    public final void mo67246c() {
        C13783a.m58668o(this.f58363a, C13821a.m58743a(f58360c, f58362e, f58362e, "ignorer", (String) null), false, 2, (Object) null);
    }
}

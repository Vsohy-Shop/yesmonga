package com.carrefour.fid.android.catalogs.presentation.analytics;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import javax.inject.Inject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.catalogs.presentation.analytics.f */
public final class C39443f {
    @C12579k

    /* renamed from: b */
    public static final C39444a f100923b = new C39444a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: c */
    public static final String f100924c = "ma-liste-catalogues";
    @C12579k

    /* renamed from: d */
    public static final String f100925d = "ma-liste-catalogues-vide";
    @C12579k

    /* renamed from: a */
    public final C13783a f100926a;

    /* renamed from: com.carrefour.fid.android.catalogs.presentation.analytics.f$a */
    public static final class C39444a {
        public /* synthetic */ C39444a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C39444a() {
        }
    }

    @Inject
    public C39443f(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f100926a = aVar;
    }

    /* renamed from: a */
    public final void mo130530a() {
        C13783a.m58668o(this.f100926a, C39437a.m161626b(f100925d, (String) null, (String) null, "acceder-aux-catalogues", (String) null, 22, (Object) null), false, 2, (Object) null);
    }

    /* renamed from: b */
    public final void mo130531b() {
        C13783a.m58668o(this.f100926a, C39437a.m161626b(f100924c, (String) null, (String) null, "remove", (String) null, 22, (Object) null), false, 2, (Object) null);
    }
}

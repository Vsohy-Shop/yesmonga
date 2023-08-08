package com.carrefour.fid.android.catalogs.presentation.analytics;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.shared.constant.C28565n;
import java.util.Map;
import javax.inject.Inject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.catalogs.presentation.analytics.b */
public final class C39438b {
    @C12579k

    /* renamed from: b */
    public static final C39439a f100914b = new C39439a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: c */
    public static final String f100915c = "listes-catalogues";
    @C12579k

    /* renamed from: d */
    public static final String f100916d = "listes-catalogues-vide";
    @C12579k

    /* renamed from: e */
    public static final String f100917e = "mes-catalogues";
    @C12579k

    /* renamed from: f */
    public static final String f100918f = "mes-catalogues-vide";
    @C12579k

    /* renamed from: a */
    public final C13783a f100919a;

    /* renamed from: com.carrefour.fid.android.catalogs.presentation.analytics.b$a */
    public static final class C39439a {
        public /* synthetic */ C39439a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C39439a() {
        }
    }

    @Inject
    public C39438b(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f100919a = aVar;
    }

    /* renamed from: a */
    public final void mo130513a() {
        C13783a.m58667i(this.f100919a, "catalogues", C28565n.f69602k, (Map) null, false, false, true, 28, (Object) null);
    }

    /* renamed from: b */
    public final void mo130514b() {
        C13783a.m58667i(this.f100919a, "catalogues", "listes-catalogues", (Map) null, false, false, true, 28, (Object) null);
    }

    /* renamed from: c */
    public final void mo130515c() {
        C13783a.m58667i(this.f100919a, "catalogues", "listes-catalogues-vide", (Map) null, false, false, true, 28, (Object) null);
    }

    /* renamed from: d */
    public final void mo130516d() {
        C13783a.m58667i(this.f100919a, "catalogues", C28565n.f69605n, (Map) null, false, false, true, 28, (Object) null);
    }

    /* renamed from: e */
    public final void mo130517e() {
        C13783a.m58667i(this.f100919a, "catalogues", "mes-catalogues-vide", (Map) null, false, false, true, 28, (Object) null);
    }

    /* renamed from: f */
    public final void mo130518f() {
        C13783a.m58667i(this.f100919a, "catalogues", C28565n.f69610s, (Map) null, false, false, true, 28, (Object) null);
    }

    /* renamed from: g */
    public final void mo130519g() {
        C13783a.m58667i(this.f100919a, "catalogues", "mes-catalogues", (Map) null, false, false, true, 28, (Object) null);
    }

    /* renamed from: h */
    public final void mo130520h(boolean z) {
        String str;
        C13783a aVar = this.f100919a;
        if (z) {
            str = "mes-catalogues-vide";
        } else {
            str = "mes-catalogues";
        }
        C13783a.m58668o(aVar, C39437a.m161626b(str, (String) null, (String) null, "voir-tous-les-catalogues", (String) null, 22, (Object) null), false, 2, (Object) null);
    }

    /* renamed from: i */
    public final void mo130521i(boolean z, boolean z2) {
        String str;
        String str2;
        if (z) {
            str = "mes-catalogues";
        } else {
            str = "listes-catalogues";
        }
        if (z2) {
            if (z) {
                str2 = "mes-catalogues-vide";
            } else {
                str2 = "listes-catalogues-vide";
            }
            str = str2;
        }
        C13783a.m58668o(this.f100919a, C39437a.m161626b(str, (String) null, (String) null, "ma-liste-catalogue", (String) null, 22, (Object) null), false, 2, (Object) null);
    }

    /* renamed from: j */
    public final void mo130522j() {
        C13783a.m58668o(this.f100919a, C39437a.m161626b("listes-catalogues", (String) null, (String) null, "choisir-magasin", (String) null, 22, (Object) null), false, 2, (Object) null);
    }

    /* renamed from: k */
    public final void mo130523k(boolean z) {
        String str;
        C13783a aVar = this.f100919a;
        if (z) {
            str = "mes-catalogues-vide";
        } else {
            str = "listes-catalogues-vide";
        }
        C13783a.m58668o(aVar, C39437a.m161626b(str, (String) null, (String) null, "changer-magasin", (String) null, 22, (Object) null), false, 2, (Object) null);
    }
}

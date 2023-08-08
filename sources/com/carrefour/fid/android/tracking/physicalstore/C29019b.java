package com.carrefour.fid.android.tracking.physicalstore;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28529d2;
import com.carrefour.fid.android.shared.constant.C28531e0;
import com.carrefour.fid.android.shared.constant.C28549i0;
import com.carrefour.fid.android.shared.constant.C28553j0;
import com.carrefour.fid.android.shared.constant.C28572o;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.tracking.physicalstore.b */
public final class C29019b implements C29018a {
    @C12579k

    /* renamed from: a */
    public final C13783a f71114a;

    @Inject
    public C29019b(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f71114a = aVar;
    }

    /* renamed from: a */
    public void mo84441a(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "storeId");
        C13783a.m58668o(this.f71114a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "store-page"), C11078d1.m42659a("screen_name", "infos"), C11078d1.m42659a(C28526d.f68929i, "magasin"), C11078d1.m42659a(C28526d.f68933j, C28531e0.f69081k), C11078d1.m42659a(C28526d.f68937k, str)), false, 2, (Object) null);
    }

    /* renamed from: b */
    public void mo84442b() {
        C13783a.m58668o(this.f71114a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "magasin"), C11078d1.m42659a("screen_name", "accueil-magasin"), C11078d1.m42659a(C28526d.f68929i, "magasin"), C11078d1.m42659a(C28526d.f68933j, C28549i0.f69385j)), false, 2, (Object) null);
    }

    /* renamed from: c */
    public void mo84443c() {
        C13783a.m58668o(this.f71114a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "magasin"), C11078d1.m42659a("screen_name", "accueil-magasin"), C11078d1.m42659a(C28526d.f68929i, C28572o.f69644c), C11078d1.m42659a(C28526d.f68933j, "clic"), C11078d1.m42659a(C28526d.f68937k, C28572o.f69646e)), false, 2, (Object) null);
    }

    /* renamed from: d */
    public void mo84444d() {
        C13783a.m58668o(this.f71114a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "magasin"), C11078d1.m42659a("screen_name", "accueil-magasin"), C11078d1.m42659a(C28526d.f68929i, "magasin"), C11078d1.m42659a(C28526d.f68933j, "catalogues")), false, 2, (Object) null);
    }

    /* renamed from: e */
    public void mo84445e(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "storeId");
        C13783a.m58668o(this.f71114a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "store-page"), C11078d1.m42659a("screen_name", "infos"), C11078d1.m42659a(C28526d.f68929i, "magasin"), C11078d1.m42659a(C28526d.f68933j, "itineraire"), C11078d1.m42659a(C28526d.f68937k, str)), false, 2, (Object) null);
    }

    /* renamed from: f */
    public void mo84446f() {
        C13783a.m58667i(this.f71114a, "store-page", "les-services", (Map) null, false, false, false, 60, (Object) null);
    }

    /* renamed from: g */
    public void mo84447g() {
        C13783a.m58668o(this.f71114a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "magasin"), C11078d1.m42659a("screen_name", "accueil-magasin"), C11078d1.m42659a(C28526d.f68929i, "magasin"), C11078d1.m42659a(C28526d.f68933j, C28549i0.f69383h)), false, 2, (Object) null);
    }

    /* renamed from: h */
    public void mo84448h(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "storeId");
        C13783a.m58668o(this.f71114a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "store-page"), C11078d1.m42659a("screen_name", "infos"), C11078d1.m42659a(C28526d.f68929i, "magasin"), C11078d1.m42659a(C28526d.f68933j, C28531e0.f69093w), C11078d1.m42659a(C28526d.f68937k, str)), false, 2, (Object) null);
    }

    /* renamed from: i */
    public void mo84449i() {
        C13783a.m58668o(this.f71114a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "magasin"), C11078d1.m42659a("screen_name", "accueil-magasin"), C11078d1.m42659a(C28526d.f68929i, "magasin"), C11078d1.m42659a(C28526d.f68933j, C28549i0.f69384i)), false, 2, (Object) null);
    }

    /* renamed from: j */
    public void mo84450j() {
        C13783a.m58668o(this.f71114a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "magasin"), C11078d1.m42659a("screen_name", "accueil-magasin"), C11078d1.m42659a(C28526d.f68929i, "magasin"), C11078d1.m42659a(C28526d.f68933j, "infos-magasin")), false, 2, (Object) null);
    }

    /* renamed from: k */
    public void mo84451k() {
        C13783a.m58668o(this.f71114a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "magasin"), C11078d1.m42659a("screen_name", "accueil-magasin"), C11078d1.m42659a(C28526d.f68929i, "magasin"), C11078d1.m42659a(C28526d.f68933j, "changer-magasin")), false, 2, (Object) null);
    }

    /* renamed from: l */
    public void mo84452l() {
        C13783a.m58668o(this.f71114a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "magasin"), C11078d1.m42659a("screen_name", "accueil-magasin"), C11078d1.m42659a(C28526d.f68929i, "magasin"), C11078d1.m42659a(C28526d.f68933j, C28549i0.f69383h)), false, 2, (Object) null);
    }

    /* renamed from: m */
    public void mo84453m() {
        C13783a.m58668o(this.f71114a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "magasin"), C11078d1.m42659a("screen_name", "accueil-magasin"), C11078d1.m42659a(C28526d.f68929i, "magasin"), C11078d1.m42659a(C28526d.f68933j, C28526d.f68806E2)), false, 2, (Object) null);
    }

    /* renamed from: n */
    public void mo84454n() {
        C13783a.m58668o(this.f71114a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "magasin"), C11078d1.m42659a("screen_name", "accueil-magasin"), C11078d1.m42659a(C28526d.f68929i, "magasin"), C11078d1.m42659a(C28526d.f68933j, C28549i0.f69382g)), false, 2, (Object) null);
    }

    /* renamed from: o */
    public void mo84455o(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "storeId");
        C13783a.m58668o(this.f71114a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "store-page"), C11078d1.m42659a("screen_name", "infos"), C11078d1.m42659a(C28526d.f68929i, "magasin"), C11078d1.m42659a(C28526d.f68933j, "rediger-le-premier"), C11078d1.m42659a(C28526d.f68937k, str)), false, 2, (Object) null);
    }

    /* renamed from: p */
    public void mo84456p() {
        C13783a.m58668o(this.f71114a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "magasin"), C11078d1.m42659a("screen_name", "accueil-magasin"), C11078d1.m42659a(C28526d.f68929i, "magasin"), C11078d1.m42659a(C28526d.f68933j, "choisir-magasin")), false, 2, (Object) null);
    }

    /* renamed from: q */
    public void mo84457q() {
        C13783a.m58667i(this.f71114a, "store-page", C28529d2.f69043i, (Map) null, false, false, false, 60, (Object) null);
    }

    /* renamed from: r */
    public void mo84458r() {
        C13783a.m58667i(this.f71114a, "store-page", "infos", (Map) null, false, false, false, 60, (Object) null);
    }

    public void sendTagScreenView() {
        C13783a.m58667i(this.f71114a, C28553j0.f69419b, "accueil-magasin", (Map) null, false, false, false, 60, (Object) null);
    }
}

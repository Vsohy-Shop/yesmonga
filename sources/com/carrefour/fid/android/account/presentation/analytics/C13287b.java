package com.carrefour.fid.android.account.presentation.analytics;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.shared.constant.C28513a;
import com.carrefour.fid.android.shared.constant.C28526d;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.Pair;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.account.presentation.analytics.b */
public final class C13287b implements C13285a {
    @C12579k

    /* renamed from: a */
    public final C13783a f32683a;

    @Inject
    public C13287b(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f32683a = aVar;
    }

    /* renamed from: C */
    public void mo31584C(boolean z) {
        String str;
        C13783a aVar = this.f32683a;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a(C28526d.f68906d, "mon-compte");
        if (z) {
            str = "adresse-livraison";
        } else {
            str = "adresse-facturation";
        }
        pairArr[2] = C11078d1.m42659a("screen_name", str);
        pairArr[3] = C11078d1.m42659a(C28526d.f68929i, "mon-compte");
        pairArr[4] = C11078d1.m42659a(C28526d.f68933j, C28513a.f68682t);
        pairArr[5] = C11078d1.m42659a(C28526d.f68937k, "ajouter-adresse");
        C13783a.m58668o(aVar, C10977s0.m41456W(pairArr), false, 2, (Object) null);
    }

    /* renamed from: I */
    public void mo31585I(boolean z) {
        String str;
        C13783a aVar = this.f32683a;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a(C28526d.f68906d, "mon-compte");
        if (z) {
            str = "adresse-livraison";
        } else {
            str = "adresse-facturation";
        }
        pairArr[2] = C11078d1.m42659a("screen_name", str);
        pairArr[3] = C11078d1.m42659a(C28526d.f68929i, "channel-switch");
        pairArr[4] = C11078d1.m42659a(C28526d.f68933j, C28513a.f68682t);
        pairArr[5] = C11078d1.m42659a(C28526d.f68937k, C28513a.f68681s);
        C13783a.m58668o(aVar, C10977s0.m41456W(pairArr), false, 2, (Object) null);
    }

    /* renamed from: L */
    public void mo31586L() {
        C13783a.m58667i(this.f32683a, "mon-compte", "adresse-facturation", (Map) null, false, false, false, 60, (Object) null);
    }

    /* renamed from: k */
    public void mo31587k(boolean z) {
        String str;
        C13783a aVar = this.f32683a;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = C11078d1.m42659a(C28526d.f68891a, "event");
        pairArr[1] = C11078d1.m42659a(C28526d.f68906d, "mon-compte");
        if (z) {
            str = "adresse-livraison";
        } else {
            str = "adresse-facturation";
        }
        pairArr[2] = C11078d1.m42659a("screen_name", str);
        pairArr[3] = C11078d1.m42659a(C28526d.f68929i, "mon-compte");
        pairArr[4] = C11078d1.m42659a(C28526d.f68933j, C28513a.f68682t);
        pairArr[5] = C11078d1.m42659a(C28526d.f68937k, C28513a.f68680r);
        C13783a.m58668o(aVar, C10977s0.m41456W(pairArr), false, 2, (Object) null);
    }

    /* renamed from: z */
    public void mo31588z() {
        C13783a.m58667i(this.f32683a, "mon-compte", "adresse-livraison", (Map) null, false, false, false, 60, (Object) null);
    }
}

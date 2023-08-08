package com.carrefour.fid.android.presentation.viewmodels.account.home;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.airship.util.C13758b;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.domain.models.usabilla.UsabillaEventType;
import com.carrefour.fid.android.loyalty.core.util.LoyaltyCardType;
import com.carrefour.fid.android.shared.constant.C28513a;
import com.carrefour.fid.android.shared.constant.C28524c1;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28551i2;
import com.carrefour.fid.android.shared.constant.C28563m0;
import com.carrefour.fid.android.shared.constant.C28564m1;
import com.carrefour.fid.android.tracking.C28994a;
import com.carrefour.fid.android.tracking.C28995b;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.collections.C10975r0;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.home.a */
public final class C25796a {

    /* renamed from: d */
    public static final int f63180d = 8;
    @C12579k

    /* renamed from: a */
    public C13783a f63181a;
    @C12579k

    /* renamed from: b */
    public C28994a f63182b;
    @C12579k

    /* renamed from: c */
    public C28995b f63183c;

    @Inject
    public C25796a(@C12579k C13783a aVar, @C12579k C28994a aVar2, @C12579k C28995b bVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        Intrinsics.checkNotNullParameter(aVar2, "audienceTrackingAdapter");
        Intrinsics.checkNotNullParameter(bVar, "usabillaEventDispatcher");
        this.f63181a = aVar;
        this.f63182b = aVar2;
        this.f63183c = bVar;
    }

    /* renamed from: a */
    public final void mo74880a() {
        C13783a.m58667i(this.f63181a, "mon-compte", "mon-compte-connecte", (Map) null, false, false, false, 60, (Object) null);
    }

    /* renamed from: b */
    public final void mo74881b() {
        this.f63183c.mo67288d(UsabillaEventType.EVENT_ACCOUNT);
    }

    /* renamed from: c */
    public final void mo74882c(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "email");
        Intrinsics.checkNotNullParameter(str2, "firstname");
        Intrinsics.checkNotNullParameter(str3, "lastname");
        this.f63182b.mo32670e(C10977s0.m41456W(C11078d1.m42659a(C13758b.f33473t0, str), C11078d1.m42659a(C13758b.f33471s0, str2), C11078d1.m42659a(C13758b.f33475u0, str3)));
    }

    /* renamed from: d */
    public final void mo74883d(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "count");
        C13783a.m58668o(this.f63181a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", "mon-compte-connecte"), C11078d1.m42659a(C28526d.f68933j, C28563m0.f69565f), C11078d1.m42659a(C28526d.f68929i, "mon-compte"), C11078d1.m42659a(C28526d.f68937k, str)), false, 2, (Object) null);
    }

    /* renamed from: e */
    public final void mo74884e() {
        C13783a.m58667i(this.f63181a, C28524c1.f68779b, "inbox", (Map) null, false, false, false, 60, (Object) null);
    }

    /* renamed from: f */
    public final void mo74885f() {
        C13783a.m58668o(this.f63181a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", "mon-compte-connecte"), C11078d1.m42659a(C28526d.f68933j, C28513a.f68668f), C11078d1.m42659a(C28526d.f68929i, "mon-compte")), false, 2, (Object) null);
    }

    /* renamed from: g */
    public final void mo74886g() {
        C13783a.m58668o(this.f63181a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", "mon-compte-connecte"), C11078d1.m42659a(C28526d.f68933j, "mes-infos"), C11078d1.m42659a(C28526d.f68929i, "mon-compte")), false, 2, (Object) null);
    }

    /* renamed from: h */
    public final void mo74887h() {
        C13783a.m58668o(this.f63181a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", C28551i2.f69409b), C11078d1.m42659a(C28526d.f68929i, "ecommerce"), C11078d1.m42659a(C28526d.f68933j, "besoin-aide"), C11078d1.m42659a(C28526d.f68937k, C28551i2.f69412e)), false, 2, (Object) null);
    }

    /* renamed from: i */
    public final void mo74888i(int i) {
        String str;
        this.f63182b.mo32670e(C10975r0.m41401k(C11078d1.m42659a(C13758b.f33481x0, C13758b.f33436b)));
        this.f63181a.mo32700a();
        if (i == LoyaltyCardType.FID.getType()) {
            str = C28564m1.f69572f;
        } else if (i == LoyaltyCardType.PASS.getType()) {
            str = C28564m1.f69573g;
        } else {
            str = new String();
        }
        this.f63181a.mo32708k(C10975r0.m41401k(C11078d1.m42659a(str, "1")));
    }
}

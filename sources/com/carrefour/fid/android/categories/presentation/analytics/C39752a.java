package com.carrefour.fid.android.categories.presentation.analytics;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.shared.constant.C28526d;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.collections.C10975r0;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.categories.presentation.analytics.a */
public final class C39752a {

    /* renamed from: b */
    public static final int f101470b = 8;
    @C12579k

    /* renamed from: a */
    public final C13783a f101471a;

    @Inject
    public C39752a(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f101471a = aVar;
    }

    /* renamed from: a */
    public final void mo131066a(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "departmentName");
        C13783a.m58667i(this.f101471a, "menu-nav", str, (Map) null, true, false, false, 52, (Object) null);
    }

    /* renamed from: b */
    public final void mo131067b() {
        C13783a.m58667i(this.f101471a, "menu-nav", "tous-les-rayons", (Map) null, false, false, false, 60, (Object) null);
    }

    /* renamed from: c */
    public final void mo131068c() {
        C13783a.m58668o(this.f101471a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "tous-les-rayons"), C11078d1.m42659a(C28526d.f68906d, "menu-nav"), C11078d1.m42659a(C28526d.f68929i, C28526d.f68822I2), C11078d1.m42659a(C28526d.f68933j, "rayon-cat-1"), C11078d1.m42659a(C28526d.f68937k, "coupons")), false, 2, (Object) null);
    }

    /* renamed from: d */
    public final void mo131069d(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "departmentId");
        C13783a.m58668o(this.f101471a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "tous-les-rayons"), C11078d1.m42659a(C28526d.f68906d, "menu-nav"), C11078d1.m42659a(C28526d.f68933j, "voir-tous"), C11078d1.m42659a(C28526d.f68929i, C28526d.f68822I2), C11078d1.m42659a(C28526d.f68937k, str)), false, 2, (Object) null);
    }

    /* renamed from: e */
    public final void mo131070e(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "label");
        C13783a.m58668o(this.f101471a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "tous-les-rayons"), C11078d1.m42659a(C28526d.f68906d, "menu-nav"), C11078d1.m42659a(C28526d.f68933j, "rayon-cat-1"), C11078d1.m42659a(C28526d.f68929i, C28526d.f68822I2), C11078d1.m42659a(C28526d.f68937k, str)), false, 2, (Object) null);
    }

    /* renamed from: f */
    public final void mo131071f(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "label");
        C13783a.m58668o(this.f101471a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "tous-les-rayons"), C11078d1.m42659a(C28526d.f68906d, "menu-nav"), C11078d1.m42659a(C28526d.f68933j, "rayon-cat-2"), C11078d1.m42659a(C28526d.f68929i, C28526d.f68822I2), C11078d1.m42659a(C28526d.f68937k, str)), false, 2, (Object) null);
    }

    /* renamed from: g */
    public final void mo131072g() {
        C13783a.m58668o(this.f101471a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "tous-les-rayons"), C11078d1.m42659a(C28526d.f68906d, "menu-nav"), C11078d1.m42659a(C28526d.f68933j, "voir-les-promos"), C11078d1.m42659a(C28526d.f68929i, C28526d.f68822I2)), false, 2, (Object) null);
    }

    /* renamed from: h */
    public final void mo131073h() {
        C13783a.m58668o(this.f101471a, C10975r0.m41401k(C11078d1.m42659a("event", C28526d.f68962q0)), false, 2, (Object) null);
    }
}

package com.carrefour.fid.android.presentation.viewmodels.splash;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.airship.util.C13758b;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.shared.constant.C28516a2;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28550i1;
import com.carrefour.fid.android.shared.util.C28932h;
import com.carrefour.fid.android.tracking.C28994a;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.collections.C10975r0;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.C11368t0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.splash.a */
public final class C27420a {

    /* renamed from: c */
    public static final int f66520c = 8;
    @C12579k

    /* renamed from: a */
    public final C13783a f66521a;
    @C12579k

    /* renamed from: b */
    public final C28994a f66522b;

    @Inject
    public C27420a(@C12579k C13783a aVar, @C12579k C28994a aVar2) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        Intrinsics.checkNotNullParameter(aVar2, "audienceTrackingAdapter");
        this.f66521a = aVar;
        this.f66522b = aVar2;
    }

    /* renamed from: a */
    public final void mo79742a(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "event");
        HashMap hashMap = new HashMap();
        hashMap.put(C13758b.f33439c0, str);
        this.f66522b.mo32670e(hashMap);
    }

    /* renamed from: b */
    public final void mo79743b() {
        C13783a.m58667i(this.f66521a, "onboarding", "splashscreen-deconnecte", (Map) null, false, false, false, 60, (Object) null);
    }

    /* renamed from: c */
    public final void mo79744c() {
        C13783a.m58667i(this.f66521a, "onboarding", C28550i1.f69405d, (Map) null, false, false, false, 60, (Object) null);
    }

    /* renamed from: d */
    public final void mo79745d(int i) {
        C13783a.m58667i(this.f66521a, "onboarding", C28550i1.f69402a.mo83492a(i), (Map) null, false, false, false, 60, (Object) null);
    }

    /* renamed from: e */
    public final void mo79746e() {
        this.f66522b.mo32669d(C13758b.f33449h0, C10975r0.m41401k(C11078d1.m42659a(C13758b.f33451i0, C28932h.f70914a.mo84245o())));
    }

    /* renamed from: f */
    public final void mo79747f(int i) {
        C13783a aVar = this.f66521a;
        C11368t0 t0Var = C11368t0.f28504a;
        String format = String.format(C28516a2.f68716j, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        C13783a.m58668o(aVar, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, C28516a2.f68717k), C11078d1.m42659a("screen_name", format), C11078d1.m42659a(C28526d.f68929i, "onboarding"), C11078d1.m42659a(C28526d.f68933j, "me-connecter")), false, 2, (Object) null);
    }

    /* renamed from: g */
    public final void mo79748g(int i) {
        C13783a aVar = this.f66521a;
        C11368t0 t0Var = C11368t0.f28504a;
        String format = String.format(C28516a2.f68716j, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        C13783a.m58668o(aVar, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, C28516a2.f68717k), C11078d1.m42659a("screen_name", format), C11078d1.m42659a(C28526d.f68929i, "onboarding"), C11078d1.m42659a(C28526d.f68933j, "creer-un-compte")), false, 2, (Object) null);
    }

    /* renamed from: h */
    public final void mo79749h(int i) {
        C13783a aVar = this.f66521a;
        C11368t0 t0Var = C11368t0.f28504a;
        String format = String.format(C28516a2.f68716j, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        C13783a.m58668o(aVar, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, C28516a2.f68717k), C11078d1.m42659a("screen_name", format), C11078d1.m42659a(C28526d.f68929i, "onboarding"), C11078d1.m42659a(C28526d.f68933j, C28516a2.f68713g)), false, 2, (Object) null);
    }

    /* renamed from: i */
    public final void mo79750i(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put(C13758b.f33479w0, String.valueOf(i));
        this.f66522b.mo32670e(hashMap);
    }

    /* renamed from: j */
    public final void mo79751j() {
        C13783a.m58668o(this.f66521a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, C28516a2.f68717k), C11078d1.m42659a("screen_name", C28516a2.f68714h), C11078d1.m42659a(C28526d.f68929i, "onboarding"), C11078d1.m42659a(C28526d.f68933j, C28516a2.f68710d)), false, 2, (Object) null);
    }
}

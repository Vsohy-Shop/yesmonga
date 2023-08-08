package com.carrefour.fid.android.legalnotice.presenters;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.OneAppApplication;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28573o0;
import java.util.Map;
import kotlin.C11078d1;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.legalnotice.presenters.a */
public final class C38233a {

    /* renamed from: b */
    public static final int f96879b = 8;
    @C12579k

    /* renamed from: a */
    public C13783a f96880a;

    public C38233a() {
        this((C13783a) null, 1, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: a */
    public final C13783a mo119680a() {
        return this.f96880a;
    }

    /* renamed from: b */
    public final void mo119681b() {
        C13783a.m58667i(this.f96880a, "mon-compte", "mes-informations-legales", (Map) null, false, false, false, 60, (Object) null);
    }

    /* renamed from: c */
    public final void mo119682c() {
        C13783a.m58668o(this.f96880a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", "mes-informations-legales"), C11078d1.m42659a(C28526d.f68929i, "mon-compte"), C11078d1.m42659a(C28526d.f68933j, C28573o0.f69650b)), false, 2, (Object) null);
    }

    /* renamed from: d */
    public final void mo119683d() {
        C13783a.m58668o(this.f96880a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", "mes-informations-legales"), C11078d1.m42659a(C28526d.f68929i, "mon-compte"), C11078d1.m42659a(C28526d.f68933j, C28573o0.f69654f)), false, 2, (Object) null);
    }

    /* renamed from: e */
    public final void mo119684e() {
        C13783a.m58668o(this.f96880a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", "mes-informations-legales"), C11078d1.m42659a(C28526d.f68929i, "mon-compte"), C11078d1.m42659a(C28526d.f68933j, "mentions-legales")), false, 2, (Object) null);
    }

    /* renamed from: f */
    public final void mo119685f() {
        C13783a.m58668o(this.f96880a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", "mes-informations-legales"), C11078d1.m42659a(C28526d.f68929i, "mon-compte"), C11078d1.m42659a(C28526d.f68933j, C28573o0.f69653e)), false, 2, (Object) null);
    }

    /* renamed from: g */
    public final void mo119686g() {
        C13783a.m58668o(this.f96880a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", "mes-informations-legales"), C11078d1.m42659a(C28526d.f68929i, "mon-compte"), C11078d1.m42659a(C28526d.f68933j, C28573o0.f69655g)), false, 2, (Object) null);
    }

    /* renamed from: h */
    public final void mo119687h(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f96880a = aVar;
    }

    public C38233a(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "mAnalyticManager");
        this.f96880a = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38233a(C13783a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? OneAppApplication.f32244w.mo30856a().mo30844d() : aVar);
    }
}

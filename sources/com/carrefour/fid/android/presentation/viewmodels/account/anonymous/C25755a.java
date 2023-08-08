package com.carrefour.fid.android.presentation.viewmodels.account.anonymous;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.shared.constant.C28526d;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.account.anonymous.a */
public final class C25755a {

    /* renamed from: b */
    public static final int f63094b = 8;
    @C12579k

    /* renamed from: a */
    public C13783a f63095a;

    @Inject
    public C25755a(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f63095a = aVar;
    }

    /* renamed from: a */
    public final void mo74788a() {
        C13783a.m58667i(this.f63095a, "mon-compte", "me-connecter", (Map) null, false, false, false, 60, (Object) null);
    }

    /* renamed from: b */
    public final void mo74789b() {
        C13783a.m58668o(this.f63095a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", "me-connecter"), C11078d1.m42659a(C28526d.f68929i, "mon-compte"), C11078d1.m42659a(C28526d.f68933j, "mes-informations-legales")), false, 2, (Object) null);
    }

    /* renamed from: c */
    public final void mo74790c(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "value");
        C13783a.m58668o(this.f63095a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, str), C11078d1.m42659a("screen_name", "me-connecter"), C11078d1.m42659a(C28526d.f68929i, str), C11078d1.m42659a(C28526d.f68933j, "me-connecter")), false, 2, (Object) null);
    }
}

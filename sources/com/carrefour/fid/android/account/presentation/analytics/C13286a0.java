package com.carrefour.fid.android.account.presentation.analytics;

import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.shared.constant.C28513a;
import com.carrefour.fid.android.shared.constant.C28526d;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.account.presentation.analytics.a0 */
public final class C13286a0 implements C13313z {
    @C12579k

    /* renamed from: a */
    public final C13783a f32682a;

    @Inject
    public C13286a0(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f32682a = aVar;
    }

    /* renamed from: V */
    public void mo31589V() {
        C13783a.m58667i(this.f32682a, "mon-compte", C28513a.f68678p, (Map) null, false, false, false, 60, (Object) null);
    }

    /* renamed from: p */
    public void mo31590p(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "eventLabel");
        C13783a.m58668o(this.f32682a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", C28513a.f68678p), C11078d1.m42659a(C28526d.f68929i, "mon-compte"), C11078d1.m42659a(C28526d.f68933j, C28513a.f68682t), C11078d1.m42659a(C28526d.f68937k, str)), false, 2, (Object) null);
    }
}

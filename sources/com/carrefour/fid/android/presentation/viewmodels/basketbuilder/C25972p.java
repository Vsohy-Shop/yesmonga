package com.carrefour.fid.android.presentation.viewmodels.basketbuilder;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28556k;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.basketbuilder.p */
public final class C25972p {

    /* renamed from: b */
    public static final int f63497b = 8;
    @C12579k

    /* renamed from: a */
    public final C13783a f63498a;

    @Inject
    public C25972p(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f63498a = aVar;
    }

    /* renamed from: a */
    public final void mo75395a() {
        C13783a.m58668o(this.f63498a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", "backdrop-connexion"), C11078d1.m42659a(C28526d.f68906d, "recommande-pour-vous"), C11078d1.m42659a(C28526d.f68929i, "connexion"), C11078d1.m42659a(C28526d.f68933j, C28556k.f69473m)), false, 2, (Object) null);
    }

    /* renamed from: b */
    public final void mo75396b() {
        C13783a.m58667i(this.f63498a, "recommande-pour-vous", "backdrop-connexion", (Map) null, false, false, false, 60, (Object) null);
    }
}

package com.carrefour.fid.android.presentation.viewmodels.order.offline;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28554j1;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.order.offline.f */
public final class C26689f {

    /* renamed from: b */
    public static final int f65142b = 8;
    @C12579k

    /* renamed from: a */
    public final C13783a f65143a;

    @Inject
    public C26689f(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "mAnalyticManager");
        this.f65143a = aVar;
    }

    /* renamed from: a */
    public final void mo77560a() {
        C13783a.m58667i(this.f65143a, "mon-compte", "mes-achats/en-magasin", (Map) null, false, false, false, 60, (Object) null);
    }

    /* renamed from: b */
    public final void mo77561b() {
        C13783a.m58668o(this.f65143a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", "mes-achats/en-magasin"), C11078d1.m42659a(C28526d.f68929i, "mon-compte"), C11078d1.m42659a(C28526d.f68933j, "erreur-affichage"), C11078d1.m42659a(C28526d.f68937k, C28554j1.f69454u)), false, 2, (Object) null);
    }
}

package com.carrefour.fid.android.tracking.orders.online.additionalorder;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.shared.constant.C28517b;
import com.carrefour.fid.android.shared.constant.C28522c;
import com.carrefour.fid.android.shared.constant.C28526d;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.tracking.orders.online.additionalorder.b */
public final class C28997b implements C28996a {

    /* renamed from: b */
    public static final int f71092b = 8;
    @C12579k

    /* renamed from: a */
    public final C13783a f71093a;

    @Inject
    public C28997b(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f71093a = aVar;
    }

    /* renamed from: G */
    public void mo77673G() {
        C13783a.m58668o(this.f71093a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "complement-commande"), C11078d1.m42659a("screen_name", "complement-commande"), C11078d1.m42659a(C28526d.f68929i, "complement-commande"), C11078d1.m42659a(C28526d.f68933j, C28522c.f68758j)), false, 2, (Object) null);
    }

    /* renamed from: K */
    public void mo77674K() {
        C13783a.m58668o(this.f71093a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "complement-commande"), C11078d1.m42659a("screen_name", "complement-commande"), C11078d1.m42659a(C28526d.f68929i, "complement-commande"), C11078d1.m42659a(C28526d.f68933j, C28522c.f68757i)), false, 2, (Object) null);
    }

    public void sendScreenView() {
        C13783a.m58667i(this.f71093a, "complement-commande", C28517b.f68725e, (Map) null, false, false, false, 60, (Object) null);
    }
}

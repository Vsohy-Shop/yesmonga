package com.carrefour.fid.android.presentation.trackers.account;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.shared.constant.C28513a;
import com.carrefour.fid.android.shared.constant.C28526d;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.trackers.account.a */
public final class C38531a {

    /* renamed from: b */
    public static final int f97675b = 8;
    @C12579k

    /* renamed from: a */
    public final C13783a f97676a;

    @Inject
    public C38531a(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f97676a = aVar;
    }

    /* renamed from: a */
    public final void mo122187a() {
        C13783a.m58667i(this.f97676a, "mon-compte", "mes-donnees", (Map) null, false, false, false, 60, (Object) null);
    }

    /* renamed from: b */
    public final void mo122188b(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "allowSharingSwitch");
        C13783a.m58668o(this.f97676a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a(C28526d.f68906d, "mon-compte"), C11078d1.m42659a("screen_name", "mes-donnees"), C11078d1.m42659a(C28526d.f68929i, "mon-compte"), C11078d1.m42659a(C28526d.f68933j, C28513a.f68674l), C11078d1.m42659a(C28526d.f68937k, str)), false, 2, (Object) null);
    }
}

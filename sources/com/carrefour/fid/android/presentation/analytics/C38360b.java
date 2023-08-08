package com.carrefour.fid.android.presentation.analytics;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.shared.constant.C28526d;
import com.carrefour.fid.android.shared.constant.C28572o;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.analytics.b */
public final class C38360b implements C38359a {

    /* renamed from: b */
    public static final int f97142b = 8;
    @C12579k

    /* renamed from: a */
    public final C13783a f97143a;

    @Inject
    public C38360b(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f97143a = aVar;
    }

    /* renamed from: i */
    public void mo75403i(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "screenName");
        Intrinsics.checkNotNullParameter(str2, "screenTemplate");
        C13783a.m58668o(this.f97143a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", str), C11078d1.m42659a(C28526d.f68906d, str2), C11078d1.m42659a(C28526d.f68933j, "affichage"), C11078d1.m42659a(C28526d.f68929i, C28572o.f69644c)), false, 2, (Object) null);
    }

    /* renamed from: o */
    public void mo75404o(@C12579k String str, @C12579k String str2) {
        Intrinsics.checkNotNullParameter(str, "screenName");
        Intrinsics.checkNotNullParameter(str2, "screenTemplate");
        C13783a.m58668o(this.f97143a, C10977s0.m41456W(C11078d1.m42659a(C28526d.f68891a, "event"), C11078d1.m42659a("screen_name", str), C11078d1.m42659a(C28526d.f68906d, str2), C11078d1.m42659a(C28526d.f68933j, C28572o.f69647f), C11078d1.m42659a(C28526d.f68929i, C28572o.f69644c)), false, 2, (Object) null);
    }
}

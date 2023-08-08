package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp.analytics;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import java.util.Map;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.analytics.b */
public final class C24604b implements C24603a {

    /* renamed from: b */
    public static final int f61153b = 8;
    @C12579k

    /* renamed from: a */
    public final C13783a f61154a;

    @Inject
    public C24604b(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "analyticManager");
        this.f61154a = aVar;
    }

    /* renamed from: a */
    public void mo71917a(boolean z) {
        if (z) {
            C13783a.m58667i(this.f61154a, "checkout", "secure-ecommerce-reinit", (Map) null, false, false, false, 60, (Object) null);
        } else {
            C13783a.m58667i(this.f61154a, "fidelite", "secure-ecommerce-reinit", (Map) null, false, false, false, 60, (Object) null);
        }
    }

    /* renamed from: b */
    public void mo71918b(boolean z) {
        if (z) {
            C13783a.m58667i(this.f61154a, "checkout", "secure-ecommerce-authent", (Map) null, false, false, false, 60, (Object) null);
        } else {
            C13783a.m58667i(this.f61154a, "fidelite", "secure-ecommerce-authent", (Map) null, false, false, false, 60, (Object) null);
        }
    }

    /* renamed from: c */
    public void mo71919c(boolean z) {
        if (z) {
            C13783a.m58667i(this.f61154a, "checkout", "secure-ecommerce", (Map) null, false, false, false, 60, (Object) null);
        } else {
            C13783a.m58667i(this.f61154a, "fidelite", "secure-ecommerce", (Map) null, false, false, false, 60, (Object) null);
        }
    }

    /* renamed from: d */
    public void mo71920d(boolean z) {
        if (z) {
            C13783a.m58667i(this.f61154a, "checkout", "secure-ecommerce-medias", (Map) null, false, false, false, 60, (Object) null);
        } else {
            C13783a.m58667i(this.f61154a, "fidelite", "secure-ecommerce-medias", (Map) null, false, false, false, 60, (Object) null);
        }
    }
}

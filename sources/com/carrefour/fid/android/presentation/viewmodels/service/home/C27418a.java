package com.carrefour.fid.android.presentation.viewmodels.service.home;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.airship.util.C13758b;
import com.carrefour.fid.android.shared.base.C28498p;
import com.carrefour.fid.android.tracking.C28994a;
import javax.inject.Inject;
import kotlin.C11078d1;
import kotlin.collections.C10975r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.service.home.a */
public final class C27418a extends C28498p {

    /* renamed from: e */
    public static final int f66507e = 8;
    @C12579k

    /* renamed from: d */
    public final C28994a f66508d;

    @Inject
    public C27418a(@C12579k C28994a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "audienceTrackingAdapter");
        this.f66508d = aVar;
    }

    /* renamed from: g0 */
    public final void mo79731g0() {
        this.f66508d.mo32670e(C10975r0.m41401k(C11078d1.m42659a(C13758b.f33419L, "Oui")));
    }
}

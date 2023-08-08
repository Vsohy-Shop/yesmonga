package com.carrefour.fid.android.airship.data.datasource;

import android.content.Context;
import com.google.android.gms.ads.identifier.C40365a;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.qualifiers.C10255b;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.airship.data.datasource.a */
public final class C13742a {
    @C12579k

    /* renamed from: a */
    public final Context f33383a;

    @Inject
    public C13742a(@C10255b @C12579k Context context) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f33383a = context;
    }

    @C12579k
    /* renamed from: a */
    public final C40365a.C40366a mo32664a() {
        C40365a.C40366a a = C40365a.m164196a(this.f33383a);
        Intrinsics.checkNotNullExpressionValue(a, "getAdvertisingIdInfo(context)");
        return a;
    }
}

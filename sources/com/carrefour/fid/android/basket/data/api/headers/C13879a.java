package com.carrefour.fid.android.basket.data.api.headers;

import com.carrefour.fid.android.shared.data.headers.C28640a;
import com.carrefour.fid.android.shared.network.C28801b;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.basket.data.api.headers.a */
public final class C13879a implements C28801b {
    @C12579k

    /* renamed from: a */
    public final C28640a f33840a;

    @Inject
    public C13879a(@C12579k C28640a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "headerBuilder");
        this.f33840a = aVar;
    }

    /* renamed from: b */
    public static /* synthetic */ HashMap m58880b(C13879a aVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return aVar.mo33205a(z);
    }

    @C12579k
    /* renamed from: a */
    public final HashMap<String, String> mo33205a(boolean z) {
        if (z) {
            this.f33840a.mo83556t();
        }
        return this.f33840a.mo83541d().mo83546i().mo83556t().mo83538C();
    }

    @C12579k
    public Map<String, String> getHeaders() {
        return m58880b(this, false, 1, (Object) null);
    }
}

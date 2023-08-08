package com.carrefour.fid.android.core.network.headers;

import com.carrefour.fid.android.shared.data.headers.C28640a;
import com.carrefour.fid.android.shared.network.C28810f;
import java.util.Map;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.core.network.headers.a */
public final class C36320a implements C28810f {
    @C12579k

    /* renamed from: a */
    public final C28640a f89734a;

    @Inject
    public C36320a(@C12579k C28640a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "headerBuilder");
        this.f89734a = aVar;
    }

    @C12579k
    public Map<String, String> getHeaders() {
        return this.f89734a.mo83546i().mo83556t().mo83541d().mo83538C();
    }
}

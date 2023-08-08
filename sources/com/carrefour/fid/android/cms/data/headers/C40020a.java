package com.carrefour.fid.android.cms.data.headers;

import com.carrefour.fid.android.shared.data.headers.C28640a;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.cms.data.headers.a */
public final class C40020a {
    @C12579k

    /* renamed from: a */
    public final C28640a f102043a;

    @Inject
    public C40020a(@C12579k C28640a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "headerBuilder");
        this.f102043a = aVar;
    }

    @C12579k
    /* renamed from: a */
    public final HashMap<String, String> mo132259a() {
        return this.f102043a.mo83546i().mo83538C();
    }
}

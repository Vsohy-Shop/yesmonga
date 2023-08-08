package com.carrefour.fid.android.core.network.headers;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.data.headers.C28640a;
import com.carrefour.fid.android.shared.network.C28810f;
import java.util.Map;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.core.network.headers.e */
public final class C36324e implements C28810f {

    /* renamed from: b */
    public static final int f89739b = C28640a.f70232g;
    @C12579k

    /* renamed from: a */
    public final C28640a f89740a;

    @Inject
    public C36324e(@C12579k C28640a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "headerBuilder");
        this.f89740a = aVar;
    }

    @C12579k
    public Map<String, String> getHeaders() {
        return this.f89740a.mo83540c().mo83546i().mo83556t().mo83538C();
    }
}

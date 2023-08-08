package com.carrefour.fid.android.shared.data.headers;

import androidx.compose.runtime.internal.C8567o;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.data.headers.e */
public final class C28644e {

    /* renamed from: b */
    public static final int f70241b = 8;
    @C12579k

    /* renamed from: a */
    public final BaseHeaders f70242a;

    @Inject
    public C28644e(@C12579k BaseHeaders baseHeaders) {
        Intrinsics.checkNotNullParameter(baseHeaders, "headerBuilder");
        this.f70242a = baseHeaders;
    }

    @C12579k
    /* renamed from: a */
    public final HashMap<String, String> mo83566a() {
        return this.f70242a.mo83546i().mo83556t().mo83538C();
    }
}

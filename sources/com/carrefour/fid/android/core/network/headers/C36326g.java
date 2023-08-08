package com.carrefour.fid.android.core.network.headers;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.data.headers.C28640a;
import java.util.Map;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.core.network.headers.g */
public final class C36326g {

    /* renamed from: b */
    public static final int f89742b = C28640a.f70232g;
    @C12579k

    /* renamed from: a */
    public final C28640a f89743a;

    @Inject
    public C36326g(@C12579k C28640a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "headerBuilder");
        this.f89743a = aVar;
    }

    @C12579k
    /* renamed from: a */
    public final Map<String, String> mo108386a() {
        return this.f89743a.mo83538C();
    }
}

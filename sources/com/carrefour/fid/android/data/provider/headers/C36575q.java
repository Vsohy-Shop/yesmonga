package com.carrefour.fid.android.data.provider.headers;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.data.headers.C28640a;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.data.provider.headers.q */
public final class C36575q {

    /* renamed from: b */
    public static final int f90309b = C28640a.f70232g;
    @C12579k

    /* renamed from: a */
    public final C28640a f90310a;

    @Inject
    public C36575q(@C12579k C28640a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "headerBuilder");
        this.f90310a = aVar;
    }

    @C12579k
    /* renamed from: a */
    public final HashMap<String, String> mo111444a() {
        return this.f90310a.mo83550n().mo83546i().mo83541d().mo83556t().mo83538C();
    }
}

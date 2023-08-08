package com.carrefour.fid.android.data.provider.headers;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.carrefour.fid.android.shared.data.headers.C28640a;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.data.provider.headers.s */
public final class C36577s {

    /* renamed from: b */
    public static final int f90312b = C28640a.f70232g;
    @C12579k

    /* renamed from: a */
    public final C28640a f90313a;

    @Inject
    public C36577s(@C12579k C28640a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "headerBuilder");
        this.f90313a = aVar;
    }

    @C12579k
    /* renamed from: a */
    public final HashMap<String, String> mo111446a(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, C28547h2.f69320h);
        return this.f90313a.mo83546i().mo83559w(str).mo83538C();
    }
}

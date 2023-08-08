package com.carrefour.fid.android.data.provider.headers;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.data.headers.C28640a;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.data.provider.headers.g */
public final class C36565g {

    /* renamed from: b */
    public static final int f90294b = C28640a.f70232g;
    @C12579k

    /* renamed from: a */
    public final C28640a f90295a;

    @Inject
    public C36565g(@C12579k C28640a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "headerBuilder");
        this.f90295a = aVar;
    }

    @C12579k
    /* renamed from: a */
    public final HashMap<String, String> mo111431a() {
        return this.f90295a.mo83546i().mo83538C();
    }
}

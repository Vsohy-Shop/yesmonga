package com.carrefour.fid.android.data.provider.headers;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.data.headers.C28640a;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.data.provider.headers.c */
public final class C36560c {

    /* renamed from: b */
    public static final int f90289b = C28640a.f70232g;
    @C12579k

    /* renamed from: a */
    public final C28640a f90290a;

    @Inject
    public C36560c(@C12579k C28640a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "headerBuilder");
        this.f90290a = aVar;
    }

    /* renamed from: b */
    public static /* synthetic */ HashMap m149898b(C36560c cVar, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return cVar.mo111427a(str, z, z2);
    }

    @C12579k
    /* renamed from: a */
    public final HashMap<String, String> mo111427a(@C12580l String str, boolean z, boolean z2) {
        if (str != null) {
            this.f90290a.mo83558v(str);
        }
        if (z) {
            this.f90290a.mo83552p();
        }
        if (z2) {
            this.f90290a.mo83556t();
        }
        return this.f90290a.mo83546i().mo83538C();
    }
}

package com.carrefour.fid.android.data.provider.headers;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.data.headers.C28640a;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.data.provider.headers.k */
public final class C36569k {

    /* renamed from: b */
    public static final int f90300b = C28640a.f70232g;
    @C12579k

    /* renamed from: a */
    public final C28640a f90301a;

    @Inject
    public C36569k(@C12579k C28640a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "headerBuilder");
        this.f90301a = aVar;
    }

    /* renamed from: b */
    public static /* synthetic */ HashMap m149919b(C36569k kVar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return kVar.mo111438a(z, z2);
    }

    @C12579k
    /* renamed from: a */
    public final HashMap<String, String> mo111438a(boolean z, boolean z2) {
        if (z) {
            this.f90301a.mo83551o();
        }
        if (z2) {
            this.f90301a.mo83537B();
        }
        return this.f90301a.mo83550n().mo83556t().mo83546i().mo83541d().mo83538C();
    }
}

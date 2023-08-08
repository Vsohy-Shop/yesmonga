package com.carrefour.fid.android.data.provider.headers;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.data.headers.C28640a;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.data.provider.headers.w */
public final class C36581w {

    /* renamed from: b */
    public static final int f90318b = C28640a.f70232g;
    @C12579k

    /* renamed from: a */
    public final C28640a f90319a;

    @Inject
    public C36581w(@C12579k C28640a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "headerBuilder");
        this.f90319a = aVar;
    }

    /* renamed from: b */
    public static /* synthetic */ HashMap m149945b(C36581w wVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return wVar.mo111450a(z);
    }

    @C12579k
    /* renamed from: a */
    public final HashMap<String, String> mo111450a(boolean z) {
        if (z) {
            this.f90319a.mo83556t();
        }
        return this.f90319a.mo83550n().mo83546i().mo83538C();
    }
}

package com.carrefour.fid.android.data.provider.headers;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.data.headers.C28640a;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.data.provider.headers.u */
public final class C36579u {

    /* renamed from: b */
    public static final int f90315b = C28640a.f70232g;
    @C12579k

    /* renamed from: a */
    public final C28640a f90316a;

    @Inject
    public C36579u(@C12579k C28640a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "headerBuilder");
        this.f90316a = aVar;
    }

    /* renamed from: b */
    public static /* synthetic */ HashMap m149940b(C36579u uVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return uVar.mo111448a(str);
    }

    @C12579k
    /* renamed from: a */
    public final HashMap<String, String> mo111448a(@C12580l String str) {
        if (str != null) {
            this.f90316a.mo83561y(str);
        }
        return this.f90316a.mo83546i().mo83538C();
    }
}

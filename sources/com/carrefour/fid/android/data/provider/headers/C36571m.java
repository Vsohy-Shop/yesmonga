package com.carrefour.fid.android.data.provider.headers;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.data.headers.C28640a;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.data.provider.headers.m */
public final class C36571m {

    /* renamed from: b */
    public static final int f90303b = C28640a.f70232g;
    @C12579k

    /* renamed from: a */
    public final C28640a f90304a;

    @Inject
    public C36571m(@C12579k C28640a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "headerBuilder");
        this.f90304a = aVar;
    }

    @C12579k
    /* renamed from: a */
    public final HashMap<String, String> mo111440a() {
        return this.f90304a.mo83546i().mo83541d().mo83562z().mo83538C();
    }
}

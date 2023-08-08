package com.carrefour.fid.android.data.provider.headers;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.data.headers.C28640a;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.data.provider.headers.i */
public final class C36567i {

    /* renamed from: b */
    public static final int f90297b = C28640a.f70232g;
    @C12579k

    /* renamed from: a */
    public final C28640a f90298a;

    @Inject
    public C36567i(@C12579k C28640a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "headerBuilder");
        this.f90298a = aVar;
    }

    @C12579k
    /* renamed from: a */
    public final HashMap<String, String> mo111433a() {
        return mo111434b().mo83542e().mo83538C();
    }

    /* renamed from: b */
    public final C28640a mo111434b() {
        this.f90298a.mo83550n().mo83556t().mo83546i().mo83541d();
        return this.f90298a;
    }

    @C12579k
    /* renamed from: c */
    public final HashMap<String, String> mo111435c() {
        return mo111434b().mo83543f().mo83538C();
    }

    @C12579k
    /* renamed from: d */
    public final HashMap<String, String> mo111436d() {
        return mo111434b().mo83544g().mo83538C();
    }
}

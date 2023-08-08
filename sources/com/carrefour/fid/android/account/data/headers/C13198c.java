package com.carrefour.fid.android.account.data.headers;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.data.headers.C28640a;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.account.data.headers.c */
public final class C13198c {

    /* renamed from: b */
    public static final int f32362b = C28640a.f70232g;
    @C12579k

    /* renamed from: a */
    public final C28640a f32363a;

    @Inject
    public C13198c(@C12579k C28640a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "headerBuilder");
        this.f32363a = aVar;
    }

    @C12579k
    /* renamed from: a */
    public final HashMap<String, String> mo31318a() {
        return this.f32363a.mo83546i().mo83557u().mo83538C();
    }
}

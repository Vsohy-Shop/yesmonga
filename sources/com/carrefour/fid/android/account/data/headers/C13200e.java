package com.carrefour.fid.android.account.data.headers;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage;
import com.carrefour.fid.android.shared.data.headers.BaseHeaders;
import com.carrefour.fid.android.shared.util.C28909d;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.account.data.headers.e */
public final class C13200e {

    /* renamed from: e */
    public static final int f32365e = 8;
    @C12579k

    /* renamed from: a */
    public final BaseAppPreferencesStorage f32366a;
    @C12579k

    /* renamed from: b */
    public final AppEnvironment f32367b;
    @C12579k

    /* renamed from: c */
    public final C28909d f32368c;

    /* renamed from: d */
    public BaseHeaders f32369d;

    @Inject
    public C13200e(@C12579k BaseAppPreferencesStorage baseAppPreferencesStorage, @C12579k AppEnvironment appEnvironment, @C12579k C28909d dVar) {
        Intrinsics.checkNotNullParameter(baseAppPreferencesStorage, "baseAppPreferencesStorage");
        Intrinsics.checkNotNullParameter(appEnvironment, "appEnvironment");
        Intrinsics.checkNotNullParameter(dVar, "applicationBuildInfo");
        this.f32366a = baseAppPreferencesStorage;
        this.f32367b = appEnvironment;
        this.f32368c = dVar;
    }

    /* renamed from: b */
    public static /* synthetic */ HashMap m57191b(C13200e eVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return eVar.mo31320a(z);
    }

    @C12579k
    /* renamed from: a */
    public final HashMap<String, String> mo31320a(boolean z) {
        BaseHeaders baseHeaders = new BaseHeaders(this.f32366a, this.f32367b, this.f32368c);
        this.f32369d = baseHeaders;
        if (z) {
            baseHeaders.mo83557u();
        }
        BaseHeaders baseHeaders2 = this.f32369d;
        if (baseHeaders2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("headerBuilder");
            baseHeaders2 = null;
        }
        return baseHeaders2.mo83549m().mo83538C();
    }
}

package com.carrefour.fid.android.shared.data.headers;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage;
import com.carrefour.fid.android.shared.util.C28905c;
import com.carrefour.fid.android.shared.util.C28909d;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.data.headers.a */
public final class C28640a extends BaseHeaders {

    /* renamed from: g */
    public static final int f70232g = 8;
    @C12579k

    /* renamed from: f */
    public final C28642c f70233f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public C28640a(@C12579k BaseAppPreferencesStorage baseAppPreferencesStorage, @C12579k AppEnvironment appEnvironment, @C12579k C28909d dVar, @C12579k C28642c cVar) {
        super(baseAppPreferencesStorage, appEnvironment, dVar);
        Intrinsics.checkNotNullParameter(baseAppPreferencesStorage, "baseAppPreferences");
        Intrinsics.checkNotNullParameter(appEnvironment, "appEnvironment");
        Intrinsics.checkNotNullParameter(dVar, "applicationBuildInfo");
        Intrinsics.checkNotNullParameter(cVar, "authHeadersRepository");
        this.f70233f = cVar;
    }

    @C12579k
    /* renamed from: d */
    public BaseHeaders mo83541d() {
        mo83539D().put(C28534f.f69111A, this.f70233f.mo31358a());
        return super.mo83541d();
    }

    @C12579k
    /* renamed from: l */
    public BaseHeaders mo83548l() {
        HashMap<String, String> D = mo83539D();
        String a = C28905c.m119542a(this.f70233f);
        if (a == null) {
            a = new String();
        }
        D.put(C28534f.f69113B, a);
        return super.mo83548l();
    }

    @C12579k
    /* renamed from: n */
    public BaseHeaders mo83550n() {
        HashMap<String, String> D = mo83539D();
        String b = C28905c.m119543b(this.f70233f);
        if (b == null) {
            b = new String();
        }
        D.put(C28534f.f69113B, b);
        return super.mo83550n();
    }

    @C12579k
    /* renamed from: x */
    public BaseHeaders mo83560x() {
        mo83539D().put(C28534f.f69182u, this.f70233f.mo31359b());
        return super.mo83560x();
    }
}

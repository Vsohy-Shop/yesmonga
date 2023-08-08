package com.carrefour.fid.android.shared.data.headers;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage;
import com.carrefour.fid.android.shared.util.C28909d;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11970i;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
public class BaseHeaders {

    /* renamed from: e */
    public static final int f70227e = 8;
    @C12579k

    /* renamed from: a */
    public final BaseAppPreferencesStorage f70228a;
    @C12579k

    /* renamed from: b */
    public final AppEnvironment f70229b;
    @C12579k

    /* renamed from: c */
    public final C28909d f70230c;
    @C12579k

    /* renamed from: d */
    public final HashMap<String, String> f70231d = new HashMap<>();

    @Inject
    public BaseHeaders(@C12579k BaseAppPreferencesStorage baseAppPreferencesStorage, @C12579k AppEnvironment appEnvironment, @C12579k C28909d dVar) {
        Intrinsics.checkNotNullParameter(baseAppPreferencesStorage, "baseAppPreferences");
        Intrinsics.checkNotNullParameter(appEnvironment, "appEnvironment");
        Intrinsics.checkNotNullParameter(dVar, "applicationBuildInfo");
        this.f70228a = baseAppPreferencesStorage;
        this.f70229b = appEnvironment;
        this.f70230c = dVar;
    }

    /* renamed from: k */
    public static /* synthetic */ BaseHeaders m118568k(BaseHeaders baseHeaders, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            return baseHeaders.mo83547j(str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addAudience");
    }

    @C12579k
    /* renamed from: A */
    public final BaseHeaders mo83536A(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "otpCode");
        this.f70231d.put(C28534f.f69180t, str);
        return this;
    }

    @C12579k
    /* renamed from: B */
    public final BaseHeaders mo83537B() {
        this.f70231d.put(C28534f.f69143a0, C28534f.f69145b0);
        return this;
    }

    @C12579k
    /* renamed from: C */
    public final HashMap<String, String> mo83538C() {
        return (HashMap) C11970i.m47708b((CoroutineContext) null, new BaseHeaders$build$1(this, (C11045c<? super BaseHeaders$build$1>) null), 1, (Object) null);
    }

    @C12579k
    /* renamed from: D */
    public final HashMap<String, String> mo83539D() {
        return this.f70231d;
    }

    @C12579k
    /* renamed from: c */
    public final BaseHeaders mo83540c() {
        this.f70231d.put("Accept", "application/json");
        return this;
    }

    @C12579k
    /* renamed from: d */
    public BaseHeaders mo83541d() {
        return this;
    }

    @C12579k
    /* renamed from: e */
    public final BaseHeaders mo83542e() {
        this.f70231d.put("action", C28534f.f69141Z);
        return this;
    }

    @C12579k
    /* renamed from: f */
    public final BaseHeaders mo83543f() {
        this.f70231d.put("action", C28534f.f69139X);
        return this;
    }

    @C12579k
    /* renamed from: g */
    public final BaseHeaders mo83544g() {
        this.f70231d.put("action", C28534f.f69140Y);
        return this;
    }

    @C12579k
    /* renamed from: h */
    public final BaseHeaders mo83545h() {
        this.f70231d.put("action", C28534f.f69164l);
        return this;
    }

    @C12579k
    /* renamed from: i */
    public final BaseHeaders mo83546i() {
        this.f70231d.put(C28534f.f69125J, this.f70229b.mo84165e());
        this.f70231d.put(C28534f.f69126K, this.f70229b.mo84166f());
        return this;
    }

    @C12579k
    /* renamed from: j */
    public final BaseHeaders mo83547j(@C12580l String str) {
        HashMap<String, String> hashMap = this.f70231d;
        if (str == null) {
            str = C28534f.f69170o;
        }
        hashMap.put(C28534f.f69166m, str);
        return this;
    }

    @C12579k
    /* renamed from: l */
    public BaseHeaders mo83548l() {
        return this;
    }

    @C12579k
    /* renamed from: m */
    public final BaseHeaders mo83549m() {
        this.f70231d.put(C28534f.f69113B, this.f70229b.mo84182v());
        return this;
    }

    @C12579k
    /* renamed from: n */
    public BaseHeaders mo83550n() {
        return this;
    }

    @C12579k
    /* renamed from: o */
    public final BaseHeaders mo83551o() {
        this.f70231d.put(C28534f.f69136U, C28534f.f69137V);
        return this;
    }

    @C12579k
    /* renamed from: p */
    public final BaseHeaders mo83552p() {
        this.f70231d.put("channel", C28534f.f69149d0);
        return this;
    }

    @C12579k
    /* renamed from: q */
    public final BaseHeaders mo83553q() {
        this.f70231d.put(C28534f.f69160j, C28534f.f69168n);
        return this;
    }

    @C12579k
    /* renamed from: r */
    public final BaseHeaders mo83554r() {
        this.f70231d.put(C28534f.f69160j, C28534f.f69162k);
        return this;
    }

    @C12579k
    /* renamed from: s */
    public final BaseHeaders mo83555s() {
        this.f70231d.put(C28534f.f69168n, C28534f.f69170o);
        return this;
    }

    @C12579k
    /* renamed from: t */
    public final BaseHeaders mo83556t() {
        this.f70231d.put("Content-Type", "application/json");
        return this;
    }

    @C12579k
    /* renamed from: u */
    public final BaseHeaders mo83557u() {
        this.f70231d.put("Content-Type", "application/x-www-form-urlencoded");
        return this;
    }

    @C12579k
    /* renamed from: v */
    public final BaseHeaders mo83558v(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "loyalityCardId");
        this.f70231d.put(C28534f.f69174q, str);
        return this;
    }

    @C12579k
    /* renamed from: w */
    public final BaseHeaders mo83559w(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, C28547h2.f69320h);
        this.f70231d.put(C28534f.f69124I, str);
        return this;
    }

    @C12579k
    /* renamed from: x */
    public BaseHeaders mo83560x() {
        return this;
    }

    @C12579k
    /* renamed from: y */
    public final BaseHeaders mo83561y(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "loyalityCardId");
        this.f70231d.put(C28534f.f69174q, str);
        return this;
    }

    @C12579k
    /* renamed from: z */
    public final BaseHeaders mo83562z() {
        this.f70231d.put(C28534f.f69118D0, C28534f.f69120E0);
        return this;
    }
}

package com.carrefour.fid.android.core.auth;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.account.data.entities.AuthStateResponse;
import com.carrefour.fid.android.account.data.entities.extentions.C13181d;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.domain.interactors.logm.C37694a;
import com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage;
import com.carrefour.fid.android.shared.network.C28811g;
import com.carrefour.fid.android.shared.p045di.annotation.C28670n;
import com.carrefour.fid.android.shared.util.C28951s;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11965h;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Singleton
@C8567o(parameters = 0)
@C11363r0({"SMAP\nTokenRefresherImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TokenRefresherImpl.kt\ncom/carrefour/fid/android/core/auth/TokenRefresherImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,75:1\n1#2:76\n*E\n"})
public final class TokenRefresherImpl extends TokenRefresher {

    /* renamed from: f */
    public static final int f89216f = 8;
    @C12579k

    /* renamed from: b */
    public final LoginRepository f89217b;
    @C12579k

    /* renamed from: c */
    public final CoroutineDispatcher f89218c;
    @C12579k

    /* renamed from: d */
    public final C37694a f89219d;
    @C12579k

    /* renamed from: e */
    public final BaseAppPreferencesStorage f89220e;

    @Inject
    public TokenRefresherImpl(@C12579k LoginRepository loginRepository, @C28670n @C12579k CoroutineDispatcher coroutineDispatcher, @C12579k C37694a aVar, @C12579k BaseAppPreferencesStorage baseAppPreferencesStorage) {
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(aVar, "logM");
        Intrinsics.checkNotNullParameter(baseAppPreferencesStorage, "baseAppPreferencesStorage");
        this.f89217b = loginRepository;
        this.f89218c = coroutineDispatcher;
        this.f89219d = aVar;
        this.f89220e = baseAppPreferencesStorage;
    }

    /* renamed from: b */
    public boolean mo107985b() {
        return C13181d.m57147f(this.f89217b.mo31354f());
    }

    @C12580l
    /* renamed from: c */
    public C28811g mo107986c() {
        boolean z;
        AuthStateResponse f = this.f89217b.mo31354f();
        if (f == null) {
            return null;
        }
        boolean z2 = true;
        if (f.getIdToken().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (f.getAccessToken().length() != 0) {
                z2 = false;
            }
            if (!z2) {
                String idToken = f.getIdToken();
                String b = C28951s.f70964a.mo84276b(f.getAccessToken());
                if (b == null) {
                    b = "";
                }
                return new C28811g(idToken, b);
            }
        }
        return null;
    }

    @C12580l
    /* renamed from: d */
    public Object mo107987d(@C12579k C11045c<? super C28811g> cVar) {
        return C11965h.m47673h(this.f89218c, new TokenRefresherImpl$renewToken$2(this, (C11045c<? super TokenRefresherImpl$renewToken$2>) null), cVar);
    }
}

package com.carrefour.fid.android.rgpd.airship;

import android.content.Context;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.shared.constant.PrivacyConsentCategory;
import com.carrefour.fid.android.shared.privacy.C28876b;
import com.carrefour.fid.android.tracking.C28994a;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12079p0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;

@Singleton
@C8567o(parameters = 0)
public final class AirshipSettings implements C28876b {

    /* renamed from: e */
    public static final int f68350e = 8;
    @C12579k

    /* renamed from: a */
    public final LoginRepository f68351a;
    @C12579k

    /* renamed from: b */
    public final C28994a f68352b;
    @C12579k

    /* renamed from: c */
    public final LoyaltyPreferencesStorage f68353c;
    @C12579k

    /* renamed from: d */
    public final C12074o0 f68354d = C12079p0.m48260a(C11768d1.m46781c());

    @Inject
    public AirshipSettings(@C12579k LoginRepository loginRepository, @C12579k C28994a aVar, @C12579k LoyaltyPreferencesStorage loyaltyPreferencesStorage) {
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        Intrinsics.checkNotNullParameter(aVar, "audienceTracking");
        Intrinsics.checkNotNullParameter(loyaltyPreferencesStorage, "loyaltyPreferencesStorage");
        this.f68351a = loginRepository;
        this.f68352b = aVar;
        this.f68353c = loyaltyPreferencesStorage;
    }

    /* renamed from: a */
    public void mo32686a() {
        C11723c2 unused = C12038j.m48061f(this.f68354d, (CoroutineContext) null, (CoroutineStart) null, new AirshipSettings$optIn$1(this, (C11045c<? super AirshipSettings$optIn$1>) null), 3, (Object) null);
    }

    @C12579k
    /* renamed from: c */
    public String mo32687c() {
        return PrivacyConsentCategory.AIRSHIP.mo83424q();
    }

    /* renamed from: e */
    public void mo32688e() {
        C11723c2 unused = C12038j.m48061f(this.f68354d, (CoroutineContext) null, (CoroutineStart) null, new AirshipSettings$optOut$1((C11045c<? super AirshipSettings$optOut$1>) null), 3, (Object) null);
    }

    /* renamed from: f */
    public boolean mo32689f(@C12579k Context context) {
        return C28876b.C28877a.m119433a(this, context);
    }
}

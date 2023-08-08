package com.carrefour.fid.android;

import android.annotation.TargetApi;
import android.content.Context;
import androidx.compose.runtime.internal.C8567o;
import androidx.startup.C20495a;
import com.carrefour.fid.android.account.data.repositories.AccountRepository;
import com.carrefour.fid.android.airship.data.datasource.C13747e;
import com.carrefour.fid.android.analytics.data.analytics.C13783a;
import com.carrefour.fid.android.app.utils.CrfPayUtils;
import com.carrefour.fid.android.core.datastore.AppPreferencesStorage;
import com.carrefour.fid.android.data.managers.C36555b;
import com.carrefour.fid.android.loyalty.core.datastore.LoyaltyPreferencesStorage;
import com.carrefour.fid.android.utils.initializer.AudienceTrackingInitializer;
import com.google.android.play.core.missingsplits.C32115c;
import com.google.android.play.core.splitcompat.C32133a;
import dagger.hilt.android.C10175f;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0017\u0018\u0000 42\u00020\u0001:\u00015B\u0007¢\u0006\u0004\b2\u00103J\b\u0010\u0003\u001a\u00020\u0002H\u0017J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001c\u001a\u00020\u00178\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\b\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010*\u001a\u00020%8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\n\u0010&\u001a\u0004\b\u0010\u0010'\"\u0004\b(\u0010)R\"\u00101\u001a\u00020+8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b\u001e\u0010.\"\u0004\b/\u00100¨\u00066"}, mo22516d2 = {"Lcom/carrefour/fid/android/OneAppApplication;", "Lcom/google/android/play/core/splitcompat/b;", "Lkotlin/d2;", "onCreate", "Landroid/content/Context;", "base", "attachBaseContext", "Lcom/carrefour/fid/android/data/managers/b;", "c", "Lcom/carrefour/fid/android/data/managers/b;", "g", "()Lcom/carrefour/fid/android/data/managers/b;", "m", "(Lcom/carrefour/fid/android/data/managers/b;)V", "loginManager", "Lcom/carrefour/fid/android/core/datastore/AppPreferencesStorage;", "d", "Lcom/carrefour/fid/android/core/datastore/AppPreferencesStorage;", "e", "()Lcom/carrefour/fid/android/core/datastore/AppPreferencesStorage;", "k", "(Lcom/carrefour/fid/android/core/datastore/AppPreferencesStorage;)V", "appPreferencesStorage", "Lcom/carrefour/fid/android/account/data/repositories/AccountRepository;", "Lcom/carrefour/fid/android/account/data/repositories/AccountRepository;", "()Lcom/carrefour/fid/android/account/data/repositories/AccountRepository;", "i", "(Lcom/carrefour/fid/android/account/data/repositories/AccountRepository;)V", "accountRepository", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "f", "Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "h", "()Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;", "n", "(Lcom/carrefour/fid/android/loyalty/core/datastore/LoyaltyPreferencesStorage;)V", "loyaltyPreferencesStorage", "Lcom/carrefour/fid/android/analytics/data/analytics/a;", "Lcom/carrefour/fid/android/analytics/data/analytics/a;", "()Lcom/carrefour/fid/android/analytics/data/analytics/a;", "j", "(Lcom/carrefour/fid/android/analytics/data/analytics/a;)V", "analyticManager", "Lcom/carrefour/fid/android/airship/data/datasource/e;", "v", "Lcom/carrefour/fid/android/airship/data/datasource/e;", "()Lcom/carrefour/fid/android/airship/data/datasource/e;", "l", "(Lcom/carrefour/fid/android/airship/data/datasource/e;)V", "audienceTrackingManager", "<init>", "()V", "w", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C10175f
@C8567o(parameters = 0)
public class OneAppApplication extends C13841b0 {
    @C12579k

    /* renamed from: w */
    public static final C13127a f32244w = new C13127a((DefaultConstructorMarker) null);

    /* renamed from: x */
    public static final int f32245x = 8;

    /* renamed from: y */
    public static OneAppApplication f32246y;
    @Inject

    /* renamed from: c */
    public C36555b f32247c;
    @Inject

    /* renamed from: d */
    public AppPreferencesStorage f32248d;
    @Inject

    /* renamed from: e */
    public AccountRepository f32249e;
    @Inject

    /* renamed from: f */
    public LoyaltyPreferencesStorage f32250f;
    @Inject

    /* renamed from: g */
    public C13783a f32251g;
    @Inject

    /* renamed from: v */
    public C13747e f32252v;

    /* renamed from: com.carrefour.fid.android.OneAppApplication$a */
    public static final class C13127a {
        public /* synthetic */ C13127a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final synchronized OneAppApplication mo30856a() {
            OneAppApplication oneAppApplication = OneAppApplication.f32246y;
            if (oneAppApplication != null) {
                return oneAppApplication;
            }
            Intrinsics.throwUninitializedPropertyAccessException("sInstance");
            return null;
        }

        /* renamed from: b */
        public final void mo30857b(@C12579k OneAppApplication oneAppApplication) {
            Intrinsics.checkNotNullParameter(oneAppApplication, "<set-?>");
            OneAppApplication.f32246y = oneAppApplication;
        }

        public C13127a() {
        }
    }

    public void attachBaseContext(@C12580l Context context) {
        super.attachBaseContext(context);
        C32133a.m130058i(this);
    }

    @C12579k
    /* renamed from: c */
    public final AccountRepository mo30843c() {
        AccountRepository accountRepository = this.f32249e;
        if (accountRepository != null) {
            return accountRepository;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountRepository");
        return null;
    }

    @C12579k
    /* renamed from: d */
    public final C13783a mo30844d() {
        C13783a aVar = this.f32251g;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analyticManager");
        return null;
    }

    @C12579k
    /* renamed from: e */
    public final AppPreferencesStorage mo30845e() {
        AppPreferencesStorage appPreferencesStorage = this.f32248d;
        if (appPreferencesStorage != null) {
            return appPreferencesStorage;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appPreferencesStorage");
        return null;
    }

    @C12579k
    /* renamed from: f */
    public final C13747e mo30846f() {
        C13747e eVar = this.f32252v;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("audienceTrackingManager");
        return null;
    }

    @C12579k
    /* renamed from: g */
    public final C36555b mo30847g() {
        C36555b bVar = this.f32247c;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("loginManager");
        return null;
    }

    @C12579k
    /* renamed from: h */
    public final LoyaltyPreferencesStorage mo30848h() {
        LoyaltyPreferencesStorage loyaltyPreferencesStorage = this.f32250f;
        if (loyaltyPreferencesStorage != null) {
            return loyaltyPreferencesStorage;
        }
        Intrinsics.throwUninitializedPropertyAccessException("loyaltyPreferencesStorage");
        return null;
    }

    /* renamed from: i */
    public final void mo30849i(@C12579k AccountRepository accountRepository) {
        Intrinsics.checkNotNullParameter(accountRepository, "<set-?>");
        this.f32249e = accountRepository;
    }

    /* renamed from: j */
    public final void mo30850j(@C12579k C13783a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f32251g = aVar;
    }

    /* renamed from: k */
    public final void mo30851k(@C12579k AppPreferencesStorage appPreferencesStorage) {
        Intrinsics.checkNotNullParameter(appPreferencesStorage, "<set-?>");
        this.f32248d = appPreferencesStorage;
    }

    /* renamed from: l */
    public final void mo30852l(@C12579k C13747e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        this.f32252v = eVar;
    }

    /* renamed from: m */
    public final void mo30853m(@C12579k C36555b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.f32247c = bVar;
    }

    /* renamed from: n */
    public final void mo30854n(@C12579k LoyaltyPreferencesStorage loyaltyPreferencesStorage) {
        Intrinsics.checkNotNullParameter(loyaltyPreferencesStorage, "<set-?>");
        this.f32250f = loyaltyPreferencesStorage;
    }

    @TargetApi(4)
    public void onCreate() {
        if (!C32115c.m130020a(this).mo92861a()) {
            f32244w.mo30857b(this);
            super.onCreate();
            C20495a.m95528e(this).mo61439f(AudienceTrackingInitializer.class);
            CrfPayUtils.f33757a.mo32772c(this);
        }
    }
}

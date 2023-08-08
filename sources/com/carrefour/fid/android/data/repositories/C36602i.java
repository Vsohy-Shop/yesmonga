package com.carrefour.fid.android.data.repositories;

import android.content.Context;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.constant.PrivacyConsentCategory;
import com.carrefour.fid.android.shared.privacy.C28876b;
import com.google.firebase.analytics.FirebaseAnalytics;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.data.repositories.i */
public final class C36602i implements C28876b {

    /* renamed from: b */
    public static final int f90489b = 8;
    @C12579k

    /* renamed from: a */
    public final FirebaseAnalytics f90490a;

    @Inject
    public C36602i(@C12579k FirebaseAnalytics firebaseAnalytics) {
        Intrinsics.checkNotNullParameter(firebaseAnalytics, "analytics");
        this.f90490a = firebaseAnalytics;
    }

    /* renamed from: a */
    public void mo32686a() {
        this.f90490a.mo94634e(true);
    }

    @C12579k
    /* renamed from: c */
    public String mo32687c() {
        return PrivacyConsentCategory.FIREBASE_ANALYTICS.mo83424q();
    }

    /* renamed from: e */
    public void mo32688e() {
        this.f90490a.mo94634e(false);
    }

    /* renamed from: f */
    public boolean mo32689f(@C12579k Context context) {
        return C28876b.C28877a.m119433a(this, context);
    }
}

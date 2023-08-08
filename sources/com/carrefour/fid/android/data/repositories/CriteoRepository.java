package com.carrefour.fid.android.data.repositories;

import android.content.Context;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.entities.mapper.C36474d0;
import com.carrefour.fid.android.data.provider.headers.C36562e;
import com.carrefour.fid.android.data.provider.parameters.CriteoParametersProvider;
import com.carrefour.fid.android.data.service.C36627f;
import com.carrefour.fid.android.shared.constant.PrivacyConsentCategory;
import com.carrefour.fid.android.shared.privacy.C28874a;
import com.urbanairship.iam.events.C9175a;
import com.urbanairship.wallet.C9700d;
import dagger.hilt.android.qualifiers.C10255b;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@Singleton
@C8567o(parameters = 0)
public final class CriteoRepository implements C28874a {

    /* renamed from: f */
    public static final int f90367f = 8;
    @C12579k

    /* renamed from: a */
    public final C36627f f90368a;
    @C12579k

    /* renamed from: b */
    public final C36474d0 f90369b;
    @C12579k

    /* renamed from: c */
    public final C36562e f90370c;
    @C12579k

    /* renamed from: d */
    public final CriteoParametersProvider f90371d;
    @C12579k

    /* renamed from: e */
    public final Context f90372e;

    @Inject
    public CriteoRepository(@C12579k C36627f fVar, @C12579k C36474d0 d0Var, @C12579k C36562e eVar, @C12579k CriteoParametersProvider criteoParametersProvider, @C10255b @C12579k Context context) {
        Intrinsics.checkNotNullParameter(fVar, "service");
        Intrinsics.checkNotNullParameter(d0Var, "mapper");
        Intrinsics.checkNotNullParameter(eVar, C9700d.f26570q);
        Intrinsics.checkNotNullParameter(criteoParametersProvider, "criteoParametersProvider");
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f90368a = fVar;
        this.f90369b = d0Var;
        this.f90370c = eVar;
        this.f90371d = criteoParametersProvider;
        this.f90372e = context;
    }

    @C12579k
    /* renamed from: c */
    public String mo32687c() {
        return PrivacyConsentCategory.CRITEO.mo83424q();
    }

    /* renamed from: f */
    public boolean mo32689f(@C12579k Context context) {
        return C28874a.C28875a.m119430a(this, context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111492i(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.criteo.C38006h r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.criteo.C38014p>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.data.repositories.CriteoRepository$getAdServing$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.data.repositories.CriteoRepository$getAdServing$1 r0 = (com.carrefour.fid.android.data.repositories.CriteoRepository$getAdServing$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.CriteoRepository$getAdServing$1 r0 = new com.carrefour.fid.android.data.repositories.CriteoRepository$getAdServing$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r5 = r6.mo21858l()
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.data.repositories.CriteoRepository$getAdServing$2 r6 = new com.carrefour.fid.android.data.repositories.CriteoRepository$getAdServing$2
            r2 = 0
            r6.<init>(r5, r4, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r6, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.CriteoRepository.mo111492i(com.carrefour.fid.android.domain.models.criteo.h, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: j */
    public final Context mo111493j() {
        return this.f90372e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111494k(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.criteo.C38006h r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.data.repositories.CriteoRepository$sendEvent$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.data.repositories.CriteoRepository$sendEvent$1 r0 = (com.carrefour.fid.android.data.repositories.CriteoRepository$sendEvent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.CriteoRepository$sendEvent$1 r0 = new com.carrefour.fid.android.data.repositories.CriteoRepository$sendEvent$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r5 = r6.mo21858l()
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.data.repositories.CriteoRepository$sendEvent$2 r6 = new com.carrefour.fid.android.data.repositories.CriteoRepository$sendEvent$2
            r2 = 0
            r6.<init>(r5, r4, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r6, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.CriteoRepository.mo111494k(com.carrefour.fid.android.domain.models.criteo.h, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111495l(@org.jetbrains.annotations.C12579k java.lang.String r5, boolean r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.data.repositories.CriteoRepository$trackEvent$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.data.repositories.CriteoRepository$trackEvent$1 r0 = (com.carrefour.fid.android.data.repositories.CriteoRepository$trackEvent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.CriteoRepository$trackEvent$1 r0 = new com.carrefour.fid.android.data.repositories.CriteoRepository$trackEvent$1
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r5 = r7.mo21858l()
            goto L_0x0049
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.data.repositories.CriteoRepository$trackEvent$2 r7 = new com.carrefour.fid.android.data.repositories.CriteoRepository$trackEvent$2
            r2 = 0
            r7.<init>(r4, r6, r5, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r7, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.CriteoRepository.mo111495l(java.lang.String, boolean, kotlin.coroutines.c):java.lang.Object");
    }
}

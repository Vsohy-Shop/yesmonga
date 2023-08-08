package com.carrefour.fid.android.data.repositories;

import android.content.Context;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.data.service.C36631j;
import com.carrefour.fid.android.domain.repositories.C38195d;
import com.carrefour.fid.android.shared.constant.PrivacyConsentCategory;
import com.carrefour.fid.android.shared.privacy.C28874a;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.qualifiers.C10255b;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
public final class LuckyCartBannerRepository implements C28874a, C38195d {

    /* renamed from: e */
    public static final int f90382e = 8;
    @C12579k

    /* renamed from: a */
    public final Context f90383a;
    @C12579k

    /* renamed from: b */
    public final C36631j f90384b;
    @C12579k

    /* renamed from: c */
    public final LoginRepository f90385c;
    @C12579k

    /* renamed from: d */
    public final AppEnvironment f90386d;

    @Inject
    public LuckyCartBannerRepository(@C10255b @C12579k Context context, @C12579k C36631j jVar, @C12579k LoginRepository loginRepository, @C12579k AppEnvironment appEnvironment) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(jVar, "apiService");
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        Intrinsics.checkNotNullParameter(appEnvironment, "appEnvironment");
        this.f90383a = context;
        this.f90384b = jVar;
        this.f90385c = loginRepository;
        this.f90386d = appEnvironment;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo111505b(@org.jetbrains.annotations.C12580l java.lang.String r5, @org.jetbrains.annotations.C12580l java.lang.String r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.luckycart.LuckyCartBanners>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.data.repositories.LuckyCartBannerRepository$getBannersList$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.data.repositories.LuckyCartBannerRepository$getBannersList$1 r0 = (com.carrefour.fid.android.data.repositories.LuckyCartBannerRepository$getBannersList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.LuckyCartBannerRepository$getBannersList$1 r0 = new com.carrefour.fid.android.data.repositories.LuckyCartBannerRepository$getBannersList$1
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
            com.carrefour.fid.android.data.repositories.LuckyCartBannerRepository$getBannersList$2 r7 = new com.carrefour.fid.android.data.repositories.LuckyCartBannerRepository$getBannersList$2
            r2 = 0
            r7.<init>(r4, r5, r6, r2)
            r0.label = r3
            java.lang.Object r5 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r7, r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.LuckyCartBannerRepository.mo111505b(java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: c */
    public String mo32687c() {
        return PrivacyConsentCategory.LUCKY_CART.mo83424q();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo111506d(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.luckycart.LuckyCartPageType r13, @org.jetbrains.annotations.C12579k java.lang.String r14, @org.jetbrains.annotations.C12580l java.lang.String r15, @org.jetbrains.annotations.C12580l java.lang.String r16, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.luckycart.C38047a>> r17) {
        /*
            r12 = this;
            r0 = r17
            boolean r1 = r0 instanceof com.carrefour.fid.android.data.repositories.LuckyCartBannerRepository$getBannerDetails$1
            if (r1 == 0) goto L_0x0016
            r1 = r0
            com.carrefour.fid.android.data.repositories.LuckyCartBannerRepository$getBannerDetails$1 r1 = (com.carrefour.fid.android.data.repositories.LuckyCartBannerRepository$getBannerDetails$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0016
            int r2 = r2 - r3
            r1.label = r2
            r9 = r12
            goto L_0x001c
        L_0x0016:
            com.carrefour.fid.android.data.repositories.LuckyCartBannerRepository$getBannerDetails$1 r1 = new com.carrefour.fid.android.data.repositories.LuckyCartBannerRepository$getBannerDetails$1
            r9 = r12
            r1.<init>(r12, r0)
        L_0x001c:
            java.lang.Object r0 = r1.result
            java.lang.Object r10 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r1.label
            r11 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r11) goto L_0x0033
            kotlin.C11661u0.m45747n(r0)
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.mo21858l()
            goto L_0x0054
        L_0x0033:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003b:
            kotlin.C11661u0.m45747n(r0)
            com.carrefour.fid.android.data.repositories.LuckyCartBannerRepository$getBannerDetails$2 r0 = new com.carrefour.fid.android.data.repositories.LuckyCartBannerRepository$getBannerDetails$2
            r8 = 0
            r2 = r0
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1.label = r11
            java.lang.Object r0 = com.carrefour.fid.android.shared.network.errorhandling.HttpErrorHandlerKt.m119234a(r0, r1)
            if (r0 != r10) goto L_0x0054
            return r10
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.LuckyCartBannerRepository.mo111506d(com.carrefour.fid.android.domain.models.luckycart.LuckyCartPageType, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: f */
    public boolean mo32689f(@C12579k Context context) {
        return C28874a.C28875a.m119430a(this, context);
    }

    @C12579k
    /* renamed from: j */
    public final Context mo111507j() {
        return this.f90383a;
    }

    /* renamed from: k */
    public final String mo111508k() {
        String d = this.f90385c.mo31352d();
        return d.length() == 0 ? "unknown" : d;
    }
}

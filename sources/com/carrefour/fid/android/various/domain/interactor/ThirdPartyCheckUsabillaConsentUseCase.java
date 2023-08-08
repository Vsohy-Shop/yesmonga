package com.carrefour.fid.android.various.domain.interactor;

import android.content.Context;
import com.carrefour.fid.android.domain.interactors.feedback.C37688c;
import com.carrefour.fid.android.shared.constant.PrivacyConsentCategory;
import com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage;
import com.carrefour.fid.android.shared.privacy.C28874a;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.qualifiers.C10255b;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class ThirdPartyCheckUsabillaConsentUseCase implements C37688c, C28874a {
    @C12579k

    /* renamed from: a */
    public final Context f58333a;
    @C12579k

    /* renamed from: b */
    public final BaseAppPreferencesStorage f58334b;

    @Inject
    public ThirdPartyCheckUsabillaConsentUseCase(@C10255b @C12579k Context context, @C12579k BaseAppPreferencesStorage baseAppPreferencesStorage) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(baseAppPreferencesStorage, "baseAppPreferences");
        this.f58333a = context;
        this.f58334b = baseAppPreferencesStorage;
    }

    @C12579k
    /* renamed from: c */
    public String mo32687c() {
        return PrivacyConsentCategory.USABILLA.mo83424q();
    }

    /* renamed from: f */
    public boolean mo32689f(@C12579k Context context) {
        return C28874a.C28875a.m119430a(this, context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172812invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.Boolean>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.various.domain.interactor.ThirdPartyCheckUsabillaConsentUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.various.domain.interactor.ThirdPartyCheckUsabillaConsentUseCase$invoke$1 r0 = (com.carrefour.fid.android.various.domain.interactor.ThirdPartyCheckUsabillaConsentUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.various.domain.interactor.ThirdPartyCheckUsabillaConsentUseCase$invoke$1 r0 = new com.carrefour.fid.android.various.domain.interactor.ThirdPartyCheckUsabillaConsentUseCase$invoke$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            boolean r1 = r0.Z$0
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.various.core.utils.a r0 = (com.carrefour.fid.android.various.core.utils.C22755a) r0
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0056
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            android.content.Context r6 = r5.f58333a
            boolean r6 = r5.mo32689f(r6)
            if (r6 == 0) goto L_0x0060
            com.carrefour.fid.android.various.core.utils.a r2 = com.carrefour.fid.android.various.core.utils.C22755a.f58271a
            com.carrefour.fid.android.shared.data.datastore.pref.BaseAppPreferencesStorage r4 = r5.f58334b
            r0.L$0 = r2
            r0.Z$0 = r6
            r0.label = r3
            java.lang.Object r0 = r4.mo83495c(r0)
            if (r0 != r1) goto L_0x0053
            return r1
        L_0x0053:
            r1 = r6
            r6 = r0
            r0 = r2
        L_0x0056:
            com.carrefour.fid.android.shared.data.datastore.pref.e r6 = (com.carrefour.fid.android.shared.data.datastore.pref.C28631e) r6
            java.lang.String r6 = r6.mo83520d()
            r0.mo67151d(r6)
            r6 = r1
        L_0x0060:
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r6)
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.various.domain.interactor.ThirdPartyCheckUsabillaConsentUseCase.m172812invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}

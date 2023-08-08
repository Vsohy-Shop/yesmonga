package com.carrefour.fid.android.consent.domain.interactors;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.consent.core.datastore.ConsentPreferencesStorage;
import com.carrefour.fid.android.domain.interactors.C37678e;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003HBø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, mo22516d2 = {"Lcom/carrefour/fid/android/consent/domain/interactors/SaveConsentCurrentDateUseCase;", "Lcom/carrefour/fid/android/domain/interactors/e;", "Lkotlin/d2;", "Lkotlin/Result;", "invoke-IoAF18A", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "invoke", "Lcom/carrefour/fid/android/consent/core/datastore/ConsentPreferencesStorage;", "consentPreferencesStorage", "Lcom/carrefour/fid/android/consent/core/datastore/ConsentPreferencesStorage;", "<init>", "(Lcom/carrefour/fid/android/consent/core/datastore/ConsentPreferencesStorage;)V", "consent_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class SaveConsentCurrentDateUseCase implements C37678e<C11079d2> {
    public static final int $stable = 8;
    @C12579k
    private final ConsentPreferencesStorage consentPreferencesStorage;

    @Inject
    public SaveConsentCurrentDateUseCase(@C12579k ConsentPreferencesStorage consentPreferencesStorage2) {
        Intrinsics.checkNotNullParameter(consentPreferencesStorage2, "consentPreferencesStorage");
        this.consentPreferencesStorage = consentPreferencesStorage2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172924invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.consent.domain.interactors.SaveConsentCurrentDateUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.consent.domain.interactors.SaveConsentCurrentDateUseCase$invoke$1 r0 = (com.carrefour.fid.android.consent.domain.interactors.SaveConsentCurrentDateUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.consent.domain.interactors.SaveConsentCurrentDateUseCase$invoke$1 r0 = new com.carrefour.fid.android.consent.domain.interactors.SaveConsentCurrentDateUseCase$invoke$1
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r7)
            goto L_0x0047
        L_0x0029:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0031:
            kotlin.C11661u0.m45747n(r7)
            com.carrefour.fid.android.consent.core.datastore.ConsentPreferencesStorage r7 = r6.consentPreferencesStorage
            org.joda.time.DateTime r2 = org.joda.time.DateTime.m51192J2()
            long r4 = r2.mo27912k()
            r0.label = r3
            java.lang.Object r7 = r7.setConsentSkipDate(r4, r0)
            if (r7 != r1) goto L_0x0047
            return r1
        L_0x0047:
            kotlin.Result$a r7 = kotlin.Result.f28060a
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            java.lang.Object r7 = kotlin.Result.m38702b(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.consent.domain.interactors.SaveConsentCurrentDateUseCase.m172924invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}

package com.carrefour.fid.android.consent.domain.interactors;

import com.carrefour.fid.android.consent.domain.repositories.ConsentRepository;
import com.carrefour.fid.android.domain.interactors.consent.C37629a;
import com.carrefour.fid.android.domain.interactors.loyalty.C37697b;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002HBø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0013"}, mo22516d2 = {"Lcom/carrefour/fid/android/consent/domain/interactors/ConsentGetConsentsUseCase;", "Lcom/carrefour/fid/android/domain/interactors/consent/a;", "Lkotlin/Result;", "", "Lcom/carrefour/fid/android/domain/models/consent/ConsentOptIn;", "invoke-IoAF18A", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "invoke", "Lcom/carrefour/fid/android/consent/domain/repositories/ConsentRepository;", "consentRepository", "Lcom/carrefour/fid/android/consent/domain/repositories/ConsentRepository;", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "getUserInfoUseCase", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "Lcom/carrefour/fid/android/domain/interactors/loyalty/b;", "getLoyaltyCardNumberUseCase", "Lcom/carrefour/fid/android/domain/interactors/loyalty/b;", "<init>", "(Lcom/carrefour/fid/android/consent/domain/repositories/ConsentRepository;Lcom/carrefour/fid/android/domain/interactors/user/e;Lcom/carrefour/fid/android/domain/interactors/loyalty/b;)V", "consent_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class ConsentGetConsentsUseCase implements C37629a {
    @C12579k
    private final ConsentRepository consentRepository;
    @C12579k
    private final C37697b getLoyaltyCardNumberUseCase;
    @C12579k
    private final C37878e getUserInfoUseCase;

    @Inject
    public ConsentGetConsentsUseCase(@C12579k ConsentRepository consentRepository2, @C12579k C37878e eVar, @C12579k C37697b bVar) {
        Intrinsics.checkNotNullParameter(consentRepository2, "consentRepository");
        Intrinsics.checkNotNullParameter(eVar, "getUserInfoUseCase");
        Intrinsics.checkNotNullParameter(bVar, "getLoyaltyCardNumberUseCase");
        this.consentRepository = consentRepository2;
        this.getUserInfoUseCase = eVar;
        this.getLoyaltyCardNumberUseCase = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172920invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.domain.models.consent.ConsentOptIn>>> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.carrefour.fid.android.consent.domain.interactors.ConsentGetConsentsUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.carrefour.fid.android.consent.domain.interactors.ConsentGetConsentsUseCase$invoke$1 r0 = (com.carrefour.fid.android.consent.domain.interactors.ConsentGetConsentsUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.consent.domain.interactors.ConsentGetConsentsUseCase$invoke$1 r0 = new com.carrefour.fid.android.consent.domain.interactors.ConsentGetConsentsUseCase$invoke$1
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x005e
            if (r2 == r6) goto L_0x0050
            if (r2 == r4) goto L_0x0042
            if (r2 != r3) goto L_0x003a
            java.lang.Object r0 = r0.L$0
            kotlin.C11661u0.m45747n(r11)
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.mo21858l()
            goto L_0x00d2
        L_0x003a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0042:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.consent.domain.interactors.ConsentGetConsentsUseCase r2 = (com.carrefour.fid.android.consent.domain.interactors.ConsentGetConsentsUseCase) r2
            kotlin.C11661u0.m45747n(r11)
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.mo21858l()
            goto L_0x00a4
        L_0x0050:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.consent.domain.interactors.ConsentGetConsentsUseCase r2 = (com.carrefour.fid.android.consent.domain.interactors.ConsentGetConsentsUseCase) r2
            kotlin.C11661u0.m45747n(r11)
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.mo21858l()
            goto L_0x0074
        L_0x005e:
            kotlin.C11661u0.m45747n(r11)
            com.carrefour.fid.android.domain.interactors.loyalty.b r11 = r10.getLoyaltyCardNumberUseCase
            com.carrefour.fid.android.domain.interactors.loyalty.b$a r2 = new com.carrefour.fid.android.domain.interactors.loyalty.b$a
            r2.<init>(r6)
            r0.L$0 = r10
            r0.label = r6
            java.lang.Object r11 = r11.m172966invokegIAlus(r2, r0)
            if (r11 != r1) goto L_0x0073
            return r1
        L_0x0073:
            r2 = r10
        L_0x0074:
            boolean r8 = kotlin.Result.m38709i(r11)
            if (r8 == 0) goto L_0x007b
            r11 = r7
        L_0x007b:
            com.carrefour.fid.android.domain.models.loyalty.b r11 = (com.carrefour.fid.android.domain.models.loyalty.C38045b) r11
            if (r11 == 0) goto L_0x0084
            java.lang.String r11 = r11.mo117869h()
            goto L_0x0085
        L_0x0084:
            r11 = r7
        L_0x0085:
            if (r11 != 0) goto L_0x0088
            r11 = r7
        L_0x0088:
            if (r11 == 0) goto L_0x0093
            boolean r8 = kotlin.text.C11622t.isBlank(r11)
            if (r8 == 0) goto L_0x0091
            goto L_0x0093
        L_0x0091:
            r8 = r5
            goto L_0x0094
        L_0x0093:
            r8 = r6
        L_0x0094:
            if (r8 == 0) goto L_0x0097
            r11 = r7
        L_0x0097:
            com.carrefour.fid.android.consent.domain.repositories.ConsentRepository r8 = r2.consentRepository
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r11 = r8.m172927getConsentsgIAlus(r11, r0)
            if (r11 != r1) goto L_0x00a4
            return r1
        L_0x00a4:
            boolean r4 = kotlin.Result.m38709i(r11)
            if (r4 == 0) goto L_0x00c0
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Throwable r11 = kotlin.Result.m38705e(r11)
            if (r11 != 0) goto L_0x00b7
            java.lang.Exception r11 = new java.lang.Exception
            r11.<init>()
        L_0x00b7:
            java.lang.Object r11 = kotlin.C11661u0.m45734a(r11)
            java.lang.Object r11 = kotlin.Result.m38702b(r11)
            return r11
        L_0x00c0:
            com.carrefour.fid.android.domain.interactors.user.e r2 = r2.getUserInfoUseCase
            com.carrefour.fid.android.domain.interactors.user.e$a r4 = com.carrefour.fid.android.domain.interactors.user.C37878e.C37879a.f94997a
            r0.L$0 = r11
            r0.label = r3
            java.lang.Object r0 = r2.m172966invokegIAlus(r4, r0)
            if (r0 != r1) goto L_0x00cf
            return r1
        L_0x00cf:
            r9 = r0
            r0 = r11
            r11 = r9
        L_0x00d2:
            boolean r1 = kotlin.Result.m38709i(r11)
            if (r1 == 0) goto L_0x00d9
            r11 = r7
        L_0x00d9:
            com.carrefour.fid.android.domain.models.account.AccountInfo r11 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r11
            if (r11 == 0) goto L_0x00e2
            java.lang.String r1 = r11.mo116663r()
            goto L_0x00e3
        L_0x00e2:
            r1 = r7
        L_0x00e3:
            if (r11 == 0) goto L_0x00e9
            java.lang.String r7 = com.carrefour.fid.android.domain.models.account.extension.C37949a.m155959e(r11)
        L_0x00e9:
            boolean r11 = kotlin.Result.m38710j(r0)
            if (r11 == 0) goto L_0x0121
            kotlin.Result$a r11 = kotlin.Result.f28060a
            java.util.List r0 = (java.util.List) r0
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.List r11 = kotlin.collections.CollectionsKt___CollectionsKt.m40572T5(r0)
            if (r1 == 0) goto L_0x0104
            boolean r0 = kotlin.text.C11622t.isBlank(r1)
            if (r0 == 0) goto L_0x0102
            goto L_0x0104
        L_0x0102:
            r0 = r5
            goto L_0x0105
        L_0x0104:
            r0 = r6
        L_0x0105:
            if (r0 == 0) goto L_0x010c
            com.carrefour.fid.android.consent.domain.interactors.ConsentGetConsentsUseCase$invoke$2$1 r0 = com.carrefour.fid.android.consent.domain.interactors.ConsentGetConsentsUseCase$invoke$2$1.INSTANCE
            kotlin.collections.C10994x.m42348I0(r11, r0)
        L_0x010c:
            if (r7 == 0) goto L_0x0114
            boolean r0 = kotlin.text.C11622t.isBlank(r7)
            if (r0 == 0) goto L_0x0115
        L_0x0114:
            r5 = r6
        L_0x0115:
            if (r5 == 0) goto L_0x011c
            com.carrefour.fid.android.consent.domain.interactors.ConsentGetConsentsUseCase$invoke$2$2 r0 = com.carrefour.fid.android.consent.domain.interactors.ConsentGetConsentsUseCase$invoke$2$2.INSTANCE
            kotlin.collections.C10994x.m42348I0(r11, r0)
        L_0x011c:
            java.lang.Object r11 = kotlin.Result.m38702b(r11)
            goto L_0x0125
        L_0x0121:
            java.lang.Object r11 = kotlin.Result.m38702b(r0)
        L_0x0125:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.consent.domain.interactors.ConsentGetConsentsUseCase.m172920invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}

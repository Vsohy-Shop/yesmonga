package com.carrefour.fid.android.consent.domain.interactors;

import com.carrefour.fid.android.consent.domain.repositories.ConsentRepository;
import com.carrefour.fid.android.domain.interactors.account.C37518d;
import com.carrefour.fid.android.domain.interactors.consent.C37631c;
import com.carrefour.fid.android.domain.interactors.loyalty.C37697b;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002HBø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, mo22516d2 = {"Lcom/carrefour/fid/android/consent/domain/interactors/ConsentUpdateConsentsUseCase;", "Lcom/carrefour/fid/android/domain/interactors/consent/c;", "Lcom/carrefour/fid/android/domain/interactors/consent/c$a;", "param", "Lkotlin/Result;", "Lkotlin/d2;", "invoke-gIAlu-s", "(Lcom/carrefour/fid/android/domain/interactors/consent/c$a;Lkotlin/coroutines/c;)Ljava/lang/Object;", "invoke", "Lcom/carrefour/fid/android/consent/domain/repositories/ConsentRepository;", "consentRepository", "Lcom/carrefour/fid/android/consent/domain/repositories/ConsentRepository;", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "getUserInfoUseCase", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "Lcom/carrefour/fid/android/domain/interactors/account/d;", "getUserUidIamUseCase", "Lcom/carrefour/fid/android/domain/interactors/account/d;", "Lcom/carrefour/fid/android/domain/interactors/loyalty/b;", "getLoyaltyCardNumberUseCase", "Lcom/carrefour/fid/android/domain/interactors/loyalty/b;", "<init>", "(Lcom/carrefour/fid/android/consent/domain/repositories/ConsentRepository;Lcom/carrefour/fid/android/domain/interactors/user/e;Lcom/carrefour/fid/android/domain/interactors/account/d;Lcom/carrefour/fid/android/domain/interactors/loyalty/b;)V", "consent_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nConsentUpdateConsentsUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConsentUpdateConsentsUseCase.kt\ncom/carrefour/fid/android/consent/domain/interactors/ConsentUpdateConsentsUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,48:1\n1747#2,3:49\n*S KotlinDebug\n*F\n+ 1 ConsentUpdateConsentsUseCase.kt\ncom/carrefour/fid/android/consent/domain/interactors/ConsentUpdateConsentsUseCase\n*L\n21#1:49,3\n*E\n"})
public final class ConsentUpdateConsentsUseCase implements C37631c {
    @C12579k
    private final ConsentRepository consentRepository;
    @C12579k
    private final C37697b getLoyaltyCardNumberUseCase;
    @C12579k
    private final C37878e getUserInfoUseCase;
    @C12579k
    private final C37518d getUserUidIamUseCase;

    @Inject
    public ConsentUpdateConsentsUseCase(@C12579k ConsentRepository consentRepository2, @C12579k C37878e eVar, @C12579k C37518d dVar, @C12579k C37697b bVar) {
        Intrinsics.checkNotNullParameter(consentRepository2, "consentRepository");
        Intrinsics.checkNotNullParameter(eVar, "getUserInfoUseCase");
        Intrinsics.checkNotNullParameter(dVar, "getUserUidIamUseCase");
        Intrinsics.checkNotNullParameter(bVar, "getLoyaltyCardNumberUseCase");
        this.consentRepository = consentRepository2;
        this.getUserInfoUseCase = eVar;
        this.getUserUidIamUseCase = dVar;
        this.getLoyaltyCardNumberUseCase = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d6, code lost:
        if (r4 == false) goto L_0x00db;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0136 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172923invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.consent.C37631c.C37632a r10, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.carrefour.fid.android.consent.domain.interactors.ConsentUpdateConsentsUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.carrefour.fid.android.consent.domain.interactors.ConsentUpdateConsentsUseCase$invoke$1 r0 = (com.carrefour.fid.android.consent.domain.interactors.ConsentUpdateConsentsUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.consent.domain.interactors.ConsentUpdateConsentsUseCase$invoke$1 r0 = new com.carrefour.fid.android.consent.domain.interactors.ConsentUpdateConsentsUseCase$invoke$1
            r0.<init>(r9, r11)
        L_0x0018:
            r7 = r0
            java.lang.Object r11 = r7.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r7.label
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L_0x006b
            if (r1 == r5) goto L_0x0059
            if (r1 == r3) goto L_0x0041
            if (r1 != r2) goto L_0x0039
            kotlin.C11661u0.m45747n(r11)
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r10 = r11.mo21858l()
            goto L_0x0137
        L_0x0039:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0041:
            java.lang.Object r10 = r7.L$2
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r1 = r7.L$1
            com.carrefour.fid.android.domain.interactors.consent.c$a r1 = (com.carrefour.fid.android.domain.interactors.consent.C37631c.C37632a) r1
            java.lang.Object r3 = r7.L$0
            com.carrefour.fid.android.consent.domain.interactors.ConsentUpdateConsentsUseCase r3 = (com.carrefour.fid.android.consent.domain.interactors.ConsentUpdateConsentsUseCase) r3
            kotlin.C11661u0.m45747n(r11)
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.mo21858l()
            r5 = r10
            goto L_0x00ff
        L_0x0059:
            java.lang.Object r10 = r7.L$1
            com.carrefour.fid.android.domain.interactors.consent.c$a r10 = (com.carrefour.fid.android.domain.interactors.consent.C37631c.C37632a) r10
            java.lang.Object r1 = r7.L$0
            com.carrefour.fid.android.consent.domain.interactors.ConsentUpdateConsentsUseCase r1 = (com.carrefour.fid.android.consent.domain.interactors.ConsentUpdateConsentsUseCase) r1
            kotlin.C11661u0.m45747n(r11)
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.mo21858l()
            goto L_0x00b9
        L_0x006b:
            kotlin.C11661u0.m45747n(r11)
            java.util.List r11 = r10.mo114529d()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            boolean r1 = r11 instanceof java.util.Collection
            if (r1 == 0) goto L_0x0083
            r1 = r11
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0083
        L_0x0081:
            r11 = r4
            goto L_0x00a2
        L_0x0083:
            java.util.Iterator r11 = r11.iterator()
        L_0x0087:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0081
            java.lang.Object r1 = r11.next()
            com.carrefour.fid.android.domain.models.consent.ConsentOptIn r1 = (com.carrefour.fid.android.domain.models.consent.ConsentOptIn) r1
            java.util.List r8 = com.carrefour.fid.android.domain.models.consent.extension.C37997a.m156420f()
            com.carrefour.fid.android.domain.models.consent.ConsentName r1 = r1.mo117326h()
            boolean r1 = r8.contains(r1)
            if (r1 == 0) goto L_0x0087
            r11 = r5
        L_0x00a2:
            if (r11 == 0) goto L_0x00d9
            com.carrefour.fid.android.domain.interactors.loyalty.b r11 = r9.getLoyaltyCardNumberUseCase
            com.carrefour.fid.android.domain.interactors.loyalty.b$a r1 = new com.carrefour.fid.android.domain.interactors.loyalty.b$a
            r1.<init>(r4, r5, r6)
            r7.L$0 = r9
            r7.L$1 = r10
            r7.label = r5
            java.lang.Object r11 = r11.m172966invokegIAlus(r1, r7)
            if (r11 != r0) goto L_0x00b8
            return r0
        L_0x00b8:
            r1 = r9
        L_0x00b9:
            boolean r8 = kotlin.Result.m38709i(r11)
            if (r8 == 0) goto L_0x00c0
            r11 = r6
        L_0x00c0:
            com.carrefour.fid.android.domain.models.loyalty.b r11 = (com.carrefour.fid.android.domain.models.loyalty.C38045b) r11
            if (r11 == 0) goto L_0x00c9
            java.lang.String r11 = r11.mo117869h()
            goto L_0x00ca
        L_0x00c9:
            r11 = r6
        L_0x00ca:
            if (r11 != 0) goto L_0x00cd
            r11 = r6
        L_0x00cd:
            if (r11 == 0) goto L_0x00d5
            boolean r8 = kotlin.text.C11622t.isBlank(r11)
            if (r8 == 0) goto L_0x00d6
        L_0x00d5:
            r4 = r5
        L_0x00d6:
            if (r4 == 0) goto L_0x00db
            goto L_0x00da
        L_0x00d9:
            r1 = r9
        L_0x00da:
            r11 = r6
        L_0x00db:
            java.util.List r4 = r10.mo114529d()
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            r4 = r4 ^ r5
            if (r4 == 0) goto L_0x0138
            com.carrefour.fid.android.domain.interactors.user.e r4 = r1.getUserInfoUseCase
            com.carrefour.fid.android.domain.interactors.user.e$a r5 = com.carrefour.fid.android.domain.interactors.user.C37878e.C37879a.f94997a
            r7.L$0 = r1
            r7.L$1 = r10
            r7.L$2 = r11
            r7.label = r3
            java.lang.Object r3 = r4.m172966invokegIAlus(r5, r7)
            if (r3 != r0) goto L_0x00fb
            return r0
        L_0x00fb:
            r5 = r11
            r11 = r3
            r3 = r1
            r1 = r10
        L_0x00ff:
            boolean r10 = kotlin.Result.m38709i(r11)
            if (r10 == 0) goto L_0x0106
            r11 = r6
        L_0x0106:
            com.carrefour.fid.android.domain.models.account.AccountInfo r11 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r11
            com.carrefour.fid.android.domain.interactors.account.d r10 = r3.getUserUidIamUseCase
            java.lang.String r4 = r10.invoke()
            com.carrefour.fid.android.consent.domain.repositories.ConsentRepository r10 = r3.consentRepository
            if (r11 == 0) goto L_0x0117
            java.lang.String r3 = r11.mo116663r()
            goto L_0x0118
        L_0x0117:
            r3 = r6
        L_0x0118:
            if (r11 == 0) goto L_0x011f
            java.lang.String r11 = com.carrefour.fid.android.domain.models.account.extension.C37949a.m155959e(r11)
            goto L_0x0120
        L_0x011f:
            r11 = r6
        L_0x0120:
            java.util.List r8 = r1.mo114529d()
            r7.L$0 = r6
            r7.L$1 = r6
            r7.L$2 = r6
            r7.label = r2
            r1 = r10
            r2 = r3
            r3 = r11
            r6 = r8
            java.lang.Object r10 = r1.m172928updateConsentshUnOzRk(r2, r3, r4, r5, r6, r7)
            if (r10 != r0) goto L_0x0137
            return r0
        L_0x0137:
            return r10
        L_0x0138:
            kotlin.Result$a r10 = kotlin.Result.f28060a
            kotlin.d2 r10 = kotlin.C11079d2.f28267a
            java.lang.Object r10 = kotlin.Result.m38702b(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.consent.domain.interactors.ConsentUpdateConsentsUseCase.m172923invokegIAlus(com.carrefour.fid.android.domain.interactors.consent.c$a, kotlin.coroutines.c):java.lang.Object");
    }
}

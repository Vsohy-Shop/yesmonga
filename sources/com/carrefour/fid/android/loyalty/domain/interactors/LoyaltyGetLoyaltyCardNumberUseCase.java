package com.carrefour.fid.android.loyalty.domain.interactors;

import com.carrefour.fid.android.domain.interactors.loyalty.C37697b;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002HBø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, mo22516d2 = {"Lcom/carrefour/fid/android/loyalty/domain/interactors/LoyaltyGetLoyaltyCardNumberUseCase;", "Lcom/carrefour/fid/android/domain/interactors/loyalty/b;", "Lcom/carrefour/fid/android/domain/interactors/loyalty/b$a;", "params", "Lkotlin/Result;", "Lcom/carrefour/fid/android/domain/models/loyalty/b;", "invoke-gIAlu-s", "(Lcom/carrefour/fid/android/domain/interactors/loyalty/b$a;Lkotlin/coroutines/c;)Ljava/lang/Object;", "invoke", "Lcom/carrefour/fid/android/loyalty/domain/interactors/GetLoyaltyCardNumberFromPreferencesUseCase;", "getLoyaltyCardNumberFromPreferencesUseCase", "Lcom/carrefour/fid/android/loyalty/domain/interactors/GetLoyaltyCardNumberFromPreferencesUseCase;", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "getUserInfoUseCase", "Lcom/carrefour/fid/android/domain/interactors/user/e;", "<init>", "(Lcom/carrefour/fid/android/loyalty/domain/interactors/GetLoyaltyCardNumberFromPreferencesUseCase;Lcom/carrefour/fid/android/domain/interactors/user/e;)V", "loyalty_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nLoyaltyGetLoyaltyCardNumberUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoyaltyGetLoyaltyCardNumberUseCase.kt\ncom/carrefour/fid/android/loyalty/domain/interactors/LoyaltyGetLoyaltyCardNumberUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,28:1\n766#2:29\n857#2,2:30\n*S KotlinDebug\n*F\n+ 1 LoyaltyGetLoyaltyCardNumberUseCase.kt\ncom/carrefour/fid/android/loyalty/domain/interactors/LoyaltyGetLoyaltyCardNumberUseCase\n*L\n20#1:29\n20#1:30,2\n*E\n"})
public final class LoyaltyGetLoyaltyCardNumberUseCase implements C37697b {
    @C12579k
    private final GetLoyaltyCardNumberFromPreferencesUseCase getLoyaltyCardNumberFromPreferencesUseCase;
    @C12579k
    private final C37878e getUserInfoUseCase;

    @Inject
    public LoyaltyGetLoyaltyCardNumberUseCase(@C12579k GetLoyaltyCardNumberFromPreferencesUseCase getLoyaltyCardNumberFromPreferencesUseCase2, @C12579k C37878e eVar) {
        Intrinsics.checkNotNullParameter(getLoyaltyCardNumberFromPreferencesUseCase2, "getLoyaltyCardNumberFromPreferencesUseCase");
        Intrinsics.checkNotNullParameter(eVar, "getUserInfoUseCase");
        this.getLoyaltyCardNumberFromPreferencesUseCase = getLoyaltyCardNumberFromPreferencesUseCase2;
        this.getUserInfoUseCase = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ad A[SYNTHETIC, Splitter:B:33:0x00ad] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00df A[Catch:{ all -> 0x00ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173060invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.loyalty.C37697b.C37698a r10, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.loyalty.C38045b>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyGetLoyaltyCardNumberUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyGetLoyaltyCardNumberUseCase$invoke$1 r0 = (com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyGetLoyaltyCardNumberUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyGetLoyaltyCardNumberUseCase$invoke$1 r0 = new com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyGetLoyaltyCardNumberUseCase$invoke$1
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0056
            if (r2 == r5) goto L_0x0044
            if (r2 != r4) goto L_0x003c
            java.lang.Object r10 = r0.L$1
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.domain.interactors.loyalty.b$a r0 = (com.carrefour.fid.android.domain.interactors.loyalty.C37697b.C37698a) r0
            kotlin.C11661u0.m45747n(r11)
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.mo21858l()
            goto L_0x00a7
        L_0x003c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0044:
            java.lang.Object r10 = r0.L$1
            com.carrefour.fid.android.domain.interactors.loyalty.b$a r10 = (com.carrefour.fid.android.domain.interactors.loyalty.C37697b.C37698a) r10
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyGetLoyaltyCardNumberUseCase r2 = (com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyGetLoyaltyCardNumberUseCase) r2
            kotlin.C11661u0.m45747n(r11)
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.mo21858l()
            goto L_0x0069
        L_0x0056:
            kotlin.C11661u0.m45747n(r11)
            com.carrefour.fid.android.loyalty.domain.interactors.GetLoyaltyCardNumberFromPreferencesUseCase r11 = r9.getLoyaltyCardNumberFromPreferencesUseCase
            r0.L$0 = r9
            r0.L$1 = r10
            r0.label = r5
            java.lang.Object r11 = r11.m173042invokeIoAF18A(r0)
            if (r11 != r1) goto L_0x0068
            return r1
        L_0x0068:
            r2 = r9
        L_0x0069:
            java.lang.String r6 = new java.lang.String
            r6.<init>()
            boolean r7 = kotlin.Result.m38709i(r11)
            if (r7 == 0) goto L_0x0075
            r11 = r6
        L_0x0075:
            java.lang.String r11 = (java.lang.String) r11
            int r6 = r11.length()
            if (r6 <= 0) goto L_0x007f
            r6 = r5
            goto L_0x0080
        L_0x007f:
            r6 = r3
        L_0x0080:
            if (r6 == 0) goto L_0x0092
            kotlin.Result$a r10 = kotlin.Result.f28060a
            java.lang.String r10 = com.carrefour.fid.android.domain.models.loyalty.C38045b.m156905b(r11)
            com.carrefour.fid.android.domain.models.loyalty.b r10 = com.carrefour.fid.android.domain.models.loyalty.C38045b.m156904a(r10)
            java.lang.Object r10 = kotlin.Result.m38702b(r10)
            goto L_0x0119
        L_0x0092:
            com.carrefour.fid.android.domain.interactors.user.e r2 = r2.getUserInfoUseCase
            com.carrefour.fid.android.domain.interactors.user.e$a r6 = com.carrefour.fid.android.domain.interactors.user.C37878e.C37879a.f94997a
            r0.L$0 = r10
            r0.L$1 = r11
            r0.label = r4
            java.lang.Object r0 = r2.m172966invokegIAlus(r6, r0)
            if (r0 != r1) goto L_0x00a3
            return r1
        L_0x00a3:
            r8 = r0
            r0 = r10
            r10 = r11
            r11 = r8
        L_0x00a7:
            boolean r1 = kotlin.Result.m38710j(r11)
            if (r1 == 0) goto L_0x00f3
            kotlin.Result$a r1 = kotlin.Result.f28060a     // Catch:{ all -> 0x00ec }
            com.carrefour.fid.android.domain.models.account.AccountInfo r11 = (com.carrefour.fid.android.domain.models.account.AccountInfo) r11     // Catch:{ all -> 0x00ec }
            java.util.List r11 = r11.mo116669w()     // Catch:{ all -> 0x00ec }
            java.lang.Iterable r11 = (java.lang.Iterable) r11     // Catch:{ all -> 0x00ec }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00ec }
            r1.<init>()     // Catch:{ all -> 0x00ec }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ all -> 0x00ec }
        L_0x00c0:
            boolean r2 = r11.hasNext()     // Catch:{ all -> 0x00ec }
            if (r2 == 0) goto L_0x00e3
            java.lang.Object r2 = r11.next()     // Catch:{ all -> 0x00ec }
            r4 = r2
            com.carrefour.fid.android.domain.models.account.UserCards r4 = (com.carrefour.fid.android.domain.models.account.UserCards) r4     // Catch:{ all -> 0x00ec }
            boolean r6 = r0.mo114735d()     // Catch:{ all -> 0x00ec }
            if (r6 == 0) goto L_0x00dc
            boolean r4 = r4.mo116764l()     // Catch:{ all -> 0x00ec }
            if (r4 == 0) goto L_0x00da
            goto L_0x00dc
        L_0x00da:
            r4 = r3
            goto L_0x00dd
        L_0x00dc:
            r4 = r5
        L_0x00dd:
            if (r4 == 0) goto L_0x00c0
            r1.add(r2)     // Catch:{ all -> 0x00ec }
            goto L_0x00c0
        L_0x00e3:
            com.carrefour.fid.android.domain.models.account.UserCards r11 = com.carrefour.fid.android.domain.models.account.extension.C37949a.m155957c(r1)     // Catch:{ all -> 0x00ec }
            java.lang.Object r11 = kotlin.Result.m38702b(r11)     // Catch:{ all -> 0x00ec }
            goto L_0x00f7
        L_0x00ec:
            r11 = move-exception
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r11 = kotlin.C11661u0.m45734a(r11)
        L_0x00f3:
            java.lang.Object r11 = kotlin.Result.m38702b(r11)
        L_0x00f7:
            boolean r0 = kotlin.Result.m38709i(r11)
            r1 = 0
            if (r0 == 0) goto L_0x00ff
            r11 = r1
        L_0x00ff:
            com.carrefour.fid.android.domain.models.account.UserCards r11 = (com.carrefour.fid.android.domain.models.account.UserCards) r11
            if (r11 == 0) goto L_0x0107
            java.lang.String r1 = r11.mo116763k()
        L_0x0107:
            kotlin.Result$a r11 = kotlin.Result.f28060a
            if (r1 != 0) goto L_0x010c
            goto L_0x010d
        L_0x010c:
            r10 = r1
        L_0x010d:
            java.lang.String r10 = com.carrefour.fid.android.domain.models.loyalty.C38045b.m156905b(r10)
            com.carrefour.fid.android.domain.models.loyalty.b r10 = com.carrefour.fid.android.domain.models.loyalty.C38045b.m156904a(r10)
            java.lang.Object r10 = kotlin.Result.m38702b(r10)
        L_0x0119:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.loyalty.domain.interactors.LoyaltyGetLoyaltyCardNumberUseCase.m173060invokegIAlus(com.carrefour.fid.android.domain.interactors.loyalty.b$a, kotlin.coroutines.c):java.lang.Object");
    }
}

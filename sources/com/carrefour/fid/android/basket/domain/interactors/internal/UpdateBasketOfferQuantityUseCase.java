package com.carrefour.fid.android.basket.domain.interactors.internal;

import com.carrefour.fid.android.basket.domain.repositories.BasketRepository;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.interactors.basket.C37578j0;
import com.carrefour.fid.android.domain.interactors.basket.C37588n0;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.models.basket.Basket;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nUpdateBasketOfferQuantityUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdateBasketOfferQuantityUseCase.kt\ncom/carrefour/fid/android/basket/domain/interactors/internal/UpdateBasketOfferQuantityUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n1#2:66\n*E\n"})
public final class UpdateBasketOfferQuantityUseCase implements C37679f<C37588n0.C37589a, Basket> {
    @C12579k

    /* renamed from: a */
    public final C37823k f33975a;
    @C12579k

    /* renamed from: b */
    public final HandleBasketExceptionUseCase f33976b;
    @C12579k

    /* renamed from: c */
    public final InitializeBasketUseCase f33977c;
    @C12579k

    /* renamed from: d */
    public final BasketRepository f33978d;
    @C12579k

    /* renamed from: e */
    public final C37578j0 f33979e;

    @Inject
    public UpdateBasketOfferQuantityUseCase(@C12579k C37823k kVar, @C12579k HandleBasketExceptionUseCase handleBasketExceptionUseCase, @C12579k InitializeBasketUseCase initializeBasketUseCase, @C12579k BasketRepository basketRepository, @C12579k C37578j0 j0Var) {
        Intrinsics.checkNotNullParameter(kVar, "getServiceSelectionUseCase");
        Intrinsics.checkNotNullParameter(handleBasketExceptionUseCase, "handleBasketExceptionUseCase");
        Intrinsics.checkNotNullParameter(initializeBasketUseCase, "initializeBasketUseCase");
        Intrinsics.checkNotNullParameter(basketRepository, "repository");
        Intrinsics.checkNotNullParameter(j0Var, "switchFacilityServiceInBasketUseCase");
        this.f33975a = kVar;
        this.f33976b = handleBasketExceptionUseCase;
        this.f33977c = initializeBasketUseCase;
        this.f33978d = basketRepository;
        this.f33979e = j0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00d4, code lost:
        if (kotlin.Result.m38709i(r10) == false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d6, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d7, code lost:
        r10 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d9, code lost:
        if (r10 == null) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00db, code lost:
        r10 = r10.mo119354f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00df, code lost:
        if (r10 == null) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e1, code lost:
        r10 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r10.mo119163G());
        r0.L$0 = r5;
        r0.L$1 = r9;
        r0.L$2 = r10;
        r0.label = 2;
        r2 = r5.mo33322c(r10, r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f6, code lost:
        if (r2 != r1) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f8, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f9, code lost:
        r7 = r2;
        r2 = r9;
        r9 = r10;
        r10 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00fd, code lost:
        r6 = kotlin.Result.m38705e(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0101, code lost:
        if (r6 == null) goto L_0x01d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0109, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) com.carrefour.fid.android.domain.exceptions.BasketNotFoundThrowable.f94236a) == false) goto L_0x010c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x010c, code lost:
        r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) com.carrefour.fid.android.domain.exceptions.ExpiredBasketThrowable.f94240a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0112, code lost:
        if (r3 == false) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0114, code lost:
        r10 = r5.f33977c;
        r0.L$0 = r5;
        r0.L$1 = r2;
        r0.L$2 = r9;
        r0.label = 3;
        r10 = r10.m172786invokeIoAF18A(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0123, code lost:
        if (r10 != r1) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0125, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0126, code lost:
        r3 = r2;
        r2 = r10;
        r10 = r9;
        r9 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x012e, code lost:
        if (kotlin.Result.m38710j(r2) == false) goto L_0x0159;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r5 = kotlin.Result.f28060a;
        r2 = (com.carrefour.fid.android.domain.models.basket.Basket) r2;
        r0.L$0 = r9;
        r0.L$1 = null;
        r0.L$2 = null;
        r0.label = 4;
        r10 = r9.mo33322c(r10, r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0141, code lost:
        if (r10 != r1) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0143, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0144, code lost:
        kotlin.C11661u0.m45747n(r10);
        r10 = kotlin.Result.m38702b((com.carrefour.fid.android.domain.models.basket.Basket) r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0159, code lost:
        r10 = kotlin.Result.m38702b(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0169, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) com.carrefour.fid.android.domain.exceptions.WrongFacilityServiceThrowable.f94244a) == false) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x016b, code lost:
        r10 = r5.f33979e;
        r3 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157957a(r9);
        r0.L$0 = r5;
        r0.L$1 = r2;
        r0.L$2 = r9;
        r0.label = 5;
        r10 = r10.m172966invokegIAlus(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x017e, code lost:
        if (r10 != r1) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0180, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0181, code lost:
        r3 = r2;
        r2 = r10;
        r10 = r9;
        r9 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0189, code lost:
        if (kotlin.Result.m38710j(r2) == false) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r5 = kotlin.Result.f28060a;
        r2 = (com.carrefour.fid.android.domain.models.basket.Basket) r2;
        r0.L$0 = r9;
        r0.L$1 = null;
        r0.L$2 = null;
        r0.label = 6;
        r10 = r9.mo33322c(r10, r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x019c, code lost:
        if (r10 != r1) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x019e, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x019f, code lost:
        kotlin.C11661u0.m45747n(r10);
        r10 = kotlin.Result.m38702b((com.carrefour.fid.android.domain.models.basket.Basket) r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01b4, code lost:
        r10 = kotlin.Result.m38702b(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01be, code lost:
        r9 = new com.carrefour.fid.android.shared.type.C28879a.C28880a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01d6, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01d7, code lost:
        r9 = kotlin.Result.f28060a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01e3, code lost:
        return kotlin.Result.m38702b(kotlin.C11661u0.m45734a(com.carrefour.fid.android.domain.exceptions.RequireServiceSelectionThrowable.f94243a));
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01d4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172789invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.basket.C37588n0.C37589a r9, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.basket.Basket>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.carrefour.fid.android.basket.domain.interactors.internal.UpdateBasketOfferQuantityUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.carrefour.fid.android.basket.domain.interactors.internal.UpdateBasketOfferQuantityUseCase$invoke$1 r0 = (com.carrefour.fid.android.basket.domain.interactors.internal.UpdateBasketOfferQuantityUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.interactors.internal.UpdateBasketOfferQuantityUseCase$invoke$1 r0 = new com.carrefour.fid.android.basket.domain.interactors.internal.UpdateBasketOfferQuantityUseCase$invoke$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            switch(r2) {
                case 0: goto L_0x00bd;
                case 1: goto L_0x00aa;
                case 2: goto L_0x0094;
                case 3: goto L_0x0078;
                case 4: goto L_0x0066;
                case 5: goto L_0x004a;
                case 6: goto L_0x0038;
                case 7: goto L_0x002d;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x002d:
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r9 = r10.mo21858l()
            goto L_0x01d5
        L_0x0038:
            java.lang.Object r9 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.internal.UpdateBasketOfferQuantityUseCase r9 = (com.carrefour.fid.android.basket.domain.interactors.internal.UpdateBasketOfferQuantityUseCase) r9
            kotlin.C11661u0.m45747n(r10)     // Catch:{ all -> 0x0047 }
            kotlin.Result r10 = (kotlin.Result) r10     // Catch:{ all -> 0x0047 }
            java.lang.Object r10 = r10.mo21858l()     // Catch:{ all -> 0x0047 }
            goto L_0x019f
        L_0x0047:
            r10 = move-exception
            goto L_0x01a9
        L_0x004a:
            java.lang.Object r9 = r0.L$2
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r2 = r0.L$1
            com.carrefour.fid.android.domain.interactors.basket.n0$a r2 = (com.carrefour.fid.android.domain.interactors.basket.C37588n0.C37589a) r2
            java.lang.Object r3 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.internal.UpdateBasketOfferQuantityUseCase r3 = (com.carrefour.fid.android.basket.domain.interactors.internal.UpdateBasketOfferQuantityUseCase) r3
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.mo21858l()
            r7 = r10
            r10 = r9
            r9 = r3
            r3 = r2
            r2 = r7
            goto L_0x0185
        L_0x0066:
            java.lang.Object r9 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.internal.UpdateBasketOfferQuantityUseCase r9 = (com.carrefour.fid.android.basket.domain.interactors.internal.UpdateBasketOfferQuantityUseCase) r9
            kotlin.C11661u0.m45747n(r10)     // Catch:{ all -> 0x0075 }
            kotlin.Result r10 = (kotlin.Result) r10     // Catch:{ all -> 0x0075 }
            java.lang.Object r10 = r10.mo21858l()     // Catch:{ all -> 0x0075 }
            goto L_0x0144
        L_0x0075:
            r10 = move-exception
            goto L_0x014e
        L_0x0078:
            java.lang.Object r9 = r0.L$2
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r2 = r0.L$1
            com.carrefour.fid.android.domain.interactors.basket.n0$a r2 = (com.carrefour.fid.android.domain.interactors.basket.C37588n0.C37589a) r2
            java.lang.Object r3 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.internal.UpdateBasketOfferQuantityUseCase r3 = (com.carrefour.fid.android.basket.domain.interactors.internal.UpdateBasketOfferQuantityUseCase) r3
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.mo21858l()
            r7 = r10
            r10 = r9
            r9 = r3
            r3 = r2
            r2 = r7
            goto L_0x012a
        L_0x0094:
            java.lang.Object r9 = r0.L$2
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r2 = r0.L$1
            com.carrefour.fid.android.domain.interactors.basket.n0$a r2 = (com.carrefour.fid.android.domain.interactors.basket.C37588n0.C37589a) r2
            java.lang.Object r5 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.internal.UpdateBasketOfferQuantityUseCase r5 = (com.carrefour.fid.android.basket.domain.interactors.internal.UpdateBasketOfferQuantityUseCase) r5
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.mo21858l()
            goto L_0x00fd
        L_0x00aa:
            java.lang.Object r9 = r0.L$1
            com.carrefour.fid.android.domain.interactors.basket.n0$a r9 = (com.carrefour.fid.android.domain.interactors.basket.C37588n0.C37589a) r9
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.basket.domain.interactors.internal.UpdateBasketOfferQuantityUseCase r2 = (com.carrefour.fid.android.basket.domain.interactors.internal.UpdateBasketOfferQuantityUseCase) r2
            kotlin.C11661u0.m45747n(r10)
            kotlin.Result r10 = (kotlin.Result) r10
            java.lang.Object r10 = r10.mo21858l()
            r5 = r2
            goto L_0x00d0
        L_0x00bd:
            kotlin.C11661u0.m45747n(r10)
            com.carrefour.fid.android.domain.interactors.service.k r10 = r8.f33975a
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r3
            java.lang.Object r10 = r10.m172965invokeIoAF18A(r0)
            if (r10 != r1) goto L_0x00cf
            return r1
        L_0x00cf:
            r5 = r8
        L_0x00d0:
            boolean r2 = kotlin.Result.m38709i(r10)
            if (r2 == 0) goto L_0x00d7
            r10 = r4
        L_0x00d7:
            com.carrefour.fid.android.domain.models.service.models.k r10 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r10
            if (r10 == 0) goto L_0x01d7
            com.carrefour.fid.android.domain.models.service.models.StoreService r10 = r10.mo119354f()
            if (r10 == 0) goto L_0x01d7
            java.lang.String r10 = r10.mo119163G()
            java.lang.String r10 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157958b(r10)
            r0.L$0 = r5
            r0.L$1 = r9
            r0.L$2 = r10
            r2 = 2
            r0.label = r2
            java.lang.Object r2 = r5.mo33322c(r10, r9, r0)
            if (r2 != r1) goto L_0x00f9
            return r1
        L_0x00f9:
            r7 = r2
            r2 = r9
            r9 = r10
            r10 = r7
        L_0x00fd:
            java.lang.Throwable r6 = kotlin.Result.m38705e(r10)
            if (r6 == 0) goto L_0x01d6
            com.carrefour.fid.android.domain.exceptions.BasketNotFoundThrowable r10 = com.carrefour.fid.android.domain.exceptions.BasketNotFoundThrowable.f94236a
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x010c
            goto L_0x0112
        L_0x010c:
            com.carrefour.fid.android.domain.exceptions.ExpiredBasketThrowable r10 = com.carrefour.fid.android.domain.exceptions.ExpiredBasketThrowable.f94240a
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r10)
        L_0x0112:
            if (r3 == 0) goto L_0x0163
            com.carrefour.fid.android.basket.domain.interactors.internal.InitializeBasketUseCase r10 = r5.f33977c
            r0.L$0 = r5
            r0.L$1 = r2
            r0.L$2 = r9
            r3 = 3
            r0.label = r3
            java.lang.Object r10 = r10.m172786invokeIoAF18A(r0)
            if (r10 != r1) goto L_0x0126
            return r1
        L_0x0126:
            r3 = r2
            r2 = r10
            r10 = r9
            r9 = r5
        L_0x012a:
            boolean r5 = kotlin.Result.m38710j(r2)
            if (r5 == 0) goto L_0x0159
            kotlin.Result$a r5 = kotlin.Result.f28060a     // Catch:{ all -> 0x0075 }
            com.carrefour.fid.android.domain.models.basket.Basket r2 = (com.carrefour.fid.android.domain.models.basket.Basket) r2     // Catch:{ all -> 0x0075 }
            r0.L$0 = r9     // Catch:{ all -> 0x0075 }
            r0.L$1 = r4     // Catch:{ all -> 0x0075 }
            r0.L$2 = r4     // Catch:{ all -> 0x0075 }
            r2 = 4
            r0.label = r2     // Catch:{ all -> 0x0075 }
            java.lang.Object r10 = r9.mo33322c(r10, r3, r0)     // Catch:{ all -> 0x0075 }
            if (r10 != r1) goto L_0x0144
            return r1
        L_0x0144:
            kotlin.C11661u0.m45747n(r10)     // Catch:{ all -> 0x0075 }
            com.carrefour.fid.android.domain.models.basket.Basket r10 = (com.carrefour.fid.android.domain.models.basket.Basket) r10     // Catch:{ all -> 0x0075 }
            java.lang.Object r10 = kotlin.Result.m38702b(r10)     // Catch:{ all -> 0x0075 }
            goto L_0x015d
        L_0x014e:
            kotlin.Result$a r2 = kotlin.Result.f28060a
            java.lang.Object r10 = kotlin.C11661u0.m45734a(r10)
            java.lang.Object r10 = kotlin.Result.m38702b(r10)
            goto L_0x015d
        L_0x0159:
            java.lang.Object r10 = kotlin.Result.m38702b(r2)
        L_0x015d:
            r5 = r9
            com.carrefour.fid.android.shared.type.a r9 = com.carrefour.fid.android.shared.type.C28882b.m119445a(r10)
            goto L_0x01c3
        L_0x0163:
            com.carrefour.fid.android.domain.exceptions.WrongFacilityServiceThrowable r10 = com.carrefour.fid.android.domain.exceptions.WrongFacilityServiceThrowable.f94244a
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x01be
            com.carrefour.fid.android.domain.interactors.basket.j0 r10 = r5.f33979e
            com.carrefour.fid.android.domain.models.service.models.FacilityServiceId r3 = com.carrefour.fid.android.domain.models.service.models.FacilityServiceId.m157957a(r9)
            r0.L$0 = r5
            r0.L$1 = r2
            r0.L$2 = r9
            r6 = 5
            r0.label = r6
            java.lang.Object r10 = r10.m172966invokegIAlus(r3, r0)
            if (r10 != r1) goto L_0x0181
            return r1
        L_0x0181:
            r3 = r2
            r2 = r10
            r10 = r9
            r9 = r5
        L_0x0185:
            boolean r5 = kotlin.Result.m38710j(r2)
            if (r5 == 0) goto L_0x01b4
            kotlin.Result$a r5 = kotlin.Result.f28060a     // Catch:{ all -> 0x0047 }
            com.carrefour.fid.android.domain.models.basket.Basket r2 = (com.carrefour.fid.android.domain.models.basket.Basket) r2     // Catch:{ all -> 0x0047 }
            r0.L$0 = r9     // Catch:{ all -> 0x0047 }
            r0.L$1 = r4     // Catch:{ all -> 0x0047 }
            r0.L$2 = r4     // Catch:{ all -> 0x0047 }
            r2 = 6
            r0.label = r2     // Catch:{ all -> 0x0047 }
            java.lang.Object r10 = r9.mo33322c(r10, r3, r0)     // Catch:{ all -> 0x0047 }
            if (r10 != r1) goto L_0x019f
            return r1
        L_0x019f:
            kotlin.C11661u0.m45747n(r10)     // Catch:{ all -> 0x0047 }
            com.carrefour.fid.android.domain.models.basket.Basket r10 = (com.carrefour.fid.android.domain.models.basket.Basket) r10     // Catch:{ all -> 0x0047 }
            java.lang.Object r10 = kotlin.Result.m38702b(r10)     // Catch:{ all -> 0x0047 }
            goto L_0x01b8
        L_0x01a9:
            kotlin.Result$a r2 = kotlin.Result.f28060a
            java.lang.Object r10 = kotlin.C11661u0.m45734a(r10)
            java.lang.Object r10 = kotlin.Result.m38702b(r10)
            goto L_0x01b8
        L_0x01b4:
            java.lang.Object r10 = kotlin.Result.m38702b(r2)
        L_0x01b8:
            r5 = r9
            com.carrefour.fid.android.shared.type.a r9 = com.carrefour.fid.android.shared.type.C28882b.m119445a(r10)
            goto L_0x01c3
        L_0x01be:
            com.carrefour.fid.android.shared.type.a$a r9 = new com.carrefour.fid.android.shared.type.a$a
            r9.<init>(r6)
        L_0x01c3:
            com.carrefour.fid.android.basket.domain.interactors.internal.HandleBasketExceptionUseCase r10 = r5.f33976b
            r0.L$0 = r4
            r0.L$1 = r4
            r0.L$2 = r4
            r2 = 7
            r0.label = r2
            java.lang.Object r9 = r10.m172784invokegIAlus(r9, r0)
            if (r9 != r1) goto L_0x01d5
            return r1
        L_0x01d5:
            return r9
        L_0x01d6:
            return r10
        L_0x01d7:
            kotlin.Result$a r9 = kotlin.Result.f28060a
            com.carrefour.fid.android.domain.exceptions.RequireServiceSelectionThrowable r9 = com.carrefour.fid.android.domain.exceptions.RequireServiceSelectionThrowable.f94243a
            java.lang.Object r9 = kotlin.C11661u0.m45734a(r9)
            java.lang.Object r9 = kotlin.Result.m38702b(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.interactors.internal.UpdateBasketOfferQuantityUseCase.m172789invokegIAlus(com.carrefour.fid.android.domain.interactors.basket.n0$a, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo33322c(java.lang.String r12, com.carrefour.fid.android.domain.interactors.basket.C37588n0.C37589a r13, kotlin.coroutines.C11045c<? super kotlin.Result<com.carrefour.fid.android.domain.models.basket.Basket>> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.carrefour.fid.android.basket.domain.interactors.internal.UpdateBasketOfferQuantityUseCase$updateOffer$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.carrefour.fid.android.basket.domain.interactors.internal.UpdateBasketOfferQuantityUseCase$updateOffer$1 r0 = (com.carrefour.fid.android.basket.domain.interactors.internal.UpdateBasketOfferQuantityUseCase$updateOffer$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.basket.domain.interactors.internal.UpdateBasketOfferQuantityUseCase$updateOffer$1 r0 = new com.carrefour.fid.android.basket.domain.interactors.internal.UpdateBasketOfferQuantityUseCase$updateOffer$1
            r0.<init>(r11, r14)
        L_0x0018:
            r8 = r0
            java.lang.Object r14 = r8.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r1 = r8.label
            r2 = 1
            if (r1 == 0) goto L_0x0038
            if (r1 != r2) goto L_0x0030
            kotlin.C11661u0.m45747n(r14)
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r12 = r14.mo21858l()
            goto L_0x005c
        L_0x0030:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0038:
            kotlin.C11661u0.m45747n(r14)
            com.carrefour.fid.android.basket.domain.repositories.BasketRepository r1 = r11.f33978d
            com.carrefour.fid.android.domain.models.offer.OfferIdentifier r14 = r13.mo114414f()
            java.lang.String r3 = r14.mo118136f()
            int r4 = r13.mo114415g()
            r5 = 0
            boolean r6 = r13.mo114416h()
            r7 = 0
            r9 = 32
            r10 = 0
            r8.label = r2
            r2 = r12
            java.lang.Object r12 = com.carrefour.fid.android.basket.domain.repositories.BasketRepository.m59185I(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r12 != r0) goto L_0x005c
            return r0
        L_0x005c:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.domain.interactors.internal.UpdateBasketOfferQuantityUseCase.mo33322c(java.lang.String, com.carrefour.fid.android.domain.interactors.basket.n0$a, kotlin.coroutines.c):java.lang.Object");
    }
}

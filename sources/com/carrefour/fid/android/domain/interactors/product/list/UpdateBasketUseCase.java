package com.carrefour.fid.android.domain.interactors.product.list;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.interactors.basket.C37570g;
import com.carrefour.fid.android.domain.interactors.basket.C37581k0;
import javax.inject.Inject;
import kotlin.C11079d2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
public final class UpdateBasketUseCase implements C37679f<C37767a, C11079d2> {

    /* renamed from: c */
    public static final int f94789c = 8;
    @C12579k

    /* renamed from: a */
    public final C37581k0 f94790a;
    @C12579k

    /* renamed from: b */
    public final C37570g f94791b;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.domain.interactors.product.list.UpdateBasketUseCase$a */
    public static final class C37767a {

        /* renamed from: b */
        public static final int f94792b = 0;
        @C12579k

        /* renamed from: a */
        public final String f94793a;

        public C37767a(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "referenceId");
            this.f94793a = str;
        }

        /* renamed from: c */
        public static /* synthetic */ C37767a m154830c(C37767a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f94793a;
            }
            return aVar.mo115083b(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo115082a() {
            return this.f94793a;
        }

        @C12579k
        /* renamed from: b */
        public final C37767a mo115083b(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "referenceId");
            return new C37767a(str);
        }

        @C12579k
        /* renamed from: d */
        public final String mo115084d() {
            return this.f94793a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C37767a) && Intrinsics.areEqual((Object) this.f94793a, (Object) ((C37767a) obj).f94793a);
        }

        public int hashCode() {
            return this.f94793a.hashCode();
        }

        @C12579k
        public String toString() {
            String str = this.f94793a;
            return "Param(referenceId=" + str + ")";
        }
    }

    @Inject
    public UpdateBasketUseCase(@C12579k C37581k0 k0Var, @C12579k C37570g gVar) {
        Intrinsics.checkNotNullParameter(k0Var, "syncBasketDetailsUseCase");
        Intrinsics.checkNotNullParameter(gVar, "checkSelectedServiceTypeUseCase");
        this.f94790a = k0Var;
        this.f94791b = gVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo115080b(kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.domain.interactors.product.list.UpdateBasketUseCase$checkFacilityServiceId$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.domain.interactors.product.list.UpdateBasketUseCase$checkFacilityServiceId$1 r0 = (com.carrefour.fid.android.domain.interactors.product.list.UpdateBasketUseCase$checkFacilityServiceId$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.product.list.UpdateBasketUseCase$checkFacilityServiceId$1 r0 = new com.carrefour.fid.android.domain.interactors.product.list.UpdateBasketUseCase$checkFacilityServiceId$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.mo21858l()
            goto L_0x0045
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.domain.interactors.basket.g r5 = r4.f94791b
            r0.label = r3
            java.lang.Object r5 = r5.m172965invokeIoAF18A(r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            java.lang.Throwable r0 = kotlin.Result.m38705e(r5)
            if (r0 != 0) goto L_0x0056
            kotlin.d2 r5 = (kotlin.C11079d2) r5
            kotlin.Result$a r5 = kotlin.Result.f28060a
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            goto L_0x006d
        L_0x0056:
            boolean r5 = r0 instanceof com.carrefour.fid.android.domain.exceptions.FacilityIdSwitchNotNecessaryThrowable
            if (r5 == 0) goto L_0x0063
            kotlin.Result$a r5 = kotlin.Result.f28060a
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            return r5
        L_0x0063:
            kotlin.Result$a r5 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x006d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.product.list.UpdateBasketUseCase.mo115080b(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172990invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.interactors.product.list.UpdateBasketUseCase.C37767a r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.domain.interactors.product.list.UpdateBasketUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.domain.interactors.product.list.UpdateBasketUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.product.list.UpdateBasketUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.product.list.UpdateBasketUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.product.list.UpdateBasketUseCase$invoke$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004c
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r6 = r7.mo21858l()
            goto L_0x008e
        L_0x0032:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003a:
            java.lang.Object r6 = r0.L$1
            com.carrefour.fid.android.domain.interactors.product.list.UpdateBasketUseCase$a r6 = (com.carrefour.fid.android.domain.interactors.product.list.UpdateBasketUseCase.C37767a) r6
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.domain.interactors.product.list.UpdateBasketUseCase r2 = (com.carrefour.fid.android.domain.interactors.product.list.UpdateBasketUseCase) r2
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x005d
        L_0x004c:
            kotlin.C11661u0.m45747n(r7)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r5.mo115080b(r0)
            if (r7 != r1) goto L_0x005c
            return r1
        L_0x005c:
            r2 = r5
        L_0x005d:
            boolean r4 = kotlin.Result.m38709i(r7)
            if (r4 == 0) goto L_0x0075
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.Throwable r6 = kotlin.Result.m38705e(r7)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r6)
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
            return r6
        L_0x0075:
            com.carrefour.fid.android.domain.interactors.basket.k0 r7 = r2.f94790a
            com.carrefour.fid.android.domain.interactors.basket.k0$a r2 = new com.carrefour.fid.android.domain.interactors.basket.k0$a
            java.lang.String r6 = r6.mo115084d()
            r2.<init>(r6)
            r6 = 0
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r6 = r7.m172966invokegIAlus(r2, r0)
            if (r6 != r1) goto L_0x008e
            return r1
        L_0x008e:
            java.lang.Throwable r7 = kotlin.Result.m38705e(r6)
            if (r7 != 0) goto L_0x009f
            com.carrefour.fid.android.domain.models.basket.Basket r6 = (com.carrefour.fid.android.domain.models.basket.Basket) r6
            kotlin.Result$a r6 = kotlin.Result.f28060a
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
            goto L_0x00a9
        L_0x009f:
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r7)
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
        L_0x00a9:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.product.list.UpdateBasketUseCase.m172990invokegIAlus(com.carrefour.fid.android.domain.interactors.product.list.UpdateBasketUseCase$a, kotlin.coroutines.c):java.lang.Object");
    }
}

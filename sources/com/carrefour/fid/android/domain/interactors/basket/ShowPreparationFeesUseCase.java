package com.carrefour.fid.android.domain.interactors.basket;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.interactors.service.C37823k;
import com.carrefour.fid.android.domain.models.basket.Basket;
import javax.inject.Inject;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11074j;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
public final class ShowPreparationFeesUseCase implements C11304p<Basket, C11045c<? super Boolean>, Object>, C11074j {

    /* renamed from: b */
    public static final int f94322b = 8;
    @C12579k

    /* renamed from: a */
    public final C37823k f94323a;

    @Inject
    public ShowPreparationFeesUseCase(@C12579k C37823k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "serviceSelectionUseCase");
        this.f94323a = kVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.domain.models.basket.Basket r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.lang.Boolean> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.domain.interactors.basket.ShowPreparationFeesUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.domain.interactors.basket.ShowPreparationFeesUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.basket.ShowPreparationFeesUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.basket.ShowPreparationFeesUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.basket.ShowPreparationFeesUseCase$invoke$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r5 = r0.L$0
            com.carrefour.fid.android.domain.models.basket.Basket r5 = (com.carrefour.fid.android.domain.models.basket.Basket) r5
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x004b
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003b:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.domain.interactors.service.k r6 = r4.f94323a
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r6.m172965invokeIoAF18A(r0)
            if (r6 != r1) goto L_0x004b
            return r1
        L_0x004b:
            boolean r0 = kotlin.Result.m38709i(r6)
            if (r0 == 0) goto L_0x0052
            r6 = 0
        L_0x0052:
            com.carrefour.fid.android.domain.models.service.models.k r6 = (com.carrefour.fid.android.domain.models.service.models.C38162k) r6
            r0 = 0
            if (r6 == 0) goto L_0x0062
            com.carrefour.fid.android.domain.models.service.models.StoreService r6 = r6.mo119354f()
            if (r6 == 0) goto L_0x0062
            boolean r6 = com.carrefour.fid.android.service.domain.extension.StoreServiceKt.isDrive(r6)
            goto L_0x0063
        L_0x0062:
            r6 = r0
        L_0x0063:
            if (r6 == 0) goto L_0x006f
            com.carrefour.fid.android.domain.models.basket.BasketType r5 = r5.mo116829N()
            com.carrefour.fid.android.domain.models.basket.BasketType r6 = com.carrefour.fid.android.domain.models.basket.BasketType.BASKET_V4_DRIVE
            if (r5 == r6) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r3 = r0
        L_0x006f:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.basket.ShowPreparationFeesUseCase.invoke(com.carrefour.fid.android.domain.models.basket.Basket, kotlin.coroutines.c):java.lang.Object");
    }
}

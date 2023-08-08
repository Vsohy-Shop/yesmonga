package com.carrefour.fid.android.domain.interactors.order;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.interactors.additionalorder.C37541b;
import com.carrefour.fid.android.domain.repositories.C38192a;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nAppSetAdditionalOrderContextUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppSetAdditionalOrderContextUseCase.kt\ncom/carrefour/fid/android/domain/interactors/order/AppSetAdditionalOrderContextUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,15:1\n1#2:16\n*E\n"})
public final class AppSetAdditionalOrderContextUseCase implements C37541b {

    /* renamed from: b */
    public static final int f94647b = 8;
    @C12579k

    /* renamed from: a */
    public final C38192a f94648a;

    @Inject
    public AppSetAdditionalOrderContextUseCase(@C12579k C38192a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "additionalOrderRepository");
        this.f94648a = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172975invokegIAlus(@org.jetbrains.annotations.C12580l com.carrefour.fid.android.domain.models.additionalorder.C37952a r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.domain.interactors.order.AppSetAdditionalOrderContextUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.domain.interactors.order.AppSetAdditionalOrderContextUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.order.AppSetAdditionalOrderContextUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.order.AppSetAdditionalOrderContextUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.order.AppSetAdditionalOrderContextUseCase$invoke$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r6)     // Catch:{ all -> 0x0048 }
            goto L_0x0041
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result$a r6 = kotlin.Result.f28060a     // Catch:{ all -> 0x0048 }
            com.carrefour.fid.android.domain.repositories.a r6 = r4.f94648a     // Catch:{ all -> 0x0048 }
            r0.label = r3     // Catch:{ all -> 0x0048 }
            java.lang.Object r5 = r6.mo111575a(r5, r0)     // Catch:{ all -> 0x0048 }
            if (r5 != r1) goto L_0x0041
            return r1
        L_0x0041:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0048 }
            java.lang.Object r5 = kotlin.Result.m38702b(r5)     // Catch:{ all -> 0x0048 }
            goto L_0x0053
        L_0x0048:
            r5 = move-exception
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x0053:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.order.AppSetAdditionalOrderContextUseCase.m172975invokegIAlus(com.carrefour.fid.android.domain.models.additionalorder.a, kotlin.coroutines.c):java.lang.Object");
    }
}

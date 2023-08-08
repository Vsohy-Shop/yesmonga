package com.carrefour.fid.android.domain.interactors.account.store.memo;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.repositories.C38197f;
import com.carrefour.fid.android.presentation.models.C38495l;
import javax.inject.Inject;
import kotlin.C11079d2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
public final class UpdateMemoListUseCase implements C37679f<C38495l, C11079d2> {

    /* renamed from: b */
    public static final int f94274b = 8;
    @C12579k

    /* renamed from: a */
    public final C38197f f94275a;

    @Inject
    public UpdateMemoListUseCase(@C12579k C38197f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "repository");
        this.f94275a = fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172937invokegIAlus(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.models.C38495l r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.domain.interactors.account.store.memo.UpdateMemoListUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.domain.interactors.account.store.memo.UpdateMemoListUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.account.store.memo.UpdateMemoListUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.account.store.memo.UpdateMemoListUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.account.store.memo.UpdateMemoListUseCase$invoke$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r6)
            goto L_0x003f
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.domain.repositories.f r6 = r4.f94275a
            r0.label = r3
            java.lang.Object r5 = r6.mo111519f(r5, r0)
            if (r5 != r1) goto L_0x003f
            return r1
        L_0x003f:
            kotlin.Result$a r5 = kotlin.Result.f28060a
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.account.store.memo.UpdateMemoListUseCase.m172937invokegIAlus(com.carrefour.fid.android.presentation.models.l, kotlin.coroutines.c):java.lang.Object");
    }
}

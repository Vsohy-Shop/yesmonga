package com.carrefour.fid.android.domain.interactors.product.search;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.interactors.C37678e;
import com.carrefour.fid.android.domain.interactors.remoteconfig.C37807b;
import javax.inject.Inject;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nSearchWithListRemoteConfigUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchWithListRemoteConfigUseCase.kt\ncom/carrefour/fid/android/domain/interactors/product/search/SearchWithListRemoteConfigUseCase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,16:1\n1#2:17\n*E\n"})
public final class SearchWithListRemoteConfigUseCase implements C37678e<Boolean> {

    /* renamed from: b */
    public static final int f94861b = 8;
    @C12579k

    /* renamed from: a */
    public final C37807b f94862a;

    @Inject
    public SearchWithListRemoteConfigUseCase(@C12579k C37807b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "remoteConfigRepository");
        this.f94862a = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052 A[SYNTHETIC, Splitter:B:17:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m173000invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.Boolean>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.domain.interactors.product.search.SearchWithListRemoteConfigUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.domain.interactors.product.search.SearchWithListRemoteConfigUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.product.search.SearchWithListRemoteConfigUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.product.search.SearchWithListRemoteConfigUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.product.search.SearchWithListRemoteConfigUseCase$invoke$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x004c
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0037:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.domain.interactors.remoteconfig.b r6 = r5.f94862a
            com.carrefour.fid.android.domain.interactors.remoteconfig.b$a r2 = new com.carrefour.fid.android.domain.interactors.remoteconfig.b$a
            com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag r4 = com.carrefour.fid.android.domain.models.remoteconfig.RemoteConfigTag.SearchWithList
            r2.<init>(r4)
            r0.label = r3
            java.lang.Object r6 = r6.m172966invokegIAlus(r2, r0)
            if (r6 != r1) goto L_0x004c
            return r1
        L_0x004c:
            boolean r0 = kotlin.Result.m38710j(r6)
            if (r0 == 0) goto L_0x006e
            kotlin.Result$a r0 = kotlin.Result.f28060a     // Catch:{ all -> 0x0067 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x0067 }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x0067 }
            if (r6 == 0) goto L_0x005d
            goto L_0x005e
        L_0x005d:
            r3 = 0
        L_0x005e:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r3)     // Catch:{ all -> 0x0067 }
            java.lang.Object r6 = kotlin.Result.m38702b(r6)     // Catch:{ all -> 0x0067 }
            goto L_0x0072
        L_0x0067:
            r6 = move-exception
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r6)
        L_0x006e:
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
        L_0x0072:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.product.search.SearchWithListRemoteConfigUseCase.m173000invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}

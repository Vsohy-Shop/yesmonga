package com.carrefour.fid.android.domain.interactors.account.store.memo;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.type.C36368a;
import com.carrefour.fid.android.domain.interactors.C37679f;
import com.carrefour.fid.android.domain.repositories.C38197f;
import javax.inject.Inject;
import kotlin.C11079d2;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nClearMemoListUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClearMemoListUseCase.kt\ncom/carrefour/fid/android/domain/interactors/account/store/memo/ClearMemoListUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,25:1\n766#2:26\n857#2,2:27\n1549#2:29\n1620#2,3:30\n*S KotlinDebug\n*F\n+ 1 ClearMemoListUseCase.kt\ncom/carrefour/fid/android/domain/interactors/account/store/memo/ClearMemoListUseCase\n*L\n16#1:26\n16#1:27,2\n17#1:29\n17#1:30,3\n*E\n"})
public final class ClearMemoListUseCase implements C37679f<C36368a, C11079d2> {

    /* renamed from: b */
    public static final int f94267b = 8;
    @C12579k

    /* renamed from: a */
    public final C38197f f94268a;

    @Inject
    public ClearMemoListUseCase(@C12579k C38197f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "repository");
        this.f94268a = fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172934invokegIAlus(@org.jetbrains.annotations.C12580l com.carrefour.fid.android.core.type.C36368a r8, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.domain.interactors.account.store.memo.ClearMemoListUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.domain.interactors.account.store.memo.ClearMemoListUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.account.store.memo.ClearMemoListUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.account.store.memo.ClearMemoListUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.account.store.memo.ClearMemoListUseCase$invoke$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004d
            if (r2 == r4) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r8 = r9.mo21858l()
            goto L_0x00d0
        L_0x0033:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003b:
            java.lang.Object r8 = r0.L$1
            com.carrefour.fid.android.core.type.a r8 = (com.carrefour.fid.android.core.type.C36368a) r8
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.domain.interactors.account.store.memo.ClearMemoListUseCase r2 = (com.carrefour.fid.android.domain.interactors.account.store.memo.ClearMemoListUseCase) r2
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x0060
        L_0x004d:
            kotlin.C11661u0.m45747n(r9)
            com.carrefour.fid.android.domain.repositories.f r9 = r7.f94268a
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r9 = r9.mo111518e(r0)
            if (r9 != r1) goto L_0x005f
            return r1
        L_0x005f:
            r2 = r7
        L_0x0060:
            java.lang.Throwable r4 = kotlin.Result.m38705e(r9)
            if (r4 != 0) goto L_0x00c6
            java.util.List r9 = (java.util.List) r9
            if (r8 == 0) goto L_0x0091
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x0075:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L_0x0090
            java.lang.Object r5 = r9.next()
            r6 = r5
            com.carrefour.fid.android.presentation.models.l r6 = (com.carrefour.fid.android.presentation.models.C38495l) r6
            com.carrefour.fid.android.core.type.a r6 = r6.mo122101X()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r8)
            if (r6 == 0) goto L_0x0075
            r4.add(r5)
            goto L_0x0075
        L_0x0090:
            r9 = r4
        L_0x0091:
            com.carrefour.fid.android.domain.repositories.f r2 = r2.f94268a
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.C10978t.m41495Y(r9, r5)
            r4.<init>(r5)
            java.util.Iterator r9 = r9.iterator()
        L_0x00a4:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L_0x00b8
            java.lang.Object r5 = r9.next()
            com.carrefour.fid.android.presentation.models.l r5 = (com.carrefour.fid.android.presentation.models.C38495l) r5
            java.lang.String r5 = r5.mo122100W()
            r4.add(r5)
            goto L_0x00a4
        L_0x00b8:
            r9 = 0
            r0.L$0 = r9
            r0.L$1 = r9
            r0.label = r3
            java.lang.Object r8 = r2.mo111521h(r4, r8, r0)
            if (r8 != r1) goto L_0x00d0
            return r1
        L_0x00c6:
            kotlin.Result$a r8 = kotlin.Result.f28060a
            java.lang.Object r8 = kotlin.C11661u0.m45734a(r4)
            java.lang.Object r8 = kotlin.Result.m38702b(r8)
        L_0x00d0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.account.store.memo.ClearMemoListUseCase.m172934invokegIAlus(com.carrefour.fid.android.core.type.a, kotlin.coroutines.c):java.lang.Object");
    }
}

package com.carrefour.fid.android.domain.interactors.account.store.memo;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.account.data.repositories.LoginRepository;
import com.carrefour.fid.android.domain.interactors.C37678e;
import com.carrefour.fid.android.domain.repositories.C38197f;
import com.carrefour.fid.android.presentation.models.C38495l;
import com.carrefour.fid.android.shared.util.C28932h;
import java.util.Comparator;
import java.util.List;
import javax.inject.Inject;
import kotlin.comparisons.C11006g;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nGetMemoListUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetMemoListUseCase.kt\ncom/carrefour/fid/android/domain/interactors/account/store/memo/GetMemoListUseCase\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,40:1\n1045#2:41\n*S KotlinDebug\n*F\n+ 1 GetMemoListUseCase.kt\ncom/carrefour/fid/android/domain/interactors/account/store/memo/GetMemoListUseCase\n*L\n29#1:41\n*E\n"})
public final class GetMemoListUseCase implements C37678e<List<? extends C38495l>> {

    /* renamed from: c */
    public static final int f94271c = LoginRepository.f32381c;
    @C12579k

    /* renamed from: a */
    public final LoginRepository f94272a;
    @C12579k

    /* renamed from: b */
    public final C38197f f94273b;

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 GetMemoListUseCase.kt\ncom/carrefour/fid/android/domain/interactors/account/store/memo/GetMemoListUseCase\n*L\n1#1,328:1\n30#2:329\n*E\n"})
    /* renamed from: com.carrefour.fid.android.domain.interactors.account.store.memo.GetMemoListUseCase$a */
    public static final class C37528a<T> implements Comparator {
        public final int compare(T t, T t2) {
            C28932h.C28933a aVar = C28932h.f70914a;
            return C11006g.m42424l(Long.valueOf(aVar.mo84231V(((C38495l) t).mo122099Q(), C28932h.f70917d)), Long.valueOf(aVar.mo84231V(((C38495l) t2).mo122099Q(), C28932h.f70917d)));
        }
    }

    @Inject
    public GetMemoListUseCase(@C12579k LoginRepository loginRepository, @C12579k C38197f fVar) {
        Intrinsics.checkNotNullParameter(loginRepository, "loginRepository");
        Intrinsics.checkNotNullParameter(fVar, "repository");
        this.f94272a = loginRepository;
        this.f94273b = fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: invoke-IoAF18A  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m172936invokeIoAF18A(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.presentation.models.C38495l>>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.domain.interactors.account.store.memo.GetMemoListUseCase$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.domain.interactors.account.store.memo.GetMemoListUseCase$invoke$1 r0 = (com.carrefour.fid.android.domain.interactors.account.store.memo.GetMemoListUseCase$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.domain.interactors.account.store.memo.GetMemoListUseCase$invoke$1 r0 = new com.carrefour.fid.android.domain.interactors.account.store.memo.GetMemoListUseCase$invoke$1
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
            goto L_0x005d
        L_0x002f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0037:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.account.data.repositories.LoginRepository r5 = r4.f94272a
            boolean r5 = com.carrefour.fid.android.account.data.extension.C13195a.m57178b(r5)
            if (r5 == 0) goto L_0x0052
            kotlin.Result$a r5 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.RequireSignInThrowable r5 = new com.carrefour.fid.android.shared.io.RequireSignInThrowable
            r5.<init>()
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            return r5
        L_0x0052:
            com.carrefour.fid.android.domain.repositories.f r5 = r4.f94273b
            r0.label = r3
            java.lang.Object r5 = r5.mo111518e(r0)
            if (r5 != r1) goto L_0x005d
            return r1
        L_0x005d:
            java.lang.Throwable r0 = kotlin.Result.m38705e(r5)
            if (r0 != 0) goto L_0x008d
            java.util.List r5 = (java.util.List) r5
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x007b
            kotlin.Result$a r5 = kotlin.Result.f28060a
            com.carrefour.fid.android.shared.io.EmptyListThrowable r5 = new com.carrefour.fid.android.shared.io.EmptyListThrowable
            r5.<init>()
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            goto L_0x0097
        L_0x007b:
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            com.carrefour.fid.android.domain.interactors.account.store.memo.GetMemoListUseCase$a r0 = new com.carrefour.fid.android.domain.interactors.account.store.memo.GetMemoListUseCase$a
            r0.<init>()
            java.util.List r5 = kotlin.collections.CollectionsKt___CollectionsKt.m40675p5(r5, r0)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            goto L_0x0097
        L_0x008d:
            kotlin.Result$a r5 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r0)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x0097:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.domain.interactors.account.store.memo.GetMemoListUseCase.m172936invokeIoAF18A(kotlin.coroutines.c):java.lang.Object");
    }
}

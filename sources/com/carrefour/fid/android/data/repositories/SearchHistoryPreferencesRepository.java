package com.carrefour.fid.android.data.repositories;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.datastore.AppPreferencesStorage;
import com.carrefour.fid.android.domain.repositories.C38203j;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@Singleton
@C8567o(parameters = 0)
public final class SearchHistoryPreferencesRepository implements C38203j {

    /* renamed from: b */
    public static final int f90440b = 8;
    @C12579k

    /* renamed from: a */
    public final AppPreferencesStorage f90441a;

    @Inject
    public SearchHistoryPreferencesRepository(@C12579k AppPreferencesStorage appPreferencesStorage) {
        Intrinsics.checkNotNullParameter(appPreferencesStorage, "appPreferencesStorage");
        this.f90441a = appPreferencesStorage;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo111564a(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.data.repositories.SearchHistoryPreferencesRepository$clear$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.data.repositories.SearchHistoryPreferencesRepository$clear$1 r0 = (com.carrefour.fid.android.data.repositories.SearchHistoryPreferencesRepository$clear$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.SearchHistoryPreferencesRepository$clear$1 r0 = new com.carrefour.fid.android.data.repositories.SearchHistoryPreferencesRepository$clear$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r5)     // Catch:{ all -> 0x0048 }
            goto L_0x0041
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result$a r5 = kotlin.Result.f28060a     // Catch:{ all -> 0x0048 }
            com.carrefour.fid.android.core.datastore.AppPreferencesStorage r5 = r4.f90441a     // Catch:{ all -> 0x0048 }
            r0.label = r3     // Catch:{ all -> 0x0048 }
            java.lang.Object r5 = r5.mo108079b(r0)     // Catch:{ all -> 0x0048 }
            if (r5 != r1) goto L_0x0041
            return r1
        L_0x0041:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0048 }
            java.lang.Object r5 = kotlin.Result.m38702b(r5)     // Catch:{ all -> 0x0048 }
            goto L_0x0053
        L_0x0048:
            r5 = move-exception
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x0053:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.SearchHistoryPreferencesRepository.mo111564a(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo111565b(@org.jetbrains.annotations.C12579k java.lang.String r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.data.repositories.SearchHistoryPreferencesRepository$add$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.data.repositories.SearchHistoryPreferencesRepository$add$1 r0 = (com.carrefour.fid.android.data.repositories.SearchHistoryPreferencesRepository$add$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.SearchHistoryPreferencesRepository$add$1 r0 = new com.carrefour.fid.android.data.repositories.SearchHistoryPreferencesRepository$add$1
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
            com.carrefour.fid.android.core.datastore.AppPreferencesStorage r6 = r4.f90441a     // Catch:{ all -> 0x0048 }
            r0.label = r3     // Catch:{ all -> 0x0048 }
            java.lang.Object r5 = r6.mo108078a(r5, r0)     // Catch:{ all -> 0x0048 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.SearchHistoryPreferencesRepository.mo111565b(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo111566c(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.Set<java.lang.String>>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.data.repositories.SearchHistoryPreferencesRepository$get$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.data.repositories.SearchHistoryPreferencesRepository$get$1 r0 = (com.carrefour.fid.android.data.repositories.SearchHistoryPreferencesRepository$get$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.SearchHistoryPreferencesRepository$get$1 r0 = new com.carrefour.fid.android.data.repositories.SearchHistoryPreferencesRepository$get$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r5)     // Catch:{ all -> 0x004c }
            goto L_0x0041
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result$a r5 = kotlin.Result.f28060a     // Catch:{ all -> 0x004c }
            com.carrefour.fid.android.core.datastore.AppPreferencesStorage r5 = r4.f90441a     // Catch:{ all -> 0x004c }
            r0.label = r3     // Catch:{ all -> 0x004c }
            java.lang.Object r5 = r5.mo108080c(r0)     // Catch:{ all -> 0x004c }
            if (r5 != r1) goto L_0x0041
            return r1
        L_0x0041:
            com.carrefour.fid.android.core.datastore.a r5 = (com.carrefour.fid.android.core.datastore.C36193a) r5     // Catch:{ all -> 0x004c }
            java.util.Set r5 = r5.mo108114A()     // Catch:{ all -> 0x004c }
            java.lang.Object r5 = kotlin.Result.m38702b(r5)     // Catch:{ all -> 0x004c }
            goto L_0x0057
        L_0x004c:
            r5 = move-exception
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x0057:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.SearchHistoryPreferencesRepository.mo111566c(kotlin.coroutines.c):java.lang.Object");
    }
}

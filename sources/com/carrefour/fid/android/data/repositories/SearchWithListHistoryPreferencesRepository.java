package com.carrefour.fid.android.data.repositories;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.datastore.AppPreferencesStorage;
import com.carrefour.fid.android.domain.repositories.C38204k;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@Singleton
@C8567o(parameters = 0)
public final class SearchWithListHistoryPreferencesRepository implements C38204k {

    /* renamed from: b */
    public static final int f90442b = 8;
    @C12579k

    /* renamed from: a */
    public final AppPreferencesStorage f90443a;

    @Inject
    public SearchWithListHistoryPreferencesRepository(@C12579k AppPreferencesStorage appPreferencesStorage) {
        Intrinsics.checkNotNullParameter(appPreferencesStorage, "appPreferencesStorage");
        this.f90443a = appPreferencesStorage;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo111567a(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.data.repositories.SearchWithListHistoryPreferencesRepository$clear$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.data.repositories.SearchWithListHistoryPreferencesRepository$clear$1 r0 = (com.carrefour.fid.android.data.repositories.SearchWithListHistoryPreferencesRepository$clear$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.SearchWithListHistoryPreferencesRepository$clear$1 r0 = new com.carrefour.fid.android.data.repositories.SearchWithListHistoryPreferencesRepository$clear$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r5)
            goto L_0x0045
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r5)
            kotlin.Result$a r5 = kotlin.Result.f28060a
            com.carrefour.fid.android.core.datastore.AppPreferencesStorage r5 = r4.f90443a
            java.util.Set r2 = kotlin.collections.C10930d1.m40892k()
            r0.label = r3
            java.lang.Object r5 = r5.mo108095r(r2, r0)
            if (r5 != r1) goto L_0x0045
            return r1
        L_0x0045:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.SearchWithListHistoryPreferencesRepository.mo111567a(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo111568b(@org.jetbrains.annotations.C12579k java.util.Set<java.lang.String> r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.data.repositories.SearchWithListHistoryPreferencesRepository$set$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.data.repositories.SearchWithListHistoryPreferencesRepository$set$1 r0 = (com.carrefour.fid.android.data.repositories.SearchWithListHistoryPreferencesRepository$set$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.SearchWithListHistoryPreferencesRepository$set$1 r0 = new com.carrefour.fid.android.data.repositories.SearchWithListHistoryPreferencesRepository$set$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0041
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result$a r6 = kotlin.Result.f28060a
            com.carrefour.fid.android.core.datastore.AppPreferencesStorage r6 = r4.f90443a
            r0.label = r3
            java.lang.Object r5 = r6.mo108095r(r5, r0)
            if (r5 != r1) goto L_0x0041
            return r1
        L_0x0041:
            kotlin.d2 r5 = kotlin.C11079d2.f28267a
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.SearchWithListHistoryPreferencesRepository.mo111568b(java.util.Set, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo111569c(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.Set<java.lang.String>>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.carrefour.fid.android.data.repositories.SearchWithListHistoryPreferencesRepository$get$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.carrefour.fid.android.data.repositories.SearchWithListHistoryPreferencesRepository$get$1 r0 = (com.carrefour.fid.android.data.repositories.SearchWithListHistoryPreferencesRepository$get$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.SearchWithListHistoryPreferencesRepository$get$1 r0 = new com.carrefour.fid.android.data.repositories.SearchWithListHistoryPreferencesRepository$get$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.C11661u0.m45747n(r5)
            goto L_0x003f
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            kotlin.C11661u0.m45747n(r5)
            com.carrefour.fid.android.core.datastore.AppPreferencesStorage r5 = r4.f90443a
            r0.label = r3
            java.lang.Object r5 = r5.mo108080c(r0)
            if (r5 != r1) goto L_0x003f
            return r1
        L_0x003f:
            com.carrefour.fid.android.core.datastore.a r5 = (com.carrefour.fid.android.core.datastore.C36193a) r5
            java.util.Set r5 = r5.mo108147z()
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x005b
            kotlin.Result$a r5 = kotlin.Result.f28060a
            com.carrefour.fid.android.core.io.SearchWithListHistoryEmptyThrowable r5 = new com.carrefour.fid.android.core.io.SearchWithListHistoryEmptyThrowable
            r5.<init>()
            java.lang.Object r5 = kotlin.C11661u0.m45734a(r5)
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
            goto L_0x0061
        L_0x005b:
            kotlin.Result$a r0 = kotlin.Result.f28060a
            java.lang.Object r5 = kotlin.Result.m38702b(r5)
        L_0x0061:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.SearchWithListHistoryPreferencesRepository.mo111569c(kotlin.coroutines.c):java.lang.Object");
    }
}

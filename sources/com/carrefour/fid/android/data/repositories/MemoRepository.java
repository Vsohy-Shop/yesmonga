package com.carrefour.fid.android.data.repositories;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.repositories.datasource.memos.MemoDataStoreSource;
import com.carrefour.fid.android.data.repositories.datasource.memos.MemoLocalDatasource;
import com.carrefour.fid.android.data.repositories.datasource.memos.MemoRemoteDatasource;
import com.carrefour.fid.android.domain.repositories.C38197f;
import com.carrefour.fid.android.presentation.models.C38495l;
import javax.inject.Inject;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nMemoRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MemoRepository.kt\ncom/carrefour/fid/android/data/repositories/MemoRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,110:1\n1549#2:111\n1620#2,3:112\n766#2:115\n857#2,2:116\n1549#2:118\n1620#2,3:119\n766#2:122\n857#2,2:123\n1549#2:125\n1620#2,3:126\n766#2:129\n857#2,2:130\n1549#2:132\n1620#2,3:133\n*S KotlinDebug\n*F\n+ 1 MemoRepository.kt\ncom/carrefour/fid/android/data/repositories/MemoRepository\n*L\n26#1:111\n26#1:112,3\n64#1:115\n64#1:116,2\n65#1:118\n65#1:119,3\n94#1:122\n94#1:123,2\n95#1:125\n95#1:126,3\n101#1:129\n101#1:130,2\n101#1:132\n101#1:133,3\n*E\n"})
public final class MemoRepository implements C38197f {

    /* renamed from: e */
    public static final int f90392e = 8;
    @C12579k

    /* renamed from: a */
    public final MemoRemoteDatasource f90393a;
    @C12579k

    /* renamed from: b */
    public final MemoLocalDatasource f90394b;
    @C12579k

    /* renamed from: c */
    public final MemoDataStoreSource f90395c;
    @C12579k

    /* renamed from: d */
    public String f90396d = "";

    @Inject
    public MemoRepository(@C12579k MemoRemoteDatasource memoRemoteDatasource, @C12579k MemoLocalDatasource memoLocalDatasource, @C12579k MemoDataStoreSource memoDataStoreSource) {
        Intrinsics.checkNotNullParameter(memoRemoteDatasource, "remoteDatasource");
        Intrinsics.checkNotNullParameter(memoLocalDatasource, "localDatasource");
        Intrinsics.checkNotNullParameter(memoDataStoreSource, "memoDataStoreSource");
        this.f90393a = memoRemoteDatasource;
        this.f90394b = memoLocalDatasource;
        this.f90395c = memoDataStoreSource;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo111515b(@org.jetbrains.annotations.C12579k java.lang.String r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.data.repositories.MemoRepository$add$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.data.repositories.MemoRepository$add$1 r0 = (com.carrefour.fid.android.data.repositories.MemoRepository$add$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.MemoRepository$add$1 r0 = new com.carrefour.fid.android.data.repositories.MemoRepository$add$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004b
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            r7.mo21858l()
            goto L_0x0076
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0039:
            java.lang.Object r6 = r0.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.data.repositories.MemoRepository r2 = (com.carrefour.fid.android.data.repositories.MemoRepository) r2
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x005c
        L_0x004b:
            kotlin.C11661u0.m45747n(r7)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r5.mo111522j(r0)
            if (r7 != r1) goto L_0x005b
            return r1
        L_0x005b:
            r2 = r5
        L_0x005c:
            boolean r4 = kotlin.Result.m38710j(r7)
            if (r4 == 0) goto L_0x007d
            kotlin.Result$a r4 = kotlin.Result.f28060a
            java.lang.String r7 = (java.lang.String) r7
            com.carrefour.fid.android.data.repositories.datasource.memos.MemoRemoteDatasource r2 = r2.f90393a
            r4 = 0
            r0.L$0 = r4
            r0.L$1 = r4
            r0.label = r3
            java.lang.Object r6 = r2.mo111594e(r7, r6, r0)
            if (r6 != r1) goto L_0x0076
            return r1
        L_0x0076:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
            goto L_0x0081
        L_0x007d:
            java.lang.Object r6 = kotlin.Result.m38702b(r7)
        L_0x0081:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.MemoRepository.mo111515b(java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo111516c(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.presentation.models.C38495l r8, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.data.repositories.MemoRepository$delete$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.data.repositories.MemoRepository$delete$1 r0 = (com.carrefour.fid.android.data.repositories.MemoRepository$delete$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.MemoRepository$delete$1 r0 = new com.carrefour.fid.android.data.repositories.MemoRepository$delete$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x005c
            if (r2 == r5) goto L_0x004a
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            kotlin.C11661u0.m45747n(r9)
            goto L_0x00a8
        L_0x0030:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0038:
            java.lang.Object r8 = r0.L$1
            com.carrefour.fid.android.presentation.models.l r8 = (com.carrefour.fid.android.presentation.models.C38495l) r8
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.data.repositories.MemoRepository r2 = (com.carrefour.fid.android.data.repositories.MemoRepository) r2
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x008a
        L_0x004a:
            java.lang.Object r8 = r0.L$1
            com.carrefour.fid.android.presentation.models.l r8 = (com.carrefour.fid.android.presentation.models.C38495l) r8
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.data.repositories.MemoRepository r2 = (com.carrefour.fid.android.data.repositories.MemoRepository) r2
            kotlin.C11661u0.m45747n(r9)
            kotlin.Result r9 = (kotlin.Result) r9
            java.lang.Object r9 = r9.mo21858l()
            goto L_0x006d
        L_0x005c:
            kotlin.C11661u0.m45747n(r9)
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r5
            java.lang.Object r9 = r7.mo111522j(r0)
            if (r9 != r1) goto L_0x006c
            return r1
        L_0x006c:
            r2 = r7
        L_0x006d:
            boolean r5 = kotlin.Result.m38710j(r9)
            if (r5 == 0) goto L_0x00b8
            kotlin.Result$a r5 = kotlin.Result.f28060a
            java.lang.String r9 = (java.lang.String) r9
            com.carrefour.fid.android.data.repositories.datasource.memos.MemoRemoteDatasource r5 = r2.f90393a
            java.lang.String r6 = r8.mo122100W()
            r0.L$0 = r2
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r9 = r5.mo111598i(r9, r6, r0)
            if (r9 != r1) goto L_0x008a
            return r1
        L_0x008a:
            boolean r4 = kotlin.Result.m38710j(r9)
            if (r4 == 0) goto L_0x00ae
            kotlin.Result$a r4 = kotlin.Result.f28060a
            kotlin.d2 r9 = (kotlin.C11079d2) r9
            com.carrefour.fid.android.data.repositories.datasource.memos.MemoDataStoreSource r9 = r2.f90395c
            com.carrefour.fid.android.MemoItem r8 = r8.mo83534g()
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r8 = r9.mo83531e(r8, r0)
            if (r8 != r1) goto L_0x00a8
            return r1
        L_0x00a8:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            kotlin.Result.m38702b(r8)
            goto L_0x00b1
        L_0x00ae:
            kotlin.Result.m38702b(r9)
        L_0x00b1:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            java.lang.Object r8 = kotlin.Result.m38702b(r8)
            goto L_0x00bc
        L_0x00b8:
            java.lang.Object r8 = kotlin.Result.m38702b(r9)
        L_0x00bc:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.MemoRepository.mo111516c(com.carrefour.fid.android.presentation.models.l, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo111517d(@org.jetbrains.annotations.C12579k java.util.List<java.lang.String> r6, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.carrefour.fid.android.data.repositories.MemoRepository$addList$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.carrefour.fid.android.data.repositories.MemoRepository$addList$1 r0 = (com.carrefour.fid.android.data.repositories.MemoRepository$addList$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.MemoRepository$addList$1 r0 = new com.carrefour.fid.android.data.repositories.MemoRepository$addList$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004b
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            r7.mo21858l()
            goto L_0x0076
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0039:
            java.lang.Object r6 = r0.L$1
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.data.repositories.MemoRepository r2 = (com.carrefour.fid.android.data.repositories.MemoRepository) r2
            kotlin.C11661u0.m45747n(r7)
            kotlin.Result r7 = (kotlin.Result) r7
            java.lang.Object r7 = r7.mo21858l()
            goto L_0x005c
        L_0x004b:
            kotlin.C11661u0.m45747n(r7)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = r5.mo111522j(r0)
            if (r7 != r1) goto L_0x005b
            return r1
        L_0x005b:
            r2 = r5
        L_0x005c:
            boolean r4 = kotlin.Result.m38710j(r7)
            if (r4 == 0) goto L_0x007d
            kotlin.Result$a r4 = kotlin.Result.f28060a
            java.lang.String r7 = (java.lang.String) r7
            com.carrefour.fid.android.data.repositories.datasource.memos.MemoRemoteDatasource r2 = r2.f90393a
            r4 = 0
            r0.L$0 = r4
            r0.L$1 = r4
            r0.label = r3
            java.lang.Object r6 = r2.mo111595f(r7, r6, r0)
            if (r6 != r1) goto L_0x0076
            return r1
        L_0x0076:
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
            goto L_0x0081
        L_0x007d:
            java.lang.Object r6 = kotlin.Result.m38702b(r7)
        L_0x0081:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.MemoRepository.mo111517d(java.util.List, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a4 A[LOOP:0: B:31:0x009e->B:33:0x00a4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo111518e(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<? extends java.util.List<com.carrefour.fid.android.presentation.models.C38495l>>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.data.repositories.MemoRepository$load$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.data.repositories.MemoRepository$load$1 r0 = (com.carrefour.fid.android.data.repositories.MemoRepository$load$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.MemoRepository$load$1 r0 = new com.carrefour.fid.android.data.repositories.MemoRepository$load$1
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0052
            if (r2 == r5) goto L_0x0044
            if (r2 == r4) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            java.lang.Object r0 = r0.L$0
            java.util.List r0 = (java.util.List) r0
            kotlin.C11661u0.m45747n(r8)
            goto L_0x00be
        L_0x0034:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003c:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.data.repositories.MemoRepository r2 = (com.carrefour.fid.android.data.repositories.MemoRepository) r2
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0088
        L_0x0044:
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.data.repositories.MemoRepository r2 = (com.carrefour.fid.android.data.repositories.MemoRepository) r2
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x0063
        L_0x0052:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.data.repositories.datasource.memos.MemoRemoteDatasource r8 = r7.f90393a
            r0.L$0 = r7
            r0.label = r5
            java.lang.Object r8 = r8.mo111599j(r0)
            if (r8 != r1) goto L_0x0062
            return r1
        L_0x0062:
            r2 = r7
        L_0x0063:
            boolean r5 = kotlin.Result.m38710j(r8)
            if (r5 == 0) goto L_0x00c3
            kotlin.Result$a r5 = kotlin.Result.f28060a
            com.carrefour.fid.android.data.entities.ShoppingListContentResponse r8 = (com.carrefour.fid.android.data.entities.ShoppingListContentResponse) r8
            com.carrefour.fid.android.data.entities.ShoppingListInfoResponse r5 = r8.getShoppingListMetadata()
            if (r5 == 0) goto L_0x0079
            java.lang.String r5 = r5.getShoppingListId()
            if (r5 != 0) goto L_0x007b
        L_0x0079:
            java.lang.String r5 = ""
        L_0x007b:
            r2.f90396d = r5
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r8 = r2.mo111523k(r8, r0)
            if (r8 != r1) goto L_0x0088
            return r1
        L_0x0088:
            java.util.List r8 = (java.util.List) r8
            com.carrefour.fid.android.data.repositories.datasource.memos.MemoDataStoreSource r2 = r2.f90395c
            r4 = r8
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = kotlin.collections.C10978t.m41495Y(r4, r6)
            r5.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        L_0x009e:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x00b2
            java.lang.Object r6 = r4.next()
            com.carrefour.fid.android.presentation.models.l r6 = (com.carrefour.fid.android.presentation.models.C38495l) r6
            com.carrefour.fid.android.MemoItem r6 = r6.mo83534g()
            r5.add(r6)
            goto L_0x009e
        L_0x00b2:
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r0 = r2.mo83533g(r5, r0)
            if (r0 != r1) goto L_0x00bd
            return r1
        L_0x00bd:
            r0 = r8
        L_0x00be:
            java.lang.Object r8 = kotlin.Result.m38702b(r0)
            goto L_0x00c7
        L_0x00c3:
            java.lang.Object r8 = kotlin.Result.m38702b(r8)
        L_0x00c7:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.MemoRepository.mo111518e(kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: f */
    public Object mo111519f(@C12579k C38495l lVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object l = this.f90395c.mo83530d(lVar.mo83534g(), cVar);
        return l == C11063b.m42612h() ? l : C11079d2.f28267a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0050 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo111520g(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.util.List<java.lang.String>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.data.repositories.MemoRepository$getActiveMemosIds$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.data.repositories.MemoRepository$getActiveMemosIds$1 r0 = (com.carrefour.fid.android.data.repositories.MemoRepository$getActiveMemosIds$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.MemoRepository$getActiveMemosIds$1 r0 = new com.carrefour.fid.android.data.repositories.MemoRepository$getActiveMemosIds$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 == r4) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0051
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0034:
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0046
        L_0x0038:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.data.repositories.datasource.memos.MemoDataStoreSource r6 = r5.f90395c
            r0.label = r4
            java.lang.Object r6 = r6.mo83529c(r0)
            if (r6 != r1) goto L_0x0046
            return r1
        L_0x0046:
            kotlinx.coroutines.flow.e r6 = (kotlinx.coroutines.flow.C11907e) r6
            r0.label = r3
            java.lang.Object r6 = kotlinx.coroutines.flow.C11909g.m47501w0(r6, r0)
            if (r6 != r1) goto L_0x0051
            return r1
        L_0x0051:
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x00a4
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x0060:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0081
            java.lang.Object r1 = r6.next()
            r2 = r1
            com.carrefour.fid.android.MemoItem r2 = (com.carrefour.fid.android.MemoItem) r2
            java.lang.String r2 = r2.getItemType()
            com.carrefour.fid.android.core.type.a$b r3 = com.carrefour.fid.android.core.type.C36368a.C36370b.f89968c
            java.lang.String r3 = r3.mo108613a()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r3)
            if (r2 == 0) goto L_0x0060
            r0.add(r1)
            goto L_0x0060
        L_0x0081:
            java.util.ArrayList r6 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.C10978t.m41495Y(r0, r1)
            r6.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x0090:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00a8
            java.lang.Object r1 = r0.next()
            com.carrefour.fid.android.MemoItem r1 = (com.carrefour.fid.android.MemoItem) r1
            java.lang.String r1 = r1.getItemId()
            r6.add(r1)
            goto L_0x0090
        L_0x00a4:
            java.util.List r6 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x00a8:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.MemoRepository.mo111520g(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: com.carrefour.fid.android.core.type.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo111521h(@org.jetbrains.annotations.C12579k java.util.List<java.lang.String> r9, @org.jetbrains.annotations.C12580l com.carrefour.fid.android.core.type.C36368a r10, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.Result<kotlin.C11079d2>> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.carrefour.fid.android.data.repositories.MemoRepository$clear$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.carrefour.fid.android.data.repositories.MemoRepository$clear$1 r0 = (com.carrefour.fid.android.data.repositories.MemoRepository$clear$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.MemoRepository$clear$1 r0 = new com.carrefour.fid.android.data.repositories.MemoRepository$clear$1
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0066
            if (r2 == r5) goto L_0x004b
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            kotlin.C11661u0.m45747n(r11)
            goto L_0x00b2
        L_0x0031:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0039:
            java.lang.Object r9 = r0.L$1
            com.carrefour.fid.android.core.type.a r9 = (com.carrefour.fid.android.core.type.C36368a) r9
            java.lang.Object r10 = r0.L$0
            com.carrefour.fid.android.data.repositories.MemoRepository r10 = (com.carrefour.fid.android.data.repositories.MemoRepository) r10
            kotlin.C11661u0.m45747n(r11)
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.mo21858l()
            goto L_0x0099
        L_0x004b:
            java.lang.Object r9 = r0.L$2
            r10 = r9
            com.carrefour.fid.android.core.type.a r10 = (com.carrefour.fid.android.core.type.C36368a) r10
            java.lang.Object r9 = r0.L$1
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.data.repositories.MemoRepository r2 = (com.carrefour.fid.android.data.repositories.MemoRepository) r2
            kotlin.C11661u0.m45747n(r11)
            kotlin.Result r11 = (kotlin.Result) r11
            java.lang.Object r11 = r11.mo21858l()
            r7 = r11
            r11 = r10
            r10 = r2
            r2 = r7
            goto L_0x007b
        L_0x0066:
            kotlin.C11661u0.m45747n(r11)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r10
            r0.label = r5
            java.lang.Object r11 = r8.mo111522j(r0)
            if (r11 != r1) goto L_0x0078
            return r1
        L_0x0078:
            r2 = r11
            r11 = r10
            r10 = r8
        L_0x007b:
            boolean r5 = kotlin.Result.m38710j(r2)
            if (r5 == 0) goto L_0x00c2
            kotlin.Result$a r5 = kotlin.Result.f28060a
            java.lang.String r2 = (java.lang.String) r2
            com.carrefour.fid.android.data.repositories.datasource.memos.MemoRemoteDatasource r5 = r10.f90393a
            r0.L$0 = r10
            r0.L$1 = r11
            r0.L$2 = r6
            r0.label = r4
            java.lang.Object r9 = r5.mo111596g(r2, r9, r0)
            if (r9 != r1) goto L_0x0096
            return r1
        L_0x0096:
            r7 = r11
            r11 = r9
            r9 = r7
        L_0x0099:
            boolean r2 = kotlin.Result.m38710j(r11)
            if (r2 == 0) goto L_0x00b8
            kotlin.Result$a r2 = kotlin.Result.f28060a
            kotlin.d2 r11 = (kotlin.C11079d2) r11
            com.carrefour.fid.android.data.repositories.datasource.memos.MemoDataStoreSource r10 = r10.f90395c
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r9 = r10.mo111579i(r9, r0)
            if (r9 != r1) goto L_0x00b2
            return r1
        L_0x00b2:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            kotlin.Result.m38702b(r9)
            goto L_0x00bb
        L_0x00b8:
            kotlin.Result.m38702b(r11)
        L_0x00bb:
            kotlin.d2 r9 = kotlin.C11079d2.f28267a
            java.lang.Object r9 = kotlin.Result.m38702b(r9)
            goto L_0x00c6
        L_0x00c2:
            java.lang.Object r9 = kotlin.Result.m38702b(r2)
        L_0x00c6:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.MemoRepository.mo111521h(java.util.List, com.carrefour.fid.android.core.type.a, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111522j(kotlin.coroutines.C11045c<? super kotlin.Result<java.lang.String>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.data.repositories.MemoRepository$getMemoListId$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.data.repositories.MemoRepository$getMemoListId$1 r0 = (com.carrefour.fid.android.data.repositories.MemoRepository$getMemoListId$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.MemoRepository$getMemoListId$1 r0 = new com.carrefour.fid.android.data.repositories.MemoRepository$getMemoListId$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r4) goto L_0x0034
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.data.repositories.MemoRepository r0 = (com.carrefour.fid.android.data.repositories.MemoRepository) r0
            kotlin.C11661u0.m45747n(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            java.lang.Object r6 = r6.mo21858l()
            goto L_0x0063
        L_0x0034:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x003c:
            kotlin.C11661u0.m45747n(r6)
            java.lang.String r6 = r5.f90396d
            int r6 = r6.length()
            if (r6 <= 0) goto L_0x0049
            r6 = r4
            goto L_0x004a
        L_0x0049:
            r6 = r3
        L_0x004a:
            if (r6 == 0) goto L_0x0055
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.String r6 = r5.f90396d
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
            goto L_0x00ae
        L_0x0055:
            com.carrefour.fid.android.data.repositories.datasource.memos.MemoRemoteDatasource r6 = r5.f90393a
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.mo111599j(r0)
            if (r6 != r1) goto L_0x0062
            return r1
        L_0x0062:
            r0 = r5
        L_0x0063:
            java.lang.Throwable r1 = kotlin.Result.m38705e(r6)
            if (r1 != 0) goto L_0x00a4
            com.carrefour.fid.android.data.entities.ShoppingListContentResponse r6 = (com.carrefour.fid.android.data.entities.ShoppingListContentResponse) r6
            com.carrefour.fid.android.data.entities.ShoppingListInfoResponse r6 = r6.getShoppingListMetadata()
            java.lang.String r1 = ""
            if (r6 == 0) goto L_0x0079
            java.lang.String r6 = r6.getShoppingListId()
            if (r6 != 0) goto L_0x007a
        L_0x0079:
            r6 = r1
        L_0x007a:
            r0.f90396d = r6
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0083
            r3 = r4
        L_0x0083:
            if (r3 == 0) goto L_0x0097
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.Exception r6 = new java.lang.Exception
            java.lang.String r0 = "Empty list id"
            r6.<init>(r0)
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r6)
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
            goto L_0x00ae
        L_0x0097:
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.String r6 = r0.f90396d
            if (r6 != 0) goto L_0x009e
            goto L_0x009f
        L_0x009e:
            r1 = r6
        L_0x009f:
            java.lang.Object r6 = kotlin.Result.m38702b(r1)
            goto L_0x00ae
        L_0x00a4:
            kotlin.Result$a r6 = kotlin.Result.f28060a
            java.lang.Object r6 = kotlin.C11661u0.m45734a(r1)
            java.lang.Object r6 = kotlin.Result.m38702b(r6)
        L_0x00ae:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.MemoRepository.mo111522j(kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f0 A[LOOP:1: B:39:0x00ea->B:41:0x00f0, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0113 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111523k(com.carrefour.fid.android.data.entities.ShoppingListContentResponse r13, kotlin.coroutines.C11045c<? super java.util.List<com.carrefour.fid.android.presentation.models.C38495l>> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.carrefour.fid.android.data.repositories.MemoRepository$transform$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.carrefour.fid.android.data.repositories.MemoRepository$transform$1 r0 = (com.carrefour.fid.android.data.repositories.MemoRepository$transform$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.MemoRepository$transform$1 r0 = new com.carrefour.fid.android.data.repositories.MemoRepository$transform$1
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 10
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L_0x006d
            if (r2 == r7) goto L_0x0061
            if (r2 == r6) goto L_0x0055
            if (r2 == r5) goto L_0x0045
            if (r2 != r4) goto L_0x003d
            java.lang.Object r13 = r0.L$1
            java.util.Set r13 = (java.util.Set) r13
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.data.entities.ShoppingListContentResponse r0 = (com.carrefour.fid.android.data.entities.ShoppingListContentResponse) r0
            kotlin.C11661u0.m45747n(r14)
            goto L_0x0115
        L_0x003d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0045:
            java.lang.Object r13 = r0.L$2
            java.util.List r13 = (java.util.List) r13
            java.lang.Object r2 = r0.L$1
            com.carrefour.fid.android.data.entities.ShoppingListContentResponse r2 = (com.carrefour.fid.android.data.entities.ShoppingListContentResponse) r2
            java.lang.Object r5 = r0.L$0
            com.carrefour.fid.android.data.repositories.MemoRepository r5 = (com.carrefour.fid.android.data.repositories.MemoRepository) r5
            kotlin.C11661u0.m45747n(r14)
            goto L_0x00a9
        L_0x0055:
            java.lang.Object r13 = r0.L$1
            com.carrefour.fid.android.data.entities.ShoppingListContentResponse r13 = (com.carrefour.fid.android.data.entities.ShoppingListContentResponse) r13
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.data.repositories.MemoRepository r2 = (com.carrefour.fid.android.data.repositories.MemoRepository) r2
            kotlin.C11661u0.m45747n(r14)
            goto L_0x008f
        L_0x0061:
            java.lang.Object r13 = r0.L$1
            com.carrefour.fid.android.data.entities.ShoppingListContentResponse r13 = (com.carrefour.fid.android.data.entities.ShoppingListContentResponse) r13
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.data.repositories.MemoRepository r2 = (com.carrefour.fid.android.data.repositories.MemoRepository) r2
            kotlin.C11661u0.m45747n(r14)
            goto L_0x0080
        L_0x006d:
            kotlin.C11661u0.m45747n(r14)
            com.carrefour.fid.android.data.repositories.datasource.memos.MemoDataStoreSource r14 = r12.f90395c
            r0.L$0 = r12
            r0.L$1 = r13
            r0.label = r7
            java.lang.Object r14 = r14.mo83529c(r0)
            if (r14 != r1) goto L_0x007f
            return r1
        L_0x007f:
            r2 = r12
        L_0x0080:
            kotlinx.coroutines.flow.e r14 = (kotlinx.coroutines.flow.C11907e) r14
            r0.L$0 = r2
            r0.L$1 = r13
            r0.label = r6
            java.lang.Object r14 = kotlinx.coroutines.flow.C11909g.m47501w0(r14, r0)
            if (r14 != r1) goto L_0x008f
            return r1
        L_0x008f:
            java.util.List r14 = (java.util.List) r14
            com.carrefour.fid.android.data.repositories.datasource.memos.MemoLocalDatasource r6 = r2.f90394b
            com.carrefour.fid.android.core.type.a$a r8 = com.carrefour.fid.android.core.type.C36368a.C36369a.f89966c
            r0.L$0 = r2
            r0.L$1 = r13
            r0.L$2 = r14
            r0.label = r5
            java.lang.Object r5 = r6.mo111592f(r8, r0)
            if (r5 != r1) goto L_0x00a4
            return r1
        L_0x00a4:
            r11 = r2
            r2 = r13
            r13 = r14
            r14 = r5
            r5 = r11
        L_0x00a9:
            java.util.Set r14 = (java.util.Set) r14
            if (r13 != 0) goto L_0x00b1
            java.util.List r13 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x00b1:
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r13 = r13.iterator()
        L_0x00bc:
            boolean r8 = r13.hasNext()
            if (r8 == 0) goto L_0x00dd
            java.lang.Object r8 = r13.next()
            r9 = r8
            com.carrefour.fid.android.MemoItem r9 = (com.carrefour.fid.android.MemoItem) r9
            java.lang.String r9 = r9.getItemType()
            com.carrefour.fid.android.core.type.a$a r10 = com.carrefour.fid.android.core.type.C36368a.C36369a.f89966c
            java.lang.String r10 = r10.mo108613a()
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r9 == 0) goto L_0x00bc
            r6.add(r8)
            goto L_0x00bc
        L_0x00dd:
            java.util.ArrayList r13 = new java.util.ArrayList
            int r8 = kotlin.collections.C10978t.m41495Y(r6, r3)
            r13.<init>(r8)
            java.util.Iterator r6 = r6.iterator()
        L_0x00ea:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x00fe
            java.lang.Object r8 = r6.next()
            com.carrefour.fid.android.MemoItem r8 = (com.carrefour.fid.android.MemoItem) r8
            java.lang.String r8 = r8.getItemId()
            r13.add(r8)
            goto L_0x00ea
        L_0x00fe:
            java.util.Set r13 = kotlin.collections.C10933e1.m40911C(r14, r13)
            com.carrefour.fid.android.data.repositories.datasource.memos.MemoLocalDatasource r14 = r5.f90394b
            r0.L$0 = r2
            r0.L$1 = r13
            r5 = 0
            r0.L$2 = r5
            r0.label = r4
            java.lang.Object r14 = com.carrefour.fid.android.data.repositories.datasource.memos.MemoLocalDatasource.m150147d(r14, r5, r0, r7, r5)
            if (r14 != r1) goto L_0x0114
            return r1
        L_0x0114:
            r0 = r2
        L_0x0115:
            java.util.List r14 = r0.getItems()
            if (r14 == 0) goto L_0x018f
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r14 = r14.iterator()
        L_0x0126:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x0143
            java.lang.Object r1 = r14.next()
            r2 = r1
            com.carrefour.fid.android.data.entities.ShoppingListProductResponse r2 = (com.carrefour.fid.android.data.entities.ShoppingListProductResponse) r2
            java.lang.String r2 = r2.getItemType()
            java.lang.String r4 = "MEMO"
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r4)
            if (r2 == 0) goto L_0x0126
            r0.add(r1)
            goto L_0x0126
        L_0x0143:
            java.util.ArrayList r14 = new java.util.ArrayList
            int r1 = kotlin.collections.C10978t.m41495Y(r0, r3)
            r14.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x0150:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0193
            java.lang.Object r1 = r0.next()
            com.carrefour.fid.android.data.entities.ShoppingListProductResponse r1 = (com.carrefour.fid.android.data.entities.ShoppingListProductResponse) r1
            java.lang.String r2 = r1.getItemId()
            boolean r2 = r13.contains(r2)
            if (r2 == 0) goto L_0x0179
            com.carrefour.fid.android.presentation.models.l$a r2 = com.carrefour.fid.android.presentation.models.C38495l.f97623e
            java.lang.String r3 = r1.getItemId()
            java.lang.String r4 = r1.getLabel()
            java.lang.String r1 = r1.getCreationDate()
            com.carrefour.fid.android.presentation.models.l r1 = r2.mo122114a(r3, r4, r1)
            goto L_0x018b
        L_0x0179:
            com.carrefour.fid.android.presentation.models.l$a r2 = com.carrefour.fid.android.presentation.models.C38495l.f97623e
            java.lang.String r3 = r1.getItemId()
            java.lang.String r4 = r1.getLabel()
            java.lang.String r1 = r1.getCreationDate()
            com.carrefour.fid.android.presentation.models.l r1 = r2.mo122115c(r3, r4, r1)
        L_0x018b:
            r14.add(r1)
            goto L_0x0150
        L_0x018f:
            java.util.List r14 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
        L_0x0193:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.MemoRepository.mo111523k(com.carrefour.fid.android.data.entities.ShoppingListContentResponse, kotlin.coroutines.c):java.lang.Object");
    }
}

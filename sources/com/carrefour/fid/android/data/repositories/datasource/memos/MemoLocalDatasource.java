package com.carrefour.fid.android.data.repositories.datasource.memos;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.datastore.AppPreferencesStorage;
import com.carrefour.fid.android.core.type.C36368a;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
public final class MemoLocalDatasource {

    /* renamed from: b */
    public static final int f90466b = 8;
    @C12579k

    /* renamed from: a */
    public final AppPreferencesStorage f90467a;

    @Inject
    public MemoLocalDatasource(@C12579k AppPreferencesStorage appPreferencesStorage) {
        Intrinsics.checkNotNullParameter(appPreferencesStorage, "appPreferencesStorage");
        this.f90467a = appPreferencesStorage;
    }

    /* renamed from: d */
    public static /* synthetic */ Object m150147d(MemoLocalDatasource memoLocalDatasource, C36368a aVar, C11045c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        return memoLocalDatasource.mo111590c(aVar, cVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111589b(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.core.type.C36368a r6, @org.jetbrains.annotations.C12579k java.lang.String r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.lang.Boolean> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.data.repositories.datasource.memos.MemoLocalDatasource$add$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.data.repositories.datasource.memos.MemoLocalDatasource$add$1 r0 = (com.carrefour.fid.android.data.repositories.datasource.memos.MemoLocalDatasource$add$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.datasource.memos.MemoLocalDatasource$add$1 r0 = new com.carrefour.fid.android.data.repositories.datasource.memos.MemoLocalDatasource$add$1
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0049
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r6 = r0.L$0
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0081
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0038:
            java.lang.Object r6 = r0.L$2
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r0.L$1
            com.carrefour.fid.android.core.type.a r6 = (com.carrefour.fid.android.core.type.C36368a) r6
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.data.repositories.datasource.memos.MemoLocalDatasource r2 = (com.carrefour.fid.android.data.repositories.datasource.memos.MemoLocalDatasource) r2
            kotlin.C11661u0.m45747n(r8)
            goto L_0x005c
        L_0x0049:
            kotlin.C11661u0.m45747n(r8)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r4
            java.lang.Object r8 = r5.mo111592f(r6, r0)
            if (r8 != r1) goto L_0x005b
            return r1
        L_0x005b:
            r2 = r5
        L_0x005c:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Set r8 = kotlin.collections.CollectionsKt___CollectionsKt.m40577U5(r8)
            boolean r7 = r8.add(r7)
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r7)
            boolean r4 = r7.booleanValue()
            if (r4 == 0) goto L_0x0082
            r0.L$0 = r7
            r4 = 0
            r0.L$1 = r4
            r0.L$2 = r4
            r0.label = r3
            java.lang.Object r6 = r2.mo111593g(r6, r8, r0)
            if (r6 != r1) goto L_0x0080
            return r1
        L_0x0080:
            r6 = r7
        L_0x0081:
            r7 = r6
        L_0x0082:
            boolean r6 = r7.booleanValue()
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.datasource.memos.MemoLocalDatasource.mo111589b(com.carrefour.fid.android.core.type.a, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0072 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111590c(@org.jetbrains.annotations.C12580l com.carrefour.fid.android.core.type.C36368a r8, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.carrefour.fid.android.data.repositories.datasource.memos.MemoLocalDatasource$clear$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.carrefour.fid.android.data.repositories.datasource.memos.MemoLocalDatasource$clear$1 r0 = (com.carrefour.fid.android.data.repositories.datasource.memos.MemoLocalDatasource$clear$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.datasource.memos.MemoLocalDatasource$clear$1 r0 = new com.carrefour.fid.android.data.repositories.datasource.memos.MemoLocalDatasource$clear$1
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x004a
            if (r2 == r6) goto L_0x0042
            if (r2 == r5) goto L_0x003e
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            kotlin.C11661u0.m45747n(r9)
            goto L_0x009f
        L_0x0032:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003a:
            kotlin.C11661u0.m45747n(r9)
            goto L_0x008d
        L_0x003e:
            kotlin.C11661u0.m45747n(r9)
            goto L_0x0073
        L_0x0042:
            java.lang.Object r8 = r0.L$0
            com.carrefour.fid.android.data.repositories.datasource.memos.MemoLocalDatasource r8 = (com.carrefour.fid.android.data.repositories.datasource.memos.MemoLocalDatasource) r8
            kotlin.C11661u0.m45747n(r9)
            goto L_0x0061
        L_0x004a:
            kotlin.C11661u0.m45747n(r9)
            if (r8 != 0) goto L_0x0076
            com.carrefour.fid.android.core.datastore.AppPreferencesStorage r8 = r7.f90467a
            java.util.Set r9 = kotlin.collections.C10930d1.m40892k()
            r0.L$0 = r7
            r0.label = r6
            java.lang.Object r8 = r8.mo108094q(r9, r0)
            if (r8 != r1) goto L_0x0060
            return r1
        L_0x0060:
            r8 = r7
        L_0x0061:
            com.carrefour.fid.android.core.datastore.AppPreferencesStorage r8 = r8.f90467a
            java.util.Set r9 = kotlin.collections.C10930d1.m40892k()
            r2 = 0
            r0.L$0 = r2
            r0.label = r5
            java.lang.Object r8 = r8.mo108096s(r9, r0)
            if (r8 != r1) goto L_0x0073
            return r1
        L_0x0073:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        L_0x0076:
            com.carrefour.fid.android.core.type.a$a r9 = com.carrefour.fid.android.core.type.C36368a.C36369a.f89966c
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r9)
            if (r8 == 0) goto L_0x0090
            com.carrefour.fid.android.core.datastore.AppPreferencesStorage r8 = r7.f90467a
            java.util.Set r9 = kotlin.collections.C10930d1.m40892k()
            r0.label = r4
            java.lang.Object r8 = r8.mo108094q(r9, r0)
            if (r8 != r1) goto L_0x008d
            return r1
        L_0x008d:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        L_0x0090:
            com.carrefour.fid.android.core.datastore.AppPreferencesStorage r8 = r7.f90467a
            java.util.Set r9 = kotlin.collections.C10930d1.m40892k()
            r0.label = r3
            java.lang.Object r8 = r8.mo108096s(r9, r0)
            if (r8 != r1) goto L_0x009f
            return r1
        L_0x009f:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.datasource.memos.MemoLocalDatasource.mo111590c(com.carrefour.fid.android.core.type.a, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111591e(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.core.type.C36368a r6, @org.jetbrains.annotations.C12579k java.lang.String r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.lang.Boolean> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.data.repositories.datasource.memos.MemoLocalDatasource$delete$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.data.repositories.datasource.memos.MemoLocalDatasource$delete$1 r0 = (com.carrefour.fid.android.data.repositories.datasource.memos.MemoLocalDatasource$delete$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.datasource.memos.MemoLocalDatasource$delete$1 r0 = new com.carrefour.fid.android.data.repositories.datasource.memos.MemoLocalDatasource$delete$1
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0049
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            java.lang.Object r6 = r0.L$0
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0081
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0038:
            java.lang.Object r6 = r0.L$2
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r0.L$1
            com.carrefour.fid.android.core.type.a r6 = (com.carrefour.fid.android.core.type.C36368a) r6
            java.lang.Object r2 = r0.L$0
            com.carrefour.fid.android.data.repositories.datasource.memos.MemoLocalDatasource r2 = (com.carrefour.fid.android.data.repositories.datasource.memos.MemoLocalDatasource) r2
            kotlin.C11661u0.m45747n(r8)
            goto L_0x005c
        L_0x0049:
            kotlin.C11661u0.m45747n(r8)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r4
            java.lang.Object r8 = r5.mo111592f(r6, r0)
            if (r8 != r1) goto L_0x005b
            return r1
        L_0x005b:
            r2 = r5
        L_0x005c:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Set r8 = kotlin.collections.CollectionsKt___CollectionsKt.m40577U5(r8)
            boolean r7 = r8.remove(r7)
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r7)
            boolean r4 = r7.booleanValue()
            if (r4 == 0) goto L_0x0082
            r0.L$0 = r7
            r4 = 0
            r0.L$1 = r4
            r0.L$2 = r4
            r0.label = r3
            java.lang.Object r6 = r2.mo111593g(r6, r8, r0)
            if (r6 != r1) goto L_0x0080
            return r1
        L_0x0080:
            r6 = r7
        L_0x0081:
            r7 = r6
        L_0x0082:
            boolean r6 = r7.booleanValue()
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.datasource.memos.MemoLocalDatasource.mo111591e(com.carrefour.fid.android.core.type.a, java.lang.String, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo111592f(@org.jetbrains.annotations.C12579k com.carrefour.fid.android.core.type.C36368a r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.util.Set<java.lang.String>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.carrefour.fid.android.data.repositories.datasource.memos.MemoLocalDatasource$get$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.carrefour.fid.android.data.repositories.datasource.memos.MemoLocalDatasource$get$1 r0 = (com.carrefour.fid.android.data.repositories.datasource.memos.MemoLocalDatasource$get$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.data.repositories.datasource.memos.MemoLocalDatasource$get$1 r0 = new com.carrefour.fid.android.data.repositories.datasource.memos.MemoLocalDatasource$get$1
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.L$0
            com.carrefour.fid.android.core.type.a r5 = (com.carrefour.fid.android.core.type.C36368a) r5
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0045
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            kotlin.C11661u0.m45747n(r6)
            com.carrefour.fid.android.core.datastore.AppPreferencesStorage r6 = r4.f90467a
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r6.mo108080c(r0)
            if (r6 != r1) goto L_0x0045
            return r1
        L_0x0045:
            com.carrefour.fid.android.core.datastore.a r6 = (com.carrefour.fid.android.core.datastore.C36193a) r6
            com.carrefour.fid.android.core.type.a$a r0 = com.carrefour.fid.android.core.type.C36368a.C36369a.f89966c
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r0)
            if (r5 == 0) goto L_0x0054
            java.util.Set r5 = r6.mo108143v()
            goto L_0x0058
        L_0x0054:
            java.util.Set r5 = r6.mo108144w()
        L_0x0058:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.data.repositories.datasource.memos.MemoLocalDatasource.mo111592f(com.carrefour.fid.android.core.type.a, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: g */
    public final Object mo111593g(C36368a aVar, Set<String> set, C11045c<? super C11079d2> cVar) {
        if (Intrinsics.areEqual((Object) aVar, (Object) C36368a.C36369a.f89966c)) {
            Object q = this.f90467a.mo108094q(set, cVar);
            if (q == C11063b.m42612h()) {
                return q;
            }
            return C11079d2.f28267a;
        }
        Object s = this.f90467a.mo108096s(set, cVar);
        if (s == C11063b.m42612h()) {
            return s;
        }
        return C11079d2.f28267a;
    }
}

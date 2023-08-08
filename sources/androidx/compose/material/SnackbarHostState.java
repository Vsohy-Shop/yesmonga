package androidx.compose.material;

import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8700z0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12072o;
import kotlinx.coroutines.sync.C12139a;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
@C11363r0({"SMAP\nSnackbarHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,373:1\n76#2:374\n102#2,2:375\n107#3,8:377\n116#3:396\n115#3:397\n314#4,11:385\n*S KotlinDebug\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostState\n*L\n72#1:374\n72#1:375,2\n102#1:377,8\n102#1:396\n102#1:397\n104#1:385,11\n*E\n"})
public final class SnackbarHostState {

    /* renamed from: c */
    public static final int f7839c = 0;
    @C12579k

    /* renamed from: a */
    public final C12139a f7840a = MutexKt.m48606b(false, 1, (Object) null);
    @C12579k

    /* renamed from: b */
    public final C8700z0 f7841b = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);

    @C8547h2
    /* renamed from: androidx.compose.material.SnackbarHostState$a */
    public static final class C2996a implements C3052i1 {
        @C12579k

        /* renamed from: a */
        public final String f7842a;
        @C12580l

        /* renamed from: b */
        public final String f7843b;
        @C12579k

        /* renamed from: c */
        public final SnackbarDuration f7844c;
        @C12579k

        /* renamed from: d */
        public final C12072o<SnackbarResult> f7845d;

        public C2996a(@C12579k String str, @C12580l String str2, @C12579k SnackbarDuration snackbarDuration, @C12579k C12072o<? super SnackbarResult> oVar) {
            Intrinsics.checkNotNullParameter(str, "message");
            Intrinsics.checkNotNullParameter(snackbarDuration, "duration");
            Intrinsics.checkNotNullParameter(oVar, "continuation");
            this.f7842a = str;
            this.f7843b = str2;
            this.f7844c = snackbarDuration;
            this.f7845d = oVar;
        }

        @C12580l
        /* renamed from: a */
        public String mo10437a() {
            return this.f7843b;
        }

        /* renamed from: b */
        public void mo10438b() {
            if (this.f7845d.mo24536d()) {
                C12072o<SnackbarResult> oVar = this.f7845d;
                Result.C10852a aVar = Result.f28060a;
                oVar.resumeWith(Result.m38702b(SnackbarResult.ActionPerformed));
            }
        }

        public void dismiss() {
            if (this.f7845d.mo24536d()) {
                C12072o<SnackbarResult> oVar = this.f7845d;
                Result.C10852a aVar = Result.f28060a;
                oVar.resumeWith(Result.m38702b(SnackbarResult.Dismissed));
            }
        }

        @C12579k
        public SnackbarDuration getDuration() {
            return this.f7844c;
        }

        @C12579k
        public String getMessage() {
            return this.f7842a;
        }
    }

    /* renamed from: e */
    public static /* synthetic */ Object m13855e(SnackbarHostState snackbarHostState, String str, String str2, SnackbarDuration snackbarDuration, C11045c cVar, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            snackbarDuration = SnackbarDuration.Short;
        }
        return snackbarHostState.mo10436d(str, str2, snackbarDuration, cVar);
    }

    @C12580l
    /* renamed from: b */
    public final C3052i1 mo10434b() {
        return (C3052i1) this.f7841b.getValue();
    }

    /* renamed from: c */
    public final void mo10435c(C3052i1 i1Var) {
        this.f7841b.setValue(i1Var);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: androidx.compose.material.SnackbarDuration} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b6 A[Catch:{ all -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00bb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:34:0x00c8=Splitter:B:34:0x00c8, B:28:0x00bf=Splitter:B:28:0x00bf} */
    @org.jetbrains.annotations.C12580l
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo10436d(@org.jetbrains.annotations.C12579k java.lang.String r9, @org.jetbrains.annotations.C12580l java.lang.String r10, @org.jetbrains.annotations.C12579k androidx.compose.material.SnackbarDuration r11, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super androidx.compose.material.SnackbarResult> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof androidx.compose.material.SnackbarHostState$showSnackbar$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            androidx.compose.material.SnackbarHostState$showSnackbar$1 r0 = (androidx.compose.material.SnackbarHostState$showSnackbar$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material.SnackbarHostState$showSnackbar$1 r0 = new androidx.compose.material.SnackbarHostState$showSnackbar$1
            r0.<init>(r8, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x006f
            if (r2 == r4) goto L_0x0051
            if (r2 != r3) goto L_0x0049
            java.lang.Object r9 = r0.L$5
            androidx.compose.material.SnackbarHostState$showSnackbar$1 r9 = (androidx.compose.material.SnackbarHostState$showSnackbar$1) r9
            java.lang.Object r9 = r0.L$4
            kotlinx.coroutines.sync.a r9 = (kotlinx.coroutines.sync.C12139a) r9
            java.lang.Object r10 = r0.L$3
            androidx.compose.material.SnackbarDuration r10 = (androidx.compose.material.SnackbarDuration) r10
            java.lang.Object r10 = r0.L$2
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r0.L$1
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r0.L$0
            androidx.compose.material.SnackbarHostState r10 = (androidx.compose.material.SnackbarHostState) r10
            kotlin.C11661u0.m45747n(r12)     // Catch:{ all -> 0x0046 }
            goto L_0x00bf
        L_0x0046:
            r11 = move-exception
            goto L_0x00c8
        L_0x0049:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0051:
            java.lang.Object r9 = r0.L$4
            kotlinx.coroutines.sync.a r9 = (kotlinx.coroutines.sync.C12139a) r9
            java.lang.Object r10 = r0.L$3
            r11 = r10
            androidx.compose.material.SnackbarDuration r11 = (androidx.compose.material.SnackbarDuration) r11
            java.lang.Object r10 = r0.L$2
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r2 = r0.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r6 = r0.L$0
            androidx.compose.material.SnackbarHostState r6 = (androidx.compose.material.SnackbarHostState) r6
            kotlin.C11661u0.m45747n(r12)
            r12 = r9
            r9 = r2
            r2 = r11
            r11 = r10
            r10 = r6
            goto L_0x008a
        L_0x006f:
            kotlin.C11661u0.m45747n(r12)
            kotlinx.coroutines.sync.a r12 = r8.f7840a
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r10
            r0.L$3 = r11
            r0.L$4 = r12
            r0.label = r4
            java.lang.Object r2 = r12.mo24739f(r5, r0)
            if (r2 != r1) goto L_0x0087
            return r1
        L_0x0087:
            r2 = r11
            r11 = r10
            r10 = r8
        L_0x008a:
            r0.L$0 = r10     // Catch:{ all -> 0x00c6 }
            r0.L$1 = r9     // Catch:{ all -> 0x00c6 }
            r0.L$2 = r11     // Catch:{ all -> 0x00c6 }
            r0.L$3 = r2     // Catch:{ all -> 0x00c6 }
            r0.L$4 = r12     // Catch:{ all -> 0x00c6 }
            r0.L$5 = r0     // Catch:{ all -> 0x00c6 }
            r0.label = r3     // Catch:{ all -> 0x00c6 }
            kotlinx.coroutines.p r3 = new kotlinx.coroutines.p     // Catch:{ all -> 0x00c6 }
            kotlin.coroutines.c r6 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.m42608d(r0)     // Catch:{ all -> 0x00c6 }
            r3.<init>(r6, r4)     // Catch:{ all -> 0x00c6 }
            r3.mo24537e0()     // Catch:{ all -> 0x00c6 }
            androidx.compose.material.SnackbarHostState$a r4 = new androidx.compose.material.SnackbarHostState$a     // Catch:{ all -> 0x00c6 }
            r4.<init>(r9, r11, r2, r3)     // Catch:{ all -> 0x00c6 }
            r10.mo10435c(r4)     // Catch:{ all -> 0x00c6 }
            java.lang.Object r9 = r3.mo24572y()     // Catch:{ all -> 0x00c6 }
            java.lang.Object r11 = kotlin.coroutines.intrinsics.C11063b.m42612h()     // Catch:{ all -> 0x00c6 }
            if (r9 != r11) goto L_0x00b9
            kotlin.coroutines.jvm.internal.C11069f.m42638c(r0)     // Catch:{ all -> 0x00c6 }
        L_0x00b9:
            if (r9 != r1) goto L_0x00bc
            return r1
        L_0x00bc:
            r7 = r12
            r12 = r9
            r9 = r7
        L_0x00bf:
            r10.mo10435c(r5)     // Catch:{ all -> 0x00cc }
            r9.mo24740g(r5)
            return r12
        L_0x00c6:
            r11 = move-exception
            r9 = r12
        L_0x00c8:
            r10.mo10435c(r5)     // Catch:{ all -> 0x00cc }
            throw r11     // Catch:{ all -> 0x00cc }
        L_0x00cc:
            r10 = move-exception
            r9.mo24740g(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarHostState.mo10436d(java.lang.String, java.lang.String, androidx.compose.material.SnackbarDuration, kotlin.coroutines.c):java.lang.Object");
    }
}

package androidx.compose.material3;

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
@C11363r0({"SMAP\nSnackbarHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material3/SnackbarHostState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,456:1\n76#2:457\n102#2,2:458\n107#3,8:460\n116#3:479\n115#3:480\n314#4,11:468\n*S KotlinDebug\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material3/SnackbarHostState\n*L\n69#1:457\n69#1:458,2\n125#1:460,8\n125#1:479\n125#1:480\n127#1:468,11\n*E\n"})
public final class SnackbarHostState {

    /* renamed from: c */
    public static final int f19700c = 0;
    @C12579k

    /* renamed from: a */
    public final C12139a f19701a = MutexKt.m48606b(false, 1, (Object) null);
    @C12579k

    /* renamed from: b */
    public final C8700z0 f19702b = C8539f2.m30981g((Object) null, (C8410b2) null, 2, (Object) null);

    /* renamed from: androidx.compose.material3.SnackbarHostState$a */
    public static final class C8107a implements C8269q2 {
        @C12579k

        /* renamed from: a */
        public final C8279s2 f19703a;
        @C12579k

        /* renamed from: b */
        public final C12072o<SnackbarResult> f19704b;

        public C8107a(@C12579k C8279s2 s2Var, @C12579k C12072o<? super SnackbarResult> oVar) {
            Intrinsics.checkNotNullParameter(s2Var, "visuals");
            Intrinsics.checkNotNullParameter(oVar, "continuation");
            this.f19703a = s2Var;
            this.f19704b = oVar;
        }

        @C12579k
        /* renamed from: a */
        public C8279s2 mo11946a() {
            return this.f19703a;
        }

        /* renamed from: b */
        public void mo11947b() {
            if (this.f19704b.mo24536d()) {
                C12072o<SnackbarResult> oVar = this.f19704b;
                Result.C10852a aVar = Result.f28060a;
                oVar.resumeWith(Result.m38702b(SnackbarResult.ActionPerformed));
            }
        }

        public void dismiss() {
            if (this.f19704b.mo24536d()) {
                C12072o<SnackbarResult> oVar = this.f19704b;
                Result.C10852a aVar = Result.f28060a;
                oVar.resumeWith(Result.m38702b(SnackbarResult.Dismissed));
            }
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C8107a.class != obj.getClass()) {
                return false;
            }
            C8107a aVar = (C8107a) obj;
            if (Intrinsics.areEqual((Object) mo11946a(), (Object) aVar.mo11946a()) && Intrinsics.areEqual((Object) this.f19704b, (Object) aVar.f19704b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (mo11946a().hashCode() * 31) + this.f19704b.hashCode();
        }
    }

    /* renamed from: androidx.compose.material3.SnackbarHostState$b */
    public static final class C8108b implements C8279s2 {
        @C12579k

        /* renamed from: a */
        public final String f19705a;
        @C12580l

        /* renamed from: b */
        public final String f19706b;

        /* renamed from: c */
        public final boolean f19707c;
        @C12579k

        /* renamed from: d */
        public final SnackbarDuration f19708d;

        public C8108b(@C12579k String str, @C12580l String str2, boolean z, @C12579k SnackbarDuration snackbarDuration) {
            Intrinsics.checkNotNullParameter(str, "message");
            Intrinsics.checkNotNullParameter(snackbarDuration, "duration");
            this.f19705a = str;
            this.f19706b = str2;
            this.f19707c = z;
            this.f19708d = snackbarDuration;
        }

        @C12580l
        /* renamed from: a */
        public String mo11951a() {
            return this.f19706b;
        }

        /* renamed from: b */
        public boolean mo11952b() {
            return this.f19707c;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C8108b.class != obj.getClass()) {
                return false;
            }
            C8108b bVar = (C8108b) obj;
            if (Intrinsics.areEqual((Object) getMessage(), (Object) bVar.getMessage()) && Intrinsics.areEqual((Object) mo11951a(), (Object) bVar.mo11951a()) && mo11952b() == bVar.mo11952b() && getDuration() == bVar.getDuration()) {
                return true;
            }
            return false;
        }

        @C12579k
        public SnackbarDuration getDuration() {
            return this.f19708d;
        }

        @C12579k
        public String getMessage() {
            return this.f19705a;
        }

        public int hashCode() {
            int i;
            int hashCode = getMessage().hashCode() * 31;
            String a = mo11951a();
            if (a != null) {
                i = a.hashCode();
            } else {
                i = 0;
            }
            return ((((hashCode + i) * 31) + Boolean.hashCode(mo11952b())) * 31) + getDuration().hashCode();
        }
    }

    /* renamed from: f */
    public static /* synthetic */ Object m26278f(SnackbarHostState snackbarHostState, String str, String str2, boolean z, SnackbarDuration snackbarDuration, C11045c cVar, int i, Object obj) {
        SnackbarDuration snackbarDuration2;
        if ((i & 2) != 0) {
            str2 = null;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            if (str3 == null) {
                snackbarDuration2 = SnackbarDuration.Short;
            } else {
                snackbarDuration2 = SnackbarDuration.Indefinite;
            }
            snackbarDuration = snackbarDuration2;
        }
        return snackbarHostState.mo11945e(str, str3, z2, snackbarDuration, cVar);
    }

    @C12580l
    /* renamed from: b */
    public final C8269q2 mo11942b() {
        return (C8269q2) this.f19702b.getValue();
    }

    /* renamed from: c */
    public final void mo11943c(C8269q2 q2Var) {
        this.f19702b.setValue(q2Var);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0097 A[Catch:{ all -> 0x00a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:28:0x00a1=Splitter:B:28:0x00a1, B:34:0x00ad=Splitter:B:34:0x00ad} */
    @org.jetbrains.annotations.C12580l
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo11944d(@org.jetbrains.annotations.C12579k androidx.compose.material3.C8279s2 r9, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super androidx.compose.material3.SnackbarResult> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.compose.material3.SnackbarHostState$showSnackbar$2
            if (r0 == 0) goto L_0x0013
            r0 = r10
            androidx.compose.material3.SnackbarHostState$showSnackbar$2 r0 = (androidx.compose.material3.SnackbarHostState$showSnackbar$2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.material3.SnackbarHostState$showSnackbar$2 r0 = new androidx.compose.material3.SnackbarHostState$showSnackbar$2
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x005a
            if (r2 == r4) goto L_0x0048
            if (r2 != r3) goto L_0x0040
            java.lang.Object r9 = r0.L$3
            androidx.compose.material3.SnackbarHostState$showSnackbar$2 r9 = (androidx.compose.material3.SnackbarHostState$showSnackbar$2) r9
            java.lang.Object r9 = r0.L$2
            kotlinx.coroutines.sync.a r9 = (kotlinx.coroutines.sync.C12139a) r9
            java.lang.Object r1 = r0.L$1
            androidx.compose.material3.s2 r1 = (androidx.compose.material3.C8279s2) r1
            java.lang.Object r0 = r0.L$0
            androidx.compose.material3.SnackbarHostState r0 = (androidx.compose.material3.SnackbarHostState) r0
            kotlin.C11661u0.m45747n(r10)     // Catch:{ all -> 0x003d }
            goto L_0x00a1
        L_0x003d:
            r10 = move-exception
            goto L_0x00ad
        L_0x0040:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0048:
            java.lang.Object r9 = r0.L$2
            kotlinx.coroutines.sync.a r9 = (kotlinx.coroutines.sync.C12139a) r9
            java.lang.Object r2 = r0.L$1
            androidx.compose.material3.s2 r2 = (androidx.compose.material3.C8279s2) r2
            java.lang.Object r6 = r0.L$0
            androidx.compose.material3.SnackbarHostState r6 = (androidx.compose.material3.SnackbarHostState) r6
            kotlin.C11661u0.m45747n(r10)
            r10 = r9
            r9 = r2
            goto L_0x006f
        L_0x005a:
            kotlin.C11661u0.m45747n(r10)
            kotlinx.coroutines.sync.a r10 = r8.f19701a
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r10
            r0.label = r4
            java.lang.Object r2 = r10.mo24739f(r5, r0)
            if (r2 != r1) goto L_0x006e
            return r1
        L_0x006e:
            r6 = r8
        L_0x006f:
            r0.L$0 = r6     // Catch:{ all -> 0x00a8 }
            r0.L$1 = r9     // Catch:{ all -> 0x00a8 }
            r0.L$2 = r10     // Catch:{ all -> 0x00a8 }
            r0.L$3 = r0     // Catch:{ all -> 0x00a8 }
            r0.label = r3     // Catch:{ all -> 0x00a8 }
            kotlinx.coroutines.p r2 = new kotlinx.coroutines.p     // Catch:{ all -> 0x00a8 }
            kotlin.coroutines.c r3 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.m42608d(r0)     // Catch:{ all -> 0x00a8 }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00a8 }
            r2.mo24537e0()     // Catch:{ all -> 0x00a8 }
            androidx.compose.material3.SnackbarHostState$a r3 = new androidx.compose.material3.SnackbarHostState$a     // Catch:{ all -> 0x00a8 }
            r3.<init>(r9, r2)     // Catch:{ all -> 0x00a8 }
            r6.mo11943c(r3)     // Catch:{ all -> 0x00a8 }
            java.lang.Object r9 = r2.mo24572y()     // Catch:{ all -> 0x00a8 }
            java.lang.Object r2 = kotlin.coroutines.intrinsics.C11063b.m42612h()     // Catch:{ all -> 0x00a8 }
            if (r9 != r2) goto L_0x009a
            kotlin.coroutines.jvm.internal.C11069f.m42638c(r0)     // Catch:{ all -> 0x00a8 }
        L_0x009a:
            if (r9 != r1) goto L_0x009d
            return r1
        L_0x009d:
            r0 = r6
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x00a1:
            r0.mo11943c(r5)     // Catch:{ all -> 0x00b1 }
            r9.mo24740g(r5)
            return r10
        L_0x00a8:
            r9 = move-exception
            r0 = r6
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x00ad:
            r0.mo11943c(r5)     // Catch:{ all -> 0x00b1 }
            throw r10     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            r10 = move-exception
            r9.mo24740g(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarHostState.mo11944d(androidx.compose.material3.s2, kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: e */
    public final Object mo11945e(@C12579k String str, @C12580l String str2, boolean z, @C12579k SnackbarDuration snackbarDuration, @C12579k C11045c<? super SnackbarResult> cVar) {
        return mo11944d(new C8108b(str, str2, z, snackbarDuration), cVar);
    }
}

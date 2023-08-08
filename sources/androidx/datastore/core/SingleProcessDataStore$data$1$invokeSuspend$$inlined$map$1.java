package androidx.datastore.core;

import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1 implements C11907e<T> {

    /* renamed from: a */
    public final /* synthetic */ C11907e f47413a;

    public SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1(C11907e eVar) {
        this.f47413a = eVar;
    }

    @C12580l
    public Object collect(@C12579k final C11908f fVar, @C12579k C11045c cVar) {
        Object collect = this.f47413a.collect(new C11908f<C18578j<T>>() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            @org.jetbrains.annotations.C12580l
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object emit(java.lang.Object r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1.C185642.C185651
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$1 r0 = (androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1.C185642.C185651) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$1 r0 = new androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2$1
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    kotlin.C11661u0.m45747n(r6)
                    goto L_0x0053
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    kotlin.C11661u0.m45747n(r6)
                    kotlinx.coroutines.flow.f r6 = r3
                    androidx.datastore.core.j r5 = (androidx.datastore.core.C18578j) r5
                    boolean r2 = r5 instanceof androidx.datastore.core.C18574h
                    if (r2 != 0) goto L_0x0073
                    boolean r2 = r5 instanceof androidx.datastore.core.C18572f
                    if (r2 != 0) goto L_0x006c
                    boolean r2 = r5 instanceof androidx.datastore.core.C18568b
                    if (r2 == 0) goto L_0x0056
                    androidx.datastore.core.b r5 = (androidx.datastore.core.C18568b) r5
                    java.lang.Object r5 = r5.mo53578c()
                    r0.label = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0053
                    return r1
                L_0x0053:
                    kotlin.d2 r5 = kotlin.C11079d2.f28267a
                    return r5
                L_0x0056:
                    boolean r5 = r5 instanceof androidx.datastore.core.C18579k
                    if (r5 == 0) goto L_0x0066
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                    java.lang.String r6 = r6.toString()
                    r5.<init>(r6)
                    throw r5
                L_0x0066:
                    kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                    r5.<init>()
                    throw r5
                L_0x006c:
                    androidx.datastore.core.f r5 = (androidx.datastore.core.C18572f) r5
                    java.lang.Throwable r5 = r5.mo53586a()
                    throw r5
                L_0x0073:
                    androidx.datastore.core.h r5 = (androidx.datastore.core.C18574h) r5
                    java.lang.Throwable r5 = r5.mo53587a()
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1.C185642.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }, cVar);
        if (collect == C11063b.m42612h()) {
            return collect;
        }
        return C11079d2.f28267a;
    }
}

package androidx.navigation.compose;

import androidx.navigation.NavBackStackEntry;
import java.util.List;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.navigation.compose.NavHostKt$NavHost$lambda-4$$inlined$map$1  reason: invalid class name */
public final class NavHostKt$NavHost$lambda4$$inlined$map$1 implements C11907e<List<? extends NavBackStackEntry>> {

    /* renamed from: a */
    public final /* synthetic */ C11907e f50505a;

    public NavHostKt$NavHost$lambda4$$inlined$map$1(C11907e eVar) {
        this.f50505a = eVar;
    }

    @C12580l
    public Object collect(@C12579k final C11908f fVar, @C12579k C11045c cVar) {
        Object collect = this.f50505a.collect(new Object() {
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            @org.jetbrains.annotations.C12580l
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r8, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof androidx.navigation.compose.NavHostKt$NavHost$lambda4$$inlined$map$1.C197042.C197051
                    if (r0 == 0) goto L_0x0013
                    r0 = r9
                    androidx.navigation.compose.NavHostKt$NavHost$lambda-4$$inlined$map$1$2$1 r0 = (androidx.navigation.compose.NavHostKt$NavHost$lambda4$$inlined$map$1.C197042.C197051) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.label = r1
                    goto L_0x0018
                L_0x0013:
                    androidx.navigation.compose.NavHostKt$NavHost$lambda-4$$inlined$map$1$2$1 r0 = new androidx.navigation.compose.NavHostKt$NavHost$lambda-4$$inlined$map$1$2$1
                    r0.<init>(r7, r9)
                L_0x0018:
                    java.lang.Object r9 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    kotlin.C11661u0.m45747n(r9)
                    goto L_0x006d
                L_0x0029:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L_0x0031:
                    kotlin.C11661u0.m45747n(r9)
                    kotlinx.coroutines.flow.f r9 = r3
                    java.util.List r8 = (java.util.List) r8
                    java.lang.Iterable r8 = (java.lang.Iterable) r8
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    java.util.Iterator r8 = r8.iterator()
                L_0x0043:
                    boolean r4 = r8.hasNext()
                    if (r4 == 0) goto L_0x0064
                    java.lang.Object r4 = r8.next()
                    r5 = r4
                    androidx.navigation.NavBackStackEntry r5 = (androidx.navigation.NavBackStackEntry) r5
                    androidx.navigation.NavDestination r5 = r5.mo58065f()
                    java.lang.String r5 = r5.mo58242i0()
                    java.lang.String r6 = "composable"
                    boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r6)
                    if (r5 == 0) goto L_0x0043
                    r2.add(r4)
                    goto L_0x0043
                L_0x0064:
                    r0.label = r3
                    java.lang.Object r8 = r9.emit(r2, r0)
                    if (r8 != r1) goto L_0x006d
                    return r1
                L_0x006d:
                    kotlin.d2 r8 = kotlin.C11079d2.f28267a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt$NavHost$lambda4$$inlined$map$1.C197042.emit(java.lang.Object, kotlin.coroutines.c):java.lang.Object");
            }
        }, cVar);
        if (collect == C11063b.m42612h()) {
            return collect;
        }
        return C11079d2.f28267a;
    }
}

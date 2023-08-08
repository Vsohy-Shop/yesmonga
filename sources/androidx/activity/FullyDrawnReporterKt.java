package androidx.activity;

import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11322b0;

public final class FullyDrawnReporterKt {
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m1236a(@org.jetbrains.annotations.C12579k androidx.activity.C0251r r4, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super kotlin.coroutines.C11045c<? super kotlin.C11079d2>, ? extends java.lang.Object> r5, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r6) {
        /*
            boolean r0 = r6 instanceof androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1 r0 = (androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1 r0 = new androidx.activity.FullyDrawnReporterKt$reportWhenComplete$1
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r4 = r0.L$0
            androidx.activity.r r4 = (androidx.activity.C0251r) r4
            kotlin.C11661u0.m45747n(r6)     // Catch:{ all -> 0x005b }
            goto L_0x004f
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            kotlin.C11661u0.m45747n(r6)
            r4.mo848c()
            boolean r6 = r4.mo850e()
            if (r6 == 0) goto L_0x0044
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            return r4
        L_0x0044:
            r0.L$0 = r4     // Catch:{ all -> 0x005b }
            r0.label = r3     // Catch:{ all -> 0x005b }
            java.lang.Object r5 = r5.invoke(r0)     // Catch:{ all -> 0x005b }
            if (r5 != r1) goto L_0x004f
            return r1
        L_0x004f:
            kotlin.jvm.internal.C11322b0.m43481d(r3)
            r4.mo853h()
            kotlin.jvm.internal.C11322b0.m43480c(r3)
            kotlin.d2 r4 = kotlin.C11079d2.f28267a
            return r4
        L_0x005b:
            r5 = move-exception
            kotlin.jvm.internal.C11322b0.m43481d(r3)
            r4.mo853h()
            kotlin.jvm.internal.C11322b0.m43480c(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.FullyDrawnReporterKt.m1236a(androidx.activity.r, kotlin.jvm.functions.l, kotlin.coroutines.c):java.lang.Object");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public static final Object m1237b(C0251r rVar, C11300l<? super C11045c<? super C11079d2>, ? extends Object> lVar, C11045c<? super C11079d2> cVar) {
        rVar.mo848c();
        if (rVar.mo850e()) {
            return C11079d2.f28267a;
        }
        try {
            lVar.invoke(cVar);
            C11322b0.m43481d(1);
            rVar.mo853h();
            C11322b0.m43480c(1);
            return C11079d2.f28267a;
        } catch (Throwable th) {
            C11322b0.m43481d(1);
            rVar.mo853h();
            C11322b0.m43480c(1);
            throw th;
        }
    }
}

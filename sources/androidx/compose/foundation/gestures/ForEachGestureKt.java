package androidx.compose.foundation.gestures;

import androidx.compose.p004ui.input.pointer.C15465c;
import androidx.compose.p004ui.input.pointer.C15472e0;
import androidx.compose.p004ui.input.pointer.C15507w;
import java.util.List;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nForEachGesture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForEachGesture.kt\nandroidx/compose/foundation/gestures/ForEachGestureKt\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,121:1\n329#2:122\n329#2:141\n101#3,2:123\n33#3,6:125\n103#3:131\n101#3,2:132\n33#3,6:134\n103#3:140\n*S KotlinDebug\n*F\n+ 1 ForEachGesture.kt\nandroidx/compose/foundation/gestures/ForEachGestureKt\n*L\n45#1:122\n100#1:141\n71#1:123,2\n71#1:125,6\n71#1:131\n87#1:132,2\n87#1:134,6\n87#1:140\n*E\n"})
public final class ForEachGestureKt {
    /* renamed from: a */
    public static final boolean m9333a(@C12579k C15465c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        List<C15507w> e = cVar.mo44004j3().mo44110e();
        int size = e.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            } else if (e.get(i).mo44178r()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        return !z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (m9333a(r7) == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
        if (r4 == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006e, code lost:
        return kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006a A[EDGE_INSN: B:27:0x006a->B:23:0x006a ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m9334b(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.input.pointer.C15465c r7, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = (androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3 r0 = new androidx.compose.foundation.gestures.ForEachGestureKt$awaitAllPointersUp$3
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r7 = r0.L$0
            androidx.compose.ui.input.pointer.c r7 = (androidx.compose.p004ui.input.pointer.C15465c) r7
            kotlin.C11661u0.m45747n(r8)
            goto L_0x004b
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            kotlin.C11661u0.m45747n(r8)
            boolean r8 = m9333a(r7)
            if (r8 != 0) goto L_0x006c
        L_0x003e:
            androidx.compose.ui.input.pointer.PointerEventPass r8 = androidx.compose.p004ui.input.pointer.PointerEventPass.Final
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r8 = r7.mo44003i3(r8, r0)
            if (r8 != r1) goto L_0x004b
            return r1
        L_0x004b:
            androidx.compose.ui.input.pointer.o r8 = (androidx.compose.p004ui.input.pointer.C15491o) r8
            java.util.List r8 = r8.mo44110e()
            int r2 = r8.size()
            r4 = 0
            r5 = r4
        L_0x0057:
            if (r5 >= r2) goto L_0x006a
            java.lang.Object r6 = r8.get(r5)
            androidx.compose.ui.input.pointer.w r6 = (androidx.compose.p004ui.input.pointer.C15507w) r6
            boolean r6 = r6.mo44178r()
            if (r6 == 0) goto L_0x0067
            r4 = r3
            goto L_0x006a
        L_0x0067:
            int r5 = r5 + 1
            goto L_0x0057
        L_0x006a:
            if (r4 != 0) goto L_0x003e
        L_0x006c:
            kotlin.d2 r7 = kotlin.C11079d2.f28267a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.m9334b(androidx.compose.ui.input.pointer.c, kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: c */
    public static final Object m9335c(@C12579k C15472e0 e0Var, @C12579k C11045c<? super C11079d2> cVar) {
        Object R0 = e0Var.mo43994R0(new ForEachGestureKt$awaitAllPointersUp$2((C11045c<? super ForEachGestureKt$awaitAllPointersUp$2>) null), cVar);
        return R0 == C11063b.m42612h() ? R0 : C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: d */
    public static final Object m9336d(@C12579k C15472e0 e0Var, @C12579k C11304p<? super C15465c, ? super C11045c<? super C11079d2>, ? extends Object> pVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object R0 = e0Var.mo43994R0(new ForEachGestureKt$awaitEachGesture$2(cVar.getContext(), pVar, (C11045c<? super ForEachGestureKt$awaitEachGesture$2>) null), cVar);
        if (R0 == C11063b.m42612h()) {
            return R0;
        }
        return C11079d2.f28267a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0074 A[SYNTHETIC, Splitter:B:25:0x0074] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0093 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @kotlin.C11395k(message = "Use awaitEachGesture instead. forEachGesture() can drop events between gestures.", replaceWith = @kotlin.C11587t0(expression = "awaitEachGesture(block)", imports = {}))
    @org.jetbrains.annotations.C12580l
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m9337e(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.input.pointer.C15472e0 r8, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.p004ui.input.pointer.C15472e0, ? super kotlin.coroutines.C11045c<? super kotlin.C11079d2>, ? extends java.lang.Object> r9, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super kotlin.C11079d2> r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1 r0 = (androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1 r0 = new androidx.compose.foundation.gestures.ForEachGestureKt$forEachGesture$1
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0067
            if (r2 == r5) goto L_0x0055
            if (r2 == r4) goto L_0x0043
            if (r2 != r3) goto L_0x003b
            java.lang.Object r8 = r0.L$2
            kotlin.coroutines.CoroutineContext r8 = (kotlin.coroutines.CoroutineContext) r8
            java.lang.Object r9 = r0.L$1
            kotlin.jvm.functions.p r9 = (kotlin.jvm.functions.C11304p) r9
            java.lang.Object r2 = r0.L$0
            androidx.compose.ui.input.pointer.e0 r2 = (androidx.compose.p004ui.input.pointer.C15472e0) r2
            kotlin.C11661u0.m45747n(r10)
            goto L_0x0052
        L_0x003b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0043:
            java.lang.Object r8 = r0.L$2
            kotlin.coroutines.CoroutineContext r8 = (kotlin.coroutines.CoroutineContext) r8
            java.lang.Object r9 = r0.L$1
            kotlin.jvm.functions.p r9 = (kotlin.jvm.functions.C11304p) r9
            java.lang.Object r2 = r0.L$0
            androidx.compose.ui.input.pointer.e0 r2 = (androidx.compose.p004ui.input.pointer.C15472e0) r2
            kotlin.C11661u0.m45747n(r10)     // Catch:{ CancellationException -> 0x0065 }
        L_0x0052:
            r10 = r8
            r8 = r2
            goto L_0x006e
        L_0x0055:
            java.lang.Object r8 = r0.L$2
            kotlin.coroutines.CoroutineContext r8 = (kotlin.coroutines.CoroutineContext) r8
            java.lang.Object r9 = r0.L$1
            kotlin.jvm.functions.p r9 = (kotlin.jvm.functions.C11304p) r9
            java.lang.Object r2 = r0.L$0
            androidx.compose.ui.input.pointer.e0 r2 = (androidx.compose.p004ui.input.pointer.C15472e0) r2
            kotlin.C11661u0.m45747n(r10)     // Catch:{ CancellationException -> 0x0065 }
            goto L_0x0085
        L_0x0065:
            r10 = move-exception
            goto L_0x0099
        L_0x0067:
            kotlin.C11661u0.m45747n(r10)
            kotlin.coroutines.CoroutineContext r10 = r0.getContext()
        L_0x006e:
            boolean r2 = kotlinx.coroutines.C11804f2.m46952C(r10)
            if (r2 == 0) goto L_0x00af
            r0.L$0 = r8     // Catch:{ CancellationException -> 0x0094 }
            r0.L$1 = r9     // Catch:{ CancellationException -> 0x0094 }
            r0.L$2 = r10     // Catch:{ CancellationException -> 0x0094 }
            r0.label = r5     // Catch:{ CancellationException -> 0x0094 }
            java.lang.Object r2 = r9.invoke(r8, r0)     // Catch:{ CancellationException -> 0x0094 }
            if (r2 != r1) goto L_0x0083
            return r1
        L_0x0083:
            r2 = r8
            r8 = r10
        L_0x0085:
            r0.L$0 = r2     // Catch:{ CancellationException -> 0x0065 }
            r0.L$1 = r9     // Catch:{ CancellationException -> 0x0065 }
            r0.L$2 = r8     // Catch:{ CancellationException -> 0x0065 }
            r0.label = r4     // Catch:{ CancellationException -> 0x0065 }
            java.lang.Object r10 = m9335c(r2, r0)     // Catch:{ CancellationException -> 0x0065 }
            if (r10 != r1) goto L_0x0052
            return r1
        L_0x0094:
            r2 = move-exception
            r7 = r2
            r2 = r8
            r8 = r10
            r10 = r7
        L_0x0099:
            boolean r6 = kotlinx.coroutines.C11804f2.m46952C(r8)
            if (r6 == 0) goto L_0x00ae
            r0.L$0 = r2
            r0.L$1 = r9
            r0.L$2 = r8
            r0.label = r3
            java.lang.Object r10 = m9335c(r2, r0)
            if (r10 != r1) goto L_0x0052
            return r1
        L_0x00ae:
            throw r10
        L_0x00af:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt.m9337e(androidx.compose.ui.input.pointer.e0, kotlin.jvm.functions.p, kotlin.coroutines.c):java.lang.Object");
    }
}

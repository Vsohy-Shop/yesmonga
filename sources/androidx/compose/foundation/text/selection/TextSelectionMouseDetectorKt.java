package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.p004ui.input.pointer.C15472e0;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nTextSelectionMouseDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextSelectionMouseDetector.kt\nandroidx/compose/foundation/text/selection/TextSelectionMouseDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,134:1\n86#2,2:135\n33#2,6:137\n88#2:143\n*S KotlinDebug\n*F\n+ 1 TextSelectionMouseDetector.kt\nandroidx/compose/foundation/text/selection/TextSelectionMouseDetectorKt\n*L\n128#1:135,2\n128#1:137,6\n128#1:143\n*E\n"})
public final class TextSelectionMouseDetectorKt {

    /* renamed from: a */
    public static final double f7426a = 100.0d;

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
    /* renamed from: b */
    public static final java.lang.Object m12957b(androidx.compose.p004ui.input.pointer.C15465c r10, kotlin.coroutines.C11045c<? super androidx.compose.p004ui.input.pointer.C15491o> r11) {
        /*
            boolean r0 = r11 instanceof androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$awaitMouseEventDown$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$awaitMouseEventDown$1 r0 = (androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$awaitMouseEventDown$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$awaitMouseEventDown$1 r0 = new androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt$awaitMouseEventDown$1
            r0.<init>(r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r10 = r0.L$0
            androidx.compose.ui.input.pointer.c r10 = (androidx.compose.p004ui.input.pointer.C15465c) r10
            kotlin.C11661u0.m45747n(r11)
            goto L_0x0045
        L_0x002d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0035:
            kotlin.C11661u0.m45747n(r11)
        L_0x0038:
            androidx.compose.ui.input.pointer.PointerEventPass r11 = androidx.compose.p004ui.input.pointer.PointerEventPass.Main
            r0.L$0 = r10
            r0.label = r3
            java.lang.Object r11 = r10.mo44003i3(r11, r0)
            if (r11 != r1) goto L_0x0045
            return r1
        L_0x0045:
            androidx.compose.ui.input.pointer.o r11 = (androidx.compose.p004ui.input.pointer.C15491o) r11
            int r2 = r11.mo44109d()
            boolean r2 = androidx.compose.p004ui.input.pointer.C15495r.m68733o(r2)
            if (r2 == 0) goto L_0x0038
            java.util.List r2 = r11.mo44110e()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L_0x005b:
            if (r6 >= r4) goto L_0x0082
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.w r7 = (androidx.compose.p004ui.input.pointer.C15507w) r7
            int r8 = r7.mo44185y()
            androidx.compose.ui.input.pointer.i0$a r9 = androidx.compose.p004ui.input.pointer.C15481i0.f38500b
            int r9 = r9.mo44073b()
            boolean r8 = androidx.compose.p004ui.input.pointer.C15481i0.m68620i(r8, r9)
            if (r8 == 0) goto L_0x007b
            boolean r7 = androidx.compose.p004ui.input.pointer.C15492p.m68682b(r7)
            if (r7 == 0) goto L_0x007b
            r7 = r3
            goto L_0x007c
        L_0x007b:
            r7 = r5
        L_0x007c:
            if (r7 != 0) goto L_0x007f
            goto L_0x0083
        L_0x007f:
            int r6 = r6 + 1
            goto L_0x005b
        L_0x0082:
            r5 = r3
        L_0x0083:
            if (r5 == 0) goto L_0x0038
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextSelectionMouseDetectorKt.m12957b(androidx.compose.ui.input.pointer.c, kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: c */
    public static final Object m12958c(@C12579k C15472e0 e0Var, @C12579k C2826e eVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object d = ForEachGestureKt.m9336d(e0Var, new TextSelectionMouseDetectorKt$mouseSelectionDetector$2(eVar, (C11045c<? super TextSelectionMouseDetectorKt$mouseSelectionDetector$2>) null), cVar);
        return d == C11063b.m42612h() ? d : C11079d2.f28267a;
    }
}

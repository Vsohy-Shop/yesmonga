package androidx.compose.material3;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.input.pointer.C15465c;
import androidx.compose.p004ui.input.pointer.C15481i0;
import androidx.compose.p004ui.input.pointer.C15491o;
import androidx.compose.p004ui.input.pointer.C15492p;
import androidx.compose.p004ui.input.pointer.C15506v;
import androidx.compose.p004ui.input.pointer.C15507w;
import androidx.compose.p004ui.input.pointer.PointerEventPass;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.unit.C16483g;
import java.util.List;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nDragGestureDetectorCopy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetectorCopy.kt\nandroidx/compose/material3/DragGestureDetectorCopyKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,135:1\n74#1,10:136\n84#1,4:155\n88#1,29:166\n116#2,2:146\n33#2,6:148\n118#2:154\n33#2,6:159\n118#2:165\n116#2,2:195\n33#2,6:197\n118#2:203\n116#2,2:204\n33#2,6:206\n118#2:212\n116#2,2:213\n33#2,6:215\n118#2:221\n164#3:222\n154#3:223\n81#4:224\n*S KotlinDebug\n*F\n+ 1 DragGestureDetectorCopy.kt\nandroidx/compose/material3/DragGestureDetectorCopyKt\n*L\n41#1:136,10\n41#1:155,4\n41#1:166,29\n41#1:146,2\n41#1:148,6\n41#1:154\n41#1:159,6\n41#1:165\n83#1:195,2\n83#1:197,6\n83#1:203\n87#1:204,2\n87#1:206,6\n87#1:212\n124#1:213,2\n124#1:215,6\n124#1:221\n126#1:222\n127#1:223\n128#1:224\n*E\n"})
public final class DragGestureDetectorCopyKt {

    /* renamed from: a */
    public static final float f19376a;

    /* renamed from: b */
    public static final float f19377b;

    /* renamed from: c */
    public static final float f19378c;

    static {
        float M = C16483g.m74435M((float) 0.125d);
        f19376a = M;
        float M2 = C16483g.m74435M((float) 18);
        f19377b = M2;
        f19378c = M / M2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m25705a(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.input.pointer.C15465c r19, long r20, int r22, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.p004ui.input.pointer.C15507w, ? super java.lang.Float, kotlin.C11079d2> r23, @org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super androidx.compose.p004ui.input.pointer.C15507w> r24) {
        /*
            r0 = r20
            r2 = r24
            boolean r3 = r2 instanceof androidx.compose.material3.C8014x2966ccbb
            if (r3 == 0) goto L_0x0017
            r3 = r2
            androidx.compose.material3.DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 r3 = (androidx.compose.material3.C8014x2966ccbb) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0017
            int r4 = r4 - r5
            r3.label = r4
            goto L_0x001c
        L_0x0017:
            androidx.compose.material3.DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 r3 = new androidx.compose.material3.DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1
            r3.<init>(r2)
        L_0x001c:
            java.lang.Object r2 = r3.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r5 = r3.label
            r7 = 2
            r8 = 1
            r9 = 0
            if (r5 == 0) goto L_0x0073
            if (r5 == r8) goto L_0x0055
            if (r5 != r7) goto L_0x004d
            float r0 = r3.F$1
            float r1 = r3.F$0
            java.lang.Object r5 = r3.L$3
            androidx.compose.ui.input.pointer.w r5 = (androidx.compose.p004ui.input.pointer.C15507w) r5
            java.lang.Object r10 = r3.L$2
            kotlin.jvm.internal.Ref$LongRef r10 = (kotlin.jvm.internal.Ref.LongRef) r10
            java.lang.Object r11 = r3.L$1
            androidx.compose.ui.input.pointer.c r11 = (androidx.compose.p004ui.input.pointer.C15465c) r11
            java.lang.Object r12 = r3.L$0
            kotlin.jvm.functions.p r12 = (kotlin.jvm.functions.C11304p) r12
            kotlin.C11661u0.m45747n(r2)
            r2 = r0
            r0 = r11
            r11 = r10
            r10 = r4
            r4 = r3
            r3 = r1
            r1 = r12
            goto L_0x015d
        L_0x004d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0055:
            float r0 = r3.F$1
            float r1 = r3.F$0
            java.lang.Object r5 = r3.L$2
            kotlin.jvm.internal.Ref$LongRef r5 = (kotlin.jvm.internal.Ref.LongRef) r5
            java.lang.Object r10 = r3.L$1
            androidx.compose.ui.input.pointer.c r10 = (androidx.compose.p004ui.input.pointer.C15465c) r10
            java.lang.Object r11 = r3.L$0
            kotlin.jvm.functions.p r11 = (kotlin.jvm.functions.C11304p) r11
            kotlin.C11661u0.m45747n(r2)
            r18 = r3
            r3 = r0
            r0 = r10
            r10 = r4
            r4 = r1
            r1 = r11
            r11 = r5
            r5 = r18
            goto L_0x00ba
        L_0x0073:
            kotlin.C11661u0.m45747n(r2)
            androidx.compose.ui.input.pointer.o r2 = r19.mo44004j3()
            boolean r2 = m25707c(r2, r0)
            if (r2 == 0) goto L_0x0082
            goto L_0x0180
        L_0x0082:
            androidx.compose.ui.platform.c4 r2 = r19.getViewConfiguration()
            r5 = r22
            float r2 = m25708d(r2, r5)
            kotlin.jvm.internal.Ref$LongRef r5 = new kotlin.jvm.internal.Ref$LongRef
            r5.<init>()
            r5.element = r0
            r0 = r19
            r1 = r23
            r10 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = 0
        L_0x009c:
            r4.L$0 = r1
            r4.L$1 = r0
            r4.L$2 = r10
            r4.L$3 = r9
            r4.F$0 = r3
            r4.F$1 = r2
            r4.label = r8
            java.lang.Object r11 = androidx.compose.p004ui.input.pointer.C15465c.m68462X0(r0, r9, r4, r8, r9)
            if (r11 != r5) goto L_0x00b1
            return r5
        L_0x00b1:
            r18 = r3
            r3 = r2
            r2 = r11
            r11 = r10
            r10 = r5
            r5 = r4
            r4 = r18
        L_0x00ba:
            androidx.compose.ui.input.pointer.o r2 = (androidx.compose.p004ui.input.pointer.C15491o) r2
            java.util.List r12 = r2.mo44110e()
            int r13 = r12.size()
            r14 = 0
            r15 = r14
        L_0x00c6:
            if (r15 >= r13) goto L_0x00e3
            java.lang.Object r16 = r12.get(r15)
            r17 = r16
            androidx.compose.ui.input.pointer.w r17 = (androidx.compose.p004ui.input.pointer.C15507w) r17
            long r8 = r17.mo44176p()
            long r6 = r11.element
            boolean r6 = androidx.compose.p004ui.input.pointer.C15506v.m68789d(r8, r6)
            if (r6 == 0) goto L_0x00dd
            goto L_0x00e5
        L_0x00dd:
            int r15 = r15 + 1
            r7 = 2
            r8 = 1
            r9 = 0
            goto L_0x00c6
        L_0x00e3:
            r16 = 0
        L_0x00e5:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r16)
            r6 = r16
            androidx.compose.ui.input.pointer.w r6 = (androidx.compose.p004ui.input.pointer.C15507w) r6
            boolean r7 = r6.mo44167A()
            if (r7 == 0) goto L_0x00f4
            goto L_0x0163
        L_0x00f4:
            boolean r7 = androidx.compose.p004ui.input.pointer.C15492p.m68685e(r6)
            if (r7 == 0) goto L_0x0128
            java.util.List r2 = r2.mo44110e()
            int r6 = r2.size()
        L_0x0102:
            if (r14 >= r6) goto L_0x0115
            java.lang.Object r7 = r2.get(r14)
            r8 = r7
            androidx.compose.ui.input.pointer.w r8 = (androidx.compose.p004ui.input.pointer.C15507w) r8
            boolean r8 = r8.mo44178r()
            if (r8 == 0) goto L_0x0112
            goto L_0x0116
        L_0x0112:
            int r14 = r14 + 1
            goto L_0x0102
        L_0x0115:
            r7 = 0
        L_0x0116:
            androidx.compose.ui.input.pointer.w r7 = (androidx.compose.p004ui.input.pointer.C15507w) r7
            if (r7 != 0) goto L_0x011b
            goto L_0x0163
        L_0x011b:
            long r6 = r7.mo44176p()
            r11.element = r6
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r10
            r10 = r11
            r7 = 2
            goto L_0x0167
        L_0x0128:
            long r7 = r6.mo44177q()
            long r12 = r6.mo44181u()
            float r2 = androidx.compose.p004ui.geometry.C15094f.m64880p(r7)
            float r7 = androidx.compose.p004ui.geometry.C15094f.m64880p(r12)
            float r2 = r2 - r7
            float r2 = r2 + r3
            float r3 = java.lang.Math.abs(r2)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x016b
            androidx.compose.ui.input.pointer.PointerEventPass r3 = androidx.compose.p004ui.input.pointer.PointerEventPass.Final
            r5.L$0 = r1
            r5.L$1 = r0
            r5.L$2 = r11
            r5.L$3 = r6
            r5.F$0 = r4
            r5.F$1 = r2
            r7 = 2
            r5.label = r7
            java.lang.Object r3 = r0.mo44003i3(r3, r5)
            if (r3 != r10) goto L_0x015a
            return r10
        L_0x015a:
            r3 = r4
            r4 = r5
            r5 = r6
        L_0x015d:
            boolean r5 = r5.mo44167A()
            if (r5 == 0) goto L_0x0165
        L_0x0163:
            r9 = 0
            goto L_0x0180
        L_0x0165:
            r5 = r10
            r10 = r11
        L_0x0167:
            r8 = 1
            r9 = 0
            goto L_0x009c
        L_0x016b:
            r7 = 2
            float r3 = java.lang.Math.signum(r2)
            float r3 = r3 * r4
            float r2 = r2 - r3
            java.lang.Float r2 = kotlin.coroutines.jvm.internal.C11064a.m42619e(r2)
            r1.invoke(r6, r2)
            boolean r2 = r6.mo44167A()
            if (r2 == 0) goto L_0x0181
            r9 = r6
        L_0x0180:
            return r9
        L_0x0181:
            r3 = r4
            r4 = r5
            r5 = r10
            r10 = r11
            r2 = 0
            goto L_0x0167
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DragGestureDetectorCopyKt.m25705a(androidx.compose.ui.input.pointer.c, long, int, kotlin.jvm.functions.p, kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: b */
    public static final Object m25706b(C15465c cVar, long j, int i, C11304p<? super C15507w, ? super Float, C11079d2> pVar, C11300l<? super C15094f, Float> lVar, C11045c<? super C15507w> cVar2) {
        float f;
        C15507w wVar;
        C15507w wVar2;
        C15465c cVar3 = cVar;
        long j2 = j;
        C11300l<? super C15094f, Float> lVar2 = lVar;
        C11045c<? super C15507w> cVar4 = cVar2;
        if (m25707c(cVar.mo44004j3(), j2)) {
            return null;
        }
        float d = m25708d(cVar.getViewConfiguration(), i);
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = j2;
        float f2 = 0.0f;
        while (true) {
            C11322b0.m43482e(0);
            Object X0 = C15465c.m68462X0(cVar3, (PointerEventPass) null, cVar4, 1, (Object) null);
            C11322b0.m43482e(1);
            C15491o oVar = (C15491o) X0;
            List<C15507w> e = oVar.mo44110e();
            int size = e.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    f = f2;
                    wVar = null;
                    break;
                }
                wVar = e.get(i2);
                f = f2;
                if (Boolean.valueOf(C15506v.m68789d(wVar.mo44176p(), longRef.element)).booleanValue()) {
                    break;
                }
                i2++;
                f2 = f;
            }
            Intrinsics.checkNotNull(wVar);
            C15507w wVar3 = wVar;
            if (wVar3.mo44167A()) {
                return null;
            }
            if (C15492p.m68685e(wVar3)) {
                List<C15507w> e2 = oVar.mo44110e();
                int size2 = e2.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        wVar2 = null;
                        break;
                    }
                    wVar2 = e2.get(i3);
                    if (Boolean.valueOf(wVar2.mo44178r()).booleanValue()) {
                        break;
                    }
                    i3++;
                }
                C15507w wVar4 = wVar2;
                if (wVar4 == null) {
                    return null;
                }
                longRef.element = wVar4.mo44176p();
            } else {
                float floatValue = f + (lVar2.invoke(C15094f.m64868d(wVar3.mo44177q())).floatValue() - lVar2.invoke(C15094f.m64868d(wVar3.mo44181u())).floatValue());
                if (Math.abs(floatValue) < d) {
                    PointerEventPass pointerEventPass = PointerEventPass.Final;
                    C11322b0.m43482e(0);
                    cVar3.mo44003i3(pointerEventPass, cVar4);
                    C11322b0.m43482e(1);
                    if (wVar3.mo44167A()) {
                        return null;
                    }
                    f = floatValue;
                } else {
                    pVar.invoke(wVar3, Float.valueOf(floatValue - (Math.signum(floatValue) * d)));
                    if (wVar3.mo44167A()) {
                        return wVar3;
                    }
                    f = 0.0f;
                    f2 = f;
                }
            }
            C11304p<? super C15507w, ? super Float, C11079d2> pVar2 = pVar;
            f2 = f;
        }
    }

    /* renamed from: c */
    public static final boolean m25707c(C15491o oVar, long j) {
        C15507w wVar;
        List<C15507w> e = oVar.mo44110e();
        int size = e.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                wVar = null;
                break;
            }
            wVar = e.get(i);
            if (C15506v.m68789d(wVar.mo44176p(), j)) {
                break;
            }
            i++;
        }
        C15507w wVar2 = wVar;
        if (wVar2 != null && wVar2.mo44178r()) {
            z = true;
        }
        return true ^ z;
    }

    /* renamed from: d */
    public static final float m25708d(@C12579k C15863c4 c4Var, int i) {
        Intrinsics.checkNotNullParameter(c4Var, "$this$pointerSlop");
        if (C15481i0.m68620i(i, C15481i0.f38500b.mo44073b())) {
            return c4Var.mo44722f() * f19378c;
        }
        return c4Var.mo44722f();
    }
}

package androidx.compose.material;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nCheckbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material/CheckboxDefaults\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,485:1\n83#2,3:486\n1114#3,6:489\n*S KotlinDebug\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material/CheckboxDefaults\n*L\n234#1:486,3\n234#1:489,6\n*E\n"})
/* renamed from: androidx.compose.material.n */
public final class C7883n {
    @C12579k

    /* renamed from: a */
    public static final C7883n f18883a = new C7883n();

    /* renamed from: b */
    public static final int f18884b = 0;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: androidx.compose.material.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: androidx.compose.material.t} */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f9, code lost:
        if (r1 == androidx.compose.runtime.C8592o.f23032a.mo16277a()) goto L_0x00fb;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @org.jetbrains.annotations.C12579k
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.material.C7880m mo10888a(long r31, long r33, long r35, long r37, long r39, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r41, int r42, int r43) {
        /*
            r30 = this;
            r0 = r41
            r1 = 469524104(0x1bfc5e88, float:4.1750992E-22)
            r0.mo14918M(r1)
            r2 = r43 & 1
            r3 = 6
            if (r2 == 0) goto L_0x001a
            androidx.compose.material.t0 r2 = androidx.compose.material.C7933t0.f19075a
            androidx.compose.material.q r2 = r2.mo11075a(r0, r3)
            long r4 = r2.mo10973l()
            r21 = r4
            goto L_0x001c
        L_0x001a:
            r21 = r31
        L_0x001c:
            r2 = r43 & 2
            if (r2 == 0) goto L_0x003a
            androidx.compose.material.t0 r2 = androidx.compose.material.C7933t0.f19075a
            androidx.compose.material.q r2 = r2.mo11075a(r0, r3)
            long r4 = r2.mo10970i()
            r6 = 1058642330(0x3f19999a, float:0.6)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 14
            r11 = 0
            long r4 = androidx.compose.p004ui.graphics.C15240j2.m66080w(r4, r6, r7, r8, r9, r10, r11)
            r23 = r4
            goto L_0x003c
        L_0x003a:
            r23 = r33
        L_0x003c:
            r2 = r43 & 4
            if (r2 == 0) goto L_0x004c
            androidx.compose.material.t0 r2 = androidx.compose.material.C7933t0.f19075a
            androidx.compose.material.q r2 = r2.mo11075a(r0, r3)
            long r4 = r2.mo10975n()
            r7 = r4
            goto L_0x004e
        L_0x004c:
            r7 = r35
        L_0x004e:
            r2 = r43 & 8
            if (r2 == 0) goto L_0x007d
            androidx.compose.material.t0 r2 = androidx.compose.material.C7933t0.f19075a
            androidx.compose.material.q r2 = r2.mo11075a(r0, r3)
            long r4 = r2.mo10970i()
            androidx.compose.material.r r2 = androidx.compose.material.C7904r.f18969a
            float r2 = r2.mo10991b(r0, r3)
            r6 = 0
            r9 = 0
            r10 = 0
            r11 = 14
            r12 = 0
            r31 = r4
            r33 = r2
            r34 = r6
            r35 = r9
            r36 = r10
            r37 = r11
            r38 = r12
            long r4 = androidx.compose.p004ui.graphics.C15240j2.m66080w(r31, r33, r34, r35, r36, r37, r38)
            r25 = r4
            goto L_0x007f
        L_0x007d:
            r25 = r37
        L_0x007f:
            r2 = r43 & 16
            if (r2 == 0) goto L_0x00a4
            androidx.compose.material.r r2 = androidx.compose.material.C7904r.f18969a
            float r2 = r2.mo10991b(r0, r3)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 14
            r9 = 0
            r31 = r21
            r33 = r2
            r34 = r3
            r35 = r4
            r36 = r5
            r37 = r6
            r38 = r9
            long r2 = androidx.compose.p004ui.graphics.C15240j2.m66080w(r31, r33, r34, r35, r36, r37, r38)
            r27 = r2
            goto L_0x00a6
        L_0x00a4:
            r27 = r39
        L_0x00a6:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x00b4
            r2 = -1
            java.lang.String r3 = "androidx.compose.material.CheckboxDefaults.colors (Checkbox.kt:226)"
            r4 = r42
            androidx.compose.runtime.ComposerKt.m29845w0(r1, r4, r2, r3)
        L_0x00b4:
            r1 = 5
            java.lang.Object[] r2 = new java.lang.Object[r1]
            androidx.compose.ui.graphics.j2 r3 = androidx.compose.p004ui.graphics.C15240j2.m66071n(r21)
            r4 = 0
            r2[r4] = r3
            androidx.compose.ui.graphics.j2 r3 = androidx.compose.p004ui.graphics.C15240j2.m66071n(r23)
            r5 = 1
            r2[r5] = r3
            androidx.compose.ui.graphics.j2 r3 = androidx.compose.p004ui.graphics.C15240j2.m66071n(r7)
            r5 = 2
            r2[r5] = r3
            r3 = 3
            androidx.compose.ui.graphics.j2 r5 = androidx.compose.p004ui.graphics.C15240j2.m66071n(r25)
            r2[r3] = r5
            androidx.compose.ui.graphics.j2 r3 = androidx.compose.p004ui.graphics.C15240j2.m66071n(r27)
            r5 = 4
            r2[r5] = r3
            r3 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r0.mo14918M(r3)
            r3 = r4
        L_0x00e1:
            if (r4 >= r1) goto L_0x00ed
            r5 = r2[r4]
            boolean r5 = r0.mo15006n0(r5)
            r3 = r3 | r5
            int r4 = r4 + 1
            goto L_0x00e1
        L_0x00ed:
            java.lang.Object r1 = r41.mo14921N()
            if (r3 != 0) goto L_0x00fb
            androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r2.mo16277a()
            if (r1 != r2) goto L_0x0131
        L_0x00fb:
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 14
            r6 = 0
            r31 = r7
            r33 = r1
            r34 = r2
            r35 = r3
            r36 = r4
            r37 = r5
            r38 = r6
            long r9 = androidx.compose.p004ui.graphics.C15240j2.m66080w(r31, r33, r34, r35, r36, r37, r38)
            r31 = r21
            long r13 = androidx.compose.p004ui.graphics.C15240j2.m66080w(r31, r33, r34, r35, r36, r37, r38)
            r31 = r25
            long r17 = androidx.compose.p004ui.graphics.C15240j2.m66080w(r31, r33, r34, r35, r36, r37, r38)
            androidx.compose.material.t r1 = new androidx.compose.material.t
            r6 = r1
            r29 = 0
            r11 = r21
            r15 = r25
            r19 = r27
            r6.<init>(r7, r9, r11, r13, r15, r17, r19, r21, r23, r25, r27, r29)
            r0.mo14893C(r1)
        L_0x0131:
            r41.mo15002m0()
            androidx.compose.material.t r1 = (androidx.compose.material.C7931t) r1
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x013f
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x013f:
            r41.mo15002m0()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.C7883n.mo10888a(long, long, long, long, long, androidx.compose.runtime.o, int, int):androidx.compose.material.m");
    }
}

package androidx.compose.material;

import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15258l2;
import kotlin.jvm.internal.C11363r0;

@C11363r0({"SMAP\nMaterialTextSelectionColors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialTextSelectionColors.kt\nandroidx/compose/material/MaterialTextSelectionColorsKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,242:1\n658#2:243\n646#2:244\n76#3:245\n67#4,3:246\n66#4:249\n1114#5,6:250\n*S KotlinDebug\n*F\n+ 1 MaterialTextSelectionColors.kt\nandroidx/compose/material/MaterialTextSelectionColorsKt\n*L\n43#1:243\n43#1:244\n44#1:245\n48#1:246,3\n48#1:249\n48#1:250,6\n*E\n"})
/* renamed from: androidx.compose.material.s0 */
public final class C7929s0 {

    /* renamed from: a */
    public static final float f19061a = 0.4f;

    /* renamed from: b */
    public static final float f19062b = 0.2f;

    /* renamed from: c */
    public static final float f19063c = 4.5f;

    /* renamed from: a */
    public static final float m25296a(long j, long j2, long j3) {
        float f = 0.2f;
        float f2 = 0.4f;
        float f3 = 0.4f;
        for (int i = 0; i < 7; i++) {
            float c = (m25298c(j, f2, j2, j3) / 4.5f) - 1.0f;
            if (0.0f <= c && c <= 0.01f) {
                break;
            }
            if (c < 0.0f) {
                f3 = f2;
            } else {
                f = f2;
            }
            f2 = (f3 + f) / 2.0f;
        }
        return f2;
    }

    /* renamed from: b */
    public static final float m25297b(long j, long j2) {
        float o = C15258l2.m66190o(j) + 0.05f;
        float o2 = C15258l2.m66190o(j2) + 0.05f;
        return Math.max(o, o2) / Math.min(o, o2);
    }

    /* renamed from: c */
    public static final float m25298c(long j, float f, long j2, long j3) {
        long h = C15258l2.m66183h(C15240j2.m66080w(j, f, 0.0f, 0.0f, 0.0f, 14, (Object) null), j3);
        return m25297b(C15258l2.m66183h(j2, h), h);
    }

    /* renamed from: d */
    public static final long m25299d(long j, long j2, long j3) {
        float a;
        float c = m25298c(j, 0.4f, j2, j3);
        float c2 = m25298c(j, 0.2f, j2, j3);
        if (c >= 4.5f) {
            a = 0.4f;
        } else if (c2 < 4.5f) {
            a = 0.2f;
        } else {
            a = m25296a(j, j2, j3);
        }
        return C15240j2.m66080w(j, a, 0.0f, 0.0f, 0.0f, 14, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: androidx.compose.foundation.text.selection.t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: androidx.compose.foundation.text.selection.t} */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0090, code lost:
        if (r3 == androidx.compose.runtime.C8592o.f23032a.mo16277a()) goto L_0x0092;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @org.jetbrains.annotations.C12579k
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.foundation.text.selection.C2844t m25300e(@org.jetbrains.annotations.C12579k androidx.compose.material.C7901q r19, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r20, int r21) {
        /*
            r0 = r19
            r1 = r20
            java.lang.String r2 = "colors"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            r2 = -721696685(0xffffffffd4fbc853, float:-8.6511814E12)
            r1.mo14918M(r2)
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x001d
            r3 = -1
            java.lang.String r4 = "androidx.compose.material.rememberTextSelectionColors (MaterialTextSelectionColors.kt:35)"
            r5 = r21
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r5, r3, r4)
        L_0x001d:
            long r5 = r19.mo10971j()
            long r9 = r19.mo10964c()
            r2 = 35572910(0x21eccae, float:1.1666747E-37)
            r1.mo14918M(r2)
            long r2 = androidx.compose.material.ColorsKt.m13380a(r0, r9)
            androidx.compose.ui.graphics.j2$a r4 = androidx.compose.p004ui.graphics.C15240j2.f37547b
            long r7 = r4.mo42851u()
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x003b
            r4 = 1
            goto L_0x003c
        L_0x003b:
            r4 = 0
        L_0x003c:
            if (r4 == 0) goto L_0x003f
            goto L_0x004d
        L_0x003f:
            androidx.compose.runtime.i1 r2 = androidx.compose.material.ContentColorKt.m13406a()
            java.lang.Object r2 = r1.mo15032w(r2)
            androidx.compose.ui.graphics.j2 r2 = (androidx.compose.p004ui.graphics.C15240j2) r2
            long r2 = r2.mo42833M()
        L_0x004d:
            r11 = r2
            r20.mo15002m0()
            androidx.compose.material.r r2 = androidx.compose.material.C7904r.f18969a
            r3 = 6
            float r13 = r2.mo10993d(r1, r3)
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 14
            r18 = 0
            long r7 = androidx.compose.p004ui.graphics.C15240j2.m66080w(r11, r13, r14, r15, r16, r17, r18)
            androidx.compose.ui.graphics.j2 r2 = androidx.compose.p004ui.graphics.C15240j2.m66071n(r5)
            androidx.compose.ui.graphics.j2 r3 = androidx.compose.p004ui.graphics.C15240j2.m66071n(r9)
            androidx.compose.ui.graphics.j2 r4 = androidx.compose.p004ui.graphics.C15240j2.m66071n(r7)
            r11 = 1618982084(0x607fb4c4, float:7.370227E19)
            r1.mo14918M(r11)
            boolean r2 = r1.mo15006n0(r2)
            boolean r3 = r1.mo15006n0(r3)
            r2 = r2 | r3
            boolean r3 = r1.mo15006n0(r4)
            r2 = r2 | r3
            java.lang.Object r3 = r20.mo14921N()
            if (r2 != 0) goto L_0x0092
            androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r2.mo16277a()
            if (r3 != r2) goto L_0x00a5
        L_0x0092:
            androidx.compose.foundation.text.selection.t r3 = new androidx.compose.foundation.text.selection.t
            long r12 = r19.mo10971j()
            long r14 = m25299d(r5, r7, r9)
            r16 = 0
            r11 = r3
            r11.<init>(r12, r14, r16)
            r1.mo14893C(r3)
        L_0x00a5:
            r20.mo15002m0()
            androidx.compose.foundation.text.selection.t r3 = (androidx.compose.foundation.text.selection.C2844t) r3
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00b3
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00b3:
            r20.mo15002m0()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.C7929s0.m25300e(androidx.compose.material.q, androidx.compose.runtime.o, int):androidx.compose.foundation.text.selection.t");
    }
}

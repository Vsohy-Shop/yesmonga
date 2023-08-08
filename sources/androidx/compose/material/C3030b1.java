package androidx.compose.material;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nRadioButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonDefaults\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,233:1\n67#2,3:234\n66#2:237\n1114#3,6:238\n*S KotlinDebug\n*F\n+ 1 RadioButton.kt\nandroidx/compose/material/RadioButtonDefaults\n*L\n168#1:234,3\n168#1:237\n168#1:238,6\n*E\n"})
/* renamed from: androidx.compose.material.b1 */
public final class C3030b1 {
    @C12579k

    /* renamed from: a */
    public static final C3030b1 f8083a = new C3030b1();

    /* renamed from: b */
    public static final int f8084b = 0;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: androidx.compose.material.w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: androidx.compose.material.w} */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0099, code lost:
        if (r2 == androidx.compose.runtime.C8592o.f23032a.mo16277a()) goto L_0x009b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @org.jetbrains.annotations.C12579k
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.material.C3027a1 mo10719a(long r20, long r22, long r24, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r26, int r27, int r28) {
        /*
            r19 = this;
            r0 = r26
            r1 = 1370708026(0x51b3583a, float:9.6284918E10)
            r0.mo14918M(r1)
            r2 = r28 & 1
            r3 = 6
            if (r2 == 0) goto L_0x0019
            androidx.compose.material.t0 r2 = androidx.compose.material.C7933t0.f19075a
            androidx.compose.material.q r2 = r2.mo11075a(r0, r3)
            long r4 = r2.mo10973l()
            r7 = r4
            goto L_0x001b
        L_0x0019:
            r7 = r20
        L_0x001b:
            r2 = r28 & 2
            if (r2 == 0) goto L_0x0039
            androidx.compose.material.t0 r2 = androidx.compose.material.C7933t0.f19075a
            androidx.compose.material.q r2 = r2.mo11075a(r0, r3)
            long r9 = r2.mo10970i()
            r11 = 1058642330(0x3f19999a, float:0.6)
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 14
            r16 = 0
            long r4 = androidx.compose.p004ui.graphics.C15240j2.m66080w(r9, r11, r12, r13, r14, r15, r16)
            r9 = r4
            goto L_0x003b
        L_0x0039:
            r9 = r22
        L_0x003b:
            r2 = r28 & 4
            if (r2 == 0) goto L_0x005d
            androidx.compose.material.t0 r2 = androidx.compose.material.C7933t0.f19075a
            androidx.compose.material.q r2 = r2.mo11075a(r0, r3)
            long r11 = r2.mo10970i()
            androidx.compose.material.r r2 = androidx.compose.material.C7904r.f18969a
            float r13 = r2.mo10991b(r0, r3)
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 14
            r18 = 0
            long r2 = androidx.compose.p004ui.graphics.C15240j2.m66080w(r11, r13, r14, r15, r16, r17, r18)
            r11 = r2
            goto L_0x005f
        L_0x005d:
            r11 = r24
        L_0x005f:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x006d
            r2 = -1
            java.lang.String r3 = "androidx.compose.material.RadioButtonDefaults.colors (RadioButton.kt:162)"
            r4 = r27
            androidx.compose.runtime.ComposerKt.m29845w0(r1, r4, r2, r3)
        L_0x006d:
            androidx.compose.ui.graphics.j2 r1 = androidx.compose.p004ui.graphics.C15240j2.m66071n(r7)
            androidx.compose.ui.graphics.j2 r2 = androidx.compose.p004ui.graphics.C15240j2.m66071n(r9)
            androidx.compose.ui.graphics.j2 r3 = androidx.compose.p004ui.graphics.C15240j2.m66071n(r11)
            r4 = 1618982084(0x607fb4c4, float:7.370227E19)
            r0.mo14918M(r4)
            boolean r1 = r0.mo15006n0(r1)
            boolean r2 = r0.mo15006n0(r2)
            r1 = r1 | r2
            boolean r2 = r0.mo15006n0(r3)
            r1 = r1 | r2
            java.lang.Object r2 = r26.mo14921N()
            if (r1 != 0) goto L_0x009b
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            if (r2 != r1) goto L_0x00a5
        L_0x009b:
            androidx.compose.material.w r2 = new androidx.compose.material.w
            r13 = 0
            r6 = r2
            r6.<init>(r7, r9, r11, r13)
            r0.mo14893C(r2)
        L_0x00a5:
            r26.mo15002m0()
            androidx.compose.material.w r2 = (androidx.compose.material.C7942w) r2
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x00b3
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00b3:
            r26.mo15002m0()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.C3030b1.mo10719a(long, long, long, androidx.compose.runtime.o, int, int):androidx.compose.material.a1");
    }
}

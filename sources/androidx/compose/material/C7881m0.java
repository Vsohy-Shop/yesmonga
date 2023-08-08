package androidx.compose.material;

import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/FloatingActionButtonDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,336:1\n154#2:337\n154#2:338\n154#2:339\n154#2:340\n154#2:341\n154#2:342\n154#2:343\n154#2:344\n83#3,3:345\n1114#4,6:348\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/FloatingActionButtonDefaults\n*L\n221#1:337\n222#1:338\n226#1:339\n227#1:340\n246#1:341\n247#1:342\n248#1:343\n249#1:344\n251#1:345,3\n251#1:348,6\n*E\n"})
/* renamed from: androidx.compose.material.m0 */
public final class C7881m0 {
    @C12579k

    /* renamed from: a */
    public static final C7881m0 f18877a = new C7881m0();

    /* renamed from: b */
    public static final int f18878b = 0;

    @C8540g
    @C11395k(level = DeprecationLevel.f28051c, message = "Use another overload of elevation")
    /* renamed from: a */
    public final /* synthetic */ C7884n0 mo10880a(float f, float f2, C8592o oVar, int i, int i2) {
        float f3;
        float f4;
        int i3 = i;
        C8592o oVar2 = oVar;
        oVar.mo14918M(-654132828);
        if ((i2 & 1) != 0) {
            f3 = C16483g.m74435M((float) 6);
        } else {
            f3 = f;
        }
        if ((i2 & 2) != 0) {
            f4 = C16483g.m74435M((float) 12);
        } else {
            f4 = f2;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-654132828, i, -1, "androidx.compose.material.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:219)");
        }
        float f5 = (float) 8;
        C7884n0 b = mo10881b(f3, f4, C16483g.m74435M(f5), C16483g.m74435M(f5), oVar, (i3 & 14) | 3456 | (i3 & 112) | ((i3 << 6) & 57344), 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: androidx.compose.material.DefaultFloatingActionButtonElevation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: androidx.compose.material.DefaultFloatingActionButtonElevation} */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007d, code lost:
        if (r8 == androidx.compose.runtime.C8592o.f23032a.mo16277a()) goto L_0x007f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @org.jetbrains.annotations.C12579k
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.material.C7884n0 mo10881b(float r8, float r9, float r10, float r11, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r12, int r13, int r14) {
        /*
            r7 = this;
            r0 = 380403812(0x16ac8064, float:2.7869125E-25)
            r12.mo14918M(r0)
            r1 = r14 & 1
            if (r1 == 0) goto L_0x0010
            r8 = 6
            float r8 = (float) r8
            float r8 = androidx.compose.p004ui.unit.C16483g.m74435M(r8)
        L_0x0010:
            r2 = r8
            r8 = r14 & 2
            if (r8 == 0) goto L_0x001c
            r8 = 12
            float r8 = (float) r8
            float r9 = androidx.compose.p004ui.unit.C16483g.m74435M(r8)
        L_0x001c:
            r3 = r9
            r8 = r14 & 4
            r9 = 8
            if (r8 == 0) goto L_0x0028
            float r8 = (float) r9
            float r10 = androidx.compose.p004ui.unit.C16483g.m74435M(r8)
        L_0x0028:
            r4 = r10
            r8 = r14 & 8
            if (r8 == 0) goto L_0x0032
            float r8 = (float) r9
            float r11 = androidx.compose.p004ui.unit.C16483g.m74435M(r8)
        L_0x0032:
            r5 = r11
            boolean r8 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r8 == 0) goto L_0x003f
            r8 = -1
            java.lang.String r9 = "androidx.compose.material.FloatingActionButtonDefaults.elevation (FloatingActionButton.kt:244)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r13, r8, r9)
        L_0x003f:
            r8 = 4
            java.lang.Object[] r9 = new java.lang.Object[r8]
            androidx.compose.ui.unit.g r10 = androidx.compose.p004ui.unit.C16483g.m74451w(r2)
            r11 = 0
            r9[r11] = r10
            androidx.compose.ui.unit.g r10 = androidx.compose.p004ui.unit.C16483g.m74451w(r3)
            r13 = 1
            r9[r13] = r10
            androidx.compose.ui.unit.g r10 = androidx.compose.p004ui.unit.C16483g.m74451w(r4)
            r13 = 2
            r9[r13] = r10
            r10 = 3
            androidx.compose.ui.unit.g r13 = androidx.compose.p004ui.unit.C16483g.m74451w(r5)
            r9[r10] = r13
            r10 = -568225417(0xffffffffde219177, float:-2.91055434E18)
            r12.mo14918M(r10)
            r10 = r11
        L_0x0065:
            if (r11 >= r8) goto L_0x0071
            r13 = r9[r11]
            boolean r13 = r12.mo15006n0(r13)
            r10 = r10 | r13
            int r11 = r11 + 1
            goto L_0x0065
        L_0x0071:
            java.lang.Object r8 = r12.mo14921N()
            if (r10 != 0) goto L_0x007f
            androidx.compose.runtime.o$a r9 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r9 = r9.mo16277a()
            if (r8 != r9) goto L_0x0089
        L_0x007f:
            androidx.compose.material.DefaultFloatingActionButtonElevation r8 = new androidx.compose.material.DefaultFloatingActionButtonElevation
            r6 = 0
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r12.mo14893C(r8)
        L_0x0089:
            r12.mo15002m0()
            androidx.compose.material.DefaultFloatingActionButtonElevation r8 = (androidx.compose.material.DefaultFloatingActionButtonElevation) r8
            boolean r9 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r9 == 0) goto L_0x0097
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0097:
            r12.mo15002m0()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.C7881m0.mo10881b(float, float, float, float, androidx.compose.runtime.o, int, int):androidx.compose.material.n0");
    }
}

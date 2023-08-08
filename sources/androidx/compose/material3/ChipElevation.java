package androidx.compose.material3;

import androidx.compose.foundation.interaction.C2241e;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8585m0;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
@C11363r0({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipElevation\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,2104:1\n25#2:2105\n50#2:2112\n49#2:2113\n25#2:2120\n1114#3,6:2106\n1114#3,6:2114\n1114#3,6:2121\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipElevation\n*L\n1495#1:2105\n1496#1:2112\n1496#1:2113\n1547#1:2120\n1495#1:2106,6\n1496#1:2114,6\n1547#1:2121,6\n*E\n"})
public final class ChipElevation {

    /* renamed from: g */
    public static final int f19212g = 0;

    /* renamed from: a */
    public final float f19213a;

    /* renamed from: b */
    public final float f19214b;

    /* renamed from: c */
    public final float f19215c;

    /* renamed from: d */
    public final float f19216d;

    /* renamed from: e */
    public final float f19217e;

    /* renamed from: f */
    public final float f19218f;

    public /* synthetic */ ChipElevation(float f, float f2, float f3, float f4, float f5, float f6, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5, f6);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: androidx.compose.animation.core.Animatable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: androidx.compose.animation.core.Animatable} */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.runtime.C8578k2<androidx.compose.p004ui.unit.C16483g> mo11247e(boolean r19, androidx.compose.foundation.interaction.C2241e r20, androidx.compose.runtime.C8592o r21, int r22) {
        /*
            r18 = this;
            r6 = r18
            r0 = r20
            r7 = r21
            r1 = r22
            r2 = -2071499570(0xffffffff84876cce, float:-3.183827E-36)
            r7.mo14918M(r2)
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x001a
            r3 = -1
            java.lang.String r4 = "androidx.compose.material3.ChipElevation.animateElevation (Chip.kt:1490)"
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r1, r3, r4)
        L_0x001a:
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r7.mo14918M(r2)
            java.lang.Object r3 = r21.mo14921N()
            androidx.compose.runtime.o$a r4 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r5 = r4.mo16277a()
            if (r3 != r5) goto L_0x0033
            androidx.compose.runtime.snapshots.SnapshotStateList r3 = androidx.compose.runtime.C8415c2.m30237f()
            r7.mo14893C(r3)
        L_0x0033:
            r21.mo15002m0()
            androidx.compose.runtime.snapshots.SnapshotStateList r3 = (androidx.compose.runtime.snapshots.SnapshotStateList) r3
            int r1 = r1 >> 3
            r1 = r1 & 14
            r5 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r7.mo14918M(r5)
            boolean r5 = r7.mo15006n0(r0)
            boolean r8 = r7.mo15006n0(r3)
            r5 = r5 | r8
            java.lang.Object r8 = r21.mo14921N()
            r9 = 0
            if (r5 != 0) goto L_0x0058
            java.lang.Object r5 = r4.mo16277a()
            if (r8 != r5) goto L_0x0060
        L_0x0058:
            androidx.compose.material3.ChipElevation$animateElevation$1$1 r8 = new androidx.compose.material3.ChipElevation$animateElevation$1$1
            r8.<init>(r0, r3, r9)
            r7.mo14893C(r8)
        L_0x0060:
            r21.mo15002m0()
            kotlin.jvm.functions.p r8 = (kotlin.jvm.functions.C11304p) r8
            r10 = 64
            r1 = r1 | r10
            androidx.compose.runtime.EffectsKt.m29896h(r0, r8, r7, r1)
            java.lang.Object r0 = kotlin.collections.CollectionsKt___CollectionsKt.m40677q3(r3)
            r5 = r0
            androidx.compose.foundation.interaction.d r5 = (androidx.compose.foundation.interaction.C2240d) r5
            if (r19 != 0) goto L_0x0078
            float r0 = r6.f19218f
        L_0x0076:
            r3 = r0
            goto L_0x0097
        L_0x0078:
            boolean r0 = r5 instanceof androidx.compose.foundation.interaction.C2245i.C2247b
            if (r0 == 0) goto L_0x007f
            float r0 = r6.f19214b
            goto L_0x0076
        L_0x007f:
            boolean r0 = r5 instanceof androidx.compose.foundation.interaction.C2237c.C2238a
            if (r0 == 0) goto L_0x0086
            float r0 = r6.f19216d
            goto L_0x0076
        L_0x0086:
            boolean r0 = r5 instanceof androidx.compose.foundation.interaction.C2234b.C2235a
            if (r0 == 0) goto L_0x008d
            float r0 = r6.f19215c
            goto L_0x0076
        L_0x008d:
            boolean r0 = r5 instanceof androidx.compose.foundation.interaction.C2230a.C2232b
            if (r0 == 0) goto L_0x0094
            float r0 = r6.f19217e
            goto L_0x0076
        L_0x0094:
            float r0 = r6.f19213a
            goto L_0x0076
        L_0x0097:
            r7.mo14918M(r2)
            java.lang.Object r0 = r21.mo14921N()
            java.lang.Object r1 = r4.mo16277a()
            if (r0 != r1) goto L_0x00bd
            androidx.compose.animation.core.Animatable r0 = new androidx.compose.animation.core.Animatable
            androidx.compose.ui.unit.g r12 = androidx.compose.p004ui.unit.C16483g.m74451w(r3)
            androidx.compose.ui.unit.g$a r1 = androidx.compose.p004ui.unit.C16483g.f40871b
            androidx.compose.animation.core.a1 r13 = androidx.compose.animation.core.VectorConvertersKt.m8220e(r1)
            r14 = 0
            r15 = 0
            r16 = 12
            r17 = 0
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r7.mo14893C(r0)
        L_0x00bd:
            r21.mo15002m0()
            r8 = r0
            androidx.compose.animation.core.Animatable r8 = (androidx.compose.animation.core.Animatable) r8
            if (r19 != 0) goto L_0x00db
            r0 = -1373769818(0xffffffffae1defa6, float:-3.5910518E-11)
            r7.mo14918M(r0)
            androidx.compose.ui.unit.g r0 = androidx.compose.p004ui.unit.C16483g.m74451w(r3)
            androidx.compose.material3.ChipElevation$animateElevation$2 r1 = new androidx.compose.material3.ChipElevation$animateElevation$2
            r1.<init>(r8, r3, r9)
            androidx.compose.runtime.EffectsKt.m29896h(r0, r1, r7, r10)
            r21.mo15002m0()
            goto L_0x00f7
        L_0x00db:
            r0 = -1373769675(0xffffffffae1df035, float:-3.5911014E-11)
            r7.mo14918M(r0)
            androidx.compose.ui.unit.g r9 = androidx.compose.p004ui.unit.C16483g.m74451w(r3)
            androidx.compose.material3.ChipElevation$animateElevation$3 r11 = new androidx.compose.material3.ChipElevation$animateElevation$3
            r12 = 0
            r0 = r11
            r1 = r8
            r2 = r18
            r4 = r5
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.compose.runtime.EffectsKt.m29896h(r9, r11, r7, r10)
            r21.mo15002m0()
        L_0x00f7:
            androidx.compose.runtime.k2 r0 = r8.mo6602j()
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0104
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0104:
            r21.mo15002m0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ChipElevation.mo11247e(boolean, androidx.compose.foundation.interaction.e, androidx.compose.runtime.o, int):androidx.compose.runtime.k2");
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ChipElevation)) {
            return false;
        }
        ChipElevation chipElevation = (ChipElevation) obj;
        if (C16483g.m74440e0(this.f19213a, chipElevation.f19213a) && C16483g.m74440e0(this.f19214b, chipElevation.f19214b) && C16483g.m74440e0(this.f19215c, chipElevation.f19215c) && C16483g.m74440e0(this.f19216d, chipElevation.f19216d) && C16483g.m74440e0(this.f19218f, chipElevation.f19218f)) {
            return true;
        }
        return false;
    }

    @C8540g
    @C12579k
    /* renamed from: f */
    public final C8578k2<C16483g> mo11249f(boolean z, @C12579k C2241e eVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(eVar, "interactionSource");
        oVar.mo14918M(1881877139);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1881877139, i, -1, "androidx.compose.material3.ChipElevation.shadowElevation (Chip.kt:1482)");
        }
        C8578k2<C16483g> e = mo11247e(z, eVar, oVar, (i & 896) | (i & 14) | (i & 112));
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return e;
    }

    @C8540g
    @C12579k
    /* renamed from: g */
    public final C8578k2<C16483g> mo11250g(boolean z, @C12579k C2241e eVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(eVar, "interactionSource");
        oVar.mo14918M(1108183825);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1108183825, i, -1, "androidx.compose.material3.ChipElevation.tonalElevation (Chip.kt:1463)");
        }
        C8578k2<C16483g> e = mo11247e(z, eVar, oVar, (i & 896) | (i & 14) | (i & 112));
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return e;
    }

    public int hashCode() {
        return (((((((C16483g.m74442h0(this.f19213a) * 31) + C16483g.m74442h0(this.f19214b)) * 31) + C16483g.m74442h0(this.f19215c)) * 31) + C16483g.m74442h0(this.f19216d)) * 31) + C16483g.m74442h0(this.f19218f);
    }

    public ChipElevation(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f19213a = f;
        this.f19214b = f2;
        this.f19215c = f3;
        this.f19216d = f4;
        this.f19217e = f5;
        this.f19218f = f6;
    }
}

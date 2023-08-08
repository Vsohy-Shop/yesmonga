package androidx.compose.material3;

import androidx.compose.foundation.interaction.C2241e;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
@C11363r0({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonElevation\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,956:1\n25#2:957\n50#2:964\n49#2:965\n25#2:972\n1114#3,6:958\n1114#3,6:966\n1114#3,6:973\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonElevation\n*L\n813#1:957\n814#1:964\n814#1:965\n856#1:972\n813#1:958,6\n814#1:966,6\n856#1:973,6\n*E\n"})
public final class ButtonElevation {

    /* renamed from: f */
    public static final int f19187f = 0;

    /* renamed from: a */
    public final float f19188a;

    /* renamed from: b */
    public final float f19189b;

    /* renamed from: c */
    public final float f19190c;

    /* renamed from: d */
    public final float f19191d;

    /* renamed from: e */
    public final float f19192e;

    public /* synthetic */ ButtonElevation(float f, float f2, float f3, float f4, float f5, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: androidx.compose.animation.core.Animatable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: androidx.compose.animation.core.Animatable} */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.runtime.C8578k2<androidx.compose.p004ui.unit.C16483g> mo11207d(boolean r19, androidx.compose.foundation.interaction.C2241e r20, androidx.compose.runtime.C8592o r21, int r22) {
        /*
            r18 = this;
            r6 = r18
            r0 = r20
            r7 = r21
            r1 = r22
            r2 = -1312510462(0xffffffffb1c4ae02, float:-5.724133E-9)
            r7.mo14918M(r2)
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x001a
            r3 = -1
            java.lang.String r4 = "androidx.compose.material3.ButtonElevation.animateElevation (Button.kt:808)"
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
            androidx.compose.material3.ButtonElevation$animateElevation$1$1 r8 = new androidx.compose.material3.ButtonElevation$animateElevation$1$1
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
            float r0 = r6.f19192e
        L_0x0076:
            r3 = r0
            goto L_0x0090
        L_0x0078:
            boolean r0 = r5 instanceof androidx.compose.foundation.interaction.C2245i.C2247b
            if (r0 == 0) goto L_0x007f
            float r0 = r6.f19189b
            goto L_0x0076
        L_0x007f:
            boolean r0 = r5 instanceof androidx.compose.foundation.interaction.C2237c.C2238a
            if (r0 == 0) goto L_0x0086
            float r0 = r6.f19191d
            goto L_0x0076
        L_0x0086:
            boolean r0 = r5 instanceof androidx.compose.foundation.interaction.C2234b.C2235a
            if (r0 == 0) goto L_0x008d
            float r0 = r6.f19190c
            goto L_0x0076
        L_0x008d:
            float r0 = r6.f19188a
            goto L_0x0076
        L_0x0090:
            r7.mo14918M(r2)
            java.lang.Object r0 = r21.mo14921N()
            java.lang.Object r1 = r4.mo16277a()
            if (r0 != r1) goto L_0x00b6
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
        L_0x00b6:
            r21.mo15002m0()
            r8 = r0
            androidx.compose.animation.core.Animatable r8 = (androidx.compose.animation.core.Animatable) r8
            if (r19 != 0) goto L_0x00d4
            r0 = -719930083(0xffffffffd516bd1d, float:-1.03586862E13)
            r7.mo14918M(r0)
            androidx.compose.ui.unit.g r0 = androidx.compose.p004ui.unit.C16483g.m74451w(r3)
            androidx.compose.material3.ButtonElevation$animateElevation$2 r1 = new androidx.compose.material3.ButtonElevation$animateElevation$2
            r1.<init>(r8, r3, r9)
            androidx.compose.runtime.EffectsKt.m29896h(r0, r1, r7, r10)
            r21.mo15002m0()
            goto L_0x00f0
        L_0x00d4:
            r0 = -719929940(0xffffffffd516bdac, float:-1.03588362E13)
            r7.mo14918M(r0)
            androidx.compose.ui.unit.g r9 = androidx.compose.p004ui.unit.C16483g.m74451w(r3)
            androidx.compose.material3.ButtonElevation$animateElevation$3 r11 = new androidx.compose.material3.ButtonElevation$animateElevation$3
            r12 = 0
            r0 = r11
            r1 = r8
            r2 = r18
            r4 = r5
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.compose.runtime.EffectsKt.m29896h(r9, r11, r7, r10)
            r21.mo15002m0()
        L_0x00f0:
            androidx.compose.runtime.k2 r0 = r8.mo6602j()
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x00fd
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00fd:
            r21.mo15002m0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ButtonElevation.mo11207d(boolean, androidx.compose.foundation.interaction.e, androidx.compose.runtime.o, int):androidx.compose.runtime.k2");
    }

    @C8540g
    @C12579k
    /* renamed from: e */
    public final C8578k2<C16483g> mo11208e(boolean z, @C12579k C2241e eVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(eVar, "interactionSource");
        oVar.mo14918M(-2045116089);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-2045116089, i, -1, "androidx.compose.material3.ButtonElevation.shadowElevation (Button.kt:800)");
        }
        C8578k2<C16483g> d = mo11207d(z, eVar, oVar, (i & 896) | (i & 14) | (i & 112));
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return d;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ButtonElevation)) {
            return false;
        }
        ButtonElevation buttonElevation = (ButtonElevation) obj;
        if (C16483g.m74440e0(this.f19188a, buttonElevation.f19188a) && C16483g.m74440e0(this.f19189b, buttonElevation.f19189b) && C16483g.m74440e0(this.f19190c, buttonElevation.f19190c) && C16483g.m74440e0(this.f19191d, buttonElevation.f19191d) && C16483g.m74440e0(this.f19192e, buttonElevation.f19192e)) {
            return true;
        }
        return false;
    }

    @C8540g
    @C12579k
    /* renamed from: f */
    public final C8578k2<C16483g> mo11210f(boolean z, @C12579k C2241e eVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(eVar, "interactionSource");
        oVar.mo14918M(-423890235);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-423890235, i, -1, "androidx.compose.material3.ButtonElevation.tonalElevation (Button.kt:784)");
        }
        C8578k2<C16483g> d = mo11207d(z, eVar, oVar, (i & 896) | (i & 14) | (i & 112));
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return d;
    }

    public int hashCode() {
        return (((((((C16483g.m74442h0(this.f19188a) * 31) + C16483g.m74442h0(this.f19189b)) * 31) + C16483g.m74442h0(this.f19190c)) * 31) + C16483g.m74442h0(this.f19191d)) * 31) + C16483g.m74442h0(this.f19192e);
    }

    public ButtonElevation(float f, float f2, float f3, float f4, float f5) {
        this.f19188a = f;
        this.f19189b = f2;
        this.f19190c = f3;
        this.f19191d = f4;
        this.f19192e = f5;
    }
}

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
@C11363r0({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonElevation\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,619:1\n25#2:620\n50#2:627\n49#2:628\n25#2:635\n1114#3,6:621\n1114#3,6:629\n1114#3,6:636\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material3/FloatingActionButtonElevation\n*L\n507#1:620\n509#1:627\n509#1:628\n546#1:635\n507#1:621,6\n509#1:629,6\n546#1:636,6\n*E\n"})
public class FloatingActionButtonElevation {

    /* renamed from: e */
    public static final int f19422e = 0;

    /* renamed from: a */
    public final float f19423a;

    /* renamed from: b */
    public final float f19424b;

    /* renamed from: c */
    public final float f19425c;

    /* renamed from: d */
    public final float f19426d;

    public /* synthetic */ FloatingActionButtonElevation(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: androidx.compose.animation.core.Animatable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: androidx.compose.animation.core.Animatable} */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.runtime.C8578k2<androidx.compose.p004ui.unit.C16483g> mo11569d(androidx.compose.foundation.interaction.C2241e r18, androidx.compose.runtime.C8592o r19, int r20) {
        /*
            r17 = this;
            r6 = r17
            r0 = r18
            r7 = r19
            r1 = r20
            r2 = -1845106002(0xffffffff9205eaae, float:-4.2256665E-28)
            r7.mo14918M(r2)
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x001a
            r3 = -1
            java.lang.String r4 = "androidx.compose.material3.FloatingActionButtonElevation.animateElevation (FloatingActionButton.kt:505)"
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r1, r3, r4)
        L_0x001a:
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r7.mo14918M(r2)
            java.lang.Object r3 = r19.mo14921N()
            androidx.compose.runtime.o$a r4 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r5 = r4.mo16277a()
            if (r3 != r5) goto L_0x0033
            androidx.compose.runtime.snapshots.SnapshotStateList r3 = androidx.compose.runtime.C8415c2.m30237f()
            r7.mo14893C(r3)
        L_0x0033:
            r19.mo15002m0()
            androidx.compose.runtime.snapshots.SnapshotStateList r3 = (androidx.compose.runtime.snapshots.SnapshotStateList) r3
            r1 = r1 & 14
            r5 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r7.mo14918M(r5)
            boolean r5 = r7.mo15006n0(r0)
            boolean r8 = r7.mo15006n0(r3)
            r5 = r5 | r8
            java.lang.Object r8 = r19.mo14921N()
            if (r5 != 0) goto L_0x0055
            java.lang.Object r5 = r4.mo16277a()
            if (r8 != r5) goto L_0x005e
        L_0x0055:
            androidx.compose.material3.FloatingActionButtonElevation$animateElevation$1$1 r8 = new androidx.compose.material3.FloatingActionButtonElevation$animateElevation$1$1
            r5 = 0
            r8.<init>(r0, r3, r5)
            r7.mo14893C(r8)
        L_0x005e:
            r19.mo15002m0()
            kotlin.jvm.functions.p r8 = (kotlin.jvm.functions.C11304p) r8
            r9 = 64
            r1 = r1 | r9
            androidx.compose.runtime.EffectsKt.m29896h(r0, r8, r7, r1)
            java.lang.Object r0 = kotlin.collections.CollectionsKt___CollectionsKt.m40677q3(r3)
            r5 = r0
            androidx.compose.foundation.interaction.d r5 = (androidx.compose.foundation.interaction.C2240d) r5
            boolean r0 = r5 instanceof androidx.compose.foundation.interaction.C2245i.C2247b
            if (r0 == 0) goto L_0x0078
            float r0 = r6.f19424b
        L_0x0076:
            r3 = r0
            goto L_0x0089
        L_0x0078:
            boolean r0 = r5 instanceof androidx.compose.foundation.interaction.C2237c.C2238a
            if (r0 == 0) goto L_0x007f
            float r0 = r6.f19426d
            goto L_0x0076
        L_0x007f:
            boolean r0 = r5 instanceof androidx.compose.foundation.interaction.C2234b.C2235a
            if (r0 == 0) goto L_0x0086
            float r0 = r6.f19425c
            goto L_0x0076
        L_0x0086:
            float r0 = r6.f19423a
            goto L_0x0076
        L_0x0089:
            r7.mo14918M(r2)
            java.lang.Object r0 = r19.mo14921N()
            java.lang.Object r1 = r4.mo16277a()
            if (r0 != r1) goto L_0x00af
            androidx.compose.animation.core.Animatable r0 = new androidx.compose.animation.core.Animatable
            androidx.compose.ui.unit.g r11 = androidx.compose.p004ui.unit.C16483g.m74451w(r3)
            androidx.compose.ui.unit.g$a r1 = androidx.compose.p004ui.unit.C16483g.f40871b
            androidx.compose.animation.core.a1 r12 = androidx.compose.animation.core.VectorConvertersKt.m8220e(r1)
            r13 = 0
            r14 = 0
            r15 = 12
            r16 = 0
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r7.mo14893C(r0)
        L_0x00af:
            r19.mo15002m0()
            r8 = r0
            androidx.compose.animation.core.Animatable r8 = (androidx.compose.animation.core.Animatable) r8
            androidx.compose.ui.unit.g r10 = androidx.compose.p004ui.unit.C16483g.m74451w(r3)
            androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2 r11 = new androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2
            r12 = 0
            r0 = r11
            r1 = r8
            r2 = r17
            r4 = r5
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.compose.runtime.EffectsKt.m29896h(r10, r11, r7, r9)
            androidx.compose.runtime.k2 r0 = r8.mo6602j()
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x00d5
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00d5:
            r19.mo15002m0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonElevation.mo11569d(androidx.compose.foundation.interaction.e, androidx.compose.runtime.o, int):androidx.compose.runtime.k2");
    }

    @C8540g
    @C12579k
    /* renamed from: e */
    public final C8578k2<C16483g> mo11570e(@C12579k C2241e eVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(eVar, "interactionSource");
        oVar.mo14918M(-424810125);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-424810125, i, -1, "androidx.compose.material3.FloatingActionButtonElevation.shadowElevation (FloatingActionButton.kt:495)");
        }
        C8578k2<C16483g> d = mo11569d(eVar, oVar, (i & 112) | (i & 14));
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
        if (obj == null || !(obj instanceof FloatingActionButtonElevation)) {
            return false;
        }
        FloatingActionButtonElevation floatingActionButtonElevation = (FloatingActionButtonElevation) obj;
        if (C16483g.m74440e0(this.f19423a, floatingActionButtonElevation.f19423a) && C16483g.m74440e0(this.f19424b, floatingActionButtonElevation.f19424b) && C16483g.m74440e0(this.f19425c, floatingActionButtonElevation.f19425c) && C16483g.m74440e0(this.f19426d, floatingActionButtonElevation.f19426d)) {
            return true;
        }
        return false;
    }

    @C8540g
    @C12579k
    /* renamed from: f */
    public final C8578k2<C16483g> mo11572f(@C12579k C2241e eVar, @C12580l C8592o oVar, int i) {
        Intrinsics.checkNotNullParameter(eVar, "interactionSource");
        oVar.mo14918M(-550096911);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-550096911, i, -1, "androidx.compose.material3.FloatingActionButtonElevation.tonalElevation (FloatingActionButton.kt:500)");
        }
        C8578k2<C16483g> d = mo11569d(eVar, oVar, (i & 112) | (i & 14));
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return d;
    }

    public int hashCode() {
        return (((((C16483g.m74442h0(this.f19423a) * 31) + C16483g.m74442h0(this.f19424b)) * 31) + C16483g.m74442h0(this.f19425c)) * 31) + C16483g.m74442h0(this.f19426d);
    }

    public FloatingActionButtonElevation(float f, float f2, float f3, float f4) {
        this.f19423a = f;
        this.f19424b = f2;
        this.f19425c = f3;
        this.f19426d = f4;
    }
}

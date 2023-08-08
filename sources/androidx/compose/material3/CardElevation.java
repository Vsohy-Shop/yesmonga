package androidx.compose.material3;

import androidx.compose.foundation.interaction.C2241e;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8585m0;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
@C11363r0({"SMAP\nCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardElevation\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,772:1\n25#2:773\n25#2:780\n25#2:787\n50#2:794\n49#2:795\n25#2:802\n1114#3,6:774\n1114#3,6:781\n1114#3,6:788\n1114#3,6:796\n1114#3,6:803\n*S KotlinDebug\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardElevation\n*L\n585#1:773\n607#1:780\n617#1:787\n618#1:794\n618#1:795\n670#1:802\n585#1:774,6\n607#1:781,6\n617#1:788,6\n618#1:796,6\n670#1:803,6\n*E\n"})
public final class CardElevation {

    /* renamed from: g */
    public static final int f19195g = 0;

    /* renamed from: a */
    public final float f19196a;

    /* renamed from: b */
    public final float f19197b;

    /* renamed from: c */
    public final float f19198c;

    /* renamed from: d */
    public final float f19199d;

    /* renamed from: e */
    public final float f19200e;

    /* renamed from: f */
    public final float f19201f;

    public /* synthetic */ CardElevation(float f, float f2, float f3, float f4, float f5, float f6, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5, f6);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CardElevation)) {
            return false;
        }
        CardElevation cardElevation = (CardElevation) obj;
        if (C16483g.m74440e0(this.f19196a, cardElevation.f19196a) && C16483g.m74440e0(this.f19197b, cardElevation.f19197b) && C16483g.m74440e0(this.f19198c, cardElevation.f19198c) && C16483g.m74440e0(this.f19199d, cardElevation.f19199d) && C16483g.m74440e0(this.f19201f, cardElevation.f19201f)) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: androidx.compose.animation.core.Animatable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: androidx.compose.animation.core.Animatable} */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.runtime.C8578k2<androidx.compose.p004ui.unit.C16483g> mo11226f(boolean r18, androidx.compose.foundation.interaction.C2241e r19, androidx.compose.runtime.C8592o r20, int r21) {
        /*
            r17 = this;
            r7 = r17
            r0 = r19
            r8 = r20
            r1 = r21
            r2 = -1421890746(0xffffffffab3fab46, float:-6.809452E-13)
            r8.mo14918M(r2)
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x001a
            r3 = -1
            java.lang.String r4 = "androidx.compose.material3.CardElevation.animateElevation (Card.kt:612)"
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r1, r3, r4)
        L_0x001a:
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r8.mo14918M(r2)
            java.lang.Object r3 = r20.mo14921N()
            androidx.compose.runtime.o$a r4 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r5 = r4.mo16277a()
            if (r3 != r5) goto L_0x0033
            androidx.compose.runtime.snapshots.SnapshotStateList r3 = androidx.compose.runtime.C8415c2.m30237f()
            r8.mo14893C(r3)
        L_0x0033:
            r20.mo15002m0()
            androidx.compose.runtime.snapshots.SnapshotStateList r3 = (androidx.compose.runtime.snapshots.SnapshotStateList) r3
            int r1 = r1 >> 3
            r1 = r1 & 14
            r5 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r8.mo14918M(r5)
            boolean r5 = r8.mo15006n0(r0)
            boolean r6 = r8.mo15006n0(r3)
            r5 = r5 | r6
            java.lang.Object r6 = r20.mo14921N()
            if (r5 != 0) goto L_0x0057
            java.lang.Object r5 = r4.mo16277a()
            if (r6 != r5) goto L_0x0060
        L_0x0057:
            androidx.compose.material3.CardElevation$animateElevation$1$1 r6 = new androidx.compose.material3.CardElevation$animateElevation$1$1
            r5 = 0
            r6.<init>(r0, r3, r5)
            r8.mo14893C(r6)
        L_0x0060:
            r20.mo15002m0()
            kotlin.jvm.functions.p r6 = (kotlin.jvm.functions.C11304p) r6
            r9 = 64
            r1 = r1 | r9
            androidx.compose.runtime.EffectsKt.m29896h(r0, r6, r8, r1)
            java.lang.Object r0 = kotlin.collections.CollectionsKt___CollectionsKt.m40677q3(r3)
            r5 = r0
            androidx.compose.foundation.interaction.d r5 = (androidx.compose.foundation.interaction.C2240d) r5
            if (r18 != 0) goto L_0x0078
            float r0 = r7.f19201f
        L_0x0076:
            r6 = r0
            goto L_0x0097
        L_0x0078:
            boolean r0 = r5 instanceof androidx.compose.foundation.interaction.C2245i.C2247b
            if (r0 == 0) goto L_0x007f
            float r0 = r7.f19197b
            goto L_0x0076
        L_0x007f:
            boolean r0 = r5 instanceof androidx.compose.foundation.interaction.C2237c.C2238a
            if (r0 == 0) goto L_0x0086
            float r0 = r7.f19199d
            goto L_0x0076
        L_0x0086:
            boolean r0 = r5 instanceof androidx.compose.foundation.interaction.C2234b.C2235a
            if (r0 == 0) goto L_0x008d
            float r0 = r7.f19198c
            goto L_0x0076
        L_0x008d:
            boolean r0 = r5 instanceof androidx.compose.foundation.interaction.C2230a.C2232b
            if (r0 == 0) goto L_0x0094
            float r0 = r7.f19200e
            goto L_0x0076
        L_0x0094:
            float r0 = r7.f19196a
            goto L_0x0076
        L_0x0097:
            r8.mo14918M(r2)
            java.lang.Object r0 = r20.mo14921N()
            java.lang.Object r1 = r4.mo16277a()
            if (r0 != r1) goto L_0x00bd
            androidx.compose.animation.core.Animatable r0 = new androidx.compose.animation.core.Animatable
            androidx.compose.ui.unit.g r11 = androidx.compose.p004ui.unit.C16483g.m74451w(r6)
            androidx.compose.ui.unit.g$a r1 = androidx.compose.p004ui.unit.C16483g.f40871b
            androidx.compose.animation.core.a1 r12 = androidx.compose.animation.core.VectorConvertersKt.m8220e(r1)
            r13 = 0
            r14 = 0
            r15 = 12
            r16 = 0
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r8.mo14893C(r0)
        L_0x00bd:
            r20.mo15002m0()
            r10 = r0
            androidx.compose.animation.core.Animatable r10 = (androidx.compose.animation.core.Animatable) r10
            androidx.compose.ui.unit.g r11 = androidx.compose.p004ui.unit.C16483g.m74451w(r6)
            androidx.compose.material3.CardElevation$animateElevation$2 r12 = new androidx.compose.material3.CardElevation$animateElevation$2
            r13 = 0
            r0 = r12
            r1 = r18
            r2 = r10
            r3 = r17
            r4 = r6
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            androidx.compose.runtime.EffectsKt.m29896h(r11, r12, r8, r9)
            androidx.compose.runtime.k2 r0 = r10.mo6602j()
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x00e5
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00e5:
            r20.mo15002m0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CardElevation.mo11226f(boolean, androidx.compose.foundation.interaction.e, androidx.compose.runtime.o, int):androidx.compose.runtime.k2");
    }

    @C8540g
    @C12579k
    /* renamed from: g */
    public final C8578k2<C16483g> mo11227g(boolean z, @C12580l C2241e eVar, @C12580l C8592o oVar, int i) {
        oVar.mo14918M(-1763481333);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1763481333, i, -1, "androidx.compose.material3.CardElevation.shadowElevation (Card.kt:601)");
        }
        oVar.mo14918M(-1409180589);
        if (eVar == null) {
            oVar.mo14918M(-492369756);
            Object N = oVar.mo14921N();
            if (N == C8592o.f23032a.mo16277a()) {
                N = C8539f2.m30981g(C16483g.m74451w(this.f19196a), (C8410b2) null, 2, (Object) null);
                oVar.mo14893C(N);
            }
            oVar.mo15002m0();
            C8700z0 z0Var = (C8700z0) N;
            oVar.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
            oVar.mo15002m0();
            return z0Var;
        }
        oVar.mo15002m0();
        C8578k2<C16483g> f = mo11226f(z, eVar, oVar, (i & 896) | (i & 14) | (i & 112));
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return f;
    }

    @C8540g
    @C12579k
    /* renamed from: h */
    public final C8578k2<C16483g> mo11228h(boolean z, @C12580l C2241e eVar, @C12580l C8592o oVar, int i) {
        oVar.mo14918M(1757792649);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1757792649, i, -1, "androidx.compose.material3.CardElevation.tonalElevation (Card.kt:579)");
        }
        oVar.mo14918M(603878391);
        if (eVar == null) {
            oVar.mo14918M(-492369756);
            Object N = oVar.mo14921N();
            if (N == C8592o.f23032a.mo16277a()) {
                N = C8539f2.m30981g(C16483g.m74451w(this.f19196a), (C8410b2) null, 2, (Object) null);
                oVar.mo14893C(N);
            }
            oVar.mo15002m0();
            C8700z0 z0Var = (C8700z0) N;
            oVar.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
            oVar.mo15002m0();
            return z0Var;
        }
        oVar.mo15002m0();
        C8578k2<C16483g> f = mo11226f(z, eVar, oVar, (i & 896) | (i & 14) | (i & 112));
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return f;
    }

    public int hashCode() {
        return (((((((C16483g.m74442h0(this.f19196a) * 31) + C16483g.m74442h0(this.f19197b)) * 31) + C16483g.m74442h0(this.f19198c)) * 31) + C16483g.m74442h0(this.f19199d)) * 31) + C16483g.m74442h0(this.f19201f);
    }

    public CardElevation(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f19196a = f;
        this.f19197b = f2;
        this.f19198c = f3;
        this.f19199d = f4;
        this.f19200e = f5;
        this.f19201f = f6;
    }
}

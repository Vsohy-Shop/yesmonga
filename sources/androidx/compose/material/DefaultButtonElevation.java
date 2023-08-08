package androidx.compose.material;

import androidx.compose.runtime.C8547h2;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C8547h2
@C11363r0({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material/DefaultButtonElevation\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,618:1\n25#2:619\n50#2:626\n49#2:627\n25#2:634\n1114#3,6:620\n1114#3,6:628\n1114#3,6:635\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material/DefaultButtonElevation\n*L\n507#1:619\n508#1:626\n508#1:627\n549#1:634\n507#1:620,6\n508#1:628,6\n549#1:635,6\n*E\n"})
public final class DefaultButtonElevation implements C7870j {

    /* renamed from: a */
    public final float f7618a;

    /* renamed from: b */
    public final float f7619b;

    /* renamed from: c */
    public final float f7620c;

    /* renamed from: d */
    public final float f7621d;

    /* renamed from: e */
    public final float f7622e;

    public /* synthetic */ DefaultButtonElevation(float f, float f2, float f3, float f4, float f5, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: androidx.compose.animation.core.Animatable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: androidx.compose.animation.core.Animatable} */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @org.jetbrains.annotations.C12579k
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.compose.runtime.C8578k2<androidx.compose.p004ui.unit.C16483g> mo10121a(boolean r18, @org.jetbrains.annotations.C12579k androidx.compose.foundation.interaction.C2241e r19, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r20, int r21) {
        /*
            r17 = this;
            r6 = r17
            r0 = r19
            r7 = r20
            r1 = r21
            java.lang.String r2 = "interactionSource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            r2 = -1588756907(0xffffffffa14d7e55, float:-6.96239E-19)
            r7.mo14918M(r2)
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x001f
            r3 = -1
            java.lang.String r4 = "androidx.compose.material.DefaultButtonElevation.elevation (Button.kt:505)"
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r1, r3, r4)
        L_0x001f:
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r7.mo14918M(r2)
            java.lang.Object r3 = r20.mo14921N()
            androidx.compose.runtime.o$a r4 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r5 = r4.mo16277a()
            if (r3 != r5) goto L_0x0038
            androidx.compose.runtime.snapshots.SnapshotStateList r3 = androidx.compose.runtime.C8415c2.m30237f()
            r7.mo14893C(r3)
        L_0x0038:
            r20.mo15002m0()
            androidx.compose.runtime.snapshots.SnapshotStateList r3 = (androidx.compose.runtime.snapshots.SnapshotStateList) r3
            int r1 = r1 >> 3
            r1 = r1 & 14
            r5 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r7.mo14918M(r5)
            boolean r5 = r7.mo15006n0(r0)
            boolean r8 = r7.mo15006n0(r3)
            r5 = r5 | r8
            java.lang.Object r8 = r20.mo14921N()
            r9 = 0
            if (r5 != 0) goto L_0x005d
            java.lang.Object r5 = r4.mo16277a()
            if (r8 != r5) goto L_0x0065
        L_0x005d:
            androidx.compose.material.DefaultButtonElevation$elevation$1$1 r8 = new androidx.compose.material.DefaultButtonElevation$elevation$1$1
            r8.<init>(r0, r3, r9)
            r7.mo14893C(r8)
        L_0x0065:
            r20.mo15002m0()
            kotlin.jvm.functions.p r8 = (kotlin.jvm.functions.C11304p) r8
            r10 = 64
            r1 = r1 | r10
            androidx.compose.runtime.EffectsKt.m29896h(r0, r8, r7, r1)
            java.lang.Object r0 = kotlin.collections.CollectionsKt___CollectionsKt.m40677q3(r3)
            r5 = r0
            androidx.compose.foundation.interaction.d r5 = (androidx.compose.foundation.interaction.C2240d) r5
            if (r18 != 0) goto L_0x007d
            float r0 = r6.f7620c
        L_0x007b:
            r3 = r0
            goto L_0x0095
        L_0x007d:
            boolean r0 = r5 instanceof androidx.compose.foundation.interaction.C2245i.C2247b
            if (r0 == 0) goto L_0x0084
            float r0 = r6.f7619b
            goto L_0x007b
        L_0x0084:
            boolean r0 = r5 instanceof androidx.compose.foundation.interaction.C2237c.C2238a
            if (r0 == 0) goto L_0x008b
            float r0 = r6.f7621d
            goto L_0x007b
        L_0x008b:
            boolean r0 = r5 instanceof androidx.compose.foundation.interaction.C2234b.C2235a
            if (r0 == 0) goto L_0x0092
            float r0 = r6.f7622e
            goto L_0x007b
        L_0x0092:
            float r0 = r6.f7618a
            goto L_0x007b
        L_0x0095:
            r7.mo14918M(r2)
            java.lang.Object r0 = r20.mo14921N()
            java.lang.Object r1 = r4.mo16277a()
            if (r0 != r1) goto L_0x00b9
            androidx.compose.animation.core.Animatable r0 = new androidx.compose.animation.core.Animatable
            androidx.compose.ui.unit.g r12 = androidx.compose.p004ui.unit.C16483g.m74451w(r3)
            androidx.compose.ui.unit.g$a r1 = androidx.compose.p004ui.unit.C16483g.f40871b
            androidx.compose.animation.core.a1 r13 = androidx.compose.animation.core.VectorConvertersKt.m8220e(r1)
            r14 = 0
            r15 = 4
            r16 = 0
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16)
            r7.mo14893C(r0)
        L_0x00b9:
            r20.mo15002m0()
            r8 = r0
            androidx.compose.animation.core.Animatable r8 = (androidx.compose.animation.core.Animatable) r8
            if (r18 != 0) goto L_0x00d7
            r0 = -1598807317(0xffffffffa0b422eb, float:-3.0516293E-19)
            r7.mo14918M(r0)
            androidx.compose.ui.unit.g r0 = androidx.compose.p004ui.unit.C16483g.m74451w(r3)
            androidx.compose.material.DefaultButtonElevation$elevation$2 r1 = new androidx.compose.material.DefaultButtonElevation$elevation$2
            r1.<init>(r8, r3, r9)
            androidx.compose.runtime.EffectsKt.m29896h(r0, r1, r7, r10)
            r20.mo15002m0()
            goto L_0x00f3
        L_0x00d7:
            r0 = -1598807146(0xffffffffa0b42396, float:-3.0516735E-19)
            r7.mo14918M(r0)
            androidx.compose.ui.unit.g r9 = androidx.compose.p004ui.unit.C16483g.m74451w(r3)
            androidx.compose.material.DefaultButtonElevation$elevation$3 r11 = new androidx.compose.material.DefaultButtonElevation$elevation$3
            r12 = 0
            r0 = r11
            r1 = r8
            r2 = r17
            r4 = r5
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.compose.runtime.EffectsKt.m29896h(r9, r11, r7, r10)
            r20.mo15002m0()
        L_0x00f3:
            androidx.compose.runtime.k2 r0 = r8.mo6602j()
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0100
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0100:
            r20.mo15002m0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DefaultButtonElevation.mo10121a(boolean, androidx.compose.foundation.interaction.e, androidx.compose.runtime.o, int):androidx.compose.runtime.k2");
    }

    public DefaultButtonElevation(float f, float f2, float f3, float f4, float f5) {
        this.f7618a = f;
        this.f7619b = f2;
        this.f7620c = f3;
        this.f7621d = f4;
        this.f7622e = f5;
    }
}

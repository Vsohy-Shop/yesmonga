package androidx.compose.material;

import androidx.compose.runtime.C8547h2;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;

@C8547h2
@C11363r0({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/DefaultFloatingActionButtonElevation\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,336:1\n25#2:337\n50#2:344\n49#2:345\n25#2:352\n1114#3,6:338\n1114#3,6:346\n1114#3,6:353\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/DefaultFloatingActionButtonElevation\n*L\n274#1:337\n275#1:344\n275#1:345\n312#1:352\n274#1:338,6\n275#1:346,6\n312#1:353,6\n*E\n"})
public final class DefaultFloatingActionButtonElevation implements C7884n0 {

    /* renamed from: a */
    public final float f7624a;

    /* renamed from: b */
    public final float f7625b;

    /* renamed from: c */
    public final float f7626c;

    /* renamed from: d */
    public final float f7627d;

    public /* synthetic */ DefaultFloatingActionButtonElevation(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: androidx.compose.animation.core.Animatable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: androidx.compose.animation.core.Animatable} */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @org.jetbrains.annotations.C12579k
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.compose.runtime.C8578k2<androidx.compose.p004ui.unit.C16483g> mo10126a(@org.jetbrains.annotations.C12579k androidx.compose.foundation.interaction.C2241e r17, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r18, int r19) {
        /*
            r16 = this;
            r6 = r16
            r0 = r17
            r7 = r18
            r1 = r19
            java.lang.String r2 = "interactionSource"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            r2 = -478475335(0xffffffffe37b0bb9, float:-4.6309775E21)
            r7.mo14918M(r2)
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x001f
            r3 = -1
            java.lang.String r4 = "androidx.compose.material.DefaultFloatingActionButtonElevation.elevation (FloatingActionButton.kt:272)"
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r1, r3, r4)
        L_0x001f:
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r7.mo14918M(r2)
            java.lang.Object r3 = r18.mo14921N()
            androidx.compose.runtime.o$a r4 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r5 = r4.mo16277a()
            if (r3 != r5) goto L_0x0038
            androidx.compose.runtime.snapshots.SnapshotStateList r3 = androidx.compose.runtime.C8415c2.m30237f()
            r7.mo14893C(r3)
        L_0x0038:
            r18.mo15002m0()
            androidx.compose.runtime.snapshots.SnapshotStateList r3 = (androidx.compose.runtime.snapshots.SnapshotStateList) r3
            r1 = r1 & 14
            r5 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r7.mo14918M(r5)
            boolean r5 = r7.mo15006n0(r0)
            boolean r8 = r7.mo15006n0(r3)
            r5 = r5 | r8
            java.lang.Object r8 = r18.mo14921N()
            if (r5 != 0) goto L_0x005a
            java.lang.Object r5 = r4.mo16277a()
            if (r8 != r5) goto L_0x0063
        L_0x005a:
            androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$1$1 r8 = new androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$1$1
            r5 = 0
            r8.<init>(r0, r3, r5)
            r7.mo14893C(r8)
        L_0x0063:
            r18.mo15002m0()
            kotlin.jvm.functions.p r8 = (kotlin.jvm.functions.C11304p) r8
            r9 = 64
            r1 = r1 | r9
            androidx.compose.runtime.EffectsKt.m29896h(r0, r8, r7, r1)
            java.lang.Object r0 = kotlin.collections.CollectionsKt___CollectionsKt.m40677q3(r3)
            r5 = r0
            androidx.compose.foundation.interaction.d r5 = (androidx.compose.foundation.interaction.C2240d) r5
            boolean r0 = r5 instanceof androidx.compose.foundation.interaction.C2245i.C2247b
            if (r0 == 0) goto L_0x007d
            float r0 = r6.f7625b
        L_0x007b:
            r3 = r0
            goto L_0x008e
        L_0x007d:
            boolean r0 = r5 instanceof androidx.compose.foundation.interaction.C2237c.C2238a
            if (r0 == 0) goto L_0x0084
            float r0 = r6.f7626c
            goto L_0x007b
        L_0x0084:
            boolean r0 = r5 instanceof androidx.compose.foundation.interaction.C2234b.C2235a
            if (r0 == 0) goto L_0x008b
            float r0 = r6.f7627d
            goto L_0x007b
        L_0x008b:
            float r0 = r6.f7624a
            goto L_0x007b
        L_0x008e:
            r7.mo14918M(r2)
            java.lang.Object r0 = r18.mo14921N()
            java.lang.Object r1 = r4.mo16277a()
            if (r0 != r1) goto L_0x00b1
            androidx.compose.animation.core.Animatable r0 = new androidx.compose.animation.core.Animatable
            androidx.compose.ui.unit.g r11 = androidx.compose.p004ui.unit.C16483g.m74451w(r3)
            androidx.compose.ui.unit.g$a r1 = androidx.compose.p004ui.unit.C16483g.f40871b
            androidx.compose.animation.core.a1 r12 = androidx.compose.animation.core.VectorConvertersKt.m8220e(r1)
            r13 = 0
            r14 = 4
            r15 = 0
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            r7.mo14893C(r0)
        L_0x00b1:
            r18.mo15002m0()
            r8 = r0
            androidx.compose.animation.core.Animatable r8 = (androidx.compose.animation.core.Animatable) r8
            androidx.compose.ui.unit.g r10 = androidx.compose.p004ui.unit.C16483g.m74451w(r3)
            androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2 r11 = new androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$2
            r12 = 0
            r0 = r11
            r1 = r8
            r2 = r16
            r4 = r5
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            androidx.compose.runtime.EffectsKt.m29896h(r10, r11, r7, r9)
            androidx.compose.runtime.k2 r0 = r8.mo6602j()
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x00d7
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00d7:
            r18.mo15002m0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DefaultFloatingActionButtonElevation.mo10126a(androidx.compose.foundation.interaction.e, androidx.compose.runtime.o, int):androidx.compose.runtime.k2");
    }

    public DefaultFloatingActionButtonElevation(float f, float f2, float f3, float f4) {
        this.f7624a = f;
        this.f7625b = f2;
        this.f7626c = f3;
        this.f7627d = f4;
    }
}

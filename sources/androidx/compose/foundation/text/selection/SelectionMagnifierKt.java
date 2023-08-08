package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.C1945a1;
import androidx.compose.animation.core.C1986l;
import androidx.compose.animation.core.C2014v0;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.ComposedModifierKt;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.runtime.C8578k2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nSelectionMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionMagnifier.kt\nandroidx/compose/foundation/text/selection/SelectionMagnifierKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,111:1\n25#2:112\n25#2:119\n1114#3,6:113\n1114#3,6:120\n76#4:126\n*S KotlinDebug\n*F\n+ 1 SelectionMagnifier.kt\nandroidx/compose/foundation/text/selection/SelectionMagnifierKt\n*L\n80#1:112\n81#1:119\n80#1:113,6\n81#1:120,6\n80#1:126\n*E\n"})
public final class SelectionMagnifierKt {
    @C12579k

    /* renamed from: a */
    public static final C1986l f7351a = new C1986l(Float.NaN, Float.NaN);
    @C12579k

    /* renamed from: b */
    public static final C1945a1<C15094f, C1986l> f7352b = VectorConvertersKt.m8216a(SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1.f7355f, SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2.f7356f);

    /* renamed from: c */
    public static final long f7353c;
    @C12579k

    /* renamed from: d */
    public static final C2014v0<C15094f> f7354d;

    static {
        long a = C15096g.m64898a(0.01f, 0.01f);
        f7353c = a;
        f7354d = new C2014v0(0.0f, 0.0f, C15094f.m64868d(a), 3, (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: g */
    public static final C8767m m12711g(@C12579k C8767m mVar, @C12579k C11289a<C15094f> aVar, @C12579k C11300l<? super C11289a<C15094f>, ? extends C8767m> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "magnifierCenter");
        Intrinsics.checkNotNullParameter(lVar, "platformMagnifier");
        return ComposedModifierKt.m32287j(mVar, (C11300l) null, new SelectionMagnifierKt$animatedSelectionMagnifier$1(aVar, lVar), 1, (Object) null);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [kotlin.jvm.functions.a<androidx.compose.ui.geometry.f>, kotlin.jvm.functions.a] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.compose.runtime.C8540g
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.runtime.C8578k2<androidx.compose.p004ui.geometry.C15094f> m12712h(kotlin.jvm.functions.C11289a<androidx.compose.p004ui.geometry.C15094f> r4, androidx.compose.runtime.C8592o r5, int r6) {
        /*
            r0 = -1589795249(0xffffffffa13da64f, float:-6.42558E-19)
            r5.mo14918M(r0)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0012
            r1 = -1
            java.lang.String r2 = "androidx.compose.foundation.text.selection.rememberAnimatedMagnifierPosition (SelectionMagnifier.kt:76)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r6, r1, r2)
        L_0x0012:
            r6 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r5.mo14918M(r6)
            java.lang.Object r0 = r5.mo14921N()
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r1.mo16277a()
            if (r0 != r2) goto L_0x002b
            androidx.compose.runtime.k2 r0 = androidx.compose.runtime.C8415c2.m30235d(r4)
            r5.mo14893C(r0)
        L_0x002b:
            r5.mo15002m0()
            androidx.compose.runtime.k2 r0 = (androidx.compose.runtime.C8578k2) r0
            r5.mo14918M(r6)
            java.lang.Object r4 = r5.mo14921N()
            java.lang.Object r6 = r1.mo16277a()
            if (r4 != r6) goto L_0x0059
            androidx.compose.animation.core.Animatable r4 = new androidx.compose.animation.core.Animatable
            long r1 = m12713i(r0)
            androidx.compose.ui.geometry.f r6 = androidx.compose.p004ui.geometry.C15094f.m64868d(r1)
            androidx.compose.animation.core.a1 r1 = f7352b
            long r2 = f7353c
            androidx.compose.ui.geometry.f r2 = androidx.compose.p004ui.geometry.C15094f.m64868d(r2)
            r4.<init>(r6, r1, r2)
            r5.mo14893C(r4)
        L_0x0059:
            r5.mo15002m0()
            androidx.compose.animation.core.Animatable r4 = (androidx.compose.animation.core.Animatable) r4
            kotlin.d2 r6 = kotlin.C11079d2.f28267a
            androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1 r1 = new androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1
            r2 = 0
            r1.<init>(r0, r4, r2)
            r0 = 70
            androidx.compose.runtime.EffectsKt.m29896h(r6, r1, r5, r0)
            androidx.compose.runtime.k2 r4 = r4.mo6602j()
            boolean r6 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r6 == 0) goto L_0x0078
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0078:
            r5.mo15002m0()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionMagnifierKt.m12712h(kotlin.jvm.functions.a, androidx.compose.runtime.o, int):androidx.compose.runtime.k2");
    }

    /* renamed from: i */
    public static final long m12713i(C8578k2<C15094f> k2Var) {
        return k2Var.getValue().mo42242A();
    }
}

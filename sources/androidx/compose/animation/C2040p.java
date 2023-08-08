package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.C1968g;
import androidx.compose.animation.core.C1972h;
import androidx.compose.animation.core.C1994n;
import androidx.compose.animation.core.C2014v0;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nSingleValueAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleValueAnimation.kt\nandroidx/compose/animation/SingleValueAnimationKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,110:1\n36#2:111\n1057#3,6:112\n*S KotlinDebug\n*F\n+ 1 SingleValueAnimation.kt\nandroidx/compose/animation/SingleValueAnimationKt\n*L\n63#1:111\n63#1:112,6\n*E\n"})
/* renamed from: androidx.compose.animation.p */
public final class C2040p {
    @C12579k

    /* renamed from: a */
    public static final C2014v0<C15240j2> f5685a = C1972h.m8390o(0.0f, 0.0f, (Object) null, 7, (Object) null);

    @C12579k
    /* renamed from: a */
    public static final Animatable<C15240j2, C1994n> m8741a(long j) {
        return new Animatable(C15240j2.m66071n(j), ColorVectorConverterKt.m7783d(C15240j2.f37547b).invoke(C15240j2.m66051E(j)), (Object) null, (String) null, 12, (DefaultConstructorMarker) null);
    }

    @C8540g
    @C11395k(level = DeprecationLevel.f28051c, message = "animate*AsState APIs now have a new label parameter added.")
    /* renamed from: b */
    public static final /* synthetic */ C8578k2 m8742b(long j, C1968g gVar, C11300l lVar, C8592o oVar, int i, int i2) {
        oVar.mo14918M(-1942442407);
        if ((i2 & 2) != 0) {
            gVar = f5685a;
        }
        C1968g gVar2 = gVar;
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        C11300l lVar2 = lVar;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-1942442407, i, -1, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:75)");
        }
        C8578k2<C15240j2> c = m8743c(j, gVar2, (String) null, lVar2, oVar, (i & 14) | 64 | ((i << 3) & 7168), 4);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: androidx.compose.animation.core.a1} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @org.jetbrains.annotations.C12579k
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.runtime.C8578k2<androidx.compose.p004ui.graphics.C15240j2> m8743c(long r10, @org.jetbrains.annotations.C12580l androidx.compose.animation.core.C1968g<androidx.compose.p004ui.graphics.C15240j2> r12, @org.jetbrains.annotations.C12580l java.lang.String r13, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super androidx.compose.p004ui.graphics.C15240j2, kotlin.C11079d2> r14, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r15, int r16, int r17) {
        /*
            r9 = r15
            r0 = r16
            r1 = -451899108(0xffffffffe510911c, float:-4.26686E22)
            r15.mo14918M(r1)
            r2 = r17 & 2
            if (r2 == 0) goto L_0x0010
            androidx.compose.animation.core.v0<androidx.compose.ui.graphics.j2> r2 = f5685a
            goto L_0x0011
        L_0x0010:
            r2 = r12
        L_0x0011:
            r3 = r17 & 4
            if (r3 == 0) goto L_0x0019
            java.lang.String r3 = "ColorAnimation"
            r4 = r3
            goto L_0x001a
        L_0x0019:
            r4 = r13
        L_0x001a:
            r3 = r17 & 8
            if (r3 == 0) goto L_0x0021
            r3 = 0
            r5 = r3
            goto L_0x0022
        L_0x0021:
            r5 = r14
        L_0x0022:
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x002e
            r3 = -1
            java.lang.String r6 = "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:56)"
            androidx.compose.runtime.ComposerKt.m29845w0(r1, r0, r3, r6)
        L_0x002e:
            androidx.compose.ui.graphics.colorspace.c r1 = androidx.compose.p004ui.graphics.C15240j2.m66051E(r10)
            r3 = 1157296644(0x44faf204, float:2007.563)
            r15.mo14918M(r3)
            boolean r1 = r15.mo15006n0(r1)
            java.lang.Object r3 = r15.mo14921N()
            if (r1 != 0) goto L_0x004a
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            if (r3 != r1) goto L_0x005e
        L_0x004a:
            androidx.compose.ui.graphics.j2$a r1 = androidx.compose.p004ui.graphics.C15240j2.f37547b
            kotlin.jvm.functions.l r1 = androidx.compose.animation.ColorVectorConverterKt.m7783d(r1)
            androidx.compose.ui.graphics.colorspace.c r3 = androidx.compose.p004ui.graphics.C15240j2.m66051E(r10)
            java.lang.Object r1 = r1.invoke(r3)
            r3 = r1
            androidx.compose.animation.core.a1 r3 = (androidx.compose.animation.core.C1945a1) r3
            r15.mo14893C(r3)
        L_0x005e:
            r15.mo15002m0()
            r1 = r3
            androidx.compose.animation.core.a1 r1 = (androidx.compose.animation.core.C1945a1) r1
            androidx.compose.ui.graphics.j2 r3 = androidx.compose.p004ui.graphics.C15240j2.m66071n(r10)
            r6 = 0
            r7 = r0 & 14
            r7 = r7 | 576(0x240, float:8.07E-43)
            int r0 = r0 << 6
            r8 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r0
            r7 = r7 | r8
            r8 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r8
            r7 = r7 | r0
            r8 = 8
            r0 = r3
            r3 = r6
            r6 = r15
            androidx.compose.runtime.k2 r0 = androidx.compose.animation.core.AnimateAsStateKt.m7985s(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x008a
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x008a:
            r15.mo15002m0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.C2040p.m8743c(long, androidx.compose.animation.core.g, java.lang.String, kotlin.jvm.functions.l, androidx.compose.runtime.o, int, int):androidx.compose.runtime.k2");
    }
}

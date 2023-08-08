package androidx.compose.foundation;

import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.C8744d;
import androidx.compose.p004ui.draw.C8754l;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.C15299q2;
import androidx.compose.p004ui.graphics.C15403w2;
import androidx.compose.p004ui.graphics.painter.Painter;
import androidx.compose.p004ui.graphics.vector.C15340c;
import androidx.compose.p004ui.graphics.vector.VectorPainter;
import androidx.compose.p004ui.graphics.vector.VectorPainterKt;
import androidx.compose.p004ui.layout.C15541c;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Image.kt\nandroidx/compose/foundation/ImageKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,269:1\n36#2:270\n36#2:277\n456#2,14:297\n1114#3,6:271\n1114#3,6:278\n74#4:284\n75#4,11:286\n88#4:311\n76#5:285\n*S KotlinDebug\n*F\n+ 1 Image.kt\nandroidx/compose/foundation/ImageKt\n*L\n154#1:270\n246#1:277\n256#1:297,14\n154#1:271,6\n246#1:278,6\n256#1:284\n256#1:286,11\n256#1:311\n256#1:285\n*E\n"})
public final class ImageKt {
    @C8540g
    @C11395k(level = DeprecationLevel.f28051c, message = "Consider usage of the Image composable that consumes an optional FilterQuality parameter", replaceWith = @C11587t0(expression = "Image(bitmap, contentDescription, modifier, alignment, contentScale, alpha, colorFilter, DefaultFilterQuality)", imports = {"androidx.compose.foundation", "androidx.compose.ui.graphics.DefaultAlpha", "androidx.compose.ui.Alignment", "androidx.compose.ui.graphics.drawscope.DrawScope.Companion.DefaultFilterQuality", "androidx.compose.ui.layout.ContentScale.Fit"}))
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final /* synthetic */ void m8966a(C15403w2 w2Var, String str, C8767m mVar, C8734c cVar, C15541c cVar2, float f, C15249k2 k2Var, C8592o oVar, int i, int i2) {
        C8767m.C8768a aVar;
        C8734c cVar3;
        C15541c cVar4;
        float f2;
        C15249k2 k2Var2;
        int i3 = i;
        C15403w2 w2Var2 = w2Var;
        Intrinsics.checkNotNullParameter(w2Var, "bitmap");
        oVar.mo14918M(-2123228673);
        if ((i2 & 4) != 0) {
            aVar = C8767m.f23478j;
        } else {
            aVar = mVar;
        }
        if ((i2 & 8) != 0) {
            cVar3 = C8734c.f23406a.mo17066i();
        } else {
            cVar3 = cVar;
        }
        if ((i2 & 16) != 0) {
            cVar4 = C15541c.f38696a.mo44373i();
        } else {
            cVar4 = cVar2;
        }
        if ((i2 & 32) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i2 & 64) != 0) {
            k2Var2 = null;
        } else {
            k2Var2 = k2Var;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-2123228673, i3, -1, "androidx.compose.foundation.Image (Image.kt:87)");
        }
        m8969d(w2Var, str, aVar, cVar3, cVar4, f2, k2Var2, C15299q2.f37647b.mo42973b(), oVar, (i3 & 112) | 8 | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (i3 & 3670016), 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: b */
    public static final void m8967b(@C12579k Painter painter, @C12580l String str, @C12580l C8767m mVar, @C12580l C8734c cVar, @C12580l C15541c cVar2, float f, @C12580l C15249k2 k2Var, @C12580l C8592o oVar, int i, int i2) {
        C8767m.C8768a aVar;
        C8734c cVar3;
        C15541c cVar4;
        float f2;
        C15249k2 k2Var2;
        C8767m mVar2;
        String str2 = str;
        Intrinsics.checkNotNullParameter(painter, "painter");
        C8592o o = oVar.mo15009o(1142754848);
        if ((i2 & 4) != 0) {
            aVar = C8767m.f23478j;
        } else {
            aVar = mVar;
        }
        if ((i2 & 8) != 0) {
            cVar3 = C8734c.f23406a.mo17066i();
        } else {
            cVar3 = cVar;
        }
        if ((i2 & 16) != 0) {
            cVar4 = C15541c.f38696a.mo44373i();
        } else {
            cVar4 = cVar2;
        }
        if ((i2 & 32) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i2 & 64) != 0) {
            k2Var2 = null;
        } else {
            k2Var2 = k2Var;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1142754848, i, -1, "androidx.compose.foundation.Image (Image.kt:235)");
        } else {
            int i3 = i;
        }
        o.mo14918M(-816794123);
        if (str2 != null) {
            C8767m.C8768a aVar2 = C8767m.f23478j;
            o.mo14918M(1157296644);
            boolean n0 = o.mo15006n0(str2);
            Object N = o.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new ImageKt$Image$semantics$1$1(str2);
                o.mo14893C(N);
            }
            o.mo15002m0();
            mVar2 = SemanticsModifierKt.m71868c(aVar2, false, (C11300l) N, 1, (Object) null);
        } else {
            mVar2 = C8767m.f23478j;
        }
        o.mo15002m0();
        C8767m b = C8754l.m32556b(C8744d.m32515b(aVar.mo17224k3(mVar2)), painter, false, cVar3, cVar4, f2, k2Var2, 2, (Object) null);
        ImageKt$Image$2 imageKt$Image$2 = ImageKt$Image$2.f5746a;
        o.mo14918M(-1323940314);
        C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
        ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
        C11289a<ComposeUiNode> a = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f3 = LayoutKt.m68908f(b);
        if (!(o.mo15017r() instanceof C8428d)) {
            ComposablesKt.m29519n();
        }
        o.mo14938T();
        if (o.mo14997l()) {
            o.mo14947W(a);
        } else {
            o.mo14888A();
        }
        C8592o b2 = Updater.m30180b(o);
        Updater.m30188j(b2, imageKt$Image$2, companion.mo44588d());
        Updater.m30188j(b2, dVar, companion.mo44586b());
        Updater.m30188j(b2, layoutDirection, companion.mo44587c());
        Updater.m30188j(b2, c4Var, companion.mo44590f());
        f3.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
        o.mo14918M(2058660585);
        o.mo15002m0();
        o.mo14896D();
        o.mo15002m0();
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new ImageKt$Image$3(painter, str, aVar, cVar3, cVar4, f2, k2Var2, i, i2));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: c */
    public static final void m8968c(@C12579k C15340c cVar, @C12580l String str, @C12580l C8767m mVar, @C12580l C8734c cVar2, @C12580l C15541c cVar3, float f, @C12580l C15249k2 k2Var, @C12580l C8592o oVar, int i, int i2) {
        C8767m mVar2;
        C8734c cVar4;
        C15541c cVar5;
        float f2;
        C15249k2 k2Var2;
        C15340c cVar6 = cVar;
        C8592o oVar2 = oVar;
        int i3 = i;
        Intrinsics.checkNotNullParameter(cVar, "imageVector");
        oVar2.mo14918M(1595907091);
        if ((i2 & 4) != 0) {
            mVar2 = C8767m.f23478j;
        } else {
            mVar2 = mVar;
        }
        if ((i2 & 8) != 0) {
            cVar4 = C8734c.f23406a.mo17066i();
        } else {
            cVar4 = cVar2;
        }
        if ((i2 & 16) != 0) {
            cVar5 = C15541c.f38696a.mo44373i();
        } else {
            cVar5 = cVar3;
        }
        if ((i2 & 32) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i2 & 64) != 0) {
            k2Var2 = null;
        } else {
            k2Var2 = k2Var;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(1595907091, i3, -1, "androidx.compose.foundation.Image (Image.kt:189)");
        }
        m8967b(VectorPainterKt.m66824c(cVar, oVar2, i3 & 14), str, mVar2, cVar4, cVar5, f2, k2Var2, oVar, VectorPainter.f37795Y | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (i3 & 3670016), 0);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: androidx.compose.ui.graphics.painter.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: androidx.compose.ui.m$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m8969d(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.graphics.C15403w2 r16, @org.jetbrains.annotations.C12580l java.lang.String r17, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r18, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8734c r19, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.layout.C15541c r20, float r21, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.C15249k2 r22, int r23, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r24, int r25, int r26) {
        /*
            r0 = r16
            r10 = r24
            r8 = r25
            r1 = r26
            java.lang.String r2 = "bitmap"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            r2 = -1396260732(0xffffffffacc6c084, float:-5.648872E-12)
            r10.mo14918M(r2)
            r3 = r1 & 4
            if (r3 == 0) goto L_0x001b
            androidx.compose.ui.m$a r3 = androidx.compose.p004ui.C8767m.f23478j
            r9 = r3
            goto L_0x001d
        L_0x001b:
            r9 = r18
        L_0x001d:
            r3 = r1 & 8
            if (r3 == 0) goto L_0x0029
            androidx.compose.ui.c$a r3 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r3 = r3.mo17066i()
            r11 = r3
            goto L_0x002b
        L_0x0029:
            r11 = r19
        L_0x002b:
            r3 = r1 & 16
            if (r3 == 0) goto L_0x0037
            androidx.compose.ui.layout.c$a r3 = androidx.compose.p004ui.layout.C15541c.f38696a
            androidx.compose.ui.layout.c r3 = r3.mo44373i()
            r12 = r3
            goto L_0x0039
        L_0x0037:
            r12 = r20
        L_0x0039:
            r3 = r1 & 32
            if (r3 == 0) goto L_0x0041
            r3 = 1065353216(0x3f800000, float:1.0)
            r13 = r3
            goto L_0x0043
        L_0x0041:
            r13 = r21
        L_0x0043:
            r3 = r1 & 64
            if (r3 == 0) goto L_0x004a
            r3 = 0
            r14 = r3
            goto L_0x004c
        L_0x004a:
            r14 = r22
        L_0x004c:
            r1 = r1 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0058
            androidx.compose.ui.graphics.drawscope.e$a r1 = androidx.compose.p004ui.graphics.drawscope.C15187e.f37500l
            int r1 = r1.mo42720b()
            r5 = r1
            goto L_0x005a
        L_0x0058:
            r5 = r23
        L_0x005a:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0066
            r1 = -1
            java.lang.String r3 = "androidx.compose.foundation.Image (Image.kt:143)"
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r8, r1, r3)
        L_0x0066:
            r1 = 1157296644(0x44faf204, float:2007.563)
            r10.mo14918M(r1)
            boolean r1 = r10.mo15006n0(r0)
            java.lang.Object r2 = r24.mo14921N()
            if (r1 != 0) goto L_0x007e
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r1 = r1.mo16277a()
            if (r2 != r1) goto L_0x008d
        L_0x007e:
            r1 = 0
            r3 = 0
            r6 = 6
            r7 = 0
            r0 = r16
            androidx.compose.ui.graphics.painter.a r2 = androidx.compose.p004ui.graphics.painter.C15293b.m66421b(r0, r1, r3, r5, r6, r7)
            r10.mo14893C(r2)
        L_0x008d:
            r24.mo15002m0()
            r0 = r2
            androidx.compose.ui.graphics.painter.a r0 = (androidx.compose.p004ui.graphics.painter.C15292a) r0
            r1 = r8 & 112(0x70, float:1.57E-43)
            r1 = r1 | 8
            r2 = r8 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            r2 = r8 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r8
            r1 = r1 | r2
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r8
            r1 = r1 | r2
            r2 = 3670016(0x380000, float:5.142788E-39)
            r2 = r2 & r8
            r8 = r1 | r2
            r15 = 0
            r1 = r17
            r2 = r9
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r24
            r9 = r15
            m8967b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00c2
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00c2:
            r24.mo15002m0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.ImageKt.m8969d(androidx.compose.ui.graphics.w2, java.lang.String, androidx.compose.ui.m, androidx.compose.ui.c, androidx.compose.ui.layout.c, float, androidx.compose.ui.graphics.k2, int, androidx.compose.runtime.o, int, int):void");
    }
}

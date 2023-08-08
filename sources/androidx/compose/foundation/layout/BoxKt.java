package androidx.compose.foundation.layout;

import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16502r;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import com.bumptech.glide.load.data.mediastore.C22132b;
import com.urbanairship.iam.C9168d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,287:1\n75#2:288\n76#2,11:290\n89#2:317\n75#2:326\n76#2,11:328\n89#2:355\n76#3:289\n76#3:327\n460#4,16:301\n50#4:318\n49#4:319\n460#4,16:339\n1057#5,6:320\n*S KotlinDebug\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n72#1:288\n72#1:290,11\n72#1:317\n201#1:326\n201#1:328,11\n201#1:355\n72#1:289\n201#1:327\n72#1:301,16\n87#1:318\n87#1:319\n201#1:339,16\n87#1:320,6\n*E\n"})
public final class BoxKt {
    @C12579k

    /* renamed from: a */
    public static final C15560f0 f6039a = m9843e(C8734c.f23406a.mo17061C(), false);
    @C12579k

    /* renamed from: b */
    public static final C15560f0 f6040b = BoxKt$EmptyBoxMeasurePolicy$1.f6041a;

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public static final void m9839a(@C12579k C8767m mVar, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(mVar, "modifier");
        C8592o o = oVar.mo15009o(-211209833);
        if ((i & 14) == 0) {
            if (o.mo15006n0(mVar)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-211209833, i2, -1, "androidx.compose.foundation.layout.Box (Box.kt:199)");
            }
            C15560f0 f0Var = f6040b;
            int i4 = ((i2 << 3) & 112) | C22132b.f56831b;
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(mVar);
            int i5 = ((i4 << 9) & 7168) | 6;
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo14938T();
            if (o.mo14997l()) {
                o.mo14947W(a);
            } else {
                o.mo14888A();
            }
            o.mo14941U();
            C8592o b = Updater.m30180b(o);
            Updater.m30188j(b, f0Var, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            o.mo14972e();
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, Integer.valueOf((i5 >> 3) & 112));
            o.mo14918M(2058660585);
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new BoxKt$Box$3(mVar, i));
        }
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: b */
    public static final void m9840b(@C12580l C8767m mVar, @C12580l C8734c cVar, boolean z, @C12579k C11305q<? super C2362h, ? super C8592o, ? super Integer, C11079d2> qVar, @C12580l C8592o oVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(qVar, "content");
        oVar.mo14918M(733328855);
        if ((i2 & 1) != 0) {
            mVar = C8767m.f23478j;
        }
        if ((i2 & 2) != 0) {
            cVar = C8734c.f23406a.mo17061C();
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        int i3 = i >> 3;
        C15560f0 k = m9849k(cVar, z, oVar, (i3 & 112) | (i3 & 14));
        oVar.mo14918M(-1323940314);
        C16479d dVar = (C16479d) oVar.mo15032w(CompositionLocalsKt.m71011i());
        LayoutDirection layoutDirection = (LayoutDirection) oVar.mo15032w(CompositionLocalsKt.m71018p());
        C15863c4 c4Var = (C15863c4) oVar.mo15032w(CompositionLocalsKt.m71025w());
        ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
        C11289a<ComposeUiNode> a = companion.mo44585a();
        C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(mVar);
        int i4 = ((((i << 3) & 112) << 9) & 7168) | 6;
        if (!(oVar.mo15017r() instanceof C8428d)) {
            ComposablesKt.m29519n();
        }
        oVar.mo14938T();
        if (oVar.mo14997l()) {
            oVar.mo14947W(a);
        } else {
            oVar.mo14888A();
        }
        oVar.mo14941U();
        C8592o b = Updater.m30180b(oVar);
        Updater.m30188j(b, k, companion.mo44588d());
        Updater.m30188j(b, dVar, companion.mo44586b());
        Updater.m30188j(b, layoutDirection, companion.mo44587c());
        Updater.m30188j(b, c4Var, companion.mo44590f());
        oVar.mo14972e();
        f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar, Integer.valueOf((i4 >> 3) & 112));
        oVar.mo14918M(2058660585);
        qVar.invoke(BoxScopeInstance.f6046a, oVar, Integer.valueOf(((i >> 6) & 112) | 6));
        oVar.mo15002m0();
        oVar.mo14896D();
        oVar.mo15002m0();
        oVar.mo15002m0();
    }

    @C12579k
    /* renamed from: e */
    public static final C15560f0 m9843e(@C12579k C8734c cVar, boolean z) {
        Intrinsics.checkNotNullParameter(cVar, C9168d0.f24891y);
        return new BoxKt$boxMeasurePolicy$1(z, cVar);
    }

    /* renamed from: f */
    public static final C2359g m9844f(C15557e0 e0Var) {
        Object c = e0Var.mo44319c();
        if (c instanceof C2359g) {
            return (C2359g) c;
        }
        return null;
    }

    @C12579k
    /* renamed from: g */
    public static final C15560f0 m9845g() {
        return f6039a;
    }

    @C12579k
    /* renamed from: h */
    public static final C15560f0 m9846h() {
        return f6040b;
    }

    /* renamed from: i */
    public static final boolean m9847i(C15557e0 e0Var) {
        C2359g f = m9844f(e0Var);
        if (f != null) {
            return f.mo8062s();
        }
        return false;
    }

    /* renamed from: j */
    public static final void m9848j(C15611w0.C15612a aVar, C15611w0 w0Var, C15557e0 e0Var, LayoutDirection layoutDirection, int i, int i2, C8734c cVar) {
        C8734c cVar2;
        C8734c r;
        C2359g f = m9844f(e0Var);
        if (f == null || (r = f.mo8061r()) == null) {
            cVar2 = cVar;
        } else {
            cVar2 = r;
        }
        C15611w0.C15612a.m69413r(aVar, w0Var, cVar2.mo17059a(C16502r.m74668a(w0Var.mo44471K0(), w0Var.mo44468G0()), C16502r.m74668a(i, i2), layoutDirection), 0.0f, 2, (Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: androidx.compose.ui.layout.f0} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @org.jetbrains.annotations.C12579k
    @kotlin.C11532s0
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p004ui.layout.C15560f0 m9849k(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.C8734c r3, boolean r4, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r5, int r6) {
        /*
            java.lang.String r0 = "alignment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 56522820(0x35e7844, float:6.5377995E-37)
            r5.mo14918M(r0)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x0017
            r1 = -1
            java.lang.String r2 = "androidx.compose.foundation.layout.rememberBoxMeasurePolicy (Box.kt:80)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r6, r1, r2)
        L_0x0017:
            androidx.compose.ui.c$a r6 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r6 = r6.mo17061C()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r6)
            if (r6 == 0) goto L_0x0028
            if (r4 != 0) goto L_0x0028
            androidx.compose.ui.layout.f0 r3 = f6039a
            goto L_0x0056
        L_0x0028:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r5.mo14918M(r0)
            boolean r0 = r5.mo15006n0(r3)
            boolean r6 = r5.mo15006n0(r6)
            r6 = r6 | r0
            java.lang.Object r0 = r5.mo14921N()
            if (r6 != 0) goto L_0x0049
            androidx.compose.runtime.o$a r6 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r6 = r6.mo16277a()
            if (r0 != r6) goto L_0x0050
        L_0x0049:
            androidx.compose.ui.layout.f0 r0 = m9843e(r3, r4)
            r5.mo14893C(r0)
        L_0x0050:
            r5.mo15002m0()
            r3 = r0
            androidx.compose.ui.layout.f0 r3 = (androidx.compose.p004ui.layout.C15560f0) r3
        L_0x0056:
            boolean r4 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r4 == 0) goto L_0x005f
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x005f:
            r5.mo15002m0()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.BoxKt.m9849k(androidx.compose.ui.c, boolean, androidx.compose.runtime.o, int):androidx.compose.ui.layout.f0");
    }
}

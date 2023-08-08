package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Updater;
import kotlin.C11079d2;
import kotlin.C11532s0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nColumn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,250:1\n75#2:251\n76#2,11:253\n89#2:280\n76#3:252\n460#4,16:264\n50#4:281\n49#4:282\n1057#5,6:283\n*S KotlinDebug\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n*L\n79#1:251\n79#1:253,11\n79#1:280\n79#1:252\n79#1:264,16\n105#1:281\n105#1:282\n105#1:283,6\n*E\n"})
public final class ColumnKt {
    @C12579k

    /* renamed from: a */
    public static final C15560f0 f6047a;

    static {
        LayoutOrientation layoutOrientation = LayoutOrientation.Vertical;
        float a = Arrangement.f6010a.mo7631r().mo7658a();
        C2380m i = C2380m.f6293a.mo8126i(C8734c.f23406a.mo17072u());
        f6047a = RowColumnImplKt.m10061r(layoutOrientation, ColumnKt$DefaultColumnMeasurePolicy$1.f6048f, a, SizeMode.Wrap, i);
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    public static final void m9862a(@C12580l C8767m mVar, @C12580l Arrangement.C2279l lVar, @C12580l C8734c.C8736b bVar, @C12579k C11305q<? super C2373k, ? super C8592o, ? super Integer, C11079d2> qVar, @C12580l C8592o oVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(qVar, "content");
        oVar.mo14918M(-483455358);
        if ((i2 & 1) != 0) {
            mVar = C8767m.f23478j;
        }
        if ((i2 & 2) != 0) {
            lVar = Arrangement.f6010a.mo7631r();
        }
        if ((i2 & 4) != 0) {
            bVar = C8734c.f23406a.mo17072u();
        }
        int i3 = i >> 3;
        C15560f0 b = m9863b(lVar, bVar, oVar, (i3 & 112) | (i3 & 14));
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
        C8592o b2 = Updater.m30180b(oVar);
        Updater.m30188j(b2, b, companion.mo44588d());
        Updater.m30188j(b2, dVar, companion.mo44586b());
        Updater.m30188j(b2, layoutDirection, companion.mo44587c());
        Updater.m30188j(b2, c4Var, companion.mo44590f());
        oVar.mo14972e();
        f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar, Integer.valueOf((i4 >> 3) & 112));
        oVar.mo14918M(2058660585);
        qVar.invoke(ColumnScopeInstance.f6049a, oVar, Integer.valueOf(((i >> 6) & 112) | 6));
        oVar.mo15002m0();
        oVar.mo14896D();
        oVar.mo15002m0();
        oVar.mo15002m0();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: androidx.compose.ui.layout.f0} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @org.jetbrains.annotations.C12579k
    @kotlin.C11532s0
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p004ui.layout.C15560f0 m9863b(@org.jetbrains.annotations.C12579k androidx.compose.foundation.layout.Arrangement.C2279l r3, @org.jetbrains.annotations.C12579k androidx.compose.p004ui.C8734c.C8736b r4, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r5, int r6) {
        /*
            java.lang.String r0 = "verticalArrangement"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "horizontalAlignment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 1089876336(0x40f63170, float:7.693535)
            r5.mo14918M(r0)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x001c
            r1 = -1
            java.lang.String r2 = "androidx.compose.foundation.layout.columnMeasurePolicy (Column.kt:98)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r6, r1, r2)
        L_0x001c:
            androidx.compose.foundation.layout.Arrangement r6 = androidx.compose.foundation.layout.Arrangement.f6010a
            androidx.compose.foundation.layout.Arrangement$l r6 = r6.mo7631r()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r6)
            if (r6 == 0) goto L_0x0037
            androidx.compose.ui.c$a r6 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c$b r6 = r6.mo17072u()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r6)
            if (r6 == 0) goto L_0x0037
            androidx.compose.ui.layout.f0 r3 = f6047a
            goto L_0x0074
        L_0x0037:
            r6 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r5.mo14918M(r6)
            boolean r6 = r5.mo15006n0(r3)
            boolean r0 = r5.mo15006n0(r4)
            r6 = r6 | r0
            java.lang.Object r0 = r5.mo14921N()
            if (r6 != 0) goto L_0x0054
            androidx.compose.runtime.o$a r6 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r6 = r6.mo16277a()
            if (r0 != r6) goto L_0x006e
        L_0x0054:
            androidx.compose.foundation.layout.LayoutOrientation r6 = androidx.compose.foundation.layout.LayoutOrientation.Vertical
            float r0 = r3.mo7658a()
            androidx.compose.foundation.layout.m$c r1 = androidx.compose.foundation.layout.C2380m.f6293a
            androidx.compose.foundation.layout.m r4 = r1.mo8126i(r4)
            androidx.compose.foundation.layout.SizeMode r1 = androidx.compose.foundation.layout.SizeMode.Wrap
            androidx.compose.foundation.layout.ColumnKt$columnMeasurePolicy$1$1 r2 = new androidx.compose.foundation.layout.ColumnKt$columnMeasurePolicy$1$1
            r2.<init>(r3)
            androidx.compose.ui.layout.f0 r0 = androidx.compose.foundation.layout.RowColumnImplKt.m10061r(r6, r2, r0, r1, r4)
            r5.mo14893C(r0)
        L_0x006e:
            r5.mo15002m0()
            r3 = r0
            androidx.compose.ui.layout.f0 r3 = (androidx.compose.p004ui.layout.C15560f0) r3
        L_0x0074:
            boolean r4 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r4 == 0) goto L_0x007d
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x007d:
            r5.mo15002m0()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.ColumnKt.m9863b(androidx.compose.foundation.layout.Arrangement$l, androidx.compose.ui.c$b, androidx.compose.runtime.o, int):androidx.compose.ui.layout.f0");
    }

    @C12579k
    /* renamed from: c */
    public static final C15560f0 m9864c() {
        return f6047a;
    }

    @C11532s0
    /* renamed from: d */
    public static /* synthetic */ void m9865d() {
    }
}

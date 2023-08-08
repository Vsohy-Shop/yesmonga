package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.C2761b0;
import androidx.compose.foundation.text.ContextMenu_androidKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.hapticfeedback.C15425a;
import androidx.compose.p004ui.platform.C15912k0;
import androidx.compose.p004ui.platform.C15996x3;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8572j1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8700z0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.C8553b;
import com.bumptech.glide.load.data.mediastore.C22132b;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSelectionContainer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionContainer.kt\nandroidx/compose/foundation/text/selection/SelectionContainerKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,144:1\n25#2:145\n36#2:152\n25#2:159\n25#2:166\n1114#3,6:146\n1114#3,6:153\n1114#3,6:160\n1114#3,6:167\n76#4:173\n76#4:174\n76#4:175\n76#5:176\n102#5,2:177\n*S KotlinDebug\n*F\n+ 1 SelectionContainer.kt\nandroidx/compose/foundation/text/selection/SelectionContainerKt\n*L\n43#1:145\n47#1:152\n85#1:159\n86#1:166\n43#1:146,6\n47#1:153,6\n85#1:160,6\n86#1:167,6\n88#1:173\n89#1:174\n90#1:175\n43#1:176\n43#1:177,2\n*E\n"})
public final class SelectionContainerKt {
    @C8540g
    @C8544h(scheme = "[0[0]]")
    /* renamed from: a */
    public static final void m12695a(@C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(pVar, "content");
        C8592o o = oVar.mo15009o(336063542);
        if ((i & 14) == 0) {
            if (o.mo14927P(pVar)) {
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
                ComposerKt.m29845w0(336063542, i2, -1, "androidx.compose.foundation.text.selection.DisableSelection (SelectionContainer.kt:60)");
            }
            CompositionLocalKt.m29856b(new C8572j1[]{SelectionRegistrarKt.m12853a().mo16141f(null)}, pVar, o, ((i2 << 3) & 112) | 8);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new SelectionContainerKt$DisableSelection$1(pVar, i));
        }
    }

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: b */
    public static final void m12696b(@C12580l C8767m mVar, @C12580l C2830i iVar, @C12579k C11300l<? super C2830i, C11079d2> lVar, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar, @C12580l C8592o oVar, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(lVar, "onSelectionChange");
        Intrinsics.checkNotNullParameter(pVar, "children");
        C8592o o = oVar.mo15009o(2078139907);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (o.mo15006n0(mVar)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (o.mo15006n0(iVar)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i2 & 4) != 0) {
            i3 |= C22132b.f56831b;
        } else if ((i & 896) == 0) {
            if (o.mo14927P(lVar)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (o.mo14927P(pVar)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        int i9 = i3;
        if ((i9 & 5851) != 1170 || !o.mo15011p()) {
            if (i8 != 0) {
                mVar = C8767m.f23478j;
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(2078139907, i9, -1, "androidx.compose.foundation.text.selection.SelectionContainer (SelectionContainer.kt:75)");
            }
            o.mo14918M(-492369756);
            Object N = o.mo14921N();
            C8592o.C8593a aVar = C8592o.f23032a;
            if (N == aVar.mo16277a()) {
                N = new SelectionRegistrarImpl();
                o.mo14893C(N);
            }
            o.mo15002m0();
            SelectionRegistrarImpl selectionRegistrarImpl = (SelectionRegistrarImpl) N;
            o.mo14918M(-492369756);
            Object N2 = o.mo14921N();
            if (N2 == aVar.mo16277a()) {
                N2 = new SelectionManager(selectionRegistrarImpl);
                o.mo14893C(N2);
            }
            o.mo15002m0();
            SelectionManager selectionManager = (SelectionManager) N2;
            selectionManager.mo9648Y((C15425a) o.mo15032w(CompositionLocalsKt.m71016n()));
            selectionManager.mo9640Q((C15912k0) o.mo15032w(CompositionLocalsKt.m71010h()));
            selectionManager.mo9653d0((C15996x3) o.mo15032w(CompositionLocalsKt.m71023u()));
            selectionManager.mo9650a0(lVar);
            selectionManager.mo9651b0(iVar);
            selectionManager.mo9654e0(C2761b0.m12554a());
            ContextMenu_androidKt.m12244a(selectionManager, C8553b.m31048b(o, -123806316, true, new SelectionContainerKt$SelectionContainer$3(selectionRegistrarImpl, mVar, selectionManager, pVar, i9)), o, 56);
            EffectsKt.m29891c(selectionManager, new SelectionContainerKt$SelectionContainer$4(selectionManager), o, 8);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8767m mVar2 = mVar;
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new SelectionContainerKt$SelectionContainer$5(mVar2, iVar, lVar, pVar, i, i2));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: kotlin.jvm.functions.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m12697c(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r8, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r9, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r10, int r11, int r12) {
        /*
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = -1075498320(0xffffffffbfe532b0, float:-1.7906094)
            androidx.compose.runtime.o r10 = r10.mo15009o(r0)
            r1 = r12 & 1
            r2 = 2
            if (r1 == 0) goto L_0x0014
            r3 = r11 | 6
            goto L_0x0024
        L_0x0014:
            r3 = r11 & 14
            if (r3 != 0) goto L_0x0023
            boolean r3 = r10.mo15006n0(r8)
            if (r3 == 0) goto L_0x0020
            r3 = 4
            goto L_0x0021
        L_0x0020:
            r3 = r2
        L_0x0021:
            r3 = r3 | r11
            goto L_0x0024
        L_0x0023:
            r3 = r11
        L_0x0024:
            r4 = r12 & 2
            if (r4 == 0) goto L_0x002b
            r3 = r3 | 48
            goto L_0x003b
        L_0x002b:
            r4 = r11 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L_0x003b
            boolean r4 = r10.mo14927P(r9)
            if (r4 == 0) goto L_0x0038
            r4 = 32
            goto L_0x003a
        L_0x0038:
            r4 = 16
        L_0x003a:
            r3 = r3 | r4
        L_0x003b:
            r4 = r3 & 91
            r5 = 18
            if (r4 != r5) goto L_0x004d
            boolean r4 = r10.mo15011p()
            if (r4 != 0) goto L_0x0048
            goto L_0x004d
        L_0x0048:
            r10.mo14958a0()
            goto L_0x00bd
        L_0x004d:
            if (r1 == 0) goto L_0x0051
            androidx.compose.ui.m$a r8 = androidx.compose.p004ui.C8767m.f23478j
        L_0x0051:
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x005d
            r1 = -1
            java.lang.String r4 = "androidx.compose.foundation.text.selection.SelectionContainer (SelectionContainer.kt:41)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r3, r1, r4)
        L_0x005d:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r10.mo14918M(r0)
            java.lang.Object r0 = r10.mo14921N()
            androidx.compose.runtime.o$a r1 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r4 = r1.mo16277a()
            if (r0 != r4) goto L_0x0077
            r0 = 0
            androidx.compose.runtime.z0 r0 = androidx.compose.runtime.C8539f2.m30981g(r0, r0, r2, r0)
            r10.mo14893C(r0)
        L_0x0077:
            r10.mo15002m0()
            androidx.compose.runtime.z0 r0 = (androidx.compose.runtime.C8700z0) r0
            androidx.compose.foundation.text.selection.i r2 = m12698d(r0)
            r4 = 1157296644(0x44faf204, float:2007.563)
            r10.mo14918M(r4)
            boolean r4 = r10.mo15006n0(r0)
            java.lang.Object r5 = r10.mo14921N()
            if (r4 != 0) goto L_0x0096
            java.lang.Object r1 = r1.mo16277a()
            if (r5 != r1) goto L_0x009e
        L_0x0096:
            androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$1$1 r5 = new androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$1$1
            r5.<init>(r0)
            r10.mo14893C(r5)
        L_0x009e:
            r10.mo15002m0()
            r0 = r5
            kotlin.jvm.functions.l r0 = (kotlin.jvm.functions.C11300l) r0
            r1 = r3 & 14
            int r3 = r3 << 6
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r6 = r1 | r3
            r7 = 0
            r1 = r8
            r3 = r0
            r4 = r9
            r5 = r10
            m12696b(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x00bd
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x00bd:
            androidx.compose.runtime.t1 r10 = r10.mo15020s()
            if (r10 != 0) goto L_0x00c4
            goto L_0x00cc
        L_0x00c4:
            androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$2 r0 = new androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$2
            r0.<init>(r8, r9, r11, r12)
            r10.mo15202a(r0)
        L_0x00cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionContainerKt.m12697c(androidx.compose.ui.m, kotlin.jvm.functions.p, androidx.compose.runtime.o, int, int):void");
    }

    /* renamed from: d */
    public static final C2830i m12698d(C8700z0<C2830i> z0Var) {
        return z0Var.getValue();
    }

    /* renamed from: e */
    public static final void m12699e(C8700z0<C2830i> z0Var, C2830i iVar) {
        z0Var.setValue(iVar);
    }
}

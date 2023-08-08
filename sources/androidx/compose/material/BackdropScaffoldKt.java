package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.C1968g;
import androidx.compose.animation.core.C2022z;
import androidx.compose.animation.core.C2023z0;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.C8782q;
import androidx.compose.p004ui.ZIndexModifierKt;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15320t2;
import androidx.compose.p004ui.graphics.C15329u3;
import androidx.compose.p004ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.layout.SubcomposeLayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8544h;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8678t1;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nBackdropScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,522:1\n25#2:523\n36#2:533\n36#2:541\n50#2:548\n49#2:549\n460#2,13:577\n460#2,13:610\n473#2,3:624\n460#2,13:648\n473#2,3:662\n473#2,3:667\n67#2,3:672\n66#2:675\n1114#3,6:524\n1114#3,6:534\n1114#3,6:542\n1114#3,6:550\n1114#3,6:676\n76#4:530\n76#4:532\n76#4:556\n76#4:565\n76#4:598\n76#4:636\n1#5:531\n646#6:540\n66#7,7:557\n73#7:590\n67#7,6:591\n73#7:623\n77#7:628\n67#7,6:629\n73#7:661\n77#7:666\n77#7:671\n75#8:564\n76#8,11:566\n75#8:597\n76#8,11:599\n89#8:627\n75#8:635\n76#8,11:637\n89#8:665\n89#8:670\n76#9:682\n76#9:683\n154#10:684\n*S KotlinDebug\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt\n*L\n172#1:523\n289#1:533\n394#1:541\n402#1:548\n402#1:549\n430#1:577,13\n431#1:610,13\n431#1:624,3\n439#1:648,13\n439#1:662,3\n430#1:667,3\n458#1:672,3\n458#1:675\n172#1:524,6\n289#1:534,6\n394#1:542,6\n402#1:550,6\n458#1:676,6\n276#1:530\n277#1:532\n425#1:556\n430#1:565\n431#1:598\n439#1:636\n388#1:540\n430#1:557,7\n430#1:590\n431#1:591,6\n431#1:623\n431#1:628\n439#1:629,6\n439#1:661\n439#1:666\n430#1:671\n430#1:564\n430#1:566,11\n431#1:597\n431#1:599,11\n431#1:627\n439#1:635\n439#1:637,11\n439#1:665\n430#1:670\n389#1:682\n422#1:683\n521#1:684\n*E\n"})
public final class BackdropScaffoldKt {

    /* renamed from: a */
    public static final float f7512a = C16483g.m74435M((float) 20);

    @C8540g
    @C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: a */
    public static final void m13220a(BackdropValue backdropValue, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar2, C8592o oVar, int i) {
        int i2;
        float f;
        int i3;
        int i4;
        int i5;
        BackdropValue backdropValue2 = backdropValue;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar3 = pVar;
        C11304p<? super C8592o, ? super Integer, C11079d2> pVar4 = pVar2;
        int i6 = i;
        C8592o o = oVar.mo15009o(-950970976);
        if ((i6 & 14) == 0) {
            if (o.mo15006n0(backdropValue2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i6;
        } else {
            i2 = i6;
        }
        if ((i6 & 112) == 0) {
            if (o.mo14927P(pVar3)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i6 & 896) == 0) {
            if (o.mo14927P(pVar4)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        int i7 = i2;
        if ((i7 & 731) != 146 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-950970976, i7, -1, "androidx.compose.material.BackLayerTransition (BackdropScaffold.kt:414)");
            }
            if (backdropValue2 == BackdropValue.Revealed) {
                f = 0.0f;
            } else {
                f = 2.0f;
            }
            C8578k2 f2 = AnimateAsStateKt.m7972f(f, new C2023z0(0, 0, (C2022z) null, 7, (DefaultConstructorMarker) null), 0.0f, (C11300l) null, o, 48, 12);
            float g5 = ((C16479d) o.mo15032w(CompositionLocalsKt.m71011i())).mo7425g5(f7512a);
            float f3 = (float) 1;
            float H = C11479u.m44331H(m13221b(f2) - f3, 0.0f, 1.0f);
            float H2 = C11479u.m44331H(f3 - m13221b(f2), 0.0f, 1.0f);
            o.mo14918M(733328855);
            C8767m.C8768a aVar = C8767m.f23478j;
            C8734c.C8735a aVar2 = C8734c.f23406a;
            C15560f0 k = BoxKt.m9849k(aVar2.mo17061C(), false, o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f4 = LayoutKt.m68908f(aVar);
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
            Updater.m30188j(b, k, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            o.mo14972e();
            f4.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
            C8767m e = C15320t2.m66561e(ZIndexModifierKt.m32294a(aVar, H), 0.0f, 0.0f, H, 0.0f, (f3 - H) * g5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, (C15218g4) null, false, (C15329u3) null, 0, 0, 0, 131051, (Object) null);
            o.mo14918M(733328855);
            C15560f0 k2 = BoxKt.m9849k(aVar2.mo17061C(), false, o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar2 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection2 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var2 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a2 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f5 = LayoutKt.m68908f(e);
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo14938T();
            if (o.mo14997l()) {
                o.mo14947W(a2);
            } else {
                o.mo14888A();
            }
            o.mo14941U();
            C8592o b2 = Updater.m30180b(o);
            Updater.m30188j(b2, k2, companion.mo44588d());
            Updater.m30188j(b2, dVar2, companion.mo44586b());
            Updater.m30188j(b2, layoutDirection2, companion.mo44587c());
            Updater.m30188j(b2, c4Var2, companion.mo44590f());
            o.mo14972e();
            f5.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            pVar3.invoke(o, Integer.valueOf((i7 >> 3) & 14));
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            o.mo15002m0();
            C8767m e2 = C15320t2.m66561e(ZIndexModifierKt.m32294a(aVar, H2), 0.0f, 0.0f, H2, 0.0f, (f3 - H2) * (-g5), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, (C15218g4) null, false, (C15329u3) null, 0, 0, 0, 131051, (Object) null);
            o.mo14918M(733328855);
            C15560f0 k3 = BoxKt.m9849k(aVar2.mo17061C(), false, o, 0);
            o.mo14918M(-1323940314);
            C16479d dVar3 = (C16479d) o.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection3 = (LayoutDirection) o.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var3 = (C15863c4) o.mo15032w(CompositionLocalsKt.m71025w());
            C11289a<ComposeUiNode> a3 = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f6 = LayoutKt.m68908f(e2);
            if (!(o.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            o.mo14938T();
            if (o.mo14997l()) {
                o.mo14947W(a3);
            } else {
                o.mo14888A();
            }
            o.mo14941U();
            C8592o b3 = Updater.m30180b(o);
            Updater.m30188j(b3, k3, companion.mo44588d());
            Updater.m30188j(b3, dVar3, companion.mo44586b());
            Updater.m30188j(b3, layoutDirection3, companion.mo44587c());
            Updater.m30188j(b3, c4Var3, companion.mo44590f());
            o.mo14972e();
            f6.invoke(C8684u1.m31905a(C8684u1.m31906b(o)), o, 0);
            o.mo14918M(2058660585);
            pVar4 = pVar2;
            pVar4.invoke(o, Integer.valueOf((i7 >> 6) & 14));
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            o.mo15002m0();
            o.mo15002m0();
            o.mo14896D();
            o.mo15002m0();
            o.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new BackdropScaffoldKt$BackLayerTransition$2(backdropValue, pVar3, pVar4, i));
        }
    }

    /* renamed from: b */
    public static final float m13221b(C8578k2<Float> k2Var) {
        return k2Var.getValue().floatValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r43v0, resolved type: kotlin.jvm.functions.q<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: kotlin.jvm.functions.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r43v1, resolved type: kotlin.jvm.functions.q<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r43v2, resolved type: kotlin.jvm.functions.q<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r43v3, resolved type: kotlin.jvm.functions.q<androidx.compose.material.SnackbarHostState, androidx.compose.runtime.o, java.lang.Integer, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r43v4, resolved type: kotlin.jvm.functions.q<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.o, ? super java.lang.Integer, kotlin.d2>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x01f1  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x0505  */
    /* JADX WARNING: Removed duplicated region for block: B:286:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0149  */
    @androidx.compose.material.C3044g0
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8544h(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m13222c(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r53, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r54, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r55, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r56, @org.jetbrains.annotations.C12580l androidx.compose.material.BackdropScaffoldState r57, boolean r58, float r59, float r60, boolean r61, boolean r62, long r63, long r65, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.C15218g4 r67, float r68, long r69, long r71, long r73, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11305q<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.C8592o, ? super java.lang.Integer, kotlin.C11079d2> r75, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r76, int r77, int r78, int r79) {
        /*
            r1 = r53
            r2 = r54
            r0 = r55
            r14 = r77
            r15 = r78
            r13 = r79
            java.lang.String r3 = "appBar"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "backLayerContent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            java.lang.String r3 = "frontLayerContent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            r3 = 1397420093(0x534af03d, float:8.7161392E11)
            r4 = r76
            androidx.compose.runtime.o r12 = r4.mo15009o(r3)
            r4 = r13 & 1
            if (r4 == 0) goto L_0x002b
            r4 = r14 | 6
            goto L_0x003b
        L_0x002b:
            r4 = r14 & 14
            if (r4 != 0) goto L_0x003a
            boolean r4 = r12.mo14927P(r1)
            if (r4 == 0) goto L_0x0037
            r4 = 4
            goto L_0x0038
        L_0x0037:
            r4 = 2
        L_0x0038:
            r4 = r4 | r14
            goto L_0x003b
        L_0x003a:
            r4 = r14
        L_0x003b:
            r7 = r13 & 2
            r9 = 16
            if (r7 == 0) goto L_0x0044
            r4 = r4 | 48
            goto L_0x0053
        L_0x0044:
            r7 = r14 & 112(0x70, float:1.57E-43)
            if (r7 != 0) goto L_0x0053
            boolean r7 = r12.mo14927P(r2)
            if (r7 == 0) goto L_0x0051
            r7 = 32
            goto L_0x0052
        L_0x0051:
            r7 = r9
        L_0x0052:
            r4 = r4 | r7
        L_0x0053:
            r7 = r13 & 4
            if (r7 == 0) goto L_0x005a
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x006a
        L_0x005a:
            r7 = r14 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L_0x006a
            boolean r7 = r12.mo14927P(r0)
            if (r7 == 0) goto L_0x0067
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x0069
        L_0x0067:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0069:
            r4 = r4 | r7
        L_0x006a:
            r7 = r13 & 8
            r16 = 2048(0x800, float:2.87E-42)
            r17 = 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L_0x0075
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0089
        L_0x0075:
            r5 = r14 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != 0) goto L_0x0089
            r5 = r56
            boolean r18 = r12.mo15006n0(r5)
            if (r18 == 0) goto L_0x0084
            r18 = r16
            goto L_0x0086
        L_0x0084:
            r18 = r17
        L_0x0086:
            r4 = r4 | r18
            goto L_0x008b
        L_0x0089:
            r5 = r56
        L_0x008b:
            r18 = 57344(0xe000, float:8.0356E-41)
            r18 = r14 & r18
            r19 = 8192(0x2000, float:1.14794E-41)
            r20 = 16384(0x4000, float:2.2959E-41)
            if (r18 != 0) goto L_0x00aa
            r18 = r13 & 16
            r6 = r57
            if (r18 != 0) goto L_0x00a5
            boolean r21 = r12.mo15006n0(r6)
            if (r21 == 0) goto L_0x00a5
            r21 = r20
            goto L_0x00a7
        L_0x00a5:
            r21 = r19
        L_0x00a7:
            r4 = r4 | r21
            goto L_0x00ac
        L_0x00aa:
            r6 = r57
        L_0x00ac:
            r21 = r13 & 32
            r22 = 131072(0x20000, float:1.83671E-40)
            r23 = 65536(0x10000, float:9.18355E-41)
            if (r21 == 0) goto L_0x00bb
            r24 = 196608(0x30000, float:2.75506E-40)
            r4 = r4 | r24
            r11 = r58
            goto L_0x00d0
        L_0x00bb:
            r24 = 458752(0x70000, float:6.42848E-40)
            r24 = r14 & r24
            r11 = r58
            if (r24 != 0) goto L_0x00d0
            boolean r25 = r12.mo14961b(r11)
            if (r25 == 0) goto L_0x00cc
            r25 = r22
            goto L_0x00ce
        L_0x00cc:
            r25 = r23
        L_0x00ce:
            r4 = r4 | r25
        L_0x00d0:
            r25 = r13 & 64
            if (r25 == 0) goto L_0x00db
            r26 = 1572864(0x180000, float:2.204052E-39)
            r4 = r4 | r26
            r3 = r59
            goto L_0x00f0
        L_0x00db:
            r26 = 3670016(0x380000, float:5.142788E-39)
            r26 = r14 & r26
            r3 = r59
            if (r26 != 0) goto L_0x00f0
            boolean r27 = r12.mo14968d(r3)
            if (r27 == 0) goto L_0x00ec
            r27 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ee
        L_0x00ec:
            r27 = 524288(0x80000, float:7.34684E-40)
        L_0x00ee:
            r4 = r4 | r27
        L_0x00f0:
            r10 = r13 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x00f9
            r28 = 12582912(0xc00000, float:1.7632415E-38)
            r4 = r4 | r28
            goto L_0x0111
        L_0x00f9:
            r28 = 29360128(0x1c00000, float:7.052966E-38)
            r28 = r14 & r28
            if (r28 != 0) goto L_0x0111
            r28 = r10
            r10 = r60
            boolean r29 = r12.mo14968d(r10)
            if (r29 == 0) goto L_0x010c
            r29 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x010e
        L_0x010c:
            r29 = 4194304(0x400000, float:5.877472E-39)
        L_0x010e:
            r4 = r4 | r29
            goto L_0x0115
        L_0x0111:
            r28 = r10
            r10 = r60
        L_0x0115:
            r10 = r13 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x011e
            r29 = 100663296(0x6000000, float:2.4074124E-35)
            r4 = r4 | r29
            goto L_0x0136
        L_0x011e:
            r29 = 234881024(0xe000000, float:1.5777218E-30)
            r29 = r14 & r29
            if (r29 != 0) goto L_0x0136
            r29 = r10
            r10 = r61
            boolean r30 = r12.mo14961b(r10)
            if (r30 == 0) goto L_0x0131
            r30 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0133
        L_0x0131:
            r30 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0133:
            r4 = r4 | r30
            goto L_0x013a
        L_0x0136:
            r29 = r10
            r10 = r61
        L_0x013a:
            r10 = r13 & 512(0x200, float:7.175E-43)
            if (r10 == 0) goto L_0x0149
            r30 = 805306368(0x30000000, float:4.656613E-10)
            r4 = r4 | r30
            r31 = r4
            r30 = r10
            r10 = r62
            goto L_0x0167
        L_0x0149:
            r30 = 1879048192(0x70000000, float:1.58456325E29)
            r30 = r14 & r30
            if (r30 != 0) goto L_0x0161
            r30 = r10
            r10 = r62
            boolean r31 = r12.mo14961b(r10)
            if (r31 == 0) goto L_0x015c
            r31 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x015e
        L_0x015c:
            r31 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x015e:
            r4 = r4 | r31
            goto L_0x0165
        L_0x0161:
            r30 = r10
            r10 = r62
        L_0x0165:
            r31 = r4
        L_0x0167:
            r4 = r15 & 14
            if (r4 != 0) goto L_0x017f
            r4 = r13 & 1024(0x400, float:1.435E-42)
            r10 = r63
            if (r4 != 0) goto L_0x017a
            boolean r4 = r12.mo14980g(r10)
            if (r4 == 0) goto L_0x017a
            r18 = 4
            goto L_0x017c
        L_0x017a:
            r18 = 2
        L_0x017c:
            r4 = r15 | r18
            goto L_0x0182
        L_0x017f:
            r10 = r63
            r4 = r15
        L_0x0182:
            r18 = r15 & 112(0x70, float:1.57E-43)
            if (r18 != 0) goto L_0x0198
            r8 = r13 & 2048(0x800, float:2.87E-42)
            r10 = r65
            if (r8 != 0) goto L_0x0195
            boolean r8 = r12.mo14980g(r10)
            if (r8 == 0) goto L_0x0195
            r8 = 32
            goto L_0x0196
        L_0x0195:
            r8 = r9
        L_0x0196:
            r4 = r4 | r8
            goto L_0x019a
        L_0x0198:
            r10 = r65
        L_0x019a:
            r8 = r15 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x01b2
            r8 = r13 & 4096(0x1000, float:5.74E-42)
            r9 = r67
            if (r8 != 0) goto L_0x01ad
            boolean r8 = r12.mo15006n0(r9)
            if (r8 == 0) goto L_0x01ad
            r24 = 256(0x100, float:3.59E-43)
            goto L_0x01af
        L_0x01ad:
            r24 = 128(0x80, float:1.794E-43)
        L_0x01af:
            r4 = r4 | r24
            goto L_0x01b4
        L_0x01b2:
            r9 = r67
        L_0x01b4:
            r8 = r13 & 8192(0x2000, float:1.14794E-41)
            if (r8 == 0) goto L_0x01bb
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x01cd
        L_0x01bb:
            r0 = r15 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != 0) goto L_0x01cd
            r0 = r68
            boolean r18 = r12.mo14968d(r0)
            if (r18 == 0) goto L_0x01c8
            goto L_0x01ca
        L_0x01c8:
            r16 = r17
        L_0x01ca:
            r4 = r4 | r16
            goto L_0x01cf
        L_0x01cd:
            r0 = r68
        L_0x01cf:
            r16 = 57344(0xe000, float:8.0356E-41)
            r16 = r15 & r16
            if (r16 != 0) goto L_0x01e7
            r0 = r13 & 16384(0x4000, float:2.2959E-41)
            r10 = r69
            if (r0 != 0) goto L_0x01e4
            boolean r0 = r12.mo14980g(r10)
            if (r0 == 0) goto L_0x01e4
            r19 = r20
        L_0x01e4:
            r4 = r4 | r19
            goto L_0x01e9
        L_0x01e7:
            r10 = r69
        L_0x01e9:
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r15
            r16 = 32768(0x8000, float:4.5918E-41)
            if (r0 != 0) goto L_0x0204
            r0 = r13 & r16
            r10 = r71
            if (r0 != 0) goto L_0x0200
            boolean r0 = r12.mo14980g(r10)
            if (r0 == 0) goto L_0x0200
            r0 = r22
            goto L_0x0202
        L_0x0200:
            r0 = r23
        L_0x0202:
            r4 = r4 | r0
            goto L_0x0206
        L_0x0204:
            r10 = r71
        L_0x0206:
            r0 = 3670016(0x380000, float:5.142788E-39)
            r0 = r0 & r15
            if (r0 != 0) goto L_0x021e
            r0 = r13 & r23
            r10 = r73
            if (r0 != 0) goto L_0x021a
            boolean r0 = r12.mo14980g(r10)
            if (r0 == 0) goto L_0x021a
            r0 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x021c
        L_0x021a:
            r0 = 524288(0x80000, float:7.34684E-40)
        L_0x021c:
            r4 = r4 | r0
            goto L_0x0220
        L_0x021e:
            r10 = r73
        L_0x0220:
            r0 = r13 & r22
            if (r0 == 0) goto L_0x022b
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            r4 = r4 | r17
            r10 = r75
            goto L_0x023f
        L_0x022b:
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            r17 = r15 & r17
            r10 = r75
            if (r17 != 0) goto L_0x023f
            boolean r11 = r12.mo14927P(r10)
            if (r11 == 0) goto L_0x023c
            r11 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x023e
        L_0x023c:
            r11 = 4194304(0x400000, float:5.877472E-39)
        L_0x023e:
            r4 = r4 | r11
        L_0x023f:
            r11 = r4
            r4 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r4 = r31 & r4
            r1 = 306783378(0x12492492, float:6.3469493E-28)
            if (r4 != r1) goto L_0x027a
            r1 = 23967451(0x16db6db, float:4.3661218E-38)
            r1 = r1 & r11
            r4 = 4793490(0x492492, float:6.71711E-39)
            if (r1 != r4) goto L_0x027a
            boolean r1 = r12.mo15011p()
            if (r1 != 0) goto L_0x025a
            goto L_0x027a
        L_0x025a:
            r12.mo14958a0()
            r8 = r60
            r13 = r65
            r16 = r68
            r17 = r69
            r19 = r71
            r21 = r73
            r7 = r3
            r4 = r5
            r5 = r6
            r15 = r9
            r23 = r10
            r0 = r12
            r6 = r58
            r9 = r61
            r10 = r62
            r11 = r63
            goto L_0x04fe
        L_0x027a:
            r12.mo14930Q()
            r1 = r14 & 1
            r17 = -57345(0xffffffffffff1fff, float:NaN)
            r4 = 6
            r10 = 1
            if (r1 == 0) goto L_0x02df
            boolean r1 = r12.mo14977f0()
            if (r1 == 0) goto L_0x028d
            goto L_0x02df
        L_0x028d:
            r12.mo14958a0()
            r0 = r13 & 16
            if (r0 == 0) goto L_0x0296
            r31 = r31 & r17
        L_0x0296:
            r0 = r13 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x029c
            r11 = r11 & -15
        L_0x029c:
            r0 = r13 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x02a2
            r11 = r11 & -113(0xffffffffffffff8f, float:NaN)
        L_0x02a2:
            r0 = r13 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x02a8
            r11 = r11 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x02a8:
            r0 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x02ae
            r11 = r11 & r17
        L_0x02ae:
            r0 = r13 & r16
            if (r0 == 0) goto L_0x02b6
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r11 = r11 & r0
        L_0x02b6:
            r0 = r13 & r23
            if (r0 == 0) goto L_0x02be
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r11 = r11 & r0
        L_0x02be:
            r28 = r58
            r10 = r60
            r29 = r61
            r30 = r62
            r33 = r65
            r36 = r68
            r37 = r69
            r39 = r71
            r41 = r73
            r43 = r75
            r1 = r4
            r0 = r5
            r2 = r6
            r35 = r9
            r9 = r11
            r8 = r31
            r31 = r63
            r11 = r3
            goto L_0x0401
        L_0x02df:
            if (r7 == 0) goto L_0x02e4
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            goto L_0x02e5
        L_0x02e4:
            r1 = r5
        L_0x02e5:
            r5 = r13 & 16
            if (r5 == 0) goto L_0x0310
            androidx.compose.material.BackdropValue r5 = androidx.compose.material.BackdropValue.Concealed
            r6 = 0
            r7 = 0
            r18 = 0
            r19 = 6
            r20 = 14
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r18
            r18 = r8
            r8 = r12
            r9 = r19
            r56 = r1
            r1 = r10
            r19 = r28
            r22 = r29
            r24 = r30
            r10 = r20
            androidx.compose.material.BackdropScaffoldState r4 = m13230k(r4, r5, r6, r7, r8, r9, r10)
            r31 = r31 & r17
            r6 = r4
            goto L_0x031b
        L_0x0310:
            r56 = r1
            r18 = r8
            r1 = r10
            r19 = r28
            r22 = r29
            r24 = r30
        L_0x031b:
            if (r21 == 0) goto L_0x031f
            r4 = r1
            goto L_0x0321
        L_0x031f:
            r4 = r58
        L_0x0321:
            if (r25 == 0) goto L_0x0329
            androidx.compose.material.c r3 = androidx.compose.material.C3031c.f8085a
            float r3 = r3.mo10724e()
        L_0x0329:
            if (r19 == 0) goto L_0x0332
            androidx.compose.material.c r5 = androidx.compose.material.C3031c.f8085a
            float r5 = r5.mo10723d()
            goto L_0x0334
        L_0x0332:
            r5 = r60
        L_0x0334:
            if (r22 == 0) goto L_0x0338
            r7 = r1
            goto L_0x033a
        L_0x0338:
            r7 = r61
        L_0x033a:
            if (r24 == 0) goto L_0x033e
            r8 = r1
            goto L_0x0340
        L_0x033e:
            r8 = r62
        L_0x0340:
            r9 = r13 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x0354
            androidx.compose.material.t0 r9 = androidx.compose.material.C7933t0.f19075a
            r10 = 6
            androidx.compose.material.q r9 = r9.mo11075a(r12, r10)
            long r19 = r9.mo10971j()
            r11 = r11 & -15
            r1 = r19
            goto L_0x0357
        L_0x0354:
            r10 = 6
            r1 = r63
        L_0x0357:
            r9 = r13 & 2048(0x800, float:2.87E-42)
            if (r9 == 0) goto L_0x0364
            r9 = r11 & 14
            long r19 = androidx.compose.material.ColorsKt.m13381b(r1, r12, r9)
            r11 = r11 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x0366
        L_0x0364:
            r19 = r65
        L_0x0366:
            r9 = r13 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto L_0x0373
            androidx.compose.material.c r9 = androidx.compose.material.C3031c.f8085a
            androidx.compose.ui.graphics.g4 r9 = r9.mo10722c(r12, r10)
            r11 = r11 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x0375
        L_0x0373:
            r9 = r67
        L_0x0375:
            if (r18 == 0) goto L_0x037e
            androidx.compose.material.c r18 = androidx.compose.material.C3031c.f8085a
            float r18 = r18.mo10720a()
            goto L_0x0380
        L_0x037e:
            r18 = r68
        L_0x0380:
            r10 = r13 & 16384(0x4000, float:2.2959E-41)
            if (r10 == 0) goto L_0x0394
            androidx.compose.material.t0 r10 = androidx.compose.material.C7933t0.f19075a
            r21 = r1
            r1 = 6
            androidx.compose.material.q r2 = r10.mo11075a(r12, r1)
            long r1 = r2.mo10975n()
            r11 = r11 & r17
            goto L_0x0398
        L_0x0394:
            r21 = r1
            r1 = r69
        L_0x0398:
            r10 = r13 & r16
            if (r10 == 0) goto L_0x03a9
            int r10 = r11 >> 12
            r10 = r10 & 14
            long r16 = androidx.compose.material.ColorsKt.m13381b(r1, r12, r10)
            r10 = -458753(0xfffffffffff8ffff, float:NaN)
            r11 = r11 & r10
            goto L_0x03ab
        L_0x03a9:
            r16 = r71
        L_0x03ab:
            r10 = r13 & r23
            if (r10 == 0) goto L_0x03be
            androidx.compose.material.c r10 = androidx.compose.material.C3031c.f8085a
            r23 = r1
            r1 = 6
            long r28 = r10.mo10721b(r12, r1)
            r2 = -3670017(0xffffffffffc7ffff, float:NaN)
            r2 = r2 & r11
            r11 = r2
            goto L_0x03c3
        L_0x03be:
            r23 = r1
            r1 = 6
            r28 = r73
        L_0x03c3:
            if (r0 == 0) goto L_0x03e3
            androidx.compose.material.ComposableSingletons$BackdropScaffoldKt r0 = androidx.compose.material.ComposableSingletons$BackdropScaffoldKt.f7591a
            kotlin.jvm.functions.q r0 = r0.mo10101a()
            r43 = r0
            r10 = r5
            r2 = r6
            r30 = r8
            r35 = r9
            r9 = r11
            r39 = r16
            r36 = r18
            r33 = r19
            r37 = r23
            r41 = r28
            r8 = r31
            r0 = r56
            goto L_0x03fa
        L_0x03e3:
            r0 = r56
            r43 = r75
            r10 = r5
            r2 = r6
            r30 = r8
            r35 = r9
            r9 = r11
            r39 = r16
            r36 = r18
            r33 = r19
            r37 = r23
            r41 = r28
            r8 = r31
        L_0x03fa:
            r11 = r3
            r28 = r4
            r29 = r7
            r31 = r21
        L_0x0401:
            r12.mo14899E()
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x0412
            java.lang.String r3 = "androidx.compose.material.BackdropScaffold (BackdropScaffold.kt:255)"
            r4 = 1397420093(0x534af03d, float:8.7161392E11)
            androidx.compose.runtime.ComposerKt.m29845w0(r4, r8, r9, r3)
        L_0x0412:
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r3 = r12.mo15032w(r3)
            androidx.compose.ui.unit.d r3 = (androidx.compose.p004ui.unit.C16479d) r3
            float r16 = r3.mo7425g5(r11)
            androidx.compose.runtime.i1 r3 = androidx.compose.p004ui.platform.CompositionLocalsKt.m71011i()
            java.lang.Object r3 = r12.mo15032w(r3)
            androidx.compose.ui.unit.d r3 = (androidx.compose.p004ui.unit.C16479d) r3
            float r7 = r3.mo7425g5(r10)
            androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$backLayer$1 r3 = new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$backLayer$1
            r56 = r3
            r57 = r29
            r58 = r2
            r59 = r53
            r60 = r54
            r61 = r8
            r56.<init>(r57, r58, r59, r60, r61)
            r4 = 1744778315(0x67ff344b, float:2.4103362E24)
            r5 = 1
            androidx.compose.runtime.internal.a r17 = androidx.compose.runtime.internal.C8553b.m31048b(r12, r4, r5, r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r7)
            r4 = 1157296644(0x44faf204, float:2007.563)
            r12.mo14918M(r4)
            boolean r3 = r12.mo15006n0(r3)
            java.lang.Object r4 = r12.mo14921N()
            if (r3 != 0) goto L_0x0463
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r3.mo16277a()
            if (r4 != r3) goto L_0x046b
        L_0x0463:
            androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1 r4 = new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1
            r4.<init>(r7)
            r12.mo14893C(r4)
        L_0x046b:
            r12.mo15002m0()
            r6 = r4
            kotlin.jvm.functions.l r6 = (kotlin.jvm.functions.C11300l) r6
            r26 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1 r5 = new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1
            r3 = r5
            r4 = r0
            r1 = r5
            r5 = r17
            r17 = r8
            r8 = r30
            r47 = r9
            r9 = r28
            r48 = r10
            r49 = 6
            r10 = r2
            r50 = r11
            r11 = r16
            r68 = r0
            r0 = r12
            r12 = r17
            r13 = r35
            r14 = r37
            r16 = r39
            r18 = r36
            r19 = r47
            r20 = r48
            r21 = r50
            r22 = r55
            r23 = r41
            r25 = r43
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r18, r19, r20, r21, r22, r23, r25)
            r3 = -1049909631(0xffffffffc16ba681, float:-14.72815)
            r4 = 1
            androidx.compose.runtime.internal.a r1 = androidx.compose.runtime.internal.C8553b.m31048b(r0, r3, r4, r1)
            int r3 = r47 << 6
            r4 = r3 & 896(0x380, float:1.256E-42)
            r5 = 1572864(0x180000, float:2.204052E-39)
            r4 = r4 | r5
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r4
            r4 = 51
            r56 = r26
            r57 = r44
            r58 = r31
            r60 = r33
            r62 = r45
            r63 = r46
            r64 = r1
            r65 = r0
            r66 = r3
            r67 = r4
            androidx.compose.material.SurfaceKt.m13879b(r56, r57, r58, r60, r62, r63, r64, r65, r66, r67)
            boolean r1 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r1 == 0) goto L_0x04e1
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x04e1:
            r4 = r68
            r5 = r2
            r6 = r28
            r9 = r29
            r10 = r30
            r11 = r31
            r13 = r33
            r15 = r35
            r16 = r36
            r17 = r37
            r19 = r39
            r21 = r41
            r23 = r43
            r8 = r48
            r7 = r50
        L_0x04fe:
            androidx.compose.runtime.t1 r3 = r0.mo15020s()
            if (r3 != 0) goto L_0x0505
            goto L_0x0522
        L_0x0505:
            androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2 r2 = new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2
            r0 = r2
            r1 = r53
            r51 = r2
            r2 = r54
            r52 = r3
            r3 = r55
            r24 = r77
            r25 = r78
            r26 = r79
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r15, r16, r17, r19, r21, r23, r24, r25, r26)
            r1 = r51
            r0 = r52
            r0.mo15202a(r1)
        L_0x0522:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BackdropScaffoldKt.m13222c(kotlin.jvm.functions.p, kotlin.jvm.functions.p, kotlin.jvm.functions.p, androidx.compose.ui.m, androidx.compose.material.BackdropScaffoldState, boolean, float, float, boolean, boolean, long, long, androidx.compose.ui.graphics.g4, float, long, long, long, kotlin.jvm.functions.q, androidx.compose.runtime.o, int, int, int):void");
    }

    @C8540g
    @C8782q
    /* renamed from: d */
    public static final void m13223d(C8767m mVar, C11304p<? super C8592o, ? super Integer, C11079d2> pVar, C11300l<? super C16476b, C16476b> lVar, C11306r<? super C16476b, ? super Float, ? super C8592o, ? super Integer, C11079d2> rVar, C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        C8592o o = oVar.mo15009o(-1248995194);
        if ((i & 14) == 0) {
            if (o.mo15006n0(mVar)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (o.mo14927P(pVar)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (o.mo14927P(lVar)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (o.mo14927P(rVar)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 5851) != 1170 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1248995194, i2, -1, "androidx.compose.material.BackdropStack (BackdropScaffold.kt:451)");
            }
            o.mo14918M(1618982084);
            boolean n0 = o.mo15006n0(pVar) | o.mo15006n0(lVar) | o.mo15006n0(rVar);
            Object N = o.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new BackdropScaffoldKt$BackdropStack$1$1(pVar, lVar, rVar, i2);
                o.mo14893C(N);
            }
            o.mo15002m0();
            SubcomposeLayoutKt.m69021a(mVar, (C11304p) N, o, i2 & 14, 0);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new BackdropScaffoldKt$BackdropStack$2(mVar, pVar, lVar, rVar, i));
        }
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: e */
    public static final void m13224e(long j, C11289a<C11079d2> aVar, boolean z, C8592o oVar, int i) {
        int i2;
        boolean z2;
        float f;
        C8767m mVar;
        int i3;
        int i4;
        int i5;
        long j2 = j;
        C11289a<C11079d2> aVar2 = aVar;
        boolean z3 = z;
        int i6 = i;
        C8592o o = oVar.mo15009o(-92141505);
        if ((i6 & 14) == 0) {
            if (o.mo14980g(j2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i6;
        } else {
            i2 = i6;
        }
        if ((i6 & 112) == 0) {
            if (o.mo14927P(aVar2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i6 & 896) == 0) {
            if (o.mo14961b(z3)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 731) != 146 || !o.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-92141505, i2, -1, "androidx.compose.material.Scrim (BackdropScaffold.kt:382)");
            }
            if (j2 != C15240j2.f37547b.mo42851u()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (z3) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                C8578k2 f2 = AnimateAsStateKt.m7972f(f, new C2023z0(0, 0, (C2022z) null, 7, (DefaultConstructorMarker) null), 0.0f, (C11300l) null, o, 48, 12);
                o.mo14918M(1010547004);
                if (z3) {
                    C8767m.C8768a aVar3 = C8767m.f23478j;
                    C11079d2 d2Var = C11079d2.f28267a;
                    o.mo14918M(1157296644);
                    boolean n0 = o.mo15006n0(aVar2);
                    Object N = o.mo14921N();
                    if (n0 || N == C8592o.f23032a.mo16277a()) {
                        N = new BackdropScaffoldKt$Scrim$dismissModifier$1$1(aVar2, (C11045c<? super BackdropScaffoldKt$Scrim$dismissModifier$1$1>) null);
                        o.mo14893C(N);
                    }
                    o.mo15002m0();
                    mVar = SuspendingPointerInputFilterKt.m68437c(aVar3, d2Var, (C11304p) N);
                } else {
                    mVar = C8767m.f23478j;
                }
                o.mo15002m0();
                C8767m k3 = SizeKt.m10112l(C8767m.f23478j, 0.0f, 1, (Object) null).mo17224k3(mVar);
                C15240j2 n = C15240j2.m66071n(j);
                o.mo14918M(511388516);
                boolean n02 = o.mo15006n0(n) | o.mo15006n0(f2);
                Object N2 = o.mo14921N();
                if (n02 || N2 == C8592o.f23032a.mo16277a()) {
                    N2 = new BackdropScaffoldKt$Scrim$1$1(j2, f2);
                    o.mo14893C(N2);
                }
                o.mo15002m0();
                CanvasKt.m8873b(k3, (C11300l) N2, o, 0);
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
            }
        } else {
            o.mo14958a0();
        }
        C8678t1 s = o.mo15020s();
        if (s != null) {
            s.mo15202a(new BackdropScaffoldKt$Scrim$2(j, aVar, z, i));
        }
    }

    /* renamed from: f */
    public static final float m13225f(C8578k2<Float> k2Var) {
        return k2Var.getValue().floatValue();
    }

    @C3044g0
    @C8540g
    @C12579k
    /* renamed from: k */
    public static final BackdropScaffoldState m13230k(@C12579k BackdropValue backdropValue, @C12580l C1968g<Float> gVar, @C12580l C11300l<? super BackdropValue, Boolean> lVar, @C12580l SnackbarHostState snackbarHostState, @C12580l C8592o oVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(backdropValue, "initialValue");
        oVar.mo14918M(-862178912);
        if ((i2 & 2) != 0) {
            gVar = C7885n1.f18885a.mo10889a();
        }
        if ((i2 & 4) != 0) {
            lVar = BackdropScaffoldKt$rememberBackdropScaffoldState$1.f7513f;
        }
        if ((i2 & 8) != 0) {
            oVar.mo14918M(-492369756);
            Object N = oVar.mo14921N();
            if (N == C8592o.f23032a.mo16277a()) {
                N = new SnackbarHostState();
                oVar.mo14893C(N);
            }
            oVar.mo15002m0();
            snackbarHostState = (SnackbarHostState) N;
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(-862178912, i, -1, "androidx.compose.material.rememberBackdropScaffoldState (BackdropScaffold.kt:167)");
        }
        BackdropScaffoldState backdropScaffoldState = (BackdropScaffoldState) RememberSaveableKt.m31343d(new Object[]{gVar, lVar, snackbarHostState}, BackdropScaffoldState.f7514u.mo10002a(gVar, lVar, snackbarHostState), (String) null, new BackdropScaffoldKt$rememberBackdropScaffoldState$3(backdropValue, gVar, lVar, snackbarHostState), oVar, 72, 4);
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        oVar.mo15002m0();
        return backdropScaffoldState;
    }
}

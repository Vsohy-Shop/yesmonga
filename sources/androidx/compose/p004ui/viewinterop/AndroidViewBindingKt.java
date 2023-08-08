package androidx.compose.p004ui.viewinterop;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import java.util.List;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;

@C11363r0({"SMAP\nAndroidViewBinding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidViewBinding.kt\nandroidx/compose/ui/viewinterop/AndroidViewBindingKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 6 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,137:1\n25#2:138\n36#2:146\n25#2:153\n36#2:160\n1114#3,6:139\n1114#3,6:147\n1114#3,6:154\n1114#3,6:161\n76#4:145\n76#4:167\n33#5,6:168\n55#6,4:174\n*S KotlinDebug\n*F\n+ 1 AndroidViewBinding.kt\nandroidx/compose/ui/viewinterop/AndroidViewBindingKt\n*L\n64#1:138\n69#1:146\n77#1:153\n78#1:160\n64#1:139,6\n69#1:147,6\n77#1:154,6\n78#1:161,6\n65#1:145\n102#1:167\n103#1:168,6\n130#1:174,4\n*E\n"})
/* renamed from: androidx.compose.ui.viewinterop.AndroidViewBindingKt */
public final class AndroidViewBindingKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: kotlin.jvm.functions.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    @androidx.compose.runtime.C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T extends androidx.viewbinding.C20752b> void m74784a(@org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super android.view.LayoutInflater, ? super android.view.ViewGroup, ? super java.lang.Boolean, ? extends T> r8, @org.jetbrains.annotations.C12580l androidx.compose.p004ui.C8767m r9, @org.jetbrains.annotations.C12580l kotlin.jvm.functions.C11300l<? super T, kotlin.C11079d2> r10, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r11, int r12, int r13) {
        /*
            java.lang.String r0 = "factory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = -1985291610(0xffffffff89aadaa6, float:-4.1131627E-33)
            androidx.compose.runtime.o r11 = r11.mo15009o(r0)
            r1 = r13 & 1
            if (r1 == 0) goto L_0x0013
            r1 = r12 | 6
            goto L_0x0023
        L_0x0013:
            r1 = r12 & 14
            if (r1 != 0) goto L_0x0022
            boolean r1 = r11.mo14927P(r8)
            if (r1 == 0) goto L_0x001f
            r1 = 4
            goto L_0x0020
        L_0x001f:
            r1 = 2
        L_0x0020:
            r1 = r1 | r12
            goto L_0x0023
        L_0x0022:
            r1 = r12
        L_0x0023:
            r2 = r13 & 2
            if (r2 == 0) goto L_0x002a
            r1 = r1 | 48
            goto L_0x003a
        L_0x002a:
            r3 = r12 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L_0x003a
            boolean r3 = r11.mo15006n0(r9)
            if (r3 == 0) goto L_0x0037
            r3 = 32
            goto L_0x0039
        L_0x0037:
            r3 = 16
        L_0x0039:
            r1 = r1 | r3
        L_0x003a:
            r3 = r13 & 4
            if (r3 == 0) goto L_0x0041
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0051
        L_0x0041:
            r4 = r12 & 896(0x380, float:1.256E-42)
            if (r4 != 0) goto L_0x0051
            boolean r4 = r11.mo14927P(r10)
            if (r4 == 0) goto L_0x004e
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0050
        L_0x004e:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0050:
            r1 = r1 | r4
        L_0x0051:
            r4 = r1 & 731(0x2db, float:1.024E-42)
            r5 = 146(0x92, float:2.05E-43)
            if (r4 != r5) goto L_0x0065
            boolean r4 = r11.mo15011p()
            if (r4 != 0) goto L_0x005e
            goto L_0x0065
        L_0x005e:
            r11.mo14958a0()
        L_0x0061:
            r3 = r9
            r4 = r10
            goto L_0x0142
        L_0x0065:
            if (r2 == 0) goto L_0x0069
            androidx.compose.ui.m$a r9 = androidx.compose.p004ui.C8767m.f23478j
        L_0x0069:
            if (r3 == 0) goto L_0x006d
            androidx.compose.ui.viewinterop.AndroidViewBindingKt$AndroidViewBinding$1 r10 = androidx.compose.p004ui.viewinterop.AndroidViewBindingKt$AndroidViewBinding$1.f40919f
        L_0x006d:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0079
            r2 = -1
            java.lang.String r3 = "androidx.compose.ui.viewinterop.AndroidViewBinding (AndroidViewBinding.kt:58)"
            androidx.compose.runtime.ComposerKt.m29845w0(r0, r1, r2, r3)
        L_0x0079:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.mo14918M(r0)
            java.lang.Object r2 = r11.mo14921N()
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r4 = r3.mo16277a()
            if (r2 != r4) goto L_0x0093
            androidx.compose.ui.node.i1 r2 = new androidx.compose.ui.node.i1
            r2.<init>()
            r11.mo14893C(r2)
        L_0x0093:
            r11.mo15002m0()
            androidx.compose.ui.node.i1 r2 = (androidx.compose.p004ui.node.C15695i1) r2
            androidx.compose.runtime.i1 r4 = androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt.m70956k()
            java.lang.Object r4 = r11.mo15032w(r4)
            android.view.View r4 = (android.view.View) r4
            r5 = 1157296644(0x44faf204, float:2007.563)
            r11.mo14918M(r5)
            boolean r6 = r11.mo15006n0(r4)
            java.lang.Object r7 = r11.mo14921N()
            if (r6 != 0) goto L_0x00b8
            java.lang.Object r3 = r3.mo16277a()
            if (r7 != r3) goto L_0x00c3
        L_0x00b8:
            androidx.fragment.app.Fragment r3 = androidx.fragment.app.C19266q0.m90370a(r4)     // Catch:{ IllegalStateException -> 0x00be }
        L_0x00bc:
            r7 = r3
            goto L_0x00c0
        L_0x00be:
            r3 = 0
            goto L_0x00bc
        L_0x00c0:
            r11.mo14893C(r7)
        L_0x00c3:
            r11.mo15002m0()
            androidx.fragment.app.Fragment r7 = (androidx.fragment.app.Fragment) r7
            r11.mo14918M(r0)
            java.lang.Object r0 = r11.mo14921N()
            androidx.compose.runtime.o$a r3 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r6 = r3.mo16277a()
            if (r0 != r6) goto L_0x00de
            androidx.compose.runtime.snapshots.SnapshotStateList r0 = androidx.compose.runtime.C8415c2.m30237f()
            r11.mo14893C(r0)
        L_0x00de:
            r11.mo15002m0()
            androidx.compose.runtime.snapshots.SnapshotStateList r0 = (androidx.compose.runtime.snapshots.SnapshotStateList) r0
            r11.mo14918M(r5)
            boolean r4 = r11.mo15006n0(r4)
            java.lang.Object r5 = r11.mo14921N()
            if (r4 != 0) goto L_0x00f6
            java.lang.Object r3 = r3.mo16277a()
            if (r5 != r3) goto L_0x00fe
        L_0x00f6:
            androidx.compose.ui.viewinterop.AndroidViewBindingKt$AndroidViewBinding$viewBlock$1$1 r5 = new androidx.compose.ui.viewinterop.AndroidViewBindingKt$AndroidViewBinding$viewBlock$1$1
            r5.<init>(r7, r8, r2, r0)
            r11.mo14893C(r5)
        L_0x00fe:
            r11.mo15002m0()
            r3 = r5
            kotlin.jvm.functions.l r3 = (kotlin.jvm.functions.C11300l) r3
            androidx.compose.ui.viewinterop.AndroidViewBindingKt$AndroidViewBinding$2 r4 = new androidx.compose.ui.viewinterop.AndroidViewBindingKt$AndroidViewBinding$2
            r4.<init>(r2, r10)
            r5 = r1 & 112(0x70, float:1.57E-43)
            r6 = 0
            r1 = r3
            r2 = r9
            r3 = r4
            r4 = r11
            androidx.compose.p004ui.viewinterop.AndroidView_androidKt.m74829a(r1, r2, r3, r4, r5, r6)
            androidx.compose.runtime.i1 r1 = androidx.compose.p004ui.platform.AndroidCompositionLocals_androidKt.m70952g()
            java.lang.Object r1 = r11.mo15032w(r1)
            android.content.Context r1 = (android.content.Context) r1
            int r2 = r0.size()
            r3 = 0
        L_0x0122:
            if (r3 >= r2) goto L_0x0137
            java.lang.Object r4 = r0.get(r3)
            androidx.fragment.app.FragmentContainerView r4 = (androidx.fragment.app.FragmentContainerView) r4
            androidx.compose.ui.viewinterop.AndroidViewBindingKt$AndroidViewBinding$3$1 r5 = new androidx.compose.ui.viewinterop.AndroidViewBindingKt$AndroidViewBinding$3$1
            r5.<init>(r7, r1, r4)
            r6 = 72
            androidx.compose.runtime.EffectsKt.m29890b(r1, r4, r5, r11, r6)
            int r3 = r3 + 1
            goto L_0x0122
        L_0x0137:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x0061
            androidx.compose.runtime.ComposerKt.m29843v0()
            goto L_0x0061
        L_0x0142:
            androidx.compose.runtime.t1 r9 = r11.mo15020s()
            if (r9 != 0) goto L_0x0149
            goto L_0x0155
        L_0x0149:
            androidx.compose.ui.viewinterop.AndroidViewBindingKt$AndroidViewBinding$4 r10 = new androidx.compose.ui.viewinterop.AndroidViewBindingKt$AndroidViewBinding$4
            r1 = r10
            r2 = r8
            r5 = r12
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            r9.mo15202a(r10)
        L_0x0155:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.viewinterop.AndroidViewBindingKt.m74784a(kotlin.jvm.functions.q, androidx.compose.ui.m, kotlin.jvm.functions.l, androidx.compose.runtime.o, int, int):void");
    }

    /* renamed from: c */
    public static final void m74786c(ViewGroup viewGroup, List<FragmentContainerView> list) {
        if (viewGroup instanceof FragmentContainerView) {
            list.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(index)");
            if (childAt instanceof ViewGroup) {
                m74786c((ViewGroup) childAt, list);
            }
        }
    }
}

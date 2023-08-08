package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.p004ui.C8767m;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Landroidx/compose/ui/m;", "a", "(Landroidx/compose/ui/m;Landroidx/compose/runtime/o;I)Landroidx/compose/ui/m;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt$shrinkExpand$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1180:1\n36#2:1181\n25#2:1188\n25#2:1195\n36#2:1202\n1057#3,6:1182\n1057#3,6:1189\n1057#3,6:1196\n1057#3,6:1203\n76#4:1209\n102#4,2:1210\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt$shrinkExpand$1\n*L\n1038#1:1181\n1061#1:1188\n1066#1:1195\n1070#1:1202\n1038#1:1182,6\n1061#1:1189,6\n1066#1:1196,6\n1070#1:1203,6\n1038#1:1209\n1038#1:1210,2\n*E\n"})
public final class EnterExitTransitionKt$shrinkExpand$1 extends Lambda implements C11305q<C8767m, C8592o, Integer, C8767m> {
    final /* synthetic */ C8578k2<ChangeSize> $expand;
    final /* synthetic */ String $labelPrefix;
    final /* synthetic */ C8578k2<ChangeSize> $shrink;
    final /* synthetic */ Transition<EnterExitState> $transition;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionKt$shrinkExpand$1(Transition<EnterExitState> transition, C8578k2<ChangeSize> k2Var, C8578k2<ChangeSize> k2Var2, String str) {
        super(3);
        this.$transition = transition;
        this.$expand = k2Var;
        this.$shrink = k2Var2;
        this.$labelPrefix = str;
    }

    /* renamed from: b */
    public static final boolean m7859b(C8700z0<Boolean> z0Var) {
        return z0Var.getValue().booleanValue();
    }

    /* renamed from: c */
    public static final void m7860c(C8700z0<Boolean> z0Var, boolean z) {
        z0Var.setValue(Boolean.valueOf(z));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: androidx.compose.animation.ExpandShrinkModifier} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: androidx.compose.animation.ExpandShrinkModifier} */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x017b, code lost:
        if (r6 == r14.mo16277a()) goto L_0x017d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01ed  */
    @androidx.compose.runtime.C8540g
    @org.jetbrains.annotations.C12579k
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p004ui.C8767m mo6527a(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.C8767m r21, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r22, int r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r8 = r22
            java.lang.String r2 = "$this$composed"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r2 = -140634085(0xfffffffff79e181b, float:-6.413061E33)
            r8.mo14918M(r2)
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x001f
            r3 = -1
            java.lang.String r4 = "androidx.compose.animation.shrinkExpand.<anonymous> (EnterExitTransition.kt:1033)"
            r5 = r23
            androidx.compose.runtime.ComposerKt.m29845w0(r2, r5, r3, r4)
        L_0x001f:
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r2 = r0.$transition
            r9 = 1157296644(0x44faf204, float:2007.563)
            r8.mo14918M(r9)
            boolean r2 = r8.mo15006n0(r2)
            java.lang.Object r3 = r22.mo14921N()
            r10 = 0
            if (r2 != 0) goto L_0x003a
            androidx.compose.runtime.o$a r2 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r2.mo16277a()
            if (r3 != r2) goto L_0x0044
        L_0x003a:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r3 = 2
            androidx.compose.runtime.z0 r3 = androidx.compose.runtime.C8539f2.m30981g(r2, r10, r3, r10)
            r8.mo14893C(r3)
        L_0x0044:
            r22.mo15002m0()
            androidx.compose.runtime.z0 r3 = (androidx.compose.runtime.C8700z0) r3
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r2 = r0.$transition
            java.lang.Object r2 = r2.mo6700h()
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r4 = r0.$transition
            java.lang.Object r4 = r4.mo6706o()
            r11 = 1
            r12 = 0
            if (r2 != r4) goto L_0x0065
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r2 = r0.$transition
            boolean r2 = r2.mo6711t()
            if (r2 != 0) goto L_0x0065
            m7860c(r3, r12)
            goto L_0x0078
        L_0x0065:
            androidx.compose.runtime.k2<androidx.compose.animation.ChangeSize> r2 = r0.$expand
            java.lang.Object r2 = r2.getValue()
            if (r2 != 0) goto L_0x0075
            androidx.compose.runtime.k2<androidx.compose.animation.ChangeSize> r2 = r0.$shrink
            java.lang.Object r2 = r2.getValue()
            if (r2 == 0) goto L_0x0078
        L_0x0075:
            m7860c(r3, r11)
        L_0x0078:
            boolean r2 = m7859b(r3)
            if (r2 == 0) goto L_0x01f9
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r2 = r0.$transition
            androidx.compose.animation.core.Transition$b r2 = r2.mo6704m()
            androidx.compose.animation.EnterExitState r3 = androidx.compose.animation.EnterExitState.PreEnter
            androidx.compose.animation.EnterExitState r4 = androidx.compose.animation.EnterExitState.Visible
            boolean r2 = r2.mo6729d(r3, r4)
            androidx.compose.runtime.k2<androidx.compose.animation.ChangeSize> r3 = r0.$expand
            androidx.compose.runtime.k2<androidx.compose.animation.ChangeSize> r4 = r0.$shrink
            if (r2 == 0) goto L_0x00ad
            java.lang.Object r2 = r3.getValue()
            androidx.compose.animation.ChangeSize r2 = (androidx.compose.animation.ChangeSize) r2
            if (r2 == 0) goto L_0x00a0
            androidx.compose.ui.c r2 = r2.mo6498g()
            if (r2 != 0) goto L_0x00c9
        L_0x00a0:
            java.lang.Object r2 = r4.getValue()
            androidx.compose.animation.ChangeSize r2 = (androidx.compose.animation.ChangeSize) r2
            if (r2 == 0) goto L_0x00c8
            androidx.compose.ui.c r2 = r2.mo6498g()
            goto L_0x00c9
        L_0x00ad:
            java.lang.Object r2 = r4.getValue()
            androidx.compose.animation.ChangeSize r2 = (androidx.compose.animation.ChangeSize) r2
            if (r2 == 0) goto L_0x00bb
            androidx.compose.ui.c r2 = r2.mo6498g()
            if (r2 != 0) goto L_0x00c9
        L_0x00bb:
            java.lang.Object r2 = r3.getValue()
            androidx.compose.animation.ChangeSize r2 = (androidx.compose.animation.ChangeSize) r2
            if (r2 == 0) goto L_0x00c8
            androidx.compose.ui.c r2 = r2.mo6498g()
            goto L_0x00c9
        L_0x00c8:
            r2 = r10
        L_0x00c9:
            androidx.compose.runtime.k2 r19 = androidx.compose.runtime.C8415c2.m30251t(r2, r8, r12)
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r2 = r0.$transition
            androidx.compose.ui.unit.q$a r3 = androidx.compose.p004ui.unit.C16500q.f40900b
            androidx.compose.animation.core.a1 r3 = androidx.compose.animation.core.VectorConvertersKt.m8223h(r3)
            java.lang.String r4 = r0.$labelPrefix
            r13 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r8.mo14918M(r13)
            java.lang.Object r5 = r22.mo14921N()
            androidx.compose.runtime.o$a r14 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r6 = r14.mo16277a()
            if (r5 != r6) goto L_0x00fd
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = " shrink/expand"
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            r8.mo14893C(r5)
        L_0x00fd:
            r22.mo15002m0()
            r4 = r5
            java.lang.String r4 = (java.lang.String) r4
            r6 = 448(0x1c0, float:6.28E-43)
            r7 = 0
            r5 = r22
            androidx.compose.animation.core.Transition$a r15 = androidx.compose.animation.core.TransitionKt.m8193l(r2, r3, r4, r5, r6, r7)
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r2 = r0.$transition
            java.lang.Object r2 = r2.mo6700h()
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r3 = r0.$transition
            java.lang.Object r3 = r3.mo6706o()
            if (r2 != r3) goto L_0x011c
            r2 = r11
            goto L_0x011d
        L_0x011c:
            r2 = r12
        L_0x011d:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r3 = -1553213624(0xffffffffa36bd748, float:-1.2784963E-17)
            r8.mo14933R(r3, r2)
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r2 = r0.$transition
            androidx.compose.ui.unit.m$a r3 = androidx.compose.p004ui.unit.C16494m.f40890b
            androidx.compose.animation.core.a1 r3 = androidx.compose.animation.core.VectorConvertersKt.m8222g(r3)
            java.lang.String r4 = r0.$labelPrefix
            r8.mo14918M(r13)
            java.lang.Object r5 = r22.mo14921N()
            java.lang.Object r6 = r14.mo16277a()
            if (r5 != r6) goto L_0x0152
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = " InterruptionHandlingOffset"
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            r8.mo14893C(r5)
        L_0x0152:
            r22.mo15002m0()
            r4 = r5
            java.lang.String r4 = (java.lang.String) r4
            r6 = 448(0x1c0, float:6.28E-43)
            r7 = 0
            r5 = r22
            androidx.compose.animation.core.Transition$a r2 = androidx.compose.animation.core.TransitionKt.m8193l(r2, r3, r4, r5, r6, r7)
            r22.mo14998l0()
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r3 = r0.$transition
            androidx.compose.runtime.k2<androidx.compose.animation.ChangeSize> r4 = r0.$expand
            androidx.compose.runtime.k2<androidx.compose.animation.ChangeSize> r5 = r0.$shrink
            r8.mo14918M(r9)
            boolean r3 = r8.mo15006n0(r3)
            java.lang.Object r6 = r22.mo14921N()
            if (r3 != 0) goto L_0x017d
            java.lang.Object r3 = r14.mo16277a()
            if (r6 != r3) goto L_0x018e
        L_0x017d:
            androidx.compose.animation.ExpandShrinkModifier r6 = new androidx.compose.animation.ExpandShrinkModifier
            r13 = r6
            r14 = r15
            r15 = r2
            r16 = r4
            r17 = r5
            r18 = r19
            r13.<init>(r14, r15, r16, r17, r18)
            r8.mo14893C(r6)
        L_0x018e:
            r22.mo15002m0()
            androidx.compose.animation.ExpandShrinkModifier r6 = (androidx.compose.animation.ExpandShrinkModifier) r6
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r2 = r0.$transition
            java.lang.Object r2 = r2.mo6700h()
            androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r3 = r0.$transition
            java.lang.Object r3 = r3.mo6706o()
            if (r2 != r3) goto L_0x01a5
            r6.mo6549o(r10)
            goto L_0x01bc
        L_0x01a5:
            androidx.compose.ui.c r2 = r6.mo6543b()
            if (r2 != 0) goto L_0x01bc
            java.lang.Object r2 = r19.getValue()
            androidx.compose.ui.c r2 = (androidx.compose.p004ui.C8734c) r2
            if (r2 != 0) goto L_0x01b9
            androidx.compose.ui.c$a r2 = androidx.compose.p004ui.C8734c.f23406a
            androidx.compose.ui.c r2 = r2.mo17061C()
        L_0x01b9:
            r6.mo6549o(r2)
        L_0x01bc:
            androidx.compose.runtime.k2<androidx.compose.animation.ChangeSize> r2 = r0.$expand
            java.lang.Object r2 = r2.getValue()
            androidx.compose.animation.ChangeSize r2 = (androidx.compose.animation.ChangeSize) r2
            if (r2 == 0) goto L_0x01ce
            boolean r2 = r2.mo6501i()
            if (r2 != 0) goto L_0x01ce
            r2 = r11
            goto L_0x01cf
        L_0x01ce:
            r2 = r12
        L_0x01cf:
            if (r2 != 0) goto L_0x01e8
            androidx.compose.runtime.k2<androidx.compose.animation.ChangeSize> r2 = r0.$shrink
            java.lang.Object r2 = r2.getValue()
            androidx.compose.animation.ChangeSize r2 = (androidx.compose.animation.ChangeSize) r2
            if (r2 == 0) goto L_0x01e3
            boolean r2 = r2.mo6501i()
            if (r2 != 0) goto L_0x01e3
            r2 = r11
            goto L_0x01e4
        L_0x01e3:
            r2 = r12
        L_0x01e4:
            if (r2 == 0) goto L_0x01e7
            goto L_0x01e8
        L_0x01e7:
            r11 = r12
        L_0x01e8:
            androidx.compose.ui.m$a r2 = androidx.compose.p004ui.C8767m.f23478j
            if (r11 == 0) goto L_0x01ed
            goto L_0x01f1
        L_0x01ed:
            androidx.compose.ui.m r2 = androidx.compose.p004ui.draw.C8744d.m32515b(r2)
        L_0x01f1:
            androidx.compose.ui.m r1 = r1.mo17224k3(r2)
            androidx.compose.ui.m r1 = r1.mo17224k3(r6)
        L_0x01f9:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0202
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0202:
            r22.mo15002m0()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt$shrinkExpand$1.mo6527a(androidx.compose.ui.m, androidx.compose.runtime.o, int):androidx.compose.ui.m");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo6527a((C8767m) obj, (C8592o) obj2, ((Number) obj3).intValue());
    }
}

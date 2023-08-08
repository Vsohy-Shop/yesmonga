package androidx.compose.animation;

import androidx.compose.animation.core.C1945a1;
import androidx.compose.animation.core.C1956d0;
import androidx.compose.animation.core.C1972h;
import androidx.compose.animation.core.C1986l;
import androidx.compose.animation.core.C2002p1;
import androidx.compose.animation.core.C2014v0;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.ComposedModifierKt;
import androidx.compose.p004ui.graphics.C15283o4;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.runtime.C8410b2;
import androidx.compose.runtime.C8539f2;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8700z0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1180:1\n36#2:1181\n36#2:1188\n25#2:1195\n25#2:1208\n67#2,3:1231\n66#2:1234\n36#2:1241\n1057#3,6:1182\n1057#3,6:1189\n1057#3,6:1196\n1057#3,6:1209\n1057#3,6:1235\n1057#3,6:1242\n939#4:1202\n857#4,5:1203\n939#4:1215\n857#4,5:1216\n852#4,10:1221\n76#5:1248\n102#5,2:1249\n76#5:1251\n102#5,2:1252\n76#5:1254\n76#5:1255\n76#5:1256\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt\n*L\n846#1:1181\n847#1:1188\n871#1:1195\n894#1:1208\n923#1:1231,3\n923#1:1234\n930#1:1241\n846#1:1182,6\n847#1:1189,6\n871#1:1196,6\n894#1:1209,6\n923#1:1235,6\n930#1:1242,6\n861#1:1202\n861#1:1203,5\n884#1:1215\n884#1:1216,5\n910#1:1221,10\n846#1:1248\n846#1:1249,2\n847#1:1251\n847#1:1252,2\n860#1:1254\n884#1:1255\n910#1:1256\n*E\n"})
public final class EnterExitTransitionKt {
    @C12579k

    /* renamed from: a */
    public static final C1945a1<C15283o4, C1986l> f5229a = VectorConvertersKt.m8216a(EnterExitTransitionKt$TransformOriginVectorConverter$1.f5235f, EnterExitTransitionKt$TransformOriginVectorConverter$2.f5236f);
    @C12579k

    /* renamed from: b */
    public static final C8700z0<Float> f5230b = C8539f2.m30981g(Float.valueOf(1.0f), (C8410b2) null, 2, (Object) null);
    @C12579k

    /* renamed from: c */
    public static final C2014v0<Float> f5231c = C1972h.m8390o(0.0f, 400.0f, (Object) null, 5, (Object) null);
    @C12579k

    /* renamed from: d */
    public static final C2014v0<C16494m> f5232d = C1972h.m8390o(0.0f, 400.0f, C16494m.m74570b(C2002p1.m8577f(C16494m.f40890b)), 1, (Object) null);
    @C12579k

    /* renamed from: e */
    public static final C2014v0<C16500q> f5233e = C1972h.m8390o(0.0f, 400.0f, C16500q.m74651b(C2002p1.m8578g(C16500q.f40900b)), 1, (Object) null);

    /* renamed from: androidx.compose.animation.EnterExitTransitionKt$a */
    public /* synthetic */ class C1908a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.animation.EnterExitState[] r0 = androidx.compose.animation.EnterExitState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.animation.EnterExitState r1 = androidx.compose.animation.EnterExitState.Visible     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.animation.EnterExitState r1 = androidx.compose.animation.EnterExitState.PreEnter     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.animation.EnterExitState r1 = androidx.compose.animation.EnterExitState.PostExit     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt.C1908a.<clinit>():void");
        }
    }

    @C2031i
    @C8547h2
    @C12579k
    /* renamed from: A */
    public static final C2028g m7797A(@C12579k C1956d0<Float> d0Var, float f, long j) {
        Intrinsics.checkNotNullParameter(d0Var, "animationSpec");
        return new C2030h(new C2047w((C2033j) null, (C2043s) null, (ChangeSize) null, new C2039o(f, j, d0Var, (DefaultConstructorMarker) null), 7, (DefaultConstructorMarker) null));
    }

    /* renamed from: B */
    public static /* synthetic */ C2028g m7798B(C1956d0 d0Var, float f, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            d0Var = C1972h.m8390o(0.0f, 400.0f, (Object) null, 5, (Object) null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            j = C15283o4.f37618b.mo42933a();
        }
        return m7797A(d0Var, f, j);
    }

    /* renamed from: C */
    public static final C8767m m7799C(C8767m mVar, Transition<EnterExitState> transition, C8578k2<ChangeSize> k2Var, C8578k2<ChangeSize> k2Var2, String str) {
        return ComposedModifierKt.m32287j(mVar, (C11300l) null, new EnterExitTransitionKt$shrinkExpand$1(transition, k2Var, k2Var2, str), 1, (Object) null);
    }

    @C8547h2
    @C12579k
    /* renamed from: D */
    public static final C2028g m7800D(@C12579k C1956d0<C16500q> d0Var, @C12579k C8734c.C8736b bVar, boolean z, @C12579k C11300l<? super Integer, Integer> lVar) {
        Intrinsics.checkNotNullParameter(d0Var, "animationSpec");
        Intrinsics.checkNotNullParameter(bVar, "shrinkTowards");
        Intrinsics.checkNotNullParameter(lVar, "targetWidth");
        return m7802F(d0Var, m7819W(bVar), z, new EnterExitTransitionKt$shrinkHorizontally$2(lVar));
    }

    /* renamed from: E */
    public static /* synthetic */ C2028g m7801E(C1956d0 d0Var, C8734c.C8736b bVar, boolean z, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            d0Var = C1972h.m8390o(0.0f, 400.0f, C16500q.m74651b(C2002p1.m8578g(C16500q.f40900b)), 1, (Object) null);
        }
        if ((i & 2) != 0) {
            bVar = C8734c.f23406a.mo17071s();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            lVar = EnterExitTransitionKt$shrinkHorizontally$1.f5240f;
        }
        return m7800D(d0Var, bVar, z, lVar);
    }

    @C8547h2
    @C12579k
    /* renamed from: F */
    public static final C2028g m7802F(@C12579k C1956d0<C16500q> d0Var, @C12579k C8734c cVar, boolean z, @C12579k C11300l<? super C16500q, C16500q> lVar) {
        Intrinsics.checkNotNullParameter(d0Var, "animationSpec");
        Intrinsics.checkNotNullParameter(cVar, "shrinkTowards");
        Intrinsics.checkNotNullParameter(lVar, "targetSize");
        return new C2030h(new C2047w((C2033j) null, (C2043s) null, new ChangeSize(cVar, lVar, d0Var, z), (C2039o) null, 11, (DefaultConstructorMarker) null));
    }

    /* renamed from: G */
    public static /* synthetic */ C2028g m7803G(C1956d0 d0Var, C8734c cVar, boolean z, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            d0Var = C1972h.m8390o(0.0f, 400.0f, C16500q.m74651b(C2002p1.m8578g(C16500q.f40900b)), 1, (Object) null);
        }
        if ((i & 2) != 0) {
            cVar = C8734c.f23406a.mo17064e();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            lVar = EnterExitTransitionKt$shrinkOut$1.f5241f;
        }
        return m7802F(d0Var, cVar, z, lVar);
    }

    @C8547h2
    @C12579k
    /* renamed from: H */
    public static final C2028g m7804H(@C12579k C1956d0<C16500q> d0Var, @C12579k C8734c.C8737c cVar, boolean z, @C12579k C11300l<? super Integer, Integer> lVar) {
        Intrinsics.checkNotNullParameter(d0Var, "animationSpec");
        Intrinsics.checkNotNullParameter(cVar, "shrinkTowards");
        Intrinsics.checkNotNullParameter(lVar, "targetHeight");
        return m7802F(d0Var, m7820X(cVar), z, new EnterExitTransitionKt$shrinkVertically$2(lVar));
    }

    /* renamed from: I */
    public static /* synthetic */ C2028g m7805I(C1956d0 d0Var, C8734c.C8737c cVar, boolean z, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            d0Var = C1972h.m8390o(0.0f, 400.0f, C16500q.m74651b(C2002p1.m8578g(C16500q.f40900b)), 1, (Object) null);
        }
        if ((i & 2) != 0) {
            cVar = C8734c.f23406a.mo17062a();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            lVar = EnterExitTransitionKt$shrinkVertically$1.f5242f;
        }
        return m7804H(d0Var, cVar, z, lVar);
    }

    @C8547h2
    @C12579k
    /* renamed from: J */
    public static final C2025e m7806J(@C12579k C1956d0<C16494m> d0Var, @C12579k C11300l<? super C16500q, C16494m> lVar) {
        Intrinsics.checkNotNullParameter(d0Var, "animationSpec");
        Intrinsics.checkNotNullParameter(lVar, "initialOffset");
        return new C2027f(new C2047w((C2033j) null, new C2043s(lVar, d0Var), (ChangeSize) null, (C2039o) null, 13, (DefaultConstructorMarker) null));
    }

    /* renamed from: K */
    public static /* synthetic */ C2025e m7807K(C1956d0 d0Var, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            d0Var = C1972h.m8390o(0.0f, 400.0f, C16494m.m74570b(C2002p1.m8577f(C16494m.f40890b)), 1, (Object) null);
        }
        return m7806J(d0Var, lVar);
    }

    @C8547h2
    @C12579k
    /* renamed from: L */
    public static final C2025e m7808L(@C12579k C1956d0<C16494m> d0Var, @C12579k C11300l<? super Integer, Integer> lVar) {
        Intrinsics.checkNotNullParameter(d0Var, "animationSpec");
        Intrinsics.checkNotNullParameter(lVar, "initialOffsetX");
        return m7806J(d0Var, new EnterExitTransitionKt$slideInHorizontally$2(lVar));
    }

    /* renamed from: M */
    public static /* synthetic */ C2025e m7809M(C1956d0 d0Var, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            d0Var = C1972h.m8390o(0.0f, 400.0f, C16494m.m74570b(C2002p1.m8577f(C16494m.f40890b)), 1, (Object) null);
        }
        if ((i & 2) != 0) {
            lVar = EnterExitTransitionKt$slideInHorizontally$1.f5243f;
        }
        return m7808L(d0Var, lVar);
    }

    /* renamed from: N */
    public static final C8767m m7810N(C8767m mVar, Transition<EnterExitState> transition, C8578k2<C2043s> k2Var, C8578k2<C2043s> k2Var2, String str) {
        return ComposedModifierKt.m32287j(mVar, (C11300l) null, new EnterExitTransitionKt$slideInOut$1(transition, k2Var, k2Var2, str), 1, (Object) null);
    }

    @C8547h2
    @C12579k
    /* renamed from: O */
    public static final C2025e m7811O(@C12579k C1956d0<C16494m> d0Var, @C12579k C11300l<? super Integer, Integer> lVar) {
        Intrinsics.checkNotNullParameter(d0Var, "animationSpec");
        Intrinsics.checkNotNullParameter(lVar, "initialOffsetY");
        return m7806J(d0Var, new EnterExitTransitionKt$slideInVertically$2(lVar));
    }

    /* renamed from: P */
    public static /* synthetic */ C2025e m7812P(C1956d0 d0Var, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            d0Var = C1972h.m8390o(0.0f, 400.0f, C16494m.m74570b(C2002p1.m8577f(C16494m.f40890b)), 1, (Object) null);
        }
        if ((i & 2) != 0) {
            lVar = EnterExitTransitionKt$slideInVertically$1.f5244f;
        }
        return m7811O(d0Var, lVar);
    }

    @C8547h2
    @C12579k
    /* renamed from: Q */
    public static final C2028g m7813Q(@C12579k C1956d0<C16494m> d0Var, @C12579k C11300l<? super C16500q, C16494m> lVar) {
        Intrinsics.checkNotNullParameter(d0Var, "animationSpec");
        Intrinsics.checkNotNullParameter(lVar, "targetOffset");
        return new C2030h(new C2047w((C2033j) null, new C2043s(lVar, d0Var), (ChangeSize) null, (C2039o) null, 13, (DefaultConstructorMarker) null));
    }

    /* renamed from: R */
    public static /* synthetic */ C2028g m7814R(C1956d0 d0Var, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            d0Var = C1972h.m8390o(0.0f, 400.0f, C16494m.m74570b(C2002p1.m8577f(C16494m.f40890b)), 1, (Object) null);
        }
        return m7813Q(d0Var, lVar);
    }

    @C8547h2
    @C12579k
    /* renamed from: S */
    public static final C2028g m7815S(@C12579k C1956d0<C16494m> d0Var, @C12579k C11300l<? super Integer, Integer> lVar) {
        Intrinsics.checkNotNullParameter(d0Var, "animationSpec");
        Intrinsics.checkNotNullParameter(lVar, "targetOffsetX");
        return m7813Q(d0Var, new EnterExitTransitionKt$slideOutHorizontally$2(lVar));
    }

    /* renamed from: T */
    public static /* synthetic */ C2028g m7816T(C1956d0 d0Var, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            d0Var = C1972h.m8390o(0.0f, 400.0f, C16494m.m74570b(C2002p1.m8577f(C16494m.f40890b)), 1, (Object) null);
        }
        if ((i & 2) != 0) {
            lVar = EnterExitTransitionKt$slideOutHorizontally$1.f5245f;
        }
        return m7815S(d0Var, lVar);
    }

    @C8547h2
    @C12579k
    /* renamed from: U */
    public static final C2028g m7817U(@C12579k C1956d0<C16494m> d0Var, @C12579k C11300l<? super Integer, Integer> lVar) {
        Intrinsics.checkNotNullParameter(d0Var, "animationSpec");
        Intrinsics.checkNotNullParameter(lVar, "targetOffsetY");
        return m7813Q(d0Var, new EnterExitTransitionKt$slideOutVertically$2(lVar));
    }

    /* renamed from: V */
    public static /* synthetic */ C2028g m7818V(C1956d0 d0Var, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            d0Var = C1972h.m8390o(0.0f, 400.0f, C16494m.m74570b(C2002p1.m8577f(C16494m.f40890b)), 1, (Object) null);
        }
        if ((i & 2) != 0) {
            lVar = EnterExitTransitionKt$slideOutVertically$1.f5246f;
        }
        return m7817U(d0Var, lVar);
    }

    /* renamed from: W */
    public static final C8734c m7819W(C8734c.C8736b bVar) {
        C8734c.C8735a aVar = C8734c.f23406a;
        if (Intrinsics.areEqual((Object) bVar, (Object) aVar.mo17072u())) {
            return aVar.mo17069o();
        }
        if (Intrinsics.areEqual((Object) bVar, (Object) aVar.mo17071s())) {
            return aVar.mo17067k();
        }
        return aVar.mo17066i();
    }

    /* renamed from: X */
    public static final C8734c m7820X(C8734c.C8737c cVar) {
        C8734c.C8735a aVar = C8734c.f23406a;
        if (Intrinsics.areEqual((Object) cVar, (Object) aVar.mo17073w())) {
            return aVar.mo17074y();
        }
        if (Intrinsics.areEqual((Object) cVar, (Object) aVar.mo17062a())) {
            return aVar.mo17063c();
        }
        return aVar.mo17066i();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: androidx.compose.runtime.z0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: androidx.compose.runtime.z0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0331  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0359  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0383  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x038a  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x03cf  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0431  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0440  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x048b  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x048f  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0494  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x04a0  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x04b9  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x04c2  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x04cd  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0518  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x051c  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0521  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x052d  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x021d  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0226  */
    @androidx.compose.runtime.C8540g
    @org.jetbrains.annotations.C12579k
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p004ui.C8767m m7827g(@org.jetbrains.annotations.C12579k androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r27, @org.jetbrains.annotations.C12579k androidx.compose.animation.C2025e r28, @org.jetbrains.annotations.C12579k androidx.compose.animation.C2028g r29, @org.jetbrains.annotations.C12579k java.lang.String r30, @org.jetbrains.annotations.C12580l androidx.compose.runtime.C8592o r31, int r32) {
        /*
            r8 = r27
            r9 = r28
            r10 = r29
            r11 = r30
            r12 = r31
            r0 = r32
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
            java.lang.String r1 = "enter"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            java.lang.String r1 = "exit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r1)
            java.lang.String r1 = "label"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r1)
            r1 = 914000546(0x367a8aa2, float:3.7333598E-6)
            r12.mo14918M(r1)
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            r13 = -1
            if (r2 == 0) goto L_0x0032
            java.lang.String r2 = "androidx.compose.animation.createModifier (EnterExitTransition.kt:820)"
            androidx.compose.runtime.ComposerKt.m29845w0(r1, r0, r13, r2)
        L_0x0032:
            androidx.compose.ui.m$a r1 = androidx.compose.p004ui.C8767m.f23478j
            androidx.compose.animation.w r2 = r28.mo7022b()
            androidx.compose.animation.s r2 = r2.mo7096j()
            r3 = 0
            androidx.compose.runtime.k2 r2 = androidx.compose.runtime.C8415c2.m30251t(r2, r12, r3)
            androidx.compose.animation.w r4 = r29.mo7028b()
            androidx.compose.animation.s r4 = r4.mo7096j()
            androidx.compose.runtime.k2 r4 = androidx.compose.runtime.C8415c2.m30251t(r4, r12, r3)
            androidx.compose.ui.m r1 = m7810N(r1, r8, r2, r4, r11)
            androidx.compose.animation.w r2 = r28.mo7022b()
            androidx.compose.animation.ChangeSize r2 = r2.mo7092g()
            androidx.compose.runtime.k2 r2 = androidx.compose.runtime.C8415c2.m30251t(r2, r12, r3)
            androidx.compose.animation.w r4 = r29.mo7028b()
            androidx.compose.animation.ChangeSize r4 = r4.mo7092g()
            androidx.compose.runtime.k2 r4 = androidx.compose.runtime.C8415c2.m30251t(r4, r12, r3)
            androidx.compose.ui.m r14 = m7799C(r1, r8, r2, r4, r11)
            r15 = r0 & 14
            r7 = 1157296644(0x44faf204, float:2007.563)
            r12.mo14918M(r7)
            boolean r0 = r12.mo15006n0(r8)
            java.lang.Object r1 = r31.mo14921N()
            r6 = 2
            r5 = 0
            if (r0 != 0) goto L_0x0089
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r1 != r0) goto L_0x0092
        L_0x0089:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            androidx.compose.runtime.z0 r1 = androidx.compose.runtime.C8539f2.m30981g(r0, r5, r6, r5)
            r12.mo14893C(r1)
        L_0x0092:
            r31.mo15002m0()
            r4 = r1
            androidx.compose.runtime.z0 r4 = (androidx.compose.runtime.C8700z0) r4
            r12.mo14918M(r7)
            boolean r0 = r12.mo15006n0(r8)
            java.lang.Object r1 = r31.mo14921N()
            if (r0 != 0) goto L_0x00ad
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r1 != r0) goto L_0x00b6
        L_0x00ad:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            androidx.compose.runtime.z0 r1 = androidx.compose.runtime.C8539f2.m30981g(r0, r5, r6, r5)
            r12.mo14893C(r1)
        L_0x00b6:
            r31.mo15002m0()
            r2 = r1
            androidx.compose.runtime.z0 r2 = (androidx.compose.runtime.C8700z0) r2
            java.lang.Object r0 = r27.mo6700h()
            java.lang.Object r1 = r27.mo6706o()
            r6 = 1
            if (r0 != r1) goto L_0x00d4
            boolean r0 = r27.mo6711t()
            if (r0 != 0) goto L_0x00d4
            m7831k(r4, r3)
            m7833m(r2, r3)
            goto L_0x0102
        L_0x00d4:
            androidx.compose.animation.w r0 = r28.mo7022b()
            androidx.compose.animation.j r0 = r0.mo7093h()
            if (r0 != 0) goto L_0x00e8
            androidx.compose.animation.w r0 = r29.mo7028b()
            androidx.compose.animation.j r0 = r0.mo7093h()
            if (r0 == 0) goto L_0x00eb
        L_0x00e8:
            m7831k(r4, r6)
        L_0x00eb:
            androidx.compose.animation.w r0 = r28.mo7022b()
            androidx.compose.animation.o r0 = r0.mo7095i()
            if (r0 != 0) goto L_0x00ff
            androidx.compose.animation.w r0 = r29.mo7028b()
            androidx.compose.animation.o r0 = r0.mo7095i()
            if (r0 == 0) goto L_0x0102
        L_0x00ff:
            m7833m(r2, r6)
        L_0x0102:
            r0 = 1657241561(0x62c77fd9, float:1.8400572E21)
            r12.mo14918M(r0)
            boolean r0 = m7828h(r4)
            r3 = -1338768149(0xffffffffb03404eb, float:-6.549061E-10)
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r16 = 458752(0x70000, float:6.42848E-40)
            r6 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r18 = 57344(0xe000, float:8.0356E-41)
            r13 = 3
            r20 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0270
            androidx.compose.animation.EnterExitTransitionKt$createModifier$alpha$2 r0 = new androidx.compose.animation.EnterExitTransitionKt$createModifier$alpha$2
            r0.<init>(r9, r10)
            r12.mo14918M(r1)
            java.lang.Object r1 = r31.mo14921N()
            androidx.compose.runtime.o$a r22 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r5 = r22.mo16277a()
            if (r1 != r5) goto L_0x0147
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            java.lang.String r5 = " alpha"
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r12.mo14893C(r1)
        L_0x0147:
            r31.mo15002m0()
            r5 = r1
            java.lang.String r5 = (java.lang.String) r5
            r1 = r15 | 384(0x180, float:5.38E-43)
            r12.mo14918M(r3)
            kotlin.jvm.internal.x r22 = kotlin.jvm.internal.C11377x.f28521a
            androidx.compose.animation.core.a1 r22 = androidx.compose.animation.core.VectorConvertersKt.m8224i(r22)
            r23 = r1 & 14
            int r1 = r1 << r13
            r3 = r1 & 896(0x380, float:1.256E-42)
            r3 = r23 | r3
            r7 = r1 & 7168(0x1c00, float:1.0045E-41)
            r3 = r3 | r7
            r1 = r1 & r18
            r1 = r1 | r3
            r12.mo14918M(r6)
            java.lang.Object r3 = r27.mo6700h()
            int r7 = r1 >> 9
            r7 = r7 & 112(0x70, float:1.57E-43)
            androidx.compose.animation.EnterExitState r3 = (androidx.compose.animation.EnterExitState) r3
            r6 = 755689166(0x2d0ae6ce, float:7.895641E-12)
            r12.mo14918M(r6)
            boolean r24 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r24 == 0) goto L_0x0187
            java.lang.String r13 = "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:871)"
            r25 = r2
            r2 = -1
            androidx.compose.runtime.ComposerKt.m29845w0(r6, r7, r2, r13)
            goto L_0x0189
        L_0x0187:
            r25 = r2
        L_0x0189:
            int[] r2 = androidx.compose.animation.EnterExitTransitionKt.C1908a.$EnumSwitchMapping$0
            int r3 = r3.ordinal()
            r3 = r2[r3]
            r13 = 1
            if (r3 == r13) goto L_0x01be
            r13 = 2
            if (r3 == r13) goto L_0x01af
            r13 = 3
            if (r3 != r13) goto L_0x01a9
            androidx.compose.animation.w r3 = r29.mo7028b()
            androidx.compose.animation.j r3 = r3.mo7093h()
            if (r3 == 0) goto L_0x01be
            float r3 = r3.mo7037e()
            goto L_0x01c0
        L_0x01a9:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01af:
            androidx.compose.animation.w r3 = r28.mo7022b()
            androidx.compose.animation.j r3 = r3.mo7093h()
            if (r3 == 0) goto L_0x01be
            float r3 = r3.mo7037e()
            goto L_0x01c0
        L_0x01be:
            r3 = r20
        L_0x01c0:
            boolean r13 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r13 == 0) goto L_0x01c9
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x01c9:
            r31.mo15002m0()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            java.lang.Object r13 = r27.mo6706o()
            androidx.compose.animation.EnterExitState r13 = (androidx.compose.animation.EnterExitState) r13
            r12.mo14918M(r6)
            boolean r26 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r26 == 0) goto L_0x01e8
            r26 = r4
            java.lang.String r4 = "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:871)"
            r8 = -1
            androidx.compose.runtime.ComposerKt.m29845w0(r6, r7, r8, r4)
            goto L_0x01ea
        L_0x01e8:
            r26 = r4
        L_0x01ea:
            int r4 = r13.ordinal()
            r2 = r2[r4]
            r6 = 1
            if (r2 == r6) goto L_0x021d
            r7 = 2
            if (r2 == r7) goto L_0x020e
            r4 = 3
            if (r2 != r4) goto L_0x0208
            androidx.compose.animation.w r2 = r29.mo7028b()
            androidx.compose.animation.j r2 = r2.mo7093h()
            if (r2 == 0) goto L_0x021e
            float r2 = r2.mo7037e()
            goto L_0x0220
        L_0x0208:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x020e:
            androidx.compose.animation.w r2 = r28.mo7022b()
            androidx.compose.animation.j r2 = r2.mo7093h()
            if (r2 == 0) goto L_0x021e
            float r2 = r2.mo7037e()
            goto L_0x0220
        L_0x021d:
            r7 = 2
        L_0x021e:
            r2 = r20
        L_0x0220:
            boolean r4 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r4 == 0) goto L_0x0229
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0229:
            r31.mo15002m0()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            androidx.compose.animation.core.Transition$b r4 = r27.mo6704m()
            int r8 = r1 >> 3
            r8 = r8 & 112(0x70, float:1.57E-43)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object r0 = r0.invoke(r4, r12, r8)
            r4 = r0
            androidx.compose.animation.core.d0 r4 = (androidx.compose.animation.core.C1956d0) r4
            r0 = r1 & 14
            int r8 = r1 << 9
            r8 = r8 & r18
            r0 = r0 | r8
            int r1 = r1 << 6
            r1 = r1 & r16
            r8 = r0 | r1
            r0 = r27
            r13 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1 = r3
            r17 = r25
            r3 = r4
            r21 = r26
            r4 = r22
            r22 = 0
            r7 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r6 = r31
            r7 = r8
            androidx.compose.runtime.k2 r0 = androidx.compose.animation.core.TransitionKt.m8194m(r0, r1, r2, r3, r4, r5, r6, r7)
            r31.mo15002m0()
            r31.mo15002m0()
            goto L_0x0279
        L_0x0270:
            r13 = r1
            r17 = r2
            r21 = r4
            r22 = r5
            androidx.compose.runtime.z0<java.lang.Float> r0 = f5230b
        L_0x0279:
            r8 = r0
            r31.mo15002m0()
            boolean r0 = m7832l(r17)
            if (r0 == 0) goto L_0x059b
            r0 = 1657242461(0x62c7835d, float:1.8401839E21)
            r12.mo14918M(r0)
            androidx.compose.animation.EnterExitTransitionKt$createModifier$scale$2 r0 = new androidx.compose.animation.EnterExitTransitionKt$createModifier$scale$2
            r0.<init>(r9, r10)
            r12.mo14918M(r13)
            java.lang.Object r1 = r31.mo14921N()
            androidx.compose.runtime.o$a r13 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r2 = r13.mo16277a()
            if (r1 != r2) goto L_0x02b1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            java.lang.String r2 = " scale"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r12.mo14893C(r1)
        L_0x02b1:
            r31.mo15002m0()
            r5 = r1
            java.lang.String r5 = (java.lang.String) r5
            r1 = r15 | 384(0x180, float:5.38E-43)
            r2 = -1338768149(0xffffffffb03404eb, float:-6.549061E-10)
            r12.mo14918M(r2)
            kotlin.jvm.internal.x r2 = kotlin.jvm.internal.C11377x.f28521a
            androidx.compose.animation.core.a1 r4 = androidx.compose.animation.core.VectorConvertersKt.m8224i(r2)
            r2 = r1 & 14
            r3 = 3
            int r1 = r1 << r3
            r3 = r1 & 896(0x380, float:1.256E-42)
            r2 = r2 | r3
            r3 = r1 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 | r3
            r1 = r1 & r18
            r1 = r1 | r2
            r11 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r12.mo14918M(r11)
            java.lang.Object r2 = r27.mo6700h()
            int r3 = r1 >> 9
            r3 = r3 & 112(0x70, float:1.57E-43)
            androidx.compose.animation.EnterExitState r2 = (androidx.compose.animation.EnterExitState) r2
            r6 = -596129937(0xffffffffdc77c76f, float:-2.78974395E17)
            r12.mo14918M(r6)
            boolean r7 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r7 == 0) goto L_0x02f4
            java.lang.String r7 = "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:894)"
            r11 = -1
            androidx.compose.runtime.ComposerKt.m29845w0(r6, r3, r11, r7)
        L_0x02f4:
            int[] r11 = androidx.compose.animation.EnterExitTransitionKt.C1908a.$EnumSwitchMapping$0
            int r2 = r2.ordinal()
            r2 = r11[r2]
            r7 = 1
            if (r2 == r7) goto L_0x0329
            r7 = 2
            if (r2 == r7) goto L_0x031a
            r7 = 3
            if (r2 != r7) goto L_0x0314
            androidx.compose.animation.w r2 = r29.mo7028b()
            androidx.compose.animation.o r2 = r2.mo7095i()
            if (r2 == 0) goto L_0x0329
            float r2 = r2.mo7070g()
            goto L_0x032b
        L_0x0314:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x031a:
            androidx.compose.animation.w r2 = r28.mo7022b()
            androidx.compose.animation.o r2 = r2.mo7095i()
            if (r2 == 0) goto L_0x0329
            float r2 = r2.mo7070g()
            goto L_0x032b
        L_0x0329:
            r2 = r20
        L_0x032b:
            boolean r7 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r7 == 0) goto L_0x0334
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0334:
            r31.mo15002m0()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Object r7 = r27.mo6706o()
            androidx.compose.animation.EnterExitState r7 = (androidx.compose.animation.EnterExitState) r7
            r12.mo14918M(r6)
            boolean r17 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r17 == 0) goto L_0x0350
            java.lang.String r9 = "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:894)"
            r10 = -1
            androidx.compose.runtime.ComposerKt.m29845w0(r6, r3, r10, r9)
        L_0x0350:
            int r3 = r7.ordinal()
            r3 = r11[r3]
            r7 = 1
            if (r3 == r7) goto L_0x0383
            r9 = 2
            if (r3 == r9) goto L_0x0374
            r6 = 3
            if (r3 != r6) goto L_0x036e
            androidx.compose.animation.w r3 = r29.mo7028b()
            androidx.compose.animation.o r3 = r3.mo7095i()
            if (r3 == 0) goto L_0x0384
            float r20 = r3.mo7070g()
            goto L_0x0384
        L_0x036e:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0374:
            androidx.compose.animation.w r3 = r28.mo7022b()
            androidx.compose.animation.o r3 = r3.mo7095i()
            if (r3 == 0) goto L_0x0384
            float r20 = r3.mo7070g()
            goto L_0x0384
        L_0x0383:
            r9 = 2
        L_0x0384:
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x038d
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x038d:
            r31.mo15002m0()
            java.lang.Float r3 = java.lang.Float.valueOf(r20)
            androidx.compose.animation.core.Transition$b r6 = r27.mo6704m()
            int r10 = r1 >> 3
            r10 = r10 & 112(0x70, float:1.57E-43)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object r0 = r0.invoke(r6, r12, r10)
            r6 = r0
            androidx.compose.animation.core.d0 r6 = (androidx.compose.animation.core.C1956d0) r6
            r0 = r1 & 14
            int r10 = r1 << 9
            r10 = r10 & r18
            r0 = r0 | r10
            int r1 = r1 << 6
            r1 = r1 & r16
            r10 = r0 | r1
            r0 = r27
            r1 = r2
            r2 = r3
            r3 = r6
            r6 = r31
            r9 = r7
            r7 = r10
            androidx.compose.runtime.k2 r10 = androidx.compose.animation.core.TransitionKt.m8194m(r0, r1, r2, r3, r4, r5, r6, r7)
            r31.mo15002m0()
            r31.mo15002m0()
            java.lang.Object r0 = r27.mo6700h()
            androidx.compose.animation.EnterExitState r1 = androidx.compose.animation.EnterExitState.PreEnter
            if (r0 != r1) goto L_0x03ed
            androidx.compose.animation.w r0 = r28.mo7022b()
            androidx.compose.animation.o r0 = r0.mo7095i()
            if (r0 == 0) goto L_0x03e2
        L_0x03d9:
            long r0 = r0.mo7071h()
            androidx.compose.ui.graphics.o4 r5 = androidx.compose.p004ui.graphics.C15283o4.m66370b(r0)
            goto L_0x040d
        L_0x03e2:
            androidx.compose.animation.w r0 = r29.mo7028b()
            androidx.compose.animation.o r0 = r0.mo7095i()
            if (r0 == 0) goto L_0x040b
            goto L_0x03d9
        L_0x03ed:
            androidx.compose.animation.w r0 = r29.mo7028b()
            androidx.compose.animation.o r0 = r0.mo7095i()
            if (r0 == 0) goto L_0x0400
        L_0x03f7:
            long r0 = r0.mo7071h()
            androidx.compose.ui.graphics.o4 r5 = androidx.compose.p004ui.graphics.C15283o4.m66370b(r0)
            goto L_0x040d
        L_0x0400:
            androidx.compose.animation.w r0 = r28.mo7022b()
            androidx.compose.animation.o r0 = r0.mo7095i()
            if (r0 == 0) goto L_0x040b
            goto L_0x03f7
        L_0x040b:
            r5 = r22
        L_0x040d:
            androidx.compose.animation.core.a1<androidx.compose.ui.graphics.o4, androidx.compose.animation.core.l> r4 = f5229a
            java.lang.String r6 = "TransformOriginInterruptionHandling"
            r0 = r15 | 3136(0xc40, float:4.394E-42)
            r1 = -142660079(0xfffffffff77f2e11, float:-5.1756642E33)
            r12.mo14918M(r1)
            androidx.compose.animation.EnterExitTransitionKt$createModifier$$inlined$animateValue$1 r1 = androidx.compose.animation.EnterExitTransitionKt$createModifier$$inlined$animateValue$1.f5234f
            java.lang.Object r2 = r27.mo6700h()
            int r3 = r0 >> 9
            r3 = r3 & 112(0x70, float:1.57E-43)
            androidx.compose.animation.EnterExitState r2 = (androidx.compose.animation.EnterExitState) r2
            r7 = -288165413(0xffffffffeed2f1db, float:-3.2642119E28)
            r12.mo14918M(r7)
            boolean r15 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r15 == 0) goto L_0x0437
            java.lang.String r15 = "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:912)"
            r9 = -1
            androidx.compose.runtime.ComposerKt.m29845w0(r7, r3, r9, r15)
        L_0x0437:
            int r2 = r2.ordinal()
            r2 = r11[r2]
            r9 = 1
            if (r2 == r9) goto L_0x048b
            r9 = 2
            if (r2 == r9) goto L_0x046a
            r15 = 3
            if (r2 != r15) goto L_0x0464
            androidx.compose.animation.w r2 = r29.mo7028b()
            androidx.compose.animation.o r2 = r2.mo7095i()
            if (r2 == 0) goto L_0x0459
        L_0x0450:
            long r20 = r2.mo7071h()
            androidx.compose.ui.graphics.o4 r2 = androidx.compose.p004ui.graphics.C15283o4.m66370b(r20)
            goto L_0x048d
        L_0x0459:
            androidx.compose.animation.w r2 = r28.mo7022b()
            androidx.compose.animation.o r2 = r2.mo7095i()
            if (r2 == 0) goto L_0x0488
            goto L_0x0450
        L_0x0464:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x046a:
            androidx.compose.animation.w r2 = r28.mo7022b()
            androidx.compose.animation.o r2 = r2.mo7095i()
            if (r2 == 0) goto L_0x047d
        L_0x0474:
            long r20 = r2.mo7071h()
            androidx.compose.ui.graphics.o4 r2 = androidx.compose.p004ui.graphics.C15283o4.m66370b(r20)
            goto L_0x048d
        L_0x047d:
            androidx.compose.animation.w r2 = r29.mo7028b()
            androidx.compose.animation.o r2 = r2.mo7095i()
            if (r2 == 0) goto L_0x0488
            goto L_0x0474
        L_0x0488:
            r2 = r22
            goto L_0x048d
        L_0x048b:
            r9 = 2
            r2 = r5
        L_0x048d:
            if (r2 == 0) goto L_0x0494
            long r20 = r2.mo42931o()
            goto L_0x049a
        L_0x0494:
            androidx.compose.ui.graphics.o4$a r2 = androidx.compose.p004ui.graphics.C15283o4.f37618b
            long r20 = r2.mo42933a()
        L_0x049a:
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x04a3
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x04a3:
            r31.mo15002m0()
            androidx.compose.ui.graphics.o4 r2 = androidx.compose.p004ui.graphics.C15283o4.m66370b(r20)
            java.lang.Object r15 = r27.mo6706o()
            androidx.compose.animation.EnterExitState r15 = (androidx.compose.animation.EnterExitState) r15
            r12.mo14918M(r7)
            boolean r17 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r17 == 0) goto L_0x04c2
            java.lang.String r9 = "androidx.compose.animation.createModifier.<anonymous> (EnterExitTransition.kt:912)"
            r30 = r5
            r5 = -1
            androidx.compose.runtime.ComposerKt.m29845w0(r7, r3, r5, r9)
            goto L_0x04c4
        L_0x04c2:
            r30 = r5
        L_0x04c4:
            int r3 = r15.ordinal()
            r3 = r11[r3]
            r5 = 1
            if (r3 == r5) goto L_0x0518
            r5 = 2
            if (r3 == r5) goto L_0x04f7
            r5 = 3
            if (r3 != r5) goto L_0x04f1
            androidx.compose.animation.w r3 = r29.mo7028b()
            androidx.compose.animation.o r3 = r3.mo7095i()
            if (r3 == 0) goto L_0x04e6
        L_0x04dd:
            long r19 = r3.mo7071h()
            androidx.compose.ui.graphics.o4 r5 = androidx.compose.p004ui.graphics.C15283o4.m66370b(r19)
            goto L_0x051a
        L_0x04e6:
            androidx.compose.animation.w r3 = r28.mo7022b()
            androidx.compose.animation.o r3 = r3.mo7095i()
            if (r3 == 0) goto L_0x0515
            goto L_0x04dd
        L_0x04f1:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x04f7:
            androidx.compose.animation.w r3 = r28.mo7022b()
            androidx.compose.animation.o r3 = r3.mo7095i()
            if (r3 == 0) goto L_0x050a
        L_0x0501:
            long r19 = r3.mo7071h()
            androidx.compose.ui.graphics.o4 r5 = androidx.compose.p004ui.graphics.C15283o4.m66370b(r19)
            goto L_0x051a
        L_0x050a:
            androidx.compose.animation.w r3 = r29.mo7028b()
            androidx.compose.animation.o r3 = r3.mo7095i()
            if (r3 == 0) goto L_0x0515
            goto L_0x0501
        L_0x0515:
            r5 = r22
            goto L_0x051a
        L_0x0518:
            r5 = r30
        L_0x051a:
            if (r5 == 0) goto L_0x0521
            long r19 = r5.mo42931o()
            goto L_0x0527
        L_0x0521:
            androidx.compose.ui.graphics.o4$a r3 = androidx.compose.p004ui.graphics.C15283o4.f37618b
            long r19 = r3.mo42933a()
        L_0x0527:
            boolean r3 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r3 == 0) goto L_0x0530
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x0530:
            r31.mo15002m0()
            androidx.compose.ui.graphics.o4 r3 = androidx.compose.p004ui.graphics.C15283o4.m66370b(r19)
            androidx.compose.animation.core.Transition$b r5 = r27.mo6704m()
            int r7 = r0 >> 3
            r7 = r7 & 112(0x70, float:1.57E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r1 = r1.invoke(r5, r12, r7)
            r5 = r1
            androidx.compose.animation.core.d0 r5 = (androidx.compose.animation.core.C1956d0) r5
            r1 = r0 & 14
            int r7 = r0 << 9
            r7 = r7 & r18
            r1 = r1 | r7
            int r0 = r0 << 6
            r0 = r0 & r16
            r7 = r1 | r0
            r0 = r27
            r1 = r2
            r2 = r3
            r3 = r5
            r5 = r6
            r6 = r31
            androidx.compose.runtime.k2 r0 = androidx.compose.animation.core.TransitionKt.m8194m(r0, r1, r2, r3, r4, r5, r6, r7)
            r31.mo15002m0()
            r1 = 1618982084(0x607fb4c4, float:7.370227E19)
            r12.mo14918M(r1)
            boolean r1 = r12.mo15006n0(r8)
            boolean r2 = r12.mo15006n0(r10)
            r1 = r1 | r2
            boolean r2 = r12.mo15006n0(r0)
            r1 = r1 | r2
            java.lang.Object r2 = r31.mo14921N()
            if (r1 != 0) goto L_0x0586
            java.lang.Object r1 = r13.mo16277a()
            if (r2 != r1) goto L_0x058e
        L_0x0586:
            androidx.compose.animation.EnterExitTransitionKt$createModifier$1$1 r2 = new androidx.compose.animation.EnterExitTransitionKt$createModifier$1$1
            r2.<init>(r8, r10, r0)
            r12.mo14893C(r2)
        L_0x058e:
            r31.mo15002m0()
            kotlin.jvm.functions.l r2 = (kotlin.jvm.functions.C11300l) r2
            androidx.compose.ui.m r14 = androidx.compose.p004ui.graphics.C15320t2.m66557a(r14, r2)
            r31.mo15002m0()
            goto L_0x05dd
        L_0x059b:
            boolean r0 = m7828h(r21)
            if (r0 == 0) goto L_0x05d4
            r0 = 1657244550(0x62c78b86, float:1.8404779E21)
            r12.mo14918M(r0)
            r0 = 1157296644(0x44faf204, float:2007.563)
            r12.mo14918M(r0)
            boolean r0 = r12.mo15006n0(r8)
            java.lang.Object r1 = r31.mo14921N()
            if (r0 != 0) goto L_0x05bf
            androidx.compose.runtime.o$a r0 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r0 = r0.mo16277a()
            if (r1 != r0) goto L_0x05c7
        L_0x05bf:
            androidx.compose.animation.EnterExitTransitionKt$createModifier$2$1 r1 = new androidx.compose.animation.EnterExitTransitionKt$createModifier$2$1
            r1.<init>(r8)
            r12.mo14893C(r1)
        L_0x05c7:
            r31.mo15002m0()
            kotlin.jvm.functions.l r1 = (kotlin.jvm.functions.C11300l) r1
            androidx.compose.ui.m r14 = androidx.compose.p004ui.graphics.C15320t2.m66557a(r14, r1)
            r31.mo15002m0()
            goto L_0x05dd
        L_0x05d4:
            r0 = 1657244642(0x62c78be2, float:1.8404908E21)
            r12.mo14918M(r0)
            r31.mo15002m0()
        L_0x05dd:
            boolean r0 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r0 == 0) goto L_0x05e6
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x05e6:
            r31.mo15002m0()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt.m7827g(androidx.compose.animation.core.Transition, androidx.compose.animation.e, androidx.compose.animation.g, java.lang.String, androidx.compose.runtime.o, int):androidx.compose.ui.m");
    }

    /* renamed from: h */
    public static final boolean m7828h(C8700z0<Boolean> z0Var) {
        return z0Var.getValue().booleanValue();
    }

    /* renamed from: i */
    public static final float m7829i(C8578k2<Float> k2Var) {
        return k2Var.getValue().floatValue();
    }

    /* renamed from: j */
    public static final long m7830j(C8578k2<C15283o4> k2Var) {
        return k2Var.getValue().mo42931o();
    }

    /* renamed from: k */
    public static final void m7831k(C8700z0<Boolean> z0Var, boolean z) {
        z0Var.setValue(Boolean.valueOf(z));
    }

    /* renamed from: l */
    public static final boolean m7832l(C8700z0<Boolean> z0Var) {
        return z0Var.getValue().booleanValue();
    }

    /* renamed from: m */
    public static final void m7833m(C8700z0<Boolean> z0Var, boolean z) {
        z0Var.setValue(Boolean.valueOf(z));
    }

    /* renamed from: n */
    public static final float m7834n(C8578k2<Float> k2Var) {
        return k2Var.getValue().floatValue();
    }

    @C8547h2
    @C12579k
    /* renamed from: o */
    public static final C2025e m7835o(@C12579k C1956d0<C16500q> d0Var, @C12579k C8734c.C8736b bVar, boolean z, @C12579k C11300l<? super Integer, Integer> lVar) {
        Intrinsics.checkNotNullParameter(d0Var, "animationSpec");
        Intrinsics.checkNotNullParameter(bVar, "expandFrom");
        Intrinsics.checkNotNullParameter(lVar, "initialWidth");
        return m7837q(d0Var, m7819W(bVar), z, new EnterExitTransitionKt$expandHorizontally$2(lVar));
    }

    /* renamed from: p */
    public static /* synthetic */ C2025e m7836p(C1956d0 d0Var, C8734c.C8736b bVar, boolean z, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            d0Var = C1972h.m8390o(0.0f, 400.0f, C16500q.m74651b(C2002p1.m8578g(C16500q.f40900b)), 1, (Object) null);
        }
        if ((i & 2) != 0) {
            bVar = C8734c.f23406a.mo17071s();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            lVar = EnterExitTransitionKt$expandHorizontally$1.f5237f;
        }
        return m7835o(d0Var, bVar, z, lVar);
    }

    @C8547h2
    @C12579k
    /* renamed from: q */
    public static final C2025e m7837q(@C12579k C1956d0<C16500q> d0Var, @C12579k C8734c cVar, boolean z, @C12579k C11300l<? super C16500q, C16500q> lVar) {
        Intrinsics.checkNotNullParameter(d0Var, "animationSpec");
        Intrinsics.checkNotNullParameter(cVar, "expandFrom");
        Intrinsics.checkNotNullParameter(lVar, "initialSize");
        return new C2027f(new C2047w((C2033j) null, (C2043s) null, new ChangeSize(cVar, lVar, d0Var, z), (C2039o) null, 11, (DefaultConstructorMarker) null));
    }

    /* renamed from: r */
    public static /* synthetic */ C2025e m7838r(C1956d0 d0Var, C8734c cVar, boolean z, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            d0Var = C1972h.m8390o(0.0f, 400.0f, C16500q.m74651b(C2002p1.m8578g(C16500q.f40900b)), 1, (Object) null);
        }
        if ((i & 2) != 0) {
            cVar = C8734c.f23406a.mo17064e();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            lVar = EnterExitTransitionKt$expandIn$1.f5238f;
        }
        return m7837q(d0Var, cVar, z, lVar);
    }

    @C8547h2
    @C12579k
    /* renamed from: s */
    public static final C2025e m7839s(@C12579k C1956d0<C16500q> d0Var, @C12579k C8734c.C8737c cVar, boolean z, @C12579k C11300l<? super Integer, Integer> lVar) {
        Intrinsics.checkNotNullParameter(d0Var, "animationSpec");
        Intrinsics.checkNotNullParameter(cVar, "expandFrom");
        Intrinsics.checkNotNullParameter(lVar, "initialHeight");
        return m7837q(d0Var, m7820X(cVar), z, new EnterExitTransitionKt$expandVertically$2(lVar));
    }

    /* renamed from: t */
    public static /* synthetic */ C2025e m7840t(C1956d0 d0Var, C8734c.C8737c cVar, boolean z, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            d0Var = C1972h.m8390o(0.0f, 400.0f, C16500q.m74651b(C2002p1.m8578g(C16500q.f40900b)), 1, (Object) null);
        }
        if ((i & 2) != 0) {
            cVar = C8734c.f23406a.mo17062a();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            lVar = EnterExitTransitionKt$expandVertically$1.f5239f;
        }
        return m7839s(d0Var, cVar, z, lVar);
    }

    @C8547h2
    @C12579k
    /* renamed from: u */
    public static final C2025e m7841u(@C12579k C1956d0<Float> d0Var, float f) {
        Intrinsics.checkNotNullParameter(d0Var, "animationSpec");
        return new C2027f(new C2047w(new C2033j(f, d0Var), (C2043s) null, (ChangeSize) null, (C2039o) null, 14, (DefaultConstructorMarker) null));
    }

    /* renamed from: v */
    public static /* synthetic */ C2025e m7842v(C1956d0 d0Var, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            d0Var = C1972h.m8390o(0.0f, 400.0f, (Object) null, 5, (Object) null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return m7841u(d0Var, f);
    }

    @C8547h2
    @C12579k
    /* renamed from: w */
    public static final C2028g m7843w(@C12579k C1956d0<Float> d0Var, float f) {
        Intrinsics.checkNotNullParameter(d0Var, "animationSpec");
        return new C2030h(new C2047w(new C2033j(f, d0Var), (C2043s) null, (ChangeSize) null, (C2039o) null, 14, (DefaultConstructorMarker) null));
    }

    /* renamed from: x */
    public static /* synthetic */ C2028g m7844x(C1956d0 d0Var, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            d0Var = C1972h.m8390o(0.0f, 400.0f, (Object) null, 5, (Object) null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return m7843w(d0Var, f);
    }

    @C2031i
    @C8547h2
    @C12579k
    /* renamed from: y */
    public static final C2025e m7845y(@C12579k C1956d0<Float> d0Var, float f, long j) {
        Intrinsics.checkNotNullParameter(d0Var, "animationSpec");
        return new C2027f(new C2047w((C2033j) null, (C2043s) null, (ChangeSize) null, new C2039o(f, j, d0Var, (DefaultConstructorMarker) null), 7, (DefaultConstructorMarker) null));
    }

    /* renamed from: z */
    public static /* synthetic */ C2025e m7846z(C1956d0 d0Var, float f, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            d0Var = C1972h.m8390o(0.0f, 400.0f, (Object) null, 5, (Object) null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            j = C15283o4.f37618b.mo42933a();
        }
        return m7845y(d0Var, f, j);
    }
}

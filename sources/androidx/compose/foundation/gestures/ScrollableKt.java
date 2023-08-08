package androidx.compose.foundation.gestures;

import androidx.compose.foundation.C2253k0;
import androidx.compose.foundation.interaction.C2243g;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.C8773n;
import androidx.compose.p004ui.input.nestedscroll.C15446a;
import androidx.compose.p004ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p004ui.modifier.C15630f;
import androidx.compose.p004ui.modifier.C15638m;
import androidx.compose.runtime.C8578k2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,579:1\n135#2:580\n25#3:581\n36#3:588\n25#3:595\n36#3:602\n50#3:609\n49#3:610\n1114#4,6:582\n1114#4,6:589\n1114#4,6:596\n1114#4,6:603\n1114#4,6:611\n*S KotlinDebug\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollableKt\n*L\n146#1:580\n252#1:581\n263#1:588\n266#1:595\n275#1:602\n276#1:609\n276#1:610\n252#1:582,6\n263#1:589,6\n266#1:596,6\n275#1:603,6\n276#1:611,6\n*E\n"})
public final class ScrollableKt {
    @C12579k

    /* renamed from: a */
    public static final C2201l f5895a = new C2154b();
    @C12579k

    /* renamed from: b */
    public static final C15638m<Boolean> f5896b = C15630f.m69509a(ScrollableKt$ModifierLocalScrollableContainer$1.f5899f);

    /* renamed from: c */
    public static final float f5897c = 1.0f;
    @C12579k

    /* renamed from: d */
    public static final C8773n f5898d = new C2153a();

    /* renamed from: androidx.compose.foundation.gestures.ScrollableKt$a */
    public static final class C2153a implements C8773n {
        @C12579k
        /* renamed from: Q */
        public CoroutineContext mo7443Q(@C12579k CoroutineContext coroutineContext) {
            return C8773n.C8774a.m32645d(this, coroutineContext);
        }

        @C12580l
        /* renamed from: b */
        public <E extends CoroutineContext.C11040a> E mo7444b(@C12579k CoroutineContext.C11042b<E> bVar) {
            return C8773n.C8774a.m32643b(this, bVar);
        }

        @C12579k
        /* renamed from: f */
        public CoroutineContext mo7445f(@C12579k CoroutineContext.C11042b<?> bVar) {
            return C8773n.C8774a.m32644c(this, bVar);
        }

        /* renamed from: l */
        public <R> R mo7446l(R r, @C12579k C11304p<? super R, ? super CoroutineContext.C11040a, ? extends R> pVar) {
            return C8773n.C8774a.m32642a(this, r, pVar);
        }

        /* renamed from: w */
        public float mo7447w() {
            return 1.0f;
        }
    }

    /* renamed from: androidx.compose.foundation.gestures.ScrollableKt$b */
    public static final class C2154b implements C2201l {
        /* renamed from: a */
        public float mo7360a(float f) {
            return f;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056 A[RETURN] */
    /* renamed from: e */
    public static final java.lang.Object m9380e(androidx.compose.p004ui.input.pointer.C15465c r5, kotlin.coroutines.C11045c<? super androidx.compose.p004ui.input.pointer.C15491o> r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1 r0 = (androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1 r0 = new androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.input.pointer.c r5 = (androidx.compose.p004ui.input.pointer.C15465c) r5
            kotlin.C11661u0.m45747n(r6)
            goto L_0x0044
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            kotlin.C11661u0.m45747n(r6)
        L_0x0038:
            r0.L$0 = r5
            r0.label = r3
            r6 = 0
            java.lang.Object r6 = androidx.compose.p004ui.input.pointer.C15465c.m68462X0(r5, r6, r0, r3, r6)
            if (r6 != r1) goto L_0x0044
            return r1
        L_0x0044:
            androidx.compose.ui.input.pointer.o r6 = (androidx.compose.p004ui.input.pointer.C15491o) r6
            int r2 = r6.mo44114i()
            androidx.compose.ui.input.pointer.q$a r4 = androidx.compose.p004ui.input.pointer.C15493q.f38527b
            int r4 = r4.mo44125f()
            boolean r2 = androidx.compose.p004ui.input.pointer.C15493q.m68708k(r2, r4)
            if (r2 == 0) goto L_0x0038
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt.m9380e(androidx.compose.ui.input.pointer.c, kotlin.coroutines.c):java.lang.Object");
    }

    @C12579k
    /* renamed from: f */
    public static final C8773n m9381f() {
        return f5898d;
    }

    @C12579k
    /* renamed from: g */
    public static final C15638m<Boolean> m9382g() {
        return f5896b;
    }

    /* renamed from: h */
    public static final C8767m m9383h(C8767m mVar, C8578k2<ScrollingLogic> k2Var, C2200k kVar) {
        return SuspendingPointerInputFilterKt.m68436b(mVar, k2Var, kVar, new ScrollableKt$mouseWheelScroll$1(kVar, k2Var, (C11045c<? super ScrollableKt$mouseWheelScroll$1>) null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: kotlin.jvm.functions.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: kotlin.jvm.functions.q} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.runtime.C8540g
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p004ui.C8767m m9384i(androidx.compose.p004ui.C8767m r24, androidx.compose.foundation.interaction.C2243g r25, androidx.compose.foundation.gestures.Orientation r26, boolean r27, androidx.compose.foundation.gestures.C2203n r28, androidx.compose.foundation.gestures.C2195g r29, androidx.compose.foundation.C2253k0 r30, boolean r31, androidx.compose.runtime.C8592o r32, int r33) {
        /*
            r0 = r32
            r1 = -2012025036(0xffffffff8812ef34, float:-4.421646E-34)
            r0.mo14918M(r1)
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x0016
            r2 = -1
            java.lang.String r3 = "androidx.compose.foundation.gestures.pointerScrollable (Scrollable.kt:241)"
            r4 = r33
            androidx.compose.runtime.ComposerKt.m29845w0(r1, r4, r2, r3)
        L_0x0016:
            r1 = -1730186281(0xffffffff98df73d7, float:-5.7761117E-24)
            r0.mo14918M(r1)
            if (r29 != 0) goto L_0x0027
            androidx.compose.foundation.gestures.m r1 = androidx.compose.foundation.gestures.C2202m.f5935a
            r2 = 6
            androidx.compose.foundation.gestures.g r1 = r1.mo7540a(r0, r2)
            r7 = r1
            goto L_0x0029
        L_0x0027:
            r7 = r29
        L_0x0029:
            r32.mo15002m0()
            r1 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r0.mo14918M(r1)
            java.lang.Object r2 = r32.mo14921N()
            androidx.compose.runtime.o$a r9 = androidx.compose.runtime.C8592o.f23032a
            java.lang.Object r3 = r9.mo16277a()
            r10 = 0
            if (r2 != r3) goto L_0x004c
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r2 = new androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher
            r2.<init>()
            r3 = 2
            androidx.compose.runtime.z0 r2 = androidx.compose.runtime.C8539f2.m30981g(r2, r10, r3, r10)
            r0.mo14893C(r2)
        L_0x004c:
            r32.mo15002m0()
            r11 = r2
            androidx.compose.runtime.z0 r11 = (androidx.compose.runtime.C8700z0) r11
            androidx.compose.foundation.gestures.ScrollingLogic r12 = new androidx.compose.foundation.gestures.ScrollingLogic
            r2 = r12
            r3 = r26
            r4 = r27
            r5 = r11
            r6 = r28
            r8 = r30
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r2 = 0
            androidx.compose.runtime.k2 r3 = androidx.compose.runtime.C8415c2.m30251t(r12, r0, r2)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r31)
            r5 = 1157296644(0x44faf204, float:2007.563)
            r0.mo14918M(r5)
            boolean r4 = r0.mo15006n0(r4)
            java.lang.Object r6 = r32.mo14921N()
            if (r4 != 0) goto L_0x0084
            java.lang.Object r4 = r9.mo16277a()
            if (r6 != r4) goto L_0x0081
            goto L_0x0084
        L_0x0081:
            r4 = r31
            goto L_0x008d
        L_0x0084:
            r4 = r31
            androidx.compose.ui.input.nestedscroll.a r6 = m9389n(r3, r4)
            r0.mo14893C(r6)
        L_0x008d:
            r32.mo15002m0()
            androidx.compose.ui.input.nestedscroll.a r6 = (androidx.compose.p004ui.input.nestedscroll.C15446a) r6
            r0.mo14918M(r1)
            java.lang.Object r1 = r32.mo14921N()
            java.lang.Object r7 = r9.mo16277a()
            if (r1 != r7) goto L_0x00a7
            androidx.compose.foundation.gestures.ScrollDraggableState r1 = new androidx.compose.foundation.gestures.ScrollDraggableState
            r1.<init>(r3)
            r0.mo14893C(r1)
        L_0x00a7:
            r32.mo15002m0()
            r13 = r1
            androidx.compose.foundation.gestures.ScrollDraggableState r13 = (androidx.compose.foundation.gestures.ScrollDraggableState) r13
            androidx.compose.foundation.gestures.k r1 = androidx.compose.foundation.gestures.C2185b.m9516a(r0, r2)
            androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$1 r14 = androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$1.f5900f
            r0.mo14918M(r5)
            boolean r2 = r0.mo15006n0(r3)
            java.lang.Object r5 = r32.mo14921N()
            if (r2 != 0) goto L_0x00c6
            java.lang.Object r2 = r9.mo16277a()
            if (r5 != r2) goto L_0x00ce
        L_0x00c6:
            androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$2$1 r5 = new androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$2$1
            r5.<init>(r3)
            r0.mo14893C(r5)
        L_0x00ce:
            r32.mo15002m0()
            r18 = r5
            kotlin.jvm.functions.a r18 = (kotlin.jvm.functions.C11289a) r18
            r19 = 0
            r2 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r0.mo14918M(r2)
            boolean r2 = r0.mo15006n0(r11)
            boolean r5 = r0.mo15006n0(r3)
            r2 = r2 | r5
            java.lang.Object r5 = r32.mo14921N()
            if (r2 != 0) goto L_0x00f2
            java.lang.Object r2 = r9.mo16277a()
            if (r5 != r2) goto L_0x00fa
        L_0x00f2:
            androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$3$1 r5 = new androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$3$1
            r5.<init>(r11, r3, r10)
            r0.mo14893C(r5)
        L_0x00fa:
            r32.mo15002m0()
            r20 = r5
            kotlin.jvm.functions.q r20 = (kotlin.jvm.functions.C11305q) r20
            r21 = 0
            r22 = 64
            r23 = 0
            r12 = r24
            r15 = r26
            r16 = r31
            r17 = r25
            androidx.compose.ui.m r2 = androidx.compose.foundation.gestures.DraggableKt.m9308l(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            androidx.compose.ui.m r1 = m9383h(r2, r3, r1)
            java.lang.Object r2 = r11.getValue()
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r2 = (androidx.compose.p004ui.input.nestedscroll.NestedScrollDispatcher) r2
            androidx.compose.ui.m r1 = androidx.compose.p004ui.input.nestedscroll.NestedScrollModifierKt.m68304a(r1, r6, r2)
            boolean r2 = androidx.compose.runtime.ComposerKt.m29813g0()
            if (r2 == 0) goto L_0x012a
            androidx.compose.runtime.ComposerKt.m29843v0()
        L_0x012a:
            r32.mo15002m0()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt.m9384i(androidx.compose.ui.m, androidx.compose.foundation.interaction.g, androidx.compose.foundation.gestures.Orientation, boolean, androidx.compose.foundation.gestures.n, androidx.compose.foundation.gestures.g, androidx.compose.foundation.k0, boolean, androidx.compose.runtime.o, int):androidx.compose.ui.m");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: kotlin.jvm.functions.l<androidx.compose.ui.platform.v0, kotlin.d2>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.compose.foundation.gestures.ScrollableKt$scrollable$$inlined$debugInspectorInfo$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: androidx.compose.foundation.gestures.ScrollableKt$scrollable$$inlined$debugInspectorInfo$1} */
    /* JADX WARNING: type inference failed for: r1v4, types: [kotlin.jvm.functions.l] */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.compose.foundation.C2855v
    @org.jetbrains.annotations.C12579k
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p004ui.C8767m m9385j(@org.jetbrains.annotations.C12579k androidx.compose.p004ui.C8767m r13, @org.jetbrains.annotations.C12579k androidx.compose.foundation.gestures.C2203n r14, @org.jetbrains.annotations.C12579k androidx.compose.foundation.gestures.Orientation r15, @org.jetbrains.annotations.C12580l androidx.compose.foundation.C2253k0 r16, boolean r17, boolean r18, @org.jetbrains.annotations.C12580l androidx.compose.foundation.gestures.C2195g r19, @org.jetbrains.annotations.C12580l androidx.compose.foundation.interaction.C2243g r20) {
        /*
            r0 = r13
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r1)
            java.lang.String r1 = "state"
            r10 = r14
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r1)
            java.lang.String r1 = "orientation"
            r11 = r15
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r1)
            boolean r1 = androidx.compose.p004ui.platform.InspectableValueKt.m71063e()
            if (r1 == 0) goto L_0x002b
            androidx.compose.foundation.gestures.ScrollableKt$scrollable$$inlined$debugInspectorInfo$1 r1 = new androidx.compose.foundation.gestures.ScrollableKt$scrollable$$inlined$debugInspectorInfo$1
            r2 = r1
            r3 = r15
            r4 = r14
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x002f
        L_0x002b:
            kotlin.jvm.functions.l r1 = androidx.compose.p004ui.platform.InspectableValueKt.m71060b()
        L_0x002f:
            androidx.compose.foundation.gestures.ScrollableKt$scrollable$2 r12 = new androidx.compose.foundation.gestures.ScrollableKt$scrollable$2
            r2 = r12
            r3 = r15
            r4 = r14
            r5 = r18
            r6 = r20
            r7 = r19
            r8 = r16
            r9 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            androidx.compose.ui.m r0 = androidx.compose.p004ui.ComposedModifierKt.m32282e(r13, r1, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt.m9385j(androidx.compose.ui.m, androidx.compose.foundation.gestures.n, androidx.compose.foundation.gestures.Orientation, androidx.compose.foundation.k0, boolean, boolean, androidx.compose.foundation.gestures.g, androidx.compose.foundation.interaction.g):androidx.compose.ui.m");
    }

    @C12579k
    /* renamed from: k */
    public static final C8767m m9386k(@C12579k C8767m mVar, @C12579k C2203n nVar, @C12579k Orientation orientation, boolean z, boolean z2, @C12580l C2195g gVar, @C12580l C2243g gVar2) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(nVar, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        return m9385j(mVar, nVar, orientation, (C2253k0) null, z, z2, gVar, gVar2);
    }

    /* renamed from: l */
    public static /* synthetic */ C8767m m9387l(C8767m mVar, C2203n nVar, Orientation orientation, C2253k0 k0Var, boolean z, boolean z2, C2195g gVar, C2243g gVar2, int i, Object obj) {
        return m9385j(mVar, nVar, orientation, k0Var, (i & 8) != 0 ? true : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : gVar, (i & 64) != 0 ? null : gVar2);
    }

    /* renamed from: m */
    public static /* synthetic */ C8767m m9388m(C8767m mVar, C2203n nVar, Orientation orientation, boolean z, boolean z2, C2195g gVar, C2243g gVar2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = false;
        }
        return m9386k(mVar, nVar, orientation, z3, z2, (i & 16) != 0 ? null : gVar, (i & 32) != 0 ? null : gVar2);
    }

    /* renamed from: n */
    public static final C15446a m9389n(C8578k2<ScrollingLogic> k2Var, boolean z) {
        return new ScrollableKt$scrollableNestedScrollConnection$1(k2Var, z);
    }
}

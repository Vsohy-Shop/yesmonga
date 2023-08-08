package androidx.compose.p004ui.semantics;

import androidx.compose.p004ui.C8761g;
import androidx.compose.p004ui.state.ToggleableState;
import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16356n0;
import androidx.compose.p004ui.text.input.C16310p;
import java.util.List;
import kotlin.C11079d2;
import kotlin.C11660u;
import kotlin.collections.C10976s;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.reflect.C11510n;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.semantics.SemanticsPropertiesKt */
public final class SemanticsPropertiesKt {

    /* renamed from: a */
    public static final /* synthetic */ C11510n<Object>[] f39763a;

    static {
        Class<SemanticsPropertiesKt> cls = SemanticsPropertiesKt.class;
        f39763a = new C11510n[]{C11342l0.m43554k(new MutablePropertyReference1Impl(cls, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), C11342l0.m43554k(new MutablePropertyReference1Impl(cls, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1)), C11342l0.m43554k(new MutablePropertyReference1Impl(cls, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), C11342l0.m43554k(new MutablePropertyReference1Impl(cls, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), C11342l0.m43554k(new MutablePropertyReference1Impl(cls, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), C11342l0.m43554k(new MutablePropertyReference1Impl(cls, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), C11342l0.m43554k(new MutablePropertyReference1Impl(cls, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), C11342l0.m43554k(new MutablePropertyReference1Impl(cls, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1)), C11342l0.m43554k(new MutablePropertyReference1Impl(cls, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), C11342l0.m43554k(new MutablePropertyReference1Impl(cls, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1)), C11342l0.m43554k(new MutablePropertyReference1Impl(cls, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1)), C11342l0.m43554k(new MutablePropertyReference1Impl(cls, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1)), C11342l0.m43554k(new MutablePropertyReference1Impl(cls, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1)), C11342l0.m43554k(new MutablePropertyReference1Impl(cls, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)), C11342l0.m43554k(new MutablePropertyReference1Impl(cls, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1)), C11342l0.m43554k(new MutablePropertyReference1Impl(cls, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1)), C11342l0.m43554k(new MutablePropertyReference1Impl(cls, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1)), C11342l0.m43554k(new MutablePropertyReference1Impl(cls, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1))};
        SemanticsProperties semanticsProperties = SemanticsProperties.f39725a;
        semanticsProperties.mo46068x();
        semanticsProperties.mo46064t();
        semanticsProperties.mo46062r();
        semanticsProperties.mo46061q();
        semanticsProperties.mo46052g();
        semanticsProperties.mo46058n();
        semanticsProperties.mo46054i();
        semanticsProperties.mo46045C();
        semanticsProperties.mo46065u();
        semanticsProperties.mo46069y();
        semanticsProperties.mo46050e();
        semanticsProperties.mo46043A();
        semanticsProperties.mo46055j();
        semanticsProperties.mo46067w();
        semanticsProperties.mo46046a();
        semanticsProperties.mo46047b();
        semanticsProperties.mo46044B();
        C16034i.f39806a.mo46134c();
    }

    @C12579k
    /* renamed from: A */
    public static final C16033h m71946A(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return SemanticsProperties.f39725a.mo46054i().mo46084c(qVar, f39763a[6]);
    }

    /* renamed from: A0 */
    public static final void m71947A0(@C12579k C16044q qVar, @C12580l String str, @C12579k C11300l<? super Integer, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "action");
        qVar.mo46157e(C16034i.f39806a.mo46148q(), new C16023a(str, lVar));
    }

    /* renamed from: B */
    public static Object m71948B(C16044q qVar) {
        return SemanticsProperties.f39725a.mo46054i();
    }

    /* renamed from: B0 */
    public static /* synthetic */ void m71949B0(C16044q qVar, String str, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        m71947A0(qVar, str, lVar);
    }

    /* renamed from: C */
    public static final int m71950C(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return SemanticsProperties.f39725a.mo46055j().mo46084c(qVar, f39763a[12]).mo47277o();
    }

    /* renamed from: C0 */
    public static final void m71951C0(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        qVar.mo46157e(SemanticsProperties.f39725a.mo46066v(), C11079d2.f28267a);
    }

    /* renamed from: D */
    public static Object m71952D(C16044q qVar) {
        return SemanticsProperties.f39725a.mo46055j();
    }

    /* renamed from: D0 */
    public static final void m71953D0(@C12579k C16044q qVar, @C12579k C16024b bVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        SemanticsProperties.f39725a.mo46046a().mo46086e(qVar, f39763a[14], bVar);
    }

    /* renamed from: E */
    public static final int m71954E(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return SemanticsProperties.f39725a.mo46061q().mo46084c(qVar, f39763a[3]).mo46106i();
    }

    /* renamed from: E0 */
    public static final void m71955E0(@C12579k C16044q qVar, @C12579k C16025c cVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        SemanticsProperties.f39725a.mo46047b().mo46086e(qVar, f39763a[15], cVar);
    }

    /* renamed from: F */
    public static Object m71956F(C16044q qVar) {
        return SemanticsProperties.f39725a.mo46061q();
    }

    /* renamed from: F0 */
    public static final void m71957F0(@C12579k C16044q qVar, boolean z) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        SemanticsProperties.f39725a.mo46058n().mo46086e(qVar, f39763a[5], Boolean.valueOf(z));
    }

    @C12579k
    /* renamed from: G */
    public static final String m71958G(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return SemanticsProperties.f39725a.mo46062r().mo46084c(qVar, f39763a[2]);
    }

    /* renamed from: G0 */
    public static final void m71959G0(@C12579k C16044q qVar, @C12579k String str) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Intrinsics.checkNotNullParameter(str, "value");
        qVar.mo46157e(SemanticsProperties.f39725a.mo46048c(), C10976s.m41419k(str));
    }

    /* renamed from: H */
    public static Object m71960H(C16044q qVar) {
        return SemanticsProperties.f39725a.mo46062r();
    }

    /* renamed from: H0 */
    public static final void m71961H0(@C12579k C16044q qVar, @C12579k List<C16026d> list) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        C16034i.f39806a.mo46134c().mo46086e(qVar, f39763a[17], list);
    }

    @C12579k
    /* renamed from: I */
    public static final C16029f m71962I(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return SemanticsProperties.f39725a.mo46064t().mo46084c(qVar, f39763a[1]);
    }

    /* renamed from: I0 */
    public static final void m71963I0(@C12579k C16044q qVar, @C12579k C16156d dVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Intrinsics.checkNotNullParameter(dVar, "<set-?>");
        SemanticsProperties.f39725a.mo46050e().mo46086e(qVar, f39763a[10], dVar);
    }

    /* renamed from: J */
    public static Object m71964J(C16044q qVar) {
        return SemanticsProperties.f39725a.mo46064t();
    }

    /* renamed from: J0 */
    public static final void m71965J0(@C12579k C16044q qVar, boolean z) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        SemanticsProperties.f39725a.mo46052g().mo46086e(qVar, f39763a[4], Boolean.valueOf(z));
    }

    /* renamed from: K */
    public static final int m71966K(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return SemanticsProperties.f39725a.mo46065u().mo46084c(qVar, f39763a[8]).mo46119n();
    }

    /* renamed from: K0 */
    public static final void m71967K0(@C12579k C16044q qVar, @C12579k C16033h hVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Intrinsics.checkNotNullParameter(hVar, "<set-?>");
        SemanticsProperties.f39725a.mo46054i().mo46086e(qVar, f39763a[6], hVar);
    }

    /* renamed from: L */
    public static Object m71968L(C16044q qVar) {
        return SemanticsProperties.f39725a.mo46065u();
    }

    /* renamed from: L0 */
    public static final void m71969L0(@C12579k C16044q qVar, int i) {
        Intrinsics.checkNotNullParameter(qVar, "$this$imeAction");
        SemanticsProperties.f39725a.mo46055j().mo46086e(qVar, f39763a[12], C16310p.m73492i(i));
    }

    /* renamed from: M */
    public static final boolean m71970M(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return SemanticsProperties.f39725a.mo46067w().mo46084c(qVar, f39763a[13]).booleanValue();
    }

    /* renamed from: M0 */
    public static final void m71971M0(@C12579k C16044q qVar, int i) {
        Intrinsics.checkNotNullParameter(qVar, "$this$liveRegion");
        SemanticsProperties.f39725a.mo46061q().mo46086e(qVar, f39763a[3], C16027e.m72072c(i));
    }

    /* renamed from: N */
    public static Object m71972N(C16044q qVar) {
        return SemanticsProperties.f39725a.mo46067w();
    }

    /* renamed from: N0 */
    public static final void m71973N0(@C12579k C16044q qVar, @C12579k String str) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        SemanticsProperties.f39725a.mo46062r().mo46086e(qVar, f39763a[2], str);
    }

    @C12579k
    /* renamed from: O */
    public static final String m71974O(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return SemanticsProperties.f39725a.mo46068x().mo46084c(qVar, f39763a[0]);
    }

    /* renamed from: O0 */
    public static final void m71975O0(@C12579k C16044q qVar, @C12580l String str, @C12580l C11300l<? super Float, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        qVar.mo46157e(C16034i.f39806a.mo46149r(), new C16023a(str, lVar));
    }

    /* renamed from: P */
    public static Object m71976P(C16044q qVar) {
        return SemanticsProperties.f39725a.mo46068x();
    }

    /* renamed from: P0 */
    public static /* synthetic */ void m71977P0(C16044q qVar, String str, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        m71975O0(qVar, str, lVar);
    }

    @C12579k
    /* renamed from: Q */
    public static final String m71978Q(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return SemanticsProperties.f39725a.mo46069y().mo46084c(qVar, f39763a[9]);
    }

    /* renamed from: Q0 */
    public static final void m71979Q0(@C12579k C16044q qVar, @C12579k C16029f fVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Intrinsics.checkNotNullParameter(fVar, "<set-?>");
        SemanticsProperties.f39725a.mo46064t().mo46086e(qVar, f39763a[1], fVar);
    }

    /* renamed from: R */
    public static Object m71980R(C16044q qVar) {
        return SemanticsProperties.f39725a.mo46069y();
    }

    /* renamed from: R0 */
    public static final void m71981R0(@C12579k C16044q qVar, int i) {
        Intrinsics.checkNotNullParameter(qVar, "$this$role");
        SemanticsProperties.f39725a.mo46065u().mo46086e(qVar, f39763a[8], C16031g.m72093h(i));
    }

    @C12579k
    /* renamed from: S */
    public static final C16156d m71982S(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return (C16156d) m72009d1();
    }

    /* renamed from: S0 */
    public static final void m71983S0(@C12579k C16044q qVar, boolean z) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        SemanticsProperties.f39725a.mo46067w().mo46086e(qVar, f39763a[13], Boolean.valueOf(z));
    }

    /* renamed from: T */
    public static final void m71984T(@C12579k C16044q qVar, @C12580l String str, @C12580l C11300l<? super List<C16260h0>, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        qVar.mo46157e(C16034i.f39806a.mo46138g(), new C16023a(str, lVar));
    }

    /* renamed from: T0 */
    public static final void m71985T0(@C12579k C16044q qVar, @C12580l String str, @C12580l C11305q<? super Integer, ? super Integer, ? super Boolean, Boolean> qVar2) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        qVar.mo46157e(C16034i.f39806a.mo46150s(), new C16023a(str, qVar2));
    }

    /* renamed from: U */
    public static /* synthetic */ void m71986U(C16044q qVar, String str, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        m71984T(qVar, str, lVar);
    }

    /* renamed from: U0 */
    public static /* synthetic */ void m71987U0(C16044q qVar, String str, C11305q qVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        m71985T0(qVar, str, qVar2);
    }

    /* renamed from: V */
    public static final long m71988V(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return SemanticsProperties.f39725a.mo46043A().mo46084c(qVar, f39763a[11]).mo47427r();
    }

    /* renamed from: V0 */
    public static final void m71989V0(@C12579k C16044q qVar, @C12579k String str) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        SemanticsProperties.f39725a.mo46068x().mo46086e(qVar, f39763a[0], str);
    }

    /* renamed from: W */
    public static Object m71990W(C16044q qVar) {
        return SemanticsProperties.f39725a.mo46043A();
    }

    /* renamed from: W0 */
    public static final void m71991W0(@C12579k C16044q qVar, @C12579k String str) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        SemanticsProperties.f39725a.mo46069y().mo46086e(qVar, f39763a[9], str);
    }

    @C12579k
    /* renamed from: X */
    public static final ToggleableState m71992X(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return SemanticsProperties.f39725a.mo46044B().mo46084c(qVar, f39763a[16]);
    }

    /* renamed from: X0 */
    public static final void m71993X0(@C12579k C16044q qVar, @C12579k C16156d dVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Intrinsics.checkNotNullParameter(dVar, "value");
        qVar.mo46157e(SemanticsProperties.f39725a.mo46070z(), C10976s.m41419k(dVar));
    }

    /* renamed from: Y */
    public static Object m71994Y(C16044q qVar) {
        return SemanticsProperties.f39725a.mo46044B();
    }

    /* renamed from: Y0 */
    public static final void m71995Y0(@C12579k C16044q qVar, @C12580l String str, @C12580l C11300l<? super C16156d, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        qVar.mo46157e(C16034i.f39806a.mo46151t(), new C16023a(str, lVar));
    }

    @C12579k
    /* renamed from: Z */
    public static final C16033h m71996Z(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return SemanticsProperties.f39725a.mo46045C().mo46084c(qVar, f39763a[7]);
    }

    /* renamed from: Z0 */
    public static /* synthetic */ void m71997Z0(C16044q qVar, String str, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        m71995Y0(qVar, str, lVar);
    }

    /* renamed from: a */
    public static final <T extends C11660u<? extends Boolean>> SemanticsPropertyKey<C16023a<T>> m71998a(String str) {
        return new SemanticsPropertyKey<>(str, SemanticsPropertiesKt$ActionPropertyKey$1.f39764f);
    }

    /* renamed from: a0 */
    public static Object m71999a0(C16044q qVar) {
        return SemanticsProperties.f39725a.mo46045C();
    }

    /* renamed from: a1 */
    public static final void m72000a1(@C12579k C16044q qVar, long j) {
        Intrinsics.checkNotNullParameter(qVar, "$this$textSelectionRange");
        SemanticsProperties.f39725a.mo46043A().mo46086e(qVar, f39763a[11], C16356n0.m73730b(j));
    }

    /* renamed from: b0 */
    public static final void m72002b0(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        qVar.mo46157e(SemanticsProperties.f39725a.mo46053h(), C11079d2.f28267a);
    }

    /* renamed from: b1 */
    public static final void m72003b1(@C12579k C16044q qVar, @C12579k ToggleableState toggleableState) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Intrinsics.checkNotNullParameter(toggleableState, "<set-?>");
        SemanticsProperties.f39725a.mo46044B().mo46086e(qVar, f39763a[16], toggleableState);
    }

    /* renamed from: c */
    public static final void m72004c(@C12579k C16044q qVar, @C12580l String str, @C12580l C11289a<Boolean> aVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        qVar.mo46157e(C16034i.f39806a.mo46132a(), new C16023a(str, aVar));
    }

    /* renamed from: c0 */
    public static final void m72005c0(@C12579k C16044q qVar, @C12579k C11300l<Object, Integer> lVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "mapping");
        qVar.mo46157e(SemanticsProperties.f39725a.mo46056k(), lVar);
    }

    /* renamed from: c1 */
    public static final void m72006c1(@C12579k C16044q qVar, @C12579k C16033h hVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Intrinsics.checkNotNullParameter(hVar, "<set-?>");
        SemanticsProperties.f39725a.mo46045C().mo46086e(qVar, f39763a[7], hVar);
    }

    /* renamed from: d */
    public static /* synthetic */ void m72007d(C16044q qVar, String str, C11289a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        m72004c(qVar, str, aVar);
    }

    @C8761g
    /* renamed from: d0 */
    public static final void m72008d0(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        qVar.mo46157e(SemanticsProperties.f39725a.mo46057l(), C11079d2.f28267a);
    }

    /* renamed from: d1 */
    public static final <T> T m72009d1() {
        throw new UnsupportedOperationException("You cannot retrieve a semantics property directly - use one of the SemanticsConfiguration.getOr* methods instead");
    }

    /* renamed from: e */
    public static final void m72010e(@C12579k C16044q qVar, @C12580l String str, @C12580l C11289a<Boolean> aVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        qVar.mo46157e(C16034i.f39806a.mo46133b(), new C16023a(str, aVar));
    }

    /* renamed from: e0 */
    public static final boolean m72011e0(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return SemanticsProperties.f39725a.mo46058n().mo46084c(qVar, f39763a[5]).booleanValue();
    }

    /* renamed from: f */
    public static /* synthetic */ void m72012f(C16044q qVar, String str, C11289a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        m72010e(qVar, str, aVar);
    }

    /* renamed from: f0 */
    public static Object m72013f0(C16044q qVar) {
        return SemanticsProperties.f39725a.mo46058n();
    }

    /* renamed from: g */
    public static final void m72014g(@C12579k C16044q qVar, @C12580l String str, @C12580l C11289a<Boolean> aVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        qVar.mo46157e(C16034i.f39806a.mo46135d(), new C16023a(str, aVar));
    }

    /* renamed from: g0 */
    public static final void m72015g0(@C12579k C16044q qVar, @C12580l String str, @C12580l C11289a<Boolean> aVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        qVar.mo46157e(C16034i.f39806a.mo46139h(), new C16023a(str, aVar));
    }

    /* renamed from: h */
    public static /* synthetic */ void m72016h(C16044q qVar, String str, C11289a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        m72014g(qVar, str, aVar);
    }

    /* renamed from: h0 */
    public static /* synthetic */ void m72017h0(C16044q qVar, String str, C11289a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        m72015g0(qVar, str, aVar);
    }

    /* renamed from: i */
    public static final void m72018i(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        qVar.mo46157e(SemanticsProperties.f39725a.mo46059o(), C11079d2.f28267a);
    }

    /* renamed from: i0 */
    public static final void m72019i0(@C12579k C16044q qVar, @C12580l String str, @C12580l C11289a<Boolean> aVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        qVar.mo46157e(C16034i.f39806a.mo46140i(), new C16023a(str, aVar));
    }

    /* renamed from: j */
    public static final void m72020j(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        qVar.mo46157e(SemanticsProperties.f39725a.mo46049d(), C11079d2.f28267a);
    }

    /* renamed from: j0 */
    public static /* synthetic */ void m72021j0(C16044q qVar, String str, C11289a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        m72019i0(qVar, str, aVar);
    }

    /* renamed from: k */
    public static final void m72022k(@C12579k C16044q qVar, @C12580l String str, @C12580l C11289a<Boolean> aVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        qVar.mo46157e(C16034i.f39806a.mo46136e(), new C16023a(str, aVar));
    }

    /* renamed from: k0 */
    public static final void m72023k0(@C12579k C16044q qVar, @C12580l String str, @C12580l C11289a<Boolean> aVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        qVar.mo46157e(C16034i.f39806a.mo46141j(), new C16023a(str, aVar));
    }

    /* renamed from: l */
    public static /* synthetic */ void m72024l(C16044q qVar, String str, C11289a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        m72022k(qVar, str, aVar);
    }

    /* renamed from: l0 */
    public static /* synthetic */ void m72025l0(C16044q qVar, String str, C11289a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        m72023k0(qVar, str, aVar);
    }

    /* renamed from: m */
    public static final void m72026m(@C12579k C16044q qVar, @C12579k String str) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Intrinsics.checkNotNullParameter(str, "description");
        qVar.mo46157e(SemanticsProperties.f39725a.mo46051f(), str);
    }

    /* renamed from: m0 */
    public static final void m72027m0(@C12579k C16044q qVar, @C12580l String str, @C12580l C11289a<Boolean> aVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        qVar.mo46157e(C16034i.f39806a.mo46142k(), new C16023a(str, aVar));
    }

    /* renamed from: n */
    public static final void m72028n(@C12579k C16044q qVar, @C12580l String str, @C12580l C11289a<Boolean> aVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        qVar.mo46157e(C16034i.f39806a.mo46137f(), new C16023a(str, aVar));
    }

    /* renamed from: n0 */
    public static /* synthetic */ void m72029n0(C16044q qVar, String str, C11289a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        m72027m0(qVar, str, aVar);
    }

    /* renamed from: o */
    public static /* synthetic */ void m72030o(C16044q qVar, String str, C11289a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        m72028n(qVar, str, aVar);
    }

    /* renamed from: o0 */
    public static final void m72031o0(@C12579k C16044q qVar, @C12580l String str, @C12580l C11289a<Boolean> aVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        qVar.mo46157e(C16034i.f39806a.mo46143l(), new C16023a(str, aVar));
    }

    @C12579k
    /* renamed from: p */
    public static final C16024b m72032p(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return SemanticsProperties.f39725a.mo46046a().mo46084c(qVar, f39763a[14]);
    }

    /* renamed from: p0 */
    public static /* synthetic */ void m72033p0(C16044q qVar, String str, C11289a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        m72031o0(qVar, str, aVar);
    }

    /* renamed from: q */
    public static Object m72034q(C16044q qVar) {
        return SemanticsProperties.f39725a.mo46046a();
    }

    /* renamed from: q0 */
    public static final void m72035q0(@C12579k C16044q qVar, @C12580l String str, @C12580l C11289a<Boolean> aVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        qVar.mo46157e(C16034i.f39806a.mo46144m(), new C16023a(str, aVar));
    }

    @C12579k
    /* renamed from: r */
    public static final C16025c m72036r(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return SemanticsProperties.f39725a.mo46047b().mo46084c(qVar, f39763a[15]);
    }

    /* renamed from: r0 */
    public static /* synthetic */ void m72037r0(C16044q qVar, String str, C11289a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        m72035q0(qVar, str, aVar);
    }

    /* renamed from: s */
    public static Object m72038s(C16044q qVar) {
        return SemanticsProperties.f39725a.mo46047b();
    }

    /* renamed from: s0 */
    public static final void m72039s0(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        qVar.mo46157e(SemanticsProperties.f39725a.mo46063s(), C11079d2.f28267a);
    }

    @C12579k
    /* renamed from: t */
    public static final String m72040t(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return (String) m72009d1();
    }

    /* renamed from: t0 */
    public static final void m72041t0(@C12579k C16044q qVar, @C12580l String str, @C12580l C11289a<Boolean> aVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        qVar.mo46157e(C16034i.f39806a.mo46145n(), new C16023a(str, aVar));
    }

    @C12579k
    /* renamed from: u */
    public static final List<C16026d> m72042u(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return C16034i.f39806a.mo46134c().mo46084c(qVar, f39763a[17]);
    }

    /* renamed from: u0 */
    public static /* synthetic */ void m72043u0(C16044q qVar, String str, C11289a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        m72041t0(qVar, str, aVar);
    }

    /* renamed from: v */
    public static Object m72044v(C16044q qVar) {
        return C16034i.f39806a.mo46134c();
    }

    /* renamed from: v0 */
    public static final void m72045v0(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        qVar.mo46157e(SemanticsProperties.f39725a.mo46060p(), C11079d2.f28267a);
    }

    @C12579k
    /* renamed from: w */
    public static final C16156d m72046w(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return SemanticsProperties.f39725a.mo46050e().mo46084c(qVar, f39763a[10]);
    }

    /* renamed from: w0 */
    public static final void m72047w0(@C12579k C16044q qVar, @C12580l String str, @C12580l C11289a<Boolean> aVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        qVar.mo46157e(C16034i.f39806a.mo46146o(), new C16023a(str, aVar));
    }

    /* renamed from: x */
    public static Object m72048x(C16044q qVar) {
        return SemanticsProperties.f39725a.mo46050e();
    }

    /* renamed from: x0 */
    public static /* synthetic */ void m72049x0(C16044q qVar, String str, C11289a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        m72047w0(qVar, str, aVar);
    }

    /* renamed from: y */
    public static final boolean m72050y(@C12579k C16044q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return SemanticsProperties.f39725a.mo46052g().mo46084c(qVar, f39763a[4]).booleanValue();
    }

    /* renamed from: y0 */
    public static final void m72051y0(@C12579k C16044q qVar, @C12580l String str, @C12580l C11304p<? super Float, ? super Float, Boolean> pVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        qVar.mo46157e(C16034i.f39806a.mo46147p(), new C16023a(str, pVar));
    }

    /* renamed from: z */
    public static Object m72052z(C16044q qVar) {
        return SemanticsProperties.f39725a.mo46052g();
    }

    /* renamed from: z0 */
    public static /* synthetic */ void m72053z0(C16044q qVar, String str, C11304p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        m72051y0(qVar, str, pVar);
    }
}

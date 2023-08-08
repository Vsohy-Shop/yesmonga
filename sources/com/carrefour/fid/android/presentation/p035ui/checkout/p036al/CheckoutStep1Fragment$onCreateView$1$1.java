package com.carrefour.fid.android.presentation.p035ui.checkout.p036al;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15205e4;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.text.C16151c0;
import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16194f0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.intl.C16342f;
import androidx.compose.p004ui.text.style.C16410a;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.text.style.C16439m;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.presentation.models.C38486g;
import com.carrefour.fid.android.presentation.p035ui.checkout.common.BasketBannerKt;
import com.carrefour.fid.android.shared.extension.C28782t;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nCheckoutStep1Fragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutStep1Fragment.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/CheckoutStep1Fragment$onCreateView$1$1\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,928:1\n1098#2:929\n927#2,6:930\n1098#2:936\n927#2,6:937\n154#3:943\n67#4,6:944\n73#4:976\n77#4:981\n75#5:950\n76#5,11:952\n89#5:980\n76#6:951\n460#7,13:963\n473#7,3:977\n76#8:982\n*S KotlinDebug\n*F\n+ 1 CheckoutStep1Fragment.kt\ncom/carrefour/fid/android/presentation/ui/checkout/al/CheckoutStep1Fragment$onCreateView$1$1\n*L\n261#1:929\n264#1:930,6\n270#1:936\n273#1:937,6\n284#1:943\n283#1:944,6\n283#1:976\n283#1:981\n283#1:950\n283#1:952,11\n283#1:980\n283#1:951\n283#1:963,13\n283#1:977,3\n259#1:982\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1Fragment$onCreateView$1$1 */
public final class CheckoutStep1Fragment$onCreateView$1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ CheckoutStep1Fragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutStep1Fragment$onCreateView$1$1(CheckoutStep1Fragment checkoutStep1Fragment) {
        super(2);
        this.this$0 = checkoutStep1Fragment;
    }

    /* renamed from: a */
    public static final C38486g m104032a(C8578k2<? extends C38486g> k2Var) {
        return (C38486g) k2Var.getValue();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    /* JADX INFO: finally extract failed */
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        C16156d dVar;
        C8592o oVar2 = oVar;
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-374781269, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.al.CheckoutStep1Fragment.onCreateView.<anonymous>.<anonymous> (CheckoutStep1Fragment.kt:257)");
            }
            C38486g a = m104032a(C8415c2.m30233b(this.this$0.mo68155c1().mo75448m1(), (CoroutineContext) null, oVar2, 8, 1));
            if (a instanceof C38486g.C38487a) {
                oVar2.mo14918M(1468230721);
                C16156d.C16157a aVar = new C16156d.C16157a(0, 1, (DefaultConstructorMarker) null);
                aVar.mo46707l(C16018i.m71858d(R.string.basket_delivery_amount_min_remaining_part1, oVar2, 0));
                aVar.mo46707l(" ");
                int r = aVar.mo46713r(new C16151c0(0, 0, C16209i0.f40292b.mo46947c(), (C16190e0) null, (C16194f0) null, (C16242u) null, (String) null, 0, (C16410a) null, (C16439m) null, (C16342f) null, 0, (C16434j) null, (C15205e4) null, 16379, (DefaultConstructorMarker) null));
                try {
                    aVar.mo46707l(C28782t.m119105b(Double.valueOf(((C38486g.C38487a) a).mo122051d())));
                    C11079d2 d2Var = C11079d2.f28267a;
                    aVar.mo46710o(r);
                    aVar.mo46707l(" ");
                    aVar.mo46707l(C16018i.m71858d(R.string.basket_delivery_amount_min_remaining_part2, oVar2, 0));
                    dVar = aVar.mo46716u();
                    oVar.mo15002m0();
                } catch (Throwable th) {
                    aVar.mo46710o(r);
                    throw th;
                }
            } else if (a instanceof C38486g.C38488b) {
                oVar2.mo14918M(1468231275);
                C16156d.C16157a aVar2 = new C16156d.C16157a(0, 1, (DefaultConstructorMarker) null);
                aVar2.mo46707l(C16018i.m71858d(R.string.basket_delivery_amount_min_remaining_part1, oVar2, 0));
                aVar2.mo46707l(" ");
                int r2 = aVar2.mo46713r(new C16151c0(0, 0, C16209i0.f40292b.mo46947c(), (C16190e0) null, (C16194f0) null, (C16242u) null, (String) null, 0, (C16410a) null, (C16439m) null, (C16342f) null, 0, (C16434j) null, (C15205e4) null, 16379, (DefaultConstructorMarker) null));
                try {
                    aVar2.mo46707l(C28782t.m119105b(Double.valueOf(((C38486g.C38488b) a).mo122057d())));
                    C11079d2 d2Var2 = C11079d2.f28267a;
                    aVar2.mo46710o(r2);
                    aVar2.mo46707l(" ");
                    aVar2.mo46707l(C16018i.m71858d(R.string.basket_delivery_amount_min_remaining_part3, oVar2, 0));
                    dVar = aVar2.mo46716u();
                    oVar.mo15002m0();
                } catch (Throwable th2) {
                    aVar2.mo46710o(r2);
                    throw th2;
                }
            } else if (a == null) {
                oVar2.mo14918M(-1729454083);
                oVar.mo15002m0();
                dVar = null;
            } else {
                oVar2.mo14918M(1468217127);
                oVar.mo15002m0();
                throw new NoWhenBranchMatchedException();
            }
            if (dVar != null) {
                float f = (float) 16;
                C8767m o = PaddingKt.m10028o(BackgroundKt.m8825d(SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null), C15240j2.f37547b.mo42852w(), (C15218g4) null, 2, (Object) null), C16483g.m74435M(f), C16483g.m74435M(f), C16483g.m74435M(f), 0.0f, 8, (Object) null);
                oVar2.mo14918M(733328855);
                C15560f0 k = BoxKt.m9849k(C8734c.f23406a.mo17061C(), false, oVar2, 0);
                oVar2.mo14918M(-1323940314);
                C16479d dVar2 = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
                LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
                C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
                ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
                C11289a<ComposeUiNode> a2 = companion.mo44585a();
                C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(o);
                if (!(oVar.mo15017r() instanceof C8428d)) {
                    ComposablesKt.m29519n();
                }
                oVar.mo14938T();
                if (oVar.mo14997l()) {
                    oVar2.mo14947W(a2);
                } else {
                    oVar.mo14888A();
                }
                oVar.mo14941U();
                C8592o b = Updater.m30180b(oVar);
                Updater.m30188j(b, k, companion.mo44588d());
                Updater.m30188j(b, dVar2, companion.mo44586b());
                Updater.m30188j(b, layoutDirection, companion.mo44587c());
                Updater.m30188j(b, c4Var, companion.mo44590f());
                oVar.mo14972e();
                f2.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
                oVar2.mo14918M(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f6046a;
                BasketBannerKt.m104584a((C8767m) null, dVar, oVar2, 0, 1);
                oVar.mo15002m0();
                oVar.mo14896D();
                oVar.mo15002m0();
                oVar.mo15002m0();
            }
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}

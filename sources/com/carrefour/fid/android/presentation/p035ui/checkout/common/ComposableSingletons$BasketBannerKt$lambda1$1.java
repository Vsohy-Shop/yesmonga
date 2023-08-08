package com.carrefour.fid.android.presentation.p035ui.checkout.common;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.graphics.C15205e4;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
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
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "(Landroidx/compose/runtime/o;I)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nBasketBanner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketBanner.kt\ncom/carrefour/fid/android/presentation/ui/checkout/common/ComposableSingletons$BasketBannerKt$lambda-1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1#1,80:1\n154#2:81\n74#3,6:82\n80#3:114\n84#3:126\n75#4:88\n76#4,11:90\n89#4:125\n76#5:89\n460#6,13:101\n473#6,3:122\n1098#7:115\n927#7,6:116\n*S KotlinDebug\n*F\n+ 1 BasketBanner.kt\ncom/carrefour/fid/android/presentation/ui/checkout/common/ComposableSingletons$BasketBannerKt$lambda-1$1\n*L\n66#1:81\n65#1:82,6\n65#1:114\n65#1:126\n65#1:88\n65#1:90,11\n65#1:125\n65#1:89\n65#1:101,13\n65#1:122,3\n69#1:115\n71#1:116,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.common.ComposableSingletons$BasketBannerKt$lambda-1$1  reason: invalid class name */
public final class ComposableSingletons$BasketBannerKt$lambda1$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {

    /* renamed from: f */
    public static final ComposableSingletons$BasketBannerKt$lambda1$1 f59353f = new ComposableSingletons$BasketBannerKt$lambda1$1();

    public ComposableSingletons$BasketBannerKt$lambda1$1() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    /* JADX INFO: finally extract failed */
    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(260266608, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.common.ComposableSingletons$BasketBannerKt.lambda-1.<anonymous> (BasketBanner.kt:63)");
            }
            C8767m k = PaddingKt.m10024k(C8767m.f23478j, C16483g.m74435M((float) 16));
            oVar2.mo14918M(-483455358);
            C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), C8734c.f23406a.mo17072u(), oVar2, 0);
            oVar2.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(k);
            if (!(oVar.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            oVar.mo14938T();
            if (oVar.mo14997l()) {
                oVar2.mo14947W(a);
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
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            C16156d.C16157a aVar = new C16156d.C16157a(0, 1, (DefaultConstructorMarker) null);
            aVar.mo46707l("Plus que ");
            int r = aVar.mo46713r(new C16151c0(0, 0, C16209i0.f40292b.mo46947c(), (C16190e0) null, (C16194f0) null, (C16242u) null, (String) null, 0, (C16410a) null, (C16439m) null, (C16342f) null, 0, (C16434j) null, (C15205e4) null, 16379, (DefaultConstructorMarker) null));
            try {
                aVar.mo46707l("7.87€");
                C11079d2 d2Var = C11079d2.f28267a;
                aVar.mo46710o(r);
                aVar.mo46707l(" pour bénéficier des frais gratuits");
                BasketBannerKt.m104584a((C8767m) null, aVar.mo46716u(), oVar2, 0, 1);
                oVar.mo15002m0();
                oVar.mo14896D();
                oVar.mo15002m0();
                oVar.mo15002m0();
                if (ComposerKt.m29813g0()) {
                    ComposerKt.m29843v0();
                }
            } catch (Throwable th) {
                aVar.mo46710o(r);
                throw th;
            }
        } else {
            oVar.mo14958a0();
        }
    }
}

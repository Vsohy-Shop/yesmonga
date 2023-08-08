package com.carrefour.fid.android.presentation.p035ui.checkout.nal.step2.component;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16015f;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.style.C16432i;
import androidx.compose.p004ui.text.style.C16434j;
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
import com.carrefour.fid.android.R;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nAddressComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/component/AddressComponentKt$EmptyAddressComponent$1$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,175:1\n74#2,7:176\n81#2:209\n85#2:216\n75#3:183\n76#3,11:185\n89#3:215\n76#4:184\n460#5,13:196\n473#5,3:212\n154#6:210\n154#6:211\n*S KotlinDebug\n*F\n+ 1 AddressComponent.kt\ncom/carrefour/fid/android/presentation/ui/checkout/nal/step2/component/AddressComponentKt$EmptyAddressComponent$1$1\n*L\n125#1:176,7\n125#1:209\n125#1:216\n125#1:183\n125#1:185,11\n125#1:215\n125#1:184\n125#1:196,13\n125#1:212,3\n132#1:210\n133#1:211\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.AddressComponentKt$EmptyAddressComponent$1$1 */
public final class AddressComponentKt$EmptyAddressComponent$1$1 extends Lambda implements C11305q<C2411u0, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ String $buttonText;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressComponentKt$EmptyAddressComponent$1$1(String str, int i) {
        super(3);
        this.$buttonText = str;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2411u0) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12579k C2411u0 u0Var, @C12580l C8592o oVar, int i) {
        C8592o oVar2 = oVar;
        int i2 = i;
        Intrinsics.checkNotNullParameter(u0Var, "$this$Button");
        if ((i2 & 81) != 16 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1286543276, i2, -1, "com.carrefour.fid.android.presentation.ui.checkout.nal.step2.component.EmptyAddressComponent.<anonymous>.<anonymous> (AddressComponent.kt:123)");
            }
            Arrangement.C2271e f = Arrangement.f6010a.mo7625f();
            C8734c.C8737c q = C8734c.f23406a.mo17070q();
            String str = this.$buttonText;
            int i3 = this.$$dirty;
            oVar2.mo14918M(693286680);
            C8767m.C8768a aVar = C8767m.f23478j;
            C15560f0 d = RowKt.m10071d(f, q, oVar2, 54);
            oVar2.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f2 = LayoutKt.m68908f(aVar);
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
            C8592o b = Updater.m30180b(oVar);
            Updater.m30188j(b, d, companion.mo44588d());
            Updater.m30188j(b, dVar, companion.mo44586b());
            Updater.m30188j(b, layoutDirection, companion.mo44587c());
            Updater.m30188j(b, c4Var, companion.mo44590f());
            oVar.mo14972e();
            f2.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
            oVar2.mo14918M(2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
            IconKt.m13539b(C16015f.m71849d(R.drawable.ds_ic_symbol_plus, oVar2, 0), (String) null, SizeKt.m10087C(PaddingKt.m10028o(aVar, 0.0f, 0.0f, C16483g.m74435M((float) 5), 0.0f, 11, (Object) null), C16483g.m74435M((float) 12)), 0, oVar, 440, 8);
            TextKt.m14196c(str, (C8767m) null, 0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, (C16361p0) null, oVar, (i3 >> 6) & 14, 0, 131070);
            oVar.mo15002m0();
            oVar.mo14896D();
            oVar.mo15002m0();
            oVar.mo15002m0();
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}

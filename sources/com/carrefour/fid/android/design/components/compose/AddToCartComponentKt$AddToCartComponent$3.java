package com.carrefour.fid.android.design.components.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2411u0;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.C7933t0;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.C8744d;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
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
import androidx.profileinstaller.C20022q;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.carrefour.fid.android.design.theme.C37475b;
import com.carrefour.fid.android.design.theme.C37477d;
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
@C11363r0({"SMAP\nAddToCartComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddToCartComponent.kt\ncom/carrefour/fid/android/design/components/compose/AddToCartComponentKt$AddToCartComponent$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,199:1\n154#2:200\n154#2:234\n75#3,6:201\n81#3:233\n85#3:239\n75#4:207\n76#4,11:209\n89#4:238\n76#5:208\n460#6,13:220\n473#6,3:235\n*S KotlinDebug\n*F\n+ 1 AddToCartComponent.kt\ncom/carrefour/fid/android/design/components/compose/AddToCartComponentKt$AddToCartComponent$3\n*L\n61#1:200\n87#1:234\n65#1:201,6\n65#1:233\n65#1:239\n65#1:207\n65#1:209,11\n65#1:238\n65#1:208\n65#1:220,13\n65#1:235,3\n*E\n"})
public final class AddToCartComponentKt$AddToCartComponent$3 extends Lambda implements C11305q<C2411u0, C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ boolean $isLoading;
    final /* synthetic */ String $price;
    final /* synthetic */ long $priceBackgroundColor;
    final /* synthetic */ String $textButton;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddToCartComponentKt$AddToCartComponent$3(boolean z, boolean z2, String str, int i, String str2, long j) {
        super(3);
        this.$isLoading = z;
        this.$enabled = z2;
        this.$textButton = str;
        this.$$dirty = i;
        this.$price = str2;
        this.$priceBackgroundColor = j;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((C2411u0) obj, (C8592o) obj2, ((Number) obj3).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12579k C2411u0 u0Var, @C12580l C8592o oVar, int i) {
        int i2;
        long j;
        C2411u0 u0Var2 = u0Var;
        C8592o oVar2 = oVar;
        int i3 = i;
        Intrinsics.checkNotNullParameter(u0Var2, "$this$Button");
        if ((i3 & 14) == 0) {
            i2 = (oVar2.mo15006n0(u0Var2) ? 4 : 2) | i3;
        } else {
            i2 = i3;
        }
        if ((i2 & 91) != 18 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1102183975, i3, -1, "com.carrefour.fid.android.design.components.compose.AddToCartComponent.<anonymous> (AddToCartComponent.kt:55)");
            }
            if (this.$isLoading) {
                oVar2.mo14918M(-273498966);
                ProgressIndicatorKt.m13705b(u0Var2.mo7845f(SizeKt.m10087C(C8767m.f23478j, C16483g.m74435M((float) 22)), C8734c.f23406a.mo17070q()), C37475b.f94185a.mo114231a0(), 0.0f, 0, 0, oVar, 0, 28);
                oVar.mo15002m0();
            } else {
                oVar2.mo14918M(-273498733);
                C8767m.C8768a aVar = C8767m.f23478j;
                C8767m n = SizeKt.m10114n(aVar, 0.0f, 1, (Object) null);
                C8734c.C8737c q = C8734c.f23406a.mo17070q();
                boolean z = this.$enabled;
                String str = this.$textButton;
                int i4 = this.$$dirty;
                String str2 = this.$price;
                long j2 = this.$priceBackgroundColor;
                oVar2.mo14918M(693286680);
                C15560f0 d = RowKt.m10071d(Arrangement.f6010a.mo7630p(), q, oVar2, 48);
                oVar2.mo14918M(-1323940314);
                C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
                LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
                C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
                ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
                C11289a<ComposeUiNode> a = companion.mo44585a();
                C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(n);
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
                f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar2, 0);
                oVar2.mo14918M(2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.f6147a;
                C7933t0 t0Var = C7933t0.f19075a;
                int i5 = C7933t0.f19076b;
                C16361p0 h = C37477d.m153896h(t0Var.mo11077c(oVar2, i5));
                C37475b bVar = C37475b.f94185a;
                long a0 = z ? bVar.mo114231a0() : bVar.mo114258z();
                int a2 = C16432i.f40718b.mo47667a();
                C8767m e = C2411u0.m10660e(rowScopeInstance, SizeKt.m10114n(aVar, 0.0f, 1, (Object) null), 1.0f, false, 2, (Object) null);
                long j3 = j2;
                int i6 = i4;
                String str3 = str2;
                boolean z2 = z;
                int i7 = i5;
                C8767m.C8768a aVar2 = aVar;
                C7933t0 t0Var2 = t0Var;
                TextKt.m14196c(str, e, a0, 0, (C16190e0) null, (C16209i0) null, (C16242u) null, 0, (C16434j) null, C16432i.m74172g(a2), 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, h, oVar, (i6 >> 15) & 14, 0, 65016);
                C8592o oVar3 = oVar;
                oVar3.mo14918M(-273498183);
                if (str3.length() > 0) {
                    int i8 = i7;
                    C7933t0 t0Var3 = t0Var2;
                    C16361p0 L = C37477d.m153885L(t0Var3.mo11077c(oVar3, i8));
                    C16209i0 c = C16209i0.f40292b.mo46947c();
                    C37475b bVar2 = C37475b.f94185a;
                    long a02 = z2 ? bVar2.mo114231a0() : bVar2.mo114258z();
                    C8767m a3 = C8744d.m32514a(aVar2, t0Var3.mo11076b(oVar3, i8).mo10758e());
                    if (z2) {
                        j = j3;
                    } else {
                        j = C37475b.f94185a.mo114206C();
                    }
                    TextKt.m14196c(str3, PaddingKt.m10024k(BackgroundKt.m8825d(a3, j, (C15218g4) null, 2, (Object) null), C16483g.m74435M((float) 4)), a02, 0, (C16190e0) null, c, (C16242u) null, 0, (C16434j) null, (C16432i) null, 0, 0, false, 0, 0, (C11300l<? super C16260h0, C11079d2>) null, L, oVar, ((i6 >> 12) & 14) | C20022q.C20025c.f51280k, 0, DefaultImageHeaderParser.f57417e);
                }
                oVar.mo15002m0();
                oVar.mo15002m0();
                oVar.mo14896D();
                oVar.mo15002m0();
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

package com.carrefour.fid.android.product.presentation.p039ui.details.views;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.C2373k;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
import androidx.compose.p004ui.res.C16009b;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8428d;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.C8684u1;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import com.carrefour.fid.android.product.C27609f;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nCharacteristic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Characteristic.kt\ncom/carrefour/fid/android/product/presentation/ui/details/views/CharacteristicKt$Characteristic$3\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,166:1\n73#2,7:167\n80#2:200\n84#2:205\n75#3:174\n76#3,11:176\n89#3:204\n76#4:175\n460#5,13:187\n473#5,3:201\n*S KotlinDebug\n*F\n+ 1 Characteristic.kt\ncom/carrefour/fid/android/product/presentation/ui/details/views/CharacteristicKt$Characteristic$3\n*L\n58#1:167,7\n58#1:200\n58#1:205\n58#1:174\n58#1:176,11\n58#1:204\n58#1:175\n58#1:187,13\n58#1:201,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.product.presentation.ui.details.views.CharacteristicKt$Characteristic$3 */
public final class CharacteristicKt$Characteristic$3 extends Lambda implements C11306r<C2373k, Boolean, C8592o, Integer, C11079d2> {
    final /* synthetic */ List<Pair<String, String>> $data;
    final /* synthetic */ int $maxElementsWhenNotExpanded;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CharacteristicKt$Characteristic$3(List<Pair<String, String>> list, int i) {
        super(4);
        this.$data = list;
        this.$maxElementsWhenNotExpanded = i;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    /* renamed from: a */
    public final void mo81139a(@C12579k C2373k kVar, boolean z, @C12580l C8592o oVar, int i) {
        int i2;
        int i3;
        int i4;
        boolean z2 = z;
        C8592o oVar2 = oVar;
        int i5 = i;
        C2373k kVar2 = kVar;
        Intrinsics.checkNotNullParameter(kVar, "$this$ExpandableComponent");
        if ((i5 & 112) == 0) {
            if (oVar2.mo14961b(z2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 = i4 | i5;
        } else {
            i2 = i5;
        }
        if ((i2 & 721) != 144 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-2039451732, i5, -1, "com.carrefour.fid.android.product.presentation.ui.details.views.Characteristic.<anonymous> (Characteristic.kt:56)");
            }
            List<Pair<String, String>> list = this.$data;
            int i6 = this.$maxElementsWhenNotExpanded;
            oVar2.mo14918M(-483455358);
            C8767m.C8768a aVar = C8767m.f23478j;
            C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), C8734c.f23406a.mo17072u(), oVar2, 0);
            oVar2.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar2.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar2.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar2.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(aVar);
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
            if (!z2) {
                list = CollectionsKt___CollectionsKt.m40497E5(list, i6);
            }
            List<Pair<String, String>> list2 = list;
            oVar2.mo14918M(1899442417);
            int size = list2.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (i7 % 2 == 0) {
                    i3 = C27609f.C27615f.ds_grey_80;
                } else {
                    i3 = C27609f.C27615f.ds_grey_white;
                }
                CharacteristicKt.m117109b(C16009b.m71825a(i3, oVar2, 0), (String) list2.get(i7).mo21849e(), (String) list2.get(i7).mo21851f(), SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null), oVar, 3072, 0);
            }
            oVar.mo15002m0();
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

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        mo81139a((C2373k) obj, ((Boolean) obj2).booleanValue(), (C8592o) obj3, ((Number) obj4).intValue());
        return C11079d2.f28267a;
    }
}

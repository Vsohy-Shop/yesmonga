package com.carrefour.fid.android.presentation.p035ui.checkout.basketslist.component;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p004ui.C8734c;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.LayoutKt;
import androidx.compose.p004ui.node.ComposeUiNode;
import androidx.compose.p004ui.platform.C15863c4;
import androidx.compose.p004ui.platform.CompositionLocalsKt;
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
import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.offer.Offer;
import com.carrefour.fid.android.domain.models.product.ProductPicture;
import com.carrefour.fid.android.presentation.p035ui.checkout.basketslist.C23454a;
import java.util.ArrayList;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nItemBasket.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemBasket.kt\ncom/carrefour/fid/android/presentation/ui/checkout/basketslist/component/ItemBasketKt$ItemBasket$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,220:1\n154#2:221\n74#3,6:222\n80#3:254\n84#3:273\n75#4:228\n76#4,11:230\n89#4:272\n76#5:229\n460#6,13:241\n473#6,3:269\n1#7:255\n1#7:266\n1603#8,9:256\n1855#8:265\n1856#8:267\n1612#8:268\n*S KotlinDebug\n*F\n+ 1 ItemBasket.kt\ncom/carrefour/fid/android/presentation/ui/checkout/basketslist/component/ItemBasketKt$ItemBasket$2\n*L\n66#1:221\n63#1:222,6\n63#1:254\n63#1:273\n63#1:228\n63#1:230,11\n63#1:272\n63#1:229\n63#1:241,13\n63#1:269,3\n75#1:266\n75#1:256,9\n75#1:265\n75#1:267\n75#1:268\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.checkout.basketslist.component.ItemBasketKt$ItemBasket$2 */
public final class ItemBasketKt$ItemBasket$2 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Basket $basket;
    final /* synthetic */ C23454a $config;
    final /* synthetic */ boolean $isLoading;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ItemBasketKt$ItemBasket$2(boolean z, C23454a aVar, Basket basket, int i) {
        super(2);
        this.$isLoading = z;
        this.$config = aVar;
        this.$basket = basket;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        if ((i & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-321887009, i, -1, "com.carrefour.fid.android.presentation.ui.checkout.basketslist.component.ItemBasket.<anonymous> (ItemBasket.kt:61)");
            }
            C8767m k = PaddingKt.m10024k(SizeKt.m10114n(C8767m.f23478j, 0.0f, 1, (Object) null), C16483g.m74435M((float) 16));
            boolean z = this.$isLoading;
            C23454a aVar = this.$config;
            Basket basket = this.$basket;
            int i2 = this.$$dirty;
            oVar.mo14918M(-483455358);
            int i3 = 0;
            C15560f0 b = ColumnKt.m9863b(Arrangement.f6010a.mo7631r(), C8734c.f23406a.mo17072u(), oVar, 0);
            oVar.mo14918M(-1323940314);
            C16479d dVar = (C16479d) oVar.mo15032w(CompositionLocalsKt.m71011i());
            LayoutDirection layoutDirection = (LayoutDirection) oVar.mo15032w(CompositionLocalsKt.m71018p());
            C15863c4 c4Var = (C15863c4) oVar.mo15032w(CompositionLocalsKt.m71025w());
            ComposeUiNode.Companion companion = ComposeUiNode.f38797m;
            C11289a<ComposeUiNode> a = companion.mo44585a();
            C11305q<C8684u1<ComposeUiNode>, C8592o, Integer, C11079d2> f = LayoutKt.m68908f(k);
            if (!(oVar.mo15017r() instanceof C8428d)) {
                ComposablesKt.m29519n();
            }
            oVar.mo14938T();
            if (oVar.mo14997l()) {
                oVar.mo14947W(a);
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
            f.invoke(C8684u1.m31905a(C8684u1.m31906b(oVar)), oVar, 0);
            oVar.mo14918M(2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f6049a;
            for (Offer U : basket.mo116817B()) {
                i3 += U.mo118012U();
            }
            int i4 = (i2 >> 3) & 14;
            ItemBasketKt.m104563d(z, aVar, i3, oVar, i4);
            ArrayList arrayList = new ArrayList();
            for (Offer S : basket.mo116817B()) {
                ProductPicture productPicture = (ProductPicture) CollectionsKt___CollectionsKt.m40479B2(S.mo118010S().mo118416Q());
                String e = productPicture != null ? productPicture.mo118573e() : null;
                if (e != null) {
                    arrayList.add(e);
                }
            }
            ItemBasketKt.m104562c(CollectionsKt___CollectionsKt.m40497E5(arrayList, 6), z, oVar, (i2 & 112) | 8);
            ItemBasketKt.m104564e(z, basket.mo116855w().mo116868D() - basket.mo116855w().mo116897y(), oVar, i4);
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

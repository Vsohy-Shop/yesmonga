package com.carrefour.fid.android.presentation.p035ui.account.list.shopping;

import androidx.compose.p004ui.res.C16018i;
import androidx.compose.p004ui.text.C16361p0;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8570j;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.design.components.compose.HeaderComponentKt;
import com.carrefour.fid.android.product.presentation.models.C27670g;
import com.carrefour.fid.android.shared.type.C28892e;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nShoppingListScreenStateFul.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShoppingListScreenStateFul.kt\ncom/carrefour/fid/android/presentation/ui/account/list/shopping/ShoppingListScreenStateFulKt$ShoppingListScreen$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,492:1\n800#2,11:493\n36#3:504\n1114#4,6:505\n*S KotlinDebug\n*F\n+ 1 ShoppingListScreenStateFul.kt\ncom/carrefour/fid/android/presentation/ui/account/list/shopping/ShoppingListScreenStateFulKt$ShoppingListScreen$1\n*L\n292#1:493,11\n301#1:504\n301#1:505,6\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListScreenStateFulKt$ShoppingListScreen$1 */
public final class ShoppingListScreenStateFulKt$ShoppingListScreen$1 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ C11300l<C23066f, C11079d2> $actioner;
    final /* synthetic */ C28892e<List<C27670g>> $productResult;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShoppingListScreenStateFulKt$ShoppingListScreen$1(C28892e<? extends List<? extends C27670g>> eVar, C11300l<? super C23066f, C11079d2> lVar, int i) {
        super(2);
        this.$productResult = eVar;
        this.$actioner = lVar;
        this.$$dirty = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    @C8540g
    @C8570j(applier = "androidx.compose.ui.UiComposable")
    public final void invoke(@C12580l C8592o oVar, int i) {
        String str;
        C8592o oVar2 = oVar;
        int i2 = i;
        if ((i2 & 11) != 2 || !oVar.mo15011p()) {
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29845w0(-1552422675, i2, -1, "com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListScreen.<anonymous> (ShoppingListScreenStateFul.kt:282)");
            }
            C28892e<List<C27670g>> eVar = this.$productResult;
            oVar2.mo14918M(-963833122);
            if ((eVar instanceof C28892e.C28894b ? true : Intrinsics.areEqual((Object) eVar, (Object) C28892e.C28896d.f70785b)) || (eVar instanceof C28892e.C28893a)) {
                str = "";
            } else if (eVar instanceof C28892e.C28895c) {
                ArrayList arrayList = new ArrayList();
                for (Object next : (Iterable) ((C28892e.C28895c) this.$productResult).mo84088d()) {
                    if (next instanceof C27670g.C27676f) {
                        arrayList.add(next);
                    }
                }
                int size = arrayList.size();
                str = C16018i.m71856b(R.plurals.shopping_my_list_item_product, size, new Object[]{Integer.valueOf(size)}, oVar2, 512);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            oVar.mo15002m0();
            String d = C16018i.m71858d(R.string.shopping_list_omnicanale_title, oVar2, 0);
            String d2 = C16018i.m71858d(R.string.accessibility_return_to_previous_page, oVar2, 0);
            C11300l<C23066f, C11079d2> lVar = this.$actioner;
            oVar2.mo14918M(1157296644);
            boolean n0 = oVar2.mo15006n0(lVar);
            Object N = oVar.mo14921N();
            if (n0 || N == C8592o.f23032a.mo16277a()) {
                N = new ShoppingListScreenStateFulKt$ShoppingListScreen$1$1$1(lVar);
                oVar2.mo14893C(N);
            }
            oVar.mo15002m0();
            HeaderComponentKt.m151507l(d, str, (C16361p0) null, 0, 0, 0, d2, (C11289a) N, oVar, 0, 60);
            if (ComposerKt.m29813g0()) {
                ComposerKt.m29843v0();
                return;
            }
            return;
        }
        oVar.mo14958a0();
    }
}

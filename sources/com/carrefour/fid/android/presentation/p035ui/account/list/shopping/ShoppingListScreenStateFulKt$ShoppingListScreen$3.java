package com.carrefour.fid.android.presentation.p035ui.account.list.shopping;

import androidx.compose.runtime.C8590n1;
import androidx.compose.runtime.C8592o;
import com.carrefour.fid.android.product.presentation.models.C27670g;
import com.carrefour.fid.android.shared.base.C28499q;
import com.carrefour.fid.android.shared.type.C28892e;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListScreenStateFulKt$ShoppingListScreen$3 */
public final class ShoppingListScreenStateFulKt$ShoppingListScreen$3 extends Lambda implements C11304p<C8592o, Integer, C11079d2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ C11300l<C23066f, C11079d2> $actioner;
    final /* synthetic */ C28499q $fragment;
    final /* synthetic */ C28892e<List<C27670g>> $productResult;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShoppingListScreenStateFulKt$ShoppingListScreen$3(C28892e<? extends List<? extends C27670g>> eVar, C28499q qVar, C11300l<? super C23066f, C11079d2> lVar, int i) {
        super(2);
        this.$productResult = eVar;
        this.$fragment = qVar;
        this.$actioner = lVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C8592o) obj, ((Number) obj2).intValue());
        return C11079d2.f28267a;
    }

    public final void invoke(@C12580l C8592o oVar, int i) {
        ShoppingListScreenStateFulKt.m103535a(this.$productResult, this.$fragment, this.$actioner, oVar, C8590n1.m31123a(this.$$changed | 1));
    }
}

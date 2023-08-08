package com.carrefour.fid.android.presentation.p035ui.account.list.shopping;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.C8553b;
import com.carrefour.fid.android.product.presentation.models.C27670g;
import com.carrefour.fid.android.shared.base.C28499q;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nShoppingListScreenStateFul.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShoppingListScreenStateFul.kt\ncom/carrefour/fid/android/presentation/ui/account/list/shopping/ShoppingListScreenStateFulKt$ShoppingListWithItems$1\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,492:1\n171#2,12:493\n*S KotlinDebug\n*F\n+ 1 ShoppingListScreenStateFul.kt\ncom/carrefour/fid/android/presentation/ui/account/list/shopping/ShoppingListScreenStateFulKt$ShoppingListWithItems$1\n*L\n349#1:493,12\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListScreenStateFulKt$ShoppingListWithItems$1 */
public final class ShoppingListScreenStateFulKt$ShoppingListWithItems$1 extends Lambda implements C11300l<LazyListScope, C11079d2> {
    final /* synthetic */ C11300l<C23066f, C11079d2> $actioner;
    final /* synthetic */ List<C27670g> $data;
    final /* synthetic */ C28499q $fragment;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShoppingListScreenStateFulKt$ShoppingListWithItems$1(List<? extends C27670g> list, C28499q qVar, C11300l<? super C23066f, C11079d2> lVar) {
        super(1);
        this.$data = list;
        this.$fragment = qVar;
        this.$actioner = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LazyListScope) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyColumn");
        List<C27670g> list = this.$data;
        C230521 r1 = C230521.f58694f;
        lazyListScope.mo8310k(list.size(), r1 != null ? new C23047x976f29ac(r1, list) : null, new C23048x976f29ad(list), C8553b.m31049c(-1091073711, true, new C23049x976f29ae(list, this.$fragment, this.$actioner)));
    }
}

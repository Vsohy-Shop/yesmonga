package com.carrefour.fid.android.presentation.p035ui.account.list.shopping;

import androidx.compose.runtime.C8578k2;
import com.carrefour.fid.android.presentation.p035ui.account.list.AccountListFragment;
import com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.C25882a;
import com.carrefour.fid.android.presentation.viewmodels.account.list.shopping.C25891f;
import com.carrefour.fid.android.product.presentation.models.C27670g;
import com.carrefour.fid.android.shared.type.C28897f;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nShoppingListScreenStateFul.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShoppingListScreenStateFul.kt\ncom/carrefour/fid/android/presentation/ui/account/list/shopping/ShoppingListScreenStateFulKt$ShoppingListScreenStateFul$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,492:1\n800#2,11:493\n1549#2:504\n1620#2,3:505\n*S KotlinDebug\n*F\n+ 1 ShoppingListScreenStateFul.kt\ncom/carrefour/fid/android/presentation/ui/account/list/shopping/ShoppingListScreenStateFulKt$ShoppingListScreenStateFul$3\n*L\n187#1:493,11\n188#1:504\n188#1:505,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.shopping.ShoppingListScreenStateFulKt$ShoppingListScreenStateFul$3 */
public final class ShoppingListScreenStateFulKt$ShoppingListScreenStateFul$3 extends Lambda implements C11289a<Boolean> {
    final /* synthetic */ C25882a $analytics;
    final /* synthetic */ C8578k2<C25891f> $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShoppingListScreenStateFulKt$ShoppingListScreenStateFul$3(C8578k2<C25891f> k2Var, C25882a aVar) {
        super(0);
        this.$state = k2Var;
        this.$analytics = aVar;
    }

    @C12579k
    public final Boolean invoke() {
        List list;
        boolean z;
        List list2 = (List) C28897f.m119478b(this.$state.getValue().mo75173d());
        if (list2 != null) {
            ArrayList<C27670g.C27676f> arrayList = new ArrayList<>();
            for (Object next : list2) {
                if (next instanceof C27670g.C27676f) {
                    arrayList.add(next);
                }
            }
            list = new ArrayList(C10978t.m41495Y(arrayList, 10));
            for (C27670g.C27676f e : arrayList) {
                list.add(e.mo80412e().mo118842j());
            }
        } else {
            list = CollectionsKt__CollectionsKt.m40441E();
        }
        if (list.isEmpty()) {
            z = false;
        } else {
            this.$analytics.mo75147d(list, AccountListFragment.ParentScreen.ACCOUNT_LIST);
            z = true;
        }
        return Boolean.valueOf(z);
    }
}

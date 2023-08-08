package com.carrefour.fid.android.presentation.p035ui.account.list;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.carrefour.fid.android.presentation.p035ui.account.list.AccountListFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.C10998z;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroid/view/View;", "it", "Lkotlin/d2;", "a", "(Landroid/view/View;)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nAccountListFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AccountListFragment.kt\ncom/carrefour/fid/android/presentation/ui/account/list/AccountListFragment$onViewCreated$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,150:1\n766#2:151\n857#2,2:152\n1855#2,2:154\n*S KotlinDebug\n*F\n+ 1 AccountListFragment.kt\ncom/carrefour/fid/android/presentation/ui/account/list/AccountListFragment$onViewCreated$2$1\n*L\n43#1:151\n43#1:152,2\n45#1:154,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.AccountListFragment$onViewCreated$2$1 */
public final class AccountListFragment$onViewCreated$2$1 extends Lambda implements C11300l<View, C11079d2> {
    final /* synthetic */ AccountListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountListFragment$onViewCreated$2$1(AccountListFragment accountListFragment) {
        super(1);
        this.this$0 = accountListFragment;
    }

    /* renamed from: a */
    public final void mo67481a(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, "it");
        List<Fragment> I0 = this.this$0.getChildFragmentManager().mo56807I0();
        Intrinsics.checkNotNullExpressionValue(I0, "childFragmentManager.fragments");
        ArrayList arrayList = new ArrayList();
        for (Object next : I0) {
            if (((Fragment) next).isResumed()) {
                arrayList.add(next);
            }
        }
        for (R a : C10998z.m42387a1(arrayList, AccountListFragment.C22944a.class)) {
            a.mo67480a();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo67481a((View) obj);
        return C11079d2.f28267a;
    }
}

package com.carrefour.fid.android.presentation.p035ui.account.list.memo;

import android.os.Bundle;
import androidx.fragment.app.C19232h;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.C13825a;
import com.carrefour.fid.android.shared.constant.C28539g;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lkotlin/d2;", "invoke", "()V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.memo.MemoListFragment$handleMemoListError$1 */
public final class MemoListFragment$handleMemoListError$1 extends Lambda implements C11289a<C11079d2> {
    final /* synthetic */ MemoListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemoListFragment$handleMemoListError$1(MemoListFragment memoListFragment) {
        super(0);
        this.this$0 = memoListFragment;
    }

    public final void invoke() {
        C19232h requireActivity = this.this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        C13825a.m58795x(requireActivity, false, R.anim.slide_in_up, R.anim.no_change, C28539g.f69228D, (Bundle) null, 16, (Object) null);
        this.this$0.mo67534W0().mo75012i();
    }
}

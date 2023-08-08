package com.carrefour.fid.android.presentation.p035ui.account.list.memo;

import androidx.compose.p004ui.platform.ComposeView;
import com.carrefour.fid.android.presentation.models.C38495l;
import com.carrefour.fid.android.presentation.viewmodels.account.list.memo.MemoListViewModel;
import com.carrefour.fid.android.shared.extension.ViewKt;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C11622t;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: com.carrefour.fid.android.presentation.ui.account.list.memo.MemoListFragment$initMemoListInput$1$1$1$1$1 */
public final class MemoListFragment$initMemoListInput$1$1$1$1$1 extends Lambda implements C11300l<String, C11079d2> {
    final /* synthetic */ ComposeView $this_with;
    final /* synthetic */ MemoListFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemoListFragment$initMemoListInput$1$1$1$1$1(MemoListFragment memoListFragment, ComposeView composeView) {
        super(1);
        this.this$0 = memoListFragment;
        this.$this_with = composeView;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "text");
        String obj = StringsKt__StringsKt.trim(str).toString();
        if (!C11622t.isBlank(obj)) {
            this.this$0.mo67535X0().sendIntent(new MemoListViewModel.C25826e.C25827a(C38495l.C38496a.m159721d(C38495l.f97623e, (String) null, obj, (String) null, 5, (Object) null)));
            this.this$0.mo67534W0().mo75007d();
        }
        this.$this_with.clearFocus();
        ComposeView composeView = this.$this_with;
        Intrinsics.checkNotNullExpressionValue(composeView, "invoke");
        ViewKt.m119012y(composeView);
    }
}

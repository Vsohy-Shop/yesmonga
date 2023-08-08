package com.carrefour.fid.android.presentation.p035ui.basketbuilder;

import android.os.Bundle;
import androidx.fragment.app.C19232h;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.extensions.C13825a;
import com.carrefour.fid.android.app.extensions.FragmentExtensionKt;
import com.carrefour.fid.android.core.constants.C36168a;
import com.carrefour.fid.android.presentation.viewmodels.basketbuilder.BasketBuilderViewModel;
import com.carrefour.fid.android.shared.constant.C28539g;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "it", "Lkotlin/d2;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.basketbuilder.BasketBuilderFragment$onViewCreated$1 */
public final class BasketBuilderFragment$onViewCreated$1 extends Lambda implements C11300l<String, C11079d2> {
    final /* synthetic */ BasketBuilderFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasketBuilderFragment$onViewCreated$1(BasketBuilderFragment basketBuilderFragment) {
        super(1);
        this.this$0 = basketBuilderFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        if (Intrinsics.areEqual((Object) str, (Object) C36168a.f89274b)) {
            this.this$0.mo67952W0().sendIntent(BasketBuilderViewModel.C25945b.C25946a.f63474b);
            C19232h requireActivity = this.this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
            C13825a.m58791t(requireActivity, false, (Bundle) null, 3, (Object) null);
            FragmentExtensionKt.m58770u(this.this$0, false, R.anim.slide_in_up, R.anim.no_change, C28539g.f69230F, (Bundle) null, 16, (Object) null);
        }
    }
}

package com.carrefour.fid.android.consent.presentation.p055ui;

import android.text.style.ClickableSpan;
import android.view.View;
import com.carrefour.fid.android.shared.extension.FragmentKt;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo22516d2 = {"com/carrefour/fid/android/consent/presentation/ui/ConfigureConsentOptinsFragment$initTextWithHyperLink$clickableSpan$1", "Landroid/text/style/ClickableSpan;", "Landroid/view/View;", "widget", "Lkotlin/d2;", "onClick", "consent_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.consent.presentation.ui.ConfigureConsentOptinsFragment$initTextWithHyperLink$clickableSpan$1 */
public final class C36128x4b7009b3 extends ClickableSpan {
    final /* synthetic */ String $url;
    final /* synthetic */ ConfigureConsentOptinsFragment this$0;

    public C36128x4b7009b3(ConfigureConsentOptinsFragment configureConsentOptinsFragment, String str) {
        this.this$0 = configureConsentOptinsFragment;
        this.$url = str;
    }

    public void onClick(@C12579k View view) {
        Intrinsics.checkNotNullParameter(view, "widget");
        ConfigureConsentOptinsFragment configureConsentOptinsFragment = this.this$0;
        FragmentKt.m118829q(configureConsentOptinsFragment, (String) null, (String) null, new C36129xc2e63785(configureConsentOptinsFragment, this.$url), 3, (Object) null);
    }
}

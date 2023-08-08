package com.usabilla.sdk.ubform.screenshot;

import android.os.Parcelable;
import com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/form/model/UbInternalTheme;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class UbScreenshotActivity$theme$2 extends Lambda implements C11289a<UbInternalTheme> {
    final /* synthetic */ UbScreenshotActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UbScreenshotActivity$theme$2(UbScreenshotActivity ubScreenshotActivity) {
        super(0);
        this.this$0 = ubScreenshotActivity;
    }

    @C12579k
    /* renamed from: a */
    public final UbInternalTheme invoke() {
        Parcelable parcelableExtra = this.this$0.getIntent().getParcelableExtra(UbScreenshotActivity.f27095d1);
        Intrinsics.checkNotNull(parcelableExtra);
        Intrinsics.checkNotNullExpressionValue(parcelableExtra, "intent.getParcelableExtra(EXTRA_THEME)!!");
        return (UbInternalTheme) parcelableExtra;
    }
}

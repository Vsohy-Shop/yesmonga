package com.usabilla.sdk.ubform.sdk.banner;

import android.content.Context;
import android.os.Parcelable;
import com.usabilla.sdk.ubform.sdk.form.model.FormModel;
import com.usabilla.sdk.ubform.sdk.form.model.UbColors;
import com.usabilla.sdk.ubform.sdk.form.model.UbFonts;
import com.usabilla.sdk.ubform.sdk.form.model.UbImages;
import com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme;
import com.usabilla.sdk.ubform.sdk.form.model.theme.unity.UsabillaThemeUnity;
import com.usabilla.sdk.ubform.utils.ext.C10133g;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/form/model/FormModel;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class BannerFragment$formModel$2 extends Lambda implements C11289a<FormModel> {
    final /* synthetic */ BannerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BannerFragment$formModel$2(BannerFragment bannerFragment) {
        super(0);
        this.this$0 = bannerFragment;
    }

    @C12579k
    /* renamed from: a */
    public final FormModel invoke() {
        Parcelable parcelable = this.this$0.requireArguments().getParcelable("form model");
        Intrinsics.checkNotNull(parcelable);
        BannerFragment bannerFragment = this.this$0;
        FormModel formModel = (FormModel) parcelable;
        UbInternalTheme theme = formModel.getTheme();
        Context requireContext = bannerFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        FormModel mergeTheme = formModel.mergeTheme(UbInternalTheme.copy$default(theme, (UsabillaThemeUnity) null, (UbColors) null, (UbColors) null, (UbFonts) null, (UbImages) null, C10133g.m38351m(requireContext), 31, (Object) null));
        UbInternalTheme theme2 = mergeTheme.getTheme();
        Context requireContext2 = bannerFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext()");
        theme2.initializeFont(requireContext2);
        return mergeTheme;
    }
}

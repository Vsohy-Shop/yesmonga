package com.usabilla.sdk.ubform.sdk.field.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.sdk.field.contract.C9961c;
import com.usabilla.sdk.ubform.sdk.field.presenter.C10015c;
import com.usabilla.sdk.ubform.sdk.field.view.common.FieldView;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0014R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0014X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002XD¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001f"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/field/view/HeaderView;", "Lcom/usabilla/sdk/ubform/sdk/field/view/common/FieldView;", "Lcom/usabilla/sdk/ubform/sdk/field/presenter/c;", "Lcom/usabilla/sdk/ubform/sdk/field/contract/c$b;", "Lkotlin/d2;", "j", "c", "", "padding", "setCardInternalPadding", "Landroid/graphics/drawable/Drawable;", "E0", "Landroid/graphics/drawable/Drawable;", "getNormalBackground", "()Landroid/graphics/drawable/Drawable;", "normalBackground", "", "F0", "D", "textSizeMultiplier", "Landroid/widget/TextView;", "G0", "Lkotlin/z;", "getHeader", "()Landroid/widget/TextView;", "header", "Landroid/content/Context;", "context", "presenter", "<init>", "(Landroid/content/Context;Lcom/usabilla/sdk/ubform/sdk/field/presenter/c;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class HeaderView extends FieldView<C10015c> implements C9961c.C9963b {
    @C12580l

    /* renamed from: E0 */
    public final Drawable f27522E0;

    /* renamed from: F0 */
    public final double f27523F0 = 1.2d;
    @C12579k

    /* renamed from: G0 */
    public final C11677z f27524G0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HeaderView(@C12579k Context context, @C12579k C10015c cVar) {
        super(context, cVar);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(cVar, "presenter");
        this.f27524G0 = C10864b0.m38748c(new HeaderView$header$2(context, this));
    }

    private final TextView getHeader() {
        return (TextView) this.f27524G0.getValue();
    }

    /* renamed from: o */
    public static final /* synthetic */ C10015c m37802o(HeaderView headerView) {
        return (C10015c) headerView.getFieldPresenter();
    }

    /* renamed from: c */
    public void mo20831c() {
    }

    @C12580l
    public Drawable getNormalBackground() {
        return this.f27522E0;
    }

    /* renamed from: j */
    public void mo20835j() {
        getRootView().addView(getHeader());
        getTitleLabel().setVisibility(8);
    }

    public void setCardInternalPadding(int i) {
        setPadding(i, 0, i, 0);
    }
}

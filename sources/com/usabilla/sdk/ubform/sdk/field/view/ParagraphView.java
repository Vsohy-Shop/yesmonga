package com.usabilla.sdk.ubform.sdk.field.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.sdk.field.contract.C9971e;
import com.usabilla.sdk.ubform.sdk.field.presenter.ParagraphPresenter;
import com.usabilla.sdk.ubform.sdk.field.view.common.FieldView;
import com.usabilla.sdk.ubform.utils.C10145l;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010+\u001a\u00020\u0002¢\u0006\u0004\b,\u0010-J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0014J\b\u0010\n\u001a\u00020\u0004H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002R\u0014\u0010\u001c\u001a\u00020\u00078\u0002XD¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0014X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010(\u001a\u00020#8BX\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006."}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/field/view/ParagraphView;", "Lcom/usabilla/sdk/ubform/sdk/field/view/common/FieldView;", "Lcom/usabilla/sdk/ubform/sdk/field/presenter/ParagraphPresenter;", "Lcom/usabilla/sdk/ubform/sdk/field/contract/e$b;", "Lkotlin/d2;", "j", "c", "", "padding", "setCardInternalPadding", "h", "", "text", "setParagraphText", "Landroid/text/Html$ImageGetter;", "imageGetter", "setHtmlText", "Lcom/usabilla/sdk/ubform/utils/l$a;", "drawable", "Landroid/graphics/Bitmap;", "bitmap", "i", "d", "html", "Landroid/text/Spanned;", "o", "E0", "I", "maxNumberOfLinesOnBanner", "Landroid/graphics/drawable/Drawable;", "F0", "Landroid/graphics/drawable/Drawable;", "getNormalBackground", "()Landroid/graphics/drawable/Drawable;", "normalBackground", "Landroid/widget/TextView;", "G0", "Lkotlin/z;", "getParagraph", "()Landroid/widget/TextView;", "paragraph", "Landroid/content/Context;", "context", "fieldPresenter", "<init>", "(Landroid/content/Context;Lcom/usabilla/sdk/ubform/sdk/field/presenter/ParagraphPresenter;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class ParagraphView extends FieldView<ParagraphPresenter> implements C9971e.C9973b {

    /* renamed from: E0 */
    public final int f27537E0 = 5;
    @C12580l

    /* renamed from: F0 */
    public final Drawable f27538F0;
    @C12579k

    /* renamed from: G0 */
    public final C11677z f27539G0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ParagraphView(@C12579k Context context, @C12579k ParagraphPresenter paragraphPresenter) {
        super(context, paragraphPresenter);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(paragraphPresenter, "fieldPresenter");
        this.f27539G0 = C10864b0.m38748c(new ParagraphView$paragraph$2(context, this));
    }

    private final TextView getParagraph() {
        return (TextView) this.f27539G0.getValue();
    }

    /* renamed from: c */
    public void mo20831c() {
    }

    /* renamed from: d */
    public void mo20832d() {
        super.mo20832d();
        getParagraph().setMaxLines(this.f27537E0);
    }

    @C12580l
    public Drawable getNormalBackground() {
        return this.f27538F0;
    }

    /* renamed from: h */
    public void mo20845h() {
        getTitleLabel().setVisibility(8);
    }

    /* renamed from: i */
    public void mo20846i(@C12579k C10145l.C10146a aVar, @C12579k Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(aVar, "drawable");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), bitmap);
        bitmapDrawable.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), bitmapDrawable.getIntrinsicHeight());
        C11079d2 d2Var = C11079d2.f28267a;
        aVar.mo21597b(bitmapDrawable);
        CharSequence text = getParagraph().getText();
        getParagraph().setText("");
        getParagraph().setText(text);
    }

    /* renamed from: j */
    public void mo20835j() {
        getRootView().addView(getParagraph());
    }

    /* renamed from: o */
    public final Spanned mo21056o(String str, Html.ImageGetter imageGetter) {
        Spanned fromHtml = Html.fromHtml(str, 0, imageGetter, (Html.TagHandler) null);
        Intrinsics.checkNotNullExpressionValue(fromHtml, "{\n            Html.fromHtml(html, Html.FROM_HTML_MODE_LEGACY, imageGetter, null)\n        }");
        return fromHtml;
    }

    public void setCardInternalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setHtmlText(@C12579k String str, @C12579k Html.ImageGetter imageGetter) {
        Intrinsics.checkNotNullParameter(str, "text");
        Intrinsics.checkNotNullParameter(imageGetter, "imageGetter");
        getParagraph().setText(mo21056o(str, imageGetter));
        getParagraph().setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void setParagraphText(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "text");
        getParagraph().setText(str);
    }
}

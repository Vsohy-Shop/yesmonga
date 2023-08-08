package com.usabilla.sdk.ubform.customViews;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.customViews.CheckableImageView;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\u0012\u0006\u00106\u001a\u000205\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b7\u00108J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u00128BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001b\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010#\u001a\u00020\u001c8BX\u0002¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010\u001fR*\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010$8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8FX\u0002¢\u0006\f\n\u0004\b,\u0010\u0014\u001a\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008FX\u0002¢\u0006\f\n\u0004\b1\u0010\u0014\u001a\u0004\b2\u00103¨\u00069"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/customViews/CheckOption;", "Landroid/widget/LinearLayout;", "Landroid/view/View$OnClickListener;", "Lcom/usabilla/sdk/ubform/customViews/CheckableImageView$a;", "Landroid/view/View;", "v", "Lkotlin/d2;", "onClick", "", "isChecked", "a", "", "I", "colorBorder", "b", "colorCheckMark", "c", "colorEmpty", "Landroid/graphics/drawable/Drawable;", "d", "Lkotlin/z;", "getCheckMarkIcon", "()Landroid/graphics/drawable/Drawable;", "checkMarkIcon", "e", "getCheckBoxPadding", "()I", "checkBoxPadding", "Landroid/graphics/drawable/LayerDrawable;", "f", "getBgChecked", "()Landroid/graphics/drawable/LayerDrawable;", "bgChecked", "g", "getBgUnchecked", "bgUnchecked", "Lkotlin/Function0;", "Lkotlin/jvm/functions/a;", "getCheckListener", "()Lkotlin/jvm/functions/a;", "setCheckListener", "(Lkotlin/jvm/functions/a;)V", "checkListener", "Lcom/usabilla/sdk/ubform/customViews/CheckableImageView;", "w", "getCheckIcon", "()Lcom/usabilla/sdk/ubform/customViews/CheckableImageView;", "checkIcon", "Landroid/widget/TextView;", "x", "getCheckText", "()Landroid/widget/TextView;", "checkText", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;III)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class CheckOption extends LinearLayout implements View.OnClickListener, CheckableImageView.C9768a {

    /* renamed from: a */
    public final int f26742a;

    /* renamed from: b */
    public final int f26743b;

    /* renamed from: c */
    public final int f26744c;
    @C12579k

    /* renamed from: d */
    public final C11677z f26745d;
    @C12579k

    /* renamed from: e */
    public final C11677z f26746e = C10864b0.m38748c(new CheckOption$checkBoxPadding$2(this));
    @C12579k

    /* renamed from: f */
    public final C11677z f26747f;
    @C12579k

    /* renamed from: g */
    public final C11677z f26748g;
    @C12580l

    /* renamed from: v */
    public C11289a<C11079d2> f26749v;
    @C12579k

    /* renamed from: w */
    public final C11677z f26750w;
    @C12579k

    /* renamed from: x */
    public final C11677z f26751x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckOption(@C12579k Context context, int i, int i2, int i3) {
        super(context);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f26742a = i;
        this.f26743b = i2;
        this.f26744c = i3;
        this.f26745d = C10864b0.m38748c(new CheckOption$checkMarkIcon$2(context, this));
        this.f26747f = C10864b0.m38748c(new CheckOption$bgChecked$2(context, this));
        this.f26748g = C10864b0.m38748c(new CheckOption$bgUnchecked$2(context, this));
        this.f26750w = C10864b0.m38748c(new CheckOption$checkIcon$2(context, this));
        this.f26751x = C10864b0.m38748c(new CheckOption$checkText$2(context, this));
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOrientation(0);
        setGravity(48);
        addView(getCheckIcon());
        addView(getCheckText());
    }

    private final LayerDrawable getBgChecked() {
        return (LayerDrawable) this.f26747f.getValue();
    }

    /* access modifiers changed from: private */
    public final LayerDrawable getBgUnchecked() {
        return (LayerDrawable) this.f26748g.getValue();
    }

    /* access modifiers changed from: private */
    public final int getCheckBoxPadding() {
        return ((Number) this.f26746e.getValue()).intValue();
    }

    /* access modifiers changed from: private */
    public final Drawable getCheckMarkIcon() {
        return (Drawable) this.f26745d.getValue();
    }

    /* renamed from: a */
    public void mo19952a(boolean z) {
        if (z) {
            getCheckIcon().setImageDrawable(getBgChecked());
        } else {
            getCheckIcon().setImageDrawable(getBgUnchecked());
        }
    }

    @C12579k
    public final CheckableImageView getCheckIcon() {
        return (CheckableImageView) this.f26750w.getValue();
    }

    @C12580l
    public final C11289a<C11079d2> getCheckListener() {
        return this.f26749v;
    }

    @C12579k
    public final TextView getCheckText() {
        return (TextView) this.f26751x.getValue();
    }

    public void onClick(@C12580l View view) {
        getCheckIcon().setChecked(!getCheckIcon().isChecked());
        boolean isChecked = getCheckIcon().isChecked();
        if (isChecked) {
            getCheckIcon().setImageDrawable(getBgChecked());
        } else if (!isChecked) {
            getCheckIcon().setImageDrawable(getBgUnchecked());
        }
        C11289a<C11079d2> aVar = this.f26749v;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void setCheckListener(@C12580l C11289a<C11079d2> aVar) {
        this.f26749v = aVar;
    }
}

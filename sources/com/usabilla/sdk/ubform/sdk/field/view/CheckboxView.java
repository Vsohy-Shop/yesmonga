package com.usabilla.sdk.ubform.sdk.field.view;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.C9747c;
import com.usabilla.sdk.ubform.customViews.CheckOption;
import com.usabilla.sdk.ubform.sdk.field.contract.C9955a;
import com.usabilla.sdk.ubform.sdk.field.model.common.Option;
import com.usabilla.sdk.ubform.sdk.field.presenter.C10013a;
import com.usabilla.sdk.ubform.sdk.field.view.common.FieldView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0002J\b\u0010\u0011\u001a\u00020\u0004H\u0002R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/field/view/CheckboxView;", "Lcom/usabilla/sdk/ubform/sdk/field/view/common/FieldView;", "Lcom/usabilla/sdk/ubform/sdk/field/presenter/a;", "Lcom/usabilla/sdk/ubform/sdk/field/contract/a$b;", "Lkotlin/d2;", "j", "c", "r", "", "index", "Lcom/usabilla/sdk/ubform/customViews/CheckOption;", "checkbox", "p", "Lcom/usabilla/sdk/ubform/sdk/field/model/common/Option;", "option", "s", "t", "q", "", "E0", "Ljava/util/List;", "checkboxes", "Landroid/content/Context;", "context", "fieldPresenterCheckbox", "<init>", "(Landroid/content/Context;Lcom/usabilla/sdk/ubform/sdk/field/presenter/a;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class CheckboxView extends FieldView<C10013a> implements C9955a.C9957b {
    @C12579k

    /* renamed from: E0 */
    public List<CheckOption> f27521E0 = CollectionsKt__CollectionsKt.m40441E();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckboxView(@C12579k Context context, @C12579k C10013a aVar) {
        super(context, aVar);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(aVar, "fieldPresenterCheckbox");
    }

    /* renamed from: o */
    public static final /* synthetic */ C10013a m37791o(CheckboxView checkboxView) {
        return (C10013a) checkboxView.getFieldPresenter();
    }

    /* renamed from: c */
    public void mo20831c() {
        if (mo21128l()) {
            for (CheckOption checkIcon : this.f27521E0) {
                checkIcon.getCheckIcon().setChecked(false);
            }
        }
    }

    /* renamed from: j */
    public void mo20835j() {
        mo21041r();
        mo21043t();
        mo21040q();
    }

    /* renamed from: p */
    public final void mo21039p(int i, CheckOption checkOption) {
        if (i != this.f27521E0.size() - 1) {
            TextView checkText = checkOption.getCheckText();
            ViewGroup.LayoutParams layoutParams = checkOption.getCheckText().getLayoutParams();
            if (layoutParams != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                layoutParams2.setMargins(0, 0, 0, getResources().getDimensionPixelSize(C9747c.C9754g.ub_element_checkbox_text_bottom_margin));
                C11079d2 d2Var = C11079d2.f28267a;
                checkText.setLayoutParams(layoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
    }

    /* renamed from: q */
    public final void mo21040q() {
        for (CheckOption checkListener : this.f27521E0) {
            checkListener.setCheckListener(new CheckboxView$addCheckListener$1$1(this));
        }
    }

    /* renamed from: r */
    public final void mo21041r() {
        Iterable<Option> options = ((C10013a) getFieldPresenter()).getOptions();
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(options, 10));
        for (Option s : options) {
            arrayList.add(mo21042s(s));
        }
        this.f27521E0 = arrayList;
        int i = 0;
        for (Object next : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            CheckOption checkOption = (CheckOption) next;
            getRootView().addView(checkOption);
            mo21039p(i, checkOption);
            i = i2;
        }
    }

    /* renamed from: s */
    public final CheckOption mo21042s(Option option) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, C9175a.f24932Y);
        CheckOption checkOption = new CheckOption(context, getColors().getAccent(), getColors().getAccentedText(), getColors().getCard());
        checkOption.setTag(option.mo21006b());
        checkOption.getCheckText().setText(option.mo21005a());
        checkOption.getCheckText().setTextSize((float) getTheme$ubform_sdkRelease().getFonts().getTextSize());
        checkOption.getCheckText().setTypeface(getTheme$ubform_sdkRelease().getTypefaceRegular());
        checkOption.getCheckText().setTextColor(getColors().getText());
        return checkOption;
    }

    /* renamed from: t */
    public final void mo21043t() {
        Object obj;
        for (CheckOption checkOption : this.f27521E0) {
            Iterator it = ((C10013a) getFieldPresenter()).mo20816d().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(checkOption.getTag(), (Object) (String) obj)) {
                    break;
                }
            }
            if (((String) obj) != null) {
                checkOption.getCheckIcon().callOnClick();
            }
        }
    }
}

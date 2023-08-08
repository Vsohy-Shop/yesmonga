package com.usabilla.sdk.ubform.sdk.field.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.annotation.C0329d0;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.C9747c;
import com.usabilla.sdk.ubform.sdk.field.contract.C9977g;
import com.usabilla.sdk.ubform.sdk.field.model.common.Option;
import com.usabilla.sdk.ubform.sdk.field.presenter.C10021f;
import com.usabilla.sdk.ubform.sdk.field.view.common.FieldView;
import java.util.List;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0017\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010*\u001a\u00020\u0002¢\u0006\u0004\b+\u0010,J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u001a\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\u0005H\u0002J\b\u0010\u000e\u001a\u00020\u0005H\u0002J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0016\u001a\u00020\u0005H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\nH\u0002R\u0014\u0010\u001e\u001a\u00020\n8\u0002XD¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010'\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010&¨\u0006-"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/sdk/field/view/RadioView;", "Lcom/usabilla/sdk/ubform/sdk/field/view/common/FieldView;", "Lcom/usabilla/sdk/ubform/sdk/field/presenter/f;", "Lcom/usabilla/sdk/ubform/sdk/field/contract/g$b;", "Landroid/widget/RadioGroup$OnCheckedChangeListener;", "Lkotlin/d2;", "j", "c", "Landroid/widget/RadioGroup;", "group", "", "checkedId", "onCheckedChanged", "s", "n", "Lcom/usabilla/sdk/ubform/sdk/field/model/common/Option;", "opt", "id", "", "shouldAddMargin", "Landroid/widget/RadioButton;", "p", "r", "Landroid/graphics/drawable/StateListDrawable;", "q", "strokeSize", "Landroid/graphics/drawable/Drawable;", "o", "E0", "I", "fadeDuration", "F0", "Lkotlin/z;", "getRadioGroup", "()Landroid/widget/RadioGroup;", "radioGroup", "G0", "getRadioSize", "()I", "radioSize", "Landroid/content/Context;", "context", "field", "<init>", "(Landroid/content/Context;Lcom/usabilla/sdk/ubform/sdk/field/presenter/f;)V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
public final class RadioView extends FieldView<C10021f> implements C9977g.C9979b, RadioGroup.OnCheckedChangeListener {

    /* renamed from: E0 */
    public final int f27547E0 = 200;
    @C12579k

    /* renamed from: F0 */
    public final C11677z f27548F0;
    @C12579k

    /* renamed from: G0 */
    public final C11677z f27549G0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RadioView(@C12579k Context context, @C12579k C10021f fVar) {
        super(context, fVar);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(fVar, "field");
        this.f27548F0 = C10864b0.m38748c(new RadioView$radioGroup$2(context, this));
        this.f27549G0 = C10864b0.m38748c(new RadioView$radioSize$2(this));
    }

    private final RadioGroup getRadioGroup() {
        return (RadioGroup) this.f27548F0.getValue();
    }

    private final int getRadioSize() {
        return ((Number) this.f27549G0.getValue()).intValue();
    }

    /* renamed from: c */
    public void mo20831c() {
        if (mo21128l()) {
            getRadioGroup().setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener) null);
            getRadioGroup().clearCheck();
            getRadioGroup().setOnCheckedChangeListener(this);
        }
    }

    /* renamed from: j */
    public void mo20835j() {
        mo21077s();
        mo21076r();
    }

    /* renamed from: n */
    public final void mo21071n() {
        List<Option> options = ((C10021f) getFieldPresenter()).getOptions();
        int i = 0;
        for (Object next : options) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            Option option = (Option) next;
            boolean z = true;
            if (i == options.size() - 1) {
                z = false;
            }
            getRadioGroup().addView(mo21074p(option, i, z));
            i = i2;
        }
    }

    /* renamed from: o */
    public final Drawable mo21072o(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setSize(getRadioSize(), getRadioSize());
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(getColors().getAccentedText());
        gradientDrawable.setStroke(i, getColors().getAccent());
        return gradientDrawable;
    }

    public void onCheckedChanged(@C12579k RadioGroup radioGroup, @C0329d0 int i) {
        Intrinsics.checkNotNullParameter(radioGroup, "group");
        C10021f fVar = (C10021f) getFieldPresenter();
        Object tag = ((RadioButton) findViewById(i)).getTag();
        if (tag != null) {
            fVar.mo20824R((String) tag);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    /* renamed from: p */
    public final RadioButton mo21074p(Option option, int i, boolean z) {
        AppCompatRadioButton appCompatRadioButton = new AppCompatRadioButton(getContext());
        appCompatRadioButton.setId(i);
        int dimensionPixelSize = appCompatRadioButton.getResources().getDimensionPixelSize(C9747c.C9754g.ub_element_radio_padding);
        RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-2, -2);
        if (z) {
            layoutParams.setMargins(0, 0, 0, dimensionPixelSize);
        }
        appCompatRadioButton.setPadding(dimensionPixelSize, 0, 0, 0);
        C11079d2 d2Var = C11079d2.f28267a;
        appCompatRadioButton.setLayoutParams(layoutParams);
        appCompatRadioButton.setGravity(48);
        appCompatRadioButton.setText(option.mo21005a());
        appCompatRadioButton.setTag(option.mo21006b());
        appCompatRadioButton.setTypeface(getTheme$ubform_sdkRelease().getTypefaceRegular());
        appCompatRadioButton.setTextColor(getColors().getText());
        appCompatRadioButton.setTextSize((float) getTheme$ubform_sdkRelease().getFonts().getTextSize());
        appCompatRadioButton.setButtonDrawable((Drawable) mo21075q());
        return appCompatRadioButton;
    }

    /* renamed from: q */
    public final StateListDrawable mo21075q() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.setExitFadeDuration(this.f27547E0);
        stateListDrawable.setEnterFadeDuration(this.f27547E0);
        stateListDrawable.addState(new int[]{16842912}, mo21072o(getResources().getDimensionPixelSize(C9747c.C9754g.ub_element_radio_stroke_checked)));
        stateListDrawable.addState(new int[0], mo21072o(getResources().getDimensionPixelSize(C9747c.C9754g.ub_element_radio_stroke_not_checked)));
        return stateListDrawable;
    }

    /* renamed from: r */
    public final void mo21076r() {
        int D = ((C10021f) getFieldPresenter()).mo20854D();
        if (D != -1) {
            getRadioGroup().check(D);
        }
    }

    /* renamed from: s */
    public final void mo21077s() {
        mo21071n();
        getRootView().addView(getRadioGroup());
    }
}

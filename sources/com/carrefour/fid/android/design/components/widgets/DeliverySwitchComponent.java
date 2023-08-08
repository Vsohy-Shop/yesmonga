package com.carrefour.fid.android.design.components.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckedTextView;
import androidx.appcompat.content.res.C0507a;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.C17465i;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.databinding.C37058k;
import com.urbanairship.iam.events.C9175a;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001:\u0001/B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b-\u0010.J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\"\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0002J\b\u0010\u0011\u001a\u00020\u0004H\u0002J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0002H\u0002R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR0\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001c8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R.\u0010,\u001a\u0004\u0018\u00010\u001d2\b\u0010%\u001a\u0004\u0018\u00010\u001d8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u00060"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/DeliverySwitchComponent;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "isEnabled", "Lkotlin/d2;", "setEnabled", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "w", "Landroid/content/res/TypedArray;", "typedArray", "A", "x", "B", "Landroid/widget/CheckedTextView;", "checkedTextView", "isSelected", "C", "Lcom/carrefour/fid/android/design/components/databinding/k;", "a", "Lkotlin/z;", "getBinding", "()Lcom/carrefour/fid/android/design/components/databinding/k;", "binding", "Lkotlin/Function1;", "Lcom/carrefour/fid/android/design/components/widgets/DeliverySwitchComponent$SwitchOption;", "b", "Lkotlin/jvm/functions/l;", "getOnOptionChangedListener", "()Lkotlin/jvm/functions/l;", "setOnOptionChangedListener", "(Lkotlin/jvm/functions/l;)V", "onOptionChangedListener", "value", "c", "Lcom/carrefour/fid/android/design/components/widgets/DeliverySwitchComponent$SwitchOption;", "getSelectedOption", "()Lcom/carrefour/fid/android/design/components/widgets/DeliverySwitchComponent$SwitchOption;", "setSelectedOption", "(Lcom/carrefour/fid/android/design/components/widgets/DeliverySwitchComponent$SwitchOption;)V", "selectedOption", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "SwitchOption", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nDeliverySwitchComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeliverySwitchComponent.kt\ncom/carrefour/fid/android/design/components/widgets/DeliverySwitchComponent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,143:1\n1#2:144\n*E\n"})
public final class DeliverySwitchComponent extends ConstraintLayout {

    /* renamed from: d */
    public static final int f93044d = 8;
    @C12579k

    /* renamed from: a */
    public final C11677z f93045a;
    @C12580l

    /* renamed from: b */
    public C11300l<? super SwitchOption, C11079d2> f93046b;
    @C12580l

    /* renamed from: c */
    public SwitchOption f93047c;

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/DeliverySwitchComponent$SwitchOption;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public enum SwitchOption {
        FIRST,
        SECOND
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public DeliverySwitchComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    private final C37058k getBinding() {
        return (C37058k) this.f93045a.getValue();
    }

    /* renamed from: y */
    public static final void m152329y(DeliverySwitchComponent deliverySwitchComponent, View view) {
        Intrinsics.checkNotNullParameter(deliverySwitchComponent, "this$0");
        deliverySwitchComponent.setSelectedOption(SwitchOption.FIRST);
    }

    /* renamed from: z */
    public static final void m152330z(DeliverySwitchComponent deliverySwitchComponent, View view) {
        Intrinsics.checkNotNullParameter(deliverySwitchComponent, "this$0");
        deliverySwitchComponent.setSelectedOption(SwitchOption.SECOND);
    }

    /* renamed from: A */
    public final void mo112864A(TypedArray typedArray) {
        getBinding().f92703b.setText(typedArray.getString(C36896b.C36914r.DeliverySwitchComponent_firstOption));
        getBinding().f92704c.setText(typedArray.getString(C36896b.C36914r.DeliverySwitchComponent_secondOption));
        setSelectedOption((SwitchOption) ArraysKt___ArraysKt.m40121qf(SwitchOption.values(), typedArray.getInteger(C36896b.C36914r.DeliverySwitchComponent_defaultSelection, -1)));
    }

    /* renamed from: B */
    public final void mo112865B() {
        boolean z;
        C37058k binding = getBinding();
        SwitchOption switchOption = this.f93047c;
        boolean z2 = true;
        if (switchOption == SwitchOption.FIRST) {
            z = true;
        } else {
            z = false;
        }
        if (switchOption != SwitchOption.SECOND) {
            z2 = false;
        }
        binding.f92703b.setChecked(z);
        binding.f92704c.setChecked(z2);
        CheckedTextView checkedTextView = binding.f92703b;
        Intrinsics.checkNotNullExpressionValue(checkedTextView, "switchFirstOption");
        mo112866C(checkedTextView, z);
        CheckedTextView checkedTextView2 = binding.f92704c;
        Intrinsics.checkNotNullExpressionValue(checkedTextView2, "switchSecondOption");
        mo112866C(checkedTextView2, z2);
    }

    /* renamed from: C */
    public final void mo112866C(CheckedTextView checkedTextView, boolean z) {
        int i;
        Context context = getContext();
        if (z) {
            i = C36896b.C36905i.ds_font_family_brand_bold;
        } else {
            i = C36896b.C36905i.ds_font_family_brand;
        }
        checkedTextView.setTypeface(C17465i.m80178j(context, i));
    }

    @C12580l
    public final C11300l<SwitchOption, C11079d2> getOnOptionChangedListener() {
        return this.f93046b;
    }

    @C12580l
    public final SwitchOption getSelectedOption() {
        return this.f93047c;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        getBinding().f92703b.setEnabled(z);
        getBinding().f92704c.setEnabled(z);
        if (!z) {
            if (this.f93047c == SwitchOption.FIRST) {
                getBinding().f92703b.setBackground(C0507a.m2346b(getContext(), C36896b.C36904h.ds_component_delivery_switch_left_disabled_background));
                return;
            }
            getBinding().f92704c.setBackground(C0507a.m2346b(getContext(), C36896b.C36904h.ds_component_delivery_switch_right_disabled_background));
        } else if (this.f93047c == SwitchOption.FIRST) {
            getBinding().f92703b.setBackground(C0507a.m2346b(getContext(), C36896b.C36904h.ds_component_delivery_switch_left_background));
        } else {
            getBinding().f92704c.setBackground(C0507a.m2346b(getContext(), C36896b.C36904h.ds_component_delivery_switch_right_background));
        }
    }

    public final void setOnOptionChangedListener(@C12580l C11300l<? super SwitchOption, C11079d2> lVar) {
        this.f93046b = lVar;
    }

    public final void setSelectedOption(@C12580l SwitchOption switchOption) {
        C11300l<? super SwitchOption, C11079d2> lVar;
        if (switchOption != this.f93047c) {
            this.f93047c = switchOption;
            mo112865B();
            if (switchOption != null && (lVar = this.f93046b) != null) {
                lVar.invoke(switchOption);
            }
        }
    }

    /* renamed from: w */
    public final void mo112872w(Context context, AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C36896b.C36914r.DeliverySwitchComponent, i, 0);
            try {
                Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "it");
                mo112864A(obtainStyledAttributes);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    /* renamed from: x */
    public final void mo112873x() {
        C37058k binding = getBinding();
        binding.f92703b.setOnClickListener(new C37289p(this));
        binding.f92704c.setOnClickListener(new C37391q(this));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public DeliverySwitchComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DeliverySwitchComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public DeliverySwitchComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f93045a = C10864b0.m38748c(new DeliverySwitchComponent$binding$2(context, this));
        mo112872w(context, attributeSet, i);
        mo112873x();
    }
}

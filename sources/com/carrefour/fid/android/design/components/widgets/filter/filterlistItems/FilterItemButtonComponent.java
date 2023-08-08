package com.carrefour.fid.android.design.components.widgets.filter.filterlistItems;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.design.components.databinding.C37065n;
import com.carrefour.fid.android.design.components.widgets.filter.C37224a;
import com.carrefour.fid.android.design.components.widgets.filter.FilterItemComponent;
import com.google.android.material.button.MaterialButton;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u0012"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/filter/filterlistItems/FilterItemButtonComponent;", "Lcom/carrefour/fid/android/design/components/widgets/filter/FilterItemComponent;", "Lcom/carrefour/fid/android/design/components/widgets/filter/a;", "itemViewUIModel", "Lkotlin/d2;", "w", "Lcom/carrefour/fid/android/design/components/databinding/n;", "b", "Lcom/carrefour/fid/android/design/components/databinding/n;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class FilterItemButtonComponent extends FilterItemComponent<C37224a> {

    /* renamed from: c */
    public static final int f93377c = 8;
    @C12579k

    /* renamed from: b */
    public final C37065n f93378b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public FilterItemButtonComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: x */
    public static final void m152842x(C37224a aVar, View view) {
        aVar.mo113356f().invoke();
    }

    /* renamed from: w */
    public void mo113348u(@C12580l C37224a aVar) {
        String str;
        C11289a<C11079d2> aVar2;
        MaterialButton materialButton = this.f93378b.f92744b;
        if (aVar != null) {
            str = aVar.mo113354e();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        materialButton.setText(str);
        if (aVar != null) {
            aVar2 = aVar.mo113356f();
        } else {
            aVar2 = null;
        }
        if (aVar2 != null) {
            this.f93378b.f92744b.setOnClickListener(new C37230a(aVar));
        } else {
            this.f93378b.getRoot().setOnClickListener((View.OnClickListener) null);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public FilterItemButtonComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FilterItemButtonComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public FilterItemButtonComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C37065n b = C37065n.m152028b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(b, "inflate(\n        LayoutI…ext),\n        this,\n    )");
        this.f93378b = b;
    }
}

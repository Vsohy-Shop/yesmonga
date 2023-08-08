package com.carrefour.fid.android.design.components.widgets.filter.filterlistItems;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.design.components.databinding.C37067o;
import com.carrefour.fid.android.design.components.widgets.filter.C37227c;
import com.carrefour.fid.android.design.components.widgets.filter.FilterItemComponent;
import com.urbanairship.iam.events.C9175a;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11677z;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u001b\u0010\u000b\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/filter/filterlistItems/FilterItemCheckboxComponent;", "Lcom/carrefour/fid/android/design/components/widgets/filter/FilterItemComponent;", "Lcom/carrefour/fid/android/design/components/widgets/filter/c;", "viewModel", "Lkotlin/d2;", "v", "Lcom/carrefour/fid/android/design/components/databinding/o;", "b", "Lkotlin/z;", "getBinding", "()Lcom/carrefour/fid/android/design/components/databinding/o;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class FilterItemCheckboxComponent extends FilterItemComponent<C37227c> {

    /* renamed from: c */
    public static final int f93379c = 8;
    @C12579k

    /* renamed from: b */
    public final C11677z f93380b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public FilterItemCheckboxComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    private final C37067o getBinding() {
        return (C37067o) this.f93380b.getValue();
    }

    /* renamed from: v */
    public void mo113348u(@C12580l C37227c cVar) {
        if (cVar != null) {
            C37067o binding = getBinding();
            binding.f92757b.mo112825b(cVar.mo113367e());
            binding.f92757b.setOnCheckboxClickListener(cVar.mo113369f());
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public FilterItemCheckboxComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FilterItemCheckboxComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public FilterItemCheckboxComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f93380b = C10864b0.m38748c(new FilterItemCheckboxComponent$binding$2(context, this));
    }
}

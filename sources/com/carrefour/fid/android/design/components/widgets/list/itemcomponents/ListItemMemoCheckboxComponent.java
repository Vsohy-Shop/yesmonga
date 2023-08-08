package com.carrefour.fid.android.design.components.widgets.list.itemcomponents;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.databinding.C37085x;
import com.carrefour.fid.android.design.components.widgets.list.C37264d;
import com.carrefour.fid.android.design.components.widgets.list.ListItemComponent;
import com.urbanairship.iam.events.C9175a;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u001b\u0010\u000b\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/list/itemcomponents/ListItemMemoCheckboxComponent;", "Lcom/carrefour/fid/android/design/components/widgets/list/ListItemComponent;", "Lcom/carrefour/fid/android/design/components/widgets/list/d;", "itemViewWithDeleteUIModel", "Lkotlin/d2;", "w", "Lcom/carrefour/fid/android/design/components/databinding/x;", "c", "Lkotlin/z;", "getBinding", "()Lcom/carrefour/fid/android/design/components/databinding/x;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "", "itemHeight", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILjava/lang/Float;)V", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class ListItemMemoCheckboxComponent extends ListItemComponent<C37264d> {

    /* renamed from: d */
    public static final int f93495d = 8;
    @C12579k

    /* renamed from: c */
    public final C11677z f93496c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ListItemMemoCheckboxComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, (Float) null, 14, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    private final C37085x getBinding() {
        return (C37085x) this.f93496c.getValue();
    }

    /* renamed from: x */
    public static final void m152986x(C37264d dVar, View view) {
        C11289a<C11079d2> h = dVar.mo113460h();
        if (h != null) {
            h.invoke();
        }
    }

    /* renamed from: w */
    public void mo113429u(@C12580l C37264d dVar) {
        if (dVar != null) {
            C37085x binding = getBinding();
            binding.f92842b.mo112825b(dVar.mo113458f());
            binding.f92842b.setOnCheckboxClickListener(dVar.mo113459g());
            binding.f92843c.setOnClickListener(new C37278f(dVar));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ListItemMemoCheckboxComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, (Float) null, 12, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ListItemMemoCheckboxComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (Float) null, 8, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ListItemMemoCheckboxComponent(Context context, AttributeSet attributeSet, int i, Float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? Float.valueOf(60.0f) : f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public ListItemMemoCheckboxComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i, @C12580l Float f) {
        super(context, attributeSet, i, f);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f93496c = C10864b0.m38748c(new ListItemMemoCheckboxComponent$binding$2(context, this));
        setBackgroundColor(context.getColor(C36896b.C36902f.ds_grey_white));
    }
}

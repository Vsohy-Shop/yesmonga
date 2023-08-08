package com.carrefour.fid.android.design.components.widgets.list.itemcomponents;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.databinding.C37081v;
import com.carrefour.fid.android.design.components.widgets.list.C37263c;
import com.carrefour.fid.android.design.components.widgets.list.ListItemComponent;
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

@C11076d0(mo22515d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u0014"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/list/itemcomponents/ListItemButtonComponent;", "Lcom/carrefour/fid/android/design/components/widgets/list/ListItemComponent;", "Lcom/carrefour/fid/android/design/components/widgets/list/c;", "itemViewUIModel", "Lkotlin/d2;", "w", "Lcom/carrefour/fid/android/design/components/databinding/v;", "c", "Lcom/carrefour/fid/android/design/components/databinding/v;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "", "itemHeight", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILjava/lang/Float;)V", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class ListItemButtonComponent extends ListItemComponent<C37263c> {

    /* renamed from: d */
    public static final int f93485d = 8;
    @C12579k

    /* renamed from: c */
    public final C37081v f93486c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ListItemButtonComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, (Float) null, 14, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: x */
    public static final void m152955x(C37263c cVar, View view) {
        C11289a<C11079d2> f;
        if (cVar != null && (f = cVar.mo113450f()) != null) {
            f.invoke();
        }
    }

    /* renamed from: w */
    public void mo113429u(@C12580l C37263c cVar) {
        String str;
        MaterialButton materialButton = this.f93486c.f92834b;
        if (cVar != null) {
            str = cVar.mo113448e();
        } else {
            str = null;
        }
        materialButton.setText(str);
        this.f93486c.f92834b.setOnClickListener(new C37273a(cVar));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ListItemButtonComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, (Float) null, 12, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ListItemButtonComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (Float) null, 8, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ListItemButtonComponent(Context context, AttributeSet attributeSet, int i, Float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? Float.valueOf(60.0f) : f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public ListItemButtonComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i, @C12580l Float f) {
        super(context, attributeSet, i, f);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C37081v b = C37081v.m152070b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(b, "inflate(\n            Lay…          this,\n        )");
        this.f93486c = b;
        setBackgroundResource(C36896b.C36904h.background_white_ripple);
    }
}

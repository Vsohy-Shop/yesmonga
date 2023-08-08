package com.carrefour.fid.android.design.components.widgets.productcard.list;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.design.components.databinding.C37059k0;
import com.carrefour.fid.android.design.components.widgets.productcard.C37353b;
import com.google.android.datatransport.cct.C40045d;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0005B'\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u0011"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/productcard/list/ProductCardListTitle;", "Landroid/widget/FrameLayout;", "Lcom/carrefour/fid/android/design/components/widgets/productcard/list/ProductCardListTitle$a;", "model", "Lkotlin/d2;", "a", "Lcom/carrefour/fid/android/design/components/databinding/k0;", "Lcom/carrefour/fid/android/design/components/databinding/k0;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class ProductCardListTitle extends FrameLayout {

    /* renamed from: b */
    public static final int f93912b = 8;
    @C12579k

    /* renamed from: a */
    public final C37059k0 f93913a;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.list.ProductCardListTitle$a */
    public static final class C37368a implements C37369a {

        /* renamed from: b */
        public static final int f93914b = 0;
        @C12579k

        /* renamed from: a */
        public final String f93915a;

        public C37368a(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "title");
            this.f93915a = str;
        }

        @C12579k
        /* renamed from: a */
        public final String mo113943a() {
            return this.f93915a;
        }

        public int getType(@C12579k C37353b.C37354a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "typeFactory");
            return aVar.mo113926f(this);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ProductCardListTitle(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: a */
    public final void mo113942a(@C12579k C37368a aVar) {
        Intrinsics.checkNotNullParameter(aVar, C40045d.f102104u);
        this.f93913a.f92706b.setText(aVar.mo113943a());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ProductCardListTitle(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProductCardListTitle(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public ProductCardListTitle(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C37059k0 b = C37059k0.m152012b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(b, "inflate(\n        LayoutI…ext),\n        this,\n    )");
        this.f93913a = b;
    }
}

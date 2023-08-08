package com.carrefour.fid.android.design.components.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.databinding.C37050h0;
import com.urbanairship.iam.events.C9175a;
import java.util.NoSuchElementException;
import kotlin.C11076d0;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/PageControlsComponent;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/carrefour/fid/android/design/components/widgets/BACKGROUND;", "background", "Lkotlin/d2;", "w", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "u", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "v", "", "type", "x", "Lcom/carrefour/fid/android/design/components/databinding/h0;", "a", "Lcom/carrefour/fid/android/design/components/databinding/h0;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class PageControlsComponent extends ConstraintLayout {

    /* renamed from: b */
    public static final int f93134b = 8;
    @C12579k

    /* renamed from: a */
    public final C37050h0 f93135a;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public PageControlsComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: u */
    public final void mo113006u(@C12579k RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f93135a.f92681b.mo30613f(recyclerView);
    }

    /* renamed from: v */
    public final void mo113007v(@C12579k ViewPager2 viewPager2) {
        Intrinsics.checkNotNullParameter(viewPager2, "viewPager");
        this.f93135a.f92681b.mo30611d(viewPager2);
    }

    /* renamed from: w */
    public final void mo113008w(@C12579k BACKGROUND background) {
        Intrinsics.checkNotNullParameter(background, "background");
        mo113009x(background.ordinal());
    }

    /* renamed from: x */
    public final void mo113009x(int i) {
        if (i == BACKGROUND.LIGHT.ordinal()) {
            this.f93135a.f92681b.setDotColor(getContext().getColor(C36896b.C36902f.ds_grey_40));
            this.f93135a.f92681b.setSelectedDotColor(getContext().getColor(C36896b.C36902f.ds_primary));
        } else if (i == BACKGROUND.DARK.ordinal()) {
            this.f93135a.f92681b.setDotColor(getContext().getColor(C36896b.C36902f.ds_grey_20));
            this.f93135a.f92681b.setSelectedDotColor(getContext().getColor(C36896b.C36902f.ds_grey_white));
        } else {
            throw new NoSuchElementException("This type doesn't exist");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public PageControlsComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PageControlsComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public PageControlsComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C37050h0 b = C37050h0.m151986b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(b, "inflate(LayoutInflater.from(context), this)");
        this.f93135a = b;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C36896b.C36914r.PageControlsComponent, 0, 0);
        try {
            mo113009x(obtainStyledAttributes.getInteger(C36896b.C36914r.PageControlsComponent_type, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}

package com.urbanairship.android.layout.view;

import android.content.Context;
import android.view.View;
import android.widget.Checkable;
import android.widget.LinearLayout;
import com.google.android.datatransport.cct.C40045d;
import com.urbanairship.android.layout.info.C35652d0;
import com.urbanairship.android.layout.model.PagerIndicatorModel;
import com.urbanairship.android.layout.util.C35916j;
import com.urbanairship.android.layout.util.C35921m;
import com.urbanairship.android.layout.widget.ShapeView;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, mo22516d2 = {"Lcom/urbanairship/android/layout/view/PagerIndicatorView;", "Landroid/widget/LinearLayout;", "Lcom/urbanairship/android/layout/view/a;", "", "count", "Lkotlin/d2;", "setCount", "position", "setPosition", "Lcom/urbanairship/android/layout/model/PagerIndicatorModel;", "a", "Lcom/urbanairship/android/layout/model/PagerIndicatorModel;", "model", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Lcom/urbanairship/android/layout/model/PagerIndicatorModel;)V", "urbanairship-layout_release"}, mo22517k = 1, mo22518mv = {1, 7, 1})
public final class PagerIndicatorView extends LinearLayout implements C35977a {
    @C12579k

    /* renamed from: a */
    public final PagerIndicatorModel f88888a;

    /* renamed from: com.urbanairship.android.layout.view.PagerIndicatorView$a */
    public static final class C35956a implements PagerIndicatorModel.C35748a {

        /* renamed from: a */
        public boolean f88889a;

        /* renamed from: b */
        public final /* synthetic */ PagerIndicatorView f88890b;

        public C35956a(PagerIndicatorView pagerIndicatorView) {
            this.f88890b = pagerIndicatorView;
        }

        /* renamed from: c */
        public void mo107090c(int i, int i2) {
            if (!this.f88889a) {
                this.f88889a = true;
                this.f88890b.setCount(i);
            }
            this.f88890b.setPosition(i2);
        }

        /* renamed from: f */
        public void mo107011f(boolean z) {
            int i;
            PagerIndicatorView pagerIndicatorView = this.f88890b;
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            pagerIndicatorView.setVisibility(i);
        }

        public void setEnabled(boolean z) {
            this.f88890b.setEnabled(z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagerIndicatorView(@C12579k Context context, @C12579k PagerIndicatorModel pagerIndicatorModel) {
        super(context);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(pagerIndicatorModel, C40045d.f102104u);
        this.f88888a = pagerIndicatorModel;
        setOrientation(0);
        setGravity(17);
        C35916j.m148085c(this, pagerIndicatorModel);
        pagerIndicatorModel.mo106988H(new C35956a(this));
    }

    public final void setCount(int i) {
        int i2;
        int i3;
        C35652d0.C35654b K = this.f88888a.mo107083K();
        C35652d0.C35653a a = K.mo106798a();
        C35652d0.C35653a b = K.mo106799b();
        int a2 = (int) C35921m.m148111a(getContext(), this.f88888a.mo107084L());
        int i4 = (int) (((float) a2) / 2.0f);
        for (int i5 = 0; i5 < i; i5++) {
            ShapeView shapeView = new ShapeView(getContext(), a.mo106797b(), b.mo106797b(), a.mo106796a(), b.mo106796a());
            shapeView.setId(this.f88888a.mo107085M(i5));
            shapeView.setAdjustViewBounds(true);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            if (i5 == 0) {
                i2 = a2;
            } else {
                i2 = i4;
            }
            layoutParams.setMarginStart(i2);
            if (i5 == i - 1) {
                i3 = a2;
            } else {
                i3 = i4;
            }
            layoutParams.setMarginEnd(i3);
            addView(shapeView, layoutParams);
        }
    }

    public final void setPosition(int i) {
        boolean z;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.Checkable");
            Checkable checkable = (Checkable) childAt;
            if (i2 == i) {
                z = true;
            } else {
                z = false;
            }
            checkable.setChecked(z);
        }
    }
}

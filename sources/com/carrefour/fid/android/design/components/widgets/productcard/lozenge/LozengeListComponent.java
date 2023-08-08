package com.carrefour.fid.android.design.components.widgets.productcard.lozenge;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.view.C0538d;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.databinding.C37029a0;
import com.carrefour.fid.android.design.components.extension.ViewKt;
import com.carrefour.fid.android.design.components.widgets.productcard.lozenge.C37382a;
import com.google.android.datatransport.cct.C40045d;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.chip.Chip;
import com.urbanairship.iam.events.C9175a;
import java.util.List;
import kotlin.C11076d0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0005B'\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0018"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/productcard/lozenge/LozengeListComponent;", "Landroid/widget/FrameLayout;", "Lcom/carrefour/fid/android/design/components/widgets/productcard/lozenge/LozengeListComponent$a;", "model", "Lkotlin/d2;", "a", "Lcom/carrefour/fid/android/design/components/widgets/productcard/lozenge/a;", "Landroid/view/View;", "b", "Lcom/carrefour/fid/android/design/components/databinding/a0;", "Lcom/carrefour/fid/android/design/components/databinding/a0;", "binding", "", "I", "marginValue", "c", "iconSize", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nLozengeListComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LozengeListComponent.kt\ncom/carrefour/fid/android/design/components/widgets/productcard/lozenge/LozengeListComponent\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,101:1\n1864#2,3:102\n*S KotlinDebug\n*F\n+ 1 LozengeListComponent.kt\ncom/carrefour/fid/android/design/components/widgets/productcard/lozenge/LozengeListComponent\n*L\n60#1:102,3\n*E\n"})
public final class LozengeListComponent extends FrameLayout {

    /* renamed from: d */
    public static final int f93939d = 8;
    @C12579k

    /* renamed from: a */
    public final C37029a0 f93940a;

    /* renamed from: b */
    public final int f93941b;

    /* renamed from: c */
    public final int f93942c;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.lozenge.LozengeListComponent$a */
    public static final class C37381a {

        /* renamed from: b */
        public static final int f93943b = 8;
        @C12579k

        /* renamed from: a */
        public final List<C37382a> f93944a;

        public C37381a() {
            this((List) null, 1, (DefaultConstructorMarker) null);
        }

        @C12579k
        /* renamed from: a */
        public final List<C37382a> mo113965a() {
            return this.f93944a;
        }

        public C37381a(@C12579k List<? extends C37382a> list) {
            Intrinsics.checkNotNullParameter(list, "lozenges");
            this.f93944a = list;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C37381a(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt__CollectionsKt.m40441E() : list);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public LozengeListComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: a */
    public final void mo113963a(@C12579k C37381a aVar) {
        Intrinsics.checkNotNullParameter(aVar, C40045d.f102104u);
        this.f93940a.f92560b.removeAllViews();
        int i = 0;
        for (Object next : aVar.mo113965a()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            View b = mo113964b((C37382a) next);
            if (i > 0) {
                ViewGroup.LayoutParams layoutParams = b.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout.LayoutParams");
                ((FlexboxLayout.LayoutParams) layoutParams).setMarginStart(this.f93941b);
            }
            ViewGroup.LayoutParams layoutParams2 = b.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type com.google.android.flexbox.FlexboxLayout.LayoutParams");
            ((FlexboxLayout.LayoutParams) layoutParams2).mo132999R2(0.0f);
            this.f93940a.f92560b.addView(b);
            i = i2;
        }
    }

    /* renamed from: b */
    public final View mo113964b(C37382a aVar) {
        if (aVar instanceof C37382a.C37383a) {
            Chip chip = new Chip(new C0538d(getContext(), C36896b.C36913q.Lozenge_Chip_ThemeOverlay), (AttributeSet) null, C36896b.C36900d.chipStyle);
            C37382a.C37383a aVar2 = (C37382a.C37383a) aVar;
            chip.setText(aVar2.mo113966a());
            chip.setCheckable(false);
            ViewKt.m152121c(chip, aVar2.mo113966a(), false, 2, (Object) null);
            chip.setLayoutParams(new FlexboxLayout.LayoutParams(-2, -2));
            return chip;
        } else if (aVar instanceof C37382a.C37384b) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(((C37382a.C37384b) aVar).mo113967a());
            int i = this.f93942c;
            imageView.setLayoutParams(new FlexboxLayout.LayoutParams(i, i));
            return imageView;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public LozengeListComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LozengeListComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public LozengeListComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C37029a0 b = C37029a0.m151930b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(b, "inflate(\n        LayoutI…ext),\n        this,\n    )");
        this.f93940a = b;
        this.f93941b = getResources().getDimensionPixelSize(C36896b.C36903g.ds_spacing_xxs);
        this.f93942c = getResources().getDimensionPixelSize(C36896b.C36903g.ds_sizing_m);
        int i2 = 0;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C36896b.C36914r.LozengeListComponent, 0, 0);
        try {
            b.f92560b.setJustifyContent(obtainStyledAttributes.getBoolean(C36896b.C36914r.LozengeListComponent_centerItems, false) ? 2 : i2);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}

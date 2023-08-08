package com.carrefour.fid.android.design.components.widgets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C17318d;
import com.bumptech.glide.C22038b;
import com.bumptech.glide.C22090i;
import com.bumptech.glide.C22092j;
import com.bumptech.glide.load.engine.C22234h;
import com.bumptech.glide.request.target.C22586r;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.databinding.C37049h;
import com.carrefour.fid.android.design.components.utils.C37133a;
import com.carrefour.fid.android.design.components.utils.C37141h;
import com.carrefour.fid.android.design.components.utils.C37145l;
import com.carrefour.fid.android.design.components.widgets.productcard.LabelComponent;
import com.google.android.gms.common.internal.C40852x;
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

@C11076d0(mo22515d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010,\u001a\u00020+\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\b\b\u0002\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0015\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0001J\u0015\u0010\b\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0001J\u0010\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tJ,\u0010\u0010\u001a\u001e\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u000f0\u000f0\f2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002R*\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00138\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00138\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001b\u0010$\u001a\u00020\u001f8BX\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010*\u001a\u00020%8\u0016@\u0016X\u000f¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u00063"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/CouponComponent;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/carrefour/fid/android/design/components/utils/h;", "Landroid/view/View;", "Landroid/view/View$OnClickListener;", "listener", "Lkotlin/d2;", "setLoadingDebouncedClickListener", "setTimeoutDebouncedClickListener", "Lcom/carrefour/fid/android/design/components/widgets/n;", "info", "B", "Lcom/bumptech/glide/request/target/r;", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "Landroid/graphics/drawable/Drawable;", "C", "y", "D", "Lkotlin/Function0;", "b", "Lkotlin/jvm/functions/a;", "getOnButtonClickListener", "()Lkotlin/jvm/functions/a;", "setOnButtonClickListener", "(Lkotlin/jvm/functions/a;)V", "onButtonClickListener", "c", "getOnScanClickListener", "setOnScanClickListener", "onScanClickListener", "Lcom/carrefour/fid/android/design/components/databinding/h;", "d", "Lkotlin/z;", "getBinding", "()Lcom/carrefour/fid/android/design/components/databinding/h;", "binding", "Lcom/carrefour/fid/android/design/components/utils/a;", "getDebouncerState", "()Lcom/carrefour/fid/android/design/components/utils/a;", "setDebouncerState", "(Lcom/carrefour/fid/android/design/components/utils/a;)V", "debouncerState", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class CouponComponent extends ConstraintLayout implements C37141h {

    /* renamed from: e */
    public static final int f93033e = 8;

    /* renamed from: a */
    public final /* synthetic */ C37145l f93034a;
    @C12580l

    /* renamed from: b */
    public C11289a<C11079d2> f93035b;
    @C12580l

    /* renamed from: c */
    public C11289a<C11079d2> f93036c;
    @C12579k

    /* renamed from: d */
    public final C11677z f93037d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public CouponComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: A */
    public static final void m152307A(CouponComponent couponComponent, View view) {
        Intrinsics.checkNotNullParameter(couponComponent, "this$0");
        C11289a<C11079d2> aVar = couponComponent.f93036c;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: E */
    public static final void m152308E(C37049h hVar, View view) {
        Intrinsics.checkNotNullParameter(hVar, "$this_apply");
        hVar.f92677p.setVisibility(8);
    }

    /* renamed from: F */
    public static final void m152309F(C37049h hVar, View view) {
        Intrinsics.checkNotNullParameter(hVar, "$this_apply");
        hVar.f92677p.setVisibility(0);
    }

    private final C37049h getBinding() {
        return (C37049h) this.f93037d.getValue();
    }

    /* renamed from: z */
    public static final void m152314z(CouponComponent couponComponent, View view) {
        Intrinsics.checkNotNullParameter(couponComponent, "this$0");
        C11289a<C11079d2> aVar = couponComponent.f93035b;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: B */
    public final void mo112849B(@C12580l C37283n nVar) {
        if (nVar != null) {
            mo112850C(nVar);
            mo112856y(nVar);
            mo112851D(nVar);
        }
    }

    /* renamed from: C */
    public final C22586r<ImageView, Drawable> mo112850C(C37283n nVar) {
        boolean z;
        LabelComponent.C37316a aVar;
        C37049h binding = getBinding();
        boolean z2 = true;
        if (nVar.mo113551C()) {
            getDebouncerState().mo112752c();
        } else {
            C37133a.m152202b(getDebouncerState(), false, 1, (Object) null);
        }
        binding.f92675n.setText(nVar.mo113549A());
        binding.f92665d.setText(nVar.mo113572s());
        binding.f92672k.setText(nVar.mo113578x());
        binding.f92676o.setText(nVar.mo113573t());
        binding.f92663b.setLoading(nVar.mo113551C());
        if (nVar.mo113550B()) {
            binding.f92672k.setTextColor(C17318d.m79723f(getContext(), C36896b.C36902f.ds_brand_red));
        } else {
            binding.f92672k.setTextColor(C17318d.m79723f(getContext(), C36896b.C36902f.ds_primary_dark));
        }
        if (nVar.mo113580z().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            binding.f92673l.setVisibility(4);
        } else {
            binding.f92673l.setVisibility(0);
            LabelComponent labelComponent = binding.f92673l;
            Intrinsics.checkNotNullExpressionValue(labelComponent, "couponPromotionChannel");
            LabelComponent.m153105x(labelComponent, new LabelComponent.C37316a.C37327k(nVar.mo113580z()), false, 2, (Object) null);
        }
        if (nVar.mo113579y().length() != 0) {
            z2 = false;
        }
        if (z2) {
            binding.f92669h.setVisibility(4);
        } else {
            LabelComponent labelComponent2 = binding.f92669h;
            Intrinsics.checkNotNullExpressionValue(labelComponent2, "couponLabelPromo");
            if (nVar.mo113550B()) {
                aVar = new LabelComponent.C37316a.C37320d(nVar.mo113579y());
            } else {
                aVar = new LabelComponent.C37316a.C37319c(nVar.mo113579y());
            }
            LabelComponent.m153105x(labelComponent2, aVar, false, 2, (Object) null);
            binding.f92669h.setVisibility(0);
        }
        C22092j E = C22038b.m100350E(getContext());
        C22090i<Drawable> M = E.mo65604t(nVar.mo113575u());
        C22234h hVar = C22234h.f57124b;
        ((C22090i) ((C22090i) M.mo66732A(hVar)).mo66796k()).mo65675K1(binding.f92668g);
        C22586r<ImageView, Drawable> K1 = ((C22090i) ((C22090i) E.mo65605u(nVar.mo113576v()).mo66732A(hVar)).mo66796k()).mo65675K1(binding.f92666e);
        Intrinsics.checkNotNullExpressionValue(K1, "with(binding) {\n        …ponImage)\n        }\n    }");
        return K1;
    }

    /* renamed from: D */
    public final void mo112851D(C37283n nVar) {
        if (nVar.mo113577w()) {
            C37049h binding = getBinding();
            binding.f92670i.setOnClickListener(new C37247j(binding));
            getBinding().f92666e.setEnabled(true);
            binding.f92666e.setOnClickListener(new C37252k(binding));
            return;
        }
        getBinding().f92666e.setEnabled(false);
    }

    @C12579k
    public C37133a getDebouncerState() {
        return this.f93034a.getDebouncerState();
    }

    @C12580l
    public final C11289a<C11079d2> getOnButtonClickListener() {
        return this.f93035b;
    }

    @C12580l
    public final C11289a<C11079d2> getOnScanClickListener() {
        return this.f93036c;
    }

    public void setDebouncerState(@C12579k C37133a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f93034a.setDebouncerState(aVar);
    }

    public void setLoadingDebouncedClickListener(@C12579k View view, @C12579k View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onClickListener, C40852x.C40853a.f103958a);
        this.f93034a.setLoadingDebouncedClickListener(view, onClickListener);
    }

    public final void setOnButtonClickListener(@C12580l C11289a<C11079d2> aVar) {
        this.f93035b = aVar;
    }

    public final void setOnScanClickListener(@C12580l C11289a<C11079d2> aVar) {
        this.f93036c = aVar;
    }

    public void setTimeoutDebouncedClickListener(@C12579k View view, @C12579k View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onClickListener, C40852x.C40853a.f103958a);
        this.f93034a.setTimeoutDebouncedClickListener(view, onClickListener);
    }

    /* renamed from: y */
    public final void mo112856y(C37283n nVar) {
        int i = 0;
        if (nVar.mo113570q()) {
            getBinding().f92663b.setVisibility(0);
            getBinding().f92663b.setChecked(nVar.mo113552D());
            LoaderMaterialButton loaderMaterialButton = getBinding().f92663b;
            Intrinsics.checkNotNullExpressionValue(loaderMaterialButton, "binding.couponButton");
            setLoadingDebouncedClickListener(loaderMaterialButton, new C37255l(this));
        } else {
            getBinding().f92663b.setVisibility(8);
        }
        ImageButton imageButton = getBinding().f92678q;
        if (nVar.mo113571r() != CouponType.BR) {
            i = 8;
        }
        imageButton.setVisibility(i);
        getBinding().f92678q.setOnClickListener(new C37280m(this));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public CouponComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CouponComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public CouponComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f93034a = new C37145l();
        this.f93037d = C10864b0.m38748c(new CouponComponent$binding$2(context, this));
    }
}

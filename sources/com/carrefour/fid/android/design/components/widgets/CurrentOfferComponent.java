package com.carrefour.fid.android.design.components.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.C22038b;
import com.bumptech.glide.load.resource.bitmap.C22414i0;
import com.bumptech.glide.load.resource.bitmap.C22429n;
import com.bumptech.glide.request.C22561h;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.databinding.C37055j;
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

@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002R*\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0016\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/CurrentOfferComponent;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "url", "Lkotlin/d2;", "w", "contentDescription", "v", "x", "Lkotlin/Function0;", "a", "Lkotlin/jvm/functions/a;", "getOnClickListener", "()Lkotlin/jvm/functions/a;", "setOnClickListener", "(Lkotlin/jvm/functions/a;)V", "onClickListener", "Lcom/carrefour/fid/android/design/components/databinding/j;", "b", "Lkotlin/z;", "getBinding", "()Lcom/carrefour/fid/android/design/components/databinding/j;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class CurrentOfferComponent extends ConstraintLayout {

    /* renamed from: c */
    public static final int f93041c = 8;
    @C12580l

    /* renamed from: a */
    public C11289a<C11079d2> f93042a;
    @C12579k

    /* renamed from: b */
    public final C11677z f93043b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public CurrentOfferComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    private final C37055j getBinding() {
        return (C37055j) this.f93043b.getValue();
    }

    /* renamed from: y */
    public static final void m152322y(CurrentOfferComponent currentOfferComponent, View view) {
        Intrinsics.checkNotNullParameter(currentOfferComponent, "this$0");
        C11289a<C11079d2> aVar = currentOfferComponent.f93042a;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @C12580l
    public final C11289a<C11079d2> getOnClickListener() {
        return this.f93042a;
    }

    public final void setOnClickListener(@C12580l C11289a<C11079d2> aVar) {
        this.f93042a = aVar;
    }

    /* renamed from: v */
    public final void mo112860v(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "contentDescription");
        getBinding().f92697b.setContentDescription(str);
    }

    /* renamed from: w */
    public final void mo112861w(@C12580l String str) {
        if (str != null) {
            C22038b.m100350E(getContext()).mo65605u(str).mo65688b(new C22561h().mo66802m1(new C22429n(), new C22414i0(getContext().getResources().getDimensionPixelSize(C36896b.C36903g.ds_radius_l)))).mo65675K1(getBinding().f92697b);
        }
    }

    /* renamed from: x */
    public final void mo112862x() {
        getBinding().f92697b.setOnClickListener(new C37286o(this));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public CurrentOfferComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CurrentOfferComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public CurrentOfferComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f93043b = C10864b0.m38748c(new CurrentOfferComponent$binding$2(context, this));
        mo112862x();
    }
}

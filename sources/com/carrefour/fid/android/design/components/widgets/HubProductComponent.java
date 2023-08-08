package com.carrefour.fid.android.design.components.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import androidx.recyclerview.widget.RecyclerView;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.databinding.C37071q;
import com.carrefour.fid.android.design.components.widgets.C37422x;
import com.carrefour.fid.android.design.components.widgets.adapter.C37191a;
import com.google.android.material.button.MaterialButton;
import com.urbanairship.iam.events.C9175a;
import java.util.List;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010%\u001a\u00020$\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\b\b\u0002\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0003J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\tH\u0003J\b\u0010\u000b\u001a\u00020\u0004H\u0003J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\fH\u0003J\b\u0010\u000e\u001a\u00020\u0004H\u0003J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000fH\u0002J\u0016\u0010\u0014\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0004H\u0002R*\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001b\u0010#\u001a\u00020\u001e8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006,"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/HubProductComponent;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Lcom/carrefour/fid/android/design/components/widgets/x;", "itemContent", "Lkotlin/d2;", "L", "Lcom/carrefour/fid/android/design/components/widgets/x$a;", "content", "G", "Lcom/carrefour/fid/android/design/components/widgets/x$d;", "K", "J", "Lcom/carrefour/fid/android/design/components/widgets/x$b;", "H", "M", "Lcom/carrefour/fid/android/design/components/widgets/x$f;", "N", "", "Lcom/carrefour/fid/android/design/components/widgets/t;", "list", "O", "P", "Lkotlin/Function0;", "T0", "Lkotlin/jvm/functions/a;", "getOnClickListener", "()Lkotlin/jvm/functions/a;", "setOnClickListener", "(Lkotlin/jvm/functions/a;)V", "onClickListener", "Lcom/carrefour/fid/android/design/components/databinding/q;", "U0", "Lkotlin/z;", "getBinding", "()Lcom/carrefour/fid/android/design/components/databinding/q;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nHubProductComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HubProductComponent.kt\ncom/carrefour/fid/android/design/components/widgets/HubProductComponent\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,173:1\n262#2,2:174\n*S KotlinDebug\n*F\n+ 1 HubProductComponent.kt\ncom/carrefour/fid/android/design/components/widgets/HubProductComponent\n*L\n163#1:174,2\n*E\n"})
public final class HubProductComponent extends LinearLayoutCompat {

    /* renamed from: V0 */
    public static final int f93055V0 = 8;
    @C12580l

    /* renamed from: T0 */
    public C11289a<C11079d2> f93056T0;
    @C12579k

    /* renamed from: U0 */
    public final C11677z f93057U0;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public HubProductComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: I */
    public static final void m152345I(C11289a aVar, View view) {
        Intrinsics.checkNotNullParameter(aVar, "$action");
        aVar.invoke();
    }

    /* renamed from: Q */
    public static final void m152346Q(HubProductComponent hubProductComponent, View view) {
        Intrinsics.checkNotNullParameter(hubProductComponent, "this$0");
        C11289a<C11079d2> aVar = hubProductComponent.f93056T0;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    private final C37071q getBinding() {
        return (C37071q) this.f93057U0.getValue();
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    /* renamed from: G */
    public final void mo112880G(C37422x.C37423a aVar) {
        getBinding().f92783j.setImageDrawable(getContext().getDrawable(C36896b.C36904h.ds_ic_basket_express));
        getBinding().f92783j.setVisibility(0);
        getBinding().f92779f.setText(C36896b.C36912p.basket_builder_item_title);
        getBinding().f92776c.setVisibility(0);
        getBinding().f92776c.setText(C36896b.C36912p.basket_builder_item_description);
        getBinding().f92776c.setContentDescription(getContext().getString(C36896b.C36912p.open_basket_builder_page));
        getBinding().f92780g.setVisibility(8);
        mo112887O(aVar.mo114070a());
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    /* renamed from: H */
    public final void mo112881H(C37422x.C37424b bVar) {
        MaterialButton materialButton;
        getBinding().f92779f.setText(getContext().getString(C36896b.C36912p.hub_cart_full_title, new Object[]{Integer.valueOf(bVar.mo114076f())}));
        getBinding().f92780g.setText(bVar.mo114071a());
        getBinding().f92776c.setText(getContext().getString(C36896b.C36912p.hub_cart_full_description, new Object[]{bVar.mo114072b(), bVar.mo114074d()}));
        C11289a<C11079d2> c = bVar.mo114073c();
        if (c != null) {
            materialButton = getBinding().f92784k;
            materialButton.setVisibility(0);
            materialButton.setIcon(materialButton.getContext().getDrawable(C36896b.C36904h.ds_ic_download));
            materialButton.setText(materialButton.getContext().getString(C36896b.C36912p.hub_cart_full_button));
            materialButton.setOnClickListener(new C37415v(c));
        } else {
            materialButton = null;
        }
        if (materialButton == null) {
            getBinding().f92784k.setVisibility(8);
        }
        getBinding().f92783j.setVisibility(8);
        mo112887O(bVar.mo114075e());
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    /* renamed from: J */
    public final void mo112882J() {
        getBinding().f92783j.setImageDrawable(getContext().getDrawable(C36896b.C36904h.ds_ic_catalogs));
        getBinding().f92779f.setText(C36896b.C36912p.hub_catalog_item_title);
        getBinding().f92776c.setText(C36896b.C36912p.hub_catalog_item_description);
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    /* renamed from: K */
    public final void mo112883K(C37422x.C37426d dVar) {
        getBinding().f92783j.setImageDrawable(getContext().getDrawable(C36896b.C36904h.ds_ic_like_outline));
        getBinding().f92779f.setText(C36896b.C36912p.hub_favorite_item_title);
        getBinding().f92776c.setText(C36896b.C36912p.hub_favorite_item_description);
        getBinding().f92776c.setContentDescription(getContext().getString(C36896b.C36912p.accessibility_open_favorites_list_page));
        mo112887O(dVar.mo114077a());
    }

    /* renamed from: L */
    public final void mo112884L(@C12579k C37422x xVar) {
        Intrinsics.checkNotNullParameter(xVar, "itemContent");
        if (xVar instanceof C37422x.C37423a) {
            mo112880G((C37422x.C37423a) xVar);
        } else if (xVar instanceof C37422x.C37425c) {
            mo112882J();
        } else if (xVar instanceof C37422x.C37424b) {
            mo112881H((C37422x.C37424b) xVar);
        } else if (xVar instanceof C37422x.C37426d) {
            mo112883K((C37422x.C37426d) xVar);
        } else if (xVar instanceof C37422x.C37427e) {
            mo112885M();
        } else if (xVar instanceof C37422x.C37428f) {
            mo112886N((C37422x.C37428f) xVar);
        }
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    /* renamed from: M */
    public final void mo112885M() {
        getBinding().f92783j.setImageDrawable(getContext().getDrawable(C36896b.C36904h.ds_ic_lists));
        getBinding().f92779f.setText(C36896b.C36912p.hub_memo_item_title);
        getBinding().f92776c.setText(C36896b.C36912p.hub_memo_item_description);
        getBinding().f92776c.setContentDescription(getContext().getString(C36896b.C36912p.accessibility_open_memos_page));
        getBinding().f92778e.setContent(C8553b.m31049c(-478955978, true, new HubProductComponent$bindMemoList$1(this)));
    }

    /* renamed from: N */
    public final void mo112886N(C37422x.C37428f fVar) {
        getBinding().f92776c.setText(getContext().getResources().getQuantityString(C36896b.C36910n.hub_missing_products_description, fVar.mo114079b(), new Object[]{Integer.valueOf(fVar.mo114079b())}));
        getBinding().f92779f.setVisibility(8);
        getBinding().f92780g.setVisibility(8);
        getBinding().f92783j.setVisibility(8);
        mo112887O(fVar.mo114078a());
    }

    /* renamed from: O */
    public final void mo112887O(List<C37409t> list) {
        int i;
        RecyclerView recyclerView = getBinding().f92777d;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.hubProductList");
        if (!list.isEmpty()) {
            i = 0;
        } else {
            i = 8;
        }
        recyclerView.setVisibility(i);
        getBinding().f92777d.setAdapter(new C37191a(list));
    }

    /* renamed from: P */
    public final void mo112888P() {
        getBinding().f92775b.setOnClickListener(new C37412u(this));
    }

    @C12580l
    public final C11289a<C11079d2> getOnClickListener() {
        return this.f93056T0;
    }

    public final void setOnClickListener(@C12580l C11289a<C11079d2> aVar) {
        this.f93056T0 = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public HubProductComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HubProductComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public HubProductComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f93057U0 = C10864b0.m38748c(new HubProductComponent$binding$2(context, this));
        setBackgroundResource(C36896b.C36904h.background_default_ripple);
        setClickable(true);
        mo112888P();
    }
}

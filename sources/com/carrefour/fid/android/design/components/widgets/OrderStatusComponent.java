package com.carrefour.fid.android.design.components.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.C17318d;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.databinding.C37044f0;
import com.google.android.material.button.MaterialButton;
import com.urbanairship.iam.events.C9175a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.C10864b0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11719b3;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C11768d1;
import kotlinx.coroutines.C11968h2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u000345\u000fB'\b\u0007\u0012\u0006\u0010-\u001a\u00020,\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.\u0012\b\b\u0002\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\u0007\u001a\u00020\u0005H\u0014J\b\u0010\b\u001a\u00020\u0005H\u0002J\u001a\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002R\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R*\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00148\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00148\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR*\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00148\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR*\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00148\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b$\u0010\u0018\"\u0004\b%\u0010\u001aR\u001b\u0010+\u001a\u00020'8BX\u0002¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*¨\u00066"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/OrderStatusComponent;", "Landroid/widget/FrameLayout;", "Lkotlinx/coroutines/o0;", "Lcom/carrefour/fid/android/design/components/widgets/OrderStatusComponent$a;", "uiViewModel", "Lkotlin/d2;", "e", "onDetachedFromWindow", "h", "", "isDelivery", "Lcom/carrefour/fid/android/design/components/widgets/OrderStatusComponent$OngoingOrderStatus;", "currentStep", "f", "Lkotlin/coroutines/CoroutineContext;", "a", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlin/Function0;", "b", "Lkotlin/jvm/functions/a;", "getOnWithdrawalClickListener", "()Lkotlin/jvm/functions/a;", "setOnWithdrawalClickListener", "(Lkotlin/jvm/functions/a;)V", "onWithdrawalClickListener", "c", "getOnItineraryClickListener", "setOnItineraryClickListener", "onItineraryClickListener", "d", "getOnItemClickListener", "setOnItemClickListener", "onItemClickListener", "getOnAdditionalOrderClickListener", "setOnAdditionalOrderClickListener", "onAdditionalOrderClickListener", "Lcom/carrefour/fid/android/design/components/databinding/f0;", "Lkotlin/z;", "getBinding", "()Lcom/carrefour/fid/android/design/components/databinding/f0;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "AdditionOrderStatus", "OngoingOrderStatus", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nOrderStatusComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderStatusComponent.kt\ncom/carrefour/fid/android/design/components/widgets/OrderStatusComponent\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,165:1\n262#2,2:166\n262#2,2:168\n766#3:170\n857#3,2:171\n*S KotlinDebug\n*F\n+ 1 OrderStatusComponent.kt\ncom/carrefour/fid/android/design/components/widgets/OrderStatusComponent\n*L\n106#1:166,2\n109#1:168,2\n120#1:170\n120#1:171,2\n*E\n"})
public final class OrderStatusComponent extends FrameLayout implements C12074o0 {

    /* renamed from: g */
    public static final int f93111g = 8;
    @C12579k

    /* renamed from: a */
    public final CoroutineContext f93112a;
    @C12580l

    /* renamed from: b */
    public C11289a<C11079d2> f93113b;
    @C12580l

    /* renamed from: c */
    public C11289a<C11079d2> f93114c;
    @C12580l

    /* renamed from: d */
    public C11289a<C11079d2> f93115d;
    @C12580l

    /* renamed from: e */
    public C11289a<C11079d2> f93116e;
    @C12579k

    /* renamed from: f */
    public final C11677z f93117f;

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/OrderStatusComponent$AdditionOrderStatus;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public enum AdditionOrderStatus {
        IS_ELIGIBLE,
        COMPLETE,
        NONE
    }

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/OrderStatusComponent$OngoingOrderStatus;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public enum OngoingOrderStatus {
        VALIDATED,
        BEING_PROCESSED,
        PROCESSED,
        INVOICED
    }

    /* renamed from: com.carrefour.fid.android.design.components.widgets.OrderStatusComponent$b */
    public /* synthetic */ class C37159b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                com.carrefour.fid.android.design.components.widgets.OrderStatusComponent$OngoingOrderStatus[] r0 = com.carrefour.fid.android.design.components.widgets.OrderStatusComponent.OngoingOrderStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.design.components.widgets.OrderStatusComponent$OngoingOrderStatus r1 = com.carrefour.fid.android.design.components.widgets.OrderStatusComponent.OngoingOrderStatus.VALIDATED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.design.components.widgets.OrderStatusComponent$OngoingOrderStatus r1 = com.carrefour.fid.android.design.components.widgets.OrderStatusComponent.OngoingOrderStatus.BEING_PROCESSED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.design.components.widgets.OrderStatusComponent$OngoingOrderStatus r1 = com.carrefour.fid.android.design.components.widgets.OrderStatusComponent.OngoingOrderStatus.PROCESSED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.carrefour.fid.android.design.components.widgets.OrderStatusComponent$OngoingOrderStatus r1 = com.carrefour.fid.android.design.components.widgets.OrderStatusComponent.OngoingOrderStatus.INVOICED     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.OrderStatusComponent.C37159b.<clinit>():void");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public OrderStatusComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    private final C37044f0 getBinding() {
        return (C37044f0) this.f93117f.getValue();
    }

    /* renamed from: i */
    public static final void m152442i(OrderStatusComponent orderStatusComponent, View view) {
        Intrinsics.checkNotNullParameter(orderStatusComponent, "this$0");
        C11289a<C11079d2> aVar = orderStatusComponent.f93113b;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: j */
    public static final void m152443j(OrderStatusComponent orderStatusComponent, View view) {
        Intrinsics.checkNotNullParameter(orderStatusComponent, "this$0");
        C11289a<C11079d2> aVar = orderStatusComponent.f93114c;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: k */
    public static final void m152444k(OrderStatusComponent orderStatusComponent, View view) {
        Intrinsics.checkNotNullParameter(orderStatusComponent, "this$0");
        C11289a<C11079d2> aVar = orderStatusComponent.f93115d;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: l */
    public static final void m152445l(OrderStatusComponent orderStatusComponent, View view) {
        Intrinsics.checkNotNullParameter(orderStatusComponent, "this$0");
        C11289a<C11079d2> aVar = orderStatusComponent.f93116e;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: e */
    public final void mo112975e(@C12579k C37158a aVar) {
        int i;
        boolean z;
        int i2;
        Intrinsics.checkNotNullParameter(aVar, "uiViewModel");
        boolean z2 = true;
        int i3 = 0;
        getBinding().f92643m.setText(getContext().getString(C36896b.C36912p.order_title_number, new Object[]{aVar.mo112999l()}));
        getBinding().f92642l.setText(aVar.mo112998k());
        if (aVar.mo113000m()) {
            getBinding().f92638h.setVisibility(8);
            getBinding().f92639i.setVisibility(8);
            getBinding().f92645o.setVisibility(8);
            getBinding().f92644n.setTextColor(C17318d.m79723f(getContext(), C36896b.C36902f.ds_red_1));
            getBinding().f92644n.setText(C36896b.C36912p.order_status_cancelled);
            return;
        }
        mo112976f(aVar.mo113001n(), aVar.mo112997j());
        MaterialButton materialButton = getBinding().f92645o;
        if (aVar.mo113001n() || !(aVar.mo112997j() == OngoingOrderStatus.VALIDATED || aVar.mo112997j() == OngoingOrderStatus.BEING_PROCESSED)) {
            i = 8;
        } else {
            i = 0;
        }
        materialButton.setVisibility(i);
        if (aVar.mo113001n()) {
            getBinding().f92637g.setVisibility(8);
        }
        MaterialButton materialButton2 = getBinding().f92632b;
        Intrinsics.checkNotNullExpressionValue(materialButton2, "binding.additionalOrderButton");
        if (aVar.mo112996i() == AdditionOrderStatus.IS_ELIGIBLE) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        materialButton2.setVisibility(i2);
        Group group = getBinding().f92633c;
        Intrinsics.checkNotNullExpressionValue(group, "binding.additionalOrderInfo");
        if (aVar.mo112996i() != AdditionOrderStatus.COMPLETE) {
            z2 = false;
        }
        if (!z2) {
            i3 = 8;
        }
        group.setVisibility(i3);
        invalidate();
        requestLayout();
    }

    /* renamed from: f */
    public final void mo112976f(boolean z, OngoingOrderStatus ongoingOrderStatus) {
        int i;
        String str;
        boolean z2;
        List kz = ArraysKt___ArraysKt.m39955kz(OngoingOrderStatus.values());
        if (!z) {
            ArrayList arrayList = new ArrayList();
            for (Object next : kz) {
                if (((OngoingOrderStatus) next) != OngoingOrderStatus.PROCESSED) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(next);
                }
            }
            kz = arrayList;
        }
        int size = kz.size() - 1;
        int Y2 = CollectionsKt___CollectionsKt.m40594Y2(kz, ongoingOrderStatus);
        AppCompatSeekBar appCompatSeekBar = getBinding().f92638h;
        appCompatSeekBar.setEnabled(false);
        appCompatSeekBar.setMax(size);
        C11723c2 unused = C12038j.m48061f(this, (CoroutineContext) null, (CoroutineStart) null, new OrderStatusComponent$bindOrderSeekBarAndTitle$1$1(appCompatSeekBar, Y2, (C11045c<? super OrderStatusComponent$bindOrderSeekBarAndTitle$1$1>) null), 3, (Object) null);
        AppCompatSeekBar appCompatSeekBar2 = getBinding().f92639i;
        appCompatSeekBar2.setEnabled(false);
        appCompatSeekBar2.setMax(size);
        C11723c2 unused2 = C12038j.m48061f(this, (CoroutineContext) null, (CoroutineStart) null, new OrderStatusComponent$bindOrderSeekBarAndTitle$2$1(appCompatSeekBar2, Y2, (C11045c<? super OrderStatusComponent$bindOrderSeekBarAndTitle$2$1>) null), 3, (Object) null);
        if (ongoingOrderStatus == OngoingOrderStatus.INVOICED) {
            getBinding().f92644n.setVisibility(8);
        }
        if (ongoingOrderStatus == null) {
            i = -1;
        } else {
            i = C37159b.$EnumSwitchMapping$0[ongoingOrderStatus.ordinal()];
        }
        if (i == 1) {
            str = getContext().getString(C36896b.C36912p.order_status_validated);
        } else if (i == 2) {
            str = getContext().getString(C36896b.C36912p.order_status_being_processed);
        } else if (i == 3) {
            str = getContext().getString(C36896b.C36912p.order_status_being_shipped);
        } else if (i != 4) {
            str = new String();
        } else {
            str = getContext().getString(C36896b.C36912p.order_status_invoiced);
        }
        Intrinsics.checkNotNullExpressionValue(str, "when (currentStep) {\n   …lse -> String()\n        }");
        getBinding().f92644n.setTextColor(C17318d.m79723f(getContext(), C36896b.C36902f.ds_primary_alternative));
        getBinding().f92644n.setText(str);
    }

    @C12579k
    public CoroutineContext getCoroutineContext() {
        return this.f93112a;
    }

    @C12580l
    public final C11289a<C11079d2> getOnAdditionalOrderClickListener() {
        return this.f93116e;
    }

    @C12580l
    public final C11289a<C11079d2> getOnItemClickListener() {
        return this.f93115d;
    }

    @C12580l
    public final C11289a<C11079d2> getOnItineraryClickListener() {
        return this.f93114c;
    }

    @C12580l
    public final C11289a<C11079d2> getOnWithdrawalClickListener() {
        return this.f93113b;
    }

    /* renamed from: h */
    public final void mo112981h() {
        C37044f0 binding = getBinding();
        binding.f92645o.setOnClickListener(new C37253k0(this));
        binding.f92637g.setOnClickListener(new C37256l0(this));
        binding.f92640j.setOnClickListener(new C37281m0(this));
        binding.f92632b.setOnClickListener(new C37284n0(this));
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C11968h2.m47689i(getCoroutineContext(), (CancellationException) null, 1, (Object) null);
    }

    public final void setOnAdditionalOrderClickListener(@C12580l C11289a<C11079d2> aVar) {
        this.f93116e = aVar;
    }

    public final void setOnItemClickListener(@C12580l C11289a<C11079d2> aVar) {
        this.f93115d = aVar;
    }

    public final void setOnItineraryClickListener(@C12580l C11289a<C11079d2> aVar) {
        this.f93114c = aVar;
    }

    public final void setOnWithdrawalClickListener(@C12580l C11289a<C11079d2> aVar) {
        this.f93113b = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public OrderStatusComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OrderStatusComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public OrderStatusComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f93112a = C11719b3.m46155c((C11723c2) null, 1, (Object) null).mo7443Q(C11768d1.m46783e());
        this.f93117f = C10864b0.m38748c(new OrderStatusComponent$binding$2(context, this));
        mo112981h();
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.widgets.OrderStatusComponent$a */
    public static final class C37158a {

        /* renamed from: g */
        public static final int f93127g = 0;
        @C12579k

        /* renamed from: a */
        public final String f93128a;
        @C12579k

        /* renamed from: b */
        public final String f93129b;

        /* renamed from: c */
        public final boolean f93130c;
        @C12580l

        /* renamed from: d */
        public final OngoingOrderStatus f93131d;
        @C12579k

        /* renamed from: e */
        public final AdditionOrderStatus f93132e;

        /* renamed from: f */
        public final boolean f93133f;

        public C37158a(@C12579k String str, @C12579k String str2, boolean z, @C12580l OngoingOrderStatus ongoingOrderStatus, @C12579k AdditionOrderStatus additionOrderStatus, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "orderNumber");
            Intrinsics.checkNotNullParameter(str2, "orderAddressAndDetails");
            Intrinsics.checkNotNullParameter(additionOrderStatus, "additionOrderStatus");
            this.f93128a = str;
            this.f93129b = str2;
            this.f93130c = z;
            this.f93131d = ongoingOrderStatus;
            this.f93132e = additionOrderStatus;
            this.f93133f = z2;
        }

        /* renamed from: h */
        public static /* synthetic */ C37158a m152451h(C37158a aVar, String str, String str2, boolean z, OngoingOrderStatus ongoingOrderStatus, AdditionOrderStatus additionOrderStatus, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f93128a;
            }
            if ((i & 2) != 0) {
                str2 = aVar.f93129b;
            }
            String str3 = str2;
            if ((i & 4) != 0) {
                z = aVar.f93130c;
            }
            boolean z3 = z;
            if ((i & 8) != 0) {
                ongoingOrderStatus = aVar.f93131d;
            }
            OngoingOrderStatus ongoingOrderStatus2 = ongoingOrderStatus;
            if ((i & 16) != 0) {
                additionOrderStatus = aVar.f93132e;
            }
            AdditionOrderStatus additionOrderStatus2 = additionOrderStatus;
            if ((i & 32) != 0) {
                z2 = aVar.f93133f;
            }
            return aVar.mo112994g(str, str3, z3, ongoingOrderStatus2, additionOrderStatus2, z2);
        }

        @C12579k
        /* renamed from: a */
        public final String mo112987a() {
            return this.f93128a;
        }

        @C12579k
        /* renamed from: b */
        public final String mo112988b() {
            return this.f93129b;
        }

        /* renamed from: c */
        public final boolean mo112989c() {
            return this.f93130c;
        }

        @C12580l
        /* renamed from: d */
        public final OngoingOrderStatus mo112990d() {
            return this.f93131d;
        }

        @C12579k
        /* renamed from: e */
        public final AdditionOrderStatus mo112991e() {
            return this.f93132e;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37158a)) {
                return false;
            }
            C37158a aVar = (C37158a) obj;
            return Intrinsics.areEqual((Object) this.f93128a, (Object) aVar.f93128a) && Intrinsics.areEqual((Object) this.f93129b, (Object) aVar.f93129b) && this.f93130c == aVar.f93130c && this.f93131d == aVar.f93131d && this.f93132e == aVar.f93132e && this.f93133f == aVar.f93133f;
        }

        /* renamed from: f */
        public final boolean mo112993f() {
            return this.f93133f;
        }

        @C12579k
        /* renamed from: g */
        public final C37158a mo112994g(@C12579k String str, @C12579k String str2, boolean z, @C12580l OngoingOrderStatus ongoingOrderStatus, @C12579k AdditionOrderStatus additionOrderStatus, boolean z2) {
            Intrinsics.checkNotNullParameter(str, "orderNumber");
            Intrinsics.checkNotNullParameter(str2, "orderAddressAndDetails");
            Intrinsics.checkNotNullParameter(additionOrderStatus, "additionOrderStatus");
            return new C37158a(str, str2, z, ongoingOrderStatus, additionOrderStatus, z2);
        }

        public int hashCode() {
            int hashCode = ((this.f93128a.hashCode() * 31) + this.f93129b.hashCode()) * 31;
            boolean z = this.f93130c;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            OngoingOrderStatus ongoingOrderStatus = this.f93131d;
            int hashCode2 = (((i + (ongoingOrderStatus == null ? 0 : ongoingOrderStatus.hashCode())) * 31) + this.f93132e.hashCode()) * 31;
            boolean z3 = this.f93133f;
            if (!z3) {
                z2 = z3;
            }
            return hashCode2 + (z2 ? 1 : 0);
        }

        @C12579k
        /* renamed from: i */
        public final AdditionOrderStatus mo112996i() {
            return this.f93132e;
        }

        @C12580l
        /* renamed from: j */
        public final OngoingOrderStatus mo112997j() {
            return this.f93131d;
        }

        @C12579k
        /* renamed from: k */
        public final String mo112998k() {
            return this.f93129b;
        }

        @C12579k
        /* renamed from: l */
        public final String mo112999l() {
            return this.f93128a;
        }

        /* renamed from: m */
        public final boolean mo113000m() {
            return this.f93133f;
        }

        /* renamed from: n */
        public final boolean mo113001n() {
            return this.f93130c;
        }

        @C12579k
        public String toString() {
            String str = this.f93128a;
            String str2 = this.f93129b;
            boolean z = this.f93130c;
            OngoingOrderStatus ongoingOrderStatus = this.f93131d;
            AdditionOrderStatus additionOrderStatus = this.f93132e;
            boolean z2 = this.f93133f;
            return "OrderStatusUIViewModel(orderNumber=" + str + ", orderAddressAndDetails=" + str2 + ", isDelivery=" + z + ", onGoingStatus=" + ongoingOrderStatus + ", additionOrderStatus=" + additionOrderStatus + ", isCancelled=" + z2 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C37158a(String str, String str2, boolean z, OngoingOrderStatus ongoingOrderStatus, AdditionOrderStatus additionOrderStatus, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, z, (i & 8) != 0 ? OngoingOrderStatus.VALIDATED : ongoingOrderStatus, (i & 16) != 0 ? AdditionOrderStatus.NONE : additionOrderStatus, (i & 32) != 0 ? false : z2);
        }
    }
}

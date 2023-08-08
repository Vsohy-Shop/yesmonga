package com.carrefour.fid.android.design.components.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.carrefour.fid.android.design.components.databinding.C37035c0;
import com.carrefour.fid.android.design.components.widgets.MessageComponent;
import com.carrefour.fid.android.design.components.widgets.viewpager.MessagePagerAdapter;
import com.google.android.material.tabs.TabLayout;
import com.urbanairship.iam.events.C9175a;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010%\u001a\u00020$\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\b\b\u0002\u0010(\u001a\u00020\b¢\u0006\u0004\b)\u0010*J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R*\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\u0014\u0010#\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006+"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/MessagePagerComponent;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "Lcom/carrefour/fid/android/design/components/widgets/MessageComponent$a;", "messagesViewModels", "Lkotlin/d2;", "u", "Lkotlin/Function1;", "", "a", "Lkotlin/jvm/functions/l;", "getOnTabIndexSelected", "()Lkotlin/jvm/functions/l;", "setOnTabIndexSelected", "(Lkotlin/jvm/functions/l;)V", "onTabIndexSelected", "Lkotlin/Function0;", "b", "Lkotlin/jvm/functions/a;", "getOnPrimaryClick", "()Lkotlin/jvm/functions/a;", "setOnPrimaryClick", "(Lkotlin/jvm/functions/a;)V", "onPrimaryClick", "c", "getOnSecondaryClick", "setOnSecondaryClick", "onSecondaryClick", "d", "getOnThirdClick", "setOnThirdClick", "onThirdClick", "Lcom/carrefour/fid/android/design/components/databinding/c0;", "e", "Lcom/carrefour/fid/android/design/components/databinding/c0;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nMessagePagerComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessagePagerComponent.kt\ncom/carrefour/fid/android/design/components/widgets/MessagePagerComponent\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,67:1\n262#2,2:68\n*S KotlinDebug\n*F\n+ 1 MessagePagerComponent.kt\ncom/carrefour/fid/android/design/components/widgets/MessagePagerComponent\n*L\n51#1:68,2\n*E\n"})
public final class MessagePagerComponent extends ConstraintLayout {

    /* renamed from: f */
    public static final int f93082f = 8;
    @C12580l

    /* renamed from: a */
    public C11300l<? super Integer, C11079d2> f93083a;
    @C12580l

    /* renamed from: b */
    public C11289a<C11079d2> f93084b;
    @C12580l

    /* renamed from: c */
    public C11289a<C11079d2> f93085c;
    @C12580l

    /* renamed from: d */
    public C11289a<C11079d2> f93086d;
    @C12579k

    /* renamed from: e */
    public final C37035c0 f93087e;

    /* renamed from: com.carrefour.fid.android.design.components.widgets.MessagePagerComponent$a */
    public static final class C37155a implements TabLayout.C31610f {

        /* renamed from: a */
        public final /* synthetic */ MessagePagerComponent f93088a;

        public C37155a(MessagePagerComponent messagePagerComponent) {
            this.f93088a = messagePagerComponent;
        }

        /* renamed from: a */
        public void mo67964a(@C12579k TabLayout.C31615i iVar) {
            Intrinsics.checkNotNullParameter(iVar, "tab");
            C11300l<Integer, C11079d2> onTabIndexSelected = this.f93088a.getOnTabIndexSelected();
            if (onTabIndexSelected != null) {
                onTabIndexSelected.invoke(Integer.valueOf(iVar.mo91427k()));
            }
        }

        /* renamed from: b */
        public void mo67965b(@C12579k TabLayout.C31615i iVar) {
            Intrinsics.checkNotNullParameter(iVar, "tab");
        }

        /* renamed from: c */
        public void mo67966c(@C12579k TabLayout.C31615i iVar) {
            Intrinsics.checkNotNullParameter(iVar, "tab");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public MessagePagerComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    @C12580l
    public final C11289a<C11079d2> getOnPrimaryClick() {
        return this.f93084b;
    }

    @C12580l
    public final C11289a<C11079d2> getOnSecondaryClick() {
        return this.f93085c;
    }

    @C12580l
    public final C11300l<Integer, C11079d2> getOnTabIndexSelected() {
        return this.f93083a;
    }

    @C12580l
    public final C11289a<C11079d2> getOnThirdClick() {
        return this.f93086d;
    }

    public final void setOnPrimaryClick(@C12580l C11289a<C11079d2> aVar) {
        this.f93084b = aVar;
    }

    public final void setOnSecondaryClick(@C12580l C11289a<C11079d2> aVar) {
        this.f93085c = aVar;
    }

    public final void setOnTabIndexSelected(@C12580l C11300l<? super Integer, C11079d2> lVar) {
        this.f93083a = lVar;
    }

    public final void setOnThirdClick(@C12580l C11289a<C11079d2> aVar) {
        this.f93086d = aVar;
    }

    /* renamed from: u */
    public final void mo112940u(@C12579k List<MessageComponent.C37154a> list) {
        Intrinsics.checkNotNullParameter(list, "messagesViewModels");
        MessagePagerAdapter messagePagerAdapter = new MessagePagerAdapter(list);
        ViewPager2 viewPager2 = this.f93087e.f92585c;
        if (viewPager2.getAdapter() == null) {
            viewPager2.setAdapter(messagePagerAdapter);
        } else {
            RecyclerView.Adapter adapter = viewPager2.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
        }
        messagePagerAdapter.mo114064p(new MessagePagerComponent$bind$2(this));
        messagePagerAdapter.mo114065q(new MessagePagerComponent$bind$3(this));
        messagePagerAdapter.mo114066r(new MessagePagerComponent$bind$4(this));
        TabLayout tabLayout = this.f93087e.f92584b;
        Intrinsics.checkNotNullExpressionValue(tabLayout, "binding.messageTabLayout");
        int i = 0;
        boolean z = true;
        if (messagePagerAdapter.getItemCount() <= 1) {
            z = false;
        }
        if (!z) {
            i = 8;
        }
        tabLayout.setVisibility(i);
        TabLayout tabLayout2 = this.f93087e.f92584b;
        Intrinsics.checkNotNullExpressionValue(tabLayout2, "binding.messageTabLayout");
        C37234g0.m152858b(tabLayout2, this.f93087e.f92585c, messagePagerAdapter.getItemCount());
        this.f93087e.f92584b.mo91298d(new C37155a(this));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public MessagePagerComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MessagePagerComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public MessagePagerComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C37035c0 d = C37035c0.m151947d(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(d, "inflate(\n        LayoutI… this,\n        true\n    )");
        this.f93087e = d;
    }
}

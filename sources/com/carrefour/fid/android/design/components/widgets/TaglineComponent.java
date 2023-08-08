package com.carrefour.fid.android.design.components.widgets;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.content.C17318d;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.carrefour.fid.android.design.components.C36896b;
import com.google.android.gms.common.internal.C40852x;
import com.google.android.material.tabs.C31624d;
import com.google.android.material.tabs.TabLayout;
import com.urbanairship.iam.events.C9175a;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000_\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\b\b*\u00010\b\u0007\u0018\u00002\u00020\u0001:\u00016B'\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0005¢\u0006\u0004\b4\u00105J\b\u0010\u0003\u001a\u00020\u0002H\u0016J)\u0010\u000b\u001a\u00020\t2!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004J&\u0010\u0012\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fJ\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0017\u001a\u00020\tH\u0002J\b\u0010\u0018\u001a\u00020\tH\u0002J\b\u0010\u0019\u001a\u00020\tH\u0002J\b\u0010\u001a\u001a\u00020\tH\u0002J\"\u0010 \u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001f\u001a\u00020\u0005H\u0002R\"\u0010'\u001a\u00020!8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X.¢\u0006\u0006\n\u0004\b(\u0010)R0\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0014\u00103\u001a\u0002008\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00067"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/TaglineComponent;", "Lcom/google/android/material/tabs/TabLayout;", "Lcom/google/android/material/tabs/TabLayout$i;", "E", "Lkotlin/Function1;", "", "Lkotlin/n0;", "name", "position", "Lkotlin/d2;", "listener", "setTabSelectedPositionListener", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "size", "", "", "tabTitles", "setupWithViewPager2", "Lcom/carrefour/fid/android/design/components/widgets/TaglineComponent$TaglineStyle;", "style", "X", "d0", "a0", "Z", "c0", "b0", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "W", "", "I1", "getTriggerListener", "()Z", "setTriggerListener", "(Z)V", "triggerListener", "J1", "Lcom/carrefour/fid/android/design/components/widgets/TaglineComponent$TaglineStyle;", "K1", "Lkotlin/jvm/functions/l;", "getListener", "()Lkotlin/jvm/functions/l;", "setListener", "(Lkotlin/jvm/functions/l;)V", "com/carrefour/fid/android/design/components/widgets/TaglineComponent$b", "L1", "Lcom/carrefour/fid/android/design/components/widgets/TaglineComponent$b;", "tabSelectedListener", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "TaglineStyle", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class TaglineComponent extends TabLayout {

    /* renamed from: M1 */
    public static final int f93266M1 = 8;

    /* renamed from: I1 */
    public boolean f93267I1;

    /* renamed from: J1 */
    public TaglineStyle f93268J1;
    @C12580l

    /* renamed from: K1 */
    public C11300l<? super Integer, C11079d2> f93269K1;
    @C12579k

    /* renamed from: L1 */
    public final C37184b f93270L1;

    @C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/TaglineComponent$TaglineStyle;", "", "", "r", "", "style", "I", "q", "()I", "<init>", "(Ljava/lang/String;II)V", "a", "b", "c", "d", "e", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public enum TaglineStyle {
        PRIMARY_BACKGROUND_ON(0),
        PRIMARY_BACKGROUND_OFF(1),
        SECONDARY_BACKGROUND_ON(2),
        SECONDARY_BACKGROUND_OFF(3);
        
        @C12579k

        /* renamed from: a */
        public static final C37182a f93271a = null;
        private final int style;

        @C11363r0({"SMAP\nTaglineComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaglineComponent.kt\ncom/carrefour/fid/android/design/components/widgets/TaglineComponent$TaglineStyle$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"})
        /* renamed from: com.carrefour.fid.android.design.components.widgets.TaglineComponent$TaglineStyle$a */
        public static final class C37182a {
            public /* synthetic */ C37182a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C12579k
            /* renamed from: a */
            public final TaglineStyle mo113254a(@C12580l Integer num) {
                TaglineStyle taglineStyle;
                boolean z;
                TaglineStyle[] values = TaglineStyle.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        taglineStyle = null;
                        break;
                    }
                    taglineStyle = values[i];
                    int q = taglineStyle.mo113252q();
                    if (num != null && q == num.intValue()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        break;
                    }
                    i++;
                }
                if (taglineStyle == null) {
                    return TaglineStyle.PRIMARY_BACKGROUND_OFF;
                }
                return taglineStyle;
            }

            public C37182a() {
            }
        }

        /* access modifiers changed from: public */
        static {
            f93271a = new C37182a((DefaultConstructorMarker) null);
        }

        /* access modifiers changed from: public */
        TaglineStyle(int i) {
            this.style = i;
        }

        /* renamed from: q */
        public final int mo113252q() {
            return this.style;
        }

        /* renamed from: r */
        public final boolean mo113253r() {
            return this == SECONDARY_BACKGROUND_ON || this == SECONDARY_BACKGROUND_OFF;
        }
    }

    /* renamed from: com.carrefour.fid.android.design.components.widgets.TaglineComponent$a */
    public /* synthetic */ class C37183a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                com.carrefour.fid.android.design.components.widgets.TaglineComponent$TaglineStyle[] r0 = com.carrefour.fid.android.design.components.widgets.TaglineComponent.TaglineStyle.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.design.components.widgets.TaglineComponent$TaglineStyle r1 = com.carrefour.fid.android.design.components.widgets.TaglineComponent.TaglineStyle.PRIMARY_BACKGROUND_ON     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.design.components.widgets.TaglineComponent$TaglineStyle r1 = com.carrefour.fid.android.design.components.widgets.TaglineComponent.TaglineStyle.PRIMARY_BACKGROUND_OFF     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.design.components.widgets.TaglineComponent$TaglineStyle r1 = com.carrefour.fid.android.design.components.widgets.TaglineComponent.TaglineStyle.SECONDARY_BACKGROUND_ON     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.carrefour.fid.android.design.components.widgets.TaglineComponent$TaglineStyle r1 = com.carrefour.fid.android.design.components.widgets.TaglineComponent.TaglineStyle.SECONDARY_BACKGROUND_OFF     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.TaglineComponent.C37183a.<clinit>():void");
        }
    }

    /* renamed from: com.carrefour.fid.android.design.components.widgets.TaglineComponent$b */
    public static final class C37184b implements TabLayout.C31610f {

        /* renamed from: a */
        public final /* synthetic */ TaglineComponent f93277a;

        /* renamed from: b */
        public final /* synthetic */ Context f93278b;

        public C37184b(TaglineComponent taglineComponent, Context context) {
            this.f93277a = taglineComponent;
            this.f93278b = context;
        }

        /* renamed from: a */
        public void mo67964a(@C12580l TabLayout.C31615i iVar) {
            C11300l<Integer, C11079d2> listener;
            int i;
            View g;
            if (!(iVar == null || (g = iVar.mo91423g()) == null)) {
                TaglineComponent taglineComponent = this.f93277a;
                Context context = this.f93278b;
                TaglineStyle V = taglineComponent.f93268J1;
                if (V == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("style");
                    V = null;
                }
                if (V.mo113253r() && (g instanceof TextView)) {
                    TextView textView = (TextView) g;
                    textView.setTextAppearance(C36896b.C36913q.ds_mixin_navigation_s_bold);
                    textView.setTextColor(C17318d.m79723f(context, C36896b.C36902f.ds_primary));
                }
            }
            if (this.f93277a.getTriggerListener() && (listener = this.f93277a.getListener()) != null) {
                if (iVar != null) {
                    i = iVar.mo91427k();
                } else {
                    i = -1;
                }
                listener.invoke(Integer.valueOf(i));
            }
        }

        /* renamed from: b */
        public void mo67965b(@C12580l TabLayout.C31615i iVar) {
            View g;
            if (iVar != null && (g = iVar.mo91423g()) != null) {
                TaglineComponent taglineComponent = this.f93277a;
                Context context = this.f93278b;
                TaglineStyle V = taglineComponent.f93268J1;
                if (V == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("style");
                    V = null;
                }
                if (V.mo113253r() && (g instanceof TextView)) {
                    TextView textView = (TextView) g;
                    textView.setTextAppearance(C36896b.C36913q.ds_body_s);
                    textView.setTextColor(C17318d.m79723f(context, C36896b.C36902f.ds_grey_5));
                }
            }
        }

        /* renamed from: c */
        public void mo67966c(@C12580l TabLayout.C31615i iVar) {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public TaglineComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: Y */
    public static final void m152695Y(List list, TabLayout.C31615i iVar, int i) {
        Intrinsics.checkNotNullParameter(list, "$tabTitles");
        Intrinsics.checkNotNullParameter(iVar, "tab");
        iVar.mo91419D((CharSequence) list.get(i));
    }

    @C12579k
    /* renamed from: E */
    public TabLayout.C31615i mo91277E() {
        TabLayout.C31615i E = super.mo91277E();
        TaglineStyle taglineStyle = this.f93268J1;
        if (taglineStyle == null) {
            Intrinsics.throwUninitializedPropertyAccessException("style");
            taglineStyle = null;
        }
        TabLayout.C31615i u = E.mo91437u(mo113240X(taglineStyle));
        Intrinsics.checkNotNullExpressionValue(u, "super.newTab().setCustom…w(getCustomLayout(style))");
        return u;
    }

    /* renamed from: W */
    public final void mo113239W(Context context, AttributeSet attributeSet, int i) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C36896b.C36914r.TaglineComponent, i, 0);
            try {
                this.f93268J1 = TaglineStyle.f93271a.mo113254a(Integer.valueOf(obtainStyledAttributes.getInteger(C36896b.C36914r.TaglineComponent_tagline_style, TaglineStyle.PRIMARY_BACKGROUND_ON.mo113252q())));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TaglineStyle taglineStyle = this.f93268J1;
        if (taglineStyle == null) {
            Intrinsics.throwUninitializedPropertyAccessException("style");
            taglineStyle = null;
        }
        mo113245d0(taglineStyle);
    }

    /* renamed from: X */
    public final int mo113240X(TaglineStyle taglineStyle) {
        int i = C37183a.$EnumSwitchMapping$0[taglineStyle.ordinal()];
        if (i == 1) {
            return C36896b.C36909m.ds_component_tagline_custom_view_primary_background_on;
        }
        if (i == 2) {
            return C36896b.C36909m.ds_component_tagline_custom_view_primary_background_off;
        }
        if (i == 3) {
            return C36896b.C36909m.ds_component_tagline_custom_view_secondary;
        }
        if (i == 4) {
            return C36896b.C36909m.ds_component_tagline_custom_view_secondary;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: Z */
    public final void mo113241Z() {
        setBackgroundColor(C17318d.m79723f(getContext(), C36896b.C36902f.ds_grey_80));
        setSelectedTabIndicatorColor(C17318d.m79723f(getContext(), C36896b.C36902f.ds_primary));
    }

    /* renamed from: a0 */
    public final void mo113242a0() {
        setBackgroundColor(C17318d.m79723f(getContext(), C36896b.C36902f.ds_primary));
        setSelectedTabIndicatorColor(C17318d.m79723f(getContext(), C36896b.C36902f.ds_grey_white));
    }

    /* renamed from: b0 */
    public final void mo113243b0() {
        setBackgroundColor(C17318d.m79723f(getContext(), C36896b.C36902f.ds_grey_80));
        setSelectedTabIndicator((Drawable) null);
        setTabRippleColor((ColorStateList) null);
    }

    /* renamed from: c0 */
    public final void mo113244c0() {
        setBackgroundColor(C17318d.m79723f(getContext(), C36896b.C36902f.ds_grey_white));
        setSelectedTabIndicator((Drawable) null);
        setTabRippleColor((ColorStateList) null);
    }

    /* renamed from: d0 */
    public final void mo113245d0(TaglineStyle taglineStyle) {
        int i = C37183a.$EnumSwitchMapping$0[taglineStyle.ordinal()];
        if (i == 1) {
            mo113242a0();
        } else if (i == 2) {
            mo113241Z();
        } else if (i == 3) {
            mo113244c0();
        } else if (i == 4) {
            mo113243b0();
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @C12580l
    public final C11300l<Integer, C11079d2> getListener() {
        return this.f93269K1;
    }

    public final boolean getTriggerListener() {
        return this.f93267I1;
    }

    public final void setListener(@C12580l C11300l<? super Integer, C11079d2> lVar) {
        this.f93269K1 = lVar;
    }

    public final void setTabSelectedPositionListener(@C12579k C11300l<? super Integer, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C40852x.C40853a.f103958a);
        this.f93269K1 = lVar;
    }

    public final void setTriggerListener(boolean z) {
        this.f93267I1 = z;
    }

    public final void setupWithViewPager2(@C12580l ViewPager2 viewPager2, int i, @C12579k List<? extends CharSequence> list) {
        RecyclerView.Adapter adapter;
        Intrinsics.checkNotNullParameter(list, "tabTitles");
        boolean z = false;
        if (!(viewPager2 == null || (adapter = viewPager2.getAdapter()) == null || i != adapter.getItemCount())) {
            z = true;
        }
        if (z) {
            new C31624d(this, viewPager2, new C37430x1(list)).mo91446a();
            return;
        }
        throw new Exception("The size of list and the tab count should be equal!");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public TaglineComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TaglineComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public TaglineComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f93267I1 = true;
        C37184b bVar = new C37184b(this, context);
        this.f93270L1 = bVar;
        setTabIndicatorFullWidth(false);
        setTabGravity(2);
        setTabMode(0);
        mo113239W(context, attributeSet, i);
        mo91298d(bVar);
    }
}

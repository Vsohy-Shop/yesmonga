package com.carrefour.fid.android.design.components.widgets;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.animation.OvershootInterpolator;
import androidx.annotation.C0358n;
import androidx.annotation.C0375v;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.C17465i;
import androidx.core.view.C18196h2;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.databinding.C37038d0;
import com.google.android.material.snackbar.C31598a;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u001a\u001fB'\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0010\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nJ\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\"\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u000eH\u0002R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006 "}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/NotificationComponent;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/google/android/material/snackbar/a;", "Lcom/carrefour/fid/android/design/components/widgets/NotificationComponent$Variant;", "variant", "Lkotlin/d2;", "y", "Lcom/carrefour/fid/android/design/components/widgets/NotificationComponent$a;", "model", "w", "Landroid/view/View$OnClickListener;", "clickListener", "setOnActionClickListener", "setOnCloseClickListener", "", "delay", "duration", "d", "f", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "x", "Lcom/carrefour/fid/android/design/components/databinding/d0;", "a", "Lcom/carrefour/fid/android/design/components/databinding/d0;", "binding", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Variant", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class NotificationComponent extends ConstraintLayout implements C31598a {

    /* renamed from: b */
    public static final int f93089b = 8;
    @C12579k

    /* renamed from: a */
    public final C37038d0 f93090a;

    @C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006j\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/NotificationComponent$Variant;", "", "", "icon", "I", "q", "()I", "titleColor", "w", "outlineColor", "r", "<init>", "(Ljava/lang/String;IIII)V", "a", "b", "c", "d", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public enum Variant {
        INFO(C36896b.C36904h.ds_gr_blue_info, C36896b.C36902f.ds_primary, C36896b.C36902f.ds_blue_light),
        SUCCESS(C36896b.C36904h.ds_gr_check, C36896b.C36902f.ds_green, C36896b.C36902f.ds_green_light),
        WARNING(C36896b.C36904h.ds_gr_warning, C36896b.C36902f.ds_orange, C36896b.C36902f.ds_orange_light),
        ERROR(C36896b.C36904h.ds_gr_red_error, C36896b.C36902f.ds_red_1, C36896b.C36902f.ds_red_light);
        
        private final int icon;
        private final int outlineColor;
        private final int titleColor;

        /* access modifiers changed from: public */
        Variant(@C0375v int i, @C0358n int i2, @C0358n int i3) {
            this.icon = i;
            this.titleColor = i2;
            this.outlineColor = i3;
        }

        /* renamed from: q */
        public final int mo112946q() {
            return this.icon;
        }

        /* renamed from: r */
        public final int mo112947r() {
            return this.outlineColor;
        }

        /* renamed from: w */
        public final int mo112948w() {
            return this.titleColor;
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.widgets.NotificationComponent$a */
    public static final class C37156a {

        /* renamed from: e */
        public static final int f93096e = 0;
        @C12579k

        /* renamed from: a */
        public final String f93097a;
        @C12580l

        /* renamed from: b */
        public final String f93098b;
        @C12580l

        /* renamed from: c */
        public final String f93099c;

        /* renamed from: d */
        public final boolean f93100d;

        public C37156a(@C12579k String str, @C12580l String str2, @C12580l String str3, boolean z) {
            Intrinsics.checkNotNullParameter(str, "title");
            this.f93097a = str;
            this.f93098b = str2;
            this.f93099c = str3;
            this.f93100d = z;
        }

        /* renamed from: f */
        public static /* synthetic */ C37156a m152416f(C37156a aVar, String str, String str2, String str3, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f93097a;
            }
            if ((i & 2) != 0) {
                str2 = aVar.f93098b;
            }
            if ((i & 4) != 0) {
                str3 = aVar.f93099c;
            }
            if ((i & 8) != 0) {
                z = aVar.f93100d;
            }
            return aVar.mo112953e(str, str2, str3, z);
        }

        @C12579k
        /* renamed from: a */
        public final String mo112949a() {
            return this.f93097a;
        }

        @C12580l
        /* renamed from: b */
        public final String mo112950b() {
            return this.f93098b;
        }

        @C12580l
        /* renamed from: c */
        public final String mo112951c() {
            return this.f93099c;
        }

        /* renamed from: d */
        public final boolean mo112952d() {
            return this.f93100d;
        }

        @C12579k
        /* renamed from: e */
        public final C37156a mo112953e(@C12579k String str, @C12580l String str2, @C12580l String str3, boolean z) {
            Intrinsics.checkNotNullParameter(str, "title");
            return new C37156a(str, str2, str3, z);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37156a)) {
                return false;
            }
            C37156a aVar = (C37156a) obj;
            return Intrinsics.areEqual((Object) this.f93097a, (Object) aVar.f93097a) && Intrinsics.areEqual((Object) this.f93098b, (Object) aVar.f93098b) && Intrinsics.areEqual((Object) this.f93099c, (Object) aVar.f93099c) && this.f93100d == aVar.f93100d;
        }

        @C12580l
        /* renamed from: g */
        public final String mo112955g() {
            return this.f93099c;
        }

        @C12580l
        /* renamed from: h */
        public final String mo112956h() {
            return this.f93098b;
        }

        public int hashCode() {
            int hashCode = this.f93097a.hashCode() * 31;
            String str = this.f93098b;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f93099c;
            if (str2 != null) {
                i = str2.hashCode();
            }
            int i2 = (hashCode2 + i) * 31;
            boolean z = this.f93100d;
            if (z) {
                z = true;
            }
            return i2 + (z ? 1 : 0);
        }

        @C12579k
        /* renamed from: i */
        public final String mo112958i() {
            return this.f93097a;
        }

        /* renamed from: j */
        public final boolean mo112959j() {
            return this.f93100d;
        }

        @C12579k
        public String toString() {
            String str = this.f93097a;
            String str2 = this.f93098b;
            String str3 = this.f93099c;
            boolean z = this.f93100d;
            return "UiModel(title=" + str + ", textContent=" + str2 + ", actionText=" + str3 + ", isCloseable=" + z + ")";
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public NotificationComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: A */
    public static final void m152403A(View.OnClickListener onClickListener, NotificationComponent notificationComponent, View view) {
        Intrinsics.checkNotNullParameter(onClickListener, "$clickListener");
        Intrinsics.checkNotNullParameter(notificationComponent, "this$0");
        onClickListener.onClick(notificationComponent);
    }

    /* renamed from: z */
    public static final void m152406z(View.OnClickListener onClickListener, NotificationComponent notificationComponent, View view) {
        Intrinsics.checkNotNullParameter(onClickListener, "$clickListener");
        Intrinsics.checkNotNullParameter(notificationComponent, "this$0");
        onClickListener.onClick(notificationComponent);
    }

    /* renamed from: d */
    public void mo91240d(int i, int i2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f93090a.f92603e, View.SCALE_X, new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f93090a.f92603e, View.SCALE_Y, new float[]{0.0f, 1.0f});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new OvershootInterpolator());
        animatorSet.setDuration(500);
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        animatorSet.start();
    }

    /* renamed from: f */
    public void mo91241f(int i, int i2) {
    }

    public final void setOnActionClickListener(@C12579k View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "clickListener");
        this.f93090a.f92601c.setOnClickListener(new C37237h0(onClickListener, this));
    }

    public final void setOnCloseClickListener(@C12579k View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "clickListener");
        this.f93090a.f92602d.setOnClickListener(new C37240i0(onClickListener, this));
    }

    /* renamed from: w */
    public final void mo112943w(@C12580l C37156a aVar) {
        C37038d0 d0Var = this.f93090a;
        if (aVar != null) {
            d0Var.f92605g.setText(aVar.mo112958i());
            if (aVar.mo112956h() != null) {
                d0Var.f92604f.setText(aVar.mo112956h());
                d0Var.f92604f.setVisibility(0);
            } else {
                d0Var.f92604f.setVisibility(8);
            }
            if (aVar.mo112959j()) {
                this.f93090a.f92602d.setVisibility(0);
                C18196h2.m82519N1(this, getResources().getDimension(C36896b.C36903g.ds_elevation));
            } else {
                this.f93090a.f92602d.setVisibility(8);
            }
            if (aVar.mo112955g() != null) {
                this.f93090a.f92601c.setVisibility(0);
                this.f93090a.f92601c.setText(aVar.mo112955g());
                return;
            }
            this.f93090a.f92601c.setVisibility(8);
            return;
        }
        d0Var.f92605g.setText(new String());
        d0Var.f92604f.setVisibility(8);
    }

    /* renamed from: x */
    public final void mo112944x(Context context, AttributeSet attributeSet, int i) {
        Variant variant;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C36896b.C36914r.NotificationComponent, i, 0);
            try {
                String string = obtainStyledAttributes.getString(C36896b.C36914r.NotificationComponent_title);
                if (string == null) {
                    string = "";
                }
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.styleable.No…ionComponent_title) ?: \"\"");
                String string2 = obtainStyledAttributes.getString(C36896b.C36914r.NotificationComponent_textContent);
                boolean z = obtainStyledAttributes.getBoolean(C36896b.C36914r.NotificationComponent_closeable, false);
                String string3 = obtainStyledAttributes.getString(C36896b.C36914r.NotificationComponent_action);
                int integer = obtainStyledAttributes.getInteger(C36896b.C36914r.NotificationComponent_variant, 0);
                if (integer == 0) {
                    variant = Variant.INFO;
                } else if (integer == 1) {
                    variant = Variant.SUCCESS;
                } else if (integer == 2) {
                    variant = Variant.WARNING;
                } else if (integer != 3) {
                    variant = Variant.INFO;
                } else {
                    variant = Variant.ERROR;
                }
                mo112945y(variant);
                mo112943w(new C37156a(string, string2, string3, z));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    /* renamed from: y */
    public final void mo112945y(@C12579k Variant variant) {
        Intrinsics.checkNotNullParameter(variant, "variant");
        Drawable g = C17465i.m80175g(getResources(), C36896b.C36904h.background_outline_foldable_info_box, getContext().getTheme());
        if (g != null) {
            Drawable g2 = C17465i.m80175g(getResources(), C36896b.C36904h.background_round_white_m, getContext().getTheme());
            int e = C17465i.m80173e(getResources(), variant.mo112947r(), getContext().getTheme());
            int e2 = C17465i.m80173e(getResources(), variant.mo112948w(), getContext().getTheme());
            g.setTint(e);
            setBackground(new LayerDrawable(new Drawable[]{g2, g}));
            this.f93090a.f92603e.setImageResource(variant.mo112946q());
            setOutlineProvider(ViewOutlineProvider.BACKGROUND);
            this.f93090a.f92605g.setTextColor(e2);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public NotificationComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NotificationComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public NotificationComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C37038d0 b = C37038d0.m151954b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(b, "inflate(LayoutInflater.from(context), this)");
        this.f93090a = b;
        mo112944x(context, attributeSet, i);
    }
}

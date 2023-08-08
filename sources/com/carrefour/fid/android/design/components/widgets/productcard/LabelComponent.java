package com.carrefour.fid.android.design.components.widgets.productcard;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.C0327c1;
import androidx.annotation.C0358n;
import androidx.annotation.C0364q;
import androidx.annotation.C0375v;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.C17465i;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.databinding.C37075s;
import com.carrefour.fid.android.design.components.utils.C37138e;
import com.google.android.datatransport.cct.C40045d;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.C11315i;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001b%B'\b\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\b\b\u0002\u0010\"\u001a\u00020\u0006¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0002J\u0012\u0010\n\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014J\b\u0010\u0017\u001a\u00020\u0004H\u0002J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0006H\u0002R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006&"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/productcard/LabelComponent;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "labelText", "Lkotlin/d2;", "setText", "", "textSize", "setTextSize", "styleRes", "setTextStyle", "labelSubtext", "setSubtext", "maxLines", "setMaxLines", "Lcom/carrefour/fid/android/design/components/widgets/productcard/LabelComponent$Variant;", "variant", "setVariant", "Lcom/carrefour/fid/android/design/components/widgets/productcard/LabelComponent$a;", "model", "", "isInBottomSheet", "w", "v", "index", "z", "Lcom/carrefour/fid/android/design/components/databinding/s;", "a", "Lcom/carrefour/fid/android/design/components/databinding/s;", "binding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Variant", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nLabelComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LabelComponent.kt\ncom/carrefour/fid/android/design/components/widgets/productcard/LabelComponent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,298:1\n1#2:299\n*E\n"})
public final class LabelComponent extends ConstraintLayout {

    /* renamed from: b */
    public static final int f93611b = 8;
    @C12579k

    /* renamed from: a */
    public final C37075s f93612a;

    @C11076d0(mo22515d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B?\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\b\u001a\u0004\b\u0011\u0010\nR\u0017\u0010\u0012\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000fj\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u0005j\u0002\b\u001ej\u0002\b\u0011j\u0002\b\u000e¨\u0006\u001f"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/productcard/LabelComponent$Variant;", "", "", "foregroundColor", "I", "w", "()I", "backgroundColor", "Ljava/lang/Integer;", "q", "()Ljava/lang/Integer;", "", "isBackgroundOutline", "Z", "z", "()Z", "leftIcon", "y", "disableLeftIconTint", "r", "<init>", "(Ljava/lang/String;IILjava/lang/Integer;ZLjava/lang/Integer;Z)V", "a", "b", "c", "d", "e", "f", "g", "v", "x", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public enum Variant {
        OFFER(r21, r4, false, Integer.valueOf(r23), false, 20, (boolean) null),
        MIXTURE(r14, Integer.valueOf(r22), false, Integer.valueOf(r23), false, 20, (boolean) null),
        COUPON_OFFER(r14, Integer.valueOf(r22), false, (Integer) null, false, 28, (boolean) null),
        COUPON_ENABLED(C36896b.C36902f.ds_green_dark, (int) null, false, Integer.valueOf(C36896b.C36904h.ds_gr_check), true, 6, (boolean) null),
        LOYALTY(r24, r15, false, Integer.valueOf(r26), false, 20, (boolean) null),
        LOYALTY_BONUS(r4, Integer.valueOf(r25), false, Integer.valueOf(C36896b.C36904h.ds_gr_organic_prime), true, 4, (boolean) null),
        UNAVAILABLE(C36896b.C36902f.ds_grey_20, Integer.valueOf(C36896b.C36902f.ds_grey_60), false, (Integer) null, true, 12, (boolean) null),
        OFFER_MINI(r21, Integer.valueOf(r22), false, Integer.valueOf(r23), false, 20, (boolean) null),
        LOYALTY_MINI(r4, Integer.valueOf(r25), false, Integer.valueOf(r26), false, 20, (boolean) null),
        COUPON_LOYALTY(r4, Integer.valueOf(r25), false, (Integer) null, false, 28, (boolean) null),
        PROMOTION_CHANNEL(C36896b.C36902f.ds_grey_10, (int) null, true, (Integer) null, false, 26, (boolean) null),
        CATALOG(r21, Integer.valueOf(r22), false, Integer.valueOf(C36896b.C36904h.ds_ic_catalogs), false, 20, (boolean) null);
        
        @C12580l
        private final Integer backgroundColor;
        private final boolean disableLeftIconTint;
        private final int foregroundColor;
        private final boolean isBackgroundOutline;
        @C12580l
        private final Integer leftIcon;

        /* access modifiers changed from: public */
        Variant(@C0358n int i, @C0358n Integer num, boolean z, @C0375v Integer num2, boolean z2) {
            this.foregroundColor = i;
            this.backgroundColor = num;
            this.isBackgroundOutline = z;
            this.leftIcon = num2;
            this.disableLeftIconTint = z2;
        }

        @C12580l
        /* renamed from: q */
        public final Integer mo113671q() {
            return this.backgroundColor;
        }

        /* renamed from: r */
        public final boolean mo113672r() {
            return this.disableLeftIconTint;
        }

        /* renamed from: w */
        public final int mo113673w() {
            return this.foregroundColor;
        }

        @C12580l
        /* renamed from: y */
        public final Integer mo113674y() {
            return this.leftIcon;
        }

        /* renamed from: z */
        public final boolean mo113675z() {
            return this.isBackgroundOutline;
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.LabelComponent$a */
    public static abstract class C37316a {

        /* renamed from: b */
        public static final int f93626b = 0;
        @C12579k

        /* renamed from: a */
        public final String f93627a;

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.LabelComponent$a$a */
        public static final class C37317a extends C37316a {

            /* renamed from: c */
            public static final int f93628c = 0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C37317a(@C12579k String str) {
                super(str, (DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(str, "label");
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.LabelComponent$a$b */
        public static final class C37318b extends C37316a {

            /* renamed from: c */
            public static final int f93629c = 0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C37318b(@C12579k String str) {
                super(str, (DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(str, "label");
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.LabelComponent$a$c */
        public static final class C37319c extends C37316a {

            /* renamed from: c */
            public static final int f93630c = 0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C37319c(@C12579k String str) {
                super(str, (DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(str, "label");
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.LabelComponent$a$d */
        public static final class C37320d extends C37316a {

            /* renamed from: c */
            public static final int f93631c = 0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C37320d(@C12579k String str) {
                super(str, (DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(str, "label");
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.LabelComponent$a$e */
        public static final class C37321e extends C37316a {

            /* renamed from: c */
            public static final int f93632c = 0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C37321e(@C12579k String str) {
                super(str, (DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(str, "label");
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.LabelComponent$a$f */
        public static final class C37322f extends C37316a {

            /* renamed from: c */
            public static final int f93633c = 0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C37322f(@C12579k String str) {
                super(str, (DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(str, "label");
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.LabelComponent$a$g */
        public static final class C37323g extends C37316a {

            /* renamed from: c */
            public static final int f93634c = 0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C37323g(@C12579k String str) {
                super(str, (DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(str, "label");
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.LabelComponent$a$h */
        public static final class C37324h extends C37316a {

            /* renamed from: e */
            public static final int f93635e = 0;
            @C12579k

            /* renamed from: c */
            public final String f93636c;
            @C12580l

            /* renamed from: d */
            public final C11289a<C11079d2> f93637d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C37324h(@C12579k String str, @C12579k String str2, @C12580l C11289a<C11079d2> aVar) {
                super(str, (DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(str, "label");
                Intrinsics.checkNotNullParameter(str2, "subLabel");
                this.f93636c = str2;
                this.f93637d = aVar;
            }

            @C12580l
            /* renamed from: b */
            public final C11289a<C11079d2> mo113677b() {
                return this.f93637d;
            }

            @C12579k
            /* renamed from: c */
            public final String mo113678c() {
                return this.f93636c;
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.LabelComponent$a$i */
        public static final class C37325i extends C37316a {

            /* renamed from: c */
            public static final int f93638c = 0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C37325i(@C12579k String str) {
                super(str, (DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(str, "label");
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.LabelComponent$a$j */
        public static final class C37326j extends C37316a {

            /* renamed from: c */
            public static final int f93639c = 0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C37326j(@C12579k String str) {
                super(str, (DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(str, "label");
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.LabelComponent$a$k */
        public static final class C37327k extends C37316a {

            /* renamed from: c */
            public static final int f93640c = 0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C37327k(@C12579k String str) {
                super(str, (DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(str, "label");
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.LabelComponent$a$l */
        public static final class C37328l extends C37316a {

            /* renamed from: c */
            public static final int f93641c = 0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C37328l(@C12579k String str) {
                super(str, (DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(str, "label");
            }
        }

        public /* synthetic */ C37316a(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        @C12579k
        /* renamed from: a */
        public final String mo113676a() {
            return this.f93627a;
        }

        public C37316a(String str) {
            this.f93627a = str;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public LabelComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    private final void setMaxLines(int i) {
        this.f93612a.f92809f.setMaxLines(i);
    }

    private final void setSubtext(String str) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
        this.f93612a.f92808e.setText(spannableString);
        if (!C11622t.isBlank(str)) {
            this.f93612a.f92808e.setVisibility(0);
        } else {
            this.f93612a.f92808e.setVisibility(8);
        }
    }

    private final void setText(String str) {
        this.f93612a.f92809f.setText(str);
    }

    private final void setTextSize(@C0364q int i) {
        this.f93612a.f92809f.setTextSize(2, getResources().getDimension(i));
    }

    private final void setTextStyle(@C0327c1 int i) {
        this.f93612a.f92809f.setTextAppearance(i);
    }

    private final void setVariant(Variant variant) {
        ColorStateList colorStateList;
        C11079d2 d2Var;
        Drawable g;
        C37075s sVar = this.f93612a;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        int w = variant.mo113673w();
        int i = C36896b.C36902f.ds_grey_20;
        Resources.Theme theme = getContext().getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "context.theme");
        ColorStateList b = C37138e.m152211b(resources, w, i, theme);
        Integer q = variant.mo113671q();
        if (q != null) {
            int intValue = q.intValue();
            Resources resources2 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "resources");
            int i2 = C36896b.C36902f.ds_grey_60;
            Resources.Theme theme2 = getContext().getTheme();
            Intrinsics.checkNotNullExpressionValue(theme2, "context.theme");
            colorStateList = C37138e.m152211b(resources2, intValue, i2, theme2);
        } else {
            colorStateList = null;
        }
        Integer y = variant.mo113674y();
        if (y == null || (g = C17465i.m80175g(getResources(), y.intValue(), getContext().getTheme())) == null) {
            d2Var = null;
        } else {
            if (!variant.mo113672r()) {
                g.setTintList(b);
            }
            sVar.f92806c.setImageDrawable(g);
            sVar.f92806c.setVisibility(0);
            d2Var = C11079d2.f28267a;
        }
        if (d2Var == null) {
            sVar.f92806c.setVisibility(8);
        }
        if (variant.mo113675z()) {
            mo113668v();
        } else if (colorStateList != null) {
            Drawable g2 = C17465i.m80175g(getResources(), C36896b.C36904h.background_label, getContext().getTheme());
            View view = sVar.f92805b;
            view.setVisibility(0);
            view.setBackground(g2);
            view.setBackgroundTintList(colorStateList);
            sVar.f92808e.setTextColor(colorStateList);
        } else {
            sVar.f92805b.setBackground((Drawable) null);
            sVar.f92805b.setVisibility(4);
        }
        sVar.f92809f.setTextColor(b);
    }

    /* renamed from: x */
    public static /* synthetic */ void m153105x(LabelComponent labelComponent, C37316a aVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        labelComponent.mo113669w(aVar, z);
    }

    /* renamed from: y */
    public static final void m153106y(C37316a aVar, View view) {
        Intrinsics.checkNotNullParameter(aVar, "$model");
        ((C37316a.C37324h) aVar).mo113677b().invoke();
    }

    /* renamed from: v */
    public final void mo113668v() {
        Drawable g = C17465i.m80175g(getResources(), C36896b.C36904h.background_label_outline, getContext().getTheme());
        View view = this.f93612a.f92805b;
        view.setVisibility(0);
        view.setBackground(g);
        view.setBackgroundTintList((ColorStateList) null);
    }

    /* renamed from: w */
    public final void mo113669w(@C12579k C37316a aVar, boolean z) {
        Intrinsics.checkNotNullParameter(aVar, C40045d.f102104u);
        setSubtext("");
        setMaxLines(1);
        if (aVar instanceof C37316a.C37325i) {
            setVariant(Variant.OFFER);
        } else if (aVar instanceof C37316a.C37324h) {
            setVariant(Variant.MIXTURE);
            C37316a.C37324h hVar = (C37316a.C37324h) aVar;
            if (hVar.mo113677b() != null && !z) {
                setSubtext(hVar.mo113678c());
                setOnClickListener(new C37356c(aVar));
            }
        } else if (aVar instanceof C37316a.C37320d) {
            setVariant(Variant.COUPON_OFFER);
            setMaxLines(2);
        } else if (aVar instanceof C37316a.C37318b) {
            setVariant(Variant.COUPON_ENABLED);
        } else if (aVar instanceof C37316a.C37321e) {
            setVariant(Variant.LOYALTY);
        } else if (aVar instanceof C37316a.C37322f) {
            setVariant(Variant.LOYALTY_BONUS);
        } else if (aVar instanceof C37316a.C37328l) {
            setVariant(Variant.UNAVAILABLE);
        } else if (aVar instanceof C37316a.C37326j) {
            setVariant(Variant.OFFER_MINI);
        } else if (aVar instanceof C37316a.C37323g) {
            setVariant(Variant.LOYALTY_MINI);
        } else if (aVar instanceof C37316a.C37319c) {
            setVariant(Variant.COUPON_LOYALTY);
            setMaxLines(2);
        } else if (aVar instanceof C37316a.C37327k) {
            setVariant(Variant.PROMOTION_CHANNEL);
            setTextSize(C36896b.C36903g.ds_font_size_s);
            setTextStyle(C36896b.C36913q.ds_mixin_navigation_m);
        } else if (aVar instanceof C37316a.C37317a) {
            setVariant(Variant.CATALOG);
        }
        setText(aVar.mo113676a());
        invalidate();
        requestLayout();
    }

    /* renamed from: z */
    public final Variant mo113670z(int i) {
        switch (i) {
            case 0:
                return Variant.OFFER;
            case 1:
                return Variant.MIXTURE;
            case 2:
                return Variant.COUPON_OFFER;
            case 3:
                return Variant.COUPON_ENABLED;
            case 4:
                return Variant.LOYALTY;
            case 5:
                return Variant.LOYALTY_BONUS;
            case 6:
                return Variant.UNAVAILABLE;
            case 7:
                return Variant.OFFER_MINI;
            case 8:
                return Variant.LOYALTY_MINI;
            case 9:
                return Variant.COUPON_LOYALTY;
            case 10:
                return Variant.PROMOTION_CHANNEL;
            default:
                throw new IllegalArgumentException("Unknown variant enum value (set with app:variant) for LabelComponent: " + i);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public LabelComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LabelComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public LabelComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        C37075s b = C37075s.m152056b(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(b, "inflate(\n        LayoutI…ext),\n        this,\n    )");
        this.f93612a = b;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C36896b.C36914r.LabelComponent, 0, 0);
        try {
            String string = obtainStyledAttributes.getString(C36896b.C36914r.LabelComponent_label_text);
            if (string != null) {
                Intrinsics.checkNotNullExpressionValue(string, "it");
                setText(string);
            }
            String string2 = obtainStyledAttributes.getString(C36896b.C36914r.LabelComponent_label_subtext);
            string2 = string2 == null ? "" : string2;
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.styleable.La…nent_label_subtext) ?: \"\"");
            setSubtext(string2);
            setVariant(mo113670z(obtainStyledAttributes.getInteger(C36896b.C36914r.LabelComponent_label_variant, 0)));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}

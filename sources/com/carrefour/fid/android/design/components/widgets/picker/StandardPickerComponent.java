package com.carrefour.fid.android.design.components.widgets.picker;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.C0358n;
import androidx.annotation.C0375v;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.C8567o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.C17465i;
import androidx.core.view.ViewGroupKt;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.databinding.C37033b1;
import com.carrefour.fid.android.design.components.extension.C37113e;
import com.carrefour.fid.android.design.components.utils.C37138e;
import com.carrefour.fid.android.design.components.utils.C37139f;
import com.carrefour.fid.android.design.components.widgets.productcard.C37353b;
import com.carrefour.fid.android.design.components.widgets.productcard.list.C37369a;
import com.google.android.datatransport.cct.C40045d;
import com.urbanairship.iam.events.C9175a;
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

@C11076d0(mo22515d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0002%)B'\b\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\b\b\u0002\u0010\"\u001a\u00020\u000b¢\u0006\u0004\b.\u0010/J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J$\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\r\u001a\u00020\u000bH\u0002J&\u0010\u0011\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0002J.\u0010\u0015\u001a\u00020\u00042\b\b\u0001\u0010\u0012\u001a\u00020\u000b2\b\b\u0001\u0010\u0013\u001a\u00020\u000b2\b\b\u0001\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0006H\u0002J#\u0010\u0018\u001a\u00020\u00042\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001c\u001a\u00020\u00042\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010\u001b\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010#\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\"\u001a\u00020\u000bH\u0002R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010$8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001b\u0010-\u001a\u00020(8BX\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u00060"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/picker/StandardPickerComponent;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/carrefour/fid/android/design/components/widgets/picker/StandardPickerComponent$a;", "model", "Lkotlin/d2;", "v", "", "enabled", "setEnabled", "", "text", "", "color", "pressedTintColor", "C", "description", "descriptionToBold", "z", "icon", "tintColor", "isEnabledTintPickerColor", "A", "iconSticker", "isEnabledSticker", "B", "(Ljava/lang/Integer;Z)V", "backgroundRes", "tintColorPicker", "y", "(Ljava/lang/Integer;I)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "x", "Lkotlin/Function0;", "a", "Lkotlin/jvm/functions/a;", "onPickerClickListener", "Lcom/carrefour/fid/android/design/components/databinding/b1;", "b", "Lkotlin/z;", "getBinding", "()Lcom/carrefour/fid/android/design/components/databinding/b1;", "binding", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C11363r0({"SMAP\nStandardPickerComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StandardPickerComponent.kt\ncom/carrefour/fid/android/design/components/widgets/picker/StandardPickerComponent\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,373:1\n262#2,2:374\n1295#3,2:376\n*S KotlinDebug\n*F\n+ 1 StandardPickerComponent.kt\ncom/carrefour/fid/android/design/components/widgets/picker/StandardPickerComponent\n*L\n286#1:374,2\n370#1:376,2\n*E\n"})
public final class StandardPickerComponent extends ConstraintLayout {

    /* renamed from: c */
    public static final int f93536c = 8;
    @C12580l

    /* renamed from: a */
    public C11289a<C11079d2> f93537a;
    @C12579k

    /* renamed from: b */
    public final C11677z f93538b;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.widgets.picker.StandardPickerComponent$b */
    public static abstract class C37293b {
        @C12579k

        /* renamed from: d */
        public static final C37296c f93553d = new C37296c((DefaultConstructorMarker) null);

        /* renamed from: e */
        public static final int f93554e = 0;

        /* renamed from: a */
        public final int f93555a;

        /* renamed from: b */
        public final int f93556b;

        /* renamed from: c */
        public final int f93557c;

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.design.components.widgets.picker.StandardPickerComponent$b$a */
        public static final class C37294a extends C37293b {
            @C12579k

            /* renamed from: f */
            public static final C37294a f93558f = new C37294a();

            /* renamed from: g */
            public static final int f93559g = 0;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C37294a() {
                /*
                    r3 = this;
                    int r0 = com.carrefour.fid.android.design.components.C36896b.C36902f.ds_primary
                    int r1 = com.carrefour.fid.android.design.components.C36896b.C36902f.ds_primary_dark
                    r2 = 0
                    r3.<init>(r0, r1, r0, r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.picker.StandardPickerComponent.C37293b.C37294a.<init>():void");
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.design.components.widgets.picker.StandardPickerComponent$b$b */
        public static final class C37295b extends C37293b {
            @C12579k

            /* renamed from: f */
            public static final C37295b f93560f = new C37295b();

            /* renamed from: g */
            public static final int f93561g = 0;

            public C37295b() {
                super(C36896b.C36902f.ds_primary, C36896b.C36902f.ds_primary_dark, C36896b.C36902f.ds_grey_5, (DefaultConstructorMarker) null);
            }
        }

        /* renamed from: com.carrefour.fid.android.design.components.widgets.picker.StandardPickerComponent$b$c */
        public static final class C37296c {
            public /* synthetic */ C37296c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @C12579k
            /* renamed from: a */
            public final C37293b mo113629a(int i) {
                if (i == 0) {
                    return C37294a.f93558f;
                }
                if (i == 1) {
                    return C37295b.f93560f;
                }
                if (i == 2) {
                    return C37297d.f93562f;
                }
                if (i == 3) {
                    return C37298e.f93564f;
                }
                if (i == 4) {
                    return C37299f.f93566f;
                }
                if (i != 5) {
                    return C37294a.f93558f;
                }
                return C37300g.f93568f;
            }

            public C37296c() {
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.design.components.widgets.picker.StandardPickerComponent$b$d */
        public static final class C37297d extends C37293b {
            @C12579k

            /* renamed from: f */
            public static final C37297d f93562f = new C37297d();

            /* renamed from: g */
            public static final int f93563g = 0;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C37297d() {
                /*
                    r3 = this;
                    int r0 = com.carrefour.fid.android.design.components.C36896b.C36902f.ds_primary_alternative
                    int r1 = com.carrefour.fid.android.design.components.C36896b.C36902f.ds_green
                    r2 = 0
                    r3.<init>(r0, r1, r0, r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.picker.StandardPickerComponent.C37293b.C37297d.<init>():void");
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.design.components.widgets.picker.StandardPickerComponent$b$e */
        public static final class C37298e extends C37293b {
            @C12579k

            /* renamed from: f */
            public static final C37298e f93564f = new C37298e();

            /* renamed from: g */
            public static final int f93565g = 0;

            public C37298e() {
                super(C36896b.C36902f.ds_primary_alternative, C36896b.C36902f.ds_green, C36896b.C36902f.ds_grey_5, (DefaultConstructorMarker) null);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.design.components.widgets.picker.StandardPickerComponent$b$f */
        public static final class C37299f extends C37293b {
            @C12579k

            /* renamed from: f */
            public static final C37299f f93566f = new C37299f();

            /* renamed from: g */
            public static final int f93567g = 0;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C37299f() {
                /*
                    r3 = this;
                    int r0 = com.carrefour.fid.android.design.components.C36896b.C36902f.ds_red_1
                    int r1 = com.carrefour.fid.android.design.components.C36896b.C36902f.ds_red_dark
                    r2 = 0
                    r3.<init>(r0, r1, r0, r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.picker.StandardPickerComponent.C37293b.C37299f.<init>():void");
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.design.components.widgets.picker.StandardPickerComponent$b$g */
        public static final class C37300g extends C37293b {
            @C12579k

            /* renamed from: f */
            public static final C37300g f93568f = new C37300g();

            /* renamed from: g */
            public static final int f93569g = 0;

            public C37300g() {
                super(C36896b.C36902f.ds_red_1, C36896b.C36902f.ds_red_dark, C36896b.C36902f.ds_grey_5, (DefaultConstructorMarker) null);
            }
        }

        public /* synthetic */ C37293b(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, i3);
        }

        /* renamed from: a */
        public final int mo113626a() {
            return this.f93557c;
        }

        /* renamed from: b */
        public final int mo113627b() {
            return this.f93556b;
        }

        /* renamed from: c */
        public final int mo113628c() {
            return this.f93555a;
        }

        public C37293b(@C0358n int i, @C0358n int i2, @C0358n int i3) {
            this.f93555a = i;
            this.f93556b = i2;
            this.f93557c = i3;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public StandardPickerComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    private final C37033b1 getBinding() {
        return (C37033b1) this.f93538b.getValue();
    }

    /* renamed from: w */
    public static final void m153027w(StandardPickerComponent standardPickerComponent, View view) {
        Intrinsics.checkNotNullParameter(standardPickerComponent, "this$0");
        C11289a<C11079d2> aVar = standardPickerComponent.f93537a;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: A */
    public final void mo113588A(@C0375v int i, @C0358n int i2, @C0358n int i3, boolean z) {
        AppCompatImageView appCompatImageView = getBinding().f92577c;
        appCompatImageView.setImageResource(i);
        if (z) {
            Resources resources = appCompatImageView.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "resources");
            int i4 = C36896b.C36902f.ds_grey_20;
            Resources.Theme theme = appCompatImageView.getContext().getTheme();
            Intrinsics.checkNotNullExpressionValue(theme, "context.theme");
            appCompatImageView.setImageTintList(C37138e.m152210a(resources, i3, i4, i2, theme));
        }
    }

    /* renamed from: B */
    public final void mo113589B(@C0375v Integer num, boolean z) {
        int i;
        int i2;
        AppCompatImageView appCompatImageView = getBinding().f92579e;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "setIconSticker$lambda$3");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        appCompatImageView.setVisibility(i);
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = C36896b.C36904h.ds_ic_placeholder;
        }
        appCompatImageView.setImageResource(i2);
    }

    /* renamed from: C */
    public final void mo113590C(String str, @C0358n int i, @C0358n int i2) {
        getBinding().f92578d.setText(str);
        TextView textView = getBinding().f92578d;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        int i3 = C36896b.C36902f.ds_grey_20;
        Resources.Theme theme = getContext().getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "context.theme");
        textView.setTextColor(C37138e.m152210a(resources, i2, i3, i, theme));
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (View enabled : ViewGroupKt.m81808e(this)) {
            enabled.setEnabled(z);
        }
    }

    /* renamed from: v */
    public final void mo113592v(@C12579k C37292a aVar) {
        Intrinsics.checkNotNullParameter(aVar, C40045d.f102104u);
        mo113588A(aVar.mo113620u(), aVar.mo113624y().mo113628c(), aVar.mo113624y().mo113627b(), aVar.mo113597B());
        mo113589B(aVar.mo113621v(), aVar.mo113596A());
        mo113590C(aVar.mo113622w(), aVar.mo113624y().mo113626a(), aVar.mo113624y().mo113627b());
        mo113595z(aVar.mo113616r(), aVar.mo113618t(), aVar.mo113617s());
        mo113594y(aVar.mo113615q(), aVar.mo113624y().mo113628c());
        setClickable(true);
        setFocusable(true);
        setEnabled(aVar.mo113625z());
        setContentDescription(aVar.mo113614p());
        this.f93537a = aVar.mo113623x();
        setOnClickListener(new C37304c(this));
    }

    /* renamed from: x */
    public final void mo113593x(Context context, AttributeSet attributeSet, int i) {
        String str;
        String str2;
        String str3;
        AttributeSet attributeSet2 = attributeSet;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, C36896b.C36914r.StandardPickerComponent, i, 0);
            try {
                int i2 = C36896b.C36914r.StandardPickerComponent_iconPicker;
                int i3 = C36896b.C36904h.ds_ic_placeholder;
                int resourceId = obtainStyledAttributes.getResourceId(i2, i3);
                int resourceId2 = obtainStyledAttributes.getResourceId(C36896b.C36914r.StandardPickerComponent_iconSticker, i3);
                C37293b a = C37293b.f93553d.mo113629a(obtainStyledAttributes.getInteger(C36896b.C36914r.StandardPickerComponent_variantPicker, 0));
                String string = obtainStyledAttributes.getString(C36896b.C36914r.StandardPickerComponent_labelPicker);
                if (string == null) {
                    str = "";
                } else {
                    str = string;
                }
                String string2 = obtainStyledAttributes.getString(C36896b.C36914r.StandardPickerComponent_descriptionToBold);
                if (string2 == null) {
                    str2 = "";
                } else {
                    str2 = string2;
                }
                String string3 = obtainStyledAttributes.getString(C36896b.C36914r.StandardPickerComponent_descriptionPicker);
                if (string3 == null) {
                    str3 = "";
                } else {
                    str3 = string3;
                }
                int resourceId3 = obtainStyledAttributes.getResourceId(C36896b.C36914r.StandardPickerComponent_descriptionColor, C36896b.C36902f.ds_grey_20);
                boolean z = obtainStyledAttributes.getBoolean(C36896b.C36914r.StandardPickerComponent_enabledPicker, true);
                int resourceId4 = obtainStyledAttributes.getResourceId(C36896b.C36914r.StandardPickerComponent_backgroundPicker, C36896b.C36904h.background_standard_picker);
                try {
                    mo113592v(new C37292a(a, resourceId, Integer.valueOf(resourceId2), str, str3, str2, resourceId3, (String) null, z, obtainStyledAttributes.getBoolean(C36896b.C36914r.StandardPickerComponent_enabledPickerTintColor, true), obtainStyledAttributes.getBoolean(C36896b.C36914r.StandardPickerComponent_enabledSticker, false), Integer.valueOf(resourceId4), (C11289a) null, 4224, (DefaultConstructorMarker) null));
                    obtainStyledAttributes.recycle();
                } catch (Throwable th) {
                    th = th;
                    obtainStyledAttributes.recycle();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
    }

    /* renamed from: y */
    public final void mo113594y(@C0375v Integer num, @C0358n int i) {
        int i2;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = C36896b.C36904h.background_standard_picker;
        }
        setBackground(C37113e.m152155b(C17465i.m80175g(getResources(), i2, getContext().getTheme()), getResources().getColor(i, getContext().getTheme())));
    }

    /* renamed from: z */
    public final void mo113595z(String str, String str2, @C0358n int i) {
        boolean z;
        SpannableStringBuilder spannableStringBuilder;
        TextView textView = getBinding().f92576b;
        int i2 = 0;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = 8;
        }
        textView.setVisibility(i2);
        Resources resources = textView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        int i3 = C36896b.C36902f.ds_grey_20;
        Resources.Theme theme = textView.getContext().getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "context.theme");
        textView.setTextColor(C37138e.m152211b(resources, i, i3, theme));
        if (str != null) {
            if (str2 == null) {
                str2 = "";
            }
            spannableStringBuilder = C37139f.m152214b(str, str2);
        } else {
            spannableStringBuilder = null;
        }
        textView.setText(spannableStringBuilder);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public StandardPickerComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StandardPickerComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public StandardPickerComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f93538b = C10864b0.m38748c(new StandardPickerComponent$binding$2(context, this));
        mo113593x(context, attributeSet, i);
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.widgets.picker.StandardPickerComponent$a */
    public static final class C37292a implements C37369a {

        /* renamed from: Y */
        public static final int f93539Y = 0;
        @C12580l

        /* renamed from: X */
        public final C11289a<C11079d2> f93540X;
        @C12579k

        /* renamed from: a */
        public final C37293b f93541a;

        /* renamed from: b */
        public final int f93542b;
        @C12580l

        /* renamed from: c */
        public final Integer f93543c;
        @C12579k

        /* renamed from: d */
        public final String f93544d;
        @C12579k

        /* renamed from: e */
        public final String f93545e;
        @C12579k

        /* renamed from: f */
        public final String f93546f;

        /* renamed from: g */
        public final int f93547g;
        @C12579k

        /* renamed from: v */
        public final String f93548v;

        /* renamed from: w */
        public final boolean f93549w;

        /* renamed from: x */
        public final boolean f93550x;

        /* renamed from: y */
        public final boolean f93551y;
        @C12580l

        /* renamed from: z */
        public final Integer f93552z;

        public C37292a(@C12579k C37293b bVar, @C0375v int i, @C0375v @C12580l Integer num, @C12579k String str, @C12579k String str2, @C12579k String str3, @C0358n int i2, @C12579k String str4, boolean z, boolean z2, boolean z3, @C0375v @C12580l Integer num2, @C12580l C11289a<C11079d2> aVar) {
            Intrinsics.checkNotNullParameter(bVar, "variant");
            Intrinsics.checkNotNullParameter(str, "label");
            Intrinsics.checkNotNullParameter(str2, "description");
            Intrinsics.checkNotNullParameter(str3, "descriptionToBold");
            Intrinsics.checkNotNullParameter(str4, "accessibilityContentDescription");
            this.f93541a = bVar;
            this.f93542b = i;
            this.f93543c = num;
            this.f93544d = str;
            this.f93545e = str2;
            this.f93546f = str3;
            this.f93547g = i2;
            this.f93548v = str4;
            this.f93549w = z;
            this.f93550x = z2;
            this.f93551y = z3;
            this.f93552z = num2;
            this.f93540X = aVar;
        }

        /* renamed from: o */
        public static /* synthetic */ C37292a m153035o(C37292a aVar, C37293b bVar, int i, Integer num, String str, String str2, String str3, int i2, String str4, boolean z, boolean z2, boolean z3, Integer num2, C11289a aVar2, int i3, Object obj) {
            C37292a aVar3 = aVar;
            int i4 = i3;
            return aVar.mo113613n((i4 & 1) != 0 ? aVar3.f93541a : bVar, (i4 & 2) != 0 ? aVar3.f93542b : i, (i4 & 4) != 0 ? aVar3.f93543c : num, (i4 & 8) != 0 ? aVar3.f93544d : str, (i4 & 16) != 0 ? aVar3.f93545e : str2, (i4 & 32) != 0 ? aVar3.f93546f : str3, (i4 & 64) != 0 ? aVar3.f93547g : i2, (i4 & 128) != 0 ? aVar3.f93548v : str4, (i4 & 256) != 0 ? aVar3.f93549w : z, (i4 & 512) != 0 ? aVar3.f93550x : z2, (i4 & 1024) != 0 ? aVar3.f93551y : z3, (i4 & 2048) != 0 ? aVar3.f93552z : num2, (i4 & 4096) != 0 ? aVar3.f93540X : aVar2);
        }

        /* renamed from: A */
        public final boolean mo113596A() {
            return this.f93551y;
        }

        /* renamed from: B */
        public final boolean mo113597B() {
            return this.f93550x;
        }

        @C12579k
        /* renamed from: a */
        public final C37293b mo113598a() {
            return this.f93541a;
        }

        /* renamed from: b */
        public final boolean mo113599b() {
            return this.f93550x;
        }

        /* renamed from: c */
        public final boolean mo113600c() {
            return this.f93551y;
        }

        @C12580l
        /* renamed from: d */
        public final Integer mo113601d() {
            return this.f93552z;
        }

        @C12580l
        /* renamed from: e */
        public final C11289a<C11079d2> mo113602e() {
            return this.f93540X;
        }

        public boolean equals(@C12580l Object obj) {
            Class<?> cls;
            if (this == obj) {
                return true;
            }
            Class<C37292a> cls2 = C37292a.class;
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (!Intrinsics.areEqual((Object) cls2, (Object) cls)) {
                return false;
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.carrefour.fid.android.design.components.widgets.picker.StandardPickerComponent.UiModel");
            C37292a aVar = (C37292a) obj;
            if (Intrinsics.areEqual((Object) this.f93541a, (Object) aVar.f93541a) && this.f93542b == aVar.f93542b && Intrinsics.areEqual((Object) this.f93543c, (Object) aVar.f93543c) && Intrinsics.areEqual((Object) this.f93544d, (Object) aVar.f93544d) && Intrinsics.areEqual((Object) this.f93546f, (Object) aVar.f93546f) && this.f93547g == aVar.f93547g && Intrinsics.areEqual((Object) this.f93545e, (Object) aVar.f93545e) && this.f93549w == aVar.f93549w && this.f93550x == aVar.f93550x && this.f93551y == aVar.f93551y) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public final int mo113604f() {
            return this.f93542b;
        }

        @C12580l
        /* renamed from: g */
        public final Integer mo113605g() {
            return this.f93543c;
        }

        public int getType(@C12579k C37353b.C37354a aVar) {
            Intrinsics.checkNotNullParameter(aVar, "typeFactory");
            return aVar.mo113921a(this);
        }

        @C12579k
        /* renamed from: h */
        public final String mo113606h() {
            return this.f93544d;
        }

        public int hashCode() {
            int i;
            int hashCode = ((this.f93541a.hashCode() * 31) + Integer.hashCode(this.f93542b)) * 31;
            Integer num = this.f93543c;
            if (num != null) {
                i = num.hashCode();
            } else {
                i = 0;
            }
            return ((((((((((((((hashCode + i) * 31) + this.f93544d.hashCode()) * 31) + this.f93546f.hashCode()) * 31) + Integer.hashCode(this.f93547g)) * 31) + this.f93545e.hashCode()) * 31) + Boolean.hashCode(this.f93549w)) * 31) + Boolean.hashCode(this.f93550x)) * 31) + Boolean.hashCode(this.f93551y);
        }

        @C12579k
        /* renamed from: i */
        public final String mo113608i() {
            return this.f93545e;
        }

        @C12579k
        /* renamed from: j */
        public final String mo113609j() {
            return this.f93546f;
        }

        /* renamed from: k */
        public final int mo113610k() {
            return this.f93547g;
        }

        @C12579k
        /* renamed from: l */
        public final String mo113611l() {
            return this.f93548v;
        }

        /* renamed from: m */
        public final boolean mo113612m() {
            return this.f93549w;
        }

        @C12579k
        /* renamed from: n */
        public final C37292a mo113613n(@C12579k C37293b bVar, @C0375v int i, @C0375v @C12580l Integer num, @C12579k String str, @C12579k String str2, @C12579k String str3, @C0358n int i2, @C12579k String str4, boolean z, boolean z2, boolean z3, @C0375v @C12580l Integer num2, @C12580l C11289a<C11079d2> aVar) {
            C37293b bVar2 = bVar;
            Intrinsics.checkNotNullParameter(bVar2, "variant");
            String str5 = str;
            Intrinsics.checkNotNullParameter(str5, "label");
            String str6 = str2;
            Intrinsics.checkNotNullParameter(str6, "description");
            String str7 = str3;
            Intrinsics.checkNotNullParameter(str7, "descriptionToBold");
            String str8 = str4;
            Intrinsics.checkNotNullParameter(str8, "accessibilityContentDescription");
            return new C37292a(bVar2, i, num, str5, str6, str7, i2, str8, z, z2, z3, num2, aVar);
        }

        @C12579k
        /* renamed from: p */
        public final String mo113614p() {
            return this.f93548v;
        }

        @C12580l
        /* renamed from: q */
        public final Integer mo113615q() {
            return this.f93552z;
        }

        @C12579k
        /* renamed from: r */
        public final String mo113616r() {
            return this.f93545e;
        }

        /* renamed from: s */
        public final int mo113617s() {
            return this.f93547g;
        }

        @C12579k
        /* renamed from: t */
        public final String mo113618t() {
            return this.f93546f;
        }

        @C12579k
        public String toString() {
            C37293b bVar = this.f93541a;
            int i = this.f93542b;
            Integer num = this.f93543c;
            String str = this.f93544d;
            String str2 = this.f93545e;
            String str3 = this.f93546f;
            int i2 = this.f93547g;
            String str4 = this.f93548v;
            boolean z = this.f93549w;
            boolean z2 = this.f93550x;
            boolean z3 = this.f93551y;
            Integer num2 = this.f93552z;
            C11289a<C11079d2> aVar = this.f93540X;
            return "UiModel(variant=" + bVar + ", icon=" + i + ", iconSticker=" + num + ", label=" + str + ", description=" + str2 + ", descriptionToBold=" + str3 + ", descriptionColor=" + i2 + ", accessibilityContentDescription=" + str4 + ", isEnabled=" + z + ", isEnabledTintPickerColor=" + z2 + ", isEnabledSticker=" + z3 + ", background=" + num2 + ", onClickListener=" + aVar + ")";
        }

        /* renamed from: u */
        public final int mo113620u() {
            return this.f93542b;
        }

        @C12580l
        /* renamed from: v */
        public final Integer mo113621v() {
            return this.f93543c;
        }

        @C12579k
        /* renamed from: w */
        public final String mo113622w() {
            return this.f93544d;
        }

        @C12580l
        /* renamed from: x */
        public final C11289a<C11079d2> mo113623x() {
            return this.f93540X;
        }

        @C12579k
        /* renamed from: y */
        public final C37293b mo113624y() {
            return this.f93541a;
        }

        /* renamed from: z */
        public final boolean mo113625z() {
            return this.f93549w;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ C37292a(com.carrefour.fid.android.design.components.widgets.picker.StandardPickerComponent.C37293b r18, int r19, java.lang.Integer r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, int r24, java.lang.String r25, boolean r26, boolean r27, boolean r28, java.lang.Integer r29, kotlin.jvm.functions.C11289a r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
            /*
                r17 = this;
                r0 = r31
                r1 = r0 & 4
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r6 = r2
                goto L_0x000b
            L_0x0009:
                r6 = r20
            L_0x000b:
                r1 = r0 & 8
                if (r1 == 0) goto L_0x0016
                java.lang.String r1 = new java.lang.String
                r1.<init>()
                r7 = r1
                goto L_0x0018
            L_0x0016:
                r7 = r21
            L_0x0018:
                r1 = r0 & 16
                if (r1 == 0) goto L_0x0023
                java.lang.String r1 = new java.lang.String
                r1.<init>()
                r8 = r1
                goto L_0x0025
            L_0x0023:
                r8 = r22
            L_0x0025:
                r1 = r0 & 32
                if (r1 == 0) goto L_0x0030
                java.lang.String r1 = new java.lang.String
                r1.<init>()
                r9 = r1
                goto L_0x0032
            L_0x0030:
                r9 = r23
            L_0x0032:
                r1 = r0 & 64
                if (r1 == 0) goto L_0x003a
                int r1 = com.carrefour.fid.android.design.components.C36896b.C36902f.ds_grey_20
                r10 = r1
                goto L_0x003c
            L_0x003a:
                r10 = r24
            L_0x003c:
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L_0x0047
                java.lang.String r1 = new java.lang.String
                r1.<init>()
                r11 = r1
                goto L_0x0049
            L_0x0047:
                r11 = r25
            L_0x0049:
                r1 = r0 & 256(0x100, float:3.59E-43)
                r3 = 1
                if (r1 == 0) goto L_0x0050
                r12 = r3
                goto L_0x0052
            L_0x0050:
                r12 = r26
            L_0x0052:
                r1 = r0 & 512(0x200, float:7.175E-43)
                if (r1 == 0) goto L_0x0058
                r13 = r3
                goto L_0x005a
            L_0x0058:
                r13 = r27
            L_0x005a:
                r1 = r0 & 1024(0x400, float:1.435E-42)
                if (r1 == 0) goto L_0x0061
                r1 = 0
                r14 = r1
                goto L_0x0063
            L_0x0061:
                r14 = r28
            L_0x0063:
                r1 = r0 & 2048(0x800, float:2.87E-42)
                if (r1 == 0) goto L_0x0069
                r15 = r2
                goto L_0x006b
            L_0x0069:
                r15 = r29
            L_0x006b:
                r0 = r0 & 4096(0x1000, float:5.74E-42)
                if (r0 == 0) goto L_0x0072
                r16 = r2
                goto L_0x0074
            L_0x0072:
                r16 = r30
            L_0x0074:
                r3 = r17
                r4 = r18
                r5 = r19
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.picker.StandardPickerComponent.C37292a.<init>(com.carrefour.fid.android.design.components.widgets.picker.StandardPickerComponent$b, int, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, boolean, boolean, boolean, java.lang.Integer, kotlin.jvm.functions.a, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}

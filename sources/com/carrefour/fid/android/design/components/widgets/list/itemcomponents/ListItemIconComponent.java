package com.carrefour.fid.android.design.components.widgets.list.itemcomponents;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0358n;
import androidx.appcompat.content.res.C0507a;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.content.C17318d;
import com.bumptech.glide.C22038b;
import com.bumptech.glide.request.target.C22568e;
import com.bumptech.glide.request.transition.C22598f;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.databinding.C37079u;
import com.carrefour.fid.android.design.components.type.IconsPosition;
import com.carrefour.fid.android.design.components.widgets.list.C37265e;
import com.carrefour.fid.android.design.components.widgets.list.C37269i;
import com.carrefour.fid.android.design.components.widgets.list.IconSize;
import com.carrefour.fid.android.design.components.widgets.list.ItemErrorType;
import com.carrefour.fid.android.design.components.widgets.list.ListItemComponent;
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

@C11076d0(mo22515d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0007\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00019B3\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0007\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b6\u00107J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0012\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0002J\u0012\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0001\u0010\u000f\u001a\u00020\u0007J\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\"\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u0007H\u0002J\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0002H\u0002J\u001e\u0010 \u001a\u00020\u0005*\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001f\u001a\u00020\u0012H\u0002J\b\u0010!\u001a\u00020\u0005H\u0002R*\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\"8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R*\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\"8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b*\u0010$\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(R\u001b\u00103\u001a\u00020.8BX\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u0006:"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/list/itemcomponents/ListItemIconComponent;", "Lcom/carrefour/fid/android/design/components/widgets/list/ListItemComponent;", "Lcom/carrefour/fid/android/design/components/widgets/list/e;", "Landroid/graphics/drawable/Drawable;", "drawable", "Lkotlin/d2;", "setLeftIconDrawable", "", "textColor", "setLabelTextColor", "itemViewUIModel", "A", "", "text", "setLabelText", "colorRes", "setLabelErrorText", "iconLeftImageUrl", "Lcom/carrefour/fid/android/design/components/widgets/list/IconSize;", "iconLeftSize", "H", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "C", "itemViewUI", "D", "Landroid/widget/ImageView;", "icon", "imageSize", "z", "E", "Lkotlin/Function0;", "c", "Lkotlin/jvm/functions/a;", "getOnItemClickListener", "()Lkotlin/jvm/functions/a;", "setOnItemClickListener", "(Lkotlin/jvm/functions/a;)V", "onItemClickListener", "d", "getOnIconRightClickListener", "setOnIconRightClickListener", "onIconRightClickListener", "Lcom/carrefour/fid/android/design/components/databinding/u;", "e", "Lkotlin/z;", "getBinding", "()Lcom/carrefour/fid/android/design/components/databinding/u;", "binding", "", "itemHeight", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILjava/lang/Float;)V", "f", "a", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class ListItemIconComponent extends ListItemComponent<C37265e> {
    @C12579k

    /* renamed from: f */
    public static final C37270a f93487f = new C37270a((DefaultConstructorMarker) null);

    /* renamed from: g */
    public static final int f93488g = 8;
    @C12580l

    /* renamed from: c */
    public C11289a<C11079d2> f93489c;
    @C12580l

    /* renamed from: d */
    public C11289a<C11079d2> f93490d;
    @C12579k

    /* renamed from: e */
    public final C11677z f93491e;

    /* renamed from: com.carrefour.fid.android.design.components.widgets.list.itemcomponents.ListItemIconComponent$a */
    public static final class C37270a {
        public /* synthetic */ C37270a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C37269i m152972b(C37270a aVar, Context context, String str, String str2, Drawable drawable, C11289a aVar2, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = "";
            }
            String str3 = str2;
            if ((i & 8) != 0) {
                drawable = null;
            }
            return aVar.mo113530a(context, str, str3, drawable, aVar2);
        }

        @C12579k
        /* renamed from: a */
        public final C37269i mo113530a(@C12579k Context context, @C12579k String str, @C12579k String str2, @C12580l Drawable drawable, @C12580l C11289a<C11079d2> aVar) {
            Context context2 = context;
            Intrinsics.checkNotNullParameter(context2, C9175a.f24932Y);
            String str3 = str;
            Intrinsics.checkNotNullParameter(str3, "label");
            String str4 = str2;
            Intrinsics.checkNotNullParameter(str4, "contentDescription");
            return new C37265e(str3, 0, (String) null, (ItemErrorType) null, C0507a.m2346b(context2, C36896b.C36904h.ds_ic_chevron_right), drawable, IconSize.f93436e, IconSize.XS, (IconsPosition) null, (String) null, aVar, str4, 782, (DefaultConstructorMarker) null);
        }

        @C12579k
        /* renamed from: c */
        public final C37269i mo113531c(@C12579k Context context, @C12579k String str, @C12579k String str2, @C12580l C11289a<C11079d2> aVar) {
            Context context2 = context;
            String str3 = str;
            Intrinsics.checkNotNullParameter(context2, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(str3, "label");
            String str4 = str2;
            Intrinsics.checkNotNullParameter(str4, "imageUrl");
            IconSize iconSize = IconSize.XL;
            return new C37265e(str3, 0, (String) null, (ItemErrorType) null, C0507a.m2346b(context2, C36896b.C36904h.ds_ic_chevron_right), (Drawable) null, iconSize, IconSize.XS, (IconsPosition) null, str4, aVar, context2.getString(C36896b.C36912p.accessibility_open_department, new Object[]{str3}), 302, (DefaultConstructorMarker) null);
        }

        @C12579k
        /* renamed from: d */
        public final C37269i mo113532d(@C12579k Context context, @C12579k String str, @C12580l C11289a<C11079d2> aVar) {
            Context context2 = context;
            String str2 = str;
            Intrinsics.checkNotNullParameter(context2, C9175a.f24932Y);
            Intrinsics.checkNotNullParameter(str2, "label");
            return new C37265e(str2, 0, (String) null, (ItemErrorType) null, C0507a.m2346b(context2, C36896b.C36904h.ds_ic_chevron_right), (Drawable) null, (IconSize) null, IconSize.XS, (IconsPosition) null, (String) null, aVar, context2.getString(C36896b.C36912p.accessibility_open_product_list, new Object[]{str2}), 878, (DefaultConstructorMarker) null);
        }

        public C37270a() {
        }
    }

    /* renamed from: com.carrefour.fid.android.design.components.widgets.list.itemcomponents.ListItemIconComponent$b */
    public /* synthetic */ class C37271b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.carrefour.fid.android.design.components.widgets.list.ItemErrorType[] r0 = com.carrefour.fid.android.design.components.widgets.list.ItemErrorType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.design.components.widgets.list.ItemErrorType r1 = com.carrefour.fid.android.design.components.widgets.list.ItemErrorType.WARNING     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.design.components.widgets.list.ItemErrorType r1 = com.carrefour.fid.android.design.components.widgets.list.ItemErrorType.ERROR     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.list.itemcomponents.ListItemIconComponent.C37271b.<clinit>():void");
        }
    }

    /* renamed from: com.carrefour.fid.android.design.components.widgets.list.itemcomponents.ListItemIconComponent$c */
    public static final class C37272c extends C22568e<Drawable> {

        /* renamed from: d */
        public final /* synthetic */ ListItemIconComponent f93492d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37272c(int i, ListItemIconComponent listItemIconComponent) {
            super(i, i);
            this.f93492d = listItemIconComponent;
        }

        /* renamed from: e */
        public void mo65592l(@C12579k Drawable drawable, @C12580l C22598f<? super Drawable> fVar) {
            Intrinsics.checkNotNullParameter(drawable, "drawable");
            this.f93492d.setLeftIconDrawable(drawable);
        }

        /* renamed from: k */
        public void mo65591k(@C12580l Drawable drawable) {
            this.f93492d.setLeftIconDrawable(drawable);
        }

        /* renamed from: o */
        public void mo65594o(@C12580l Drawable drawable) {
            this.f93492d.setLeftIconDrawable((Drawable) null);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ListItemIconComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, (Float) null, 14, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* renamed from: B */
    public static final void m152958B(C37265e eVar, View view) {
        Intrinsics.checkNotNullParameter(eVar, "$this_apply");
        eVar.mo113489y().invoke();
    }

    /* renamed from: F */
    public static final void m152959F(ListItemIconComponent listItemIconComponent, View view) {
        Intrinsics.checkNotNullParameter(listItemIconComponent, "this$0");
        C11289a<C11079d2> aVar = listItemIconComponent.f93489c;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: G */
    public static final void m152960G(ListItemIconComponent listItemIconComponent, View view) {
        Intrinsics.checkNotNullParameter(listItemIconComponent, "this$0");
        C11289a<C11079d2> aVar = listItemIconComponent.f93490d;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    private final C37079u getBinding() {
        return (C37079u) this.f93491e.getValue();
    }

    private final void setLabelTextColor(@C0358n int i) {
        getBinding().f92826c.setTextColor(C17318d.m79723f(getContext(), i));
    }

    /* access modifiers changed from: private */
    public final void setLeftIconDrawable(Drawable drawable) {
        if (drawable != null) {
            getBinding().f92827d.setVisibility(0);
            getBinding().f92827d.setImageDrawable(drawable);
            return;
        }
        getBinding().f92827d.setVisibility(8);
    }

    /* renamed from: A */
    public void mo113429u(@C12580l C37265e eVar) {
        boolean z;
        if (eVar != null) {
            setLabelText(eVar.mo113488x());
            setLabelTextColor(eVar.mo113490z());
            String o = eVar.mo113478o();
            boolean z2 = false;
            if (o != null) {
                if (o.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    z2 = true;
                }
            }
            if (z2) {
                setContentDescription(eVar.mo113478o());
            }
            if (eVar.mo113480q() != null) {
                mo113522H(eVar.mo113480q(), eVar.mo113481r());
            } else {
                ImageView imageView = getBinding().f92827d;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.itemLeftIcon");
                mo113529z(imageView, eVar.mo113479p(), eVar.mo113481r());
            }
            ImageView imageView2 = getBinding().f92828e;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.itemRightIcon");
            mo113529z(imageView2, eVar.mo113482s(), eVar.mo113483t());
            mo113520D(eVar);
            invalidate();
            requestLayout();
            if (eVar.mo113489y() != null) {
                getBinding().getRoot().setOnClickListener(new C37274b(eVar));
            } else {
                mo113521E();
            }
        }
    }

    /* renamed from: C */
    public final void mo113519C(Context context, AttributeSet attributeSet, int i) {
        AttributeSet attributeSet2 = attributeSet;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, C36896b.C36914r.ListItemIconComponent, i, 0);
            try {
                try {
                    mo113429u(new C37265e(obtainStyledAttributes.getString(C36896b.C36914r.ListItemIconComponent_itemText), 0, obtainStyledAttributes.getString(C36896b.C36914r.ListItemIconComponent_itemErrorText), ItemErrorType.f93439a.mo113427a(Integer.valueOf(obtainStyledAttributes.getInteger(C36896b.C36914r.ListItemIconComponent_itemErrorType, 1))), obtainStyledAttributes.getDrawable(C36896b.C36914r.ListItemIconComponent_rightIcon), obtainStyledAttributes.getDrawable(C36896b.C36914r.ListItemIconComponent_leftIcon), (IconSize) null, (IconSize) null, IconsPosition.f92936a.mo112740a(Integer.valueOf(obtainStyledAttributes.getInteger(C36896b.C36914r.ListItemIconComponent_itemIconPosition, -1))), (String) null, (C11289a) null, (String) null, 3778, (DefaultConstructorMarker) null));
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

    /* renamed from: D */
    public final void mo113520D(C37265e eVar) {
        int i = C37271b.$EnumSwitchMapping$0[eVar.mo113486v().ordinal()];
        if (i == 1) {
            setLabelErrorText(eVar.mo113487w(), ItemErrorType.WARNING.mo113425q());
        } else if (i != 2) {
            getBinding().f92825b.setVisibility(8);
        } else {
            setLabelErrorText(eVar.mo113487w(), ItemErrorType.ERROR.mo113425q());
        }
    }

    /* renamed from: E */
    public final void mo113521E() {
        C37079u binding = getBinding();
        setOnClickListener(new C37275c(this));
        binding.f92828e.setOnClickListener(new C37276d(this));
    }

    /* renamed from: H */
    public final void mo113522H(String str, IconSize iconSize) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(iconSize.mo113423q());
        getBinding().f92827d.getLayoutParams().height = getResources().getDimensionPixelSize(iconSize.mo113423q());
        getBinding().f92827d.setVisibility(4);
        C22038b.m100350E(getContext()).mo65605u(str).mo65672H1(new C37272c(dimensionPixelSize, this));
    }

    @C12580l
    public final C11289a<C11079d2> getOnIconRightClickListener() {
        return this.f93490d;
    }

    @C12580l
    public final C11289a<C11079d2> getOnItemClickListener() {
        return this.f93489c;
    }

    public final void setLabelErrorText(@C12580l String str, @C0358n int i) {
        TextView textView = getBinding().f92825b;
        textView.setVisibility(0);
        textView.setText(str);
        textView.setTextColor(C17318d.m79723f(textView.getContext(), i));
    }

    public final void setLabelText(@C12580l String str) {
        getBinding().f92826c.setText(str);
    }

    public final void setOnIconRightClickListener(@C12580l C11289a<C11079d2> aVar) {
        this.f93490d = aVar;
    }

    public final void setOnItemClickListener(@C12580l C11289a<C11079d2> aVar) {
        this.f93489c = aVar;
    }

    /* renamed from: z */
    public final void mo113529z(ImageView imageView, Drawable drawable, IconSize iconSize) {
        if (drawable != null) {
            imageView.getLayoutParams().height = imageView.getResources().getDimensionPixelSize(iconSize.mo113423q());
            imageView.setImageDrawable(drawable);
            imageView.setVisibility(0);
            return;
        }
        imageView.setVisibility(8);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ListItemIconComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, (Float) null, 12, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ListItemIconComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (Float) null, 8, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ListItemIconComponent(Context context, AttributeSet attributeSet, int i, Float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? Float.valueOf(60.0f) : f);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public ListItemIconComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i, @C12580l Float f) {
        super(context, attributeSet, i, f);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        this.f93491e = C10864b0.m38748c(new ListItemIconComponent$binding$2(context, this));
        mo113519C(context, attributeSet, i);
        setBackgroundResource(C36896b.C36904h.background_white_ripple);
    }
}

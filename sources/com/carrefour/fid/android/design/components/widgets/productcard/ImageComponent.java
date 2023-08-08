package com.carrefour.fid.android.design.components.widgets.productcard;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.C8567o;
import androidx.core.content.res.C17465i;
import com.bumptech.glide.C22038b;
import com.bumptech.glide.C22090i;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.C22560g;
import com.bumptech.glide.request.target.C22584p;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.extension.C37113e;
import com.carrefour.fid.android.design.components.utils.C37135b;
import com.carrefour.fid.android.design.components.utils.C37138e;
import com.facebook.shimmer.C14943c;
import com.facebook.shimmer.C14949d;
import com.google.android.datatransport.cct.C40045d;
import com.google.android.material.imageview.ShapeableImageView;
import com.urbanairship.iam.events.C9175a;
import kotlin.C11076d0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002$%B'\b\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\fH\u0002J\f\u0010\u0012\u001a\u00020\u0011*\u00020\fH\u0002R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006&"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/productcard/ImageComponent;", "Lcom/google/android/material/imageview/ShapeableImageView;", "Landroid/graphics/drawable/Drawable;", "getLoadingDrawable", "Lcom/carrefour/fid/android/design/components/widgets/productcard/ImageComponent$a;", "model", "Lkotlin/d2;", "n", "", "enabled", "setEnabled", "r", "Lcom/carrefour/fid/android/design/components/widgets/productcard/ImageComponent$Size;", "imageSize", "o", "Landroid/graphics/drawable/LayerDrawable;", "p", "", "q", "P0", "Lcom/carrefour/fid/android/design/components/widgets/productcard/ImageComponent$a;", "currentModel", "Q0", "Landroid/graphics/drawable/Drawable;", "downloadedImageDrawable", "R0", "Z", "isError", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Size", "a", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class ImageComponent extends ShapeableImageView {

    /* renamed from: S0 */
    public static final int f93597S0 = 8;
    @C12580l

    /* renamed from: P0 */
    public C37313a f93598P0;
    @C12580l

    /* renamed from: Q0 */
    public Drawable f93599Q0;

    /* renamed from: R0 */
    public boolean f93600R0;

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/widgets/productcard/ImageComponent$Size;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "design-components_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public enum Size {
        XL,
        L,
        M,
        f93604d
    }

    /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent$b */
    public /* synthetic */ class C37314b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent$Size[] r0 = com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent.Size.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent$Size r1 = com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent.Size.XL     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent$Size r1 = com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent.Size.L     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent$Size r1 = com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent.Size.M     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent$Size r1 = com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent.Size.f93604d     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent.C37314b.<clinit>():void");
        }
    }

    /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent$c */
    public static final class C37315c implements C22560g<Drawable> {

        /* renamed from: a */
        public final /* synthetic */ ImageComponent f93610a;

        public C37315c(ImageComponent imageComponent) {
            this.f93610a = imageComponent;
        }

        /* renamed from: a */
        public boolean mo66827f(@C12580l Drawable drawable, @C12580l Object obj, @C12580l C22584p<Drawable> pVar, @C12580l DataSource dataSource, boolean z) {
            Drawable drawable2;
            Drawable.ConstantState constantState;
            Drawable newDrawable;
            ImageComponent imageComponent = this.f93610a;
            if (drawable == null || (constantState = drawable.getConstantState()) == null || (newDrawable = constantState.newDrawable()) == null) {
                drawable2 = null;
            } else {
                drawable2 = newDrawable.mutate();
            }
            imageComponent.f93599Q0 = drawable2;
            this.f93610a.mo113655r();
            return true;
        }

        /* renamed from: e */
        public boolean mo66826e(@C12580l GlideException glideException, @C12580l Object obj, @C12580l C22584p<Drawable> pVar, boolean z) {
            this.f93610a.f93600R0 = true;
            this.f93610a.mo113655r();
            return true;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ImageComponent(@C12579k Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    private final Drawable getLoadingDrawable() {
        int color = getResources().getColor(C36896b.C36902f.ds_grey_80, getContext().getTheme());
        C14943c a = ((C14943c.C14946c) ((C14943c.C14946c) ((C14943c.C14946c) ((C14943c.C14946c) ((C14943c.C14946c) new C14943c.C14946c().mo37018l(2000)).mo37014h(1.0f)).mo37022p(1.0f)).mo37033z(color).mo37030A(getResources().getColor(C36896b.C36902f.ds_grey_40, getContext().getTheme())).mo37016j(0)).mo37013g(true)).mo37009a();
        C14949d dVar = new C14949d();
        dVar.mo37037d(a);
        return dVar;
    }

    /* renamed from: n */
    public final void mo113651n(@C12579k C37313a aVar) {
        Intrinsics.checkNotNullParameter(aVar, C40045d.f102104u);
        Drawable loadingDrawable = getLoadingDrawable();
        Drawable o = mo113652o(aVar.mo113662f());
        mo113655r();
        this.f93600R0 = false;
        this.f93598P0 = aVar;
        ((C22090i) ((C22090i) C22038b.m100350E(getContext()).mo65605u(aVar.mo113663g()).mo66765T0(loadingDrawable)).mo66744H(o)).mo65701q1(new C37315c(this)).mo65675K1(this);
    }

    /* renamed from: o */
    public final Drawable mo113652o(Size size) {
        Drawable a;
        float q = mo113654q(size);
        Drawable g = C17465i.m80175g(getResources(), C36896b.C36904h.ds_ic_missing_image, getContext().getTheme());
        if (g == null || (a = C37113e.m152154a(g, (int) q)) == null) {
            throw new IllegalStateException("Can't find drawable: R.drawable.ds_ic_missing_image");
        }
        a.setTint(C17465i.m80173e(getResources(), C36896b.C36902f.ds_grey_20, getContext().getTheme()));
        return a;
    }

    /* renamed from: p */
    public final LayerDrawable mo113653p(Size size) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{mo113652o(size), C37351a.m153509b(this, size)});
        int i = -C37135b.m152206a(mo113654q(size));
        layerDrawable.setLayerInset(1, i, i, i, i);
        return layerDrawable;
    }

    /* renamed from: q */
    public final float mo113654q(Size size) {
        int i;
        int i2 = C37314b.$EnumSwitchMapping$0[size.ordinal()];
        if (i2 == 1) {
            i = C36896b.C36903g.ds_component_image_error_inset_size_xl;
        } else if (i2 == 2) {
            i = C36896b.C36903g.ds_component_image_error_inset_size_l;
        } else if (i2 == 3) {
            i = C36896b.C36903g.ds_component_image_error_inset_size_m;
        } else if (i2 == 4) {
            i = C36896b.C36903g.ds_component_image_error_inset_size_s;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        return C37138e.m152212c(resources, i);
    }

    /* renamed from: r */
    public final void mo113655r() {
        if (this.f93599Q0 != null) {
            ColorMatrix colorMatrix = new ColorMatrix();
            if (isEnabled()) {
                colorMatrix.setSaturation(1.0f);
            } else {
                colorMatrix.setSaturation(0.0f);
            }
            ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(colorMatrix);
            Drawable drawable = this.f93599Q0;
            if (drawable != null) {
                drawable.setColorFilter(colorMatrixColorFilter);
            }
        }
        C37313a aVar = this.f93598P0;
        if (aVar == null) {
            return;
        }
        if (this.f93600R0 && aVar.mo113664h()) {
            setImageDrawable(mo113653p(aVar.mo113662f()));
        } else if (this.f93600R0 && !aVar.mo113664h()) {
            setImageDrawable(mo113652o(aVar.mo113662f()));
        } else if (!this.f93600R0 && !aVar.mo113664h()) {
            setImageDrawable(this.f93599Q0);
        } else if (!this.f93600R0 && aVar.mo113664h()) {
            setImageDrawable(new LayerDrawable(new Drawable[]{this.f93599Q0, C37351a.m153509b(this, aVar.mo113662f())}));
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        mo113655r();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11315i
    public ImageComponent(@C12579k Context context, @C12580l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ImageComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent$a */
    public static final class C37313a {

        /* renamed from: d */
        public static final int f93606d = 0;
        @C12579k

        /* renamed from: a */
        public final String f93607a;
        @C12579k

        /* renamed from: b */
        public final Size f93608b;

        /* renamed from: c */
        public final boolean f93609c;

        public C37313a(@C12579k String str, @C12579k Size size, boolean z) {
            Intrinsics.checkNotNullParameter(str, "imageUrl");
            Intrinsics.checkNotNullParameter(size, "imageSize");
            this.f93607a = str;
            this.f93608b = size;
            this.f93609c = z;
        }

        /* renamed from: e */
        public static /* synthetic */ C37313a m153093e(C37313a aVar, String str, Size size, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = aVar.f93607a;
            }
            if ((i & 2) != 0) {
                size = aVar.f93608b;
            }
            if ((i & 4) != 0) {
                z = aVar.f93609c;
            }
            return aVar.mo113660d(str, size, z);
        }

        @C12579k
        /* renamed from: a */
        public final String mo113657a() {
            return this.f93607a;
        }

        @C12579k
        /* renamed from: b */
        public final Size mo113658b() {
            return this.f93608b;
        }

        /* renamed from: c */
        public final boolean mo113659c() {
            return this.f93609c;
        }

        @C12579k
        /* renamed from: d */
        public final C37313a mo113660d(@C12579k String str, @C12579k Size size, boolean z) {
            Intrinsics.checkNotNullParameter(str, "imageUrl");
            Intrinsics.checkNotNullParameter(size, "imageSize");
            return new C37313a(str, size, z);
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37313a)) {
                return false;
            }
            C37313a aVar = (C37313a) obj;
            return Intrinsics.areEqual((Object) this.f93607a, (Object) aVar.f93607a) && this.f93608b == aVar.f93608b && this.f93609c == aVar.f93609c;
        }

        @C12579k
        /* renamed from: f */
        public final Size mo113662f() {
            return this.f93608b;
        }

        @C12579k
        /* renamed from: g */
        public final String mo113663g() {
            return this.f93607a;
        }

        /* renamed from: h */
        public final boolean mo113664h() {
            return this.f93609c;
        }

        public int hashCode() {
            int hashCode = ((this.f93607a.hashCode() * 31) + this.f93608b.hashCode()) * 31;
            boolean z = this.f93609c;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        @C12579k
        public String toString() {
            String str = this.f93607a;
            Size size = this.f93608b;
            boolean z = this.f93609c;
            return "UiModel(imageUrl=" + str + ", imageSize=" + size + ", showAtcOverlay=" + z + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C37313a(String str, Size size, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, size, (i & 4) != 0 ? false : z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @C11315i
    public ImageComponent(@C12579k Context context, @C12580l AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        setBackgroundColor(getResources().getColor(C36896b.C36902f.ds_grey_80, context.getTheme()));
        setShapeAppearanceModel(getShapeAppearanceModel().mo90822v().mo90844o(getResources().getDimension(C36896b.C36903g.ds_radius_m)).mo90843m());
    }
}

package com.carrefour.fid.android.design.components.widgets.productcard;

import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import androidx.core.content.res.C17465i;
import androidx.core.graphics.C17586h0;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.a */
public final class C37351a {

    /* renamed from: a */
    public static final int f93877a = 63;

    /* renamed from: com.carrefour.fid.android.design.components.widgets.productcard.a$a */
    public /* synthetic */ class C37352a {
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
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.design.components.widgets.productcard.C37351a.C37352a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static final Drawable m153508a(View view) {
        return new ColorDrawable(C17586h0.m80563B(view.getResources().getColor(C36896b.C36902f.ds_primary_alternative, view.getContext().getTheme()), 63));
    }

    @C12579k
    /* renamed from: b */
    public static final Drawable m153509b(@C12579k View view, @C12579k ImageComponent.Size size) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(size, "imageSize");
        Resources resources = view.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        int c = m153510c(size, resources);
        Drawable g = C17465i.m80175g(view.getResources(), C36896b.C36904h.ds_ic_cart_check, view.getContext().getTheme());
        if (g != null) {
            g.setTint(C17465i.m80173e(view.getResources(), C36896b.C36902f.ds_grey_white, view.getContext().getTheme()));
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{m153508a(view), g});
            layerDrawable.setLayerInset(1, c, c, c, c);
            return layerDrawable;
        }
        throw new IllegalStateException("Can't find drawable: R.drawable.ds_ic_cart_check");
    }

    /* renamed from: c */
    public static final int m153510c(ImageComponent.Size size, Resources resources) {
        int i;
        int i2 = C37352a.$EnumSwitchMapping$0[size.ordinal()];
        if (i2 == 1) {
            i = C36896b.C36903g.ds_component_atc_overlay_inset_size_xl;
        } else if (i2 == 2) {
            i = C36896b.C36903g.ds_component_atc_overlay_inset_size_l;
        } else if (i2 == 3) {
            i = C36896b.C36903g.ds_component_atc_overlay_inset_size_m;
        } else if (i2 == 4) {
            i = C36896b.C36903g.ds_component_atc_overlay_inset_size_m;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return resources.getDimensionPixelSize(i);
    }
}

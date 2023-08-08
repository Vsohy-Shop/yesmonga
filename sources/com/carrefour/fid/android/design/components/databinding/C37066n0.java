package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.constraintlayout.widget.C16934c;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.widgets.LoaderMaterialButton;
import com.carrefour.fid.android.design.components.widgets.ProductOverlayComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.FlagFrComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.LabelComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.PriceComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.SponsoredCriteoComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.lozenge.LozengeListComponent;
import com.google.android.material.button.MaterialButton;

/* renamed from: com.carrefour.fid.android.design.components.databinding.n0 */
public final class C37066n0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f92745a;
    @C0359n0

    /* renamed from: b */
    public final LoaderMaterialButton f92746b;
    @C0359n0

    /* renamed from: c */
    public final MaterialButton f92747c;
    @C0359n0

    /* renamed from: d */
    public final SponsoredCriteoComponent f92748d;
    @C0359n0

    /* renamed from: e */
    public final FlagFrComponent f92749e;
    @C0359n0

    /* renamed from: f */
    public final ImageComponent f92750f;
    @C0359n0

    /* renamed from: g */
    public final LabelComponent f92751g;
    @C0359n0

    /* renamed from: h */
    public final LozengeListComponent f92752h;
    @C0359n0

    /* renamed from: i */
    public final ProductOverlayComponent f92753i;
    @C0359n0

    /* renamed from: j */
    public final PriceComponent f92754j;
    @C0359n0

    /* renamed from: k */
    public final TextView f92755k;

    public C37066n0(@C0359n0 View view, @C0359n0 LoaderMaterialButton loaderMaterialButton, @C0359n0 MaterialButton materialButton, @C0359n0 SponsoredCriteoComponent sponsoredCriteoComponent, @C0359n0 FlagFrComponent flagFrComponent, @C0359n0 ImageComponent imageComponent, @C0359n0 LabelComponent labelComponent, @C0359n0 LozengeListComponent lozengeListComponent, @C0359n0 ProductOverlayComponent productOverlayComponent, @C0359n0 PriceComponent priceComponent, @C0359n0 TextView textView) {
        this.f92745a = view;
        this.f92746b = loaderMaterialButton;
        this.f92747c = materialButton;
        this.f92748d = sponsoredCriteoComponent;
        this.f92749e = flagFrComponent;
        this.f92750f = imageComponent;
        this.f92751g = labelComponent;
        this.f92752h = lozengeListComponent;
        this.f92753i = productOverlayComponent;
        this.f92754j = priceComponent;
        this.f92755k = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C37066n0 m152029a(@C0359n0 View view) {
        int i = C36896b.C36906j.product_button_atc;
        LoaderMaterialButton loaderMaterialButton = (LoaderMaterialButton) C20753c.m96463a(view, i);
        if (loaderMaterialButton != null) {
            i = C36896b.C36906j.product_button_quantity;
            MaterialButton materialButton = (MaterialButton) C20753c.m96463a(view, i);
            if (materialButton != null) {
                i = C36896b.C36906j.product_criteo;
                SponsoredCriteoComponent sponsoredCriteoComponent = (SponsoredCriteoComponent) C20753c.m96463a(view, i);
                if (sponsoredCriteoComponent != null) {
                    i = C36896b.C36906j.product_flag_fr;
                    FlagFrComponent flagFrComponent = (FlagFrComponent) C20753c.m96463a(view, i);
                    if (flagFrComponent != null) {
                        i = C36896b.C36906j.product_image;
                        ImageComponent imageComponent = (ImageComponent) C20753c.m96463a(view, i);
                        if (imageComponent != null) {
                            i = C36896b.C36906j.product_label;
                            LabelComponent labelComponent = (LabelComponent) C20753c.m96463a(view, i);
                            if (labelComponent != null) {
                                i = C36896b.C36906j.product_lozenge_list;
                                LozengeListComponent lozengeListComponent = (LozengeListComponent) C20753c.m96463a(view, i);
                                if (lozengeListComponent != null) {
                                    i = C36896b.C36906j.product_mixing_overlay;
                                    ProductOverlayComponent productOverlayComponent = (ProductOverlayComponent) C20753c.m96463a(view, i);
                                    if (productOverlayComponent != null) {
                                        i = C36896b.C36906j.product_price;
                                        PriceComponent priceComponent = (PriceComponent) C20753c.m96463a(view, i);
                                        if (priceComponent != null) {
                                            i = C36896b.C36906j.product_title;
                                            TextView textView = (TextView) C20753c.m96463a(view, i);
                                            if (textView != null) {
                                                return new C37066n0(view, loaderMaterialButton, materialButton, sponsoredCriteoComponent, flagFrComponent, imageComponent, labelComponent, lozengeListComponent, productOverlayComponent, priceComponent, textView);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C37066n0 m152030b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C36896b.C36909m.ds_component_product_card_xs, viewGroup);
            return m152029a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f92745a;
    }
}

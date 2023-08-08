package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.annotation.C0359n0;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.C16934c;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.design.components.C36896b;
import com.carrefour.fid.android.design.components.widgets.LoaderMaterialButton;
import com.carrefour.fid.android.design.components.widgets.NutriscoreComponent;
import com.carrefour.fid.android.design.components.widgets.ProductOverlayComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.ContentComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.FlagFrComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.ImageComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.LabelComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.SponsoredCriteoComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.lozenge.LozengeListComponent;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;

/* renamed from: com.carrefour.fid.android.design.components.databinding.m0 */
public final class C37064m0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f92721a;
    @C0359n0

    /* renamed from: b */
    public final Barrier f92722b;
    @C0359n0

    /* renamed from: c */
    public final Barrier f92723c;
    @C0359n0

    /* renamed from: d */
    public final LabelComponent f92724d;
    @C0359n0

    /* renamed from: e */
    public final MaterialButton f92725e;
    @C0359n0

    /* renamed from: f */
    public final Group f92726f;
    @C0359n0

    /* renamed from: g */
    public final AppCompatImageView f92727g;
    @C0359n0

    /* renamed from: h */
    public final Space f92728h;
    @C0359n0

    /* renamed from: i */
    public final LoaderMaterialButton f92729i;
    @C0359n0

    /* renamed from: j */
    public final LoaderMaterialButton f92730j;
    @C0359n0

    /* renamed from: k */
    public final LoaderMaterialButton f92731k;
    @C0359n0

    /* renamed from: l */
    public final MaterialButton f92732l;
    @C0359n0

    /* renamed from: m */
    public final LoaderMaterialButton f92733m;
    @C0359n0

    /* renamed from: n */
    public final MaterialButton f92734n;
    @C0359n0

    /* renamed from: o */
    public final ContentComponent f92735o;
    @C0359n0

    /* renamed from: p */
    public final SponsoredCriteoComponent f92736p;
    @C0359n0

    /* renamed from: q */
    public final FlagFrComponent f92737q;
    @C0359n0

    /* renamed from: r */
    public final MaterialButtonToggleGroup f92738r;
    @C0359n0

    /* renamed from: s */
    public final ImageComponent f92739s;
    @C0359n0

    /* renamed from: t */
    public final LozengeListComponent f92740t;
    @C0359n0

    /* renamed from: u */
    public final ProductOverlayComponent f92741u;
    @C0359n0

    /* renamed from: v */
    public final NutriscoreComponent f92742v;

    public C37064m0(@C0359n0 View view, @C0359n0 Barrier barrier, @C0359n0 Barrier barrier2, @C0359n0 LabelComponent labelComponent, @C0359n0 MaterialButton materialButton, @C0359n0 Group group, @C0359n0 AppCompatImageView appCompatImageView, @C0359n0 Space space, @C0359n0 LoaderMaterialButton loaderMaterialButton, @C0359n0 LoaderMaterialButton loaderMaterialButton2, @C0359n0 LoaderMaterialButton loaderMaterialButton3, @C0359n0 MaterialButton materialButton2, @C0359n0 LoaderMaterialButton loaderMaterialButton4, @C0359n0 MaterialButton materialButton3, @C0359n0 ContentComponent contentComponent, @C0359n0 SponsoredCriteoComponent sponsoredCriteoComponent, @C0359n0 FlagFrComponent flagFrComponent, @C0359n0 MaterialButtonToggleGroup materialButtonToggleGroup, @C0359n0 ImageComponent imageComponent, @C0359n0 LozengeListComponent lozengeListComponent, @C0359n0 ProductOverlayComponent productOverlayComponent, @C0359n0 NutriscoreComponent nutriscoreComponent) {
        this.f92721a = view;
        this.f92722b = barrier;
        this.f92723c = barrier2;
        this.f92724d = labelComponent;
        this.f92725e = materialButton;
        this.f92726f = group;
        this.f92727g = appCompatImageView;
        this.f92728h = space;
        this.f92729i = loaderMaterialButton;
        this.f92730j = loaderMaterialButton2;
        this.f92731k = loaderMaterialButton3;
        this.f92732l = materialButton2;
        this.f92733m = loaderMaterialButton4;
        this.f92734n = materialButton3;
        this.f92735o = contentComponent;
        this.f92736p = sponsoredCriteoComponent;
        this.f92737q = flagFrComponent;
        this.f92738r = materialButtonToggleGroup;
        this.f92739s = imageComponent;
        this.f92740t = lozengeListComponent;
        this.f92741u = productOverlayComponent;
        this.f92742v = nutriscoreComponent;
    }

    @C0359n0
    /* renamed from: a */
    public static C37064m0 m152025a(@C0359n0 View view) {
        View view2 = view;
        int i = C36896b.C36906j.barrier_for_button_fav;
        Barrier barrier = (Barrier) C20753c.m96463a(view2, i);
        if (barrier != null) {
            i = C36896b.C36906j.barrier_for_content;
            Barrier barrier2 = (Barrier) C20753c.m96463a(view2, i);
            if (barrier2 != null) {
                i = C36896b.C36906j.label_unavailable;
                LabelComponent labelComponent = (LabelComponent) C20753c.m96463a(view2, i);
                if (labelComponent != null) {
                    i = C36896b.C36906j.product_anti_inflation_button;
                    MaterialButton materialButton = (MaterialButton) C20753c.m96463a(view2, i);
                    if (materialButton != null) {
                        i = C36896b.C36906j.product_anti_inflation_group;
                        Group group = (Group) C20753c.m96463a(view2, i);
                        if (group != null) {
                            i = C36896b.C36906j.product_anti_inflation_icon;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) C20753c.m96463a(view2, i);
                            if (appCompatImageView != null) {
                                i = C36896b.C36906j.product_anti_inflation_space;
                                Space space = (Space) C20753c.m96463a(view2, i);
                                if (space != null) {
                                    i = C36896b.C36906j.product_button_atc;
                                    LoaderMaterialButton loaderMaterialButton = (LoaderMaterialButton) C20753c.m96463a(view2, i);
                                    if (loaderMaterialButton != null) {
                                        i = C36896b.C36906j.product_button_delete;
                                        LoaderMaterialButton loaderMaterialButton2 = (LoaderMaterialButton) C20753c.m96463a(view2, i);
                                        if (loaderMaterialButton2 != null) {
                                            i = C36896b.C36906j.product_button_fav;
                                            LoaderMaterialButton loaderMaterialButton3 = (LoaderMaterialButton) C20753c.m96463a(view2, i);
                                            if (loaderMaterialButton3 != null) {
                                                i = C36896b.C36906j.product_button_more_choices;
                                                MaterialButton materialButton2 = (MaterialButton) C20753c.m96463a(view2, i);
                                                if (materialButton2 != null) {
                                                    i = C36896b.C36906j.product_button_quantity;
                                                    LoaderMaterialButton loaderMaterialButton4 = (LoaderMaterialButton) C20753c.m96463a(view2, i);
                                                    if (loaderMaterialButton4 != null) {
                                                        i = C36896b.C36906j.product_button_see_more;
                                                        MaterialButton materialButton3 = (MaterialButton) C20753c.m96463a(view2, i);
                                                        if (materialButton3 != null) {
                                                            i = C36896b.C36906j.product_content;
                                                            ContentComponent contentComponent = (ContentComponent) C20753c.m96463a(view2, i);
                                                            if (contentComponent != null) {
                                                                i = C36896b.C36906j.product_criteo;
                                                                SponsoredCriteoComponent sponsoredCriteoComponent = (SponsoredCriteoComponent) C20753c.m96463a(view2, i);
                                                                if (sponsoredCriteoComponent != null) {
                                                                    i = C36896b.C36906j.product_flag_fr;
                                                                    FlagFrComponent flagFrComponent = (FlagFrComponent) C20753c.m96463a(view2, i);
                                                                    if (flagFrComponent != null) {
                                                                        i = C36896b.C36906j.product_group_fav;
                                                                        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) C20753c.m96463a(view2, i);
                                                                        if (materialButtonToggleGroup != null) {
                                                                            i = C36896b.C36906j.product_image;
                                                                            ImageComponent imageComponent = (ImageComponent) C20753c.m96463a(view2, i);
                                                                            if (imageComponent != null) {
                                                                                i = C36896b.C36906j.product_lozenge_list;
                                                                                LozengeListComponent lozengeListComponent = (LozengeListComponent) C20753c.m96463a(view2, i);
                                                                                if (lozengeListComponent != null) {
                                                                                    i = C36896b.C36906j.product_mixing_overlay;
                                                                                    ProductOverlayComponent productOverlayComponent = (ProductOverlayComponent) C20753c.m96463a(view2, i);
                                                                                    if (productOverlayComponent != null) {
                                                                                        i = C36896b.C36906j.product_nutriscore;
                                                                                        NutriscoreComponent nutriscoreComponent = (NutriscoreComponent) C20753c.m96463a(view2, i);
                                                                                        if (nutriscoreComponent != null) {
                                                                                            return new C37064m0(view, barrier, barrier2, labelComponent, materialButton, group, appCompatImageView, space, loaderMaterialButton, loaderMaterialButton2, loaderMaterialButton3, materialButton2, loaderMaterialButton4, materialButton3, contentComponent, sponsoredCriteoComponent, flagFrComponent, materialButtonToggleGroup, imageComponent, lozengeListComponent, productOverlayComponent, nutriscoreComponent);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C37064m0 m152026b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C36896b.C36909m.ds_component_product_card_s, viewGroup);
            return m152025a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f92721a;
    }
}

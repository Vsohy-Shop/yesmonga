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
import com.carrefour.fid.android.design.components.widgets.productcard.DeliveryComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.LabelComponent;
import com.carrefour.fid.android.design.components.widgets.productcard.PriceComponent;

/* renamed from: com.carrefour.fid.android.design.components.databinding.f */
public final class C37043f implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f92623a;
    @C0359n0

    /* renamed from: b */
    public final LabelComponent f92624b;
    @C0359n0

    /* renamed from: c */
    public final PriceComponent f92625c;
    @C0359n0

    /* renamed from: d */
    public final TextView f92626d;
    @C0359n0

    /* renamed from: e */
    public final TextView f92627e;
    @C0359n0

    /* renamed from: f */
    public final DeliveryComponent f92628f;
    @C0359n0

    /* renamed from: g */
    public final TextView f92629g;
    @C0359n0

    /* renamed from: h */
    public final TextView f92630h;

    public C37043f(@C0359n0 View view, @C0359n0 LabelComponent labelComponent, @C0359n0 PriceComponent priceComponent, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 DeliveryComponent deliveryComponent, @C0359n0 TextView textView3, @C0359n0 TextView textView4) {
        this.f92623a = view;
        this.f92624b = labelComponent;
        this.f92625c = priceComponent;
        this.f92626d = textView;
        this.f92627e = textView2;
        this.f92628f = deliveryComponent;
        this.f92629g = textView3;
        this.f92630h = textView4;
    }

    @C0359n0
    /* renamed from: a */
    public static C37043f m151963a(@C0359n0 View view) {
        int i = C36896b.C36906j.content_label;
        LabelComponent labelComponent = (LabelComponent) C20753c.m96463a(view, i);
        if (labelComponent != null) {
            i = C36896b.C36906j.content_price;
            PriceComponent priceComponent = (PriceComponent) C20753c.m96463a(view, i);
            if (priceComponent != null) {
                i = C36896b.C36906j.content_text;
                TextView textView = (TextView) C20753c.m96463a(view, i);
                if (textView != null) {
                    i = C36896b.C36906j.content_title;
                    TextView textView2 = (TextView) C20753c.m96463a(view, i);
                    if (textView2 != null) {
                        i = C36896b.C36906j.delivery_mode;
                        DeliveryComponent deliveryComponent = (DeliveryComponent) C20753c.m96463a(view, i);
                        if (deliveryComponent != null) {
                            i = C36896b.C36906j.text_brand;
                            TextView textView3 = (TextView) C20753c.m96463a(view, i);
                            if (textView3 != null) {
                                i = C36896b.C36906j.text_label_highlight;
                                TextView textView4 = (TextView) C20753c.m96463a(view, i);
                                if (textView4 != null) {
                                    return new C37043f(view, labelComponent, priceComponent, textView, textView2, deliveryComponent, textView3, textView4);
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
    public static C37043f m151964b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C36896b.C36909m.ds_component_content, viewGroup);
            return m151963a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f92623a;
    }
}

package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.storelocator.p048ui.customview.ExceptionalOpeningView;
import com.carrefour.fid.android.storelocator.p048ui.customview.StoreHourDayView;

/* renamed from: com.carrefour.fid.android.databinding.x6 */
public final class C36875x6 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final NestedScrollView f91911a;
    @C0359n0

    /* renamed from: b */
    public final Button f91912b;
    @C0359n0

    /* renamed from: c */
    public final NestedScrollView f91913c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91914d;
    @C0359n0

    /* renamed from: e */
    public final ImageView f91915e;
    @C0359n0

    /* renamed from: f */
    public final ImageButton f91916f;
    @C0359n0

    /* renamed from: g */
    public final RelativeLayout f91917g;
    @C0359n0

    /* renamed from: h */
    public final TextView f91918h;
    @C0359n0

    /* renamed from: i */
    public final TextView f91919i;
    @C0359n0

    /* renamed from: j */
    public final ExceptionalOpeningView f91920j;
    @C0359n0

    /* renamed from: k */
    public final TextView f91921k;
    @C0359n0

    /* renamed from: l */
    public final TextView f91922l;
    @C0359n0

    /* renamed from: m */
    public final StoreHourDayView f91923m;
    @C0359n0

    /* renamed from: n */
    public final View f91924n;

    public C36875x6(@C0359n0 NestedScrollView nestedScrollView, @C0359n0 Button button, @C0359n0 NestedScrollView nestedScrollView2, @C0359n0 TextView textView, @C0359n0 ImageView imageView, @C0359n0 ImageButton imageButton, @C0359n0 RelativeLayout relativeLayout, @C0359n0 TextView textView2, @C0359n0 TextView textView3, @C0359n0 ExceptionalOpeningView exceptionalOpeningView, @C0359n0 TextView textView4, @C0359n0 TextView textView5, @C0359n0 StoreHourDayView storeHourDayView, @C0359n0 View view) {
        this.f91911a = nestedScrollView;
        this.f91912b = button;
        this.f91913c = nestedScrollView2;
        this.f91914d = textView;
        this.f91915e = imageView;
        this.f91916f = imageButton;
        this.f91917g = relativeLayout;
        this.f91918h = textView2;
        this.f91919i = textView3;
        this.f91920j = exceptionalOpeningView;
        this.f91921k = textView4;
        this.f91922l = textView5;
        this.f91923m = storeHourDayView;
        this.f91924n = view;
    }

    @C0359n0
    /* renamed from: a */
    public static C36875x6 m151215a(@C0359n0 View view) {
        View view2 = view;
        int i = R.id.addToFavoriteButton;
        Button button = (Button) C20753c.m96463a(view2, R.id.addToFavoriteButton);
        if (button != null) {
            NestedScrollView nestedScrollView = (NestedScrollView) view2;
            i = R.id.distance;
            TextView textView = (TextView) C20753c.m96463a(view2, R.id.distance);
            if (textView != null) {
                i = R.id.imgServiceIcon;
                ImageView imageView = (ImageView) C20753c.m96463a(view2, R.id.imgServiceIcon);
                if (imageView != null) {
                    i = R.id.phoneCallButton;
                    ImageButton imageButton = (ImageButton) C20753c.m96463a(view2, R.id.phoneCallButton);
                    if (imageButton != null) {
                        i = R.id.phoneCallContainer;
                        RelativeLayout relativeLayout = (RelativeLayout) C20753c.m96463a(view2, R.id.phoneCallContainer);
                        if (relativeLayout != null) {
                            i = R.id.phoneNumber;
                            TextView textView2 = (TextView) C20753c.m96463a(view2, R.id.phoneNumber);
                            if (textView2 != null) {
                                i = R.id.storeAddress;
                                TextView textView3 = (TextView) C20753c.m96463a(view2, R.id.storeAddress);
                                if (textView3 != null) {
                                    i = R.id.storeExceptionalOpeningBottomView;
                                    ExceptionalOpeningView exceptionalOpeningView = (ExceptionalOpeningView) C20753c.m96463a(view2, R.id.storeExceptionalOpeningBottomView);
                                    if (exceptionalOpeningView != null) {
                                        i = R.id.storeHour;
                                        TextView textView4 = (TextView) C20753c.m96463a(view2, R.id.storeHour);
                                        if (textView4 != null) {
                                            i = R.id.storeName;
                                            TextView textView5 = (TextView) C20753c.m96463a(view2, R.id.storeName);
                                            if (textView5 != null) {
                                                i = R.id.storeOpeningBottomView;
                                                StoreHourDayView storeHourDayView = (StoreHourDayView) C20753c.m96463a(view2, R.id.storeOpeningBottomView);
                                                if (storeHourDayView != null) {
                                                    i = R.id.storeTopStroke;
                                                    View a = C20753c.m96463a(view2, R.id.storeTopStroke);
                                                    if (a != null) {
                                                        return new C36875x6(nestedScrollView, button, nestedScrollView, textView, imageView, imageButton, relativeLayout, textView2, textView3, exceptionalOpeningView, textView4, textView5, storeHourDayView, a);
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
    /* renamed from: c */
    public static C36875x6 m151216c(@C0359n0 LayoutInflater layoutInflater) {
        return m151217d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36875x6 m151217d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.peek_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151215a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public NestedScrollView getRoot() {
        return this.f91911a;
    }
}

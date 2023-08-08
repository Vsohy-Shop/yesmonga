package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.presentation.components.service.CustomerServiceCardView;

/* renamed from: com.carrefour.fid.android.databinding.j7 */
public final class C36736j7 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final NestedScrollView f91079a;
    @C0359n0

    /* renamed from: b */
    public final CustomerServiceCardView f91080b;
    @C0359n0

    /* renamed from: c */
    public final ConstraintLayout f91081c;
    @C0359n0

    /* renamed from: d */
    public final TextView f91082d;
    @C0359n0

    /* renamed from: e */
    public final TextView f91083e;
    @C0359n0

    /* renamed from: f */
    public final C36726i7 f91084f;
    @C0359n0

    /* renamed from: g */
    public final TextView f91085g;
    @C0359n0

    /* renamed from: h */
    public final TextView f91086h;
    @C0359n0

    /* renamed from: i */
    public final TextView f91087i;
    @C0359n0

    /* renamed from: j */
    public final C36716h7 f91088j;
    @C0359n0

    /* renamed from: k */
    public final TextView f91089k;
    @C0359n0

    /* renamed from: l */
    public final TextView f91090l;
    @C0359n0

    /* renamed from: m */
    public final View f91091m;
    @C0359n0

    /* renamed from: n */
    public final View f91092n;
    @C0359n0

    /* renamed from: o */
    public final ConstraintLayout f91093o;
    @C0359n0

    /* renamed from: p */
    public final TextView f91094p;
    @C0359n0

    /* renamed from: q */
    public final TextView f91095q;
    @C0359n0

    /* renamed from: r */
    public final TextView f91096r;
    @C0359n0

    /* renamed from: s */
    public final TextView f91097s;

    public C36736j7(@C0359n0 NestedScrollView nestedScrollView, @C0359n0 CustomerServiceCardView customerServiceCardView, @C0359n0 ConstraintLayout constraintLayout, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 C36726i7 i7Var, @C0359n0 TextView textView3, @C0359n0 TextView textView4, @C0359n0 TextView textView5, @C0359n0 C36716h7 h7Var, @C0359n0 TextView textView6, @C0359n0 TextView textView7, @C0359n0 View view, @C0359n0 View view2, @C0359n0 ConstraintLayout constraintLayout2, @C0359n0 TextView textView8, @C0359n0 TextView textView9, @C0359n0 TextView textView10, @C0359n0 TextView textView11) {
        this.f91079a = nestedScrollView;
        this.f91080b = customerServiceCardView;
        this.f91081c = constraintLayout;
        this.f91082d = textView;
        this.f91083e = textView2;
        this.f91084f = i7Var;
        this.f91085g = textView3;
        this.f91086h = textView4;
        this.f91087i = textView5;
        this.f91088j = h7Var;
        this.f91089k = textView6;
        this.f91090l = textView7;
        this.f91091m = view;
        this.f91092n = view2;
        this.f91093o = constraintLayout2;
        this.f91094p = textView8;
        this.f91095q = textView9;
        this.f91096r = textView10;
        this.f91097s = textView11;
    }

    @C0359n0
    /* renamed from: a */
    public static C36736j7 m150671a(@C0359n0 View view) {
        View view2 = view;
        int i = R.id.customViewCustomerService;
        CustomerServiceCardView customerServiceCardView = (CustomerServiceCardView) C20753c.m96463a(view2, R.id.customViewCustomerService);
        if (customerServiceCardView != null) {
            i = R.id.customerService;
            ConstraintLayout constraintLayout = (ConstraintLayout) C20753c.m96463a(view2, R.id.customerService);
            if (constraintLayout != null) {
                i = R.id.optin_title;
                TextView textView = (TextView) C20753c.m96463a(view2, R.id.optin_title);
                if (textView != null) {
                    i = R.id.service_date;
                    TextView textView2 = (TextView) C20753c.m96463a(view2, R.id.service_date);
                    if (textView2 != null) {
                        i = R.id.service_fid_block;
                        View a = C20753c.m96463a(view2, R.id.service_fid_block);
                        if (a != null) {
                            C36726i7 a2 = C36726i7.m150631a(a);
                            i = R.id.service_find_station;
                            TextView textView3 = (TextView) C20753c.m96463a(view2, R.id.service_find_station);
                            if (textView3 != null) {
                                i = R.id.service_first_number;
                                TextView textView4 = (TextView) C20753c.m96463a(view2, R.id.service_first_number);
                                if (textView4 != null) {
                                    i = R.id.service_first_txt;
                                    TextView textView5 = (TextView) C20753c.m96463a(view2, R.id.service_first_txt);
                                    if (textView5 != null) {
                                        i = R.id.service_scan_block;
                                        View a3 = C20753c.m96463a(view2, R.id.service_scan_block);
                                        if (a3 != null) {
                                            C36716h7 a4 = C36716h7.m150591a(a3);
                                            i = R.id.service_second_number;
                                            TextView textView6 = (TextView) C20753c.m96463a(view2, R.id.service_second_number);
                                            if (textView6 != null) {
                                                i = R.id.service_second_txt;
                                                TextView textView7 = (TextView) C20753c.m96463a(view2, R.id.service_second_txt);
                                                if (textView7 != null) {
                                                    i = R.id.service_separator;
                                                    View a5 = C20753c.m96463a(view2, R.id.service_separator);
                                                    if (a5 != null) {
                                                        i = R.id.service_separator2;
                                                        View a6 = C20753c.m96463a(view2, R.id.service_separator2);
                                                        if (a6 != null) {
                                                            i = R.id.serviceStationsContent;
                                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) C20753c.m96463a(view2, R.id.serviceStationsContent);
                                                            if (constraintLayout2 != null) {
                                                                i = R.id.service_subtitle;
                                                                TextView textView8 = (TextView) C20753c.m96463a(view2, R.id.service_subtitle);
                                                                if (textView8 != null) {
                                                                    i = R.id.service_third_number;
                                                                    TextView textView9 = (TextView) C20753c.m96463a(view2, R.id.service_third_number);
                                                                    if (textView9 != null) {
                                                                        i = R.id.service_third_txt;
                                                                        TextView textView10 = (TextView) C20753c.m96463a(view2, R.id.service_third_txt);
                                                                        if (textView10 != null) {
                                                                            i = R.id.service_title;
                                                                            TextView textView11 = (TextView) C20753c.m96463a(view2, R.id.service_title);
                                                                            if (textView11 != null) {
                                                                                return new C36736j7((NestedScrollView) view2, customerServiceCardView, constraintLayout, textView, textView2, a2, textView3, textView4, textView5, a4, textView6, textView7, a5, a6, constraintLayout2, textView8, textView9, textView10, textView11);
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
    /* renamed from: c */
    public static C36736j7 m150672c(@C0359n0 LayoutInflater layoutInflater) {
        return m150673d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36736j7 m150673d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.service_station_content, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150671a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public NestedScrollView getRoot() {
        return this.f91079a;
    }
}

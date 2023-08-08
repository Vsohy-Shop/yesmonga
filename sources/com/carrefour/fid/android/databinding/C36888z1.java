package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import androidx.viewpager.widget.ViewPager;
import com.carrefour.fid.android.R;
import com.google.android.material.tabs.TabLayout;

/* renamed from: com.carrefour.fid.android.databinding.z1 */
public final class C36888z1 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ScrollView f91999a;
    @C0359n0

    /* renamed from: b */
    public final Button f92000b;
    @C0359n0

    /* renamed from: c */
    public final Button f92001c;
    @C0359n0

    /* renamed from: d */
    public final TabLayout f92002d;
    @C0359n0

    /* renamed from: e */
    public final TextView f92003e;
    @C0359n0

    /* renamed from: f */
    public final TextView f92004f;
    @C0359n0

    /* renamed from: g */
    public final TextView f92005g;
    @C0359n0

    /* renamed from: h */
    public final TextView f92006h;
    @C0359n0

    /* renamed from: i */
    public final TextView f92007i;
    @C0359n0

    /* renamed from: j */
    public final TextView f92008j;
    @C0359n0

    /* renamed from: k */
    public final ViewPager f92009k;

    public C36888z1(@C0359n0 ScrollView scrollView, @C0359n0 Button button, @C0359n0 Button button2, @C0359n0 TabLayout tabLayout, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 TextView textView3, @C0359n0 TextView textView4, @C0359n0 TextView textView5, @C0359n0 TextView textView6, @C0359n0 ViewPager viewPager) {
        this.f91999a = scrollView;
        this.f92000b = button;
        this.f92001c = button2;
        this.f92002d = tabLayout;
        this.f92003e = textView;
        this.f92004f = textView2;
        this.f92005g = textView3;
        this.f92006h = textView4;
        this.f92007i = textView5;
        this.f92008j = textView6;
        this.f92009k = viewPager;
    }

    @C0359n0
    /* renamed from: a */
    public static C36888z1 m151265a(@C0359n0 View view) {
        int i = R.id.button_fragment_home_loyalty_attach;
        Button button = (Button) C20753c.m96463a(view, R.id.button_fragment_home_loyalty_attach);
        if (button != null) {
            i = R.id.button_fragment_home_loyalty_create;
            Button button2 = (Button) C20753c.m96463a(view, R.id.button_fragment_home_loyalty_create);
            if (button2 != null) {
                i = R.id.tab_fragment_home_loyalty;
                TabLayout tabLayout = (TabLayout) C20753c.m96463a(view, R.id.tab_fragment_home_loyalty);
                if (tabLayout != null) {
                    i = R.id.text_fragment_home_loyalty_1;
                    TextView textView = (TextView) C20753c.m96463a(view, R.id.text_fragment_home_loyalty_1);
                    if (textView != null) {
                        i = R.id.text_fragment_home_loyalty_2;
                        TextView textView2 = (TextView) C20753c.m96463a(view, R.id.text_fragment_home_loyalty_2);
                        if (textView2 != null) {
                            i = R.id.text_fragment_home_loyalty_3;
                            TextView textView3 = (TextView) C20753c.m96463a(view, R.id.text_fragment_home_loyalty_3);
                            if (textView3 != null) {
                                i = R.id.text_fragment_home_loyalty_4;
                                TextView textView4 = (TextView) C20753c.m96463a(view, R.id.text_fragment_home_loyalty_4);
                                if (textView4 != null) {
                                    i = R.id.text_fragment_home_loyalty_subtitle;
                                    TextView textView5 = (TextView) C20753c.m96463a(view, R.id.text_fragment_home_loyalty_subtitle);
                                    if (textView5 != null) {
                                        i = R.id.text_fragment_home_loyalty_title;
                                        TextView textView6 = (TextView) C20753c.m96463a(view, R.id.text_fragment_home_loyalty_title);
                                        if (textView6 != null) {
                                            i = R.id.view_pager_fragment_home_loyalty;
                                            ViewPager viewPager = (ViewPager) C20753c.m96463a(view, R.id.view_pager_fragment_home_loyalty);
                                            if (viewPager != null) {
                                                return new C36888z1((ScrollView) view, button, button2, tabLayout, textView, textView2, textView3, textView4, textView5, textView6, viewPager);
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
    public static C36888z1 m151266c(@C0359n0 LayoutInflater layoutInflater) {
        return m151267d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36888z1 m151267d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_create_or_attach_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151265a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ScrollView getRoot() {
        return this.f91999a;
    }
}

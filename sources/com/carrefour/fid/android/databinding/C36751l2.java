package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.facebook.shimmer.ShimmerFrameLayout;

/* renamed from: com.carrefour.fid.android.databinding.l2 */
public final class C36751l2 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91186a;
    @C0359n0

    /* renamed from: b */
    public final Group f91187b;
    @C0359n0

    /* renamed from: c */
    public final TextView f91188c;
    @C0359n0

    /* renamed from: d */
    public final LinearLayout f91189d;
    @C0359n0

    /* renamed from: e */
    public final TextView f91190e;
    @C0359n0

    /* renamed from: f */
    public final ShimmerFrameLayout f91191f;
    @C0359n0

    /* renamed from: g */
    public final Button f91192g;
    @C0359n0

    /* renamed from: h */
    public final TextView f91193h;
    @C0359n0

    /* renamed from: i */
    public final RecyclerView f91194i;
    @C0359n0

    /* renamed from: j */
    public final TextView f91195j;
    @C0359n0

    /* renamed from: k */
    public final ProgressBar f91196k;

    public C36751l2(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 Group group, @C0359n0 TextView textView, @C0359n0 LinearLayout linearLayout, @C0359n0 TextView textView2, @C0359n0 ShimmerFrameLayout shimmerFrameLayout, @C0359n0 Button button, @C0359n0 TextView textView3, @C0359n0 RecyclerView recyclerView, @C0359n0 TextView textView4, @C0359n0 ProgressBar progressBar) {
        this.f91186a = constraintLayout;
        this.f91187b = group;
        this.f91188c = textView;
        this.f91189d = linearLayout;
        this.f91190e = textView2;
        this.f91191f = shimmerFrameLayout;
        this.f91192g = button;
        this.f91193h = textView3;
        this.f91194i = recyclerView;
        this.f91195j = textView4;
        this.f91196k = progressBar;
    }

    @C0359n0
    /* renamed from: a */
    public static C36751l2 m150731a(@C0359n0 View view) {
        int i = R.id.groupContent;
        Group group = (Group) C20753c.m96463a(view, R.id.groupContent);
        if (group != null) {
            i = R.id.joinLoyaltyRewards;
            TextView textView = (TextView) C20753c.m96463a(view, R.id.joinLoyaltyRewards);
            if (textView != null) {
                i = R.id.linearLayout3;
                LinearLayout linearLayout = (LinearLayout) C20753c.m96463a(view, R.id.linearLayout3);
                if (linearLayout != null) {
                    i = R.id.loyaltyBonusInformation;
                    TextView textView2 = (TextView) C20753c.m96463a(view, R.id.loyaltyBonusInformation);
                    if (textView2 != null) {
                        i = R.id.loyaltyBonusShimmer;
                        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C20753c.m96463a(view, R.id.loyaltyBonusShimmer);
                        if (shimmerFrameLayout != null) {
                            i = R.id.loyaltyBonusValidate;
                            Button button = (Button) C20753c.m96463a(view, R.id.loyaltyBonusValidate);
                            if (button != null) {
                                i = R.id.loyaltyIgnoreBonus;
                                TextView textView3 = (TextView) C20753c.m96463a(view, R.id.loyaltyIgnoreBonus);
                                if (textView3 != null) {
                                    i = R.id.loyaltyListBonus;
                                    RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, R.id.loyaltyListBonus);
                                    if (recyclerView != null) {
                                        i = R.id.loyalty_secret_code_description;
                                        TextView textView4 = (TextView) C20753c.m96463a(view, R.id.loyalty_secret_code_description);
                                        if (textView4 != null) {
                                            i = R.id.progress_fragment_attach_card_submit;
                                            ProgressBar progressBar = (ProgressBar) C20753c.m96463a(view, R.id.progress_fragment_attach_card_submit);
                                            if (progressBar != null) {
                                                return new C36751l2((ConstraintLayout) view, group, textView, linearLayout, textView2, shimmerFrameLayout, button, textView3, recyclerView, textView4, progressBar);
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
    public static C36751l2 m150732c(@C0359n0 LayoutInflater layoutInflater) {
        return m150733d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36751l2 m150733d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_loyalty_bonus_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150731a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91186a;
    }
}

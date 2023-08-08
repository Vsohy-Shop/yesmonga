package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.u3 */
public final class C36842u3 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f91741a;
    @C0359n0

    /* renamed from: b */
    public final Button f91742b;
    @C0359n0

    /* renamed from: c */
    public final LinearLayout f91743c;
    @C0359n0

    /* renamed from: d */
    public final RecyclerView f91744d;
    @C0359n0

    /* renamed from: e */
    public final TextView f91745e;
    @C0359n0

    /* renamed from: f */
    public final TextView f91746f;

    public C36842u3(@C0359n0 LinearLayout linearLayout, @C0359n0 Button button, @C0359n0 LinearLayout linearLayout2, @C0359n0 RecyclerView recyclerView, @C0359n0 TextView textView, @C0359n0 TextView textView2) {
        this.f91741a = linearLayout;
        this.f91742b = button;
        this.f91743c = linearLayout2;
        this.f91744d = recyclerView;
        this.f91745e = textView;
        this.f91746f = textView2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36842u3 m151089a(@C0359n0 View view) {
        int i = R.id.btStartUseApp;
        Button button = (Button) C20753c.m96463a(view, R.id.btStartUseApp);
        if (button != null) {
            i = R.id.layoutListPrime;
            LinearLayout linearLayout = (LinearLayout) C20753c.m96463a(view, R.id.layoutListPrime);
            if (linearLayout != null) {
                i = R.id.listPrimeFid;
                RecyclerView recyclerView = (RecyclerView) C20753c.m96463a(view, R.id.listPrimeFid);
                if (recyclerView != null) {
                    i = R.id.loyaltyCreateCardTitleSuccess;
                    TextView textView = (TextView) C20753c.m96463a(view, R.id.loyaltyCreateCardTitleSuccess);
                    if (textView != null) {
                        i = R.id.loyaltyEmptyListPrimeFidMessage;
                        TextView textView2 = (TextView) C20753c.m96463a(view, R.id.loyaltyEmptyListPrimeFidMessage);
                        if (textView2 != null) {
                            return new C36842u3((LinearLayout) view, button, linearLayout, recyclerView, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36842u3 m151090c(@C0359n0 LayoutInflater layoutInflater) {
        return m151091d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36842u3 m151091d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_success_create_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151089a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f91741a;
    }
}

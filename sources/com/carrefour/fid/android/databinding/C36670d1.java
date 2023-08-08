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
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.presentation.components.selection.AddressConflictsSelection;

/* renamed from: com.carrefour.fid.android.databinding.d1 */
public final class C36670d1 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final LinearLayout f90709a;
    @C0359n0

    /* renamed from: b */
    public final Button f90710b;
    @C0359n0

    /* renamed from: c */
    public final ProgressBar f90711c;
    @C0359n0

    /* renamed from: d */
    public final TextView f90712d;
    @C0359n0

    /* renamed from: e */
    public final AddressConflictsSelection f90713e;
    @C0359n0

    /* renamed from: f */
    public final AddressConflictsSelection f90714f;

    public C36670d1(@C0359n0 LinearLayout linearLayout, @C0359n0 Button button, @C0359n0 ProgressBar progressBar, @C0359n0 TextView textView, @C0359n0 AddressConflictsSelection addressConflictsSelection, @C0359n0 AddressConflictsSelection addressConflictsSelection2) {
        this.f90709a = linearLayout;
        this.f90710b = button;
        this.f90711c = progressBar;
        this.f90712d = textView;
        this.f90713e = addressConflictsSelection;
        this.f90714f = addressConflictsSelection2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36670d1 m150409a(@C0359n0 View view) {
        int i = R.id.button_checkout_address_selection_submit;
        Button button = (Button) C20753c.m96463a(view, R.id.button_checkout_address_selection_submit);
        if (button != null) {
            i = R.id.progressBar_checkout_address_selection;
            ProgressBar progressBar = (ProgressBar) C20753c.m96463a(view, R.id.progressBar_checkout_address_selection);
            if (progressBar != null) {
                i = R.id.text_checkout_address_selection_title;
                TextView textView = (TextView) C20753c.m96463a(view, R.id.text_checkout_address_selection_title);
                if (textView != null) {
                    i = R.id.view_checkout_first_address;
                    AddressConflictsSelection addressConflictsSelection = (AddressConflictsSelection) C20753c.m96463a(view, R.id.view_checkout_first_address);
                    if (addressConflictsSelection != null) {
                        i = R.id.view_checkout_second_address;
                        AddressConflictsSelection addressConflictsSelection2 = (AddressConflictsSelection) C20753c.m96463a(view, R.id.view_checkout_second_address);
                        if (addressConflictsSelection2 != null) {
                            return new C36670d1((LinearLayout) view, button, progressBar, textView, addressConflictsSelection, addressConflictsSelection2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36670d1 m150410c(@C0359n0 LayoutInflater layoutInflater) {
        return m150411d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36670d1 m150411d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_checkout_address_conflicts, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150409a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public LinearLayout getRoot() {
        return this.f90709a;
    }
}

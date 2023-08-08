package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.PinEntryEditText;

/* renamed from: com.carrefour.fid.android.databinding.z2 */
public final class C36889z2 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f92010a;
    @C0359n0

    /* renamed from: b */
    public final Button f92011b;
    @C0359n0

    /* renamed from: c */
    public final PinEntryEditText f92012c;
    @C0359n0

    /* renamed from: d */
    public final ImageView f92013d;
    @C0359n0

    /* renamed from: e */
    public final TextView f92014e;
    @C0359n0

    /* renamed from: f */
    public final LinearLayout f92015f;
    @C0359n0

    /* renamed from: g */
    public final ProgressBar f92016g;
    @C0359n0

    /* renamed from: h */
    public final TextView f92017h;
    @C0359n0

    /* renamed from: i */
    public final TextView f92018i;

    public C36889z2(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 Button button, @C0359n0 PinEntryEditText pinEntryEditText, @C0359n0 ImageView imageView, @C0359n0 TextView textView, @C0359n0 LinearLayout linearLayout, @C0359n0 ProgressBar progressBar, @C0359n0 TextView textView2, @C0359n0 TextView textView3) {
        this.f92010a = constraintLayout;
        this.f92011b = button;
        this.f92012c = pinEntryEditText;
        this.f92013d = imageView;
        this.f92014e = textView;
        this.f92015f = linearLayout;
        this.f92016g = progressBar;
        this.f92017h = textView2;
        this.f92018i = textView3;
    }

    @C0359n0
    /* renamed from: a */
    public static C36889z2 m151269a(@C0359n0 View view) {
        int i = R.id.btn_validate_attach_card;
        Button button = (Button) C20753c.m96463a(view, R.id.btn_validate_attach_card);
        if (button != null) {
            i = R.id.edt_secret_code;
            PinEntryEditText pinEntryEditText = (PinEntryEditText) C20753c.m96463a(view, R.id.edt_secret_code);
            if (pinEntryEditText != null) {
                i = R.id.img_eye;
                ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.img_eye);
                if (imageView != null) {
                    i = R.id.loyalty_channel_title;
                    TextView textView = (TextView) C20753c.m96463a(view, R.id.loyalty_channel_title);
                    if (textView != null) {
                        i = R.id.lytCodeSecret;
                        LinearLayout linearLayout = (LinearLayout) C20753c.m96463a(view, R.id.lytCodeSecret);
                        if (linearLayout != null) {
                            i = R.id.progress_bar_secret_code;
                            ProgressBar progressBar = (ProgressBar) C20753c.m96463a(view, R.id.progress_bar_secret_code);
                            if (progressBar != null) {
                                i = R.id.txt_error_code;
                                TextView textView2 = (TextView) C20753c.m96463a(view, R.id.txt_error_code);
                                if (textView2 != null) {
                                    i = R.id.txt_link_get_my_code;
                                    TextView textView3 = (TextView) C20753c.m96463a(view, R.id.txt_link_get_my_code);
                                    if (textView3 != null) {
                                        return new C36889z2((ConstraintLayout) view, button, pinEntryEditText, imageView, textView, linearLayout, progressBar, textView2, textView3);
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
    public static C36889z2 m151270c(@C0359n0 LayoutInflater layoutInflater) {
        return m151271d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36889z2 m151271d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_otp_code, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151269a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f92010a;
    }
}

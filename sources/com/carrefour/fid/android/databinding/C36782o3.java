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

/* renamed from: com.carrefour.fid.android.databinding.o3 */
public final class C36782o3 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f91422a;
    @C0359n0

    /* renamed from: b */
    public final Button f91423b;
    @C0359n0

    /* renamed from: c */
    public final PinEntryEditText f91424c;
    @C0359n0

    /* renamed from: d */
    public final ImageView f91425d;
    @C0359n0

    /* renamed from: e */
    public final TextView f91426e;
    @C0359n0

    /* renamed from: f */
    public final LinearLayout f91427f;
    @C0359n0

    /* renamed from: g */
    public final ProgressBar f91428g;
    @C0359n0

    /* renamed from: h */
    public final TextView f91429h;
    @C0359n0

    /* renamed from: i */
    public final TextView f91430i;
    @C0359n0

    /* renamed from: j */
    public final TextView f91431j;
    @C0359n0

    /* renamed from: k */
    public final TextView f91432k;
    @C0359n0

    /* renamed from: l */
    public final TextView f91433l;

    public C36782o3(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 Button button, @C0359n0 PinEntryEditText pinEntryEditText, @C0359n0 ImageView imageView, @C0359n0 TextView textView, @C0359n0 LinearLayout linearLayout, @C0359n0 ProgressBar progressBar, @C0359n0 TextView textView2, @C0359n0 TextView textView3, @C0359n0 TextView textView4, @C0359n0 TextView textView5, @C0359n0 TextView textView6) {
        this.f91422a = constraintLayout;
        this.f91423b = button;
        this.f91424c = pinEntryEditText;
        this.f91425d = imageView;
        this.f91426e = textView;
        this.f91427f = linearLayout;
        this.f91428g = progressBar;
        this.f91429h = textView2;
        this.f91430i = textView3;
        this.f91431j = textView4;
        this.f91432k = textView5;
        this.f91433l = textView6;
    }

    @C0359n0
    /* renamed from: a */
    public static C36782o3 m150855a(@C0359n0 View view) {
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
                                        i = R.id.txtSubInfo;
                                        TextView textView4 = (TextView) C20753c.m96463a(view, R.id.txtSubInfo);
                                        if (textView4 != null) {
                                            i = R.id.txtSubInfo2;
                                            TextView textView5 = (TextView) C20753c.m96463a(view, R.id.txtSubInfo2);
                                            if (textView5 != null) {
                                                i = R.id.txtSubTitle;
                                                TextView textView6 = (TextView) C20753c.m96463a(view, R.id.txtSubTitle);
                                                if (textView6 != null) {
                                                    return new C36782o3((ConstraintLayout) view, button, pinEntryEditText, imageView, textView, linearLayout, progressBar, textView2, textView3, textView4, textView5, textView6);
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
    public static C36782o3 m150856c(@C0359n0 LayoutInflater layoutInflater) {
        return m150857d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36782o3 m150857d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_secret_code, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150855a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f91422a;
    }
}

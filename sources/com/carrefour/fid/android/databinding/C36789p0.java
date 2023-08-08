package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: com.carrefour.fid.android.databinding.p0 */
public final class C36789p0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ScrollView f91458a;
    @C0359n0

    /* renamed from: b */
    public final Button f91459b;
    @C0359n0

    /* renamed from: c */
    public final FragmentContainerView f91460c;
    @C0359n0

    /* renamed from: d */
    public final Button f91461d;
    @C0359n0

    /* renamed from: e */
    public final Button f91462e;
    @C0359n0

    /* renamed from: f */
    public final ImageView f91463f;
    @C0359n0

    /* renamed from: g */
    public final ImageView f91464g;
    @C0359n0

    /* renamed from: h */
    public final ImageView f91465h;
    @C0359n0

    /* renamed from: i */
    public final TextInputLayout f91466i;
    @C0359n0

    /* renamed from: j */
    public final EditText f91467j;
    @C0359n0

    /* renamed from: k */
    public final TextView f91468k;
    @C0359n0

    /* renamed from: l */
    public final ProgressBar f91469l;
    @C0359n0

    /* renamed from: m */
    public final TextView f91470m;
    @C0359n0

    /* renamed from: n */
    public final TextView f91471n;
    @C0359n0

    /* renamed from: o */
    public final TextView f91472o;

    public C36789p0(@C0359n0 ScrollView scrollView, @C0359n0 Button button, @C0359n0 FragmentContainerView fragmentContainerView, @C0359n0 Button button2, @C0359n0 Button button3, @C0359n0 ImageView imageView, @C0359n0 ImageView imageView2, @C0359n0 ImageView imageView3, @C0359n0 TextInputLayout textInputLayout, @C0359n0 EditText editText, @C0359n0 TextView textView, @C0359n0 ProgressBar progressBar, @C0359n0 TextView textView2, @C0359n0 TextView textView3, @C0359n0 TextView textView4) {
        this.f91458a = scrollView;
        this.f91459b = button;
        this.f91460c = fragmentContainerView;
        this.f91461d = button2;
        this.f91462e = button3;
        this.f91463f = imageView;
        this.f91464g = imageView2;
        this.f91465h = imageView3;
        this.f91466i = textInputLayout;
        this.f91467j = editText;
        this.f91468k = textView;
        this.f91469l = progressBar;
        this.f91470m = textView2;
        this.f91471n = textView3;
        this.f91472o = textView4;
    }

    @C0359n0
    /* renamed from: a */
    public static C36789p0 m150883a(@C0359n0 View view) {
        View view2 = view;
        int i = R.id.attach_card_permission_link;
        Button button = (Button) C20753c.m96463a(view2, R.id.attach_card_permission_link);
        if (button != null) {
            i = R.id.barcode_scanner_view;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) C20753c.m96463a(view2, R.id.barcode_scanner_view);
            if (fragmentContainerView != null) {
                i = R.id.btn_attach_card_submit;
                Button button2 = (Button) C20753c.m96463a(view2, R.id.btn_attach_card_submit);
                if (button2 != null) {
                    i = R.id.btn_find_card;
                    Button button3 = (Button) C20753c.m96463a(view2, R.id.btn_find_card);
                    if (button3 != null) {
                        i = R.id.image_background_scan;
                        ImageView imageView = (ImageView) C20753c.m96463a(view2, R.id.image_background_scan);
                        if (imageView != null) {
                            i = R.id.image_fragment_attach_card_fidelity;
                            ImageView imageView2 = (ImageView) C20753c.m96463a(view2, R.id.image_fragment_attach_card_fidelity);
                            if (imageView2 != null) {
                                i = R.id.image_fragment_attach_card_loyalty;
                                ImageView imageView3 = (ImageView) C20753c.m96463a(view2, R.id.image_fragment_attach_card_loyalty);
                                if (imageView3 != null) {
                                    i = R.id.layout_fragment_attach_card_input;
                                    TextInputLayout textInputLayout = (TextInputLayout) C20753c.m96463a(view2, R.id.layout_fragment_attach_card_input);
                                    if (textInputLayout != null) {
                                        i = R.id.num_card_edit_text;
                                        EditText editText = (EditText) C20753c.m96463a(view2, R.id.num_card_edit_text);
                                        if (editText != null) {
                                            i = R.id.num_card_text_error;
                                            TextView textView = (TextView) C20753c.m96463a(view2, R.id.num_card_text_error);
                                            if (textView != null) {
                                                i = R.id.progress_bar_attach_card;
                                                ProgressBar progressBar = (ProgressBar) C20753c.m96463a(view2, R.id.progress_bar_attach_card);
                                                if (progressBar != null) {
                                                    i = R.id.text_attach_card_info;
                                                    TextView textView2 = (TextView) C20753c.m96463a(view2, R.id.text_attach_card_info);
                                                    if (textView2 != null) {
                                                        i = R.id.text_fragment_attach_card_subtitle;
                                                        TextView textView3 = (TextView) C20753c.m96463a(view2, R.id.text_fragment_attach_card_subtitle);
                                                        if (textView3 != null) {
                                                            i = R.id.text_fragment_attach_card_title;
                                                            TextView textView4 = (TextView) C20753c.m96463a(view2, R.id.text_fragment_attach_card_title);
                                                            if (textView4 != null) {
                                                                return new C36789p0((ScrollView) view2, button, fragmentContainerView, button2, button3, imageView, imageView2, imageView3, textInputLayout, editText, textView, progressBar, textView2, textView3, textView4);
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
    public static C36789p0 m150884c(@C0359n0 LayoutInflater layoutInflater) {
        return m150885d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36789p0 m150885d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_attach_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150883a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ScrollView getRoot() {
        return this.f91458a;
    }
}

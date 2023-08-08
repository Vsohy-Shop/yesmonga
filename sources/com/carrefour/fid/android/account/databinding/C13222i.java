package com.carrefour.fid.android.account.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.account.C13144b;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: com.carrefour.fid.android.account.databinding.i */
public final class C13222i implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f32490a;
    @C0359n0

    /* renamed from: b */
    public final TextView f32491b;
    @C0359n0

    /* renamed from: c */
    public final TextView f32492c;
    @C0359n0

    /* renamed from: d */
    public final RadioButton f32493d;
    @C0359n0

    /* renamed from: e */
    public final RadioGroup f32494e;
    @C0359n0

    /* renamed from: f */
    public final RadioButton f32495f;
    @C0359n0

    /* renamed from: g */
    public final EditText f32496g;
    @C0359n0

    /* renamed from: h */
    public final TextView f32497h;
    @C0359n0

    /* renamed from: i */
    public final EditText f32498i;
    @C0359n0

    /* renamed from: j */
    public final TextView f32499j;
    @C0359n0

    /* renamed from: k */
    public final TextInputLayout f32500k;
    @C0359n0

    /* renamed from: l */
    public final ProgressBar f32501l;
    @C0359n0

    /* renamed from: m */
    public final Button f32502m;
    @C0359n0

    /* renamed from: n */
    public final ComposeView f32503n;
    @C0359n0

    /* renamed from: o */
    public final LinearLayout f32504o;

    public C13222i(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 RadioButton radioButton, @C0359n0 RadioGroup radioGroup, @C0359n0 RadioButton radioButton2, @C0359n0 EditText editText, @C0359n0 TextView textView3, @C0359n0 EditText editText2, @C0359n0 TextView textView4, @C0359n0 TextInputLayout textInputLayout, @C0359n0 ProgressBar progressBar, @C0359n0 Button button, @C0359n0 ComposeView composeView, @C0359n0 LinearLayout linearLayout) {
        this.f32490a = constraintLayout;
        this.f32491b = textView;
        this.f32492c = textView2;
        this.f32493d = radioButton;
        this.f32494e = radioGroup;
        this.f32495f = radioButton2;
        this.f32496g = editText;
        this.f32497h = textView3;
        this.f32498i = editText2;
        this.f32499j = textView4;
        this.f32500k = textInputLayout;
        this.f32501l = progressBar;
        this.f32502m = button;
        this.f32503n = composeView;
        this.f32504o = linearLayout;
    }

    @C0359n0
    /* renamed from: a */
    public static C13222i m57295a(@C0359n0 View view) {
        View view2 = view;
        int i = C13144b.C13154j.account_mandatory_field_text;
        TextView textView = (TextView) C20753c.m96463a(view2, i);
        if (textView != null) {
            i = C13144b.C13154j.civility_title_header_text;
            TextView textView2 = (TextView) C20753c.m96463a(view2, i);
            if (textView2 != null) {
                i = C13144b.C13154j.civility_title_men_radio_button;
                RadioButton radioButton = (RadioButton) C20753c.m96463a(view2, i);
                if (radioButton != null) {
                    i = C13144b.C13154j.civility_title_radio_group;
                    RadioGroup radioGroup = (RadioGroup) C20753c.m96463a(view2, i);
                    if (radioGroup != null) {
                        i = C13144b.C13154j.civility_title_women_radio_button;
                        RadioButton radioButton2 = (RadioButton) C20753c.m96463a(view2, i);
                        if (radioButton2 != null) {
                            i = C13144b.C13154j.firstname_edit_text;
                            EditText editText = (EditText) C20753c.m96463a(view2, i);
                            if (editText != null) {
                                i = C13144b.C13154j.firstname_error_text;
                                TextView textView3 = (TextView) C20753c.m96463a(view2, i);
                                if (textView3 != null) {
                                    i = C13144b.C13154j.lastname_edit_text;
                                    EditText editText2 = (EditText) C20753c.m96463a(view2, i);
                                    if (editText2 != null) {
                                        i = C13144b.C13154j.lastname_error_text;
                                        TextView textView4 = (TextView) C20753c.m96463a(view2, i);
                                        if (textView4 != null) {
                                            i = C13144b.C13154j.lastname_group;
                                            TextInputLayout textInputLayout = (TextInputLayout) C20753c.m96463a(view2, i);
                                            if (textInputLayout != null) {
                                                i = C13144b.C13154j.progress_bar;
                                                ProgressBar progressBar = (ProgressBar) C20753c.m96463a(view2, i);
                                                if (progressBar != null) {
                                                    i = C13144b.C13154j.save_button;
                                                    Button button = (Button) C20753c.m96463a(view2, i);
                                                    if (button != null) {
                                                        i = C13144b.C13154j.update_user_info_header;
                                                        ComposeView composeView = (ComposeView) C20753c.m96463a(view2, i);
                                                        if (composeView != null) {
                                                            i = C13144b.C13154j.update_user_info_header_layout;
                                                            LinearLayout linearLayout = (LinearLayout) C20753c.m96463a(view2, i);
                                                            if (linearLayout != null) {
                                                                return new C13222i((ConstraintLayout) view2, textView, textView2, radioButton, radioGroup, radioButton2, editText, textView3, editText2, textView4, textInputLayout, progressBar, button, composeView, linearLayout);
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
    public static C13222i m57296c(@C0359n0 LayoutInflater layoutInflater) {
        return m57297d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C13222i m57297d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C13144b.C13157m.fragment_update_user_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57295a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f32490a;
    }
}

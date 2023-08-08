package com.carrefour.fid.android.account.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.account.C13144b;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: com.carrefour.fid.android.account.databinding.j */
public final class C13223j implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f32505a;
    @C0359n0

    /* renamed from: b */
    public final TextView f32506b;
    @C0359n0

    /* renamed from: c */
    public final EditText f32507c;
    @C0359n0

    /* renamed from: d */
    public final TextView f32508d;
    @C0359n0

    /* renamed from: e */
    public final TextInputLayout f32509e;
    @C0359n0

    /* renamed from: f */
    public final TextView f32510f;
    @C0359n0

    /* renamed from: g */
    public final EditText f32511g;
    @C0359n0

    /* renamed from: h */
    public final TextView f32512h;
    @C0359n0

    /* renamed from: i */
    public final TextInputLayout f32513i;
    @C0359n0

    /* renamed from: j */
    public final TextView f32514j;
    @C0359n0

    /* renamed from: k */
    public final Button f32515k;
    @C0359n0

    /* renamed from: l */
    public final TextView f32516l;
    @C0359n0

    /* renamed from: m */
    public final ComposeView f32517m;
    @C0359n0

    /* renamed from: n */
    public final LinearLayout f32518n;
    @C0359n0

    /* renamed from: o */
    public final ProgressBar f32519o;
    @C0359n0

    /* renamed from: p */
    public final TextView f32520p;

    public C13223j(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 TextView textView, @C0359n0 EditText editText, @C0359n0 TextView textView2, @C0359n0 TextInputLayout textInputLayout, @C0359n0 TextView textView3, @C0359n0 EditText editText2, @C0359n0 TextView textView4, @C0359n0 TextInputLayout textInputLayout2, @C0359n0 TextView textView5, @C0359n0 Button button, @C0359n0 TextView textView6, @C0359n0 ComposeView composeView, @C0359n0 LinearLayout linearLayout, @C0359n0 ProgressBar progressBar, @C0359n0 TextView textView7) {
        this.f32505a = constraintLayout;
        this.f32506b = textView;
        this.f32507c = editText;
        this.f32508d = textView2;
        this.f32509e = textInputLayout;
        this.f32510f = textView3;
        this.f32511g = editText2;
        this.f32512h = textView4;
        this.f32513i = textInputLayout2;
        this.f32514j = textView5;
        this.f32515k = button;
        this.f32516l = textView6;
        this.f32517m = composeView;
        this.f32518n = linearLayout;
        this.f32519o = progressBar;
        this.f32520p = textView7;
    }

    @C0359n0
    /* renamed from: a */
    public static C13223j m57299a(@C0359n0 View view) {
        View view2 = view;
        int i = C13144b.C13154j.lowercase_rule_text;
        TextView textView = (TextView) C20753c.m96463a(view2, i);
        if (textView != null) {
            i = C13144b.C13154j.new_password_edit_text;
            EditText editText = (EditText) C20753c.m96463a(view2, i);
            if (editText != null) {
                i = C13144b.C13154j.new_password_error_text;
                TextView textView2 = (TextView) C20753c.m96463a(view2, i);
                if (textView2 != null) {
                    i = C13144b.C13154j.new_password_group;
                    TextInputLayout textInputLayout = (TextInputLayout) C20753c.m96463a(view2, i);
                    if (textInputLayout != null) {
                        i = C13144b.C13154j.numeric_rule_text;
                        TextView textView3 = (TextView) C20753c.m96463a(view2, i);
                        if (textView3 != null) {
                            i = C13144b.C13154j.old_password_edit_text;
                            EditText editText2 = (EditText) C20753c.m96463a(view2, i);
                            if (editText2 != null) {
                                i = C13144b.C13154j.old_password_error_text;
                                TextView textView4 = (TextView) C20753c.m96463a(view2, i);
                                if (textView4 != null) {
                                    i = C13144b.C13154j.old_password_group;
                                    TextInputLayout textInputLayout2 = (TextInputLayout) C20753c.m96463a(view2, i);
                                    if (textInputLayout2 != null) {
                                        i = C13144b.C13154j.rules_description_text;
                                        TextView textView5 = (TextView) C20753c.m96463a(view2, i);
                                        if (textView5 != null) {
                                            i = C13144b.C13154j.save_password_button;
                                            Button button = (Button) C20753c.m96463a(view2, i);
                                            if (button != null) {
                                                i = C13144b.C13154j.special_char_rule_text;
                                                TextView textView6 = (TextView) C20753c.m96463a(view2, i);
                                                if (textView6 != null) {
                                                    i = C13144b.C13154j.update_password_header;
                                                    ComposeView composeView = (ComposeView) C20753c.m96463a(view2, i);
                                                    if (composeView != null) {
                                                        i = C13144b.C13154j.update_password_header_layout;
                                                        LinearLayout linearLayout = (LinearLayout) C20753c.m96463a(view2, i);
                                                        if (linearLayout != null) {
                                                            i = C13144b.C13154j.update_password_progress_bar;
                                                            ProgressBar progressBar = (ProgressBar) C20753c.m96463a(view2, i);
                                                            if (progressBar != null) {
                                                                i = C13144b.C13154j.uppercase_rule_text;
                                                                TextView textView7 = (TextView) C20753c.m96463a(view2, i);
                                                                if (textView7 != null) {
                                                                    return new C13223j((ConstraintLayout) view2, textView, editText, textView2, textInputLayout, textView3, editText2, textView4, textInputLayout2, textView5, button, textView6, composeView, linearLayout, progressBar, textView7);
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
    public static C13223j m57300c(@C0359n0 LayoutInflater layoutInflater) {
        return m57301d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C13223j m57301d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C13144b.C13157m.fragment_update_user_password, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57299a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f32505a;
    }
}

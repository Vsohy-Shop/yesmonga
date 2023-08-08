package com.carrefour.fid.android.account.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.p004ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.account.C13144b;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: com.carrefour.fid.android.account.databinding.h */
public final class C13221h implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f32483a;
    @C0359n0

    /* renamed from: b */
    public final EditText f32484b;
    @C0359n0

    /* renamed from: c */
    public final TextInputLayout f32485c;
    @C0359n0

    /* renamed from: d */
    public final Button f32486d;
    @C0359n0

    /* renamed from: e */
    public final ProgressBar f32487e;
    @C0359n0

    /* renamed from: f */
    public final ComposeView f32488f;
    @C0359n0

    /* renamed from: g */
    public final LinearLayout f32489g;

    public C13221h(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 EditText editText, @C0359n0 TextInputLayout textInputLayout, @C0359n0 Button button, @C0359n0 ProgressBar progressBar, @C0359n0 ComposeView composeView, @C0359n0 LinearLayout linearLayout) {
        this.f32483a = constraintLayout;
        this.f32484b = editText;
        this.f32485c = textInputLayout;
        this.f32486d = button;
        this.f32487e = progressBar;
        this.f32488f = composeView;
        this.f32489g = linearLayout;
    }

    @C0359n0
    /* renamed from: a */
    public static C13221h m57291a(@C0359n0 View view) {
        int i = C13144b.C13154j.email_edit_text;
        EditText editText = (EditText) C20753c.m96463a(view, i);
        if (editText != null) {
            i = C13144b.C13154j.email_group;
            TextInputLayout textInputLayout = (TextInputLayout) C20753c.m96463a(view, i);
            if (textInputLayout != null) {
                i = C13144b.C13154j.save_email_button;
                Button button = (Button) C20753c.m96463a(view, i);
                if (button != null) {
                    i = C13144b.C13154j.save_email_progress_bar;
                    ProgressBar progressBar = (ProgressBar) C20753c.m96463a(view, i);
                    if (progressBar != null) {
                        i = C13144b.C13154j.update_email_header;
                        ComposeView composeView = (ComposeView) C20753c.m96463a(view, i);
                        if (composeView != null) {
                            i = C13144b.C13154j.update_email_header_layout;
                            LinearLayout linearLayout = (LinearLayout) C20753c.m96463a(view, i);
                            if (linearLayout != null) {
                                return new C13221h((ConstraintLayout) view, editText, textInputLayout, button, progressBar, composeView, linearLayout);
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
    public static C13221h m57292c(@C0359n0 LayoutInflater layoutInflater) {
        return m57293d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C13221h m57293d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C13144b.C13157m.fragment_update_user_email, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m57291a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f32483a;
    }
}

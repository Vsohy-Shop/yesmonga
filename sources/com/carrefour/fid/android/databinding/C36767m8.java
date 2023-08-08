package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.m8 */
public final class C36767m8 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final Toolbar f91335a;
    @C0359n0

    /* renamed from: b */
    public final ImageButton f91336b;
    @C0359n0

    /* renamed from: c */
    public final ImageButton f91337c;
    @C0359n0

    /* renamed from: d */
    public final ImageButton f91338d;
    @C0359n0

    /* renamed from: e */
    public final EditText f91339e;
    @C0359n0

    /* renamed from: f */
    public final ImageButton f91340f;
    @C0359n0

    /* renamed from: g */
    public final TextView f91341g;
    @C0359n0

    /* renamed from: h */
    public final Toolbar f91342h;

    public C36767m8(@C0359n0 Toolbar toolbar, @C0359n0 ImageButton imageButton, @C0359n0 ImageButton imageButton2, @C0359n0 ImageButton imageButton3, @C0359n0 EditText editText, @C0359n0 ImageButton imageButton4, @C0359n0 TextView textView, @C0359n0 Toolbar toolbar2) {
        this.f91335a = toolbar;
        this.f91336b = imageButton;
        this.f91337c = imageButton2;
        this.f91338d = imageButton3;
        this.f91339e = editText;
        this.f91340f = imageButton4;
        this.f91341g = textView;
        this.f91342h = toolbar2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36767m8 m150795a(@C0359n0 View view) {
        int i = R.id.button_toolbar_home_account_back;
        ImageButton imageButton = (ImageButton) C20753c.m96463a(view, R.id.button_toolbar_home_account_back);
        if (imageButton != null) {
            i = R.id.button_toolbar_home_account_delete;
            ImageButton imageButton2 = (ImageButton) C20753c.m96463a(view, R.id.button_toolbar_home_account_delete);
            if (imageButton2 != null) {
                i = R.id.button_toolbar_home_account_search_reset;
                ImageButton imageButton3 = (ImageButton) C20753c.m96463a(view, R.id.button_toolbar_home_account_search_reset);
                if (imageButton3 != null) {
                    i = R.id.edit_toolbar_home_account_search;
                    EditText editText = (EditText) C20753c.m96463a(view, R.id.edit_toolbar_home_account_search);
                    if (editText != null) {
                        i = R.id.search_bar_scan_button;
                        ImageButton imageButton4 = (ImageButton) C20753c.m96463a(view, R.id.search_bar_scan_button);
                        if (imageButton4 != null) {
                            i = R.id.text_toolbar_home_account_title;
                            TextView textView = (TextView) C20753c.m96463a(view, R.id.text_toolbar_home_account_title);
                            if (textView != null) {
                                Toolbar toolbar = (Toolbar) view;
                                return new C36767m8(toolbar, imageButton, imageButton2, imageButton3, editText, imageButton4, textView, toolbar);
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
    public static C36767m8 m150796c(@C0359n0 LayoutInflater layoutInflater) {
        return m150797d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36767m8 m150797d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.toolbar_default, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150795a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public Toolbar getRoot() {
        return this.f91335a;
    }
}

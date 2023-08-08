package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.R;

/* renamed from: com.carrefour.fid.android.databinding.e0 */
public final class C36679e0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final NestedScrollView f90750a;
    @C0359n0

    /* renamed from: b */
    public final Button f90751b;
    @C0359n0

    /* renamed from: c */
    public final ImageView f90752c;
    @C0359n0

    /* renamed from: d */
    public final TextView f90753d;
    @C0359n0

    /* renamed from: e */
    public final TextView f90754e;
    @C0359n0

    /* renamed from: f */
    public final TextView f90755f;

    public C36679e0(@C0359n0 NestedScrollView nestedScrollView, @C0359n0 Button button, @C0359n0 ImageView imageView, @C0359n0 TextView textView, @C0359n0 TextView textView2, @C0359n0 TextView textView3) {
        this.f90750a = nestedScrollView;
        this.f90751b = button;
        this.f90752c = imageView;
        this.f90753d = textView;
        this.f90754e = textView2;
        this.f90755f = textView3;
    }

    @C0359n0
    /* renamed from: a */
    public static C36679e0 m150445a(@C0359n0 View view) {
        int i = R.id.button_empty_view;
        Button button = (Button) C20753c.m96463a(view, R.id.button_empty_view);
        if (button != null) {
            i = R.id.image_view_empty_icon;
            ImageView imageView = (ImageView) C20753c.m96463a(view, R.id.image_view_empty_icon);
            if (imageView != null) {
                i = R.id.text_view_empty_message;
                TextView textView = (TextView) C20753c.m96463a(view, R.id.text_view_empty_message);
                if (textView != null) {
                    i = R.id.text_view_empty_message_bold;
                    TextView textView2 = (TextView) C20753c.m96463a(view, R.id.text_view_empty_message_bold);
                    if (textView2 != null) {
                        i = R.id.text_view_empty_title;
                        TextView textView3 = (TextView) C20753c.m96463a(view, R.id.text_view_empty_title);
                        if (textView3 != null) {
                            return new C36679e0((NestedScrollView) view, button, imageView, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C36679e0 m150446c(@C0359n0 LayoutInflater layoutInflater) {
        return m150447d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36679e0 m150447d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_account_list_store_memo_empty, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m150445a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public NestedScrollView getRoot() {
        return this.f90750a;
    }
}

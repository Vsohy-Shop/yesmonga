package com.carrefour.fid.android.design.components.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.C16934c;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.design.components.C36896b;

/* renamed from: com.carrefour.fid.android.design.components.databinding.d0 */
public final class C37038d0 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final View f92599a;
    @C0359n0

    /* renamed from: b */
    public final Barrier f92600b;
    @C0359n0

    /* renamed from: c */
    public final TextView f92601c;
    @C0359n0

    /* renamed from: d */
    public final ImageButton f92602d;
    @C0359n0

    /* renamed from: e */
    public final ImageView f92603e;
    @C0359n0

    /* renamed from: f */
    public final TextView f92604f;
    @C0359n0

    /* renamed from: g */
    public final TextView f92605g;

    public C37038d0(@C0359n0 View view, @C0359n0 Barrier barrier, @C0359n0 TextView textView, @C0359n0 ImageButton imageButton, @C0359n0 ImageView imageView, @C0359n0 TextView textView2, @C0359n0 TextView textView3) {
        this.f92599a = view;
        this.f92600b = barrier;
        this.f92601c = textView;
        this.f92602d = imageButton;
        this.f92603e = imageView;
        this.f92604f = textView2;
        this.f92605g = textView3;
    }

    @C0359n0
    /* renamed from: a */
    public static C37038d0 m151953a(@C0359n0 View view) {
        int i = C36896b.C36906j.barrier_action_button_start;
        Barrier barrier = (Barrier) C20753c.m96463a(view, i);
        if (barrier != null) {
            i = C36896b.C36906j.notification_button_action;
            TextView textView = (TextView) C20753c.m96463a(view, i);
            if (textView != null) {
                i = C36896b.C36906j.notification_button_close;
                ImageButton imageButton = (ImageButton) C20753c.m96463a(view, i);
                if (imageButton != null) {
                    i = C36896b.C36906j.notification_icon;
                    ImageView imageView = (ImageView) C20753c.m96463a(view, i);
                    if (imageView != null) {
                        i = C36896b.C36906j.notification_text_content;
                        TextView textView2 = (TextView) C20753c.m96463a(view, i);
                        if (textView2 != null) {
                            i = C36896b.C36906j.notification_title;
                            TextView textView3 = (TextView) C20753c.m96463a(view, i);
                            if (textView3 != null) {
                                return new C37038d0(view, barrier, textView, imageButton, imageView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: b */
    public static C37038d0 m151954b(@C0359n0 LayoutInflater layoutInflater, @C0359n0 ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C36896b.C36909m.ds_component_notification, viewGroup);
            return m151953a(viewGroup);
        }
        throw new NullPointerException(C16934c.f44493V1);
    }

    @C0359n0
    public View getRoot() {
        return this.f92599a;
    }
}

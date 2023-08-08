package com.carrefour.fid.android.scan.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.scan.C28233b;

/* renamed from: com.carrefour.fid.android.scan.databinding.a */
public final class C28269a implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f68421a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f68422b;
    @C0359n0

    /* renamed from: c */
    public final ImageButton f68423c;
    @C0359n0

    /* renamed from: d */
    public final PreviewView f68424d;
    @C0359n0

    /* renamed from: e */
    public final ProgressBar f68425e;
    @C0359n0

    /* renamed from: f */
    public final TextView f68426f;

    public C28269a(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ImageView imageView, @C0359n0 ImageButton imageButton, @C0359n0 PreviewView previewView, @C0359n0 ProgressBar progressBar, @C0359n0 TextView textView) {
        this.f68421a = constraintLayout;
        this.f68422b = imageView;
        this.f68423c = imageButton;
        this.f68424d = previewView;
        this.f68425e = progressBar;
        this.f68426f = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C28269a m118203a(@C0359n0 View view) {
        int i = C28233b.C28243j.checked_image;
        ImageView imageView = (ImageView) C20753c.m96463a(view, i);
        if (imageView != null) {
            i = C28233b.C28243j.flash_button;
            ImageButton imageButton = (ImageButton) C20753c.m96463a(view, i);
            if (imageButton != null) {
                i = C28233b.C28243j.preview_view;
                PreviewView previewView = (PreviewView) C20753c.m96463a(view, i);
                if (previewView != null) {
                    i = C28233b.C28243j.progress_bar_scanner;
                    ProgressBar progressBar = (ProgressBar) C20753c.m96463a(view, i);
                    if (progressBar != null) {
                        i = C28233b.C28243j.scanner_text;
                        TextView textView = (TextView) C20753c.m96463a(view, i);
                        if (textView != null) {
                            return new C28269a((ConstraintLayout) view, imageView, imageButton, previewView, progressBar, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C28269a m118204c(@C0359n0 LayoutInflater layoutInflater) {
        return m118205d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C28269a m118205d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28233b.C28246m.ds_component_coupons_barcode_scanner_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m118203a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f68421a;
    }
}

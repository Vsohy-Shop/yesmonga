package com.carrefour.fid.android.scan.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.C20752b;
import androidx.viewbinding.C20753c;
import com.carrefour.fid.android.scan.C28233b;

/* renamed from: com.carrefour.fid.android.scan.databinding.b */
public final class C28270b implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final ConstraintLayout f68427a;
    @C0359n0

    /* renamed from: b */
    public final ImageView f68428b;
    @C0359n0

    /* renamed from: c */
    public final PreviewView f68429c;
    @C0359n0

    /* renamed from: d */
    public final TextView f68430d;

    public C28270b(@C0359n0 ConstraintLayout constraintLayout, @C0359n0 ImageView imageView, @C0359n0 PreviewView previewView, @C0359n0 TextView textView) {
        this.f68427a = constraintLayout;
        this.f68428b = imageView;
        this.f68429c = previewView;
        this.f68430d = textView;
    }

    @C0359n0
    /* renamed from: a */
    public static C28270b m118207a(@C0359n0 View view) {
        int i = C28233b.C28243j.overlay;
        ImageView imageView = (ImageView) C20753c.m96463a(view, i);
        if (imageView != null) {
            i = C28233b.C28243j.preview_view;
            PreviewView previewView = (PreviewView) C20753c.m96463a(view, i);
            if (previewView != null) {
                i = C28233b.C28243j.scanner_text;
                TextView textView = (TextView) C20753c.m96463a(view, i);
                if (textView != null) {
                    return new C28270b((ConstraintLayout) view, imageView, previewView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @C0359n0
    /* renamed from: c */
    public static C28270b m118208c(@C0359n0 LayoutInflater layoutInflater) {
        return m118209d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C28270b m118209d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C28233b.C28246m.ds_component_scanner_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m118207a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f68427a;
    }
}

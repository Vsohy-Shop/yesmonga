package com.carrefour.fid.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.viewbinding.C20752b;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.widget.PDFReader;

/* renamed from: com.carrefour.fid.android.databinding.v2 */
public final class C36851v2 implements C20752b {
    @C0359n0

    /* renamed from: a */
    public final PDFReader f91794a;
    @C0359n0

    /* renamed from: b */
    public final PDFReader f91795b;

    public C36851v2(@C0359n0 PDFReader pDFReader, @C0359n0 PDFReader pDFReader2) {
        this.f91794a = pDFReader;
        this.f91795b = pDFReader2;
    }

    @C0359n0
    /* renamed from: a */
    public static C36851v2 m151121a(@C0359n0 View view) {
        if (view != null) {
            PDFReader pDFReader = (PDFReader) view;
            return new C36851v2(pDFReader, pDFReader);
        }
        throw new NullPointerException("rootView");
    }

    @C0359n0
    /* renamed from: c */
    public static C36851v2 m151122c(@C0359n0 LayoutInflater layoutInflater) {
        return m151123d(layoutInflater, (ViewGroup) null, false);
    }

    @C0359n0
    /* renamed from: d */
    public static C36851v2 m151123d(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_orders_offline_receipt, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m151121a(inflate);
    }

    @C0359n0
    /* renamed from: b */
    public PDFReader getRoot() {
        return this.f91794a;
    }
}

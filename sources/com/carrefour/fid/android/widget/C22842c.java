package com.carrefour.fid.android.widget;

import android.graphics.pdf.PdfRenderer;

/* renamed from: com.carrefour.fid.android.widget.c */
public final /* synthetic */ class C22842c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ PDFReader f58416a;

    /* renamed from: b */
    public final /* synthetic */ PdfRenderer f58417b;

    public /* synthetic */ C22842c(PDFReader pDFReader, PdfRenderer pdfRenderer) {
        this.f58416a = pDFReader;
        this.f58417b = pdfRenderer;
    }

    public final void run() {
        PDFReader.m103110Y1(this.f58416a, this.f58417b);
    }
}

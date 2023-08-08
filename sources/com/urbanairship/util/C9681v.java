package com.urbanairship.util;

import android.graphics.ImageDecoder;

/* renamed from: com.urbanairship.util.v */
public final /* synthetic */ class C9681v implements ImageDecoder.OnHeaderDecodedListener {

    /* renamed from: a */
    public final /* synthetic */ int f26505a;

    /* renamed from: b */
    public final /* synthetic */ int f26506b;

    /* renamed from: c */
    public final /* synthetic */ int f26507c;

    /* renamed from: d */
    public final /* synthetic */ int f26508d;

    public /* synthetic */ C9681v(int i, int i2, int i3, int i4) {
        this.f26505a = i;
        this.f26506b = i2;
        this.f26507c = i3;
        this.f26508d = i4;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        C9684y.m36258l(this.f26505a, this.f26506b, this.f26507c, this.f26508d, imageDecoder, imageInfo, source);
    }
}

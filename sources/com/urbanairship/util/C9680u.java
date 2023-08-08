package com.urbanairship.util;

import android.graphics.ImageDecoder;

/* renamed from: com.urbanairship.util.u */
public final /* synthetic */ class C9680u implements ImageDecoder.OnHeaderDecodedListener {

    /* renamed from: a */
    public final /* synthetic */ int f26501a;

    /* renamed from: b */
    public final /* synthetic */ int f26502b;

    /* renamed from: c */
    public final /* synthetic */ int f26503c;

    /* renamed from: d */
    public final /* synthetic */ int f26504d;

    public /* synthetic */ C9680u(int i, int i2, int i3, int i4) {
        this.f26501a = i;
        this.f26502b = i2;
        this.f26503c = i3;
        this.f26504d = i4;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        C9684y.m36260n(this.f26501a, this.f26502b, this.f26503c, this.f26504d, imageDecoder, imageInfo, source);
    }
}

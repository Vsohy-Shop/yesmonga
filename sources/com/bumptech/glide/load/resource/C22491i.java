package com.bumptech.glide.load.resource;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import com.bumptech.glide.load.C22139e;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.resource.bitmap.C22395b0;
import com.bumptech.glide.load.resource.bitmap.C22439v;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;

@C0376v0(api = 28)
/* renamed from: com.bumptech.glide.load.resource.i */
public final class C22491i implements ImageDecoder.OnHeaderDecodedListener {

    /* renamed from: h */
    public static final String f57668h = "ImageDecoder";

    /* renamed from: a */
    public final C22395b0 f57669a = C22395b0.m101689d();

    /* renamed from: b */
    public final int f57670b;

    /* renamed from: c */
    public final int f57671c;

    /* renamed from: d */
    public final DecodeFormat f57672d;

    /* renamed from: e */
    public final DownsampleStrategy f57673e;

    /* renamed from: f */
    public final boolean f57674f;

    /* renamed from: g */
    public final PreferredColorSpace f57675g;

    /* renamed from: com.bumptech.glide.load.resource.i$a */
    public class C22492a implements ImageDecoder.OnPartialImageListener {
        public C22492a() {
        }

        public boolean onPartialImage(@C0359n0 ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public C22491i(int i, int i2, @C0359n0 C22277f fVar) {
        boolean z;
        this.f57670b = i;
        this.f57671c = i2;
        this.f57672d = (DecodeFormat) fVar.mo66232c(C22439v.f57567g);
        this.f57673e = (DownsampleStrategy) fVar.mo66232c(DownsampleStrategy.f57449h);
        C22139e eVar = C22439v.f57571k;
        if (fVar.mo66232c(eVar) == null || !((Boolean) fVar.mo66232c(eVar)).booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        this.f57674f = z;
        this.f57675g = (PreferredColorSpace) fVar.mo66232c(C22439v.f57568h);
    }

    public void onHeaderDecoded(@C0359n0 ImageDecoder imageDecoder, @C0359n0 ImageDecoder.ImageInfo imageInfo, @C0359n0 ImageDecoder.Source source) {
        ColorSpace.Named named;
        boolean z = false;
        if (this.f57669a.mo66407g(this.f57670b, this.f57671c, this.f57674f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f57672d == DecodeFormat.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C22492a());
        Size a = imageInfo.getSize();
        int i = this.f57670b;
        if (i == Integer.MIN_VALUE) {
            i = a.getWidth();
        }
        int i2 = this.f57671c;
        if (i2 == Integer.MIN_VALUE) {
            i2 = a.getHeight();
        }
        float b = this.f57673e.mo66378b(a.getWidth(), a.getHeight(), i, i2);
        int round = Math.round(((float) a.getWidth()) * b);
        int round2 = Math.round(((float) a.getHeight()) * b);
        if (Log.isLoggable(f57668h, 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Resizing from [");
            sb.append(a.getWidth());
            sb.append("x");
            sb.append(a.getHeight());
            sb.append("] to [");
            sb.append(round);
            sb.append("x");
            sb.append(round2);
            sb.append("] scaleFactor: ");
            sb.append(b);
        }
        imageDecoder.setTargetSize(round, round2);
        PreferredColorSpace preferredColorSpace = this.f57675g;
        if (preferredColorSpace != null) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                if (preferredColorSpace == PreferredColorSpace.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                    z = true;
                }
                if (z) {
                    named = ColorSpace.Named.DISPLAY_P3;
                } else {
                    named = ColorSpace.Named.SRGB;
                }
                imageDecoder.setTargetColorSpace(ColorSpace.get(named));
            } else if (i3 >= 26) {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}

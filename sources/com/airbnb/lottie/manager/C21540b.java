package com.airbnb.lottie.manager;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import androidx.annotation.C0363p0;
import com.airbnb.lottie.C21491d;
import com.airbnb.lottie.C21536k;
import com.airbnb.lottie.utils.C21682f;
import com.airbnb.lottie.utils.C21686j;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.airbnb.lottie.manager.b */
public class C21540b {

    /* renamed from: e */
    public static final Object f55571e = new Object();

    /* renamed from: a */
    public final Context f55572a;

    /* renamed from: b */
    public final String f55573b;
    @C0363p0

    /* renamed from: c */
    public C21491d f55574c;

    /* renamed from: d */
    public final Map<String, C21536k> f55575d;

    public C21540b(Drawable.Callback callback, String str, C21491d dVar, Map<String, C21536k> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f55573b = str;
        } else {
            this.f55573b = str + '/';
        }
        if (!(callback instanceof View)) {
            C21682f.m99760e("LottieDrawable must be inside of a view for images to work.");
            this.f55575d = new HashMap();
            this.f55572a = null;
            return;
        }
        this.f55572a = ((View) callback).getContext();
        this.f55575d = map;
        mo64291d(dVar);
    }

    @C0363p0
    /* renamed from: a */
    public Bitmap mo64288a(String str) {
        C21536k kVar = this.f55575d.get(str);
        if (kVar == null) {
            return null;
        }
        Bitmap a = kVar.mo64270a();
        if (a != null) {
            return a;
        }
        C21491d dVar = this.f55574c;
        if (dVar != null) {
            Bitmap a2 = dVar.mo64116a(kVar);
            if (a2 != null) {
                mo64290c(str, a2);
            }
            return a2;
        }
        String c = kVar.mo64272c();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (!c.startsWith("data:") || c.indexOf("base64,") <= 0) {
            try {
                if (!TextUtils.isEmpty(this.f55573b)) {
                    AssetManager assets = this.f55572a.getAssets();
                    try {
                        return mo64290c(str, C21686j.m99812m(BitmapFactory.decodeStream(assets.open(this.f55573b + c), (Rect) null, options), kVar.mo64275f(), kVar.mo64273d()));
                    } catch (IllegalArgumentException e) {
                        C21682f.m99761f("Unable to decode image.", e);
                        return null;
                    }
                } else {
                    throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                }
            } catch (IOException e2) {
                C21682f.m99761f("Unable to open asset.", e2);
                return null;
            }
        } else {
            try {
                byte[] decode = Base64.decode(c.substring(c.indexOf(44) + 1), 0);
                return mo64290c(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
            } catch (IllegalArgumentException e3) {
                C21682f.m99761f("data URL did not have correct base64 format.", e3);
                return null;
            }
        }
    }

    /* renamed from: b */
    public boolean mo64289b(Context context) {
        return (context == null && this.f55572a == null) || this.f55572a.equals(context);
    }

    /* renamed from: c */
    public final Bitmap mo64290c(String str, @C0363p0 Bitmap bitmap) {
        synchronized (f55571e) {
            this.f55575d.get(str).mo64277h(bitmap);
        }
        return bitmap;
    }

    /* renamed from: d */
    public void mo64291d(@C0363p0 C21491d dVar) {
        this.f55574c = dVar;
    }

    @C0363p0
    /* renamed from: e */
    public Bitmap mo64292e(String str, @C0363p0 Bitmap bitmap) {
        if (bitmap == null) {
            C21536k kVar = this.f55575d.get(str);
            Bitmap a = kVar.mo64270a();
            kVar.mo64277h((Bitmap) null);
            return a;
        }
        Bitmap a2 = this.f55575d.get(str).mo64270a();
        mo64290c(str, bitmap);
        return a2;
    }
}

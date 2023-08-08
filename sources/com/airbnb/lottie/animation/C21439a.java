package com.airbnb.lottie.animation;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.LocaleList;
import androidx.annotation.C0359n0;

/* renamed from: com.airbnb.lottie.animation.a */
public class C21439a extends Paint {
    public C21439a() {
    }

    public void setTextLocales(@C0359n0 LocaleList localeList) {
    }

    public C21439a(int i) {
        super(i);
    }

    public C21439a(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public C21439a(int i, PorterDuff.Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }
}

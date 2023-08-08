package com.airbnb.lottie.manager;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.C0363p0;
import com.airbnb.lottie.C21490c;
import com.airbnb.lottie.model.C21577h;
import com.airbnb.lottie.utils.C21682f;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.airbnb.lottie.manager.a */
public class C21539a {

    /* renamed from: a */
    public final C21577h<String> f55565a = new C21577h<>();

    /* renamed from: b */
    public final Map<C21577h<String>, Typeface> f55566b = new HashMap();

    /* renamed from: c */
    public final Map<String, Typeface> f55567c = new HashMap();

    /* renamed from: d */
    public final AssetManager f55568d;
    @C0363p0

    /* renamed from: e */
    public C21490c f55569e;

    /* renamed from: f */
    public String f55570f = ".ttf";

    public C21539a(Drawable.Callback callback, @C0363p0 C21490c cVar) {
        this.f55569e = cVar;
        if (!(callback instanceof View)) {
            C21682f.m99760e("LottieDrawable must be inside of a view for images to work.");
            this.f55568d = null;
            return;
        }
        this.f55568d = ((View) callback).getContext().getAssets();
    }

    /* renamed from: a */
    public final Typeface mo64283a(String str) {
        Typeface typeface;
        String b;
        Typeface typeface2 = this.f55567c.get(str);
        if (typeface2 != null) {
            return typeface2;
        }
        C21490c cVar = this.f55569e;
        if (cVar != null) {
            typeface = cVar.mo64114a(str);
        } else {
            typeface = null;
        }
        C21490c cVar2 = this.f55569e;
        if (!(cVar2 == null || typeface != null || (b = cVar2.mo64115b(str)) == null)) {
            typeface = Typeface.createFromAsset(this.f55568d, b);
        }
        if (typeface == null) {
            typeface = Typeface.createFromAsset(this.f55568d, "fonts/" + str + this.f55570f);
        }
        this.f55567c.put(str, typeface);
        return typeface;
    }

    /* renamed from: b */
    public Typeface mo64284b(String str, String str2) {
        this.f55565a.mo64443b(str, str2);
        Typeface typeface = this.f55566b.get(this.f55565a);
        if (typeface != null) {
            return typeface;
        }
        Typeface e = mo64287e(mo64283a(str), str2);
        this.f55566b.put(this.f55565a, e);
        return e;
    }

    /* renamed from: c */
    public void mo64285c(String str) {
        this.f55570f = str;
    }

    /* renamed from: d */
    public void mo64286d(@C0363p0 C21490c cVar) {
        this.f55569e = cVar;
    }

    /* renamed from: e */
    public final Typeface mo64287e(Typeface typeface, String str) {
        int i;
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        if (contains && contains2) {
            i = 3;
        } else if (contains) {
            i = 2;
        } else if (contains2) {
            i = 1;
        } else {
            i = 0;
        }
        if (typeface.getStyle() == i) {
            return typeface;
        }
        return Typeface.create(typeface, i);
    }
}

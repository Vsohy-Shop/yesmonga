package com.airbnb.lottie.model.content;

import android.graphics.Path;
import androidx.annotation.C0363p0;
import com.airbnb.lottie.C21516j;
import com.airbnb.lottie.animation.content.C21445c;
import com.airbnb.lottie.animation.content.C21449g;
import com.airbnb.lottie.model.animatable.C21543a;
import com.airbnb.lottie.model.animatable.C21546d;
import com.airbnb.lottie.model.layer.C21578a;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.airbnb.lottie.model.content.i */
public class C21569i implements C21562b {

    /* renamed from: a */
    public final boolean f55728a;

    /* renamed from: b */
    public final Path.FillType f55729b;

    /* renamed from: c */
    public final String f55730c;
    @C0363p0

    /* renamed from: d */
    public final C21543a f55731d;
    @C0363p0

    /* renamed from: e */
    public final C21546d f55732e;

    /* renamed from: f */
    public final boolean f55733f;

    public C21569i(String str, boolean z, Path.FillType fillType, @C0363p0 C21543a aVar, @C0363p0 C21546d dVar, boolean z2) {
        this.f55730c = str;
        this.f55728a = z;
        this.f55729b = fillType;
        this.f55731d = aVar;
        this.f55732e = dVar;
        this.f55733f = z2;
    }

    /* renamed from: a */
    public C21445c mo64305a(C21516j jVar, C21578a aVar) {
        return new C21449g(jVar, aVar, this);
    }

    @C0363p0
    /* renamed from: b */
    public C21543a mo64413b() {
        return this.f55731d;
    }

    /* renamed from: c */
    public Path.FillType mo64414c() {
        return this.f55729b;
    }

    /* renamed from: d */
    public String mo64415d() {
        return this.f55730c;
    }

    @C0363p0
    /* renamed from: e */
    public C21546d mo64416e() {
        return this.f55732e;
    }

    /* renamed from: f */
    public boolean mo64417f() {
        return this.f55733f;
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f55728a + C12361b.f30259j;
    }
}

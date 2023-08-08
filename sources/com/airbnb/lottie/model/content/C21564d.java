package com.airbnb.lottie.model.content;

import android.graphics.Path;
import androidx.annotation.C0363p0;
import com.airbnb.lottie.C21516j;
import com.airbnb.lottie.animation.content.C21445c;
import com.airbnb.lottie.animation.content.C21450h;
import com.airbnb.lottie.model.animatable.C21544b;
import com.airbnb.lottie.model.animatable.C21545c;
import com.airbnb.lottie.model.animatable.C21546d;
import com.airbnb.lottie.model.animatable.C21548f;
import com.airbnb.lottie.model.layer.C21578a;

/* renamed from: com.airbnb.lottie.model.content.d */
public class C21564d implements C21562b {

    /* renamed from: a */
    public final GradientType f55692a;

    /* renamed from: b */
    public final Path.FillType f55693b;

    /* renamed from: c */
    public final C21545c f55694c;

    /* renamed from: d */
    public final C21546d f55695d;

    /* renamed from: e */
    public final C21548f f55696e;

    /* renamed from: f */
    public final C21548f f55697f;

    /* renamed from: g */
    public final String f55698g;
    @C0363p0

    /* renamed from: h */
    public final C21544b f55699h;
    @C0363p0

    /* renamed from: i */
    public final C21544b f55700i;

    /* renamed from: j */
    public final boolean f55701j;

    public C21564d(String str, GradientType gradientType, Path.FillType fillType, C21545c cVar, C21546d dVar, C21548f fVar, C21548f fVar2, C21544b bVar, C21544b bVar2, boolean z) {
        this.f55692a = gradientType;
        this.f55693b = fillType;
        this.f55694c = cVar;
        this.f55695d = dVar;
        this.f55696e = fVar;
        this.f55697f = fVar2;
        this.f55698g = str;
        this.f55699h = bVar;
        this.f55700i = bVar2;
        this.f55701j = z;
    }

    /* renamed from: a */
    public C21445c mo64305a(C21516j jVar, C21578a aVar) {
        return new C21450h(jVar, aVar, this);
    }

    /* renamed from: b */
    public C21548f mo64373b() {
        return this.f55697f;
    }

    /* renamed from: c */
    public Path.FillType mo64374c() {
        return this.f55693b;
    }

    /* renamed from: d */
    public C21545c mo64375d() {
        return this.f55694c;
    }

    /* renamed from: e */
    public GradientType mo64376e() {
        return this.f55692a;
    }

    @C0363p0
    /* renamed from: f */
    public C21544b mo64377f() {
        return this.f55700i;
    }

    @C0363p0
    /* renamed from: g */
    public C21544b mo64378g() {
        return this.f55699h;
    }

    /* renamed from: h */
    public String mo64379h() {
        return this.f55698g;
    }

    /* renamed from: i */
    public C21546d mo64380i() {
        return this.f55695d;
    }

    /* renamed from: j */
    public C21548f mo64381j() {
        return this.f55696e;
    }

    /* renamed from: k */
    public boolean mo64382k() {
        return this.f55701j;
    }
}

package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C21516j;
import com.airbnb.lottie.animation.content.C21445c;
import com.airbnb.lottie.animation.content.C21462r;
import com.airbnb.lottie.model.animatable.C21550h;
import com.airbnb.lottie.model.layer.C21578a;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.airbnb.lottie.model.content.k */
public class C21571k implements C21562b {

    /* renamed from: a */
    public final String f55737a;

    /* renamed from: b */
    public final int f55738b;

    /* renamed from: c */
    public final C21550h f55739c;

    /* renamed from: d */
    public final boolean f55740d;

    public C21571k(String str, int i, C21550h hVar, boolean z) {
        this.f55737a = str;
        this.f55738b = i;
        this.f55739c = hVar;
        this.f55740d = z;
    }

    /* renamed from: a */
    public C21445c mo64305a(C21516j jVar, C21578a aVar) {
        return new C21462r(jVar, aVar, this);
    }

    /* renamed from: b */
    public String mo64423b() {
        return this.f55737a;
    }

    /* renamed from: c */
    public C21550h mo64424c() {
        return this.f55739c;
    }

    /* renamed from: d */
    public boolean mo64425d() {
        return this.f55740d;
    }

    public String toString() {
        return "ShapePath{name=" + this.f55737a + ", index=" + this.f55738b + C12361b.f30259j;
    }
}

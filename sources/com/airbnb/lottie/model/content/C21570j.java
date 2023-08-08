package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C21516j;
import com.airbnb.lottie.animation.content.C21445c;
import com.airbnb.lottie.animation.content.C21446d;
import com.airbnb.lottie.model.layer.C21578a;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.airbnb.lottie.model.content.j */
public class C21570j implements C21562b {

    /* renamed from: a */
    public final String f55734a;

    /* renamed from: b */
    public final List<C21562b> f55735b;

    /* renamed from: c */
    public final boolean f55736c;

    public C21570j(String str, List<C21562b> list, boolean z) {
        this.f55734a = str;
        this.f55735b = list;
        this.f55736c = z;
    }

    /* renamed from: a */
    public C21445c mo64305a(C21516j jVar, C21578a aVar) {
        return new C21446d(jVar, aVar, this);
    }

    /* renamed from: b */
    public List<C21562b> mo64419b() {
        return this.f55735b;
    }

    /* renamed from: c */
    public String mo64420c() {
        return this.f55734a;
    }

    /* renamed from: d */
    public boolean mo64421d() {
        return this.f55736c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f55734a + "' Shapes: " + Arrays.toString(this.f55735b.toArray()) + C12361b.f30259j;
    }
}

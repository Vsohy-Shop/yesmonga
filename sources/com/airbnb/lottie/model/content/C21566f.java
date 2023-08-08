package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.C21516j;
import com.airbnb.lottie.animation.content.C21445c;
import com.airbnb.lottie.animation.content.C21460p;
import com.airbnb.lottie.model.animatable.C21544b;
import com.airbnb.lottie.model.animatable.C21555m;
import com.airbnb.lottie.model.layer.C21578a;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.airbnb.lottie.model.content.f */
public class C21566f implements C21562b {

    /* renamed from: a */
    public final String f55715a;

    /* renamed from: b */
    public final C21555m<PointF, PointF> f55716b;

    /* renamed from: c */
    public final C21555m<PointF, PointF> f55717c;

    /* renamed from: d */
    public final C21544b f55718d;

    /* renamed from: e */
    public final boolean f55719e;

    public C21566f(String str, C21555m<PointF, PointF> mVar, C21555m<PointF, PointF> mVar2, C21544b bVar, boolean z) {
        this.f55715a = str;
        this.f55716b = mVar;
        this.f55717c = mVar2;
        this.f55718d = bVar;
        this.f55719e = z;
    }

    /* renamed from: a */
    public C21445c mo64305a(C21516j jVar, C21578a aVar) {
        return new C21460p(jVar, aVar, this);
    }

    /* renamed from: b */
    public C21544b mo64396b() {
        return this.f55718d;
    }

    /* renamed from: c */
    public String mo64397c() {
        return this.f55715a;
    }

    /* renamed from: d */
    public C21555m<PointF, PointF> mo64398d() {
        return this.f55716b;
    }

    /* renamed from: e */
    public C21555m<PointF, PointF> mo64399e() {
        return this.f55717c;
    }

    /* renamed from: f */
    public boolean mo64400f() {
        return this.f55719e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f55716b + ", size=" + this.f55717c + C12361b.f30259j;
    }
}

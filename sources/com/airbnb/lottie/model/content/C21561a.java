package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.C21516j;
import com.airbnb.lottie.animation.content.C21445c;
import com.airbnb.lottie.animation.content.C21448f;
import com.airbnb.lottie.model.animatable.C21548f;
import com.airbnb.lottie.model.animatable.C21555m;
import com.airbnb.lottie.model.layer.C21578a;

/* renamed from: com.airbnb.lottie.model.content.a */
public class C21561a implements C21562b {

    /* renamed from: a */
    public final String f55685a;

    /* renamed from: b */
    public final C21555m<PointF, PointF> f55686b;

    /* renamed from: c */
    public final C21548f f55687c;

    /* renamed from: d */
    public final boolean f55688d;

    /* renamed from: e */
    public final boolean f55689e;

    public C21561a(String str, C21555m<PointF, PointF> mVar, C21548f fVar, boolean z, boolean z2) {
        this.f55685a = str;
        this.f55686b = mVar;
        this.f55687c = fVar;
        this.f55688d = z;
        this.f55689e = z2;
    }

    /* renamed from: a */
    public C21445c mo64305a(C21516j jVar, C21578a aVar) {
        return new C21448f(jVar, aVar, this);
    }

    /* renamed from: b */
    public String mo64364b() {
        return this.f55685a;
    }

    /* renamed from: c */
    public C21555m<PointF, PointF> mo64365c() {
        return this.f55686b;
    }

    /* renamed from: d */
    public C21548f mo64366d() {
        return this.f55687c;
    }

    /* renamed from: e */
    public boolean mo64367e() {
        return this.f55689e;
    }

    /* renamed from: f */
    public boolean mo64368f() {
        return this.f55688d;
    }
}

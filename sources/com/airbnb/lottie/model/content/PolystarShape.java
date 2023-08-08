package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.C21516j;
import com.airbnb.lottie.animation.content.C21445c;
import com.airbnb.lottie.animation.content.C21458o;
import com.airbnb.lottie.model.animatable.C21544b;
import com.airbnb.lottie.model.animatable.C21555m;
import com.airbnb.lottie.model.layer.C21578a;

public class PolystarShape implements C21562b {

    /* renamed from: a */
    public final String f55643a;

    /* renamed from: b */
    public final Type f55644b;

    /* renamed from: c */
    public final C21544b f55645c;

    /* renamed from: d */
    public final C21555m<PointF, PointF> f55646d;

    /* renamed from: e */
    public final C21544b f55647e;

    /* renamed from: f */
    public final C21544b f55648f;

    /* renamed from: g */
    public final C21544b f55649g;

    /* renamed from: h */
    public final C21544b f55650h;

    /* renamed from: i */
    public final C21544b f55651i;

    /* renamed from: j */
    public final boolean f55652j;

    public enum Type {
        STAR(1),
        POLYGON(2);
        
        private final int value;

        /* access modifiers changed from: public */
        Type(int i) {
            this.value = i;
        }

        /* renamed from: b */
        public static Type m99324b(int i) {
            for (Type type : values()) {
                if (type.value == i) {
                    return type;
                }
            }
            return null;
        }
    }

    public PolystarShape(String str, Type type, C21544b bVar, C21555m<PointF, PointF> mVar, C21544b bVar2, C21544b bVar3, C21544b bVar4, C21544b bVar5, C21544b bVar6, boolean z) {
        this.f55643a = str;
        this.f55644b = type;
        this.f55645c = bVar;
        this.f55646d = mVar;
        this.f55647e = bVar2;
        this.f55648f = bVar3;
        this.f55649g = bVar4;
        this.f55650h = bVar5;
        this.f55651i = bVar6;
        this.f55652j = z;
    }

    /* renamed from: a */
    public C21445c mo64305a(C21516j jVar, C21578a aVar) {
        return new C21458o(jVar, aVar, this);
    }

    /* renamed from: b */
    public C21544b mo64335b() {
        return this.f55648f;
    }

    /* renamed from: c */
    public C21544b mo64336c() {
        return this.f55650h;
    }

    /* renamed from: d */
    public String mo64337d() {
        return this.f55643a;
    }

    /* renamed from: e */
    public C21544b mo64338e() {
        return this.f55649g;
    }

    /* renamed from: f */
    public C21544b mo64339f() {
        return this.f55651i;
    }

    /* renamed from: g */
    public C21544b mo64340g() {
        return this.f55645c;
    }

    /* renamed from: h */
    public C21555m<PointF, PointF> mo64341h() {
        return this.f55646d;
    }

    /* renamed from: i */
    public C21544b mo64342i() {
        return this.f55647e;
    }

    /* renamed from: j */
    public Type mo64343j() {
        return this.f55644b;
    }

    /* renamed from: k */
    public boolean mo64344k() {
        return this.f55652j;
    }
}

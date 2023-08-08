package com.airbnb.lottie.model.content;

import androidx.annotation.C0363p0;
import com.airbnb.lottie.C21516j;
import com.airbnb.lottie.animation.content.C21445c;
import com.airbnb.lottie.animation.content.C21451i;
import com.airbnb.lottie.model.animatable.C21544b;
import com.airbnb.lottie.model.animatable.C21545c;
import com.airbnb.lottie.model.animatable.C21546d;
import com.airbnb.lottie.model.animatable.C21548f;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.layer.C21578a;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.content.e */
public class C21565e implements C21562b {

    /* renamed from: a */
    public final String f55702a;

    /* renamed from: b */
    public final GradientType f55703b;

    /* renamed from: c */
    public final C21545c f55704c;

    /* renamed from: d */
    public final C21546d f55705d;

    /* renamed from: e */
    public final C21548f f55706e;

    /* renamed from: f */
    public final C21548f f55707f;

    /* renamed from: g */
    public final C21544b f55708g;

    /* renamed from: h */
    public final ShapeStroke.LineCapType f55709h;

    /* renamed from: i */
    public final ShapeStroke.LineJoinType f55710i;

    /* renamed from: j */
    public final float f55711j;

    /* renamed from: k */
    public final List<C21544b> f55712k;
    @C0363p0

    /* renamed from: l */
    public final C21544b f55713l;

    /* renamed from: m */
    public final boolean f55714m;

    public C21565e(String str, GradientType gradientType, C21545c cVar, C21546d dVar, C21548f fVar, C21548f fVar2, C21544b bVar, ShapeStroke.LineCapType lineCapType, ShapeStroke.LineJoinType lineJoinType, float f, List<C21544b> list, @C0363p0 C21544b bVar2, boolean z) {
        this.f55702a = str;
        this.f55703b = gradientType;
        this.f55704c = cVar;
        this.f55705d = dVar;
        this.f55706e = fVar;
        this.f55707f = fVar2;
        this.f55708g = bVar;
        this.f55709h = lineCapType;
        this.f55710i = lineJoinType;
        this.f55711j = f;
        this.f55712k = list;
        this.f55713l = bVar2;
        this.f55714m = z;
    }

    /* renamed from: a */
    public C21445c mo64305a(C21516j jVar, C21578a aVar) {
        return new C21451i(jVar, aVar, this);
    }

    /* renamed from: b */
    public ShapeStroke.LineCapType mo64383b() {
        return this.f55709h;
    }

    @C0363p0
    /* renamed from: c */
    public C21544b mo64384c() {
        return this.f55713l;
    }

    /* renamed from: d */
    public C21548f mo64385d() {
        return this.f55707f;
    }

    /* renamed from: e */
    public C21545c mo64386e() {
        return this.f55704c;
    }

    /* renamed from: f */
    public GradientType mo64387f() {
        return this.f55703b;
    }

    /* renamed from: g */
    public ShapeStroke.LineJoinType mo64388g() {
        return this.f55710i;
    }

    /* renamed from: h */
    public List<C21544b> mo64389h() {
        return this.f55712k;
    }

    /* renamed from: i */
    public float mo64390i() {
        return this.f55711j;
    }

    /* renamed from: j */
    public String mo64391j() {
        return this.f55702a;
    }

    /* renamed from: k */
    public C21546d mo64392k() {
        return this.f55705d;
    }

    /* renamed from: l */
    public C21548f mo64393l() {
        return this.f55706e;
    }

    /* renamed from: m */
    public C21544b mo64394m() {
        return this.f55708g;
    }

    /* renamed from: n */
    public boolean mo64395n() {
        return this.f55714m;
    }
}

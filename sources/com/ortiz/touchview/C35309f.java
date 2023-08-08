package com.ortiz.touchview;

import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.ortiz.touchview.f */
public final class C35309f {

    /* renamed from: a */
    public float f86765a;

    /* renamed from: b */
    public float f86766b;

    /* renamed from: c */
    public float f86767c;
    @C12580l

    /* renamed from: d */
    public ImageView.ScaleType f86768d;

    public C35309f(float f, float f2, float f3, @C12580l ImageView.ScaleType scaleType) {
        this.f86765a = f;
        this.f86766b = f2;
        this.f86767c = f3;
        this.f86768d = scaleType;
    }

    /* renamed from: f */
    public static /* synthetic */ C35309f m145540f(C35309f fVar, float f, float f2, float f3, ImageView.ScaleType scaleType, int i, Object obj) {
        if ((i & 1) != 0) {
            f = fVar.f86765a;
        }
        if ((i & 2) != 0) {
            f2 = fVar.f86766b;
        }
        if ((i & 4) != 0) {
            f3 = fVar.f86767c;
        }
        if ((i & 8) != 0) {
            scaleType = fVar.f86768d;
        }
        return fVar.mo105732e(f, f2, f3, scaleType);
    }

    /* renamed from: a */
    public final float mo105728a() {
        return this.f86765a;
    }

    /* renamed from: b */
    public final float mo105729b() {
        return this.f86766b;
    }

    /* renamed from: c */
    public final float mo105730c() {
        return this.f86767c;
    }

    @C12580l
    /* renamed from: d */
    public final ImageView.ScaleType mo105731d() {
        return this.f86768d;
    }

    @C12579k
    /* renamed from: e */
    public final C35309f mo105732e(float f, float f2, float f3, @C12580l ImageView.ScaleType scaleType) {
        return new C35309f(f, f2, f3, scaleType);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35309f)) {
            return false;
        }
        C35309f fVar = (C35309f) obj;
        return Intrinsics.areEqual((Object) Float.valueOf(this.f86765a), (Object) Float.valueOf(fVar.f86765a)) && Intrinsics.areEqual((Object) Float.valueOf(this.f86766b), (Object) Float.valueOf(fVar.f86766b)) && Intrinsics.areEqual((Object) Float.valueOf(this.f86767c), (Object) Float.valueOf(fVar.f86767c)) && this.f86768d == fVar.f86768d;
    }

    /* renamed from: g */
    public final float mo105734g() {
        return this.f86766b;
    }

    /* renamed from: h */
    public final float mo105735h() {
        return this.f86767c;
    }

    public int hashCode() {
        int hashCode = ((((Float.hashCode(this.f86765a) * 31) + Float.hashCode(this.f86766b)) * 31) + Float.hashCode(this.f86767c)) * 31;
        ImageView.ScaleType scaleType = this.f86768d;
        return hashCode + (scaleType == null ? 0 : scaleType.hashCode());
    }

    /* renamed from: i */
    public final float mo105737i() {
        return this.f86765a;
    }

    @C12580l
    /* renamed from: j */
    public final ImageView.ScaleType mo105738j() {
        return this.f86768d;
    }

    /* renamed from: k */
    public final void mo105739k(float f) {
        this.f86766b = f;
    }

    /* renamed from: l */
    public final void mo105740l(float f) {
        this.f86767c = f;
    }

    /* renamed from: m */
    public final void mo105741m(float f) {
        this.f86765a = f;
    }

    /* renamed from: n */
    public final void mo105742n(@C12580l ImageView.ScaleType scaleType) {
        this.f86768d = scaleType;
    }

    @C12579k
    public String toString() {
        return "ZoomVariables(scale=" + this.f86765a + ", focusX=" + this.f86766b + ", focusY=" + this.f86767c + ", scaleType=" + this.f86768d + ')';
    }
}

package com.skydoves.landscapist;

import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.skydoves.landscapist.n */
public final class C35344n {

    /* renamed from: g */
    public static final int f86825g = 0;

    /* renamed from: a */
    public final long f86826a;

    /* renamed from: b */
    public final long f86827b;

    /* renamed from: c */
    public final float f86828c;

    /* renamed from: d */
    public final float f86829d;

    /* renamed from: e */
    public final float f86830e;

    /* renamed from: f */
    public final int f86831f;

    public /* synthetic */ C35344n(long j, long j2, float f, float f2, float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, f, f2, f3, i);
    }

    /* renamed from: h */
    public static /* synthetic */ C35344n m145680h(C35344n nVar, long j, long j2, float f, float f2, float f3, int i, int i2, Object obj) {
        C35344n nVar2 = nVar;
        return nVar.mo105850g((i2 & 1) != 0 ? nVar2.f86826a : j, (i2 & 2) != 0 ? nVar2.f86827b : j2, (i2 & 4) != 0 ? nVar2.f86828c : f, (i2 & 8) != 0 ? nVar2.f86829d : f2, (i2 & 16) != 0 ? nVar2.f86830e : f3, (i2 & 32) != 0 ? nVar2.f86831f : i);
    }

    /* renamed from: a */
    public final long mo105843a() {
        return this.f86826a;
    }

    /* renamed from: b */
    public final long mo105844b() {
        return this.f86827b;
    }

    /* renamed from: c */
    public final float mo105845c() {
        return this.f86828c;
    }

    /* renamed from: d */
    public final float mo105846d() {
        return this.f86829d;
    }

    /* renamed from: e */
    public final float mo105847e() {
        return this.f86830e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35344n)) {
            return false;
        }
        C35344n nVar = (C35344n) obj;
        return C15240j2.m66082y(this.f86826a, nVar.f86826a) && C15240j2.m66082y(this.f86827b, nVar.f86827b) && Intrinsics.areEqual((Object) Float.valueOf(this.f86828c), (Object) Float.valueOf(nVar.f86828c)) && Intrinsics.areEqual((Object) Float.valueOf(this.f86829d), (Object) Float.valueOf(nVar.f86829d)) && Intrinsics.areEqual((Object) Float.valueOf(this.f86830e), (Object) Float.valueOf(nVar.f86830e)) && this.f86831f == nVar.f86831f;
    }

    /* renamed from: f */
    public final int mo105849f() {
        return this.f86831f;
    }

    @C12579k
    /* renamed from: g */
    public final C35344n mo105850g(long j, long j2, float f, float f2, float f3, int i) {
        return new C35344n(j, j2, f, f2, f3, i, (DefaultConstructorMarker) null);
    }

    public int hashCode() {
        return (((((((((C15240j2.m66056K(this.f86826a) * 31) + C15240j2.m66056K(this.f86827b)) * 31) + Float.hashCode(this.f86828c)) * 31) + Float.hashCode(this.f86829d)) * 31) + Float.hashCode(this.f86830e)) * 31) + Integer.hashCode(this.f86831f);
    }

    /* renamed from: i */
    public final long mo105852i() {
        return this.f86826a;
    }

    /* renamed from: j */
    public final float mo105853j() {
        return this.f86829d;
    }

    /* renamed from: k */
    public final int mo105854k() {
        return this.f86831f;
    }

    /* renamed from: l */
    public final long mo105855l() {
        return this.f86827b;
    }

    /* renamed from: m */
    public final float mo105856m() {
        return this.f86828c;
    }

    /* renamed from: n */
    public final float mo105857n() {
        return this.f86830e;
    }

    @C12579k
    public String toString() {
        return "ShimmerParams(baseColor=" + C15240j2.m66057L(this.f86826a) + ", highlightColor=" + C15240j2.m66057L(this.f86827b) + ", intensity=" + this.f86828c + ", dropOff=" + this.f86829d + ", tilt=" + this.f86830e + ", durationMillis=" + this.f86831f + ')';
    }

    public C35344n(long j, long j2, float f, float f2, float f3, int i) {
        this.f86826a = j;
        this.f86827b = j2;
        this.f86828c = f;
        this.f86829d = f2;
        this.f86830e = f3;
        this.f86831f = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C35344n(long j, long j2, float f, float f2, float f3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, (i2 & 4) != 0 ? 0.0f : f, (i2 & 8) != 0 ? 0.5f : f2, (i2 & 16) != 0 ? 20.0f : f3, (i2 & 32) != 0 ? 650 : i, (DefaultConstructorMarker) null);
    }
}

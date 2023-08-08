package com.google.zxing;

import com.google.zxing.common.detector.C34713a;

/* renamed from: com.google.zxing.l */
public class C34762l {

    /* renamed from: a */
    public final float f84278a;

    /* renamed from: b */
    public final float f84279b;

    public C34762l(float f, float f2) {
        this.f84278a = f;
        this.f84279b = f2;
    }

    /* renamed from: a */
    public static float m141931a(C34762l lVar, C34762l lVar2, C34762l lVar3) {
        float f = lVar2.f84278a;
        float f2 = lVar2.f84279b;
        return ((lVar3.f84278a - f) * (lVar.f84279b - f2)) - ((lVar3.f84279b - f2) * (lVar.f84278a - f));
    }

    /* renamed from: b */
    public static float m141932b(C34762l lVar, C34762l lVar2) {
        return C34713a.m141630a(lVar.f84278a, lVar.f84279b, lVar2.f84278a, lVar2.f84279b);
    }

    /* renamed from: e */
    public static void m141933e(C34762l[] lVarArr) {
        C34762l lVar;
        C34762l lVar2;
        C34762l lVar3;
        float b = m141932b(lVarArr[0], lVarArr[1]);
        float b2 = m141932b(lVarArr[1], lVarArr[2]);
        float b3 = m141932b(lVarArr[0], lVarArr[2]);
        if (b2 >= b && b2 >= b3) {
            lVar3 = lVarArr[0];
            lVar2 = lVarArr[1];
            lVar = lVarArr[2];
        } else if (b3 < b2 || b3 < b) {
            lVar3 = lVarArr[2];
            lVar2 = lVarArr[0];
            lVar = lVarArr[1];
        } else {
            lVar3 = lVarArr[1];
            lVar2 = lVarArr[0];
            lVar = lVarArr[2];
        }
        if (m141931a(lVar2, lVar3, lVar) < 0.0f) {
            C34762l lVar4 = lVar;
            lVar = lVar2;
            lVar2 = lVar4;
        }
        lVarArr[0] = lVar2;
        lVarArr[1] = lVar3;
        lVarArr[2] = lVar;
    }

    /* renamed from: c */
    public final float mo102883c() {
        return this.f84278a;
    }

    /* renamed from: d */
    public final float mo102884d() {
        return this.f84279b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C34762l) {
            C34762l lVar = (C34762l) obj;
            if (this.f84278a == lVar.f84278a && this.f84279b == lVar.f84279b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f84278a) * 31) + Float.floatToIntBits(this.f84279b);
    }

    public final String toString() {
        return "(" + this.f84278a + ',' + this.f84279b + ')';
    }
}

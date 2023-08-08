package com.google.android.material.color;

import androidx.annotation.C0327c1;
import androidx.annotation.C0336f;
import androidx.annotation.C0358n;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.material.C31076a;

/* renamed from: com.google.android.material.color.q */
public class C31262q {
    @C0358n
    @C0359n0

    /* renamed from: a */
    public final int[] f75251a;
    @C0363p0

    /* renamed from: b */
    public final C31259n f75252b;
    @C0336f

    /* renamed from: c */
    public final int f75253c;

    /* renamed from: com.google.android.material.color.q$b */
    public static class C31264b {
        @C0358n
        @C0359n0

        /* renamed from: a */
        public int[] f75254a = new int[0];
        @C0363p0

        /* renamed from: b */
        public C31259n f75255b;
        @C0336f

        /* renamed from: c */
        public int f75256c = C31076a.C31079c.colorPrimary;

        @C0359n0
        /* renamed from: d */
        public C31262q mo89229d() {
            return new C31262q(this);
        }

        @C0359n0
        /* renamed from: e */
        public C31264b mo89230e(@C0336f int i) {
            this.f75256c = i;
            return this;
        }

        @C0359n0
        /* renamed from: f */
        public C31264b mo89231f(@C0363p0 C31259n nVar) {
            this.f75255b = nVar;
            return this;
        }

        @C0359n0
        /* renamed from: g */
        public C31264b mo89232g(@C0358n @C0359n0 int[] iArr) {
            this.f75254a = iArr;
            return this;
        }
    }

    @C0359n0
    /* renamed from: a */
    public static C31262q m125925a() {
        return new C31264b().mo89231f(C31259n.m125914c()).mo89229d();
    }

    @C0336f
    /* renamed from: b */
    public int mo89225b() {
        return this.f75253c;
    }

    @C0363p0
    /* renamed from: c */
    public C31259n mo89226c() {
        return this.f75252b;
    }

    @C0358n
    @C0359n0
    /* renamed from: d */
    public int[] mo89227d() {
        return this.f75251a;
    }

    @C0327c1
    /* renamed from: e */
    public int mo89228e(@C0327c1 int i) {
        C31259n nVar = this.f75252b;
        if (nVar == null || nVar.mo89224e() == 0) {
            return i;
        }
        return this.f75252b.mo89224e();
    }

    public C31262q(C31264b bVar) {
        this.f75251a = bVar.f75254a;
        this.f75252b = bVar.f75255b;
        this.f75253c = bVar.f75256c;
    }
}

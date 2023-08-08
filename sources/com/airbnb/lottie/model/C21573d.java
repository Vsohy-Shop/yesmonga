package com.airbnb.lottie.model;

import androidx.annotation.C0349j;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.airbnb.lottie.model.d */
public class C21573d {

    /* renamed from: c */
    public static final C21573d f55741c = new C21573d("COMPOSITION");

    /* renamed from: a */
    public final List<String> f55742a;
    @C0363p0

    /* renamed from: b */
    public C21574e f55743b;

    public C21573d(String... strArr) {
        this.f55742a = Arrays.asList(strArr);
    }

    @C0349j
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: a */
    public C21573d mo64427a(String str) {
        C21573d dVar = new C21573d(this);
        dVar.f55742a.add(str);
        return dVar;
    }

    /* renamed from: b */
    public final boolean mo64428b() {
        List<String> list = this.f55742a;
        return list.get(list.size() - 1).equals("**");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: c */
    public boolean mo64429c(String str, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (i >= this.f55742a.size()) {
            return false;
        }
        if (i == this.f55742a.size() - 1) {
            z = true;
        } else {
            z = false;
        }
        String str2 = this.f55742a.get(i);
        if (!str2.equals("**")) {
            if (str2.equals(str) || str2.equals("*")) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((z || (i == this.f55742a.size() - 2 && mo64428b())) && z3) {
                return true;
            }
            return false;
        }
        if (z || !this.f55742a.get(i + 1).equals(str)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            if (i == this.f55742a.size() - 2 || (i == this.f55742a.size() - 3 && mo64428b())) {
                return true;
            }
            return false;
        } else if (z) {
            return true;
        } else {
            int i2 = i + 1;
            if (i2 < this.f55742a.size() - 1) {
                return false;
            }
            return this.f55742a.get(i2).equals(str);
        }
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: d */
    public C21574e mo64430d() {
        return this.f55743b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: e */
    public int mo64431e(String str, int i) {
        if (mo64432f(str)) {
            return 0;
        }
        if (!this.f55742a.get(i).equals("**")) {
            return 1;
        }
        if (i != this.f55742a.size() - 1 && this.f55742a.get(i + 1).equals(str)) {
            return 2;
        }
        return 0;
    }

    /* renamed from: f */
    public final boolean mo64432f(String str) {
        return "__container".equals(str);
    }

    /* renamed from: g */
    public String mo64433g() {
        return this.f55742a.toString();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: h */
    public boolean mo64434h(String str, int i) {
        if (mo64432f(str)) {
            return true;
        }
        if (i >= this.f55742a.size()) {
            return false;
        }
        if (this.f55742a.get(i).equals(str) || this.f55742a.get(i).equals("**") || this.f55742a.get(i).equals("*")) {
            return true;
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: i */
    public boolean mo64435i(String str, int i) {
        if (!"__container".equals(str) && i >= this.f55742a.size() - 1 && !this.f55742a.get(i).equals("**")) {
            return false;
        }
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: j */
    public C21573d mo64436j(C21574e eVar) {
        C21573d dVar = new C21573d(this);
        dVar.f55743b = eVar;
        return dVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPath{keys=");
        sb.append(this.f55742a);
        sb.append(",resolved=");
        sb.append(this.f55743b != null);
        sb.append(C12361b.f30259j);
        return sb.toString();
    }

    public C21573d(C21573d dVar) {
        this.f55742a = new ArrayList(dVar.f55742a);
        this.f55743b = dVar.f55743b;
    }
}

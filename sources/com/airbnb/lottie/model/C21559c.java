package com.airbnb.lottie.model;

import androidx.annotation.RestrictTo;
import com.airbnb.lottie.model.content.C21570j;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: com.airbnb.lottie.model.c */
public class C21559c {

    /* renamed from: a */
    public final List<C21570j> f55616a;

    /* renamed from: b */
    public final char f55617b;

    /* renamed from: c */
    public final double f55618c;

    /* renamed from: d */
    public final double f55619d;

    /* renamed from: e */
    public final String f55620e;

    /* renamed from: f */
    public final String f55621f;

    public C21559c(List<C21570j> list, char c, double d, double d2, String str, String str2) {
        this.f55616a = list;
        this.f55617b = c;
        this.f55618c = d;
        this.f55619d = d2;
        this.f55620e = str;
        this.f55621f = str2;
    }

    /* renamed from: e */
    public static int m99299e(char c, String str, String str2) {
        return ((((0 + c) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    /* renamed from: a */
    public List<C21570j> mo64322a() {
        return this.f55616a;
    }

    /* renamed from: b */
    public double mo64323b() {
        return this.f55618c;
    }

    /* renamed from: c */
    public String mo64324c() {
        return this.f55620e;
    }

    /* renamed from: d */
    public double mo64325d() {
        return this.f55619d;
    }

    public int hashCode() {
        return m99299e(this.f55617b, this.f55621f, this.f55620e);
    }
}

package com.google.maps.android.geometry;

/* renamed from: com.google.maps.android.geometry.a */
public class C33871a {

    /* renamed from: a */
    public final double f82166a;

    /* renamed from: b */
    public final double f82167b;

    /* renamed from: c */
    public final double f82168c;

    /* renamed from: d */
    public final double f82169d;

    /* renamed from: e */
    public final double f82170e;

    /* renamed from: f */
    public final double f82171f;

    public C33871a(double d, double d2, double d3, double d4) {
        this.f82166a = d;
        this.f82167b = d3;
        this.f82168c = d2;
        this.f82169d = d4;
        this.f82170e = (d + d2) / 2.0d;
        this.f82171f = (d3 + d4) / 2.0d;
    }

    /* renamed from: a */
    public boolean mo98560a(double d, double d2) {
        return this.f82166a <= d && d <= this.f82168c && this.f82167b <= d2 && d2 <= this.f82169d;
    }

    /* renamed from: b */
    public boolean mo98561b(C33871a aVar) {
        return aVar.f82166a >= this.f82166a && aVar.f82168c <= this.f82168c && aVar.f82167b >= this.f82167b && aVar.f82169d <= this.f82169d;
    }

    /* renamed from: c */
    public boolean mo98562c(C33872b bVar) {
        return mo98560a(bVar.f82172a, bVar.f82173b);
    }

    /* renamed from: d */
    public boolean mo98563d(double d, double d2, double d3, double d4) {
        return d < this.f82168c && this.f82166a < d2 && d3 < this.f82169d && this.f82167b < d4;
    }

    /* renamed from: e */
    public boolean mo98564e(C33871a aVar) {
        return mo98563d(aVar.f82166a, aVar.f82168c, aVar.f82167b, aVar.f82169d);
    }
}

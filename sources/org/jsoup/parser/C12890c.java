package org.jsoup.parser;

/* renamed from: org.jsoup.parser.c */
public class C12890c {

    /* renamed from: a */
    public int f31850a;

    /* renamed from: b */
    public String f31851b;

    /* renamed from: c */
    public String f31852c;

    public C12890c(C12888a aVar, String str) {
        this.f31850a = aVar.mo30043O();
        this.f31851b = aVar.mo30071v();
        this.f31852c = str;
    }

    /* renamed from: a */
    public String mo30165a() {
        return this.f31851b;
    }

    /* renamed from: b */
    public String mo30166b() {
        return this.f31852c;
    }

    /* renamed from: c */
    public int mo30167c() {
        return this.f31850a;
    }

    public String toString() {
        return "<" + this.f31851b + ">: " + this.f31852c;
    }

    public C12890c(C12888a aVar, String str, Object... objArr) {
        this.f31850a = aVar.mo30043O();
        this.f31851b = aVar.mo30071v();
        this.f31852c = String.format(str, objArr);
    }

    public C12890c(int i, String str) {
        this.f31850a = i;
        this.f31851b = String.valueOf(i);
        this.f31852c = str;
    }

    public C12890c(int i, String str, Object... objArr) {
        this.f31850a = i;
        this.f31851b = String.valueOf(i);
        this.f31852c = String.format(str, objArr);
    }
}

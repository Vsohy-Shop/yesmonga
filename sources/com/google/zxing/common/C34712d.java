package com.google.zxing.common;

import java.util.List;

/* renamed from: com.google.zxing.common.d */
public final class C34712d {

    /* renamed from: a */
    public final byte[] f84061a;

    /* renamed from: b */
    public int f84062b;

    /* renamed from: c */
    public final String f84063c;

    /* renamed from: d */
    public final List<byte[]> f84064d;

    /* renamed from: e */
    public final String f84065e;

    /* renamed from: f */
    public Integer f84066f;

    /* renamed from: g */
    public Integer f84067g;

    /* renamed from: h */
    public Object f84068h;

    /* renamed from: i */
    public final int f84069i;

    /* renamed from: j */
    public final int f84070j;

    public C34712d(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    /* renamed from: a */
    public List<byte[]> mo102683a() {
        return this.f84064d;
    }

    /* renamed from: b */
    public String mo102684b() {
        return this.f84065e;
    }

    /* renamed from: c */
    public Integer mo102685c() {
        return this.f84067g;
    }

    /* renamed from: d */
    public Integer mo102686d() {
        return this.f84066f;
    }

    /* renamed from: e */
    public int mo102687e() {
        return this.f84062b;
    }

    /* renamed from: f */
    public Object mo102688f() {
        return this.f84068h;
    }

    /* renamed from: g */
    public byte[] mo102689g() {
        return this.f84061a;
    }

    /* renamed from: h */
    public int mo102690h() {
        return this.f84069i;
    }

    /* renamed from: i */
    public int mo102691i() {
        return this.f84070j;
    }

    /* renamed from: j */
    public String mo102692j() {
        return this.f84063c;
    }

    /* renamed from: k */
    public boolean mo102693k() {
        return this.f84069i >= 0 && this.f84070j >= 0;
    }

    /* renamed from: l */
    public void mo102694l(Integer num) {
        this.f84067g = num;
    }

    /* renamed from: m */
    public void mo102695m(Integer num) {
        this.f84066f = num;
    }

    /* renamed from: n */
    public void mo102696n(int i) {
        this.f84062b = i;
    }

    /* renamed from: o */
    public void mo102697o(Object obj) {
        this.f84068h = obj;
    }

    public C34712d(byte[] bArr, String str, List<byte[]> list, String str2, int i, int i2) {
        int i3;
        this.f84061a = bArr;
        if (bArr == null) {
            i3 = 0;
        } else {
            i3 = bArr.length * 8;
        }
        this.f84062b = i3;
        this.f84063c = str;
        this.f84064d = list;
        this.f84065e = str2;
        this.f84069i = i2;
        this.f84070j = i;
    }
}

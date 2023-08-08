package com.google.zxing.integration.android;

import android.content.Intent;

/* renamed from: com.google.zxing.integration.android.b */
public final class C34759b {

    /* renamed from: a */
    public final String f84264a;

    /* renamed from: b */
    public final String f84265b;

    /* renamed from: c */
    public final byte[] f84266c;

    /* renamed from: d */
    public final Integer f84267d;

    /* renamed from: e */
    public final String f84268e;

    /* renamed from: f */
    public final String f84269f;

    /* renamed from: g */
    public final Intent f84270g;

    public C34759b() {
        this((String) null, (String) null, (byte[]) null, (Integer) null, (String) null, (String) null, (Intent) null);
    }

    /* renamed from: a */
    public String mo102864a() {
        return this.f84269f;
    }

    /* renamed from: b */
    public String mo102865b() {
        return this.f84264a;
    }

    /* renamed from: c */
    public String mo102866c() {
        return this.f84268e;
    }

    /* renamed from: d */
    public String mo102867d() {
        return this.f84265b;
    }

    /* renamed from: e */
    public Integer mo102868e() {
        return this.f84267d;
    }

    /* renamed from: f */
    public Intent mo102869f() {
        return this.f84270g;
    }

    /* renamed from: g */
    public byte[] mo102870g() {
        return this.f84266c;
    }

    public String toString() {
        int i;
        byte[] bArr = this.f84266c;
        if (bArr == null) {
            i = 0;
        } else {
            i = bArr.length;
        }
        return "Format: " + this.f84265b + 10 + "Contents: " + this.f84264a + 10 + "Raw bytes: (" + i + " bytes)\nOrientation: " + this.f84267d + 10 + "EC level: " + this.f84268e + 10 + "Barcode image: " + this.f84269f + 10 + "Original intent: " + this.f84270g + 10;
    }

    public C34759b(Intent intent) {
        this((String) null, (String) null, (byte[]) null, (Integer) null, (String) null, (String) null, intent);
    }

    public C34759b(String str, String str2, byte[] bArr, Integer num, String str3, String str4, Intent intent) {
        this.f84264a = str;
        this.f84265b = str2;
        this.f84266c = bArr;
        this.f84267d = num;
        this.f84268e = str3;
        this.f84269f = str4;
        this.f84270g = intent;
    }
}

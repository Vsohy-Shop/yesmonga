package com.android.volley.toolbox;

import androidx.annotation.C0363p0;
import com.android.volley.C21759i;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* renamed from: com.android.volley.toolbox.n */
public final class C21813n {

    /* renamed from: a */
    public final int f56432a;

    /* renamed from: b */
    public final List<C21759i> f56433b;

    /* renamed from: c */
    public final int f56434c;
    @C0363p0

    /* renamed from: d */
    public final InputStream f56435d;
    @C0363p0

    /* renamed from: e */
    public final byte[] f56436e;

    public C21813n(int i, List<C21759i> list) {
        this(i, list, -1, (InputStream) null);
    }

    @C0363p0
    /* renamed from: a */
    public final InputStream mo65024a() {
        InputStream inputStream = this.f56435d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.f56436e != null) {
            return new ByteArrayInputStream(this.f56436e);
        }
        return null;
    }

    @C0363p0
    /* renamed from: b */
    public final byte[] mo65025b() {
        return this.f56436e;
    }

    /* renamed from: c */
    public final int mo65026c() {
        return this.f56434c;
    }

    /* renamed from: d */
    public final List<C21759i> mo65027d() {
        return Collections.unmodifiableList(this.f56433b);
    }

    /* renamed from: e */
    public final int mo65028e() {
        return this.f56432a;
    }

    public C21813n(int i, List<C21759i> list, int i2, InputStream inputStream) {
        this.f56432a = i;
        this.f56433b = list;
        this.f56434c = i2;
        this.f56435d = inputStream;
        this.f56436e = null;
    }

    public C21813n(int i, List<C21759i> list, byte[] bArr) {
        this.f56432a = i;
        this.f56433b = list;
        this.f56434c = bArr.length;
        this.f56436e = bArr;
        this.f56435d = null;
    }
}

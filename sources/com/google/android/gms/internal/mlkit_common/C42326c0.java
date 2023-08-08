package com.google.android.gms.internal.mlkit_common;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.firebase.encoders.C33000c;
import com.google.firebase.encoders.C33008g;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.mlkit_common.c0 */
public final class C42326c0 implements C33008g {

    /* renamed from: a */
    public boolean f106863a = false;

    /* renamed from: b */
    public boolean f106864b = false;

    /* renamed from: c */
    public C33000c f106865c;

    /* renamed from: d */
    public final C42564y f106866d;

    public C42326c0(C42564y yVar) {
        this.f106866d = yVar;
    }

    @C0359n0
    /* renamed from: N */
    public final C33008g mo85251N(long j) throws IOException {
        mo137633b();
        this.f106866d.mo137832s(this.f106865c, j, this.f106864b);
        return this;
    }

    @C0359n0
    /* renamed from: O */
    public final C33008g mo85252O(@C0363p0 String str) throws IOException {
        mo137633b();
        this.f106866d.mo137830q(this.f106865c, str, this.f106864b);
        return this;
    }

    @C0359n0
    /* renamed from: P */
    public final C33008g mo85253P(boolean z) throws IOException {
        mo137633b();
        this.f106866d.mo137831r(this.f106865c, z ? 1 : 0, this.f106864b);
        return this;
    }

    @C0359n0
    /* renamed from: Q */
    public final C33008g mo85254Q(double d) throws IOException {
        mo137633b();
        this.f106866d.mo137828o(this.f106865c, d, this.f106864b);
        return this;
    }

    @C0359n0
    /* renamed from: R */
    public final C33008g mo85255R(float f) throws IOException {
        mo137633b();
        this.f106866d.mo137829p(this.f106865c, f, this.f106864b);
        return this;
    }

    /* renamed from: a */
    public final void mo137632a(C33000c cVar, boolean z) {
        this.f106863a = false;
        this.f106865c = cVar;
        this.f106864b = z;
    }

    @C0359n0
    public final C33008g add(int i) throws IOException {
        mo137633b();
        this.f106866d.mo137831r(this.f106865c, i, this.f106864b);
        return this;
    }

    /* renamed from: b */
    public final void mo137633b() {
        if (!this.f106863a) {
            this.f106863a = true;
            return;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    @C0359n0
    /* renamed from: s */
    public final C33008g mo85259s(@C0359n0 byte[] bArr) throws IOException {
        mo137633b();
        this.f106866d.mo137830q(this.f106865c, bArr, this.f106864b);
        return this;
    }
}

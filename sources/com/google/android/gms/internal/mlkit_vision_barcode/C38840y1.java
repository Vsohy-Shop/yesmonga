package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.firebase.encoders.C33000c;
import com.google.firebase.encoders.C33008g;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode.y1 */
public final class C38840y1 implements C33008g {

    /* renamed from: a */
    public boolean f98283a = false;

    /* renamed from: b */
    public boolean f98284b = false;

    /* renamed from: c */
    public C33000c f98285c;

    /* renamed from: d */
    public final C38792u1 f98286d;

    public C38840y1(C38792u1 u1Var) {
        this.f98286d = u1Var;
    }

    @C0359n0
    /* renamed from: N */
    public final C33008g mo85251N(long j) throws IOException {
        mo122576b();
        this.f98286d.mo122537s(this.f98285c, j, this.f98284b);
        return this;
    }

    @C0359n0
    /* renamed from: O */
    public final C33008g mo85252O(@C0363p0 String str) throws IOException {
        mo122576b();
        this.f98286d.mo122535q(this.f98285c, str, this.f98284b);
        return this;
    }

    @C0359n0
    /* renamed from: P */
    public final C33008g mo85253P(boolean z) throws IOException {
        mo122576b();
        this.f98286d.mo122536r(this.f98285c, z ? 1 : 0, this.f98284b);
        return this;
    }

    @C0359n0
    /* renamed from: Q */
    public final C33008g mo85254Q(double d) throws IOException {
        mo122576b();
        this.f98286d.mo122533o(this.f98285c, d, this.f98284b);
        return this;
    }

    @C0359n0
    /* renamed from: R */
    public final C33008g mo85255R(float f) throws IOException {
        mo122576b();
        this.f98286d.mo122534p(this.f98285c, f, this.f98284b);
        return this;
    }

    /* renamed from: a */
    public final void mo122575a(C33000c cVar, boolean z) {
        this.f98283a = false;
        this.f98285c = cVar;
        this.f98284b = z;
    }

    @C0359n0
    public final C33008g add(int i) throws IOException {
        mo122576b();
        this.f98286d.mo122536r(this.f98285c, i, this.f98284b);
        return this;
    }

    /* renamed from: b */
    public final void mo122576b() {
        if (!this.f98283a) {
            this.f98283a = true;
            return;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    @C0359n0
    /* renamed from: s */
    public final C33008g mo85259s(@C0359n0 byte[] bArr) throws IOException {
        mo122576b();
        this.f98286d.mo122535q(this.f98285c, bArr, this.f98284b);
        return this;
    }
}

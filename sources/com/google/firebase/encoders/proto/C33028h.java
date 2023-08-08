package com.google.firebase.encoders.proto;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.firebase.encoders.C33000c;
import com.google.firebase.encoders.C33008g;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;

/* renamed from: com.google.firebase.encoders.proto.h */
public class C33028h implements C33008g {

    /* renamed from: a */
    public boolean f80138a = false;

    /* renamed from: b */
    public boolean f80139b = false;

    /* renamed from: c */
    public C33000c f80140c;

    /* renamed from: d */
    public final C33023e f80141d;

    public C33028h(C33023e eVar) {
        this.f80141d = eVar;
    }

    @C0359n0
    /* renamed from: N */
    public C33008g mo85251N(long j) throws IOException {
        mo95700a();
        this.f80141d.mo95689v(this.f80140c, j, this.f80139b);
        return this;
    }

    @C0359n0
    /* renamed from: O */
    public C33008g mo85252O(@C0363p0 String str) throws IOException {
        mo95700a();
        this.f80141d.mo95685r(this.f80140c, str, this.f80139b);
        return this;
    }

    @C0359n0
    /* renamed from: P */
    public C33008g mo85253P(boolean z) throws IOException {
        mo95700a();
        this.f80141d.mo95691x(this.f80140c, z, this.f80139b);
        return this;
    }

    @C0359n0
    /* renamed from: Q */
    public C33008g mo85254Q(double d) throws IOException {
        mo95700a();
        this.f80141d.mo95683p(this.f80140c, d, this.f80139b);
        return this;
    }

    @C0359n0
    /* renamed from: R */
    public C33008g mo85255R(float f) throws IOException {
        mo95700a();
        this.f80141d.mo95684q(this.f80140c, f, this.f80139b);
        return this;
    }

    /* renamed from: a */
    public final void mo95700a() {
        if (!this.f80138a) {
            this.f80138a = true;
            return;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    @C0359n0
    public C33008g add(int i) throws IOException {
        mo95700a();
        this.f80141d.mo95687t(this.f80140c, i, this.f80139b);
        return this;
    }

    /* renamed from: b */
    public void mo95701b(C33000c cVar, boolean z) {
        this.f80138a = false;
        this.f80140c = cVar;
        this.f80139b = z;
    }

    @C0359n0
    /* renamed from: s */
    public C33008g mo85259s(@C0359n0 byte[] bArr) throws IOException {
        mo95700a();
        this.f80141d.mo95685r(this.f80140c, bArr, this.f80139b);
        return this;
    }
}

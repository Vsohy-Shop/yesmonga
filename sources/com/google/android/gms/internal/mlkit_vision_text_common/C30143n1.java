package com.google.android.gms.internal.mlkit_vision_text_common;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.firebase.encoders.C33000c;
import com.google.firebase.encoders.C33008g;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.n1 */
public final class C30143n1 implements C33008g {

    /* renamed from: a */
    public boolean f72034a = false;

    /* renamed from: b */
    public boolean f72035b = false;

    /* renamed from: c */
    public C33000c f72036c;

    /* renamed from: d */
    public final C30095j1 f72037d;

    public C30143n1(C30095j1 j1Var) {
        this.f72037d = j1Var;
    }

    @C0359n0
    /* renamed from: N */
    public final C33008g mo85251N(long j) throws IOException {
        mo85258b();
        this.f72037d.mo85177s(this.f72036c, j, this.f72035b);
        return this;
    }

    @C0359n0
    /* renamed from: O */
    public final C33008g mo85252O(@C0363p0 String str) throws IOException {
        mo85258b();
        this.f72037d.mo85175q(this.f72036c, str, this.f72035b);
        return this;
    }

    @C0359n0
    /* renamed from: P */
    public final C33008g mo85253P(boolean z) throws IOException {
        mo85258b();
        this.f72037d.mo85176r(this.f72036c, z ? 1 : 0, this.f72035b);
        return this;
    }

    @C0359n0
    /* renamed from: Q */
    public final C33008g mo85254Q(double d) throws IOException {
        mo85258b();
        this.f72037d.mo85173o(this.f72036c, d, this.f72035b);
        return this;
    }

    @C0359n0
    /* renamed from: R */
    public final C33008g mo85255R(float f) throws IOException {
        mo85258b();
        this.f72037d.mo85174p(this.f72036c, f, this.f72035b);
        return this;
    }

    /* renamed from: a */
    public final void mo85256a(C33000c cVar, boolean z) {
        this.f72034a = false;
        this.f72036c = cVar;
        this.f72035b = z;
    }

    @C0359n0
    public final C33008g add(int i) throws IOException {
        mo85258b();
        this.f72037d.mo85176r(this.f72036c, i, this.f72035b);
        return this;
    }

    /* renamed from: b */
    public final void mo85258b() {
        if (!this.f72034a) {
            this.f72034a = true;
            return;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    @C0359n0
    /* renamed from: s */
    public final C33008g mo85259s(@C0359n0 byte[] bArr) throws IOException {
        mo85258b();
        this.f72037d.mo85175q(this.f72036c, bArr, this.f72035b);
        return this;
    }
}

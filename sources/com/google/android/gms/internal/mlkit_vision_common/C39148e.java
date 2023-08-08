package com.google.android.gms.internal.mlkit_vision_common;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.firebase.encoders.C33000c;
import com.google.firebase.encoders.C33008g;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_common.e */
public final class C39148e implements C33008g {

    /* renamed from: a */
    public boolean f99928a = false;

    /* renamed from: b */
    public boolean f99929b = false;

    /* renamed from: c */
    public C33000c f99930c;

    /* renamed from: d */
    public final C39147d8 f99931d;

    public C39148e(C39147d8 d8Var) {
        this.f99931d = d8Var;
    }

    @C0359n0
    /* renamed from: N */
    public final C33008g mo85251N(long j) throws IOException {
        mo123256b();
        this.f99931d.mo123250s(this.f99930c, j, this.f99929b);
        return this;
    }

    @C0359n0
    /* renamed from: O */
    public final C33008g mo85252O(@C0363p0 String str) throws IOException {
        mo123256b();
        this.f99931d.mo123248q(this.f99930c, str, this.f99929b);
        return this;
    }

    @C0359n0
    /* renamed from: P */
    public final C33008g mo85253P(boolean z) throws IOException {
        mo123256b();
        this.f99931d.mo123249r(this.f99930c, z ? 1 : 0, this.f99929b);
        return this;
    }

    @C0359n0
    /* renamed from: Q */
    public final C33008g mo85254Q(double d) throws IOException {
        mo123256b();
        this.f99931d.mo123246o(this.f99930c, d, this.f99929b);
        return this;
    }

    @C0359n0
    /* renamed from: R */
    public final C33008g mo85255R(float f) throws IOException {
        mo123256b();
        this.f99931d.mo123247p(this.f99930c, f, this.f99929b);
        return this;
    }

    /* renamed from: a */
    public final void mo123255a(C33000c cVar, boolean z) {
        this.f99928a = false;
        this.f99930c = cVar;
        this.f99929b = z;
    }

    @C0359n0
    public final C33008g add(int i) throws IOException {
        mo123256b();
        this.f99931d.mo123249r(this.f99930c, i, this.f99929b);
        return this;
    }

    /* renamed from: b */
    public final void mo123256b() {
        if (!this.f99928a) {
            this.f99928a = true;
            return;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    @C0359n0
    /* renamed from: s */
    public final C33008g mo85259s(@C0359n0 byte[] bArr) throws IOException {
        mo123256b();
        this.f99931d.mo123248q(this.f99930c, bArr, this.f99929b);
        return this;
    }
}

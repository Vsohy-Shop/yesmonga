package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.net.Uri;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.common.internal.C40843u;

@C40473a
/* renamed from: com.google.android.gms.common.data.f */
public abstract class C40697f {
    @C40473a
    @C0359n0

    /* renamed from: a */
    public final DataHolder f103674a;
    @C40473a

    /* renamed from: b */
    public int f103675b;

    /* renamed from: c */
    public int f103676c;

    @C40473a
    public C40697f(@C0359n0 DataHolder dataHolder, int i) {
        this.f103674a = (DataHolder) C40843u.m166202l(dataHolder);
        mo134177n(i);
    }

    @C40473a
    /* renamed from: a */
    public void mo134162a(@C0359n0 String str, @C0359n0 CharArrayBuffer charArrayBuffer) {
        this.f103674a.mo134140j1(str, this.f103675b, this.f103676c, charArrayBuffer);
    }

    @C40473a
    /* renamed from: b */
    public boolean mo134163b(@C0359n0 String str) {
        return this.f103674a.mo134131W(str, this.f103675b, this.f103676c);
    }

    @C40473a
    @C0359n0
    /* renamed from: c */
    public byte[] mo134164c(@C0359n0 String str) {
        return this.f103674a.mo134132X(str, this.f103675b, this.f103676c);
    }

    @C40473a
    /* renamed from: d */
    public int mo134165d() {
        return this.f103675b;
    }

    @C40473a
    /* renamed from: e */
    public double mo134166e(@C0359n0 String str) {
        return this.f103674a.mo134129K0(str, this.f103675b, this.f103676c);
    }

    @C40473a
    public boolean equals(@C0363p0 Object obj) {
        if (obj instanceof C40697f) {
            C40697f fVar = (C40697f) obj;
            if (!C40808s.m166010b(Integer.valueOf(fVar.f103675b), Integer.valueOf(this.f103675b)) || !C40808s.m166010b(Integer.valueOf(fVar.f103676c), Integer.valueOf(this.f103676c)) || fVar.f103674a != this.f103674a) {
                return false;
            }
            return true;
        }
        return false;
    }

    @C40473a
    /* renamed from: f */
    public float mo134168f(@C0359n0 String str) {
        return this.f103674a.mo134130N0(str, this.f103675b, this.f103676c);
    }

    @C40473a
    /* renamed from: g */
    public int mo134169g(@C0359n0 String str) {
        return this.f103674a.mo134134e0(str, this.f103675b, this.f103676c);
    }

    @C40473a
    /* renamed from: h */
    public long mo134170h(@C0359n0 String str) {
        return this.f103674a.mo134135f0(str, this.f103675b, this.f103676c);
    }

    @C40473a
    public int hashCode() {
        return C40808s.m166011c(Integer.valueOf(this.f103675b), Integer.valueOf(this.f103676c), this.f103674a);
    }

    @C40473a
    @C0359n0
    /* renamed from: i */
    public String mo134172i(@C0359n0 String str) {
        return this.f103674a.mo134143p0(str, this.f103675b, this.f103676c);
    }

    @C40473a
    /* renamed from: j */
    public boolean mo134173j(@C0359n0 String str) {
        return this.f103674a.mo134126A0(str);
    }

    @C40473a
    /* renamed from: k */
    public boolean mo134174k(@C0359n0 String str) {
        return this.f103674a.mo134128C0(str, this.f103675b, this.f103676c);
    }

    @C40473a
    /* renamed from: l */
    public boolean mo134175l() {
        return !this.f103674a.isClosed();
    }

    @C0363p0
    @C40473a
    /* renamed from: m */
    public Uri mo134176m(@C0359n0 String str) {
        String p0 = this.f103674a.mo134143p0(str, this.f103675b, this.f103676c);
        if (p0 == null) {
            return null;
        }
        return Uri.parse(p0);
    }

    /* renamed from: n */
    public final void mo134177n(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f103674a.getCount()) {
            z = true;
        }
        C40843u.m166208r(z);
        this.f103675b = i;
        this.f103676c = this.f103674a.mo134144t0(i);
    }
}

package com.urbanairship.messagecenter;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.C36059m;
import com.urbanairship.C36071u;
import com.urbanairship.channel.C9008d;
import com.urbanairship.util.C9669o0;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.urbanairship.messagecenter.z */
public class C9420z {

    /* renamed from: d */
    public static final String f25718d = "com.urbanairship.user";

    /* renamed from: e */
    public static final String f25719e = "com.urbanairship.user.ID";

    /* renamed from: f */
    public static final String f25720f = "com.urbanairship.user.PASSWORD";

    /* renamed from: g */
    public static final String f25721g = "com.urbanairship.user.USER_TOKEN";

    /* renamed from: h */
    public static final String f25722h = "com.urbanairship.user.REGISTERED_CHANNEL_ID";

    /* renamed from: a */
    public final List<C9421a> f25723a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public final C36071u f25724b;

    /* renamed from: c */
    public final C9008d f25725c;

    /* renamed from: com.urbanairship.messagecenter.z$a */
    public interface C9421a {
        /* renamed from: a */
        void mo18944a(boolean z);
    }

    public C9420z(@C0359n0 C36071u uVar, @C0359n0 C9008d dVar) {
        this.f25724b = uVar;
        this.f25725c = dVar;
        String k = uVar.mo107848k(f25720f, (String) null);
        if (!C9669o0.m36224e(k) && uVar.mo107858w(f25721g, m35383c(k, uVar.mo107848k(f25719e, (String) null)))) {
            uVar.mo107859x(f25720f);
        }
    }

    @C0363p0
    /* renamed from: b */
    public static String m35382b(@C0363p0 String str, @C0363p0 String str2) {
        if (!C9669o0.m36224e(str) && !C9669o0.m36224e(str2)) {
            int length = str.length();
            if (length % 2 != 0) {
                return null;
            }
            try {
                byte[] bArr = new byte[(length / 2)];
                int i = 0;
                while (i < length) {
                    int i2 = i + 2;
                    bArr[i / 2] = Byte.parseByte(str.substring(i, i2), 16);
                    i = i2;
                }
                return new String(m35385p(bArr, str2.getBytes()), "UTF-8");
            } catch (UnsupportedEncodingException e) {
                C36059m.m148411g(e, "RichPushUser - Unable to decode string.", new Object[0]);
            } catch (NumberFormatException e2) {
                C36059m.m148411g(e2, "RichPushUser - String contains invalid hex numbers.", new Object[0]);
            }
        }
        return null;
    }

    @C0363p0
    /* renamed from: c */
    public static String m35383c(@C0363p0 String str, @C0363p0 String str2) {
        if (C9669o0.m36224e(str) || C9669o0.m36224e(str2)) {
            return null;
        }
        byte[] p = m35385p(str.getBytes(), str2.getBytes());
        StringBuilder sb = new StringBuilder();
        int length = p.length;
        for (int i = 0; i < length; i++) {
            sb.append(String.format("%02x", new Object[]{Byte.valueOf(p[i])}));
        }
        return sb.toString();
    }

    /* renamed from: g */
    public static boolean m35384g() {
        return C9372h.m35254H().mo19001D().mo19091h();
    }

    /* renamed from: p */
    public static byte[] m35385p(@C0359n0 byte[] bArr, @C0359n0 byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i % bArr2.length]);
        }
        return bArr3;
    }

    /* renamed from: a */
    public void mo19087a(@C0359n0 C9421a aVar) {
        this.f25723a.add(aVar);
    }

    @C0363p0
    /* renamed from: d */
    public String mo19088d() {
        if (this.f25724b.mo107848k(f25721g, (String) null) != null) {
            return this.f25724b.mo107848k(f25719e, (String) null);
        }
        return null;
    }

    @C0363p0
    /* renamed from: e */
    public String mo19089e() {
        if (this.f25724b.mo107848k(f25719e, (String) null) != null) {
            return m35382b(this.f25724b.mo107848k(f25721g, (String) null), mo19088d());
        }
        return null;
    }

    @C0359n0
    /* renamed from: f */
    public final String mo19090f() {
        return this.f25724b.mo107848k(f25722h, "");
    }

    /* renamed from: h */
    public boolean mo19091h() {
        return !C9669o0.m36224e(mo19088d()) && !C9669o0.m36224e(mo19089e());
    }

    /* renamed from: i */
    public void mo19092i(@C0359n0 String str, @C0359n0 String str2, @C0359n0 String str3) {
        mo19096m(str3);
        mo19097n(str, str2);
    }

    /* renamed from: j */
    public void mo19093j(@C0359n0 String str) {
        if (!str.equals(mo19090f())) {
            this.f25724b.mo107856u(f25722h, str);
        }
    }

    /* renamed from: k */
    public void mo19094k(boolean z) {
        for (C9421a a : this.f25723a) {
            a.mo18944a(z);
        }
    }

    /* renamed from: l */
    public void mo19095l(@C0359n0 C9421a aVar) {
        this.f25723a.remove(aVar);
    }

    /* renamed from: m */
    public final void mo19096m(@C0359n0 String str) {
        this.f25724b.mo107856u(f25722h, str);
    }

    /* renamed from: n */
    public void mo19097n(@C0359n0 String str, @C0359n0 String str2) {
        C36059m.m148406b("Setting Rich Push user: %s", str);
        this.f25724b.mo107856u(f25719e, str);
        this.f25724b.mo107856u(f25721g, m35383c(str2, str));
    }

    /* renamed from: o */
    public boolean mo19098o() {
        return this.f25725c.mo17793Z() != null && !mo19090f().equals(this.f25725c.mo17793Z());
    }
}

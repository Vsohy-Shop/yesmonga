package com.google.zxing.oned.rss.expanded.decoders;

import com.bumptech.glide.gifdecoder.C22073d;
import com.contentsquare.android.api.C14092c;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.C34709a;
import com.urbanairship.push.notifications.C9527p;
import kotlin.text.C11626x;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: com.google.zxing.oned.rss.expanded.decoders.r */
public final class C34820r {

    /* renamed from: a */
    public final C34709a f84502a;

    /* renamed from: b */
    public final CurrentParsingState f84503b = new CurrentParsingState();

    /* renamed from: c */
    public final StringBuilder f84504c = new StringBuilder();

    public C34820r(C34709a aVar) {
        this.f84502a = aVar;
    }

    /* renamed from: g */
    public static int m142152g(C34709a aVar, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (aVar.mo102645k(i + i4)) {
                i3 |= 1 << ((i2 - i4) - 1);
            }
        }
        return i3;
    }

    /* renamed from: a */
    public String mo103000a(StringBuilder sb, int i) throws NotFoundException, FormatException {
        String str;
        String str2 = null;
        while (true) {
            C34816n c = mo103002c(i, str2);
            String a = C34819q.m142149a(c.mo102991b());
            if (a != null) {
                sb.append(a);
            }
            if (c.mo102993d()) {
                str = String.valueOf(c.mo102992c());
            } else {
                str = null;
            }
            if (i == c.mo102999a()) {
                return sb.toString();
            }
            i = c.mo102999a();
            str2 = str;
        }
    }

    /* renamed from: b */
    public final C34815m mo103001b(int i) {
        char c;
        int f = mo103005f(i, 5);
        if (f == 15) {
            return new C34815m(i + 5, '$');
        }
        if (f >= 5 && f < 15) {
            return new C34815m(i + 5, (char) ((f + 48) - 5));
        }
        int f2 = mo103005f(i, 6);
        if (f2 >= 32 && f2 < 58) {
            return new C34815m(i + 6, (char) (f2 + 33));
        }
        switch (f2) {
            case 58:
                c = '*';
                break;
            case 59:
                c = ',';
                break;
            case 60:
                c = '-';
                break;
            case 61:
                c = '.';
                break;
            case 62:
                c = '/';
                break;
            default:
                throw new IllegalStateException("Decoding invalid alphanumeric value: ".concat(String.valueOf(f2)));
        }
        return new C34815m(i + 6, c);
    }

    /* renamed from: c */
    public C34816n mo103002c(int i, String str) throws FormatException {
        this.f84504c.setLength(0);
        if (str != null) {
            this.f84504c.append(str);
        }
        this.f84503b.mo102977i(i);
        C34816n o = mo103013o();
        if (o == null || !o.mo102993d()) {
            return new C34816n(this.f84503b.mo102969a(), this.f84504c.toString());
        }
        return new C34816n(this.f84503b.mo102969a(), this.f84504c.toString(), o.mo102992c());
    }

    /* renamed from: d */
    public final C34815m mo103003d(int i) throws FormatException {
        char c;
        int f = mo103005f(i, 5);
        if (f == 15) {
            return new C34815m(i + 5, '$');
        }
        if (f >= 5 && f < 15) {
            return new C34815m(i + 5, (char) ((f + 48) - 5));
        }
        int f2 = mo103005f(i, 7);
        if (f2 >= 64 && f2 < 90) {
            return new C34815m(i + 7, (char) (f2 + 1));
        }
        if (f2 >= 90 && f2 < 116) {
            return new C34815m(i + 7, (char) (f2 + 7));
        }
        switch (mo103005f(i, 8)) {
            case C14092c.f34591d0:
                c = '!';
                break;
            case 233:
                c = '\"';
                break;
            case 234:
                c = '%';
                break;
            case 235:
                c = C11626x.f28913d;
                break;
            case 236:
                c = '\'';
                break;
            case 237:
                c = '(';
                break;
            case C14092c.f34603g0:
                c = ')';
                break;
            case 239:
                c = '*';
                break;
            case C9527p.f26031b:
                c = '+';
                break;
            case 241:
                c = ',';
                break;
            case C14092c.f34607h0:
                c = '-';
                break;
            case 243:
                c = '.';
                break;
            case 244:
                c = '/';
                break;
            case 245:
                c = C12361b.f30257h;
                break;
            case 246:
                c = ';';
                break;
            case 247:
                c = C11626x.f28914e;
                break;
            case 248:
                c = '=';
                break;
            case C22073d.f56676j:
                c = C11626x.f28915f;
                break;
            case 250:
                c = '?';
                break;
            case 251:
                c = '_';
                break;
            case 252:
                c = ' ';
                break;
            default:
                throw FormatException.m141227a();
        }
        return new C34815m(i + 8, c);
    }

    /* renamed from: e */
    public final C34817o mo103004e(int i) throws FormatException {
        int i2 = i + 7;
        if (i2 > this.f84502a.mo102649o()) {
            int f = mo103005f(i, 4);
            if (f == 0) {
                return new C34817o(this.f84502a.mo102649o(), 10, 10);
            }
            return new C34817o(this.f84502a.mo102649o(), f - 1, 10);
        }
        int f2 = mo103005f(i, 7) - 8;
        return new C34817o(i2, f2 / 11, f2 % 11);
    }

    /* renamed from: f */
    public int mo103005f(int i, int i2) {
        return m142152g(this.f84502a, i, i2);
    }

    /* renamed from: h */
    public final boolean mo103006h(int i) {
        int i2 = i + 3;
        if (i2 > this.f84502a.mo102649o()) {
            return false;
        }
        while (i < i2) {
            if (this.f84502a.mo102645k(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: i */
    public final boolean mo103007i(int i) {
        int i2;
        if (i + 1 > this.f84502a.mo102649o()) {
            return false;
        }
        int i3 = 0;
        while (i3 < 5 && (i2 = i3 + i) < this.f84502a.mo102649o()) {
            if (i3 == 2) {
                if (!this.f84502a.mo102645k(i + 2)) {
                    return false;
                }
            } else if (this.f84502a.mo102645k(i2)) {
                return false;
            }
            i3++;
        }
        return true;
    }

    /* renamed from: j */
    public final boolean mo103008j(int i) {
        int i2;
        if (i + 1 > this.f84502a.mo102649o()) {
            return false;
        }
        int i3 = 0;
        while (i3 < 4 && (i2 = i3 + i) < this.f84502a.mo102649o()) {
            if (this.f84502a.mo102645k(i2)) {
                return false;
            }
            i3++;
        }
        return true;
    }

    /* renamed from: k */
    public final boolean mo103009k(int i) {
        int f;
        if (i + 5 > this.f84502a.mo102649o()) {
            return false;
        }
        int f2 = mo103005f(i, 5);
        if (f2 >= 5 && f2 < 16) {
            return true;
        }
        if (i + 6 <= this.f84502a.mo102649o() && (f = mo103005f(i, 6)) >= 16 && f < 63) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final boolean mo103010l(int i) {
        int f;
        if (i + 5 > this.f84502a.mo102649o()) {
            return false;
        }
        int f2 = mo103005f(i, 5);
        if (f2 >= 5 && f2 < 16) {
            return true;
        }
        if (i + 7 > this.f84502a.mo102649o()) {
            return false;
        }
        int f3 = mo103005f(i, 7);
        if (f3 >= 64 && f3 < 116) {
            return true;
        }
        if (i + 8 <= this.f84502a.mo102649o() && (f = mo103005f(i, 8)) >= 232 && f < 253) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final boolean mo103011m(int i) {
        if (i + 7 <= this.f84502a.mo102649o()) {
            int i2 = i;
            while (true) {
                int i3 = i + 3;
                if (i2 >= i3) {
                    return this.f84502a.mo102645k(i3);
                }
                if (this.f84502a.mo102645k(i2)) {
                    return true;
                }
                i2++;
            }
        } else if (i + 4 <= this.f84502a.mo102649o()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: n */
    public final C34814l mo103012n() {
        while (mo103009k(this.f84503b.mo102969a())) {
            C34815m b = mo103001b(this.f84503b.mo102969a());
            this.f84503b.mo102977i(b.mo102999a());
            if (b.mo102990c()) {
                return new C34814l(new C34816n(this.f84503b.mo102969a(), this.f84504c.toString()), true);
            }
            this.f84504c.append(b.mo102989b());
        }
        if (mo103006h(this.f84503b.mo102969a())) {
            this.f84503b.mo102970b(3);
            this.f84503b.mo102976h();
        } else if (mo103007i(this.f84503b.mo102969a())) {
            if (this.f84503b.mo102969a() + 5 < this.f84502a.mo102649o()) {
                this.f84503b.mo102970b(5);
            } else {
                this.f84503b.mo102977i(this.f84502a.mo102649o());
            }
            this.f84503b.mo102975g();
        }
        return new C34814l(false);
    }

    /* renamed from: o */
    public final C34816n mo103013o() throws FormatException {
        boolean z;
        C34814l lVar;
        boolean z2;
        do {
            int a = this.f84503b.mo102969a();
            if (this.f84503b.mo102971c()) {
                lVar = mo103012n();
                z = lVar.mo102988b();
            } else if (this.f84503b.mo102972d()) {
                lVar = mo103014p();
                z = lVar.mo102988b();
            } else {
                lVar = mo103015q();
                z = lVar.mo102988b();
            }
            if (a != this.f84503b.mo102969a()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2 && !z) {
                break;
            }
        } while (!z);
        return lVar.mo102987a();
    }

    /* renamed from: p */
    public final C34814l mo103014p() throws FormatException {
        while (mo103010l(this.f84503b.mo102969a())) {
            C34815m d = mo103003d(this.f84503b.mo102969a());
            this.f84503b.mo102977i(d.mo102999a());
            if (d.mo102990c()) {
                return new C34814l(new C34816n(this.f84503b.mo102969a(), this.f84504c.toString()), true);
            }
            this.f84504c.append(d.mo102989b());
        }
        if (mo103006h(this.f84503b.mo102969a())) {
            this.f84503b.mo102970b(3);
            this.f84503b.mo102976h();
        } else if (mo103007i(this.f84503b.mo102969a())) {
            if (this.f84503b.mo102969a() + 5 < this.f84502a.mo102649o()) {
                this.f84503b.mo102970b(5);
            } else {
                this.f84503b.mo102977i(this.f84502a.mo102649o());
            }
            this.f84503b.mo102974f();
        }
        return new C34814l(false);
    }

    /* renamed from: q */
    public final C34814l mo103015q() throws FormatException {
        C34816n nVar;
        while (mo103011m(this.f84503b.mo102969a())) {
            C34817o e = mo103004e(this.f84503b.mo102969a());
            this.f84503b.mo102977i(e.mo102999a());
            if (e.mo102997e()) {
                if (e.mo102998f()) {
                    nVar = new C34816n(this.f84503b.mo102969a(), this.f84504c.toString());
                } else {
                    nVar = new C34816n(this.f84503b.mo102969a(), this.f84504c.toString(), e.mo102995c());
                }
                return new C34814l(nVar, true);
            }
            this.f84504c.append(e.mo102994b());
            if (e.mo102998f()) {
                return new C34814l(new C34816n(this.f84503b.mo102969a(), this.f84504c.toString()), true);
            }
            this.f84504c.append(e.mo102995c());
        }
        if (mo103008j(this.f84503b.mo102969a())) {
            this.f84503b.mo102974f();
            this.f84503b.mo102970b(4);
        }
        return new C34814l(false);
    }
}

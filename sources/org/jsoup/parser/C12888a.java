package org.jsoup.parser;

import androidx.core.app.C17239t;
import com.carrefour.fid.android.shared.p046io.OneAppApiException;
import com.google.firebase.installations.C33124s;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import javax.annotation.Nullable;
import org.jsoup.UncheckedIOException;
import org.jsoup.helper.C12750d;

/* renamed from: org.jsoup.parser.a */
public final class C12888a {

    /* renamed from: n */
    public static final char f31805n = '￿';

    /* renamed from: o */
    public static final int f31806o = 12;

    /* renamed from: p */
    public static final int f31807p = 32768;

    /* renamed from: q */
    public static final int f31808q = 24576;

    /* renamed from: r */
    public static final int f31809r = 1024;

    /* renamed from: s */
    public static final int f31810s = 512;

    /* renamed from: a */
    public char[] f31811a;

    /* renamed from: b */
    public Reader f31812b;

    /* renamed from: c */
    public int f31813c;

    /* renamed from: d */
    public int f31814d;

    /* renamed from: e */
    public int f31815e;

    /* renamed from: f */
    public int f31816f;

    /* renamed from: g */
    public int f31817g;

    /* renamed from: h */
    public String[] f31818h;
    @Nullable

    /* renamed from: i */
    public ArrayList<Integer> f31819i;

    /* renamed from: j */
    public int f31820j;

    /* renamed from: k */
    public boolean f31821k;
    @Nullable

    /* renamed from: l */
    public String f31822l;

    /* renamed from: m */
    public int f31823m;

    public C12888a(Reader reader, int i) {
        this.f31817g = -1;
        this.f31818h = new String[512];
        this.f31819i = null;
        this.f31820j = 1;
        C12750d.m55073j(reader);
        C12750d.m55067d(reader.markSupported());
        this.f31812b = reader;
        this.f31811a = new char[Math.min(i, 32768)];
        mo30051b();
    }

    /* renamed from: Q */
    public static boolean m55781Q(char[] cArr, int i, int i2, String str) {
        if (i2 != str.length()) {
            return false;
        }
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            if (i2 == 0) {
                return true;
            }
            int i5 = i + 1;
            int i6 = i3 + 1;
            if (cArr[i] != str.charAt(i3)) {
                return false;
            }
            i = i5;
            i2 = i4;
            i3 = i6;
        }
    }

    /* renamed from: c */
    public static String m55782c(char[] cArr, String[] strArr, int i, int i2) {
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        if (i2 < 1) {
            return "";
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 = (i3 * 31) + cArr[i + i4];
        }
        int i5 = i3 & C17239t.f45525u;
        String str = strArr[i5];
        if (str != null && m55781Q(cArr, i, i2, str)) {
            return str;
        }
        String str2 = new String(cArr, i, i2);
        strArr[i5] = str2;
        return str2;
    }

    /* renamed from: A */
    public int mo30029A() {
        if (!mo30074y()) {
            return 1;
        }
        int z = mo30075z();
        if (z == -1) {
            return this.f31820j;
        }
        if (z < 0) {
            return (Math.abs(z) + this.f31820j) - 1;
        }
        return z + this.f31820j + 1;
    }

    /* renamed from: B */
    public void mo30030B() {
        if (this.f31813c - this.f31815e < 1024) {
            this.f31814d = 0;
        }
        mo30051b();
        this.f31817g = this.f31815e;
    }

    /* renamed from: C */
    public boolean mo30031C(String str) {
        mo30051b();
        if (!mo30034F(str)) {
            return false;
        }
        this.f31815e += str.length();
        return true;
    }

    /* renamed from: D */
    public boolean mo30032D(String str) {
        if (!mo30039K(str)) {
            return false;
        }
        this.f31815e += str.length();
        return true;
    }

    /* renamed from: E */
    public boolean mo30033E(char c) {
        return !mo30072w() && this.f31811a[this.f31815e] == c;
    }

    /* renamed from: F */
    public boolean mo30034F(String str) {
        mo30051b();
        int length = str.length();
        if (length > this.f31813c - this.f31815e) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != this.f31811a[this.f31815e + i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: G */
    public boolean mo30035G(char... cArr) {
        if (mo30072w()) {
            return false;
        }
        mo30051b();
        char c = this.f31811a[this.f31815e];
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: H */
    public boolean mo30036H(char[] cArr) {
        mo30051b();
        if (mo30072w() || Arrays.binarySearch(cArr, this.f31811a[this.f31815e]) < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: I */
    public boolean mo30037I() {
        if (mo30072w()) {
            return false;
        }
        char c = this.f31811a[this.f31815e];
        if ((c < 'A' || c > 'Z') && (c < 'a' || c > 'z')) {
            return false;
        }
        return true;
    }

    /* renamed from: J */
    public boolean mo30038J() {
        char c;
        if (!mo30072w() && (c = this.f31811a[this.f31815e]) >= '0' && c <= '9') {
            return true;
        }
        return false;
    }

    /* renamed from: K */
    public boolean mo30039K(String str) {
        mo30051b();
        int length = str.length();
        if (length > this.f31813c - this.f31815e) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (Character.toUpperCase(str.charAt(i)) != Character.toUpperCase(this.f31811a[this.f31815e + i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: L */
    public boolean mo30040L() {
        if (mo30072w()) {
            return false;
        }
        char c = this.f31811a[this.f31815e];
        if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c))) {
            return false;
        }
        return true;
    }

    /* renamed from: M */
    public int mo30041M(char c) {
        mo30051b();
        for (int i = this.f31815e; i < this.f31813c; i++) {
            if (c == this.f31811a[i]) {
                return i - this.f31815e;
            }
        }
        return -1;
    }

    /* renamed from: N */
    public int mo30042N(CharSequence charSequence) {
        mo30051b();
        char charAt = charSequence.charAt(0);
        int i = this.f31815e;
        while (i < this.f31813c) {
            int i2 = 1;
            if (charAt != this.f31811a[i]) {
                do {
                    i++;
                    if (i >= this.f31813c) {
                        break;
                    }
                } while (charAt == this.f31811a[i]);
            }
            int i3 = i + 1;
            int length = (charSequence.length() + i3) - 1;
            int i4 = this.f31813c;
            if (i < i4 && length <= i4) {
                int i5 = i3;
                while (i5 < length && charSequence.charAt(i2) == this.f31811a[i5]) {
                    i5++;
                    i2++;
                }
                if (i5 == length) {
                    return i - this.f31815e;
                }
            }
            i = i3;
        }
        return -1;
    }

    /* renamed from: O */
    public int mo30043O() {
        return this.f31816f + this.f31815e;
    }

    /* renamed from: P */
    public boolean mo30044P(int i, int i2, String str) {
        return m55781Q(this.f31811a, i, i2, str);
    }

    /* renamed from: R */
    public void mo30045R() {
        int i = this.f31817g;
        if (i != -1) {
            this.f31815e = i;
            mo30049V();
            return;
        }
        throw new UncheckedIOException(new IOException("Mark invalid"));
    }

    /* renamed from: S */
    public final void mo30046S() {
        int i;
        if (mo30074y()) {
            this.f31820j += this.f31819i.size();
            if (this.f31819i.size() > 0) {
                ArrayList<Integer> arrayList = this.f31819i;
                i = arrayList.get(arrayList.size() - 1).intValue();
            } else {
                i = -1;
            }
            this.f31819i.clear();
            if (i != -1) {
                this.f31819i.add(Integer.valueOf(i));
                this.f31820j--;
            }
            for (int i2 = this.f31815e; i2 < this.f31813c; i2++) {
                if (this.f31811a[i2] == 10) {
                    this.f31819i.add(Integer.valueOf(this.f31816f + 1 + i2));
                }
            }
        }
    }

    /* renamed from: T */
    public void mo30047T(boolean z) {
        if (z && this.f31819i == null) {
            this.f31819i = new ArrayList<>(OneAppApiException.f70522g);
            mo30046S();
        } else if (!z) {
            this.f31819i = null;
        }
    }

    /* renamed from: U */
    public void mo30048U() {
        int i = this.f31815e;
        if (i >= 1) {
            this.f31815e = i - 1;
            return;
        }
        throw new UncheckedIOException(new IOException("WTF: No buffer left to unconsume."));
    }

    /* renamed from: V */
    public void mo30049V() {
        this.f31817g = -1;
    }

    /* renamed from: a */
    public void mo30050a() {
        this.f31815e++;
    }

    /* renamed from: b */
    public final void mo30051b() {
        int i;
        int i2;
        boolean z;
        if (!this.f31821k && (i = this.f31815e) >= this.f31814d) {
            int i3 = this.f31817g;
            if (i3 != -1) {
                int i4 = i3;
                i2 = i - i3;
                i = i4;
            } else {
                i2 = 0;
            }
            try {
                long j = (long) i;
                long skip = this.f31812b.skip(j);
                this.f31812b.mark(32768);
                int i5 = 0;
                while (true) {
                    z = true;
                    if (i5 > 1024) {
                        break;
                    }
                    Reader reader = this.f31812b;
                    char[] cArr = this.f31811a;
                    int read = reader.read(cArr, i5, cArr.length - i5);
                    if (read == -1) {
                        this.f31821k = true;
                    }
                    if (read <= 0) {
                        break;
                    }
                    i5 += read;
                }
                this.f31812b.reset();
                if (i5 > 0) {
                    if (skip != j) {
                        z = false;
                    }
                    C12750d.m55067d(z);
                    this.f31813c = i5;
                    this.f31816f += i;
                    this.f31815e = i2;
                    if (this.f31817g != -1) {
                        this.f31817g = 0;
                    }
                    this.f31814d = Math.min(i5, f31808q);
                }
                mo30046S();
                this.f31822l = null;
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }
    }

    /* renamed from: d */
    public void mo30052d() {
        Reader reader = this.f31812b;
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException unused) {
            } catch (Throwable th) {
                this.f31812b = null;
                this.f31811a = null;
                this.f31818h = null;
                throw th;
            }
            this.f31812b = null;
            this.f31811a = null;
            this.f31818h = null;
        }
    }

    /* renamed from: e */
    public int mo30053e() {
        int O;
        if (!mo30074y()) {
            O = mo30043O();
        } else {
            int z = mo30075z();
            if (z == -1) {
                O = mo30043O();
            } else {
                if (z < 0) {
                    z = Math.abs(z) - 2;
                }
                return (mo30043O() - this.f31819i.get(z).intValue()) + 1;
            }
        }
        return O + 1;
    }

    /* renamed from: f */
    public char mo30054f() {
        char c;
        mo30051b();
        if (mo30073x()) {
            c = 65535;
        } else {
            c = this.f31811a[this.f31815e];
        }
        this.f31815e++;
        return c;
    }

    /* renamed from: g */
    public String mo30055g(boolean z) {
        int i = this.f31815e;
        int i2 = this.f31813c;
        char[] cArr = this.f31811a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0) {
                break;
            }
            if (c != '\"') {
                if (c == '&') {
                    break;
                } else if (c == '\'') {
                    if (z) {
                        break;
                    }
                } else {
                    continue;
                    i3++;
                }
            }
            if (!z) {
                break;
            }
            i3++;
        }
        this.f31815e = i3;
        if (i3 > i) {
            return m55782c(this.f31811a, this.f31818h, i, i3 - i);
        }
        return "";
    }

    /* renamed from: h */
    public String mo30056h() {
        int i = this.f31815e;
        int i2 = this.f31813c;
        char[] cArr = this.f31811a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '&' || c == '<') {
                break;
            }
            i3++;
        }
        this.f31815e = i3;
        if (i3 > i) {
            return m55782c(this.f31811a, this.f31818h, i, i3 - i);
        }
        return "";
    }

    /* renamed from: i */
    public String mo30057i() {
        int i;
        char c;
        mo30051b();
        int i2 = this.f31815e;
        while (true) {
            i = this.f31815e;
            if (i < this.f31813c && (c = this.f31811a[i]) >= '0' && c <= '9') {
                this.f31815e = i + 1;
            }
        }
        return m55782c(this.f31811a, this.f31818h, i2, i - i2);
    }

    /* renamed from: j */
    public String mo30058j() {
        int i;
        char c;
        mo30051b();
        int i2 = this.f31815e;
        while (true) {
            i = this.f31815e;
            if (i < this.f31813c && (((c = this.f31811a[i]) >= '0' && c <= '9') || ((c >= 'A' && c <= 'F') || (c >= 'a' && c <= 'f')))) {
                this.f31815e = i + 1;
            }
        }
        return m55782c(this.f31811a, this.f31818h, i2, i - i2);
    }

    /* renamed from: k */
    public String mo30059k() {
        char c;
        mo30051b();
        int i = this.f31815e;
        while (true) {
            int i2 = this.f31815e;
            if (i2 < this.f31813c && (((c = this.f31811a[i2]) >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || Character.isLetter(c)))) {
                this.f31815e++;
            }
        }
        return m55782c(this.f31811a, this.f31818h, i, this.f31815e - i);
    }

    /* renamed from: l */
    public String mo30060l() {
        char c;
        mo30051b();
        int i = this.f31815e;
        while (true) {
            int i2 = this.f31815e;
            if (i2 < this.f31813c && (((c = this.f31811a[i2]) >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || Character.isLetter(c)))) {
                this.f31815e++;
            }
        }
        while (!mo30073x() && (r1 = this.f31811a[r2]) >= '0' && r1 <= '9') {
            this.f31815e = (r2 = this.f31815e) + 1;
        }
        return m55782c(this.f31811a, this.f31818h, i, this.f31815e - i);
    }

    /* renamed from: m */
    public String mo30061m() {
        int i = this.f31815e;
        int i2 = this.f31813c;
        char[] cArr = this.f31811a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 0 || c == '<') {
                break;
            }
            i3++;
        }
        this.f31815e = i3;
        if (i3 > i) {
            return m55782c(this.f31811a, this.f31818h, i, i3 - i);
        }
        return "";
    }

    /* renamed from: n */
    public String mo30062n() {
        mo30051b();
        int i = this.f31815e;
        int i2 = this.f31813c;
        char[] cArr = this.f31811a;
        int i3 = i;
        while (i3 < i2) {
            char c = cArr[i3];
            if (c == 9 || c == 10 || c == 12 || c == 13 || c == ' ' || c == '/' || c == '<' || c == '>') {
                break;
            }
            i3++;
        }
        this.f31815e = i3;
        if (i3 > i) {
            return m55782c(this.f31811a, this.f31818h, i, i3 - i);
        }
        return "";
    }

    /* renamed from: o */
    public String mo30063o(char c) {
        int M = mo30041M(c);
        if (M == -1) {
            return mo30067s();
        }
        String c2 = m55782c(this.f31811a, this.f31818h, this.f31815e, M);
        this.f31815e += M;
        return c2;
    }

    /* renamed from: p */
    public String mo30064p(String str) {
        int N = mo30042N(str);
        if (N != -1) {
            String c = m55782c(this.f31811a, this.f31818h, this.f31815e, N);
            this.f31815e += N;
            return c;
        } else if (this.f31813c - this.f31815e < str.length()) {
            return mo30067s();
        } else {
            int length = (this.f31813c - str.length()) + 1;
            char[] cArr = this.f31811a;
            String[] strArr = this.f31818h;
            int i = this.f31815e;
            String c2 = m55782c(cArr, strArr, i, length - i);
            this.f31815e = length;
            return c2;
        }
    }

    /* renamed from: q */
    public String mo30065q(char... cArr) {
        mo30051b();
        int i = this.f31815e;
        int i2 = this.f31813c;
        char[] cArr2 = this.f31811a;
        int i3 = i;
        loop0:
        while (i3 < i2) {
            for (char c : cArr) {
                if (cArr2[i3] == c) {
                    break loop0;
                }
            }
            i3++;
        }
        this.f31815e = i3;
        if (i3 > i) {
            return m55782c(this.f31811a, this.f31818h, i, i3 - i);
        }
        return "";
    }

    /* renamed from: r */
    public String mo30066r(char... cArr) {
        mo30051b();
        int i = this.f31815e;
        int i2 = this.f31813c;
        char[] cArr2 = this.f31811a;
        int i3 = i;
        while (i3 < i2 && Arrays.binarySearch(cArr, cArr2[i3]) < 0) {
            i3++;
        }
        this.f31815e = i3;
        if (i3 > i) {
            return m55782c(this.f31811a, this.f31818h, i, i3 - i);
        }
        return "";
    }

    /* renamed from: s */
    public String mo30067s() {
        mo30051b();
        char[] cArr = this.f31811a;
        String[] strArr = this.f31818h;
        int i = this.f31815e;
        String c = m55782c(cArr, strArr, i, this.f31813c - i);
        this.f31815e = this.f31813c;
        return c;
    }

    /* renamed from: t */
    public boolean mo30068t(String str) {
        boolean z = false;
        int i = -1;
        if (str.equals(this.f31822l)) {
            int i2 = this.f31823m;
            if (i2 == -1) {
                return false;
            }
            if (i2 >= this.f31815e) {
                return true;
            }
        }
        this.f31822l = str;
        Locale locale = Locale.ENGLISH;
        int N = mo30042N(str.toLowerCase(locale));
        if (N > -1) {
            this.f31823m = this.f31815e + N;
            return true;
        }
        int N2 = mo30042N(str.toUpperCase(locale));
        if (N2 > -1) {
            z = true;
        }
        if (z) {
            i = this.f31815e + N2;
        }
        this.f31823m = i;
        return z;
    }

    public String toString() {
        int i = this.f31813c;
        int i2 = this.f31815e;
        if (i - i2 < 0) {
            return "";
        }
        return new String(this.f31811a, i2, i - i2);
    }

    /* renamed from: u */
    public char mo30070u() {
        mo30051b();
        if (mo30073x()) {
            return 65535;
        }
        return this.f31811a[this.f31815e];
    }

    /* renamed from: v */
    public String mo30071v() {
        return mo30029A() + C33124s.f80355c + mo30053e();
    }

    /* renamed from: w */
    public boolean mo30072w() {
        mo30051b();
        if (this.f31815e >= this.f31813c) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public final boolean mo30073x() {
        return this.f31815e >= this.f31813c;
    }

    /* renamed from: y */
    public boolean mo30074y() {
        return this.f31819i != null;
    }

    /* renamed from: z */
    public final int mo30075z() {
        if (!mo30074y()) {
            return 0;
        }
        return Collections.binarySearch(this.f31819i, Integer.valueOf(mo30043O()));
    }

    public C12888a(Reader reader) {
        this(reader, 32768);
    }

    public C12888a(String str) {
        this(new StringReader(str), str.length());
    }
}

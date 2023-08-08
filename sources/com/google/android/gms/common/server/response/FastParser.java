package com.google.android.gms.common.server.response;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.p004ui.graphics.vector.C15369g;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40858y;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.C40967c;
import com.google.android.gms.common.util.C40992r;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import kotlinx.serialization.json.internal.C12361b;

@C40858y
@C40473a
public class FastParser<T extends FastJsonResponse> {

    /* renamed from: g */
    public static final char[] f104141g = {C12361b.f30265p, C15369g.f37979e, C15369g.f37979e};

    /* renamed from: h */
    public static final char[] f104142h = {'r', C12361b.f30265p, 'e'};

    /* renamed from: i */
    public static final char[] f104143i = {'r', C12361b.f30265p, 'e', '\"'};

    /* renamed from: j */
    public static final char[] f104144j = {C15369g.f37993s, C15369g.f37979e, C15369g.f37987m, 'e'};

    /* renamed from: k */
    public static final char[] f104145k = {C15369g.f37993s, C15369g.f37979e, C15369g.f37987m, 'e', '\"'};

    /* renamed from: l */
    public static final char[] f104146l = {10};

    /* renamed from: m */
    public static final C40945i f104147m = new C40937a();

    /* renamed from: n */
    public static final C40945i f104148n = new C40938b();

    /* renamed from: o */
    public static final C40945i f104149o = new C40939c();

    /* renamed from: p */
    public static final C40945i f104150p = new C40940d();

    /* renamed from: q */
    public static final C40945i f104151q = new C40941e();

    /* renamed from: r */
    public static final C40945i f104152r = new C40942f();

    /* renamed from: s */
    public static final C40945i f104153s = new C40943g();

    /* renamed from: t */
    public static final C40945i f104154t = new C40944h();

    /* renamed from: a */
    public final char[] f104155a = new char[1];

    /* renamed from: b */
    public final char[] f104156b = new char[32];

    /* renamed from: c */
    public final char[] f104157c = new char[1024];

    /* renamed from: d */
    public final StringBuilder f104158d = new StringBuilder(32);

    /* renamed from: e */
    public final StringBuilder f104159e = new StringBuilder(1024);

    /* renamed from: f */
    public final Stack f104160f = new Stack();

    @C40858y
    @C40473a
    public static class ParseException extends Exception {
        public ParseException(@C0359n0 String str) {
            super(str);
        }

        public ParseException(@C0359n0 String str, @C0359n0 Throwable th) {
            super("Error instantiating inner object", th);
        }

        public ParseException(@C0359n0 Throwable th) {
            super(th);
        }
    }

    /* renamed from: b */
    public static final String m166461b(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, @C0363p0 char[] cArr2) throws ParseException, IOException {
        sb.setLength(0);
        bufferedReader.mark(cArr.length);
        boolean z = false;
        boolean z2 = false;
        loop0:
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read != -1) {
                for (int i = 0; i < read; i++) {
                    char c = cArr[i];
                    if (Character.isISOControl(c)) {
                        if (cArr2 == null) {
                            break loop0;
                        }
                        int i2 = 0;
                        while (i2 <= 0) {
                            if (cArr2[i2] != c) {
                                i2++;
                            }
                        }
                        break loop0;
                    }
                    if (c == '\"') {
                        if (!z2) {
                            sb.append(cArr, 0, i);
                            bufferedReader.reset();
                            bufferedReader.skip((long) (i + 1));
                            if (z) {
                                return C40992r.m166673c(sb.toString());
                            }
                            return sb.toString();
                        }
                    } else if (c == '\\') {
                        z2 = !z2;
                        z = true;
                    }
                    z2 = false;
                }
                sb.append(cArr, 0, read);
                bufferedReader.mark(cArr.length);
            } else {
                throw new ParseException("Unexpected EOF while parsing string");
            }
        }
        throw new ParseException("Unexpected control character while reading string");
    }

    /* renamed from: A */
    public final boolean mo134692A(BufferedReader bufferedReader, boolean z) throws ParseException, IOException {
        char[] cArr;
        char[] cArr2;
        char k = mo134695k(bufferedReader);
        if (k != '\"') {
            if (k == 'f') {
                if (z) {
                    cArr = f104145k;
                } else {
                    cArr = f104144j;
                }
                mo134710z(bufferedReader, cArr);
                return false;
            } else if (k == 'n') {
                mo134710z(bufferedReader, f104141g);
                return false;
            } else if (k == 't') {
                if (z) {
                    cArr2 = f104143i;
                } else {
                    cArr2 = f104142h;
                }
                mo134710z(bufferedReader, cArr2);
                return true;
            } else {
                throw new ParseException("Unexpected token: " + k);
            }
        } else if (!z) {
            return mo134692A(bufferedReader, true);
        } else {
            throw new ParseException("No boolean value found in string");
        }
    }

    /* renamed from: B */
    public final boolean mo134693B(BufferedReader bufferedReader, FastJsonResponse fastJsonResponse) throws ParseException, IOException {
        int i;
        HashMap hashMap;
        BufferedReader bufferedReader2 = bufferedReader;
        FastJsonResponse fastJsonResponse2 = fastJsonResponse;
        Map<String, FastJsonResponse.Field<?, ?>> c = fastJsonResponse.mo134658c();
        String s = mo134703s(bufferedReader);
        if (s != null) {
            while (s != null) {
                FastJsonResponse.Field field = c.get(s);
                if (field == null) {
                    s = mo134704t(bufferedReader);
                } else {
                    this.f104160f.push(4);
                    int i2 = field.f104131b;
                    switch (i2) {
                        case 0:
                            if (!field.f104132c) {
                                fastJsonResponse2.mo134650P(field, mo134698n(bufferedReader));
                                break;
                            } else {
                                fastJsonResponse2.mo134651Q(field, mo134707w(bufferedReader2, f104147m));
                                break;
                            }
                        case 1:
                            if (!field.f104132c) {
                                fastJsonResponse2.mo134679z(field, mo134706v(bufferedReader));
                                break;
                            } else {
                                fastJsonResponse2.mo134636B(field, mo134707w(bufferedReader2, f104153s));
                                break;
                            }
                        case 2:
                            if (!field.f104132c) {
                                fastJsonResponse2.mo134653S(field, mo134700p(bufferedReader));
                                break;
                            } else {
                                fastJsonResponse2.mo134654T(field, mo134707w(bufferedReader2, f104148n));
                                break;
                            }
                        case 3:
                            if (!field.f104132c) {
                                fastJsonResponse2.mo134646L(field, mo134697m(bufferedReader));
                                break;
                            } else {
                                fastJsonResponse2.mo134648N(field, mo134707w(bufferedReader2, f104149o));
                                break;
                            }
                        case 4:
                            if (!field.f104132c) {
                                fastJsonResponse2.mo134642H(field, mo134696l(bufferedReader));
                                break;
                            } else {
                                fastJsonResponse2.mo134644J(field, mo134707w(bufferedReader2, f104150p));
                                break;
                            }
                        case 5:
                            if (!field.f104132c) {
                                fastJsonResponse2.mo134675v(field, mo134705u(bufferedReader));
                                break;
                            } else {
                                fastJsonResponse2.mo134677x(field, mo134707w(bufferedReader2, f104154t));
                                break;
                            }
                        case 6:
                            if (!field.f104132c) {
                                fastJsonResponse2.mo134638D(field, mo134692A(bufferedReader2, false));
                                break;
                            } else {
                                fastJsonResponse2.mo134639E(field, mo134707w(bufferedReader2, f104151q));
                                break;
                            }
                        case 7:
                            if (!field.f104132c) {
                                fastJsonResponse2.mo134670o(field, mo134701q(bufferedReader));
                                break;
                            } else {
                                fastJsonResponse2.mo134672q(field, mo134707w(bufferedReader2, f104152r));
                                break;
                            }
                        case 8:
                            fastJsonResponse2.mo134641G(field, C40967c.m166593a(mo134702r(bufferedReader2, this.f104157c, this.f104159e, f104146l)));
                            break;
                        case 9:
                            fastJsonResponse2.mo134641G(field, C40967c.m166594b(mo134702r(bufferedReader2, this.f104157c, this.f104159e, f104146l)));
                            break;
                        case 10:
                            char k = mo134695k(bufferedReader);
                            if (k == 'n') {
                                mo134710z(bufferedReader2, f104141g);
                                hashMap = null;
                            } else if (k == '{') {
                                this.f104160f.push(1);
                                hashMap = new HashMap();
                                while (true) {
                                    char k2 = mo134695k(bufferedReader);
                                    if (k2 == 0) {
                                        throw new ParseException("Unexpected EOF");
                                    } else if (k2 == '\"') {
                                        String b = m166461b(bufferedReader2, this.f104156b, this.f104158d, (char[]) null);
                                        if (mo134695k(bufferedReader) != ':') {
                                            throw new ParseException("No map value found for key ".concat(String.valueOf(b)));
                                        } else if (mo134695k(bufferedReader) == '\"') {
                                            hashMap.put(b, m166461b(bufferedReader2, this.f104156b, this.f104158d, (char[]) null));
                                            char k3 = mo134695k(bufferedReader);
                                            if (k3 != ',') {
                                                if (k3 == '}') {
                                                    mo134709y(1);
                                                } else {
                                                    throw new ParseException("Unexpected character while parsing string map: " + k3);
                                                }
                                            }
                                        } else {
                                            throw new ParseException("Expected String value for key ".concat(String.valueOf(b)));
                                        }
                                    } else if (k2 == '}') {
                                        mo134709y(1);
                                    }
                                }
                            } else {
                                throw new ParseException("Expected start of a map object");
                            }
                            fastJsonResponse2.mo134671p(field, hashMap);
                            break;
                        case 11:
                            if (field.f104132c) {
                                char k4 = mo134695k(bufferedReader);
                                if (k4 == 'n') {
                                    mo134710z(bufferedReader2, f104141g);
                                    fastJsonResponse2.mo134656a(field, field.f104135f, (ArrayList) null);
                                } else {
                                    this.f104160f.push(5);
                                    if (k4 == '[') {
                                        fastJsonResponse2.mo134656a(field, field.f104135f, mo134708x(bufferedReader2, field));
                                    } else {
                                        throw new ParseException("Expected array start");
                                    }
                                }
                            } else {
                                char k5 = mo134695k(bufferedReader);
                                if (k5 == 'n') {
                                    mo134710z(bufferedReader2, f104141g);
                                    fastJsonResponse2.mo134657b(field, field.f104135f, null);
                                } else {
                                    this.f104160f.push(1);
                                    if (k5 == '{') {
                                        try {
                                            FastJsonResponse G1 = field.mo134680G1();
                                            mo134693B(bufferedReader2, G1);
                                            fastJsonResponse2.mo134657b(field, field.f104135f, G1);
                                        } catch (InstantiationException e) {
                                            throw new ParseException("Error instantiating inner object", e);
                                        } catch (IllegalAccessException e2) {
                                            throw new ParseException("Error instantiating inner object", e2);
                                        }
                                    } else {
                                        throw new ParseException("Expected start of object");
                                    }
                                }
                            }
                            i = 4;
                            break;
                        default:
                            throw new ParseException("Invalid field type " + i2);
                    }
                    i = 4;
                    mo134709y(i);
                    mo134709y(2);
                    char k6 = mo134695k(bufferedReader);
                    if (k6 == ',') {
                        s = mo134703s(bufferedReader);
                    } else if (k6 == '}') {
                        s = null;
                    } else {
                        throw new ParseException("Expected end of object or field separator, but found: " + k6);
                    }
                }
            }
            mo134709y(1);
            return true;
        }
        mo134709y(1);
        return false;
    }

    @C40473a
    /* renamed from: a */
    public void mo134694a(@C0359n0 InputStream inputStream, @C0359n0 T t) throws ParseException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 1024);
        try {
            this.f104160f.push(0);
            char k = mo134695k(bufferedReader);
            if (k != 0) {
                if (k == '[') {
                    this.f104160f.push(5);
                    Map<String, FastJsonResponse.Field<?, ?>> c = t.mo134658c();
                    if (c.size() == 1) {
                        FastJsonResponse.Field field = (FastJsonResponse.Field) c.entrySet().iterator().next().getValue();
                        t.mo134656a(field, field.f104135f, mo134708x(bufferedReader, field));
                    } else {
                        throw new ParseException("Object array response class must have a single Field");
                    }
                } else if (k == '{') {
                    this.f104160f.push(1);
                    mo134693B(bufferedReader, t);
                } else {
                    throw new ParseException("Unexpected token: " + k);
                }
                mo134709y(0);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
            } else {
                throw new ParseException("No data to parse");
            }
        } catch (IOException e) {
            throw new ParseException((Throwable) e);
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    /* renamed from: k */
    public final char mo134695k(BufferedReader bufferedReader) throws ParseException, IOException {
        if (bufferedReader.read(this.f104155a) == -1) {
            return 0;
        }
        while (Character.isWhitespace(this.f104155a[0])) {
            if (bufferedReader.read(this.f104155a) == -1) {
                return 0;
            }
        }
        return this.f104155a[0];
    }

    /* renamed from: l */
    public final double mo134696l(BufferedReader bufferedReader) throws ParseException, IOException {
        int o = mo134699o(bufferedReader, this.f104157c);
        if (o == 0) {
            return 0.0d;
        }
        return Double.parseDouble(new String(this.f104157c, 0, o));
    }

    /* renamed from: m */
    public final float mo134697m(BufferedReader bufferedReader) throws ParseException, IOException {
        int o = mo134699o(bufferedReader, this.f104157c);
        if (o == 0) {
            return 0.0f;
        }
        return Float.parseFloat(new String(this.f104157c, 0, o));
    }

    /* renamed from: n */
    public final int mo134698n(BufferedReader bufferedReader) throws ParseException, IOException {
        int i;
        int i2;
        int i3;
        int i4;
        int o = mo134699o(bufferedReader, this.f104157c);
        if (o == 0) {
            return 0;
        }
        char[] cArr = this.f104157c;
        if (o > 0) {
            char c = cArr[0];
            if (c == '-') {
                i = Integer.MIN_VALUE;
            } else {
                i = -2147483647;
            }
            if (c == '-') {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (i2 < o) {
                i4 = i2 + 1;
                int digit = Character.digit(cArr[i2], 10);
                if (digit >= 0) {
                    i3 = -digit;
                } else {
                    throw new ParseException("Unexpected non-digit character");
                }
            } else {
                i3 = 0;
                i4 = i2;
            }
            while (i4 < o) {
                int i5 = i4 + 1;
                int digit2 = Character.digit(cArr[i4], 10);
                if (digit2 < 0) {
                    throw new ParseException("Unexpected non-digit character");
                } else if (i3 >= -214748364) {
                    int i6 = i3 * 10;
                    if (i6 >= i + digit2) {
                        i3 = i6 - digit2;
                        i4 = i5;
                    } else {
                        throw new ParseException("Number too large");
                    }
                } else {
                    throw new ParseException("Number too large");
                }
            }
            if (i2 == 0) {
                return -i3;
            }
            if (i4 > 1) {
                return i3;
            }
            throw new ParseException("No digits to parse");
        }
        throw new ParseException("No number to parse");
    }

    /* renamed from: o */
    public final int mo134699o(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i;
        char k = mo134695k(bufferedReader);
        if (k == 0) {
            throw new ParseException("Unexpected EOF");
        } else if (k == ',') {
            throw new ParseException("Missing value");
        } else if (k == 'n') {
            mo134710z(bufferedReader, f104141g);
            return 0;
        } else {
            bufferedReader.mark(1024);
            if (k == '\"') {
                i = 0;
                boolean z = false;
                while (i < 1024 && bufferedReader.read(cArr, i, 1) != -1) {
                    char c = cArr[i];
                    if (!Character.isISOControl(c)) {
                        if (c == '\"') {
                            if (!z) {
                                bufferedReader.reset();
                                bufferedReader.skip((long) (i + 1));
                                return i;
                            }
                        } else if (c == '\\') {
                            z = !z;
                            i++;
                        }
                        z = false;
                        i++;
                    } else {
                        throw new ParseException("Unexpected control character while reading string");
                    }
                }
            } else {
                cArr[0] = k;
                int i2 = 1;
                while (i < 1024 && bufferedReader.read(cArr, i, 1) != -1) {
                    char c2 = cArr[i];
                    if (c2 == '}' || c2 == ',' || Character.isWhitespace(c2) || cArr[i] == ']') {
                        bufferedReader.reset();
                        bufferedReader.skip((long) (i - 1));
                        cArr[i] = 0;
                        return i;
                    }
                    i2 = i + 1;
                }
            }
            if (i == 1024) {
                throw new ParseException("Absurdly long value");
            }
            throw new ParseException("Unexpected EOF");
        }
    }

    /* renamed from: p */
    public final long mo134700p(BufferedReader bufferedReader) throws ParseException, IOException {
        long j;
        long j2;
        int i;
        int o = mo134699o(bufferedReader, this.f104157c);
        if (o == 0) {
            return 0;
        }
        char[] cArr = this.f104157c;
        if (o > 0) {
            int i2 = 0;
            char c = cArr[0];
            if (c == '-') {
                j = Long.MIN_VALUE;
            } else {
                j = -9223372036854775807L;
            }
            if (c == '-') {
                i2 = 1;
            }
            if (i2 < o) {
                i = i2 + 1;
                int digit = Character.digit(cArr[i2], 10);
                if (digit >= 0) {
                    j2 = (long) (-digit);
                } else {
                    throw new ParseException("Unexpected non-digit character");
                }
            } else {
                j2 = 0;
                i = i2;
            }
            while (i < o) {
                int i3 = i + 1;
                int digit2 = Character.digit(cArr[i], 10);
                if (digit2 < 0) {
                    throw new ParseException("Unexpected non-digit character");
                } else if (j2 >= -922337203685477580L) {
                    long j3 = j2 * 10;
                    int i4 = o;
                    long j4 = (long) digit2;
                    if (j3 >= j + j4) {
                        j2 = j3 - j4;
                        o = i4;
                        i = i3;
                    } else {
                        throw new ParseException("Number too large");
                    }
                } else {
                    throw new ParseException("Number too large");
                }
            }
            if (i2 == 0) {
                return -j2;
            }
            if (i > 1) {
                return j2;
            }
            throw new ParseException("No digits to parse");
        }
        throw new ParseException("No number to parse");
    }

    @C0363p0
    /* renamed from: q */
    public final String mo134701q(BufferedReader bufferedReader) throws ParseException, IOException {
        return mo134702r(bufferedReader, this.f104156b, this.f104158d, (char[]) null);
    }

    @C0363p0
    /* renamed from: r */
    public final String mo134702r(BufferedReader bufferedReader, char[] cArr, StringBuilder sb, @C0363p0 char[] cArr2) throws ParseException, IOException {
        char k = mo134695k(bufferedReader);
        if (k == '\"') {
            return m166461b(bufferedReader, cArr, sb, cArr2);
        }
        if (k == 'n') {
            mo134710z(bufferedReader, f104141g);
            return null;
        }
        throw new ParseException("Expected string");
    }

    @C0363p0
    /* renamed from: s */
    public final String mo134703s(BufferedReader bufferedReader) throws ParseException, IOException {
        this.f104160f.push(2);
        char k = mo134695k(bufferedReader);
        if (k == '\"') {
            this.f104160f.push(3);
            String b = m166461b(bufferedReader, this.f104156b, this.f104158d, (char[]) null);
            mo134709y(3);
            if (mo134695k(bufferedReader) == ':') {
                return b;
            }
            throw new ParseException("Expected key/value separator");
        } else if (k == ']') {
            mo134709y(2);
            mo134709y(1);
            mo134709y(5);
            return null;
        } else if (k == '}') {
            mo134709y(2);
            return null;
        } else {
            throw new ParseException("Unexpected token: " + k);
        }
    }

    @C0363p0
    /* renamed from: t */
    public final String mo134704t(BufferedReader bufferedReader) throws ParseException, IOException {
        bufferedReader.mark(1024);
        char k = mo134695k(bufferedReader);
        int i = 1;
        if (k != '\"') {
            if (k == ',') {
                throw new ParseException("Missing value");
            } else if (k == '[') {
                this.f104160f.push(5);
                bufferedReader.mark(32);
                if (mo134695k(bufferedReader) == ']') {
                    mo134709y(5);
                } else {
                    bufferedReader.reset();
                    boolean z = false;
                    boolean z2 = false;
                    while (i > 0) {
                        char k2 = mo134695k(bufferedReader);
                        if (k2 == 0) {
                            throw new ParseException("Unexpected EOF while parsing array");
                        } else if (!Character.isISOControl(k2)) {
                            if (k2 == '\"') {
                                if (!z2) {
                                    z = !z;
                                }
                                k2 = '\"';
                            }
                            if (k2 == '[') {
                                if (!z) {
                                    i++;
                                }
                                k2 = '[';
                            }
                            if (k2 == ']' && !z) {
                                i--;
                            }
                            if (k2 != '\\' || !z) {
                                z2 = false;
                            } else {
                                z2 = !z2;
                            }
                        } else {
                            throw new ParseException("Unexpected control character while reading array");
                        }
                    }
                    mo134709y(5);
                }
            } else if (k != '{') {
                bufferedReader.reset();
                mo134699o(bufferedReader, this.f104157c);
            } else {
                this.f104160f.push(1);
                bufferedReader.mark(32);
                char k3 = mo134695k(bufferedReader);
                if (k3 == '}') {
                    mo134709y(1);
                } else if (k3 == '\"') {
                    bufferedReader.reset();
                    mo134703s(bufferedReader);
                    do {
                    } while (mo134704t(bufferedReader) != null);
                    mo134709y(1);
                } else {
                    throw new ParseException("Unexpected token " + k3);
                }
            }
        } else if (bufferedReader.read(this.f104155a) != -1) {
            char c = this.f104155a[0];
            boolean z3 = false;
            do {
                if (c == '\"') {
                    if (z3) {
                        c = '\"';
                        z3 = true;
                    }
                }
                if (c == '\\') {
                    z3 = !z3;
                } else {
                    z3 = false;
                }
                if (bufferedReader.read(this.f104155a) != -1) {
                    c = this.f104155a[0];
                } else {
                    throw new ParseException("Unexpected EOF while parsing string");
                }
            } while (!Character.isISOControl(c));
            throw new ParseException("Unexpected control character while reading string");
        } else {
            throw new ParseException("Unexpected EOF while parsing string");
        }
        char k4 = mo134695k(bufferedReader);
        if (k4 == ',') {
            mo134709y(2);
            return mo134703s(bufferedReader);
        } else if (k4 == '}') {
            mo134709y(2);
            return null;
        } else {
            throw new ParseException("Unexpected token " + k4);
        }
    }

    @C0363p0
    /* renamed from: u */
    public final BigDecimal mo134705u(BufferedReader bufferedReader) throws ParseException, IOException {
        int o = mo134699o(bufferedReader, this.f104157c);
        if (o == 0) {
            return null;
        }
        return new BigDecimal(new String(this.f104157c, 0, o));
    }

    @C0363p0
    /* renamed from: v */
    public final BigInteger mo134706v(BufferedReader bufferedReader) throws ParseException, IOException {
        int o = mo134699o(bufferedReader, this.f104157c);
        if (o == 0) {
            return null;
        }
        return new BigInteger(new String(this.f104157c, 0, o));
    }

    @C0363p0
    /* renamed from: w */
    public final ArrayList mo134707w(BufferedReader bufferedReader, C40945i iVar) throws ParseException, IOException {
        char k = mo134695k(bufferedReader);
        if (k == 'n') {
            mo134710z(bufferedReader, f104141g);
            return null;
        } else if (k == '[') {
            this.f104160f.push(5);
            ArrayList arrayList = new ArrayList();
            while (true) {
                bufferedReader.mark(1024);
                char k2 = mo134695k(bufferedReader);
                if (k2 == 0) {
                    throw new ParseException("Unexpected EOF");
                } else if (k2 != ',') {
                    if (k2 != ']') {
                        bufferedReader.reset();
                        arrayList.add(iVar.mo134719a(this, bufferedReader));
                    } else {
                        mo134709y(5);
                        return arrayList;
                    }
                }
            }
        } else {
            throw new ParseException("Expected start of array");
        }
    }

    @C0363p0
    /* renamed from: x */
    public final ArrayList mo134708x(BufferedReader bufferedReader, FastJsonResponse.Field field) throws ParseException, IOException {
        ArrayList arrayList = new ArrayList();
        char k = mo134695k(bufferedReader);
        if (k == ']') {
            mo134709y(5);
            return arrayList;
        } else if (k == 'n') {
            mo134710z(bufferedReader, f104141g);
            mo134709y(5);
            return null;
        } else if (k == '{') {
            this.f104160f.push(1);
            while (true) {
                try {
                    FastJsonResponse G1 = field.mo134680G1();
                    if (!mo134693B(bufferedReader, G1)) {
                        return arrayList;
                    }
                    arrayList.add(G1);
                    char k2 = mo134695k(bufferedReader);
                    if (k2 != ',') {
                        if (k2 == ']') {
                            mo134709y(5);
                            return arrayList;
                        }
                        throw new ParseException("Unexpected token: " + k2);
                    } else if (mo134695k(bufferedReader) == '{') {
                        this.f104160f.push(1);
                    } else {
                        throw new ParseException("Expected start of next object in array");
                    }
                } catch (InstantiationException e) {
                    throw new ParseException("Error instantiating inner object", e);
                } catch (IllegalAccessException e2) {
                    throw new ParseException("Error instantiating inner object", e2);
                }
            }
        } else {
            throw new ParseException("Unexpected token: " + k);
        }
    }

    /* renamed from: y */
    public final void mo134709y(int i) throws ParseException {
        if (!this.f104160f.isEmpty()) {
            int intValue = ((Integer) this.f104160f.pop()).intValue();
            if (intValue != i) {
                throw new ParseException("Expected state " + i + " but had " + intValue);
            }
            return;
        }
        throw new ParseException("Expected state " + i + " but had empty stack");
    }

    /* renamed from: z */
    public final void mo134710z(BufferedReader bufferedReader, char[] cArr) throws ParseException, IOException {
        int i = 0;
        while (true) {
            int length = cArr.length;
            if (i < length) {
                int read = bufferedReader.read(this.f104156b, 0, length - i);
                if (read != -1) {
                    int i2 = 0;
                    while (i2 < read) {
                        if (cArr[i2 + i] == this.f104156b[i2]) {
                            i2++;
                        } else {
                            throw new ParseException("Unexpected character");
                        }
                    }
                    i += read;
                } else {
                    throw new ParseException("Unexpected EOF");
                }
            } else {
                return;
            }
        }
    }
}

package kotlin.p010io.encoding;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.nio.charset.Charset;
import kotlin.C11665v0;
import kotlin.collections.C10904b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11600b;
import kotlin.text.C11602d;
import okio.C12520s0;
import org.jetbrains.annotations.C12579k;
import org.joda.time.DateTimeFieldType;

@C11143f
@C11665v0(version = "1.8")
/* renamed from: kotlin.io.encoding.a */
public class C11137a {
    @C12579k

    /* renamed from: c */
    public static final C11138a f28300c = new C11138a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f28301d = 8;

    /* renamed from: e */
    public static final int f28302e = 6;

    /* renamed from: f */
    public static final int f28303f = 3;

    /* renamed from: g */
    public static final int f28304g = 4;

    /* renamed from: h */
    public static final byte f28305h = 61;

    /* renamed from: i */
    public static final int f28306i = 76;

    /* renamed from: j */
    public static final int f28307j = 19;
    @C12579k

    /* renamed from: k */
    public static final byte[] f28308k = {13, 10};
    @C12579k

    /* renamed from: l */
    public static final C11137a f28309l = new C11137a(true, false);
    @C12579k

    /* renamed from: m */
    public static final C11137a f28310m = new C11137a(false, true);

    /* renamed from: a */
    public final boolean f28311a;

    /* renamed from: b */
    public final boolean f28312b;

    /* renamed from: kotlin.io.encoding.a$a */
    public static final class C11138a extends C11137a {
        public /* synthetic */ C11138a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: G */
        public final C11137a mo22582G() {
            return C11137a.f28310m;
        }

        @C12579k
        /* renamed from: H */
        public final byte[] mo22583H() {
            return C11137a.f28308k;
        }

        @C12579k
        /* renamed from: I */
        public final C11137a mo22584I() {
            return C11137a.f28309l;
        }

        public C11138a() {
            super(false, false, (DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ C11137a(boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2);
    }

    /* renamed from: A */
    public static /* synthetic */ byte[] m42978A(C11137a aVar, byte[] bArr, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return aVar.mo22581z(bArr, i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToByteArray");
    }

    /* renamed from: j */
    public static /* synthetic */ byte[] m42982j(C11137a aVar, CharSequence charSequence, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = charSequence.length();
            }
            return aVar.mo22570h(charSequence, i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
    }

    /* renamed from: k */
    public static /* synthetic */ byte[] m42983k(C11137a aVar, byte[] bArr, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return aVar.mo22571i(bArr, i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
    }

    /* renamed from: o */
    public static /* synthetic */ int m42984o(C11137a aVar, CharSequence charSequence, byte[] bArr, int i, int i2, int i3, int i4, Object obj) {
        int i5;
        int i6;
        if (obj == null) {
            if ((i4 & 4) != 0) {
                i5 = 0;
            } else {
                i5 = i;
            }
            if ((i4 & 8) != 0) {
                i6 = 0;
            } else {
                i6 = i2;
            }
            if ((i4 & 16) != 0) {
                i3 = charSequence.length();
            }
            return aVar.mo22573m(charSequence, bArr, i5, i6, i3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
    }

    /* renamed from: p */
    public static /* synthetic */ int m42985p(C11137a aVar, byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        int i5;
        int i6;
        if (obj == null) {
            if ((i4 & 4) != 0) {
                i5 = 0;
            } else {
                i5 = i;
            }
            if ((i4 & 8) != 0) {
                i6 = 0;
            } else {
                i6 = i2;
            }
            if ((i4 & 16) != 0) {
                i3 = bArr.length;
            }
            return aVar.mo22574n(bArr, bArr2, i5, i6, i3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
    }

    /* renamed from: s */
    public static /* synthetic */ String m42986s(C11137a aVar, byte[] bArr, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return aVar.mo22576r(bArr, i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
    }

    /* renamed from: u */
    public static /* synthetic */ int m42987u(C11137a aVar, byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        int i5;
        int i6;
        if (obj == null) {
            if ((i4 & 4) != 0) {
                i5 = 0;
            } else {
                i5 = i;
            }
            if ((i4 & 8) != 0) {
                i6 = 0;
            } else {
                i6 = i2;
            }
            if ((i4 & 16) != 0) {
                i3 = bArr.length;
            }
            return aVar.mo22577t(bArr, bArr2, i5, i6, i3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeIntoByteArray");
    }

    /* renamed from: y */
    public static /* synthetic */ Appendable m42988y(C11137a aVar, byte[] bArr, Appendable appendable, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 4) != 0) {
                i = 0;
            }
            if ((i3 & 8) != 0) {
                i2 = bArr.length;
            }
            return aVar.mo22580x(bArr, appendable, i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToAppendable");
    }

    @C12579k
    /* renamed from: B */
    public final byte[] mo22561B(@C12579k byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "source");
        mo22569g(bArr.length, i, i2);
        byte[] bArr2 = new byte[mo22579w(i2 - i)];
        mo22578v(bArr, bArr2, 0, i, i2);
        return bArr2;
    }

    /* renamed from: C */
    public final int mo22562C(byte[] bArr, int i, int i2, int i3) {
        if (i3 != -8) {
            if (i3 != -6) {
                if (i3 == -4) {
                    i = mo22565F(bArr, i + 1, i2);
                    if (i == i2 || bArr[i] != 61) {
                        throw new IllegalArgumentException("Missing one pad character at index " + i);
                    }
                } else if (i3 != -2) {
                    throw new IllegalStateException("Unreachable".toString());
                }
            }
            return i + 1;
        }
        throw new IllegalArgumentException("Redundant pad character at index " + i);
    }

    /* renamed from: D */
    public final boolean mo22563D() {
        return this.f28312b;
    }

    /* renamed from: E */
    public final boolean mo22564E() {
        return this.f28311a;
    }

    /* renamed from: F */
    public final int mo22565F(byte[] bArr, int i, int i2) {
        if (!this.f28312b) {
            return i;
        }
        while (i < i2) {
            if (C11140c.f28314b[bArr[i] & 255] != -1) {
                return i;
            }
            i++;
        }
        return i;
    }

    @C12579k
    /* renamed from: d */
    public final String mo22566d(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "source");
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b : bArr) {
            sb.append((char) b);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "stringBuilder.toString()");
        return sb2;
    }

    @C12579k
    /* renamed from: e */
    public final byte[] mo22567e(@C12579k CharSequence charSequence, int i, int i2) {
        Intrinsics.checkNotNullParameter(charSequence, "source");
        mo22569g(charSequence.length(), i, i2);
        byte[] bArr = new byte[(i2 - i)];
        int i3 = 0;
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            if (charAt <= 255) {
                bArr[i3] = (byte) charAt;
                i3++;
            } else {
                bArr[i3] = C12520s0.f30502a;
                i3++;
            }
            i++;
        }
        return bArr;
    }

    /* renamed from: f */
    public final void mo22568f(int i, int i2, int i3) {
        if (i2 < 0 || i2 > i) {
            throw new IndexOutOfBoundsException("destination offset: " + i2 + ", destination size: " + i);
        }
        int i4 = i2 + i3;
        if (i4 < 0 || i4 > i) {
            throw new IndexOutOfBoundsException("The destination array does not have enough capacity, destination offset: " + i2 + ", destination size: " + i + ", capacity needed: " + i3);
        }
    }

    /* renamed from: g */
    public final void mo22569g(int i, int i2, int i3) {
        C10904b.f28138a.mo22055a(i2, i3, i);
    }

    @C12579k
    /* renamed from: h */
    public final byte[] mo22570h(@C12579k CharSequence charSequence, int i, int i2) {
        byte[] bArr;
        Intrinsics.checkNotNullParameter(charSequence, "source");
        if (charSequence instanceof String) {
            mo22569g(charSequence.length(), i, i2);
            String substring = ((String) charSequence).substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Charset charset = C11602d.f28873g;
            Intrinsics.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
            bArr = substring.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bArr, "this as java.lang.String).getBytes(charset)");
        } else {
            bArr = mo22567e(charSequence, i, i2);
        }
        return m42983k(this, bArr, 0, 0, 6, (Object) null);
    }

    @C12579k
    /* renamed from: i */
    public final byte[] mo22571i(@C12579k byte[] bArr, int i, int i2) {
        boolean z;
        Intrinsics.checkNotNullParameter(bArr, "source");
        mo22569g(bArr.length, i, i2);
        int q = mo22575q(bArr, i, i2);
        byte[] bArr2 = new byte[q];
        if (mo22572l(bArr, bArr2, 0, i, i2) == q) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return bArr2;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: l */
    public final int mo22572l(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        int[] iArr;
        byte[] bArr3 = bArr;
        int i4 = i3;
        if (this.f28311a) {
            iArr = C11140c.f28316d;
        } else {
            iArr = C11140c.f28314b;
        }
        int i5 = -8;
        int i6 = i;
        int i7 = -8;
        int i8 = 0;
        int i9 = i2;
        while (true) {
            if (i9 >= i4) {
                break;
            }
            if (i7 == i5 && i9 + 3 < i4) {
                int i10 = i9 + 1;
                int i11 = iArr[bArr3[i9] & 255];
                int i12 = i10 + 1;
                int i13 = iArr[bArr3[i10] & 255];
                int i14 = i12 + 1;
                int i15 = iArr[bArr3[i12] & 255];
                int i16 = i14 + 1;
                int i17 = (i15 << 6) | (i11 << 18) | (i13 << 12) | iArr[bArr3[i14] & 255];
                if (i17 >= 0) {
                    int i18 = i6 + 1;
                    bArr2[i6] = (byte) (i17 >> 16);
                    int i19 = i18 + 1;
                    bArr2[i18] = (byte) (i17 >> 8);
                    bArr2[i19] = (byte) i17;
                    i6 = i19 + 1;
                    i9 = i16;
                    i5 = -8;
                } else {
                    i9 = i16 - 4;
                }
            }
            byte b = bArr3[i9] & 255;
            int i20 = iArr[b];
            if (i20 >= 0) {
                i9++;
                i8 = (i8 << 6) | i20;
                i7 += 6;
                if (i7 >= 0) {
                    bArr2[i6] = (byte) (i8 >>> i7);
                    i8 &= (1 << i7) - 1;
                    i7 -= 8;
                    i6++;
                }
            } else if (i20 == -2) {
                i9 = mo22562C(bArr3, i9, i4, i7);
                break;
            } else if (this.f28312b) {
                i9++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid symbol '");
                sb.append((char) b);
                sb.append("'(");
                String num = Integer.toString(b, C11600b.m45172a(8));
                Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
                sb.append(num);
                sb.append(") at index ");
                sb.append(i9);
                throw new IllegalArgumentException(sb.toString());
            }
            i5 = -8;
        }
        if (i7 != -2) {
            int F = mo22565F(bArr3, i9, i4);
            if (F >= i4) {
                return i6 - i;
            }
            byte b2 = bArr3[F] & 255;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Symbol '");
            sb2.append((char) b2);
            sb2.append("'(");
            String num2 = Integer.toString(b2, C11600b.m45172a(8));
            Intrinsics.checkNotNullExpressionValue(num2, "toString(this, checkRadix(radix))");
            sb2.append(num2);
            sb2.append(") at index ");
            sb2.append(F - 1);
            sb2.append(" is prohibited after the pad character");
            throw new IllegalArgumentException(sb2.toString());
        }
        throw new IllegalArgumentException("The last unit of input does not have enough bits");
    }

    /* renamed from: m */
    public final int mo22573m(@C12579k CharSequence charSequence, @C12579k byte[] bArr, int i, int i2, int i3) {
        byte[] bArr2;
        Intrinsics.checkNotNullParameter(charSequence, "source");
        Intrinsics.checkNotNullParameter(bArr, FirebaseAnalytics.C32532b.f78977z);
        if (charSequence instanceof String) {
            mo22569g(charSequence.length(), i2, i3);
            String substring = ((String) charSequence).substring(i2, i3);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Charset charset = C11602d.f28873g;
            Intrinsics.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
            bArr2 = substring.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bArr2, "this as java.lang.String).getBytes(charset)");
        } else {
            bArr2 = mo22567e(charSequence, i2, i3);
        }
        return m42985p(this, bArr2, bArr, i, 0, 0, 24, (Object) null);
    }

    /* renamed from: n */
    public final int mo22574n(@C12579k byte[] bArr, @C12579k byte[] bArr2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(bArr, "source");
        Intrinsics.checkNotNullParameter(bArr2, FirebaseAnalytics.C32532b.f78977z);
        mo22569g(bArr.length, i2, i3);
        mo22568f(bArr2.length, i, mo22575q(bArr, i2, i3));
        return mo22572l(bArr, bArr2, i, i2, i3);
    }

    /* renamed from: q */
    public final int mo22575q(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        if (i3 == 0) {
            return 0;
        }
        if (i3 != 1) {
            if (this.f28312b) {
                while (true) {
                    if (i >= i2) {
                        break;
                    }
                    int i4 = C11140c.f28314b[bArr[i] & 255];
                    if (i4 < 0) {
                        if (i4 == -2) {
                            i3 -= i2 - i;
                            break;
                        }
                        i3--;
                    }
                    i++;
                }
            } else if (bArr[i2 - 1] == 61) {
                i3--;
                if (bArr[i2 - 2] == 61) {
                    i3--;
                }
            }
            return (int) ((((long) i3) * ((long) 6)) / ((long) 8));
        }
        throw new IllegalArgumentException("Input should have at list 2 symbols for Base64 decoding, startIndex: " + i + ", endIndex: " + i2);
    }

    @C12579k
    /* renamed from: r */
    public final String mo22576r(@C12579k byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "source");
        return new String(mo22561B(bArr, i, i2), C11602d.f28873g);
    }

    /* renamed from: t */
    public final int mo22577t(@C12579k byte[] bArr, @C12579k byte[] bArr2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(bArr, "source");
        Intrinsics.checkNotNullParameter(bArr2, FirebaseAnalytics.C32532b.f78977z);
        return mo22578v(bArr, bArr2, i, i2, i3);
    }

    /* renamed from: v */
    public final int mo22578v(@C12579k byte[] bArr, @C12579k byte[] bArr2, int i, int i2, int i3) {
        byte[] bArr3;
        int i4;
        boolean z;
        Intrinsics.checkNotNullParameter(bArr, "source");
        Intrinsics.checkNotNullParameter(bArr2, FirebaseAnalytics.C32532b.f78977z);
        mo22569g(bArr.length, i2, i3);
        mo22568f(bArr2.length, i, mo22579w(i3 - i2));
        if (this.f28311a) {
            bArr3 = C11140c.f28315c;
        } else {
            bArr3 = C11140c.f28313a;
        }
        if (this.f28312b) {
            i4 = 19;
        } else {
            i4 = Integer.MAX_VALUE;
        }
        int i5 = i;
        while (true) {
            z = false;
            if (i2 + 2 >= i3) {
                break;
            }
            int min = Math.min((i3 - i2) / 3, i4);
            int i6 = 0;
            while (i6 < min) {
                int i7 = i2 + 1;
                int i8 = i7 + 1;
                byte b = ((bArr[i2] & 255) << DateTimeFieldType.f30603E0) | ((bArr[i7] & 255) << 8) | (bArr[i8] & 255);
                int i9 = i5 + 1;
                bArr2[i5] = bArr3[b >>> DateTimeFieldType.f30605G0];
                int i10 = i9 + 1;
                bArr2[i9] = bArr3[(b >>> 12) & 63];
                int i11 = i10 + 1;
                bArr2[i10] = bArr3[(b >>> 6) & 63];
                i5 = i11 + 1;
                bArr2[i11] = bArr3[b & C12520s0.f30502a];
                i6++;
                i2 = i8 + 1;
            }
            if (min == i4 && i2 != i3) {
                int i12 = i5 + 1;
                byte[] bArr4 = f28308k;
                bArr2[i5] = bArr4[0];
                i5 = i12 + 1;
                bArr2[i12] = bArr4[1];
            }
        }
        int i13 = i3 - i2;
        if (i13 == 1) {
            int i14 = i2 + 1;
            int i15 = (bArr[i2] & 255) << 4;
            int i16 = i5 + 1;
            bArr2[i5] = bArr3[i15 >>> 6];
            int i17 = i16 + 1;
            bArr2[i16] = bArr3[i15 & 63];
            int i18 = i17 + 1;
            bArr2[i17] = f28305h;
            i5 = i18 + 1;
            bArr2[i18] = f28305h;
            i2 = i14;
        } else if (i13 == 2) {
            int i19 = i2 + 1;
            int i20 = i19 + 1;
            int i21 = ((bArr[i19] & 255) << 2) | ((bArr[i2] & 255) << 10);
            int i22 = i5 + 1;
            bArr2[i5] = bArr3[i21 >>> 12];
            int i23 = i22 + 1;
            bArr2[i22] = bArr3[(i21 >>> 6) & 63];
            int i24 = i23 + 1;
            bArr2[i23] = bArr3[i21 & 63];
            i5 = i24 + 1;
            bArr2[i24] = f28305h;
            i2 = i20;
        }
        if (i2 == i3) {
            z = true;
        }
        if (z) {
            return i5 - i;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: w */
    public final int mo22579w(int i) {
        int i2;
        int i3 = ((i + 3) - 1) / 3;
        if (this.f28312b) {
            i2 = (i3 - 1) / 19;
        } else {
            i2 = 0;
        }
        int i4 = (i3 * 4) + (i2 * 2);
        if (i4 >= 0) {
            return i4;
        }
        throw new IllegalArgumentException("Input is too big");
    }

    @C12579k
    /* renamed from: x */
    public final <A extends Appendable> A mo22580x(@C12579k byte[] bArr, @C12579k A a, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "source");
        Intrinsics.checkNotNullParameter(a, FirebaseAnalytics.C32532b.f78977z);
        a.append(new String(mo22561B(bArr, i, i2), C11602d.f28873g));
        return a;
    }

    @C12579k
    /* renamed from: z */
    public final byte[] mo22581z(@C12579k byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "source");
        return mo22561B(bArr, i, i2);
    }

    public C11137a(boolean z, boolean z2) {
        this.f28311a = z;
        this.f28312b = z2;
        if (!(!z || !z2)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }
}

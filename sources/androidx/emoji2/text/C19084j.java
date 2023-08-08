package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.annotation.C0328d;
import androidx.annotation.C0337f0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.C19019f;
import androidx.emoji2.text.C19105p;
import java.util.Arrays;
import java.util.Set;

@C0328d
@RestrictTo({RestrictTo.Scope.LIBRARY})
@C0376v0(19)
/* renamed from: androidx.emoji2.text.j */
public final class C19084j {

    /* renamed from: f */
    public static final int f48552f = 1;

    /* renamed from: g */
    public static final int f48553g = 2;

    /* renamed from: h */
    public static final int f48554h = 3;

    /* renamed from: i */
    public static final int f48555i = 16;
    @C0359n0

    /* renamed from: a */
    public final C19019f.C19033m f48556a;
    @C0359n0

    /* renamed from: b */
    public final C19105p f48557b;
    @C0359n0

    /* renamed from: c */
    public C19019f.C19026f f48558c;

    /* renamed from: d */
    public final boolean f48559d;
    @C0363p0

    /* renamed from: e */
    public final int[] f48560e;

    @C0376v0(19)
    /* renamed from: androidx.emoji2.text.j$a */
    public static final class C19085a {

        /* renamed from: a */
        public static final int f48561a = -1;

        /* renamed from: a */
        public static int m89356a(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    i--;
                    if (i >= 0) {
                        char charAt = charSequence.charAt(i);
                        if (z) {
                            if (!Character.isHighSurrogate(charAt)) {
                                return -1;
                            }
                            i2--;
                        } else if (!Character.isSurrogate(charAt)) {
                            i2--;
                        } else if (Character.isHighSurrogate(charAt)) {
                            return -1;
                        } else {
                            z = true;
                        }
                    } else if (z) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
                return i;
            }
        }

        /* renamed from: b */
        public static int m89357b(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    if (r7 < length) {
                        char charAt = charSequence.charAt(r7);
                        if (z) {
                            if (!Character.isLowSurrogate(charAt)) {
                                return -1;
                            }
                            i2--;
                            i = r7 + 1;
                        } else if (!Character.isSurrogate(charAt)) {
                            i2--;
                            r7++;
                        } else if (Character.isLowSurrogate(charAt)) {
                            return -1;
                        } else {
                            r7++;
                            z = true;
                        }
                    } else if (z) {
                        return -1;
                    } else {
                        return length;
                    }
                }
                return r7;
            }
        }
    }

    /* renamed from: androidx.emoji2.text.j$b */
    public static class C19086b implements C19087c<C19112t> {
        @C0363p0

        /* renamed from: a */
        public C19112t f48562a;

        /* renamed from: b */
        public final C19019f.C19033m f48563b;

        public C19086b(@C0363p0 C19112t tVar, C19019f.C19033m mVar) {
            this.f48562a = tVar;
            this.f48563b = mVar;
        }

        /* renamed from: b */
        public boolean mo56266b(@C0359n0 CharSequence charSequence, int i, int i2, C19109r rVar) {
            Spannable spannable;
            if (rVar.mo56364m()) {
                return true;
            }
            if (this.f48562a == null) {
                if (charSequence instanceof Spannable) {
                    spannable = (Spannable) charSequence;
                } else {
                    spannable = new SpannableString(charSequence);
                }
                this.f48562a = new C19112t(spannable);
            }
            this.f48562a.setSpan(this.f48563b.mo55998a(rVar), i, i2, 33);
            return true;
        }

        /* renamed from: c */
        public C19112t mo56265a() {
            return this.f48562a;
        }
    }

    /* renamed from: androidx.emoji2.text.j$c */
    public interface C19087c<T> {
        /* renamed from: a */
        T mo56265a();

        /* renamed from: b */
        boolean mo56266b(@C0359n0 CharSequence charSequence, int i, int i2, C19109r rVar);
    }

    /* renamed from: androidx.emoji2.text.j$d */
    public static class C19088d implements C19087c<C19088d> {

        /* renamed from: a */
        public final int f48564a;

        /* renamed from: b */
        public int f48565b = -1;

        /* renamed from: c */
        public int f48566c = -1;

        public C19088d(int i) {
            this.f48564a = i;
        }

        /* renamed from: b */
        public boolean mo56266b(@C0359n0 CharSequence charSequence, int i, int i2, C19109r rVar) {
            int i3 = this.f48564a;
            if (i <= i3 && i3 < i2) {
                this.f48565b = i;
                this.f48566c = i2;
                return false;
            } else if (i2 <= i3) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: c */
        public C19088d mo56265a() {
            return this;
        }
    }

    /* renamed from: androidx.emoji2.text.j$e */
    public static class C19089e implements C19087c<C19089e> {

        /* renamed from: a */
        public final String f48567a;

        public C19089e(String str) {
            this.f48567a = str;
        }

        /* renamed from: b */
        public boolean mo56266b(@C0359n0 CharSequence charSequence, int i, int i2, C19109r rVar) {
            if (!TextUtils.equals(charSequence.subSequence(i, i2), this.f48567a)) {
                return true;
            }
            rVar.mo56366o(true);
            return false;
        }

        /* renamed from: c */
        public C19089e mo56265a() {
            return this;
        }
    }

    /* renamed from: androidx.emoji2.text.j$f */
    public static final class C19090f {

        /* renamed from: i */
        public static final int f48568i = 1;

        /* renamed from: j */
        public static final int f48569j = 2;

        /* renamed from: a */
        public int f48570a = 1;

        /* renamed from: b */
        public final C19105p.C19106a f48571b;

        /* renamed from: c */
        public C19105p.C19106a f48572c;

        /* renamed from: d */
        public C19105p.C19106a f48573d;

        /* renamed from: e */
        public int f48574e;

        /* renamed from: f */
        public int f48575f;

        /* renamed from: g */
        public final boolean f48576g;

        /* renamed from: h */
        public final int[] f48577h;

        public C19090f(C19105p.C19106a aVar, boolean z, int[] iArr) {
            this.f48571b = aVar;
            this.f48572c = aVar;
            this.f48576g = z;
            this.f48577h = iArr;
        }

        /* renamed from: d */
        public static boolean m89369d(int i) {
            return i == 65039;
        }

        /* renamed from: f */
        public static boolean m89370f(int i) {
            return i == 65038;
        }

        /* renamed from: a */
        public int mo56270a(int i) {
            C19105p.C19106a a = this.f48572c.mo56315a(i);
            int i2 = 2;
            if (this.f48570a != 2) {
                if (a == null) {
                    i2 = mo56274g();
                } else {
                    this.f48570a = 2;
                    this.f48572c = a;
                    this.f48575f = 1;
                }
            } else if (a != null) {
                this.f48572c = a;
                this.f48575f++;
            } else if (m89370f(i)) {
                i2 = mo56274g();
            } else if (!m89369d(i)) {
                if (this.f48572c.mo56316b() != null) {
                    i2 = 3;
                    if (this.f48575f != 1) {
                        this.f48573d = this.f48572c;
                        mo56274g();
                    } else if (mo56275h()) {
                        this.f48573d = this.f48572c;
                        mo56274g();
                    } else {
                        i2 = mo56274g();
                    }
                } else {
                    i2 = mo56274g();
                }
            }
            this.f48574e = i;
            return i2;
        }

        /* renamed from: b */
        public C19109r mo56271b() {
            return this.f48572c.mo56316b();
        }

        /* renamed from: c */
        public C19109r mo56272c() {
            return this.f48573d.mo56316b();
        }

        /* renamed from: e */
        public boolean mo56273e() {
            if (this.f48570a != 2 || this.f48572c.mo56316b() == null || (this.f48575f <= 1 && !mo56275h())) {
                return false;
            }
            return true;
        }

        /* renamed from: g */
        public final int mo56274g() {
            this.f48570a = 1;
            this.f48572c = this.f48571b;
            this.f48575f = 0;
            return 1;
        }

        /* renamed from: h */
        public final boolean mo56275h() {
            if (this.f48572c.mo56316b().mo56363l() || m89369d(this.f48574e)) {
                return true;
            }
            if (this.f48576g) {
                if (this.f48577h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f48577h, this.f48572c.mo56316b().mo56353b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public C19084j(@C0359n0 C19105p pVar, @C0359n0 C19019f.C19033m mVar, @C0359n0 C19019f.C19026f fVar, boolean z, @C0363p0 int[] iArr, @C0359n0 Set<int[]> set) {
        this.f48556a = mVar;
        this.f48557b = pVar;
        this.f48558c = fVar;
        this.f48559d = z;
        this.f48560e = iArr;
        mo56262k(set);
    }

    /* renamed from: a */
    public static boolean m89343a(@C0359n0 Editable editable, @C0359n0 KeyEvent keyEvent, boolean z) {
        C19091k[] kVarArr;
        if (m89347j(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!m89346i(selectionStart, selectionEnd) && (kVarArr = (C19091k[]) editable.getSpans(selectionStart, selectionEnd, C19091k.class)) != null && kVarArr.length > 0) {
            int length = kVarArr.length;
            int i = 0;
            while (i < length) {
                C19091k kVar = kVarArr[i];
                int spanStart = editable.getSpanStart(kVar);
                int spanEnd = editable.getSpanEnd(kVar);
                if ((!z || spanStart != selectionStart) && ((z || spanEnd != selectionStart) && (selectionStart <= spanStart || selectionStart >= spanEnd))) {
                    i++;
                } else {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m89344f(@C0359n0 InputConnection inputConnection, @C0359n0 Editable editable, @C0337f0(from = 0) int i, @C0337f0(from = 0) int i2, boolean z) {
        int i3;
        int i4;
        if (editable != null && inputConnection != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (m89346i(selectionStart, selectionEnd)) {
                return false;
            }
            if (z) {
                i4 = C19085a.m89356a(editable, selectionStart, Math.max(i, 0));
                i3 = C19085a.m89357b(editable, selectionEnd, Math.max(i2, 0));
                if (i4 == -1 || i3 == -1) {
                    return false;
                }
            } else {
                i4 = Math.max(selectionStart - i, 0);
                i3 = Math.min(selectionEnd + i2, editable.length());
            }
            C19091k[] kVarArr = (C19091k[]) editable.getSpans(i4, i3, C19091k.class);
            if (kVarArr != null && kVarArr.length > 0) {
                for (C19091k kVar : kVarArr) {
                    int spanStart = editable.getSpanStart(kVar);
                    int spanEnd = editable.getSpanEnd(kVar);
                    i4 = Math.min(spanStart, i4);
                    i3 = Math.max(spanEnd, i3);
                }
                int max = Math.max(i4, 0);
                int min = Math.min(i3, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max, min);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m89345g(@C0359n0 Editable editable, int i, @C0359n0 KeyEvent keyEvent) {
        boolean z;
        if (i == 67) {
            z = m89343a(editable, keyEvent, false);
        } else if (i != 112) {
            z = false;
        } else {
            z = m89343a(editable, keyEvent, true);
        }
        if (!z) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    /* renamed from: i */
    public static boolean m89346i(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    /* renamed from: j */
    public static boolean m89347j(@C0359n0 KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    /* renamed from: b */
    public int mo56257b(@C0359n0 CharSequence charSequence, @C0337f0(from = 0) int i) {
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            C19091k[] kVarArr = (C19091k[]) spanned.getSpans(i, i + 1, C19091k.class);
            if (kVarArr.length > 0) {
                return spanned.getSpanEnd(kVarArr[0]);
            }
        }
        return ((C19088d) mo56264m(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new C19088d(i))).f48566c;
    }

    /* renamed from: c */
    public int mo56258c(@C0359n0 CharSequence charSequence) {
        return mo56259d(charSequence, this.f48557b.mo56311h());
    }

    /* renamed from: d */
    public int mo56259d(@C0359n0 CharSequence charSequence, int i) {
        C19090f fVar = new C19090f(this.f48557b.mo56312i(), this.f48559d, this.f48560e);
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            int codePointAt = Character.codePointAt(charSequence, i2);
            int a = fVar.mo56270a(codePointAt);
            C19109r b = fVar.mo56271b();
            if (a == 1) {
                i2 += Character.charCount(codePointAt);
                i4 = 0;
            } else if (a == 2) {
                i2 += Character.charCount(codePointAt);
            } else if (a == 3) {
                b = fVar.mo56272c();
                if (b.mo56355d() <= i) {
                    i3++;
                }
            }
            if (b != null && b.mo56355d() <= i) {
                i4++;
            }
        }
        if (i3 != 0) {
            return 2;
        }
        if (fVar.mo56273e() && fVar.mo56271b().mo56355d() <= i) {
            return 1;
        }
        if (i4 == 0) {
            return 0;
        }
        return 2;
    }

    /* renamed from: e */
    public int mo56260e(@C0359n0 CharSequence charSequence, @C0337f0(from = 0) int i) {
        if (i < 0 || i >= charSequence.length()) {
            return -1;
        }
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            C19091k[] kVarArr = (C19091k[]) spanned.getSpans(i, i + 1, C19091k.class);
            if (kVarArr.length > 0) {
                return spanned.getSpanStart(kVarArr[0]);
            }
        }
        return ((C19088d) mo56264m(charSequence, Math.max(0, i - 16), Math.min(charSequence.length(), i + 16), Integer.MAX_VALUE, true, new C19088d(i))).f48565b;
    }

    /* renamed from: h */
    public final boolean mo56261h(CharSequence charSequence, int i, int i2, C19109r rVar) {
        if (rVar.mo56356e() == 0) {
            rVar.mo56367p(this.f48558c.mo55955a(charSequence, i, i2, rVar.mo56360i()));
        }
        if (rVar.mo56356e() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final void mo56262k(@C0359n0 Set<int[]> set) {
        if (!set.isEmpty()) {
            for (int[] next : set) {
                String str = new String(next, 0, next.length);
                mo56264m(str, 0, str.length(), 1, true, new C19089e(str));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0046 A[Catch:{ all -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0063 A[Catch:{ all -> 0x00af }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a8  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence mo56263l(@androidx.annotation.C0359n0 java.lang.CharSequence r11, @androidx.annotation.C0337f0(from = 0) int r12, @androidx.annotation.C0337f0(from = 0) int r13, @androidx.annotation.C0337f0(from = 0) int r14, boolean r15) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof androidx.emoji2.text.C19107q
            if (r0 == 0) goto L_0x000a
            r1 = r11
            androidx.emoji2.text.q r1 = (androidx.emoji2.text.C19107q) r1
            r1.mo56318a()
        L_0x000a:
            java.lang.Class<androidx.emoji2.text.k> r1 = androidx.emoji2.text.C19091k.class
            if (r0 != 0) goto L_0x002c
            boolean r2 = r11 instanceof android.text.Spannable     // Catch:{ all -> 0x00af }
            if (r2 == 0) goto L_0x0013
            goto L_0x002c
        L_0x0013:
            boolean r2 = r11 instanceof android.text.Spanned     // Catch:{ all -> 0x00af }
            if (r2 == 0) goto L_0x002a
            r2 = r11
            android.text.Spanned r2 = (android.text.Spanned) r2     // Catch:{ all -> 0x00af }
            int r3 = r12 + -1
            int r4 = r13 + 1
            int r2 = r2.nextSpanTransition(r3, r4, r1)     // Catch:{ all -> 0x00af }
            if (r2 > r13) goto L_0x002a
            androidx.emoji2.text.t r2 = new androidx.emoji2.text.t     // Catch:{ all -> 0x00af }
            r2.<init>((java.lang.CharSequence) r11)     // Catch:{ all -> 0x00af }
            goto L_0x0034
        L_0x002a:
            r2 = 0
            goto L_0x0034
        L_0x002c:
            androidx.emoji2.text.t r2 = new androidx.emoji2.text.t     // Catch:{ all -> 0x00af }
            r3 = r11
            android.text.Spannable r3 = (android.text.Spannable) r3     // Catch:{ all -> 0x00af }
            r2.<init>((android.text.Spannable) r3)     // Catch:{ all -> 0x00af }
        L_0x0034:
            r3 = 0
            if (r2 == 0) goto L_0x0060
            java.lang.Object[] r4 = r2.getSpans(r12, r13, r1)     // Catch:{ all -> 0x00af }
            androidx.emoji2.text.k[] r4 = (androidx.emoji2.text.C19091k[]) r4     // Catch:{ all -> 0x00af }
            if (r4 == 0) goto L_0x0060
            int r5 = r4.length     // Catch:{ all -> 0x00af }
            if (r5 <= 0) goto L_0x0060
            int r5 = r4.length     // Catch:{ all -> 0x00af }
            r6 = r3
        L_0x0044:
            if (r6 >= r5) goto L_0x0060
            r7 = r4[r6]     // Catch:{ all -> 0x00af }
            int r8 = r2.getSpanStart(r7)     // Catch:{ all -> 0x00af }
            int r9 = r2.getSpanEnd(r7)     // Catch:{ all -> 0x00af }
            if (r8 == r13) goto L_0x0055
            r2.removeSpan(r7)     // Catch:{ all -> 0x00af }
        L_0x0055:
            int r12 = java.lang.Math.min(r8, r12)     // Catch:{ all -> 0x00af }
            int r13 = java.lang.Math.max(r9, r13)     // Catch:{ all -> 0x00af }
            int r6 = r6 + 1
            goto L_0x0044
        L_0x0060:
            r4 = r13
            if (r12 == r4) goto L_0x00a6
            int r13 = r11.length()     // Catch:{ all -> 0x00af }
            if (r12 < r13) goto L_0x006a
            goto L_0x00a6
        L_0x006a:
            r13 = 2147483647(0x7fffffff, float:NaN)
            if (r14 == r13) goto L_0x007d
            if (r2 == 0) goto L_0x007d
            int r13 = r2.length()     // Catch:{ all -> 0x00af }
            java.lang.Object[] r13 = r2.getSpans(r3, r13, r1)     // Catch:{ all -> 0x00af }
            androidx.emoji2.text.k[] r13 = (androidx.emoji2.text.C19091k[]) r13     // Catch:{ all -> 0x00af }
            int r13 = r13.length     // Catch:{ all -> 0x00af }
            int r14 = r14 - r13
        L_0x007d:
            r5 = r14
            androidx.emoji2.text.j$b r7 = new androidx.emoji2.text.j$b     // Catch:{ all -> 0x00af }
            androidx.emoji2.text.f$m r13 = r10.f48556a     // Catch:{ all -> 0x00af }
            r7.<init>(r2, r13)     // Catch:{ all -> 0x00af }
            r1 = r10
            r2 = r11
            r3 = r12
            r6 = r15
            java.lang.Object r12 = r1.mo56264m(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00af }
            androidx.emoji2.text.t r12 = (androidx.emoji2.text.C19112t) r12     // Catch:{ all -> 0x00af }
            if (r12 == 0) goto L_0x009d
            android.text.Spannable r12 = r12.mo56373b()     // Catch:{ all -> 0x00af }
            if (r0 == 0) goto L_0x009c
            androidx.emoji2.text.q r11 = (androidx.emoji2.text.C19107q) r11
            r11.mo56324d()
        L_0x009c:
            return r12
        L_0x009d:
            if (r0 == 0) goto L_0x00a5
            r12 = r11
            androidx.emoji2.text.q r12 = (androidx.emoji2.text.C19107q) r12
            r12.mo56324d()
        L_0x00a5:
            return r11
        L_0x00a6:
            if (r0 == 0) goto L_0x00ae
            r12 = r11
            androidx.emoji2.text.q r12 = (androidx.emoji2.text.C19107q) r12
            r12.mo56324d()
        L_0x00ae:
            return r11
        L_0x00af:
            r12 = move-exception
            if (r0 == 0) goto L_0x00b7
            androidx.emoji2.text.q r11 = (androidx.emoji2.text.C19107q) r11
            r11.mo56324d()
        L_0x00b7:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.C19084j.mo56263l(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }

    /* renamed from: m */
    public final <T> T mo56264m(@C0359n0 CharSequence charSequence, @C0337f0(from = 0) int i, @C0337f0(from = 0) int i2, @C0337f0(from = 0) int i3, boolean z, C19087c<T> cVar) {
        int i4;
        C19090f fVar = new C19090f(this.f48557b.mo56312i(), this.f48559d, this.f48560e);
        int i5 = 0;
        boolean z2 = true;
        int codePointAt = Character.codePointAt(charSequence, i);
        loop0:
        while (true) {
            i4 = i;
            while (i < i2 && i5 < i3 && z2) {
                int a = fVar.mo56270a(codePointAt);
                if (a == 1) {
                    i4 += Character.charCount(Character.codePointAt(charSequence, i4));
                    if (i4 < i2) {
                        codePointAt = Character.codePointAt(charSequence, i4);
                    }
                    i = i4;
                } else if (a == 2) {
                    i += Character.charCount(codePointAt);
                    if (i < i2) {
                        codePointAt = Character.codePointAt(charSequence, i);
                    }
                } else if (a == 3) {
                    if (z || !mo56261h(charSequence, i4, i, fVar.mo56272c())) {
                        i5++;
                        z2 = cVar.mo56266b(charSequence, i4, i, fVar.mo56272c());
                    }
                }
            }
        }
        if (fVar.mo56273e() && i5 < i3 && z2 && (z || !mo56261h(charSequence, i4, i, fVar.mo56271b()))) {
            cVar.mo56266b(charSequence, i4, i, fVar.mo56271b());
        }
        return cVar.mo56265a();
    }
}

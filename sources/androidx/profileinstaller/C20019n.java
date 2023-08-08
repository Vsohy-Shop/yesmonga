package androidx.profileinstaller;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import com.google.firebase.installations.C33124s;
import com.google.firebase.messaging.C33168b1;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;

@C0376v0(19)
/* renamed from: androidx.profileinstaller.n */
public class C20019n {

    /* renamed from: a */
    public static final int f51253a = 1;

    /* renamed from: b */
    public static final int f51254b = 2;

    /* renamed from: c */
    public static final int f51255c = 4;

    /* renamed from: d */
    public static final int f51256d = 6;

    /* renamed from: e */
    public static final int f51257e = 7;

    /* renamed from: f */
    public static final byte[] f51258f = {112, 114, 111, 0};

    /* renamed from: g */
    public static final byte[] f51259g = {112, 114, 109, 0};

    /* renamed from: A */
    public static void m93011A(@C0359n0 InputStream inputStream) throws IOException {
        C20005e.m92979h(inputStream);
        int j = C20005e.m92981j(inputStream);
        if (j != 6 && j != 7) {
            while (j > 0) {
                C20005e.m92981j(inputStream);
                for (int j2 = C20005e.m92981j(inputStream); j2 > 0; j2--) {
                    C20005e.m92979h(inputStream);
                }
                j--;
            }
        }
    }

    /* renamed from: B */
    public static boolean m93012B(@C0359n0 OutputStream outputStream, @C0359n0 byte[] bArr, @C0359n0 C20004d[] dVarArr) throws IOException {
        if (Arrays.equals(bArr, C20027r.f51285a)) {
            m93024N(outputStream, dVarArr);
            return true;
        } else if (Arrays.equals(bArr, C20027r.f51286b)) {
            m93023M(outputStream, dVarArr);
            return true;
        } else if (Arrays.equals(bArr, C20027r.f51288d)) {
            m93021K(outputStream, dVarArr);
            return true;
        } else if (Arrays.equals(bArr, C20027r.f51287c)) {
            m93022L(outputStream, dVarArr);
            return true;
        } else if (!Arrays.equals(bArr, C20027r.f51289e)) {
            return false;
        } else {
            m93020J(outputStream, dVarArr);
            return true;
        }
    }

    /* renamed from: C */
    public static void m93013C(@C0359n0 OutputStream outputStream, @C0359n0 C20004d dVar) throws IOException {
        int i = 0;
        for (int valueOf : dVar.f51206h) {
            Integer valueOf2 = Integer.valueOf(valueOf);
            C20005e.m92987p(outputStream, valueOf2.intValue() - i);
            i = valueOf2.intValue();
        }
    }

    /* renamed from: D */
    public static C20029t m93014D(@C0359n0 C20004d[] dVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            C20005e.m92987p(byteArrayOutputStream, dVarArr.length);
            int i = 2;
            for (C20004d dVar : dVarArr) {
                C20005e.m92988q(byteArrayOutputStream, dVar.f51201c);
                C20005e.m92988q(byteArrayOutputStream, dVar.f51202d);
                C20005e.m92988q(byteArrayOutputStream, (long) dVar.f51205g);
                String j = m93035j(dVar.f51199a, dVar.f51200b, C20027r.f51285a);
                int k = C20005e.m92982k(j);
                C20005e.m92987p(byteArrayOutputStream, k);
                i = i + 4 + 4 + 4 + 2 + (k * 1);
                C20005e.m92985n(byteArrayOutputStream, j);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i == byteArray.length) {
                C20029t tVar = new C20029t(FileSectionType.DEX_FILES, i, byteArray, false);
                byteArrayOutputStream.close();
                return tVar;
            }
            throw C20005e.m92974c("Expected size " + i + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: E */
    public static void m93015E(@C0359n0 OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(f51258f);
        outputStream.write(bArr);
    }

    /* renamed from: F */
    public static void m93016F(@C0359n0 OutputStream outputStream, @C0359n0 C20004d dVar) throws IOException {
        m93019I(outputStream, dVar);
        m93013C(outputStream, dVar);
        m93018H(outputStream, dVar);
    }

    /* renamed from: G */
    public static void m93017G(@C0359n0 OutputStream outputStream, @C0359n0 C20004d dVar, @C0359n0 String str) throws IOException {
        C20005e.m92987p(outputStream, C20005e.m92982k(str));
        C20005e.m92987p(outputStream, dVar.f51203e);
        C20005e.m92988q(outputStream, (long) dVar.f51204f);
        C20005e.m92988q(outputStream, dVar.f51201c);
        C20005e.m92988q(outputStream, (long) dVar.f51205g);
        C20005e.m92985n(outputStream, str);
    }

    /* renamed from: H */
    public static void m93018H(@C0359n0 OutputStream outputStream, @C0359n0 C20004d dVar) throws IOException {
        byte[] bArr = new byte[m93036k(dVar.f51205g)];
        for (Map.Entry next : dVar.f51207i.entrySet()) {
            int intValue = ((Integer) next.getKey()).intValue();
            int intValue2 = ((Integer) next.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                m93051z(bArr, 2, intValue, dVar);
            }
            if ((intValue2 & 4) != 0) {
                m93051z(bArr, 4, intValue, dVar);
            }
        }
        outputStream.write(bArr);
    }

    /* renamed from: I */
    public static void m93019I(@C0359n0 OutputStream outputStream, @C0359n0 C20004d dVar) throws IOException {
        int i = 0;
        for (Map.Entry next : dVar.f51207i.entrySet()) {
            int intValue = ((Integer) next.getKey()).intValue();
            if ((((Integer) next.getValue()).intValue() & 1) != 0) {
                C20005e.m92987p(outputStream, intValue - i);
                C20005e.m92987p(outputStream, 0);
                i = intValue;
            }
        }
    }

    /* renamed from: J */
    public static void m93020J(@C0359n0 OutputStream outputStream, @C0359n0 C20004d[] dVarArr) throws IOException {
        C20005e.m92987p(outputStream, dVarArr.length);
        for (C20004d dVar : dVarArr) {
            String j = m93035j(dVar.f51199a, dVar.f51200b, C20027r.f51289e);
            C20005e.m92987p(outputStream, C20005e.m92982k(j));
            C20005e.m92987p(outputStream, dVar.f51207i.size());
            C20005e.m92987p(outputStream, dVar.f51206h.length);
            C20005e.m92988q(outputStream, dVar.f51201c);
            C20005e.m92985n(outputStream, j);
            for (Integer intValue : dVar.f51207i.keySet()) {
                C20005e.m92987p(outputStream, intValue.intValue());
            }
            for (int p : dVar.f51206h) {
                C20005e.m92987p(outputStream, p);
            }
        }
    }

    /* renamed from: K */
    public static void m93021K(@C0359n0 OutputStream outputStream, @C0359n0 C20004d[] dVarArr) throws IOException {
        C20005e.m92989r(outputStream, dVarArr.length);
        for (C20004d dVar : dVarArr) {
            String j = m93035j(dVar.f51199a, dVar.f51200b, C20027r.f51288d);
            C20005e.m92987p(outputStream, C20005e.m92982k(j));
            C20005e.m92987p(outputStream, dVar.f51206h.length);
            C20005e.m92988q(outputStream, (long) (dVar.f51207i.size() * 4));
            C20005e.m92988q(outputStream, dVar.f51201c);
            C20005e.m92985n(outputStream, j);
            for (Integer intValue : dVar.f51207i.keySet()) {
                C20005e.m92987p(outputStream, intValue.intValue());
                C20005e.m92987p(outputStream, 0);
            }
            for (int p : dVar.f51206h) {
                C20005e.m92987p(outputStream, p);
            }
        }
    }

    /* renamed from: L */
    public static void m93022L(@C0359n0 OutputStream outputStream, @C0359n0 C20004d[] dVarArr) throws IOException {
        byte[] b = m93027b(dVarArr, C20027r.f51287c);
        C20005e.m92989r(outputStream, dVarArr.length);
        C20005e.m92984m(outputStream, b);
    }

    /* renamed from: M */
    public static void m93023M(@C0359n0 OutputStream outputStream, @C0359n0 C20004d[] dVarArr) throws IOException {
        byte[] b = m93027b(dVarArr, C20027r.f51286b);
        C20005e.m92989r(outputStream, dVarArr.length);
        C20005e.m92984m(outputStream, b);
    }

    /* renamed from: N */
    public static void m93024N(@C0359n0 OutputStream outputStream, @C0359n0 C20004d[] dVarArr) throws IOException {
        m93025O(outputStream, dVarArr);
    }

    /* renamed from: O */
    public static void m93025O(@C0359n0 OutputStream outputStream, @C0359n0 C20004d[] dVarArr) throws IOException {
        int i;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(m93014D(dVarArr));
        arrayList.add(m93028c(dVarArr));
        arrayList.add(m93029d(dVarArr));
        long length = ((long) C20027r.f51285a.length) + ((long) f51258f.length) + 4 + ((long) (arrayList.size() * 16));
        C20005e.m92988q(outputStream, (long) arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C20029t tVar = (C20029t) arrayList.get(i2);
            C20005e.m92988q(outputStream, tVar.f51294a.mo59253r());
            C20005e.m92988q(outputStream, length);
            if (tVar.f51297d) {
                byte[] bArr = tVar.f51296c;
                byte[] b = C20005e.m92973b(bArr);
                arrayList2.add(b);
                C20005e.m92988q(outputStream, (long) b.length);
                C20005e.m92988q(outputStream, (long) bArr.length);
                i = b.length;
            } else {
                arrayList2.add(tVar.f51296c);
                C20005e.m92988q(outputStream, (long) tVar.f51296c.length);
                C20005e.m92988q(outputStream, 0);
                i = tVar.f51296c.length;
            }
            length += (long) i;
        }
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            outputStream.write((byte[]) arrayList2.get(i3));
        }
    }

    /* renamed from: a */
    public static int m93026a(@C0359n0 C20004d dVar) {
        int i = 0;
        for (Map.Entry<Integer, Integer> value : dVar.f51207i.entrySet()) {
            i |= ((Integer) value.getValue()).intValue();
        }
        return i;
    }

    @C0359n0
    /* renamed from: b */
    public static byte[] m93027b(@C0359n0 C20004d[] dVarArr, @C0359n0 byte[] bArr) throws IOException {
        int i = 0;
        int i2 = 0;
        for (C20004d dVar : dVarArr) {
            i2 += C20005e.m92982k(m93035j(dVar.f51199a, dVar.f51200b, bArr)) + 16 + (dVar.f51203e * 2) + dVar.f51204f + m93036k(dVar.f51205g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, C20027r.f51287c)) {
            int length = dVarArr.length;
            while (i < length) {
                C20004d dVar2 = dVarArr[i];
                m93017G(byteArrayOutputStream, dVar2, m93035j(dVar2.f51199a, dVar2.f51200b, bArr));
                m93016F(byteArrayOutputStream, dVar2);
                i++;
            }
        } else {
            for (C20004d dVar3 : dVarArr) {
                m93017G(byteArrayOutputStream, dVar3, m93035j(dVar3.f51199a, dVar3.f51200b, bArr));
            }
            int length2 = dVarArr.length;
            while (i < length2) {
                m93016F(byteArrayOutputStream, dVarArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == i2) {
            return byteArrayOutputStream.toByteArray();
        }
        throw C20005e.m92974c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i2);
    }

    /* renamed from: c */
    public static C20029t m93028c(@C0359n0 C20004d[] dVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        int i2 = 0;
        while (i < dVarArr.length) {
            try {
                C20004d dVar = dVarArr[i];
                C20005e.m92987p(byteArrayOutputStream, i);
                C20005e.m92987p(byteArrayOutputStream, dVar.f51203e);
                i2 = i2 + 2 + 2 + (dVar.f51203e * 2);
                m93013C(byteArrayOutputStream, dVar);
                i++;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i2 == byteArray.length) {
            C20029t tVar = new C20029t(FileSectionType.CLASSES, i2, byteArray, true);
            byteArrayOutputStream.close();
            return tVar;
        }
        throw C20005e.m92974c("Expected size " + i2 + ", does not match actual size " + byteArray.length);
        throw th;
    }

    /* renamed from: d */
    public static C20029t m93029d(@C0359n0 C20004d[] dVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        int i2 = 0;
        while (i < dVarArr.length) {
            try {
                C20004d dVar = dVarArr[i];
                int a = m93026a(dVar);
                byte[] e = m93030e(dVar);
                byte[] f = m93031f(dVar);
                C20005e.m92987p(byteArrayOutputStream, i);
                int length = e.length + 2 + f.length;
                C20005e.m92988q(byteArrayOutputStream, (long) length);
                C20005e.m92987p(byteArrayOutputStream, a);
                byteArrayOutputStream.write(e);
                byteArrayOutputStream.write(f);
                i2 = i2 + 2 + 4 + length;
                i++;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i2 == byteArray.length) {
            C20029t tVar = new C20029t(FileSectionType.METHODS, i2, byteArray, true);
            byteArrayOutputStream.close();
            return tVar;
        }
        throw C20005e.m92974c("Expected size " + i2 + ", does not match actual size " + byteArray.length);
        throw th;
    }

    /* renamed from: e */
    public static byte[] m93030e(@C0359n0 C20004d dVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m93018H(byteArrayOutputStream, dVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: f */
    public static byte[] m93031f(@C0359n0 C20004d dVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m93019I(byteArrayOutputStream, dVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    @C0359n0
    /* renamed from: g */
    public static String m93032g(@C0359n0 String str, @C0359n0 String str2) {
        if (C33168b1.f80509d.equals(str2)) {
            return str.replace(C33124s.f80355c, C33168b1.f80509d);
        }
        if (C33124s.f80355c.equals(str2)) {
            return str.replace(C33168b1.f80509d, C33124s.f80355c);
        }
        return str;
    }

    @C0359n0
    /* renamed from: h */
    public static String m93033h(@C0359n0 String str) {
        int indexOf = str.indexOf(C33168b1.f80509d);
        if (indexOf < 0) {
            indexOf = str.indexOf(C33124s.f80355c);
        }
        if (indexOf > 0) {
            return str.substring(indexOf + 1);
        }
        return str;
    }

    @C0363p0
    /* renamed from: i */
    public static C20004d m93034i(@C0359n0 C20004d[] dVarArr, @C0359n0 String str) {
        if (dVarArr.length <= 0) {
            return null;
        }
        String h = m93033h(str);
        for (int i = 0; i < dVarArr.length; i++) {
            if (dVarArr[i].f51200b.equals(h)) {
                return dVarArr[i];
            }
        }
        return null;
    }

    @C0359n0
    /* renamed from: j */
    public static String m93035j(@C0359n0 String str, @C0359n0 String str2, @C0359n0 byte[] bArr) {
        String a = C20027r.m93065a(bArr);
        if (str.length() <= 0) {
            return m93032g(str2, a);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains(C33168b1.f80509d) || str2.contains(C33124s.f80355c)) {
            return m93032g(str2, a);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + C20027r.m93065a(bArr) + str2;
    }

    /* renamed from: k */
    public static int m93036k(int i) {
        return m93050y(i * 2) / 8;
    }

    /* renamed from: l */
    public static int m93037l(int i, int i2, int i3) {
        if (i == 1) {
            throw C20005e.m92974c("HOT methods are not stored in the bitmap");
        } else if (i == 2) {
            return i2;
        } else {
            if (i == 4) {
                return i2 + i3;
            }
            throw C20005e.m92974c("Unexpected flag: " + i);
        }
    }

    /* renamed from: m */
    public static int[] m93038m(@C0359n0 InputStream inputStream, int i) throws IOException {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += C20005e.m92979h(inputStream);
            iArr[i3] = i2;
        }
        return iArr;
    }

    /* renamed from: n */
    public static int m93039n(@C0359n0 BitSet bitSet, int i, int i2) {
        int i3 = 2;
        if (!bitSet.get(m93037l(2, i, i2))) {
            i3 = 0;
        }
        if (bitSet.get(m93037l(4, i, i2))) {
            return i3 | 4;
        }
        return i3;
    }

    /* renamed from: o */
    public static byte[] m93040o(@C0359n0 InputStream inputStream, @C0359n0 byte[] bArr) throws IOException {
        if (Arrays.equals(bArr, C20005e.m92975d(inputStream, bArr.length))) {
            return C20005e.m92975d(inputStream, C20027r.f51286b.length);
        }
        throw C20005e.m92974c("Invalid magic");
    }

    /* renamed from: p */
    public static void m93041p(@C0359n0 InputStream inputStream, @C0359n0 C20004d dVar) throws IOException {
        int available = inputStream.available() - dVar.f51204f;
        int i = 0;
        while (inputStream.available() > available) {
            i += C20005e.m92979h(inputStream);
            dVar.f51207i.put(Integer.valueOf(i), 1);
            for (int h = C20005e.m92979h(inputStream); h > 0; h--) {
                m93011A(inputStream);
            }
        }
        if (inputStream.available() != available) {
            throw C20005e.m92974c("Read too much data during profile line parse");
        }
    }

    @C0359n0
    /* renamed from: q */
    public static C20004d[] m93042q(@C0359n0 InputStream inputStream, @C0359n0 byte[] bArr, @C0359n0 byte[] bArr2, C20004d[] dVarArr) throws IOException {
        if (Arrays.equals(bArr, C20027r.f51290f)) {
            if (!Arrays.equals(C20027r.f51285a, bArr2)) {
                return m93043r(inputStream, bArr, dVarArr);
            }
            throw C20005e.m92974c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        } else if (Arrays.equals(bArr, C20027r.f51291g)) {
            return m93045t(inputStream, bArr2, dVarArr);
        } else {
            throw C20005e.m92974c("Unsupported meta version");
        }
    }

    @C0359n0
    /* renamed from: r */
    public static C20004d[] m93043r(@C0359n0 InputStream inputStream, @C0359n0 byte[] bArr, C20004d[] dVarArr) throws IOException {
        if (Arrays.equals(bArr, C20027r.f51290f)) {
            int j = C20005e.m92981j(inputStream);
            byte[] e = C20005e.m92976e(inputStream, (int) C20005e.m92980i(inputStream), (int) C20005e.m92980i(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e);
                try {
                    C20004d[] s = m93044s(byteArrayInputStream, j, dVarArr);
                    byteArrayInputStream.close();
                    return s;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                throw C20005e.m92974c("Content found after the end of file");
            }
        } else {
            throw C20005e.m92974c("Unsupported meta version");
        }
        throw th;
    }

    @C0359n0
    /* renamed from: s */
    public static C20004d[] m93044s(@C0359n0 InputStream inputStream, int i, C20004d[] dVarArr) throws IOException {
        int i2 = 0;
        if (inputStream.available() == 0) {
            return new C20004d[0];
        }
        if (i == dVarArr.length) {
            String[] strArr = new String[i];
            int[] iArr = new int[i];
            for (int i3 = 0; i3 < i; i3++) {
                int h = C20005e.m92979h(inputStream);
                iArr[i3] = C20005e.m92979h(inputStream);
                strArr[i3] = C20005e.m92977f(inputStream, h);
            }
            while (i2 < i) {
                C20004d dVar = dVarArr[i2];
                if (dVar.f51200b.equals(strArr[i2])) {
                    int i4 = iArr[i2];
                    dVar.f51203e = i4;
                    dVar.f51206h = m93038m(inputStream, i4);
                    i2++;
                } else {
                    throw C20005e.m92974c("Order of dexfiles in metadata did not match baseline");
                }
            }
            return dVarArr;
        }
        throw C20005e.m92974c("Mismatched number of dex files found in metadata");
    }

    @C0359n0
    /* renamed from: t */
    public static C20004d[] m93045t(@C0359n0 InputStream inputStream, @C0359n0 byte[] bArr, C20004d[] dVarArr) throws IOException {
        int h = C20005e.m92979h(inputStream);
        byte[] e = C20005e.m92976e(inputStream, (int) C20005e.m92980i(inputStream), (int) C20005e.m92980i(inputStream));
        if (inputStream.read() <= 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e);
            try {
                C20004d[] u = m93046u(byteArrayInputStream, bArr, h, dVarArr);
                byteArrayInputStream.close();
                return u;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            throw C20005e.m92974c("Content found after the end of file");
        }
        throw th;
    }

    @C0359n0
    /* renamed from: u */
    public static C20004d[] m93046u(@C0359n0 InputStream inputStream, @C0359n0 byte[] bArr, int i, C20004d[] dVarArr) throws IOException {
        int i2 = 0;
        if (inputStream.available() == 0) {
            return new C20004d[0];
        }
        if (i == dVarArr.length) {
            while (i2 < i) {
                C20005e.m92979h(inputStream);
                String f = C20005e.m92977f(inputStream, C20005e.m92979h(inputStream));
                long i3 = C20005e.m92980i(inputStream);
                int h = C20005e.m92979h(inputStream);
                C20004d i4 = m93034i(dVarArr, f);
                if (i4 != null) {
                    i4.f51202d = i3;
                    int[] m = m93038m(inputStream, h);
                    if (Arrays.equals(bArr, C20027r.f51289e)) {
                        i4.f51203e = h;
                        i4.f51206h = m;
                    }
                    i2++;
                } else {
                    throw C20005e.m92974c("Missing profile key: " + f);
                }
            }
            return dVarArr;
        }
        throw C20005e.m92974c("Mismatched number of dex files found in metadata");
    }

    /* renamed from: v */
    public static void m93047v(@C0359n0 InputStream inputStream, @C0359n0 C20004d dVar) throws IOException {
        BitSet valueOf = BitSet.valueOf(C20005e.m92975d(inputStream, C20005e.m92972a(dVar.f51205g * 2)));
        int i = 0;
        while (true) {
            int i2 = dVar.f51205g;
            if (i < i2) {
                int n = m93039n(valueOf, i, i2);
                if (n != 0) {
                    Integer num = dVar.f51207i.get(Integer.valueOf(i));
                    if (num == null) {
                        num = 0;
                    }
                    dVar.f51207i.put(Integer.valueOf(i), Integer.valueOf(n | num.intValue()));
                }
                i++;
            } else {
                return;
            }
        }
    }

    @C0359n0
    /* renamed from: w */
    public static C20004d[] m93048w(@C0359n0 InputStream inputStream, @C0359n0 byte[] bArr, @C0359n0 String str) throws IOException {
        if (Arrays.equals(bArr, C20027r.f51286b)) {
            int j = C20005e.m92981j(inputStream);
            byte[] e = C20005e.m92976e(inputStream, (int) C20005e.m92980i(inputStream), (int) C20005e.m92980i(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e);
                try {
                    C20004d[] x = m93049x(byteArrayInputStream, str, j);
                    byteArrayInputStream.close();
                    return x;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                throw C20005e.m92974c("Content found after the end of file");
            }
        } else {
            throw C20005e.m92974c("Unsupported version");
        }
        throw th;
    }

    @C0359n0
    /* renamed from: x */
    public static C20004d[] m93049x(@C0359n0 InputStream inputStream, @C0359n0 String str, int i) throws IOException {
        InputStream inputStream2 = inputStream;
        int i2 = i;
        if (inputStream.available() == 0) {
            return new C20004d[0];
        }
        C20004d[] dVarArr = new C20004d[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int h = C20005e.m92979h(inputStream);
            int h2 = C20005e.m92979h(inputStream);
            long i4 = C20005e.m92980i(inputStream);
            String str2 = str;
            dVarArr[i3] = new C20004d(str2, C20005e.m92977f(inputStream2, h), C20005e.m92980i(inputStream), 0, h2, (int) i4, (int) C20005e.m92980i(inputStream), new int[h2], new TreeMap());
        }
        for (int i5 = 0; i5 < i2; i5++) {
            C20004d dVar = dVarArr[i5];
            m93041p(inputStream2, dVar);
            dVar.f51206h = m93038m(inputStream2, dVar.f51203e);
            m93047v(inputStream2, dVar);
        }
        return dVarArr;
    }

    /* renamed from: y */
    public static int m93050y(int i) {
        return ((i + 8) - 1) & -8;
    }

    /* renamed from: z */
    public static void m93051z(@C0359n0 byte[] bArr, int i, int i2, @C0359n0 C20004d dVar) {
        int l = m93037l(i, i2, dVar.f51205g);
        int i3 = l / 8;
        bArr[i3] = (byte) ((1 << (l % 8)) | bArr[i3]);
    }
}

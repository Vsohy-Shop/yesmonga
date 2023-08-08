package com.google.android.material.color;

import android.content.Context;
import android.util.Pair;
import androidx.annotation.C0354l;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.material.color.i */
public final class C31234i {

    /* renamed from: a */
    public static final short f75153a = 2;

    /* renamed from: b */
    public static final short f75154b = 1;

    /* renamed from: c */
    public static final short f75155c = 512;

    /* renamed from: d */
    public static final short f75156d = 513;

    /* renamed from: e */
    public static final short f75157e = 514;

    /* renamed from: f */
    public static final byte f75158f = 1;

    /* renamed from: g */
    public static final byte f75159g = Byte.MAX_VALUE;

    /* renamed from: h */
    public static final String f75160h = "color";

    /* renamed from: i */
    public static byte f75161i;

    /* renamed from: j */
    public static final C31238d f75162j = new C31238d(1, "android");

    /* renamed from: k */
    public static final Comparator<C31236b> f75163k = new C31235a();

    /* renamed from: com.google.android.material.color.i$a */
    public class C31235a implements Comparator<C31236b> {
        /* renamed from: a */
        public int compare(C31236b bVar, C31236b bVar2) {
            return bVar.f75166c - bVar2.f75166c;
        }
    }

    /* renamed from: com.google.android.material.color.i$b */
    public static class C31236b {

        /* renamed from: a */
        public final byte f75164a;

        /* renamed from: b */
        public final byte f75165b;

        /* renamed from: c */
        public final short f75166c;

        /* renamed from: d */
        public final String f75167d;
        @C0354l

        /* renamed from: e */
        public final int f75168e;

        public C31236b(int i, String str, int i2) {
            this.f75167d = str;
            this.f75168e = i2;
            this.f75166c = (short) (65535 & i);
            this.f75165b = (byte) ((i >> 16) & 255);
            this.f75164a = (byte) ((i >> 24) & 255);
        }
    }

    /* renamed from: com.google.android.material.color.i$c */
    public static class C31237c {

        /* renamed from: f */
        public static final short f75169f = 288;

        /* renamed from: g */
        public static final int f75170g = 128;

        /* renamed from: a */
        public final C31239e f75171a;

        /* renamed from: b */
        public final C31238d f75172b;

        /* renamed from: c */
        public final C31242h f75173c = new C31242h(false, "?1", "?2", "?3", "?4", "?5", "color");

        /* renamed from: d */
        public final C31242h f75174d;

        /* renamed from: e */
        public final C31245k f75175e;

        public C31237c(C31238d dVar, List<C31236b> list) {
            this.f75172b = dVar;
            String[] strArr = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                strArr[i] = list.get(i).f75167d;
            }
            this.f75174d = new C31242h(true, strArr);
            this.f75175e = new C31245k(list);
            this.f75171a = new C31239e(C31234i.f75155c, f75169f, mo89184a());
        }

        /* renamed from: a */
        public int mo89184a() {
            return this.f75173c.mo89190a() + 288 + this.f75174d.mo89190a() + this.f75175e.mo89199b();
        }

        /* renamed from: b */
        public void mo89185b(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f75171a.mo89186a(byteArrayOutputStream);
            byteArrayOutputStream.write(C31234i.m125830j(this.f75172b.f75176a));
            char[] charArray = this.f75172b.f75177b.toCharArray();
            for (int i = 0; i < 128; i++) {
                if (i < charArray.length) {
                    byteArrayOutputStream.write(C31234i.m125828h(charArray[i]));
                } else {
                    byteArrayOutputStream.write(C31234i.m125828h(0));
                }
            }
            byteArrayOutputStream.write(C31234i.m125830j(288));
            byteArrayOutputStream.write(C31234i.m125830j(0));
            byteArrayOutputStream.write(C31234i.m125830j(this.f75173c.mo89190a() + 288));
            byteArrayOutputStream.write(C31234i.m125830j(0));
            byteArrayOutputStream.write(C31234i.m125830j(0));
            this.f75173c.mo89192c(byteArrayOutputStream);
            this.f75174d.mo89192c(byteArrayOutputStream);
            this.f75175e.mo89200c(byteArrayOutputStream);
        }
    }

    /* renamed from: com.google.android.material.color.i$d */
    public static class C31238d {

        /* renamed from: a */
        public final int f75176a;

        /* renamed from: b */
        public final String f75177b;

        public C31238d(int i, String str) {
            this.f75176a = i;
            this.f75177b = str;
        }
    }

    /* renamed from: com.google.android.material.color.i$e */
    public static class C31239e {

        /* renamed from: a */
        public final short f75178a;

        /* renamed from: b */
        public final short f75179b;

        /* renamed from: c */
        public final int f75180c;

        public C31239e(short s, short s2, int i) {
            this.f75178a = s;
            this.f75179b = s2;
            this.f75180c = i;
        }

        /* renamed from: a */
        public void mo89186a(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(C31234i.m125831k(this.f75178a));
            byteArrayOutputStream.write(C31234i.m125831k(this.f75179b));
            byteArrayOutputStream.write(C31234i.m125830j(this.f75180c));
        }
    }

    /* renamed from: com.google.android.material.color.i$f */
    public static class C31240f {

        /* renamed from: c */
        public static final short f75181c = 8;

        /* renamed from: d */
        public static final short f75182d = 2;

        /* renamed from: e */
        public static final short f75183e = 8;

        /* renamed from: f */
        public static final byte f75184f = 28;

        /* renamed from: g */
        public static final int f75185g = 16;

        /* renamed from: a */
        public final int f75186a;

        /* renamed from: b */
        public final int f75187b;

        public C31240f(int i, @C0354l int i2) {
            this.f75186a = i;
            this.f75187b = i2;
        }

        /* renamed from: a */
        public void mo89187a(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(C31234i.m125831k(8));
            byteArrayOutputStream.write(C31234i.m125831k(2));
            byteArrayOutputStream.write(C31234i.m125830j(this.f75186a));
            byteArrayOutputStream.write(C31234i.m125831k(8));
            byteArrayOutputStream.write(new byte[]{0, f75184f});
            byteArrayOutputStream.write(C31234i.m125830j(this.f75187b));
        }
    }

    /* renamed from: com.google.android.material.color.i$g */
    public static class C31241g {

        /* renamed from: e */
        public static final short f75188e = 12;

        /* renamed from: a */
        public final C31239e f75189a;

        /* renamed from: b */
        public final int f75190b;

        /* renamed from: c */
        public final C31242h f75191c;

        /* renamed from: d */
        public final List<C31237c> f75192d = new ArrayList();

        public C31241g(Map<C31238d, List<C31236b>> map) {
            this.f75190b = map.size();
            this.f75191c = new C31242h(new String[0]);
            for (Map.Entry next : map.entrySet()) {
                List list = (List) next.getValue();
                Collections.sort(list, C31234i.f75163k);
                this.f75192d.add(new C31237c((C31238d) next.getKey(), list));
            }
            this.f75189a = new C31239e(2, 12, mo89188a());
        }

        /* renamed from: a */
        public final int mo89188a() {
            int i = 0;
            for (C31237c a : this.f75192d) {
                i += a.mo89184a();
            }
            return this.f75191c.mo89190a() + 12 + i;
        }

        /* renamed from: b */
        public void mo89189b(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f75189a.mo89186a(byteArrayOutputStream);
            byteArrayOutputStream.write(C31234i.m125830j(this.f75190b));
            this.f75191c.mo89192c(byteArrayOutputStream);
            for (C31237c b : this.f75192d) {
                b.mo89185b(byteArrayOutputStream);
            }
        }
    }

    /* renamed from: com.google.android.material.color.i$h */
    public static class C31242h {

        /* renamed from: m */
        public static final short f75193m = 28;

        /* renamed from: n */
        public static final int f75194n = 256;

        /* renamed from: o */
        public static final int f75195o = -1;

        /* renamed from: a */
        public final C31239e f75196a;

        /* renamed from: b */
        public final int f75197b;

        /* renamed from: c */
        public final int f75198c;

        /* renamed from: d */
        public final int f75199d;

        /* renamed from: e */
        public final int f75200e;

        /* renamed from: f */
        public final List<Integer> f75201f;

        /* renamed from: g */
        public final List<Integer> f75202g;

        /* renamed from: h */
        public final List<byte[]> f75203h;

        /* renamed from: i */
        public final List<List<C31243i>> f75204i;

        /* renamed from: j */
        public final boolean f75205j;

        /* renamed from: k */
        public final int f75206k;

        /* renamed from: l */
        public final int f75207l;

        public C31242h(String... strArr) {
            this(false, strArr);
        }

        /* renamed from: a */
        public int mo89190a() {
            return this.f75207l;
        }

        /* renamed from: b */
        public final Pair<byte[], List<C31243i>> mo89191b(String str) {
            byte[] bArr;
            if (this.f75205j) {
                bArr = C31234i.m125833m(str);
            } else {
                bArr = C31234i.m125832l(str);
            }
            return new Pair<>(bArr, Collections.emptyList());
        }

        /* renamed from: c */
        public void mo89192c(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            int i;
            this.f75196a.mo89186a(byteArrayOutputStream);
            byteArrayOutputStream.write(C31234i.m125830j(this.f75197b));
            byteArrayOutputStream.write(C31234i.m125830j(this.f75198c));
            if (this.f75205j) {
                i = 256;
            } else {
                i = 0;
            }
            byteArrayOutputStream.write(C31234i.m125830j(i));
            byteArrayOutputStream.write(C31234i.m125830j(this.f75199d));
            byteArrayOutputStream.write(C31234i.m125830j(this.f75200e));
            for (Integer intValue : this.f75201f) {
                byteArrayOutputStream.write(C31234i.m125830j(intValue.intValue()));
            }
            for (Integer intValue2 : this.f75202g) {
                byteArrayOutputStream.write(C31234i.m125830j(intValue2.intValue()));
            }
            for (byte[] write : this.f75203h) {
                byteArrayOutputStream.write(write);
            }
            int i2 = this.f75206k;
            if (i2 > 0) {
                byteArrayOutputStream.write(new byte[i2]);
            }
            for (List<C31243i> it : this.f75204i) {
                for (C31243i b : it) {
                    b.mo89193b(byteArrayOutputStream);
                }
                byteArrayOutputStream.write(C31234i.m125830j(-1));
            }
        }

        public C31242h(boolean z, String... strArr) {
            this.f75201f = new ArrayList();
            this.f75202g = new ArrayList();
            this.f75203h = new ArrayList();
            this.f75204i = new ArrayList();
            this.f75205j = z;
            int i = 0;
            int i2 = 0;
            for (String b : strArr) {
                Pair<byte[], List<C31243i>> b2 = mo89191b(b);
                this.f75201f.add(Integer.valueOf(i2));
                Object obj = b2.first;
                i2 += ((byte[]) obj).length;
                this.f75203h.add(obj);
                this.f75204i.add(b2.second);
            }
            int i3 = 0;
            for (List<C31243i> next : this.f75204i) {
                for (C31243i iVar : next) {
                    this.f75201f.add(Integer.valueOf(i2));
                    i2 += iVar.f75208a.length;
                    this.f75203h.add(iVar.f75208a);
                }
                this.f75202g.add(Integer.valueOf(i3));
                i3 += (next.size() * 12) + 4;
            }
            int i4 = i2 % 4;
            int i5 = i4 == 0 ? 0 : 4 - i4;
            this.f75206k = i5;
            int size = this.f75203h.size();
            this.f75197b = size;
            this.f75198c = this.f75203h.size() - strArr.length;
            boolean z2 = this.f75203h.size() - strArr.length > 0;
            if (!z2) {
                this.f75202g.clear();
                this.f75204i.clear();
            }
            int size2 = (size * 4) + 28 + (this.f75202g.size() * 4);
            this.f75199d = size2;
            int i6 = i2 + i5;
            this.f75200e = z2 ? size2 + i6 : 0;
            int i7 = size2 + i6 + (z2 ? i3 : i);
            this.f75207l = i7;
            this.f75196a = new C31239e(1, 28, i7);
        }
    }

    /* renamed from: com.google.android.material.color.i$i */
    public static class C31243i {

        /* renamed from: a */
        public byte[] f75208a;

        /* renamed from: b */
        public int f75209b;

        /* renamed from: c */
        public int f75210c;

        /* renamed from: d */
        public int f75211d;

        /* renamed from: b */
        public void mo89193b(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(C31234i.m125830j(this.f75209b));
            byteArrayOutputStream.write(C31234i.m125830j(this.f75210c));
            byteArrayOutputStream.write(C31234i.m125830j(this.f75211d));
        }
    }

    /* renamed from: com.google.android.material.color.i$j */
    public static class C31244j {

        /* renamed from: f */
        public static final int f75212f = -1;

        /* renamed from: g */
        public static final short f75213g = 84;

        /* renamed from: h */
        public static final byte f75214h = 64;

        /* renamed from: a */
        public final C31239e f75215a;

        /* renamed from: b */
        public final int f75216b;

        /* renamed from: c */
        public final byte[] f75217c;

        /* renamed from: d */
        public final int[] f75218d;

        /* renamed from: e */
        public final C31240f[] f75219e;

        public C31244j(List<C31236b> list, Set<Short> set, int i) {
            byte[] bArr = new byte[64];
            this.f75217c = bArr;
            this.f75216b = i;
            bArr[0] = f75214h;
            this.f75219e = new C31240f[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                this.f75219e[i2] = new C31240f(i2, list.get(i2).f75168e);
            }
            this.f75218d = new int[i];
            int i3 = 0;
            for (short s = 0; s < i; s = (short) (s + 1)) {
                if (set.contains(Short.valueOf(s))) {
                    this.f75218d[s] = i3;
                    i3 += 16;
                } else {
                    this.f75218d[s] = -1;
                }
            }
            this.f75215a = new C31239e(C31234i.f75156d, 84, mo89194a());
        }

        /* renamed from: a */
        public int mo89194a() {
            return mo89195b() + (this.f75219e.length * 16);
        }

        /* renamed from: b */
        public final int mo89195b() {
            return mo89196c() + 84;
        }

        /* renamed from: c */
        public final int mo89196c() {
            return this.f75218d.length * 4;
        }

        /* renamed from: d */
        public void mo89197d(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f75215a.mo89186a(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{C31234i.f75161i, 0, 0, 0});
            byteArrayOutputStream.write(C31234i.m125830j(this.f75216b));
            byteArrayOutputStream.write(C31234i.m125830j(mo89195b()));
            byteArrayOutputStream.write(this.f75217c);
            for (int d : this.f75218d) {
                byteArrayOutputStream.write(C31234i.m125830j(d));
            }
            for (C31240f a : this.f75219e) {
                a.mo89187a(byteArrayOutputStream);
            }
        }
    }

    /* renamed from: com.google.android.material.color.i$k */
    public static class C31245k {

        /* renamed from: e */
        public static final short f75220e = 16;

        /* renamed from: f */
        public static final int f75221f = 1073741824;

        /* renamed from: a */
        public final C31239e f75222a;

        /* renamed from: b */
        public final int f75223b;

        /* renamed from: c */
        public final int[] f75224c;

        /* renamed from: d */
        public final C31244j f75225d;

        public C31245k(List<C31236b> list) {
            this.f75223b = list.get(list.size() - 1).f75166c + 1;
            HashSet hashSet = new HashSet();
            for (C31236b a : list) {
                hashSet.add(Short.valueOf(a.f75166c));
            }
            this.f75224c = new int[this.f75223b];
            for (short s = 0; s < this.f75223b; s = (short) (s + 1)) {
                if (hashSet.contains(Short.valueOf(s))) {
                    this.f75224c[s] = 1073741824;
                }
            }
            this.f75222a = new C31239e(C31234i.f75157e, 16, mo89198a());
            this.f75225d = new C31244j(list, hashSet, this.f75223b);
        }

        /* renamed from: a */
        public final int mo89198a() {
            return (this.f75223b * 4) + 16;
        }

        /* renamed from: b */
        public int mo89199b() {
            return mo89198a() + this.f75225d.mo89194a();
        }

        /* renamed from: c */
        public void mo89200c(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.f75222a.mo89186a(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{C31234i.f75161i, 0, 0, 0});
            byteArrayOutputStream.write(C31234i.m125830j(this.f75223b));
            for (int d : this.f75224c) {
                byteArrayOutputStream.write(C31234i.m125830j(d));
            }
            this.f75225d.mo89197d(byteArrayOutputStream);
        }
    }

    /* renamed from: h */
    public static byte[] m125828h(char c) {
        return new byte[]{(byte) (c & 255), (byte) ((c >> 8) & 255)};
    }

    /* renamed from: i */
    public static byte[] m125829i(Context context, Map<Integer, Integer> map) throws IOException {
        C31238d dVar;
        if (!map.entrySet().isEmpty()) {
            C31238d dVar2 = new C31238d(127, context.getPackageName());
            HashMap hashMap = new HashMap();
            C31236b bVar = null;
            for (Map.Entry next : map.entrySet()) {
                C31236b bVar2 = new C31236b(((Integer) next.getKey()).intValue(), context.getResources().getResourceName(((Integer) next.getKey()).intValue()), ((Integer) next.getValue()).intValue());
                if (context.getResources().getResourceTypeName(((Integer) next.getKey()).intValue()).equals("color")) {
                    if (bVar2.f75164a == 1) {
                        dVar = f75162j;
                    } else if (bVar2.f75164a == Byte.MAX_VALUE) {
                        dVar = dVar2;
                    } else {
                        throw new IllegalArgumentException("Not supported with unknown package id: " + bVar2.f75164a);
                    }
                    if (!hashMap.containsKey(dVar)) {
                        hashMap.put(dVar, new ArrayList());
                    }
                    ((List) hashMap.get(dVar)).add(bVar2);
                    bVar = bVar2;
                } else {
                    throw new IllegalArgumentException("Non color resource found: name=" + bVar2.f75167d + ", typeId=" + Integer.toHexString(bVar2.f75165b & 255));
                }
            }
            byte d = bVar.f75165b;
            f75161i = d;
            if (d != 0) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                new C31241g(hashMap).mo89189b(byteArrayOutputStream);
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalArgumentException("No color resources found for harmonization.");
        }
        throw new IllegalArgumentException("No color resources provided for harmonization.");
    }

    /* renamed from: j */
    public static byte[] m125830j(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)};
    }

    /* renamed from: k */
    public static byte[] m125831k(short s) {
        return new byte[]{(byte) (s & 255), (byte) ((s >> 8) & 255)};
    }

    /* renamed from: l */
    public static byte[] m125832l(String str) {
        char[] charArray = str.toCharArray();
        int length = (charArray.length * 2) + 4;
        byte[] bArr = new byte[length];
        byte[] k = m125831k((short) charArray.length);
        bArr[0] = k[0];
        bArr[1] = k[1];
        for (int i = 0; i < charArray.length; i++) {
            byte[] h = m125828h(charArray[i]);
            int i2 = i * 2;
            bArr[i2 + 2] = h[0];
            bArr[i2 + 3] = h[1];
        }
        bArr[length - 2] = 0;
        bArr[length - 1] = 0;
        return bArr;
    }

    /* renamed from: m */
    public static byte[] m125833m(String str) {
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        byte length = (byte) bytes.length;
        int length2 = bytes.length + 3;
        byte[] bArr = new byte[length2];
        System.arraycopy(bytes, 0, bArr, 2, length);
        bArr[1] = length;
        bArr[0] = length;
        bArr[length2 - 1] = 0;
        return bArr;
    }
}

package com.google.android.play.core.internal;

import com.google.android.play.core.splitinstall.C32191p0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.play.core.internal.e0 */
public final class C32045e0 implements C32107z {

    /* renamed from: a */
    public final /* synthetic */ int f78253a = 0;

    public C32045e0() {
    }

    /* renamed from: c */
    public static void m129782c(ClassLoader classLoader, Set<File> set) {
        if (!set.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (File next : set) {
                String valueOf = String.valueOf(next.getParentFile().getAbsolutePath());
                if (valueOf.length() != 0) {
                    "Adding native library parent directory: ".concat(valueOf);
                }
                hashSet.add(next.getParentFile());
            }
            C32060j0 e = C32063k0.m129852e(m129784e(classLoader), "nativeLibraryDirectories", File.class);
            hashSet.removeAll(Arrays.asList((File[]) e.mo92769a()));
            synchronized (C32191p0.class) {
                int size = hashSet.size();
                StringBuilder sb = new StringBuilder(30);
                sb.append("Adding directories ");
                sb.append(size);
                e.mo92773e(hashSet);
            }
        }
    }

    /* renamed from: d */
    public static boolean m129783d(ClassLoader classLoader, File file, File file2, boolean z, C32039c0 c0Var, String str, C32033b0 b0Var) {
        ArrayList arrayList = new ArrayList();
        Object e = m129784e(classLoader);
        C32060j0 e2 = C32063k0.m129852e(e, "dexElements", Object.class);
        List<Object> asList = Arrays.asList((Object[]) e2.mo92769a());
        ArrayList arrayList2 = new ArrayList();
        for (Object d : asList) {
            arrayList2.add(C32063k0.m129851d(d, str, File.class).mo92769a());
        }
        if (arrayList2.contains(file2)) {
            return true;
        }
        if (z || b0Var.mo92730a(e, file2, file)) {
            e2.mo92772d(Arrays.asList(c0Var.mo92733a(e, new ArrayList(Collections.singleton(file2)), file, arrayList)));
            if (arrayList.isEmpty()) {
                return true;
            }
            C32035bf bfVar = new C32035bf("DexPathList.makeDexElement failed");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C32029a1.m129765a(bfVar, (IOException) arrayList.get(i));
            }
            C32063k0.m129852e(e, "dexElementsSuppressedExceptions", IOException.class).mo92772d(arrayList);
            throw bfVar;
        }
        String valueOf = String.valueOf(file2.getPath());
        if (valueOf.length() != 0) {
            "Should be optimized ".concat(valueOf);
        }
        return false;
    }

    /* renamed from: e */
    public static Object m129784e(ClassLoader classLoader) {
        return C32063k0.m129851d(classLoader, "pathList", Object.class).mo92769a();
    }

    /* renamed from: f */
    public static C32039c0 m129785f() {
        return new C32048f0((byte[]) null);
    }

    /* renamed from: g */
    public static C32033b0 m129786g() {
        return new C32057i0((byte[]) null);
    }

    /* renamed from: h */
    public static void m129787h(ClassLoader classLoader, Set<File> set, C32051g0 g0Var) {
        if (!set.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (File parentFile : set) {
                hashSet.add(parentFile.getParentFile());
            }
            Object e = m129784e(classLoader);
            C32060j0<List> d = C32063k0.m129851d(e, "nativeLibraryDirectories", List.class);
            synchronized (C32191p0.class) {
                ArrayList arrayList = new ArrayList(d.mo92769a());
                hashSet.removeAll(arrayList);
                arrayList.addAll(hashSet);
                d.mo92770b(arrayList);
            }
            ArrayList arrayList2 = new ArrayList();
            Object[] a = g0Var.mo92739a(e, new ArrayList(hashSet), arrayList2);
            if (!arrayList2.isEmpty()) {
                C32035bf bfVar = new C32035bf("Error in makePathElements");
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    C32029a1.m129765a(bfVar, (IOException) arrayList2.get(i));
                }
                throw bfVar;
            }
            synchronized (C32191p0.class) {
                C32063k0.m129852e(e, "nativeLibraryPathElements", Object.class).mo92773e(Arrays.asList(a));
            }
        }
    }

    /* renamed from: i */
    public static C32039c0 m129788i() {
        return new C32048f0();
    }

    /* renamed from: j */
    public static C32051g0 m129789j() {
        return new C32054h0((byte[]) null);
    }

    /* renamed from: k */
    public static boolean m129790k(ClassLoader classLoader, File file, File file2, boolean z) {
        return m129783d(classLoader, file, file2, z, m129788i(), "zip", m129786g());
    }

    /* renamed from: l */
    public static void m129791l(ClassLoader classLoader, Set<File> set) {
        m129787h(classLoader, set, new C32054h0());
    }

    /* renamed from: m */
    public static boolean m129792m(ClassLoader classLoader, File file, File file2, boolean z) {
        return m129783d(classLoader, file, file2, z, m129788i(), "path", new C32057i0());
    }

    /* renamed from: a */
    public final boolean mo92736a(ClassLoader classLoader, File file, File file2, boolean z) {
        C32039c0 f;
        String str;
        C32033b0 g;
        switch (this.f78253a) {
            case 0:
            case 1:
                f = m129785f();
                str = "zip";
                g = m129786g();
                break;
            case 2:
                return m129790k(classLoader, file, file2, z);
            case 3:
                return m129790k(classLoader, file, file2, z);
            case 4:
                return m129790k(classLoader, file, file2, z);
            case 5:
                return m129792m(classLoader, file, file2, z);
            case 6:
                return m129792m(classLoader, file, file2, z);
            default:
                f = m129788i();
                g = new C32057i0((char[]) null);
                str = "path";
                break;
        }
        return m129783d(classLoader, file, file2, z, f, str, g);
    }

    /* renamed from: b */
    public final void mo92737b(ClassLoader classLoader, Set set) {
        switch (this.f78253a) {
            case 0:
                m129782c(classLoader, set);
                return;
            case 1:
                m129782c(classLoader, set);
                return;
            case 2:
            case 3:
            case 4:
                m129787h(classLoader, set, m129789j());
                return;
            case 5:
                m129791l(classLoader, set);
                return;
            case 6:
                m129791l(classLoader, set);
                return;
            default:
                m129791l(classLoader, set);
                return;
        }
    }

    public C32045e0(byte[] bArr) {
    }

    public C32045e0(char[] cArr) {
    }

    public C32045e0(float[] fArr) {
    }

    public C32045e0(int[] iArr) {
    }

    public C32045e0(short[] sArr) {
    }

    public C32045e0(boolean[] zArr) {
    }

    public C32045e0(byte[][] bArr) {
    }
}

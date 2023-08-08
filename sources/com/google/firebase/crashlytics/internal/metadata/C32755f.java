package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.C32741f;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.C32750e;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

/* renamed from: com.google.firebase.crashlytics.internal.metadata.f */
public class C32755f implements C32743a {

    /* renamed from: d */
    public static final Charset f79524d = Charset.forName("UTF-8");

    /* renamed from: a */
    public final File f79525a;

    /* renamed from: b */
    public final int f79526b;

    /* renamed from: c */
    public C32750e f79527c;

    /* renamed from: com.google.firebase.crashlytics.internal.metadata.f$a */
    public class C32756a implements C32750e.C32754d {

        /* renamed from: a */
        public final /* synthetic */ byte[] f79528a;

        /* renamed from: b */
        public final /* synthetic */ int[] f79529b;

        public C32756a(byte[] bArr, int[] iArr) {
            this.f79528a = bArr;
            this.f79529b = iArr;
        }

        /* renamed from: a */
        public void mo95112a(InputStream inputStream, int i) throws IOException {
            try {
                inputStream.read(this.f79528a, this.f79529b[0], i);
                int[] iArr = this.f79529b;
                iArr[0] = iArr[0] + i;
            } finally {
                inputStream.close();
            }
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.metadata.f$b */
    public static class C32757b {

        /* renamed from: a */
        public final byte[] f79531a;

        /* renamed from: b */
        public final int f79532b;

        public C32757b(byte[] bArr, int i) {
            this.f79531a = bArr;
            this.f79532b = i;
        }
    }

    public C32755f(File file, int i) {
        this.f79525a = file;
        this.f79526b = i;
    }

    /* renamed from: a */
    public void mo95064a() {
        CommonUtils.m131923e(this.f79527c, "There was a problem closing the Crashlytics log file.");
        this.f79527c = null;
    }

    /* renamed from: b */
    public String mo95065b() {
        byte[] c = mo95066c();
        if (c != null) {
            return new String(c, f79524d);
        }
        return null;
    }

    /* renamed from: c */
    public byte[] mo95066c() {
        C32757b g = mo95117g();
        if (g == null) {
            return null;
        }
        int i = g.f79532b;
        byte[] bArr = new byte[i];
        System.arraycopy(g.f79531a, 0, bArr, 0, i);
        return bArr;
    }

    /* renamed from: d */
    public void mo95067d() {
        mo95064a();
        this.f79525a.delete();
    }

    /* renamed from: e */
    public void mo95068e(long j, String str) {
        mo95118h();
        mo95116f(j, str);
    }

    /* renamed from: f */
    public final void mo95116f(long j, String str) {
        if (this.f79527c != null) {
            if (str == null) {
                str = "null";
            }
            try {
                int i = this.f79526b / 4;
                if (str.length() > i) {
                    str = "..." + str.substring(str.length() - i);
                }
                this.f79527c.mo95095f(String.format(Locale.US, "%d %s%n", new Object[]{Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")}).getBytes(f79524d));
                while (!this.f79527c.mo95101n() && this.f79527c.mo95091C() > this.f79526b) {
                    this.f79527c.mo95108w();
                }
            } catch (IOException e) {
                C32741f.m132248f().mo95055e("There was a problem writing to the Crashlytics log.", e);
            }
        }
    }

    /* renamed from: g */
    public final C32757b mo95117g() {
        if (!this.f79525a.exists()) {
            return null;
        }
        mo95118h();
        C32750e eVar = this.f79527c;
        if (eVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[eVar.mo95091C()];
        try {
            this.f79527c.mo95099k(new C32756a(bArr, iArr));
        } catch (IOException e) {
            C32741f.m132248f().mo95055e("A problem occurred while reading the Crashlytics log file.", e);
        }
        return new C32757b(bArr, iArr[0]);
    }

    /* renamed from: h */
    public final void mo95118h() {
        if (this.f79527c == null) {
            try {
                this.f79527c = new C32750e(this.f79525a);
            } catch (IOException e) {
                C32741f f = C32741f.m132248f();
                f.mo95055e("Could not open log file: " + this.f79525a, e);
            }
        }
    }
}

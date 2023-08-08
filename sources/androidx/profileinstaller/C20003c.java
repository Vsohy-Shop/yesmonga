package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import androidx.annotation.RestrictTo;
import androidx.profileinstaller.C20009i;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

@C0376v0(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: androidx.profileinstaller.c */
public class C20003c {
    @C0359n0

    /* renamed from: a */
    public final AssetManager f51188a;
    @C0359n0

    /* renamed from: b */
    public final Executor f51189b;
    @C0359n0

    /* renamed from: c */
    public final C20009i.C20013d f51190c;
    @C0363p0

    /* renamed from: d */
    public final byte[] f51191d;
    @C0359n0

    /* renamed from: e */
    public final File f51192e;
    @C0359n0

    /* renamed from: f */
    public final String f51193f;
    @C0359n0

    /* renamed from: g */
    public final String f51194g;
    @C0359n0

    /* renamed from: h */
    public final String f51195h;

    /* renamed from: i */
    public boolean f51196i = false;
    @C0363p0

    /* renamed from: j */
    public C20004d[] f51197j;
    @C0363p0

    /* renamed from: k */
    public byte[] f51198k;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public C20003c(@C0359n0 AssetManager assetManager, @C0359n0 Executor executor, @C0359n0 C20009i.C20013d dVar, @C0359n0 String str, @C0359n0 String str2, @C0359n0 String str3, @C0359n0 File file) {
        this.f51188a = assetManager;
        this.f51189b = executor;
        this.f51190c = dVar;
        this.f51193f = str;
        this.f51194g = str2;
        this.f51195h = str3;
        this.f51192e = file;
        this.f51191d = m92959d();
    }

    @C0363p0
    /* renamed from: d */
    public static byte[] m92959d() {
        int i = Build.VERSION.SDK_INT;
        if (i > 33) {
            return null;
        }
        switch (i) {
            case 24:
            case 25:
                return C20027r.f51289e;
            case 26:
                return C20027r.f51288d;
            case 27:
                return C20027r.f51287c;
            case 28:
            case 29:
            case 30:
                return C20027r.f51286b;
            case 31:
            case 32:
            case 33:
                return C20027r.f51285a;
            default:
                return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m92960g(int i, Object obj) {
        this.f51190c.mo59255a(i, obj);
    }

    /* renamed from: k */
    public static boolean m92961k() {
        int i = Build.VERSION.SDK_INT;
        if (i > 33) {
            return false;
        }
        if (!(i == 24 || i == 25)) {
            switch (i) {
                case 31:
                case 32:
                case 33:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    @C0363p0
    /* renamed from: b */
    public final C20003c mo59261b(C20004d[] dVarArr, byte[] bArr) {
        InputStream h;
        try {
            h = mo59265h(this.f51188a, this.f51195h);
            if (h != null) {
                this.f51197j = C20019n.m93042q(h, C20019n.m93040o(h, C20019n.f51259g), bArr, dVarArr);
                h.close();
                return this;
            }
            if (h != null) {
                h.close();
            }
            return null;
        } catch (FileNotFoundException e) {
            this.f51190c.mo59255a(9, e);
        } catch (IOException e2) {
            this.f51190c.mo59255a(7, e2);
        } catch (IllegalStateException e3) {
            this.f51197j = null;
            this.f51190c.mo59255a(8, e3);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: c */
    public final void mo59262c() {
        if (!this.f51196i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: e */
    public boolean mo59263e() {
        if (this.f51191d == null) {
            mo59268l(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        } else if (!this.f51192e.canWrite()) {
            mo59268l(4, (Object) null);
            return false;
        } else {
            this.f51196i = true;
            return true;
        }
    }

    @C0363p0
    /* renamed from: f */
    public final InputStream mo59264f(AssetManager assetManager) {
        try {
            return mo59265h(assetManager, this.f51194g);
        } catch (FileNotFoundException e) {
            this.f51190c.mo59255a(6, e);
            return null;
        } catch (IOException e2) {
            this.f51190c.mo59255a(7, e2);
            return null;
        }
    }

    @C0363p0
    /* renamed from: h */
    public final InputStream mo59265h(AssetManager assetManager, String str) throws IOException {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f51190c.mo59256b(5, (Object) null);
            }
            return null;
        }
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: i */
    public C20003c mo59266i() {
        C20003c b;
        mo59262c();
        if (this.f51191d == null) {
            return this;
        }
        InputStream f = mo59264f(this.f51188a);
        if (f != null) {
            this.f51197j = mo59267j(f);
        }
        C20004d[] dVarArr = this.f51197j;
        if (dVarArr == null || !m92961k() || (b = mo59261b(dVarArr, this.f51191d)) == null) {
            return this;
        }
        return b;
    }

    @C0363p0
    /* renamed from: j */
    public final C20004d[] mo59267j(InputStream inputStream) {
        try {
            C20004d[] w = C20019n.m93048w(inputStream, C20019n.m93040o(inputStream, C20019n.f51258f), this.f51193f);
            try {
                inputStream.close();
                return w;
            } catch (IOException e) {
                this.f51190c.mo59255a(7, e);
                return w;
            }
        } catch (IOException e2) {
            this.f51190c.mo59255a(7, e2);
            inputStream.close();
            return null;
        } catch (IllegalStateException e3) {
            this.f51190c.mo59255a(8, e3);
            try {
                inputStream.close();
            } catch (IOException e4) {
                this.f51190c.mo59255a(7, e4);
            }
            return null;
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e5) {
                this.f51190c.mo59255a(7, e5);
            }
            throw th;
        }
    }

    /* renamed from: l */
    public final void mo59268l(int i, @C0363p0 Object obj) {
        this.f51189b.execute(new C20002b(this, i, obj));
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: m */
    public C20003c mo59269m() {
        ByteArrayOutputStream byteArrayOutputStream;
        C20004d[] dVarArr = this.f51197j;
        byte[] bArr = this.f51191d;
        if (!(dVarArr == null || bArr == null)) {
            mo59262c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                C20019n.m93015E(byteArrayOutputStream, bArr);
                if (!C20019n.m93012B(byteArrayOutputStream, bArr, dVarArr)) {
                    this.f51190c.mo59255a(5, (Object) null);
                    this.f51197j = null;
                    byteArrayOutputStream.close();
                    return this;
                }
                this.f51198k = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                this.f51197j = null;
            } catch (IOException e) {
                this.f51190c.mo59255a(7, e);
            } catch (IllegalStateException e2) {
                this.f51190c.mo59255a(8, e2);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return this;
        throw th;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: n */
    public boolean mo59270n() {
        FileOutputStream fileOutputStream;
        byte[] bArr = this.f51198k;
        if (bArr == null) {
            return false;
        }
        mo59262c();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                fileOutputStream = new FileOutputStream(this.f51192e);
                C20005e.m92983l(byteArrayInputStream, fileOutputStream);
                mo59268l(1, (Object) null);
                fileOutputStream.close();
                byteArrayInputStream.close();
                this.f51198k = null;
                this.f51197j = null;
                return true;
            } catch (Throwable th) {
                byteArrayInputStream.close();
                throw th;
            }
        } catch (FileNotFoundException e) {
            mo59268l(6, e);
            this.f51198k = null;
            this.f51197j = null;
            return false;
        } catch (IOException e2) {
            try {
                mo59268l(7, e2);
                this.f51198k = null;
                this.f51197j = null;
                return false;
            } catch (Throwable th2) {
                this.f51198k = null;
                this.f51197j = null;
                throw th2;
            }
        } catch (Throwable th3) {
            th.addSuppressed(th3);
        }
        throw th;
    }
}

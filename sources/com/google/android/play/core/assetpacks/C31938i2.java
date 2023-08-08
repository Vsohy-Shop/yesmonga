package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.C32029a1;
import com.google.android.play.core.internal.C32062k;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Properties;

/* renamed from: com.google.android.play.core.assetpacks.i2 */
public final class C31938i2 {

    /* renamed from: h */
    public static final C32062k f77906h = new C32062k("SliceMetadataManager");

    /* renamed from: a */
    public final byte[] f77907a = new byte[8192];

    /* renamed from: b */
    public final C31906c0 f77908b;

    /* renamed from: c */
    public final String f77909c;

    /* renamed from: d */
    public final int f77910d;

    /* renamed from: e */
    public final long f77911e;

    /* renamed from: f */
    public final String f77912f;

    /* renamed from: g */
    public int f77913g;

    public C31938i2(C31906c0 c0Var, String str, int i, long j, String str2) {
        this.f77908b = c0Var;
        this.f77909c = str;
        this.f77910d = i;
        this.f77911e = j;
        this.f77912f = str2;
        this.f77913g = -1;
    }

    /* renamed from: a */
    public final void mo92581a(String str, long j, long j2, int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "1");
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j));
        properties.put("remainingBytes", String.valueOf(j2));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f77913g));
        FileOutputStream fileOutputStream = new FileOutputStream(mo92595o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            C32029a1.m129765a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    public final void mo92582b(byte[] bArr, int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f77913g));
        FileOutputStream fileOutputStream = new FileOutputStream(mo92595o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            File D = this.f77908b.mo92500D(this.f77909c, this.f77910d, this.f77911e, this.f77912f);
            if (D.exists()) {
                D.delete();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(D);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.close();
                return;
            } catch (Throwable th) {
                C32029a1.m129765a(th, th);
            }
            throw th;
            throw th;
        } catch (Throwable th2) {
            C32029a1.m129765a(th, th2);
        }
    }

    /* renamed from: c */
    public final void mo92583c(int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "3");
        properties.put("fileOffset", String.valueOf(mo92590j().length()));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f77913g));
        FileOutputStream fileOutputStream = new FileOutputStream(mo92595o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            C32029a1.m129765a(th, th);
        }
        throw th;
    }

    /* renamed from: d */
    public final void mo92584d(int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f77913g));
        FileOutputStream fileOutputStream = new FileOutputStream(mo92595o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            C32029a1.m129765a(th, th);
        }
        throw th;
    }

    /* renamed from: e */
    public final C31933h2 mo92585e() throws IOException {
        File C = this.f77908b.mo92499C(this.f77909c, this.f77910d, this.f77911e, this.f77912f);
        if (C.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(C);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                    throw new C31904bk("Slice checkpoint file corrupt.");
                }
                try {
                    int parseInt = Integer.parseInt(properties.getProperty("fileStatus"));
                    String property = properties.getProperty("fileName");
                    long parseLong = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                    long parseLong2 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                    int parseInt2 = Integer.parseInt(properties.getProperty("previousChunk"));
                    this.f77913g = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                    return new C31933h2(parseInt, property, parseLong, parseLong2, parseInt2);
                } catch (NumberFormatException e) {
                    throw new C31904bk("Slice checkpoint file corrupt.", (Exception) e);
                }
            } catch (Throwable th) {
                C32029a1.m129765a(th, th);
            }
        } else {
            throw new C31904bk("Slice checkpoint file does not exist.");
        }
        throw th;
    }

    /* renamed from: f */
    public final void mo92586f(InputStream inputStream, long j) throws IOException {
        int read;
        RandomAccessFile randomAccessFile = new RandomAccessFile(mo92590j(), "rw");
        try {
            randomAccessFile.seek(j);
            do {
                read = inputStream.read(this.f77907a);
                if (read > 0) {
                    randomAccessFile.write(this.f77907a, 0, read);
                }
            } while (read == 8192);
            randomAccessFile.close();
            return;
        } catch (Throwable th) {
            C32029a1.m129765a(th, th);
        }
        throw th;
    }

    /* renamed from: g */
    public final void mo92587g(byte[] bArr) throws IOException {
        FileOutputStream fileOutputStream;
        this.f77913g++;
        try {
            fileOutputStream = new FileOutputStream(new File(mo92594n(), String.format("%s-LFH.dat", new Object[]{Integer.valueOf(this.f77913g)})));
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            return;
        } catch (IOException e) {
            throw new C31904bk("Could not write metadata file.", (Exception) e);
        } catch (Throwable th) {
            C32029a1.m129765a(th, th);
        }
        throw th;
    }

    /* renamed from: h */
    public final void mo92588h(byte[] bArr, InputStream inputStream) throws IOException {
        this.f77913g++;
        FileOutputStream fileOutputStream = new FileOutputStream(mo92590j());
        try {
            fileOutputStream.write(bArr);
            int read = inputStream.read(this.f77907a);
            while (read > 0) {
                fileOutputStream.write(this.f77907a, 0, read);
                read = inputStream.read(this.f77907a);
            }
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            C32029a1.m129765a(th, th);
        }
        throw th;
    }

    /* renamed from: i */
    public final void mo92589i(long j, byte[] bArr, int i, int i2) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(mo92590j(), "rw");
        try {
            randomAccessFile.seek(j);
            randomAccessFile.write(bArr, i, i2);
            randomAccessFile.close();
            return;
        } catch (Throwable th) {
            C32029a1.m129765a(th, th);
        }
        throw th;
    }

    /* renamed from: j */
    public final File mo92590j() {
        return new File(mo92594n(), String.format("%s-NAM.dat", new Object[]{Integer.valueOf(this.f77913g)}));
    }

    /* renamed from: k */
    public final int mo92591k() throws IOException {
        File C = this.f77908b.mo92499C(this.f77909c, this.f77910d, this.f77911e, this.f77912f);
        if (!C.exists()) {
            return 0;
        }
        FileInputStream fileInputStream = new FileInputStream(C);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                return -1;
            }
            if (properties.getProperty("previousChunk") != null) {
                return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
            }
            throw new C31904bk("Slice checkpoint file corrupt.");
        } catch (Throwable th) {
            C32029a1.m129765a(th, th);
        }
        throw th;
    }

    /* renamed from: l */
    public final boolean mo92592l() {
        FileInputStream fileInputStream;
        File C = this.f77908b.mo92499C(this.f77909c, this.f77910d, this.f77911e, this.f77912f);
        if (!C.exists()) {
            return false;
        }
        try {
            fileInputStream = new FileInputStream(C);
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("fileStatus") != null) {
                return Integer.parseInt(properties.getProperty("fileStatus")) == 4;
            }
            f77906h.mo92776b("Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
            return false;
        } catch (IOException e) {
            f77906h.mo92776b("Could not read checkpoint while checking if extraction finished. %s", e);
            return false;
        } catch (Throwable th) {
            C32029a1.m129765a(th, th);
        }
        throw th;
    }

    /* renamed from: m */
    public final void mo92593m(byte[] bArr, int i) throws IOException {
        this.f77913g++;
        FileOutputStream fileOutputStream = new FileOutputStream(mo92590j());
        try {
            fileOutputStream.write(bArr, 0, i);
            fileOutputStream.close();
            return;
        } catch (Throwable th) {
            C32029a1.m129765a(th, th);
        }
        throw th;
    }

    /* renamed from: n */
    public final File mo92594n() {
        File E = this.f77908b.mo92501E(this.f77909c, this.f77910d, this.f77911e, this.f77912f);
        if (!E.exists()) {
            E.mkdirs();
        }
        return E;
    }

    /* renamed from: o */
    public final File mo92595o() throws IOException {
        File C = this.f77908b.mo92499C(this.f77909c, this.f77910d, this.f77911e, this.f77912f);
        C.getParentFile().mkdirs();
        C.createNewFile();
        return C;
    }
}

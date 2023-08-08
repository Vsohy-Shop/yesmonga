package androidx.camera.core;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.impl.utils.C1516d;
import androidx.camera.core.internal.compat.workaround.C1607a;
import androidx.camera.core.internal.utils.ImageUtil;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public final class ImageSaver implements Runnable {

    /* renamed from: g */
    public static final String f3841g = "ImageSaver";

    /* renamed from: v */
    public static final String f3842v = "CameraX";

    /* renamed from: w */
    public static final String f3843w = ".tmp";

    /* renamed from: x */
    public static final int f3844x = 1024;

    /* renamed from: y */
    public static final int f3845y = 1;

    /* renamed from: z */
    public static final int f3846z = 0;

    /* renamed from: a */
    public final C1353a2 f3847a;

    /* renamed from: b */
    public final int f3848b;
    @C0359n0

    /* renamed from: c */
    public final ImageCapture.C1327u f3849c;

    /* renamed from: d */
    public final Executor f3850d;

    /* renamed from: e */
    public final C1335b f3851e;

    /* renamed from: f */
    public final Executor f3852f;

    public enum SaveError {
        FILE_IO_FAILED,
        ENCODE_FAILED,
        CROP_FAILED,
        UNKNOWN
    }

    /* renamed from: androidx.camera.core.ImageSaver$a */
    public static /* synthetic */ class C1334a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3858a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                androidx.camera.core.internal.utils.ImageUtil$CodecFailedException$FailureType[] r0 = androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3858a = r0
                androidx.camera.core.internal.utils.ImageUtil$CodecFailedException$FailureType r1 = androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType.ENCODE_FAILED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3858a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.core.internal.utils.ImageUtil$CodecFailedException$FailureType r1 = androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType.DECODE_FAILED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3858a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.camera.core.internal.utils.ImageUtil$CodecFailedException$FailureType r1 = androidx.camera.core.internal.utils.ImageUtil.CodecFailedException.FailureType.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.ImageSaver.C1334a.<clinit>():void");
        }
    }

    /* renamed from: androidx.camera.core.ImageSaver$b */
    public interface C1335b {
        /* renamed from: a */
        void mo4820a(@C0359n0 ImageCapture.C1329v vVar);

        /* renamed from: b */
        void mo4821b(@C0359n0 SaveError saveError, @C0359n0 String str, @C0363p0 Throwable th);
    }

    public ImageSaver(C1353a2 a2Var, @C0359n0 ImageCapture.C1327u uVar, int i, Executor executor, Executor executor2, C1335b bVar) {
        this.f3847a = a2Var;
        this.f3849c = uVar;
        this.f3848b = i;
        this.f3851e = bVar;
        this.f3850d = executor;
        this.f3852f = executor2;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m5588j(SaveError saveError, String str, Throwable th) {
        this.f3851e.mo4821b(saveError, str, th);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m5589k(Uri uri) {
        this.f3851e.mo4820a(new ImageCapture.C1329v(uri));
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009e  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m5590l(@androidx.annotation.C0359n0 java.io.File r6) {
        /*
            r5 = this;
            androidx.core.util.C18001r.m81775l(r6)
            r0 = 0
            boolean r1 = r5.mo4916h()     // Catch:{ IOException -> 0x008d, IllegalArgumentException -> 0x008b }
            if (r1 == 0) goto L_0x0054
            androidx.camera.core.ImageCapture$u r1 = r5.f3849c     // Catch:{ IOException -> 0x008d, IllegalArgumentException -> 0x008b }
            android.content.ContentValues r1 = r1.mo4897b()     // Catch:{ IOException -> 0x008d, IllegalArgumentException -> 0x008b }
            if (r1 == 0) goto L_0x001e
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ IOException -> 0x008d, IllegalArgumentException -> 0x008b }
            androidx.camera.core.ImageCapture$u r2 = r5.f3849c     // Catch:{ IOException -> 0x008d, IllegalArgumentException -> 0x008b }
            android.content.ContentValues r2 = r2.mo4897b()     // Catch:{ IOException -> 0x008d, IllegalArgumentException -> 0x008b }
            r1.<init>(r2)     // Catch:{ IOException -> 0x008d, IllegalArgumentException -> 0x008b }
            goto L_0x0023
        L_0x001e:
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ IOException -> 0x008d, IllegalArgumentException -> 0x008b }
            r1.<init>()     // Catch:{ IOException -> 0x008d, IllegalArgumentException -> 0x008b }
        L_0x0023:
            r2 = 1
            r5.mo4921p(r1, r2)     // Catch:{ IOException -> 0x008d, IllegalArgumentException -> 0x008b }
            androidx.camera.core.ImageCapture$u r2 = r5.f3849c     // Catch:{ IOException -> 0x008d, IllegalArgumentException -> 0x008b }
            android.content.ContentResolver r2 = r2.mo4896a()     // Catch:{ IOException -> 0x008d, IllegalArgumentException -> 0x008b }
            androidx.camera.core.ImageCapture$u r3 = r5.f3849c     // Catch:{ IOException -> 0x008d, IllegalArgumentException -> 0x008b }
            android.net.Uri r3 = r3.mo4901f()     // Catch:{ IOException -> 0x008d, IllegalArgumentException -> 0x008b }
            android.net.Uri r1 = r2.insert(r3, r1)     // Catch:{ IOException -> 0x008d, IllegalArgumentException -> 0x008b }
            if (r1 != 0) goto L_0x003f
            androidx.camera.core.ImageSaver$SaveError r2 = androidx.camera.core.ImageSaver.SaveError.FILE_IO_FAILED     // Catch:{ IOException -> 0x0052, IllegalArgumentException -> 0x0050 }
            java.lang.String r3 = "Failed to insert URI."
            goto L_0x0095
        L_0x003f:
            boolean r2 = r5.mo4914f(r6, r1)     // Catch:{ IOException -> 0x0052, IllegalArgumentException -> 0x0050 }
            if (r2 != 0) goto L_0x004a
            androidx.camera.core.ImageSaver$SaveError r2 = androidx.camera.core.ImageSaver.SaveError.FILE_IO_FAILED     // Catch:{ IOException -> 0x0052, IllegalArgumentException -> 0x0050 }
            java.lang.String r3 = "Failed to save to URI."
            goto L_0x004c
        L_0x004a:
            r2 = r0
            r3 = r2
        L_0x004c:
            r5.mo4922q(r1)     // Catch:{ IOException -> 0x0052, IllegalArgumentException -> 0x0050 }
            goto L_0x0095
        L_0x0050:
            r0 = move-exception
            goto L_0x0091
        L_0x0052:
            r0 = move-exception
            goto L_0x0091
        L_0x0054:
            boolean r1 = r5.mo4917i()     // Catch:{ IOException -> 0x008d, IllegalArgumentException -> 0x008b }
            if (r1 == 0) goto L_0x0064
            androidx.camera.core.ImageCapture$u r1 = r5.f3849c     // Catch:{ IOException -> 0x008d, IllegalArgumentException -> 0x008b }
            java.io.OutputStream r1 = r1.mo4900e()     // Catch:{ IOException -> 0x008d, IllegalArgumentException -> 0x008b }
            r5.mo4913e(r6, r1)     // Catch:{ IOException -> 0x008d, IllegalArgumentException -> 0x008b }
            goto L_0x0085
        L_0x0064:
            boolean r1 = r5.mo4915g()     // Catch:{ IOException -> 0x008d, IllegalArgumentException -> 0x008b }
            if (r1 == 0) goto L_0x0085
            androidx.camera.core.ImageCapture$u r1 = r5.f3849c     // Catch:{ IOException -> 0x008d, IllegalArgumentException -> 0x008b }
            java.io.File r1 = r1.mo4898c()     // Catch:{ IOException -> 0x008d, IllegalArgumentException -> 0x008b }
            boolean r2 = r1.exists()     // Catch:{ IOException -> 0x008d, IllegalArgumentException -> 0x008b }
            if (r2 == 0) goto L_0x0079
            r1.delete()     // Catch:{ IOException -> 0x008d, IllegalArgumentException -> 0x008b }
        L_0x0079:
            boolean r1 = r6.renameTo(r1)     // Catch:{ IOException -> 0x008d, IllegalArgumentException -> 0x008b }
            if (r1 != 0) goto L_0x0085
            androidx.camera.core.ImageSaver$SaveError r2 = androidx.camera.core.ImageSaver.SaveError.FILE_IO_FAILED     // Catch:{ IOException -> 0x008d, IllegalArgumentException -> 0x008b }
            java.lang.String r3 = "Failed to rename file."
            r1 = r0
            goto L_0x0095
        L_0x0085:
            r1 = r0
            r2 = r1
            r3 = r2
            goto L_0x0095
        L_0x0089:
            r0 = move-exception
            goto L_0x00a2
        L_0x008b:
            r1 = move-exception
            goto L_0x008e
        L_0x008d:
            r1 = move-exception
        L_0x008e:
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x0091:
            androidx.camera.core.ImageSaver$SaveError r2 = androidx.camera.core.ImageSaver.SaveError.FILE_IO_FAILED     // Catch:{ all -> 0x0089 }
            java.lang.String r3 = "Failed to write destination file."
        L_0x0095:
            r6.delete()
            if (r2 == 0) goto L_0x009e
            r5.mo4918m(r2, r3, r0)
            goto L_0x00a1
        L_0x009e:
            r5.mo4919n(r1)
        L_0x00a1:
            return
        L_0x00a2:
            r6.delete()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.ImageSaver.m5590l(java.io.File):void");
    }

    /* renamed from: e */
    public final void mo4913e(@C0359n0 File file, @C0359n0 OutputStream outputStream) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    outputStream.write(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    return;
                }
            }
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: f */
    public final boolean mo4914f(@C0359n0 File file, @C0359n0 Uri uri) throws IOException {
        OutputStream openOutputStream = this.f3849c.mo4896a().openOutputStream(uri);
        if (openOutputStream != null) {
            try {
                mo4913e(file, openOutputStream);
                openOutputStream.close();
                return true;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else if (openOutputStream == null) {
            return false;
        } else {
            openOutputStream.close();
            return false;
        }
        throw th;
    }

    /* renamed from: g */
    public final boolean mo4915g() {
        return this.f3849c.mo4898c() != null;
    }

    /* renamed from: h */
    public final boolean mo4916h() {
        if (this.f3849c.mo4901f() == null || this.f3849c.mo4896a() == null || this.f3849c.mo4897b() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final boolean mo4917i() {
        return this.f3849c.mo4900e() != null;
    }

    /* renamed from: m */
    public final void mo4918m(SaveError saveError, String str, @C0363p0 Throwable th) {
        try {
            this.f3850d.execute(new C1401f2(this, saveError, str, th));
        } catch (RejectedExecutionException unused) {
            C1417i2.m5913c(f3841g, "Application executor rejected executing OnImageSavedCallback.onError callback. Skipping.");
        }
    }

    /* renamed from: n */
    public final void mo4919n(@C0363p0 Uri uri) {
        try {
            this.f3850d.execute(new C1392e2(this, uri));
        } catch (RejectedExecutionException unused) {
            C1417i2.m5913c(f3841g, "Application executor rejected executing OnImageSavedCallback.onImageSaved callback. Skipping.");
        }
    }

    @C0363p0
    /* renamed from: o */
    public final File mo4920o() {
        File file;
        String str;
        SaveError saveError;
        ImageUtil.CodecFailedException codecFailedException;
        FileOutputStream fileOutputStream;
        try {
            if (mo4915g()) {
                file = new File(this.f3849c.mo4898c().getParent(), "CameraX" + UUID.randomUUID().toString() + f3843w);
            } else {
                file = File.createTempFile("CameraX", f3843w);
            }
            try {
                C1353a2 a2Var = this.f3847a;
                try {
                    fileOutputStream = new FileOutputStream(file);
                    fileOutputStream.write(ImageUtil.m6664d(this.f3847a));
                    C1516d h = C1516d.m6380h(file);
                    h.mo5400c();
                    if (new C1607a().mo5598b(this.f3847a)) {
                        ByteBuffer e = this.f3847a.mo4911o2()[0].mo4906e();
                        e.rewind();
                        byte[] bArr = new byte[e.capacity()];
                        e.get(bArr);
                        h.mo5397D(C1516d.m6382j(new ByteArrayInputStream(bArr)).mo5407q());
                    } else {
                        h.mo5394A(this.f3848b);
                    }
                    ImageCapture.C1324r d = this.f3849c.mo4899d();
                    if (d.mo4888b()) {
                        h.mo5401k();
                    }
                    if (d.mo4890d()) {
                        h.mo5402l();
                    }
                    if (d.mo4887a() != null) {
                        h.mo5399b(this.f3849c.mo4899d().mo4887a());
                    }
                    h.mo5395B();
                    fileOutputStream.close();
                    if (a2Var != null) {
                        a2Var.close();
                    }
                    codecFailedException = null;
                    saveError = null;
                    str = null;
                } catch (Throwable th) {
                    if (a2Var != null) {
                        a2Var.close();
                    }
                    throw th;
                }
            } catch (IOException | IllegalArgumentException e2) {
                saveError = SaveError.FILE_IO_FAILED;
                str = "Failed to write temp file";
                codecFailedException = e2;
            } catch (ImageUtil.CodecFailedException e3) {
                int i = C1334a.f3858a[e3.mo5610a().ordinal()];
                if (i == 1) {
                    saveError = SaveError.ENCODE_FAILED;
                    str = "Failed to encode mImage";
                    codecFailedException = e3;
                } else if (i != 2) {
                    saveError = SaveError.UNKNOWN;
                    str = "Failed to transcode mImage";
                    codecFailedException = e3;
                } else {
                    saveError = SaveError.CROP_FAILED;
                    str = "Failed to crop mImage";
                    codecFailedException = e3;
                }
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            if (saveError == null) {
                return file;
            }
            mo4918m(saveError, str, codecFailedException);
            file.delete();
            return null;
            throw th;
        } catch (IOException e4) {
            mo4918m(SaveError.FILE_IO_FAILED, "Failed to create temp file", e4);
            return null;
        }
    }

    /* renamed from: p */
    public final void mo4921p(@C0359n0 ContentValues contentValues, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("is_pending", Integer.valueOf(i));
        }
    }

    /* renamed from: q */
    public final void mo4922q(@C0359n0 Uri uri) {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentValues contentValues = new ContentValues();
            mo4921p(contentValues, 0);
            this.f3849c.mo4896a().update(uri, contentValues, (String) null, (String[]) null);
        }
    }

    public void run() {
        File o = mo4920o();
        if (o != null) {
            this.f3852f.execute(new C1407g2(this, o));
        }
    }
}

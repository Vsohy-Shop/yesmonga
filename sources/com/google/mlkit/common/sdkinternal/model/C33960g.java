package com.google.mlkit.common.sdkinternal.model;

import android.annotation.SuppressLint;
import android.os.ParcelFileDescriptor;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40777k;
import com.google.android.gms.internal.mlkit_common.C42324b9;
import com.google.android.gms.internal.mlkit_common.C42510s8;
import com.google.android.gms.internal.mlkit_common.zzgy;
import com.google.android.gms.internal.mlkit_common.zzhe;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.internal.model.C33904c;
import com.google.mlkit.common.model.C33920d;
import com.google.mlkit.common.sdkinternal.C33933c;
import com.google.mlkit.common.sdkinternal.C33947j;
import com.google.mlkit.common.sdkinternal.C33970o;
import com.google.mlkit.common.sdkinternal.ModelType;
import com.google.mlkit.common.sdkinternal.model.ModelValidator;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@C40473a
/* renamed from: com.google.mlkit.common.sdkinternal.model.g */
public class C33960g {

    /* renamed from: h */
    public static final C40777k f82434h = new C40777k("RemoteModelFileManager", "");

    /* renamed from: a */
    public final C33947j f82435a;

    /* renamed from: b */
    public final String f82436b;

    /* renamed from: c */
    public final ModelType f82437c;
    @C0363p0

    /* renamed from: d */
    public final ModelValidator f82438d;

    /* renamed from: e */
    public final C33961h f82439e;

    /* renamed from: f */
    public final C33970o f82440f;

    /* renamed from: g */
    public final C33957d f82441g;

    @SuppressLint({"FirebaseLambdaLast"})
    public C33960g(@RecentlyNonNull C33947j jVar, @RecentlyNonNull C33920d dVar, @C0363p0 ModelValidator modelValidator, @RecentlyNonNull C33957d dVar2, @RecentlyNonNull C33961h hVar) {
        String str;
        this.f82435a = jVar;
        ModelType e = dVar.mo98681e();
        this.f82437c = e;
        if (e == ModelType.TRANSLATE) {
            str = dVar.mo98680d();
        } else {
            str = dVar.mo98683f();
        }
        this.f82436b = str;
        this.f82438d = modelValidator;
        this.f82440f = C33970o.m136702g(jVar);
        this.f82441g = dVar2;
        this.f82439e = hVar;
    }

    @C40473a
    @C0359n0
    /* renamed from: a */
    public File mo98794a(boolean z) {
        return this.f82441g.mo98767f(this.f82436b, this.f82437c, z);
    }

    @C0348i1
    @RecentlyNullable
    @C40473a
    /* renamed from: b */
    public synchronized File mo98795b(@RecentlyNonNull ParcelFileDescriptor parcelFileDescriptor, @RecentlyNonNull String str, @RecentlyNonNull C33920d dVar) throws MlKitException {
        File file;
        FileOutputStream fileOutputStream;
        MlKitException mlKitException;
        String str2;
        String str3;
        ModelValidator modelValidator;
        String str4;
        String str5;
        file = new File(this.f82441g.mo98771j(this.f82436b, this.f82437c), "to_be_validated_model.tmp");
        ModelValidator.ValidationResult validationResult = null;
        try {
            ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
            try {
                fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = autoCloseInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                fileOutputStream.getFD().sync();
                fileOutputStream.close();
                autoCloseInputStream.close();
                boolean d = C33904c.m136507d(file, str);
                if (d && (modelValidator = this.f82438d) != null) {
                    validationResult = modelValidator.mo98741a(file, dVar);
                    if (validationResult.mo98742a().equals(ModelValidator.ValidationResult.ErrorCode.TFLITE_VERSION_INCOMPATIBLE)) {
                        String a = C33933c.m136569a(this.f82435a.mo98718b());
                        this.f82440f.mo98820n(dVar, str, a);
                        C40777k kVar = f82434h;
                        String valueOf = String.valueOf(str);
                        if (valueOf.length() != 0) {
                            str4 = "Model is not compatible. Model hash: ".concat(valueOf);
                        } else {
                            str4 = new String("Model is not compatible. Model hash: ");
                        }
                        kVar.mo134430c("RemoteModelFileManager", str4);
                        String valueOf2 = String.valueOf(a);
                        if (valueOf2.length() != 0) {
                            str5 = "The current app version is: ".concat(valueOf2);
                        } else {
                            str5 = new String("The current app version is: ");
                        }
                        kVar.mo134430c("RemoteModelFileManager", str5);
                    }
                }
                if (d) {
                    if (validationResult == null || validationResult.mo98744c()) {
                    }
                }
                if (!d) {
                    C40777k kVar2 = f82434h;
                    String valueOf3 = String.valueOf(str);
                    if (valueOf3.length() != 0) {
                        str3 = "Hash does not match with expected: ".concat(valueOf3);
                    } else {
                        str3 = new String("Hash does not match with expected: ");
                    }
                    kVar2.mo134430c("RemoteModelFileManager", str3);
                    C42324b9.m171414b("common").mo137763e(C42510s8.m171652g(), dVar, zzgy.MODEL_HASH_MISMATCH, true, this.f82437c, zzhe.SUCCEEDED);
                    mlKitException = new MlKitException("Hash does not match with expected", 102);
                } else {
                    mlKitException = new MlKitException("Model is not compatible with TFLite run time", 100);
                }
                if (!file.delete()) {
                    C40777k kVar3 = f82434h;
                    String valueOf4 = String.valueOf(file.getAbsolutePath());
                    if (valueOf4.length() != 0) {
                        str2 = "Failed to delete the temp file: ".concat(valueOf4);
                    } else {
                        str2 = new String("Failed to delete the temp file: ");
                    }
                    kVar3.mo134430c("RemoteModelFileManager", str2);
                }
                throw mlKitException;
            } catch (Throwable th) {
                autoCloseInputStream.close();
                throw th;
            }
        } catch (IOException e) {
            C40777k kVar4 = f82434h;
            String valueOf5 = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf5.length() + 56);
            sb.append("Failed to copy downloaded model file to private folder: ");
            sb.append(valueOf5);
            kVar4.mo134432e("RemoteModelFileManager", sb.toString());
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        return this.f82439e.mo98642a(file);
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        if (r4.renameTo(r1) == false) goto L_0x002e;
     */
    @androidx.annotation.C0348i1
    @androidx.annotation.C0359n0
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.io.File mo98796c(@androidx.annotation.RecentlyNonNull java.io.File r4) throws com.google.mlkit.common.MlKitException {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.mlkit.common.sdkinternal.model.d r0 = r3.f82441g     // Catch:{ all -> 0x002f }
            java.lang.String r1 = r3.f82436b     // Catch:{ all -> 0x002f }
            com.google.mlkit.common.sdkinternal.ModelType r2 = r3.f82437c     // Catch:{ all -> 0x002f }
            java.io.File r0 = r0.mo98766e(r1, r2)     // Catch:{ all -> 0x002f }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x002f }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x002f }
            java.lang.String r1 = "/0"
            java.lang.String r0 = r0.concat(r1)     // Catch:{ all -> 0x002f }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x002f }
            r1.<init>(r0)     // Catch:{ all -> 0x002f }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0026
            monitor-exit(r3)
            return r4
        L_0x0026:
            boolean r0 = r4.renameTo(r1)     // Catch:{ all -> 0x002f }
            monitor-exit(r3)
            if (r0 == 0) goto L_0x002e
            return r1
        L_0x002e:
            return r4
        L_0x002f:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.sdkinternal.model.C33960g.mo98796c(java.io.File):java.io.File");
    }

    @C0348i1
    @RecentlyNullable
    /* renamed from: d */
    public final synchronized String mo98797d() throws MlKitException {
        return this.f82441g.mo98772k(this.f82436b, this.f82437c);
    }

    @C0348i1
    /* renamed from: e */
    public final synchronized void mo98798e(@RecentlyNonNull File file) {
        File a = mo98794a(false);
        if (a.exists()) {
            File[] listFiles = a.listFiles();
            if (listFiles != null) {
                for (File equals : listFiles) {
                    if (equals.equals(file)) {
                        this.f82441g.mo98763b(file);
                        return;
                    }
                }
            }
        }
    }

    @C0348i1
    /* renamed from: f */
    public final synchronized boolean mo98799f(@RecentlyNonNull File file) throws MlKitException {
        File e = this.f82441g.mo98766e(this.f82436b, this.f82437c);
        if (!e.exists()) {
            return false;
        }
        File[] listFiles = e.listFiles();
        boolean z = true;
        if (listFiles == null) {
            return true;
        }
        for (File file2 : listFiles) {
            if (!file2.equals(file) && !this.f82441g.mo98763b(file2)) {
                z = false;
            }
        }
        return z;
    }
}

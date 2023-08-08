package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.content.Context;
import android.content.res.AssetManager;
import com.bumptech.glide.load.model.C22281a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_bundled_common.qd */
public final class C29628qd {
    /* renamed from: a */
    public static String m120930a(Context context, String str, int i) throws IOException {
        InputStream open;
        String str2;
        Class<C29628qd> cls = C29628qd.class;
        try {
            AssetManager assets = context.getAssets();
            String[] list = assets.list(str);
            if (list == null) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str2 = "No assets exist in this folder: ".concat(valueOf);
                } else {
                    str2 = new String("No assets exist in this folder: ");
                }
                throw new FileNotFoundException(str2);
            }
            if (r4 == 0) {
                C29665rd.f71433b.mo84809d("Attempted to copy files from empty asset subfolder: %s.", str, new Object[0]);
            }
            for (String str3 : list) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str3).length());
                sb.append(str);
                sb.append("/");
                sb.append(str3);
                String sb2 = sb.toString();
                if (assets.list(sb2).length > 0) {
                    m120930a(context, sb2, 1);
                } else {
                    AssetManager assets2 = context.getAssets();
                    if (sb2.startsWith(C22281a.f57281d)) {
                        sb2 = sb2.substring(22);
                    }
                    C29665rd.f71433b.mo84808c(cls, "Asset to copy: %s", sb2);
                    String absolutePath = context.getFilesDir().getAbsolutePath();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(absolutePath).length() + 1 + String.valueOf(sb2).length());
                    sb3.append(absolutePath);
                    sb3.append("/");
                    sb3.append(sb2);
                    String sb4 = sb3.toString();
                    try {
                        open = assets2.open(sb2);
                        File file = new File(sb4);
                        file.exists();
                        new File(file.getParent()).mkdirs();
                        file.createNewFile();
                        FileOutputStream fileOutputStream = new FileOutputStream(sb4);
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = open.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        open.close();
                        C29665rd.f71433b.mo84808c(cls, "Copied asset to %s", sb4);
                    } catch (IOException e) {
                        C29665rd.f71433b.mo84806a(e, "Failed to copy asset: %s", sb4);
                        throw e;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            }
            String absolutePath2 = context.getFilesDir().getAbsolutePath();
            StringBuilder sb5 = new StringBuilder(String.valueOf(absolutePath2).length() + 1 + String.valueOf(str).length());
            sb5.append(absolutePath2);
            sb5.append("/");
            sb5.append(str);
            return sb5.toString();
            throw th;
        } catch (IOException e2) {
            C29665rd.f71433b.mo84806a(e2, "Failed to copy asset sub folder: %s.", str);
            throw e2;
        }
    }
}

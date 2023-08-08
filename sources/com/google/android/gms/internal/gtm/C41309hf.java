package com.google.android.gms.internal.gtm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.gtm.hf */
public final class C41309hf implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f104658a;

    /* renamed from: b */
    public final /* synthetic */ byte[] f104659b;

    /* renamed from: c */
    public final /* synthetic */ C41333if f104660c;

    public C41309hf(C41333if ifVar, String str, byte[] bArr) {
        this.f104660c = ifVar;
        this.f104658a = str;
        this.f104659b = bArr;
    }

    public final void run() {
        C41333if ifVar = this.f104660c;
        String str = this.f104658a;
        byte[] bArr = this.f104659b;
        File b = ifVar.mo135492b(str);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(b);
            try {
                fileOutputStream.write(bArr);
                try {
                    fileOutputStream.close();
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 24);
                    sb.append("Resource ");
                    sb.append(str);
                    sb.append(" saved on Disk.");
                    C41493p6.m168152d(sb.toString());
                } catch (IOException unused) {
                    C41493p6.m168149a("Error closing stream for writing resource to disk");
                }
            } catch (IOException unused2) {
                C41493p6.m168149a("Error writing resource to disk. Removing resource from disk");
                b.delete();
                try {
                    fileOutputStream.close();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 24);
                    sb2.append("Resource ");
                    sb2.append(str);
                    sb2.append(" saved on Disk.");
                    C41493p6.m168152d(sb2.toString());
                } catch (IOException unused3) {
                    C41493p6.m168149a("Error closing stream for writing resource to disk");
                }
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 24);
                    sb3.append("Resource ");
                    sb3.append(str);
                    sb3.append(" saved on Disk.");
                    C41493p6.m168152d(sb3.toString());
                } catch (IOException unused4) {
                    C41493p6.m168149a("Error closing stream for writing resource to disk");
                }
                throw th;
            }
        } catch (FileNotFoundException unused5) {
            C41493p6.m168149a("Error opening resource file for writing");
        }
    }
}

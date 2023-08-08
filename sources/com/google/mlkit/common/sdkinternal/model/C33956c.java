package com.google.mlkit.common.sdkinternal.model;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.RecentlyNonNull;
import com.carrefour.fid.android.shared.constant.C28515a1;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.internal.mlkit_common.C42570y5;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.C33918c;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

@C40473a
/* renamed from: com.google.mlkit.common.sdkinternal.model.c */
public class C33956c {

    /* renamed from: a */
    public MappedByteBuffer f82411a;

    /* renamed from: b */
    public final Context f82412b;

    /* renamed from: c */
    public final C33918c f82413c;

    @C40473a
    public C33956c(@RecentlyNonNull Context context, @RecentlyNonNull C33918c cVar) {
        this.f82412b = context;
        this.f82413c = cVar;
    }

    @RecentlyNonNull
    @C40473a
    /* renamed from: a */
    public C33918c mo98760a() {
        return this.f82413c;
    }

    @C0348i1
    @C40473a
    @C0359n0
    /* renamed from: b */
    public MappedByteBuffer mo98761b() throws MlKitException {
        FileChannel channel;
        FileChannel channel2;
        String str;
        FileChannel channel3;
        C40843u.m166203m(this.f82412b, "Context can not be null");
        C40843u.m166203m(this.f82413c, "Model source can not be null");
        MappedByteBuffer mappedByteBuffer = this.f82411a;
        if (mappedByteBuffer != null) {
            return mappedByteBuffer;
        }
        String a = this.f82413c.mo98664a();
        String b = this.f82413c.mo98665b();
        Uri c = this.f82413c.mo98666c();
        if (a != null) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(a, C28515a1.f68703k);
                try {
                    channel3 = randomAccessFile.getChannel();
                    this.f82411a = channel3.map(FileChannel.MapMode.READ_ONLY, 0, channel3.size());
                    channel3.close();
                    randomAccessFile.close();
                    return this.f82411a;
                } catch (Throwable th) {
                    randomAccessFile.close();
                    throw th;
                }
            } catch (IOException e) {
                String valueOf = String.valueOf(this.f82413c.mo98664a());
                if (valueOf.length() != 0) {
                    str = "Can not open the local file: ".concat(valueOf);
                } else {
                    str = new String("Can not open the local file: ");
                }
                throw new MlKitException(str, 14, e);
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else if (b != null) {
            try {
                AssetFileDescriptor openFd = this.f82412b.getAssets().openFd(b);
                try {
                    channel2 = new FileInputStream(openFd.getFileDescriptor()).getChannel();
                    FileChannel fileChannel = channel2;
                    this.f82411a = fileChannel.map(FileChannel.MapMode.READ_ONLY, openFd.getStartOffset(), openFd.getDeclaredLength());
                    channel2.close();
                    openFd.close();
                    return this.f82411a;
                } catch (Throwable th3) {
                    if (openFd != null) {
                        openFd.close();
                    }
                    throw th3;
                }
            } catch (IOException e2) {
                StringBuilder sb = new StringBuilder(b.length() + 186);
                sb.append("Can not load the file from asset: ");
                sb.append(b);
                sb.append(". Please double check your asset file name and ensure it's not compressed. See documentation for details how to use aaptOptions to skip file compression");
                throw new MlKitException(sb.toString(), 14, e2);
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
        } else if (c != null) {
            try {
                AssetFileDescriptor a2 = C42570y5.m171729a(this.f82412b, c, C28515a1.f68703k);
                try {
                    channel = a2.createInputStream().getChannel();
                    FileChannel fileChannel2 = channel;
                    this.f82411a = fileChannel2.map(FileChannel.MapMode.READ_ONLY, a2.getStartOffset(), a2.getLength());
                    channel.close();
                    a2.close();
                    return this.f82411a;
                } catch (Throwable th5) {
                    if (a2 != null) {
                        a2.close();
                    }
                    throw th5;
                }
            } catch (IOException e3) {
                String valueOf2 = String.valueOf(c);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 32);
                sb2.append("Can not load the file from URI: ");
                sb2.append(valueOf2);
                throw new MlKitException(sb2.toString(), 14, e3);
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
        } else {
            throw new MlKitException("Can not load the model. One of filePath, assetFilePath or URI must be set for the model.", 14);
        }
        throw th;
        throw th;
        throw th;
    }
}

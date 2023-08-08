package com.google.firebase.installations;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* renamed from: com.google.firebase.installations.d */
public class C33064d {

    /* renamed from: c */
    public static final String f80203c = "CrossProcessLock";

    /* renamed from: a */
    public final FileChannel f80204a;

    /* renamed from: b */
    public final FileLock f80205b;

    public C33064d(FileChannel fileChannel, FileLock fileLock) {
        this.f80204a = fileChannel;
        this.f80205b = fileLock;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025 A[SYNTHETIC, Splitter:B:14:0x0025] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002a A[SYNTHETIC, Splitter:B:18:0x002a] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.firebase.installations.C33064d m133426a(android.content.Context r2, java.lang.String r3) {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0021 }
            java.io.File r2 = r2.getFilesDir()     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0021 }
            r1.<init>(r2, r3)     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0021 }
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0021 }
            java.lang.String r3 = "rw"
            r2.<init>(r1, r3)     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0021 }
            java.nio.channels.FileChannel r2 = r2.getChannel()     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0021 }
            java.nio.channels.FileLock r3 = r2.lock()     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x001f }
            com.google.firebase.installations.d r1 = new com.google.firebase.installations.d     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0023 }
            r1.<init>(r2, r3)     // Catch:{ IOException | Error | OverlappingFileLockException -> 0x0023 }
            return r1
        L_0x001f:
            r3 = r0
            goto L_0x0023
        L_0x0021:
            r2 = r0
            r3 = r2
        L_0x0023:
            if (r3 == 0) goto L_0x0028
            r3.release()     // Catch:{ IOException -> 0x0028 }
        L_0x0028:
            if (r2 == 0) goto L_0x002d
            r2.close()     // Catch:{ IOException -> 0x002d }
        L_0x002d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C33064d.m133426a(android.content.Context, java.lang.String):com.google.firebase.installations.d");
    }

    /* renamed from: b */
    public void mo95788b() {
        try {
            this.f80205b.release();
            this.f80204a.close();
        } catch (IOException unused) {
        }
    }
}

package androidx.core.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;

/* renamed from: androidx.core.content.b */
public final class C17312b {

    @C0376v0(16)
    /* renamed from: androidx.core.content.b$a */
    public static class C17313a {
        @C0373u
        /* renamed from: a */
        public static Cursor m79713a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, cancellationSignal);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: android.os.CancellationSignal} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: android.os.CancellationSignal} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: android.os.CancellationSignal} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.C0363p0
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.database.Cursor m79712a(@androidx.annotation.C0359n0 android.content.ContentResolver r7, @androidx.annotation.C0359n0 android.net.Uri r8, @androidx.annotation.C0363p0 java.lang.String[] r9, @androidx.annotation.C0363p0 java.lang.String r10, @androidx.annotation.C0363p0 java.lang.String[] r11, @androidx.annotation.C0363p0 java.lang.String r12, @androidx.annotation.C0363p0 androidx.core.p027os.C17781e r13) {
        /*
            if (r13 == 0) goto L_0x0009
            java.lang.Object r13 = r13.mo52220b()     // Catch:{ Exception -> 0x0007 }
            goto L_0x000a
        L_0x0007:
            r7 = move-exception
            goto L_0x0018
        L_0x0009:
            r13 = 0
        L_0x000a:
            r6 = r13
            android.os.CancellationSignal r6 = (android.os.CancellationSignal) r6     // Catch:{ Exception -> 0x0007 }
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            android.database.Cursor r7 = androidx.core.content.C17312b.C17313a.m79713a(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0007 }
            return r7
        L_0x0018:
            boolean r8 = r7 instanceof android.os.OperationCanceledException
            if (r8 == 0) goto L_0x0022
            androidx.core.os.OperationCanceledException r7 = new androidx.core.os.OperationCanceledException
            r7.<init>()
            throw r7
        L_0x0022:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.C17312b.m79712a(android.content.ContentResolver, android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String, androidx.core.os.e):android.database.Cursor");
    }
}

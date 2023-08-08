package androidx.core.view.inputmethod;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.core.util.C17992m;
import androidx.core.util.C18001r;
import androidx.core.view.C18196h2;
import androidx.core.view.C18274k;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: androidx.core.view.inputmethod.j */
public final class C18249j {

    /* renamed from: a */
    public static final String f46876a = "InputConnectionCompat";

    /* renamed from: b */
    public static final String f46877b = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";

    /* renamed from: c */
    public static final String f46878c = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";

    /* renamed from: d */
    public static final String f46879d = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";

    /* renamed from: e */
    public static final String f46880e = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";

    /* renamed from: f */
    public static final String f46881f = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";

    /* renamed from: g */
    public static final String f46882g = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";

    /* renamed from: h */
    public static final String f46883h = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";

    /* renamed from: i */
    public static final String f46884i = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";

    /* renamed from: j */
    public static final String f46885j = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";

    /* renamed from: k */
    public static final String f46886k = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";

    /* renamed from: l */
    public static final String f46887l = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";

    /* renamed from: m */
    public static final String f46888m = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";

    /* renamed from: n */
    public static final String f46889n = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";

    /* renamed from: o */
    public static final String f46890o = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";

    /* renamed from: p */
    public static final int f46891p = 1;

    /* renamed from: q */
    public static final String f46892q = "androidx.core.view.extra.INPUT_CONTENT_INFO";

    /* renamed from: androidx.core.view.inputmethod.j$a */
    public class C18250a extends InputConnectionWrapper {

        /* renamed from: a */
        public final /* synthetic */ C18253d f46893a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18250a(InputConnection inputConnection, boolean z, C18253d dVar) {
            super(inputConnection, z);
            this.f46893a = dVar;
        }

        public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
            if (this.f46893a.mo52917a(C18262s.m82872g(inputContentInfo), i, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i, bundle);
        }
    }

    /* renamed from: androidx.core.view.inputmethod.j$b */
    public class C18251b extends InputConnectionWrapper {

        /* renamed from: a */
        public final /* synthetic */ C18253d f46894a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18251b(InputConnection inputConnection, boolean z, C18253d dVar) {
            super(inputConnection, z);
            this.f46894a = dVar;
        }

        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (C18249j.m82860f(str, bundle, this.f46894a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    @C0376v0(25)
    /* renamed from: androidx.core.view.inputmethod.j$c */
    public static class C18252c {
        @C0373u
        /* renamed from: a */
        public static boolean m82862a(InputConnection inputConnection, InputContentInfo inputContentInfo, int i, Bundle bundle) {
            return inputConnection.commitContent(inputContentInfo, i, bundle);
        }
    }

    /* renamed from: androidx.core.view.inputmethod.j$d */
    public interface C18253d {
        /* renamed from: a */
        boolean mo52917a(@C0359n0 C18262s sVar, int i, @C0363p0 Bundle bundle);
    }

    /* renamed from: b */
    public static boolean m82856b(@C0359n0 InputConnection inputConnection, @C0359n0 EditorInfo editorInfo, @C0359n0 C18262s sVar, int i, @C0363p0 Bundle bundle) {
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (Build.VERSION.SDK_INT >= 25) {
            return C18252c.m82862a(inputConnection, C18247h.m82853a(sVar.mo52925f()), i, bundle);
        }
        int e = C18245g.m82841e(editorInfo);
        if (e != 2) {
            z = false;
            if (!(e == 3 || e == 4)) {
                return false;
            }
        } else {
            z = true;
        }
        Bundle bundle2 = new Bundle();
        if (z) {
            str = f46880e;
        } else {
            str = f46879d;
        }
        bundle2.putParcelable(str, sVar.mo52920a());
        if (z) {
            str2 = f46882g;
        } else {
            str2 = f46881f;
        }
        bundle2.putParcelable(str2, sVar.mo52921b());
        if (z) {
            str3 = f46884i;
        } else {
            str3 = f46883h;
        }
        bundle2.putParcelable(str3, sVar.mo52922c());
        if (z) {
            str4 = f46888m;
        } else {
            str4 = f46887l;
        }
        bundle2.putInt(str4, i);
        if (z) {
            str5 = f46886k;
        } else {
            str5 = f46885j;
        }
        bundle2.putParcelable(str5, bundle);
        if (z) {
            str6 = f46878c;
        } else {
            str6 = f46877b;
        }
        return inputConnection.performPrivateCommand(str6, bundle2);
    }

    @C0359n0
    /* renamed from: c */
    public static C18253d m82857c(@C0359n0 View view) {
        C18001r.m81775l(view);
        return new C18248i(view);
    }

    @C0359n0
    /* renamed from: d */
    public static InputConnection m82858d(@C0359n0 View view, @C0359n0 InputConnection inputConnection, @C0359n0 EditorInfo editorInfo) {
        return m82859e(inputConnection, editorInfo, m82857c(view));
    }

    @C0359n0
    @Deprecated
    /* renamed from: e */
    public static InputConnection m82859e(@C0359n0 InputConnection inputConnection, @C0359n0 EditorInfo editorInfo, @C0359n0 C18253d dVar) {
        C17992m.m81744e(inputConnection, "inputConnection must be non-null");
        C17992m.m81744e(editorInfo, "editorInfo must be non-null");
        C17992m.m81744e(dVar, "onCommitContentListener must be non-null");
        if (Build.VERSION.SDK_INT >= 25) {
            return new C18250a(inputConnection, false, dVar);
        }
        if (C18245g.m82837a(editorInfo).length == 0) {
            return inputConnection;
        }
        return new C18251b(inputConnection, false, dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x007d  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m82860f(@androidx.annotation.C0363p0 java.lang.String r7, @androidx.annotation.C0363p0 android.os.Bundle r8, @androidx.annotation.C0359n0 androidx.core.view.inputmethod.C18249j.C18253d r9) {
        /*
            r0 = 0
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r1 = android.text.TextUtils.equals(r1, r7)
            if (r1 == 0) goto L_0x000e
            r7 = r0
            goto L_0x0017
        L_0x000e:
            java.lang.String r1 = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT"
            boolean r7 = android.text.TextUtils.equals(r1, r7)
            if (r7 == 0) goto L_0x0081
            r7 = 1
        L_0x0017:
            r1 = 0
            if (r7 == 0) goto L_0x001d
            java.lang.String r2 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
            goto L_0x001f
        L_0x001d:
            java.lang.String r2 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"
        L_0x001f:
            android.os.Parcelable r2 = r8.getParcelable(r2)     // Catch:{ all -> 0x0079 }
            android.os.ResultReceiver r2 = (android.os.ResultReceiver) r2     // Catch:{ all -> 0x0079 }
            if (r7 == 0) goto L_0x002a
            java.lang.String r3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI"
            goto L_0x002c
        L_0x002a:
            java.lang.String r3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI"
        L_0x002c:
            android.os.Parcelable r3 = r8.getParcelable(r3)     // Catch:{ all -> 0x0077 }
            android.net.Uri r3 = (android.net.Uri) r3     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x0037
            java.lang.String r4 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
            goto L_0x0039
        L_0x0037:
            java.lang.String r4 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"
        L_0x0039:
            android.os.Parcelable r4 = r8.getParcelable(r4)     // Catch:{ all -> 0x0077 }
            android.content.ClipDescription r4 = (android.content.ClipDescription) r4     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x0044
            java.lang.String r5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
            goto L_0x0046
        L_0x0044:
            java.lang.String r5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"
        L_0x0046:
            android.os.Parcelable r5 = r8.getParcelable(r5)     // Catch:{ all -> 0x0077 }
            android.net.Uri r5 = (android.net.Uri) r5     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x0051
            java.lang.String r6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
            goto L_0x0053
        L_0x0051:
            java.lang.String r6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS"
        L_0x0053:
            int r6 = r8.getInt(r6)     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x005c
            java.lang.String r7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
            goto L_0x005e
        L_0x005c:
            java.lang.String r7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"
        L_0x005e:
            android.os.Parcelable r7 = r8.getParcelable(r7)     // Catch:{ all -> 0x0077 }
            android.os.Bundle r7 = (android.os.Bundle) r7     // Catch:{ all -> 0x0077 }
            if (r3 == 0) goto L_0x0071
            if (r4 == 0) goto L_0x0071
            androidx.core.view.inputmethod.s r8 = new androidx.core.view.inputmethod.s     // Catch:{ all -> 0x0077 }
            r8.<init>(r3, r4, r5)     // Catch:{ all -> 0x0077 }
            boolean r0 = r9.mo52917a(r8, r6, r7)     // Catch:{ all -> 0x0077 }
        L_0x0071:
            if (r2 == 0) goto L_0x0076
            r2.send(r0, r1)
        L_0x0076:
            return r0
        L_0x0077:
            r7 = move-exception
            goto L_0x007b
        L_0x0079:
            r7 = move-exception
            r2 = r1
        L_0x007b:
            if (r2 == 0) goto L_0x0080
            r2.send(r0, r1)
        L_0x0080:
            throw r7
        L_0x0081:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.inputmethod.C18249j.m82860f(java.lang.String, android.os.Bundle, androidx.core.view.inputmethod.j$d):boolean");
    }

    /* renamed from: g */
    public static /* synthetic */ boolean m82861g(View view, C18262s sVar, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                sVar.mo52924e();
                InputContentInfo a = C18247h.m82853a(sVar.mo52925f());
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable(f46892q, a);
            } catch (Exception unused) {
                return false;
            }
        }
        if (C18196h2.m82606m1(view, new C18274k.C18276b(new ClipData(sVar.mo52921b(), new ClipData.Item(sVar.mo52920a())), 2).mo52945e(sVar.mo52922c()).mo52943c(bundle).mo52941a()) == null) {
            return true;
        }
        return false;
    }
}

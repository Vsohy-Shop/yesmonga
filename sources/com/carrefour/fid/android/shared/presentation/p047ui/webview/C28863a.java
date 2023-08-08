package com.carrefour.fid.android.shared.presentation.p047ui.webview;

import android.os.Bundle;
import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import androidx.navigation.C19764l;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.presentation.ui.webview.a */
public final class C28863a implements C19764l {
    @C12579k

    /* renamed from: d */
    public static final C28864a f70726d = new C28864a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f70727e = 0;
    @C12579k

    /* renamed from: a */
    public final String f70728a;
    @C12580l

    /* renamed from: b */
    public final String f70729b;
    @C12580l

    /* renamed from: c */
    public final String f70730c;

    /* renamed from: com.carrefour.fid.android.shared.presentation.ui.webview.a$a */
    public static final class C28864a {
        public /* synthetic */ C28864a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C28863a mo84021a(@C12579k Bundle bundle) {
            String str;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C28863a.class.getClassLoader());
            if (bundle.containsKey("webviewUrl")) {
                String string = bundle.getString("webviewUrl");
                if (string != null) {
                    String str2 = null;
                    if (bundle.containsKey("webViewHeaderKey")) {
                        str = bundle.getString("webViewHeaderKey");
                    } else {
                        str = null;
                    }
                    if (bundle.containsKey("webViewHeaderValue")) {
                        str2 = bundle.getString("webViewHeaderValue");
                    }
                    return new C28863a(string, str, str2);
                }
                throw new IllegalArgumentException("Argument \"webviewUrl\" is marked as non-null but was passed a null value.");
            }
            throw new IllegalArgumentException("Required argument \"webviewUrl\" is missing and does not have an android:defaultValue");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        @org.jetbrains.annotations.C12579k
        @kotlin.jvm.C11384m
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.carrefour.fid.android.shared.presentation.p047ui.webview.C28863a mo84022b(@org.jetbrains.annotations.C12579k androidx.lifecycle.C19456p0 r6) {
            /*
                r5 = this;
                java.lang.String r0 = "savedStateHandle"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                java.lang.String r0 = "webviewUrl"
                boolean r1 = r6.mo57647f(r0)
                if (r1 == 0) goto L_0x0043
                java.lang.Object r0 = r6.mo57648h(r0)
                java.lang.String r0 = (java.lang.String) r0
                if (r0 == 0) goto L_0x003b
                java.lang.String r1 = "webViewHeaderKey"
                boolean r2 = r6.mo57647f(r1)
                r3 = 0
                if (r2 == 0) goto L_0x0025
                java.lang.Object r1 = r6.mo57648h(r1)
                java.lang.String r1 = (java.lang.String) r1
                goto L_0x0026
            L_0x0025:
                r1 = r3
            L_0x0026:
                java.lang.String r2 = "webViewHeaderValue"
                boolean r4 = r6.mo57647f(r2)
                if (r4 == 0) goto L_0x0035
                java.lang.Object r6 = r6.mo57648h(r2)
                r3 = r6
                java.lang.String r3 = (java.lang.String) r3
            L_0x0035:
                com.carrefour.fid.android.shared.presentation.ui.webview.a r6 = new com.carrefour.fid.android.shared.presentation.ui.webview.a
                r6.<init>(r0, r1, r3)
                return r6
            L_0x003b:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Argument \"webviewUrl\" is marked as non-null but was passed a null value"
                r6.<init>(r0)
                throw r6
            L_0x0043:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Required argument \"webviewUrl\" is missing and does not have an android:defaultValue"
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.shared.presentation.p047ui.webview.C28863a.C28864a.mo84022b(androidx.lifecycle.p0):com.carrefour.fid.android.shared.presentation.ui.webview.a");
        }

        public C28864a() {
        }
    }

    public C28863a(@C12579k String str, @C12580l String str2, @C12580l String str3) {
        Intrinsics.checkNotNullParameter(str, "webviewUrl");
        this.f70728a = str;
        this.f70729b = str2;
        this.f70730c = str3;
    }

    /* renamed from: e */
    public static /* synthetic */ C28863a m119381e(C28863a aVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aVar.f70728a;
        }
        if ((i & 2) != 0) {
            str2 = aVar.f70729b;
        }
        if ((i & 4) != 0) {
            str3 = aVar.f70730c;
        }
        return aVar.mo84012d(str, str2, str3);
    }

    @C12579k
    @C11384m
    /* renamed from: f */
    public static final C28863a m119382f(@C12579k C19456p0 p0Var) {
        return f70726d.mo84022b(p0Var);
    }

    @C12579k
    @C11384m
    public static final C28863a fromBundle(@C12579k Bundle bundle) {
        return f70726d.mo84021a(bundle);
    }

    @C12579k
    /* renamed from: a */
    public final String mo84009a() {
        return this.f70728a;
    }

    @C12580l
    /* renamed from: b */
    public final String mo84010b() {
        return this.f70729b;
    }

    @C12580l
    /* renamed from: c */
    public final String mo84011c() {
        return this.f70730c;
    }

    @C12579k
    /* renamed from: d */
    public final C28863a mo84012d(@C12579k String str, @C12580l String str2, @C12580l String str3) {
        Intrinsics.checkNotNullParameter(str, "webviewUrl");
        return new C28863a(str, str2, str3);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28863a)) {
            return false;
        }
        C28863a aVar = (C28863a) obj;
        return Intrinsics.areEqual((Object) this.f70728a, (Object) aVar.f70728a) && Intrinsics.areEqual((Object) this.f70729b, (Object) aVar.f70729b) && Intrinsics.areEqual((Object) this.f70730c, (Object) aVar.f70730c);
    }

    @C12580l
    /* renamed from: g */
    public final String mo84014g() {
        return this.f70729b;
    }

    @C12580l
    /* renamed from: h */
    public final String mo84015h() {
        return this.f70730c;
    }

    public int hashCode() {
        int hashCode = this.f70728a.hashCode() * 31;
        String str = this.f70729b;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f70730c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    @C12579k
    /* renamed from: i */
    public final String mo84017i() {
        return this.f70728a;
    }

    @C12579k
    /* renamed from: j */
    public final Bundle mo84018j() {
        Bundle bundle = new Bundle();
        bundle.putString("webviewUrl", this.f70728a);
        bundle.putString("webViewHeaderKey", this.f70729b);
        bundle.putString("webViewHeaderValue", this.f70730c);
        return bundle;
    }

    @C12579k
    /* renamed from: k */
    public final C19456p0 mo84019k() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q("webviewUrl", this.f70728a);
        p0Var.mo57656q("webViewHeaderKey", this.f70729b);
        p0Var.mo57656q("webViewHeaderValue", this.f70730c);
        return p0Var;
    }

    @C12579k
    public String toString() {
        String str = this.f70728a;
        String str2 = this.f70729b;
        String str3 = this.f70730c;
        return "CatalogWebViewActivityArgs(webviewUrl=" + str + ", webViewHeaderKey=" + str2 + ", webViewHeaderValue=" + str3 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C28863a(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}

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
/* renamed from: com.carrefour.fid.android.shared.presentation.ui.webview.e */
public final class C28870e implements C19764l {
    @C12579k

    /* renamed from: f */
    public static final C28871a f70739f = new C28871a((DefaultConstructorMarker) null);

    /* renamed from: g */
    public static final int f70740g = 0;
    @C12579k

    /* renamed from: a */
    public final String f70741a;
    @C12580l

    /* renamed from: b */
    public final String f70742b;
    @C12580l

    /* renamed from: c */
    public final String f70743c;
    @C12580l

    /* renamed from: d */
    public final String f70744d;

    /* renamed from: e */
    public final boolean f70745e;

    /* renamed from: com.carrefour.fid.android.shared.presentation.ui.webview.e$a */
    public static final class C28871a {
        public /* synthetic */ C28871a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        @C11384m
        /* renamed from: a */
        public final C28870e mo84047a(@C12579k Bundle bundle) {
            String str;
            String str2;
            String str3;
            boolean z;
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            bundle.setClassLoader(C28870e.class.getClassLoader());
            if (bundle.containsKey("webviewUrl")) {
                String string = bundle.getString("webviewUrl");
                if (string != null) {
                    if (bundle.containsKey("webViewTitle")) {
                        str = bundle.getString("webViewTitle");
                    } else {
                        str = null;
                    }
                    if (bundle.containsKey("webViewHeaderKey")) {
                        str2 = bundle.getString("webViewHeaderKey");
                    } else {
                        str2 = null;
                    }
                    if (bundle.containsKey("webViewHeaderValue")) {
                        str3 = bundle.getString("webViewHeaderValue");
                    } else {
                        str3 = null;
                    }
                    if (bundle.containsKey("shouldInterceptDeeplink")) {
                        z = bundle.getBoolean("shouldInterceptDeeplink");
                    } else {
                        z = false;
                    }
                    return new C28870e(string, str, str2, str3, z);
                }
                throw new IllegalArgumentException("Argument \"webviewUrl\" is marked as non-null but was passed a null value.");
            }
            throw new IllegalArgumentException("Required argument \"webviewUrl\" is missing and does not have an android:defaultValue");
        }

        @C12579k
        @C11384m
        /* renamed from: b */
        public final C28870e mo84048b(@C12579k C19456p0 p0Var) {
            String str;
            String str2;
            String str3;
            Boolean bool;
            Intrinsics.checkNotNullParameter(p0Var, "savedStateHandle");
            if (p0Var.mo57647f("webviewUrl")) {
                String str4 = (String) p0Var.mo57648h("webviewUrl");
                if (str4 != null) {
                    if (p0Var.mo57647f("webViewTitle")) {
                        str = (String) p0Var.mo57648h("webViewTitle");
                    } else {
                        str = null;
                    }
                    if (p0Var.mo57647f("webViewHeaderKey")) {
                        str2 = (String) p0Var.mo57648h("webViewHeaderKey");
                    } else {
                        str2 = null;
                    }
                    if (p0Var.mo57647f("webViewHeaderValue")) {
                        str3 = (String) p0Var.mo57648h("webViewHeaderValue");
                    } else {
                        str3 = null;
                    }
                    if (p0Var.mo57647f("shouldInterceptDeeplink")) {
                        bool = (Boolean) p0Var.mo57648h("shouldInterceptDeeplink");
                        if (bool == null) {
                            throw new IllegalArgumentException("Argument \"shouldInterceptDeeplink\" of type boolean does not support null values");
                        }
                    } else {
                        bool = Boolean.FALSE;
                    }
                    return new C28870e(str4, str, str2, str3, bool.booleanValue());
                }
                throw new IllegalArgumentException("Argument \"webviewUrl\" is marked as non-null but was passed a null value");
            }
            throw new IllegalArgumentException("Required argument \"webviewUrl\" is missing and does not have an android:defaultValue");
        }

        public C28871a() {
        }
    }

    public C28870e(@C12579k String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str, "webviewUrl");
        this.f70741a = str;
        this.f70742b = str2;
        this.f70743c = str3;
        this.f70744d = str4;
        this.f70745e = z;
    }

    @C12579k
    @C11384m
    public static final C28870e fromBundle(@C12579k Bundle bundle) {
        return f70739f.mo84047a(bundle);
    }

    /* renamed from: g */
    public static /* synthetic */ C28870e m119405g(C28870e eVar, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eVar.f70741a;
        }
        if ((i & 2) != 0) {
            str2 = eVar.f70742b;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = eVar.f70743c;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = eVar.f70744d;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            z = eVar.f70745e;
        }
        return eVar.mo84037f(str, str5, str6, str7, z);
    }

    @C12579k
    @C11384m
    /* renamed from: h */
    public static final C28870e m119406h(@C12579k C19456p0 p0Var) {
        return f70739f.mo84048b(p0Var);
    }

    @C12579k
    /* renamed from: a */
    public final String mo84031a() {
        return this.f70741a;
    }

    @C12580l
    /* renamed from: b */
    public final String mo84032b() {
        return this.f70742b;
    }

    @C12580l
    /* renamed from: c */
    public final String mo84033c() {
        return this.f70743c;
    }

    @C12580l
    /* renamed from: d */
    public final String mo84034d() {
        return this.f70744d;
    }

    /* renamed from: e */
    public final boolean mo84035e() {
        return this.f70745e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28870e)) {
            return false;
        }
        C28870e eVar = (C28870e) obj;
        return Intrinsics.areEqual((Object) this.f70741a, (Object) eVar.f70741a) && Intrinsics.areEqual((Object) this.f70742b, (Object) eVar.f70742b) && Intrinsics.areEqual((Object) this.f70743c, (Object) eVar.f70743c) && Intrinsics.areEqual((Object) this.f70744d, (Object) eVar.f70744d) && this.f70745e == eVar.f70745e;
    }

    @C12579k
    /* renamed from: f */
    public final C28870e mo84037f(@C12579k String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str, "webviewUrl");
        return new C28870e(str, str2, str3, str4, z);
    }

    public int hashCode() {
        int hashCode = this.f70741a.hashCode() * 31;
        String str = this.f70742b;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f70743c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f70744d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        int i2 = (hashCode3 + i) * 31;
        boolean z = this.f70745e;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    /* renamed from: i */
    public final boolean mo84039i() {
        return this.f70745e;
    }

    @C12580l
    /* renamed from: j */
    public final String mo84040j() {
        return this.f70743c;
    }

    @C12580l
    /* renamed from: k */
    public final String mo84041k() {
        return this.f70744d;
    }

    @C12580l
    /* renamed from: l */
    public final String mo84042l() {
        return this.f70742b;
    }

    @C12579k
    /* renamed from: m */
    public final String mo84043m() {
        return this.f70741a;
    }

    @C12579k
    /* renamed from: n */
    public final Bundle mo84044n() {
        Bundle bundle = new Bundle();
        bundle.putString("webviewUrl", this.f70741a);
        bundle.putString("webViewTitle", this.f70742b);
        bundle.putString("webViewHeaderKey", this.f70743c);
        bundle.putString("webViewHeaderValue", this.f70744d);
        bundle.putBoolean("shouldInterceptDeeplink", this.f70745e);
        return bundle;
    }

    @C12579k
    /* renamed from: o */
    public final C19456p0 mo84045o() {
        C19456p0 p0Var = new C19456p0();
        p0Var.mo57656q("webviewUrl", this.f70741a);
        p0Var.mo57656q("webViewTitle", this.f70742b);
        p0Var.mo57656q("webViewHeaderKey", this.f70743c);
        p0Var.mo57656q("webViewHeaderValue", this.f70744d);
        p0Var.mo57656q("shouldInterceptDeeplink", Boolean.valueOf(this.f70745e));
        return p0Var;
    }

    @C12579k
    public String toString() {
        String str = this.f70741a;
        String str2 = this.f70742b;
        String str3 = this.f70743c;
        String str4 = this.f70744d;
        boolean z = this.f70745e;
        return "WebViewActivityArgs(webviewUrl=" + str + ", webViewTitle=" + str2 + ", webViewHeaderKey=" + str3 + ", webViewHeaderValue=" + str4 + ", shouldInterceptDeeplink=" + z + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C28870e(String str, String str2, String str3, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? false : z);
    }
}

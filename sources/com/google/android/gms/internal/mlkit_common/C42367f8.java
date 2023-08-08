package com.google.android.gms.internal.mlkit_common;

import com.google.mlkit.common.sdkinternal.ModelType;

/* renamed from: com.google.android.gms.internal.mlkit_common.f8 */
public final class C42367f8 extends C42499r8 {

    /* renamed from: a */
    public final zzgy f107033a;

    /* renamed from: b */
    public final String f107034b;

    /* renamed from: c */
    public final boolean f107035c;

    /* renamed from: d */
    public final boolean f107036d;

    /* renamed from: e */
    public final ModelType f107037e;

    /* renamed from: f */
    public final zzhe f107038f;

    /* renamed from: g */
    public final int f107039g;

    public /* synthetic */ C42367f8(zzgy zzgy, String str, boolean z, boolean z2, ModelType modelType, zzhe zzhe, int i, C42356e8 e8Var) {
        this.f107033a = zzgy;
        this.f107034b = str;
        this.f107035c = z;
        this.f107036d = z2;
        this.f107037e = modelType;
        this.f107038f = zzhe;
        this.f107039g = i;
    }

    /* renamed from: a */
    public final int mo137672a() {
        return this.f107039g;
    }

    /* renamed from: b */
    public final ModelType mo137673b() {
        return this.f107037e;
    }

    /* renamed from: c */
    public final zzgy mo137674c() {
        return this.f107033a;
    }

    /* renamed from: d */
    public final zzhe mo137675d() {
        return this.f107038f;
    }

    /* renamed from: e */
    public final String mo137676e() {
        return this.f107034b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C42499r8) {
            C42499r8 r8Var = (C42499r8) obj;
            if (!this.f107033a.equals(r8Var.mo137674c()) || !this.f107034b.equals(r8Var.mo137676e()) || this.f107035c != r8Var.mo137679g() || this.f107036d != r8Var.mo137678f() || !this.f107037e.equals(r8Var.mo137673b()) || !this.f107038f.equals(r8Var.mo137675d()) || this.f107039g != r8Var.mo137672a()) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo137678f() {
        return this.f107036d;
    }

    /* renamed from: g */
    public final boolean mo137679g() {
        return this.f107035c;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.f107033a.hashCode() ^ 1000003) * 1000003) ^ this.f107034b.hashCode()) * 1000003;
        int i2 = 1237;
        if (true != this.f107035c) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i3 = (hashCode ^ i) * 1000003;
        if (true == this.f107036d) {
            i2 = 1231;
        }
        return ((((((i3 ^ i2) * 1000003) ^ this.f107037e.hashCode()) * 1000003) ^ this.f107038f.hashCode()) * 1000003) ^ this.f107039g;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f107033a);
        String str = this.f107034b;
        boolean z = this.f107035c;
        boolean z2 = this.f107036d;
        String valueOf2 = String.valueOf(this.f107037e);
        String valueOf3 = String.valueOf(this.f107038f);
        int i = this.f107039g;
        int length = valueOf.length();
        int length2 = str.length();
        StringBuilder sb = new StringBuilder(length + 187 + length2 + valueOf2.length() + valueOf3.length());
        sb.append("RemoteModelLoggingOptions{errorCode=");
        sb.append(valueOf);
        sb.append(", tfliteSchemaVersion=");
        sb.append(str);
        sb.append(", shouldLogRoughDownloadTime=");
        sb.append(z);
        sb.append(", shouldLogExactDownloadTime=");
        sb.append(z2);
        sb.append(", modelType=");
        sb.append(valueOf2);
        sb.append(", downloadStatus=");
        sb.append(valueOf3);
        sb.append(", failureStatusCode=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}

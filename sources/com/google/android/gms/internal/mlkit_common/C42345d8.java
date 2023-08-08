package com.google.android.gms.internal.mlkit_common;

import com.google.mlkit.common.sdkinternal.ModelType;

/* renamed from: com.google.android.gms.internal.mlkit_common.d8 */
public final class C42345d8 extends C42488q8 {

    /* renamed from: a */
    public zzgy f106971a;

    /* renamed from: b */
    public String f106972b;

    /* renamed from: c */
    public Boolean f106973c;

    /* renamed from: d */
    public Boolean f106974d;

    /* renamed from: e */
    public ModelType f106975e;

    /* renamed from: f */
    public zzhe f106976f;

    /* renamed from: g */
    public Integer f106977g;

    /* renamed from: a */
    public final C42488q8 mo137651a(zzhe zzhe) {
        if (zzhe != null) {
            this.f106976f = zzhe;
            return this;
        }
        throw new NullPointerException("Null downloadStatus");
    }

    /* renamed from: b */
    public final C42488q8 mo137652b(zzgy zzgy) {
        if (zzgy != null) {
            this.f106971a = zzgy;
            return this;
        }
        throw new NullPointerException("Null errorCode");
    }

    /* renamed from: c */
    public final C42488q8 mo137653c(int i) {
        this.f106977g = Integer.valueOf(i);
        return this;
    }

    /* renamed from: d */
    public final C42488q8 mo137654d(ModelType modelType) {
        if (modelType != null) {
            this.f106975e = modelType;
            return this;
        }
        throw new NullPointerException("Null modelType");
    }

    /* renamed from: e */
    public final C42488q8 mo137655e(boolean z) {
        this.f106974d = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: f */
    public final C42488q8 mo137656f(boolean z) {
        this.f106973c = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: g */
    public final C42499r8 mo137657g() {
        String str;
        Boolean bool;
        zzgy zzgy = this.f106971a;
        if (zzgy != null && (str = this.f106972b) != null && (bool = this.f106973c) != null && this.f106974d != null && this.f106975e != null && this.f106976f != null && this.f106977g != null) {
            return new C42367f8(zzgy, str, bool.booleanValue(), this.f106974d.booleanValue(), this.f106975e, this.f106976f, this.f106977g.intValue(), (C42356e8) null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f106971a == null) {
            sb.append(" errorCode");
        }
        if (this.f106972b == null) {
            sb.append(" tfliteSchemaVersion");
        }
        if (this.f106973c == null) {
            sb.append(" shouldLogRoughDownloadTime");
        }
        if (this.f106974d == null) {
            sb.append(" shouldLogExactDownloadTime");
        }
        if (this.f106975e == null) {
            sb.append(" modelType");
        }
        if (this.f106976f == null) {
            sb.append(" downloadStatus");
        }
        if (this.f106977g == null) {
            sb.append(" failureStatusCode");
        }
        String valueOf = String.valueOf(sb);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(valueOf);
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: h */
    public final C42488q8 mo137658h(String str) {
        this.f106972b = "NA";
        return this;
    }
}

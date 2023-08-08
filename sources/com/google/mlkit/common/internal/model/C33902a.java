package com.google.mlkit.common.internal.model;

import com.google.android.gms.common.annotation.C40473a;
import com.google.mlkit.common.internal.model.C33904c;

/* renamed from: com.google.mlkit.common.internal.model.a */
public final class C33902a extends C33904c.C33905a {

    /* renamed from: a */
    public final String f82282a;

    /* renamed from: b */
    public final String f82283b;

    /* renamed from: c */
    public final String f82284c;

    public C33902a(String str, String str2, String str3) {
        if (str != null) {
            this.f82282a = str;
            if (str2 != null) {
                this.f82283b = str2;
                if (str3 != null) {
                    this.f82284c = str3;
                    return;
                }
                throw new NullPointerException("Null labelsFile");
            }
            throw new NullPointerException("Null modelFile");
        }
        throw new NullPointerException("Null modelType");
    }

    @C40473a
    /* renamed from: a */
    public String mo98630a() {
        return this.f82284c;
    }

    @C40473a
    /* renamed from: b */
    public String mo98631b() {
        return this.f82283b;
    }

    @C40473a
    /* renamed from: c */
    public String mo98632c() {
        return this.f82282a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C33904c.C33905a) {
            C33904c.C33905a aVar = (C33904c.C33905a) obj;
            if (!this.f82282a.equals(aVar.mo98632c()) || !this.f82283b.equals(aVar.mo98631b()) || !this.f82284c.equals(aVar.mo98630a())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f82282a.hashCode() ^ 1000003) * 1000003) ^ this.f82283b.hashCode()) * 1000003) ^ this.f82284c.hashCode();
    }

    public final String toString() {
        String str = this.f82282a;
        String str2 = this.f82283b;
        String str3 = this.f82284c;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 51 + str2.length() + str3.length());
        sb.append("AutoMLManifest{modelType=");
        sb.append(str);
        sb.append(", modelFile=");
        sb.append(str2);
        sb.append(", labelsFile=");
        sb.append(str3);
        sb.append("}");
        return sb.toString();
    }
}

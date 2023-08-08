package com.google.android.play.core.splitcompat;

import android.support.annotation.NonNull;
import java.io.File;

/* renamed from: com.google.android.play.core.splitcompat.s */
public final class C32151s {

    /* renamed from: a */
    public final File f78386a;

    /* renamed from: b */
    public final String f78387b;

    public C32151s() {
    }

    @NonNull
    /* renamed from: a */
    public File mo92914a() {
        return this.f78386a;
    }

    @NonNull
    /* renamed from: b */
    public String mo92915b() {
        return this.f78387b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C32151s) {
            C32151s sVar = (C32151s) obj;
            return this.f78386a.equals(sVar.mo92914a()) && this.f78387b.equals(sVar.mo92915b());
        }
    }

    public int hashCode() {
        return ((this.f78386a.hashCode() ^ 1000003) * 1000003) ^ this.f78387b.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f78386a);
        String str = this.f78387b;
        StringBuilder sb = new StringBuilder(valueOf.length() + 35 + str.length());
        sb.append("SplitFileInfo{splitFile=");
        sb.append(valueOf);
        sb.append(", splitId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public C32151s(File file, String str) {
        this();
        if (file != null) {
            this.f78386a = file;
            if (str != null) {
                this.f78387b = str;
                return;
            }
            throw new NullPointerException("Null splitId");
        }
        throw new NullPointerException("Null splitFile");
    }
}

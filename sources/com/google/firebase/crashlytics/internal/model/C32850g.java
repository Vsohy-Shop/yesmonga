package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.C0359n0;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Arrays;

/* renamed from: com.google.firebase.crashlytics.internal.model.g */
public final class C32850g extends CrashlyticsReport.C32770e.C32772b {

    /* renamed from: a */
    public final String f79739a;

    /* renamed from: b */
    public final byte[] f79740b;

    /* renamed from: com.google.firebase.crashlytics.internal.model.g$b */
    public static final class C32852b extends CrashlyticsReport.C32770e.C32772b.C32773a {

        /* renamed from: a */
        public String f79741a;

        /* renamed from: b */
        public byte[] f79742b;

        /* renamed from: a */
        public CrashlyticsReport.C32770e.C32772b mo95196a() {
            String str = "";
            if (this.f79741a == null) {
                str = str + " filename";
            }
            if (this.f79742b == null) {
                str = str + " contents";
            }
            if (str.isEmpty()) {
                return new C32850g(this.f79741a, this.f79742b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* renamed from: b */
        public CrashlyticsReport.C32770e.C32772b.C32773a mo95197b(byte[] bArr) {
            if (bArr != null) {
                this.f79742b = bArr;
                return this;
            }
            throw new NullPointerException("Null contents");
        }

        /* renamed from: c */
        public CrashlyticsReport.C32770e.C32772b.C32773a mo95198c(String str) {
            if (str != null) {
                this.f79741a = str;
                return this;
            }
            throw new NullPointerException("Null filename");
        }
    }

    @C0359n0
    /* renamed from: b */
    public byte[] mo95194b() {
        return this.f79740b;
    }

    @C0359n0
    /* renamed from: c */
    public String mo95195c() {
        return this.f79739a;
    }

    public boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.C32770e.C32772b)) {
            return false;
        }
        CrashlyticsReport.C32770e.C32772b bVar = (CrashlyticsReport.C32770e.C32772b) obj;
        if (this.f79739a.equals(bVar.mo95195c())) {
            byte[] bArr2 = this.f79740b;
            if (bVar instanceof C32850g) {
                bArr = ((C32850g) bVar).f79740b;
            } else {
                bArr = bVar.mo95194b();
            }
            if (Arrays.equals(bArr2, bArr)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f79739a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f79740b);
    }

    public String toString() {
        return "File{filename=" + this.f79739a + ", contents=" + Arrays.toString(this.f79740b) + "}";
    }

    public C32850g(String str, byte[] bArr) {
        this.f79739a = str;
        this.f79740b = bArr;
    }
}

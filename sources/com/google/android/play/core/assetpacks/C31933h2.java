package com.google.android.play.core.assetpacks;

import android.support.annotation.Nullable;

/* renamed from: com.google.android.play.core.assetpacks.h2 */
public final class C31933h2 {

    /* renamed from: a */
    public final int f77887a;

    /* renamed from: b */
    public final String f77888b;

    /* renamed from: c */
    public final long f77889c;

    /* renamed from: d */
    public final long f77890d;

    /* renamed from: e */
    public final int f77891e;

    public C31933h2() {
    }

    /* renamed from: a */
    public int mo92570a() {
        return this.f77887a;
    }

    @Nullable
    /* renamed from: b */
    public String mo92571b() {
        return this.f77888b;
    }

    /* renamed from: c */
    public long mo92572c() {
        return this.f77889c;
    }

    /* renamed from: d */
    public long mo92573d() {
        return this.f77890d;
    }

    /* renamed from: e */
    public int mo92574e() {
        return this.f77891e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0013, code lost:
        r1 = r7.f77888b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.android.play.core.assetpacks.C31933h2
            r2 = 0
            if (r1 == 0) goto L_0x0046
            com.google.android.play.core.assetpacks.h2 r8 = (com.google.android.play.core.assetpacks.C31933h2) r8
            int r1 = r7.f77887a
            int r3 = r8.mo92570a()
            if (r1 != r3) goto L_0x0046
            java.lang.String r1 = r7.f77888b
            if (r1 != 0) goto L_0x001e
            java.lang.String r1 = r8.mo92571b()
            if (r1 != 0) goto L_0x0046
            goto L_0x0029
        L_0x001e:
            java.lang.String r3 = r8.mo92571b()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0029
            goto L_0x0046
        L_0x0029:
            long r3 = r7.f77889c
            long r5 = r8.mo92572c()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0046
            long r3 = r7.f77890d
            long r5 = r8.mo92573d()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0046
            int r1 = r7.f77891e
            int r8 = r8.mo92574e()
            if (r1 != r8) goto L_0x0046
            return r0
        L_0x0046:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C31933h2.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = (this.f77887a ^ 1000003) * 1000003;
        String str = this.f77888b;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f77889c;
        long j2 = this.f77890d;
        return ((((((i ^ hashCode) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f77891e;
    }

    public String toString() {
        int i = this.f77887a;
        String str = this.f77888b;
        long j = this.f77889c;
        long j2 = this.f77890d;
        int i2 = this.f77891e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 157);
        sb.append("SliceCheckpoint{fileExtractionStatus=");
        sb.append(i);
        sb.append(", filePath=");
        sb.append(str);
        sb.append(", fileOffset=");
        sb.append(j);
        sb.append(", remainingBytes=");
        sb.append(j2);
        sb.append(", previousChunk=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }

    public C31933h2(int i, @Nullable String str, long j, long j2, int i2) {
        this();
        this.f77887a = i;
        this.f77888b = str;
        this.f77889c = j;
        this.f77890d = j2;
        this.f77891e = i2;
    }
}

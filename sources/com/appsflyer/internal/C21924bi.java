package com.appsflyer.internal;

/* renamed from: com.appsflyer.internal.bi */
public class C21924bi {
    public final long valueOf;

    public C21924bi(long j) {
        this.valueOf = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.valueOf == ((C21924bi) obj).valueOf) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.valueOf;
        return (int) (j ^ (j >>> 32));
    }
}

package com.google.android.gms.internal.measurement;

import javax.annotation.CheckForNull;

final class zzik extends zzii {
    private final Object zza;

    public zzik(Object obj) {
        this.zza = obj;
    }

    /* renamed from: a */
    public final Object mo137538a() {
        return this.zza;
    }

    /* renamed from: b */
    public final boolean mo137539b() {
        return true;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof zzik) {
            return this.zza.equals(((zzik) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        String obj = this.zza.toString();
        return "Optional.of(" + obj + ")";
    }
}

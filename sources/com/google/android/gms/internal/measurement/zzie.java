package com.google.android.gms.internal.measurement;

import javax.annotation.CheckForNull;

final class zzie extends zzii {

    /* renamed from: a */
    public static final zzie f106688a = new zzie();

    private zzie() {
    }

    /* renamed from: a */
    public final Object mo137538a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    /* renamed from: b */
    public final boolean mo137539b() {
        return false;
    }

    public final boolean equals(@CheckForNull Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}

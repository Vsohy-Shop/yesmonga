package com.google.android.gms.internal.mlkit_vision_text_common;

import java.io.Serializable;

final class zzbi<K, V> extends C30153o<K, V> implements Serializable {
    final K zza;
    final V zzb;

    public zzbi(K k, V v) {
        this.zza = k;
        this.zzb = v;
    }

    public final K getKey() {
        return this.zza;
    }

    public final V getValue() {
        return this.zzb;
    }

    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}

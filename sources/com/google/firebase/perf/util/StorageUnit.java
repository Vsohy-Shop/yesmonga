package com.google.firebase.perf.util;

import android.support.p002v4.media.session.PlaybackStateCompat;

public enum StorageUnit {
    TERABYTES(1099511627776L) {
        /* renamed from: b */
        public long mo96884b(long j, StorageUnit storageUnit) {
            return storageUnit.mo96889y(j);
        }
    },
    GIGABYTES(1073741824) {
        /* renamed from: b */
        public long mo96884b(long j, StorageUnit storageUnit) {
            return storageUnit.mo96886q(j);
        }
    },
    MEGABYTES(PlaybackStateCompat.f480V0) {
        /* renamed from: b */
        public long mo96884b(long j, StorageUnit storageUnit) {
            return storageUnit.mo96888w(j);
        }
    },
    KILOBYTES(1024) {
        /* renamed from: b */
        public long mo96884b(long j, StorageUnit storageUnit) {
            return storageUnit.mo96887r(j);
        }
    },
    BYTES(1) {
        /* renamed from: b */
        public long mo96884b(long j, StorageUnit storageUnit) {
            return storageUnit.mo96885g(j);
        }
    };
    
    long numBytes;

    /* renamed from: b */
    public abstract long mo96884b(long j, StorageUnit storageUnit);

    /* renamed from: g */
    public long mo96885g(long j) {
        return j * this.numBytes;
    }

    /* renamed from: q */
    public long mo96886q(long j) {
        return (j * this.numBytes) / GIGABYTES.numBytes;
    }

    /* renamed from: r */
    public long mo96887r(long j) {
        return (j * this.numBytes) / KILOBYTES.numBytes;
    }

    /* renamed from: w */
    public long mo96888w(long j) {
        return (j * this.numBytes) / MEGABYTES.numBytes;
    }

    /* renamed from: y */
    public long mo96889y(long j) {
        return (j * this.numBytes) / TERABYTES.numBytes;
    }

    /* access modifiers changed from: public */
    StorageUnit(long j) {
        this.numBytes = j;
    }
}

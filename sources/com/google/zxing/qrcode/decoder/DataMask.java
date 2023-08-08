package com.google.zxing.qrcode.decoder;

import com.google.zxing.common.C34710b;

enum DataMask {
    DATA_MASK_000 {
        /* renamed from: b */
        public boolean mo103154b(int i, int i2) {
            return ((i + i2) & 1) == 0;
        }
    },
    DATA_MASK_001 {
        /* renamed from: b */
        public boolean mo103154b(int i, int i2) {
            return (i & 1) == 0;
        }
    },
    DATA_MASK_010 {
        /* renamed from: b */
        public boolean mo103154b(int i, int i2) {
            return i2 % 3 == 0;
        }
    },
    DATA_MASK_011 {
        /* renamed from: b */
        public boolean mo103154b(int i, int i2) {
            return (i + i2) % 3 == 0;
        }
    },
    DATA_MASK_100 {
        /* renamed from: b */
        public boolean mo103154b(int i, int i2) {
            return (((i / 2) + (i2 / 3)) & 1) == 0;
        }
    },
    DATA_MASK_101 {
        /* renamed from: b */
        public boolean mo103154b(int i, int i2) {
            return (i * i2) % 6 == 0;
        }
    },
    DATA_MASK_110 {
        /* renamed from: b */
        public boolean mo103154b(int i, int i2) {
            return (i * i2) % 6 < 3;
        }
    },
    DATA_MASK_111 {
        /* renamed from: b */
        public boolean mo103154b(int i, int i2) {
            return (((i + i2) + ((i * i2) % 3)) & 1) == 0;
        }
    };

    /* renamed from: b */
    public abstract boolean mo103154b(int i, int i2);

    /* renamed from: g */
    public final void mo103155g(C34710b bVar, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < i; i3++) {
                if (mo103154b(i2, i3)) {
                    bVar.mo102665f(i3, i2);
                }
            }
        }
    }
}

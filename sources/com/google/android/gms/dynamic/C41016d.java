package com.google.android.gms.dynamic;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.C0359n0;
import com.google.android.gms.internal.common.C41107i;

/* renamed from: com.google.android.gms.dynamic.d */
public interface C41016d extends IInterface {

    /* renamed from: com.google.android.gms.dynamic.d$a */
    public static abstract class C41017a extends C41107i implements C41016d {
        public C41017a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        @C0359n0
        /* renamed from: H0 */
        public static C41016d m166799H0(@C0359n0 IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof C41016d) {
                return (C41016d) queryLocalInterface;
            }
            return new C41031r(iBinder);
        }
    }
}

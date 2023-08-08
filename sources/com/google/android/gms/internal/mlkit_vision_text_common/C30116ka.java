package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.ka */
public abstract class C30116ka extends C30261x implements C30128la {
    /* renamed from: m0 */
    public static C30128la m121759m0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.text.aidls.ITextRecognizerCreator");
        if (queryLocalInterface instanceof C30128la) {
            return (C30128la) queryLocalInterface;
        }
        return new C30104ja(iBinder);
    }
}

package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.mlkit_vision_text_common.q7 */
public abstract class C30185q7 extends C30261x implements C30198r8 {
    /* renamed from: m0 */
    public static C30198r8 m121832m0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator");
        if (queryLocalInterface instanceof C30198r8) {
            return (C30198r8) queryLocalInterface;
        }
        return new C30220t6(iBinder);
    }
}

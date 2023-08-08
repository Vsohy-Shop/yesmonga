package androidx.constraintlayout.motion.widget;

import androidx.constraintlayout.motion.widget.C16900s;
import androidx.constraintlayout.widget.C16934c;

/* renamed from: androidx.constraintlayout.motion.widget.x */
public class C16910x {

    /* renamed from: a */
    public static final String f43973a = "TransitionBuilder";

    /* renamed from: a */
    public static C16900s.C16902b m78138a(C16900s sVar, int i, int i2, C16934c cVar, int i3, C16934c cVar2) {
        C16900s.C16902b bVar = new C16900s.C16902b(i, sVar, i2, i3);
        m78139b(sVar, bVar, cVar, cVar2);
        return bVar;
    }

    /* renamed from: b */
    public static void m78139b(C16900s sVar, C16900s.C16902b bVar, C16934c cVar, C16934c cVar2) {
        int I = bVar.mo50365I();
        int B = bVar.mo50358B();
        sVar.mo50330j0(I, cVar);
        sVar.mo50330j0(B, cVar2);
    }

    /* renamed from: c */
    public static void m78140c(MotionLayout motionLayout) {
        C16900s sVar = motionLayout.f43256a;
        if (sVar == null) {
            throw new RuntimeException("Invalid motion layout. Layout missing Motion Scene.");
        } else if (!sVar.mo50347s0(motionLayout)) {
            throw new RuntimeException("MotionLayout doesn't have the right motion scene.");
        } else if (sVar.f43804c == null || sVar.mo50346s().isEmpty()) {
            throw new RuntimeException("Invalid motion layout. Motion Scene doesn't have any transition.");
        }
    }
}

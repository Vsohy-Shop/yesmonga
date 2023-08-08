package com.urbanairship.android.layout;

import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.urbanairship.android.layout.display.C35579b;
import com.urbanairship.android.layout.display.DisplayException;
import com.urbanairship.android.layout.info.C35696x;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.android.layout.j */
public final class C35699j {
    @C0344h1

    /* renamed from: a */
    public static final int f88224a = 2;
    @C0344h1

    /* renamed from: b */
    public static final int f88225b = 1;

    /* renamed from: c */
    public static boolean m147208c(@C0359n0 C35696x xVar) {
        if (xVar.mo106856g() < 1 || xVar.mo106856g() > 2) {
            return false;
        }
        if ((xVar.mo106855f() instanceof C35576d) || (xVar.mo106855f() instanceof C35572a)) {
            return true;
        }
        return false;
    }

    @C0359n0
    /* renamed from: f */
    public static C35579b m147211f(@C0359n0 C35696x xVar) throws DisplayException {
        if (!m147208c(xVar)) {
            throw new DisplayException("Payload is not valid: " + xVar.mo106855f());
        } else if (xVar.mo106855f() instanceof C35576d) {
            return new C35579b(xVar, new C35643h());
        } else {
            if (xVar.mo106855f() instanceof C35572a) {
                return new C35579b(xVar, new C35644i());
            }
            throw new DisplayException("Presentation not supported: " + xVar.mo106855f());
        }
    }
}

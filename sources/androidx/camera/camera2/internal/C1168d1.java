package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.camera2.internal.compat.C1127q;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.C1641m;
import androidx.camera.core.C1647n;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.C1496q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.camera.camera2.internal.d1 */
public class C1168d1 {
    /* renamed from: a */
    public static String m4886a(C1127q qVar, Integer num, List<String> list) throws CameraAccessExceptionCompat {
        if (num == null || !list.contains("0") || !list.contains("1")) {
            return null;
        }
        if (num.intValue() == 1) {
            if (((Integer) qVar.mo4410d("0").mo4323a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                return "1";
            }
            return null;
        } else if (num.intValue() == 0 && ((Integer) qVar.mo4410d("1").mo4323a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return "0";
        } else {
            return null;
        }
    }

    /* renamed from: b */
    public static List<String> m4887b(@C0359n0 C1266x xVar, @C0363p0 C1647n nVar) throws InitializationException {
        String str;
        try {
            ArrayList arrayList = new ArrayList();
            List<String> asList = Arrays.asList(xVar.mo4716a().mo4411e());
            if (nVar == null) {
                for (String add : asList) {
                    arrayList.add(add);
                }
                return arrayList;
            }
            try {
                str = m4886a(xVar.mo4716a(), nVar.mo5634d(), asList);
            } catch (IllegalStateException unused) {
                str = null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : asList) {
                if (!str2.equals(str)) {
                    arrayList2.add(xVar.mo4719d(str2));
                }
            }
            try {
                Iterator<C1641m> it = nVar.mo5632b(arrayList2).iterator();
                while (it.hasNext()) {
                    arrayList.add(((C1496q) it.next()).mo4592b());
                }
            } catch (IllegalArgumentException unused2) {
            }
            return arrayList;
        } catch (CameraAccessExceptionCompat e) {
            throw new InitializationException((Throwable) C1172e1.m4889a(e));
        } catch (CameraUnavailableException e2) {
            throw new InitializationException((Throwable) e2);
        }
    }
}

package androidx.work;

import androidx.annotation.C0359n0;
import androidx.work.C21091d;
import java.util.HashMap;
import java.util.List;

public final class OverwritingInputMerger extends C21097i {
    @C0359n0
    /* renamed from: b */
    public C21091d mo63033b(@C0359n0 List<C21091d> list) {
        C21091d.C21092a aVar = new C21091d.C21092a();
        HashMap hashMap = new HashMap();
        for (C21091d x : list) {
            hashMap.putAll(x.mo63169x());
        }
        aVar.mo63175d(hashMap);
        return aVar.mo63172a();
    }
}
